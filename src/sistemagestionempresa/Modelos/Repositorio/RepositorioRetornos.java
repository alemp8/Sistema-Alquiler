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
import sistemagestionempresa.Modelos.Entidades.DetalleRecargo;
import sistemagestionempresa.Modelos.Entidades.Productos;
import sistemagestionempresa.Modelos.Entidades.Recargos;

public class RepositorioRetornos {

    Conexion cone = new Conexion();

    public void Guardar(Recargos entidad) {
        Connection conn = null;
        PreparedStatement stmtAlquiler = null;
        PreparedStatement stmtProducto = null;
        ResultSet rs = null;

        try {
            
            conn = cone.obtenerConexion();
            conn.setAutoCommit(false); 

            String sqlAlquiler = "INSERT INTO Recargo (idFactura, fechaRetorno, montoRecargo) VALUES (?, ?, ?)";
            stmtAlquiler = conn.prepareStatement(sqlAlquiler);
            stmtAlquiler.setInt(1, entidad.getIdFactura()); 
            stmtAlquiler.setString(2, entidad.getFechaRetorno());
            stmtAlquiler.setBigDecimal(3, entidad.getMontoRecargo());
            int rowsAffected = stmtAlquiler.executeUpdate();
            System.out.println("Filas afectadas en Recargo: " + rowsAffected); 

            for (DetalleRecargo detalle : entidad.getDetalle()) {
                System.out.println("Actualizando stock para producto id: " + detalle.getIdProducto()
                        + ", cantidad: " + detalle.getCantidad());

                String sqlActualizarStock = "UPDATE Productos SET cantidad = cantidad + ? WHERE idProducto = ?";
                stmtProducto = conn.prepareStatement(sqlActualizarStock);
                stmtProducto.setInt(1, detalle.getCantidad()); 
                stmtProducto.setInt(2, detalle.getIdProducto());

                int stockRowsAffected = stmtProducto.executeUpdate();
                System.out.println("Filas afectadas en Productos (actualización stock): " + stockRowsAffected);
                if (stockRowsAffected == 0) {
                    System.out.println("ADVERTENCIA: El producto con idProducto " + detalle.getIdProducto() + " no existe o no se pudo actualizar.");
                }
            }

            conn.commit();
            System.out.println("Transacción confirmada.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
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

    public void CargarDetalles(JTable table, int busqueda) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas = 0;

        String sql = "SELECT d.idProducto, p.nombre, d.precioArticulo, d.precioAlquiler, d.cantidad "
                + "FROM DetalleAlquiler d "
                + "JOIN Productos p ON d.idProducto = p.idProducto "
                + "WHERE d.idFactura LIKE ? ";

        try {
            Connection conn = cone.obtenerConexion();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, busqueda);
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
