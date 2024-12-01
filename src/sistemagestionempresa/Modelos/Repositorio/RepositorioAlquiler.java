package sistemagestionempresa.Modelos.Repositorio;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sistemagestionempresa.Modelos.Entidades.Alquiler;
import sistemagestionempresa.Modelos.Entidades.DetalleAlquiler;
import sistemagestionempresa.Modelos.Entidades.Productos;

public class RepositorioAlquiler {

    Conexion cone = new Conexion();

    public void Guardar(Alquiler entidad) {
        Connection conn = null;
        PreparedStatement stmtAlquiler = null;
        PreparedStatement stmtDetalle = null;
        PreparedStatement stmtProducto = null;
        ResultSet rs = null;

        try {
            conn = cone.obtenerConexion();
            String sqlAlquiler = "INSERT INTO Alquiler (fecha, idCliente, realizadaPor, monto) VALUES (?, ?, ?, ?)";
            stmtAlquiler = conn.prepareStatement(sqlAlquiler, PreparedStatement.RETURN_GENERATED_KEYS);
            stmtAlquiler.setDate(1, java.sql.Date.valueOf(entidad.getFecha()));
            stmtAlquiler.setInt(2, entidad.getIdCliente());
            stmtAlquiler.setInt(3, entidad.getRealizadopor());
            stmtAlquiler.setBigDecimal(4, entidad.getMonto());
            stmtAlquiler.executeUpdate();
            rs = stmtAlquiler.getGeneratedKeys();
            if (rs.next()) {
                int idFactura = rs.getInt(1);
                entidad.setIdFactura(idFactura);
            }
            for (DetalleAlquiler detalle : entidad.getDetalle()) {
                String sqlDetalle = "INSERT INTO DetalleAlquiler (idFactura, idProducto, precioArticulo, precioAlquiler, cantidad, subtotal) VALUES (?, ?, ?, ?, ?, ?)";
                stmtDetalle = conn.prepareStatement(sqlDetalle);
                stmtDetalle.setInt(1, entidad.getIdFactura());
                stmtDetalle.setInt(2, detalle.getIdProducto());
                stmtDetalle.setBigDecimal(3, detalle.getCosto());
                stmtDetalle.setBigDecimal(4, detalle.getPrecio());
                stmtDetalle.setInt(5, detalle.getCantidad());
                stmtDetalle.setBigDecimal(6, detalle.getSubtotal());
                stmtDetalle.executeUpdate();

                String sqlActualizarStock = "UPDATE Productos SET cantidad = cantidad - ? WHERE idProducto = ?";
                stmtProducto = conn.prepareStatement(sqlActualizarStock);
                stmtProducto.setInt(1, detalle.getCantidad());
                stmtProducto.setInt(2, detalle.getIdProducto());
                stmtProducto.executeUpdate();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }

    public void Eliminar(int codigo) {
        Connection conn = null;
        PreparedStatement psDetalleAlquiler = null;
        PreparedStatement psActualizarProducto = null;
        PreparedStatement psEliminarDetalle = null;
        PreparedStatement psEliminarAlquiler = null;
        ResultSet rsDetalles = null;
        try {
            conn = cone.obtenerConexion();
            conn.setAutoCommit(false); 
            String sqlSelectDetalle = "SELECT da.idProducto, da.cantidad FROM DetalleAlquiler da WHERE da.idFactura = ?";
            psDetalleAlquiler = conn.prepareStatement(sqlSelectDetalle);
            psDetalleAlquiler.setInt(1, codigo);
            rsDetalles = psDetalleAlquiler.executeQuery();

            while (rsDetalles.next()) {
                int idProducto = rsDetalles.getInt("idProducto");
                int cantidadAlquilada = rsDetalles.getInt("cantidad");
                String sqlActualizarProducto = "UPDATE Productos SET cantidad = cantidad + ? WHERE idProducto = ?";
                psActualizarProducto = conn.prepareStatement(sqlActualizarProducto);
                psActualizarProducto.setInt(1, cantidadAlquilada); 
                psActualizarProducto.setInt(2, idProducto);
                psActualizarProducto.executeUpdate();
            }

            String sqlEliminarDetalle = "DELETE FROM DetalleAlquiler WHERE idFactura = ?";
            psEliminarDetalle = conn.prepareStatement(sqlEliminarDetalle);
            psEliminarDetalle.setInt(1, codigo);
            psEliminarDetalle.executeUpdate();

            String sqlEliminarAlquiler = "DELETE FROM Alquiler WHERE idFactura = ?";
            psEliminarAlquiler = conn.prepareStatement(sqlEliminarAlquiler);
            psEliminarAlquiler.setInt(1, codigo);
            psEliminarAlquiler.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "Alquiler eliminado correctamente");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar alquiler: " + ex.getMessage());
        }
    }
    
    public void CargarTabla(JTable table) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        try {
            Connection conn = cone.obtenerConexion();
            String sql = "SELECT a.idFactura, a.fecha, c.nombre, u.nombre, a.monto "
                    + "FROM Alquiler a "
                    + "JOIN Clientes c ON a.idCliente = c.idCliente "
                    + "JOIN Usuarios u ON a.realizadaPor = u.idUsuario ";

            PreparedStatement stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }

    public DefaultComboBoxModel llenarProductos() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        Connection conn = null;
        CallableStatement cmd = null;
        ResultSet rs = null;
        try {
            conn = cone.obtenerConexion();
            cmd = conn.prepareCall("{CALL sp_Productos}");
            rs = cmd.executeQuery();
            while (rs.next()) {
                int idProducto = rs.getInt(1);
                String nombre = rs.getString(2);
                BigDecimal Costo = rs.getBigDecimal(3);
                BigDecimal Precio = rs.getBigDecimal(4);
                int cantidad = rs.getInt(5);

                modelo.addElement(new Productos(idProducto, nombre, Costo, Precio, cantidad));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los roles: " + ex.getMessage());
        }

        return modelo;
    }

    public DefaultComboBoxModel llenarClientes() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");

        try {
            Connection conn = cone.obtenerConexion();
            CallableStatement cmd = conn.prepareCall("{CALL sp_Clientes}");
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                modelo.addElement(rs.getString(2));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return modelo;
    }
    
    public void buscar(JTable table, String busqueda) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas = 0;

        String sql = "SELECT a.idFactura, a.fecha, c.nombre, u.nombre, a.monto "
                + "FROM Alquiler a "
                + "JOIN Clientes c ON a.idCliente = c.idCliente "
                + "JOIN Usuarios u ON a.realizadaPor = u.idUsuario "
                + "WHERE c.nombre LIKE ? OR u.nombre LIKE ? ";
    
        try {
            Connection conn = cone.obtenerConexion();
            ps = conn.prepareStatement(sql);
            String searchText = "%" + busqueda + "%";
            ps.setString(1, searchText);
            ps.setString(2, searchText);
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos: " + ex.getMessage());
        }
    }

}
