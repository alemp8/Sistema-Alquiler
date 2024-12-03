
package sistemagestionempresa.Modelos.Repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor Alejandro
 */
public class RepositorioReportes {
    Conexion cone = new Conexion();
    
    public void listaRecargos(JTable table) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        modelo.addColumn("N.Factura");
        modelo.addColumn("Fecha");
        modelo.addColumn("Cliente");
        modelo.addColumn("Realizada Por");
        modelo.addColumn("Monto Alquiler");
        modelo.addColumn("Recargo");
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas = 0;
        try {
            Connection conn = cone.obtenerConexion();
            String sql = "SELECT a.idFactura, a.fecha, c.nombre, u.nombre, a.monto, r.montoRecargo "
                    + "FROM Alquiler a "
                    + "JOIN Clientes c ON a.idCliente = c.idCliente "
                    + "JOIN Usuarios u ON a.realizadaPor = u.idUsuario "
                    + "JOIN Recargo r on a.idFactura = r.idFactura ";
            ps = conn.prepareStatement(sql);
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
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    public void DetallesAlquiler (JTable table) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        modelo.addColumn("N.Factura");
        modelo.addColumn("Fecha");
        modelo.addColumn("Cliente");
        modelo.addColumn("Realizada Por");
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad Alquilada");
        modelo.addColumn("Subtotal");
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas = 0;
        try {
            Connection conn = cone.obtenerConexion();
            
            String sql = "SELECT a.idFactura, a.fecha, c.nombre, u.nombre, p.nombre, d.cantidad, d.subtotal "
                    + "FROM Alquiler a "
                    + "JOIN Clientes c ON a.idCliente = c.idCliente "
                    + "JOIN Usuarios u ON a.realizadaPor = u.idUsuario "
                    + "JOIN DetalleAlquiler d on a.idFactura = d.idFactura "
                    + "JOIN Productos p on d.idProducto = p.idProducto ";
            ps = conn.prepareStatement(sql);
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
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    public void buscarRecargo (JTable table, String busqueda) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        modelo.addColumn("N.Factura");
        modelo.addColumn("Fecha");
        modelo.addColumn("Cliente");
        modelo.addColumn("Realizada Por");
        modelo.addColumn("Monto Alquiler");
        modelo.addColumn("Recargo");
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas = 0;

        String sql = "SELECT a.idFactura, a.fecha, c.nombre, u.nombre, a.monto, r.montoRecargo "
                    + "FROM Alquiler a "
                    + "JOIN Clientes c ON a.idCliente = c.idCliente "
                    + "JOIN Usuarios u ON a.realizadaPor = u.idUsuario "
                    + "JOIN Recargo r on a.idFactura = r.idFactura "
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
    
    public void buscarDetalle (JTable table, String busqueda) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        modelo.addColumn("N.Factura");
        modelo.addColumn("Fecha");
        modelo.addColumn("Cliente");
        modelo.addColumn("Realizada Por");
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad Alquilada");
        modelo.addColumn("Subtotal");
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas = 0;

        String sql = "SELECT a.idFactura, a.fecha, c.nombre, u.nombre, a.monto,p.nombre, d.cantidad, d.subtotal "
                    + "FROM Alquiler a "
                    + "JOIN Clientes c ON a.idCliente = c.idCliente "
                    + "JOIN Usuarios u ON a.realizadaPor = u.idUsuario "
                    + "JOIN DetalleAlquiler d on a.idFactura = d.idFactura "
                    + "JOIN Productos p on d.idProducto = p.idProducto "
                    + "WHERE c.nombre LIKE ? OR u.nombre LIKE ? OR p.nombre LIKE ? ";

        try {
            Connection conn = cone.obtenerConexion();
            ps = conn.prepareStatement(sql);
            String searchText = "%" + busqueda + "%";
            ps.setString(1, searchText);
            ps.setString(2, searchText);
            ps.setString(3, searchText);
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
