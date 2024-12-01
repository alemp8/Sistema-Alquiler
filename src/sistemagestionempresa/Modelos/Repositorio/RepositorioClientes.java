
package sistemagestionempresa.Modelos.Repositorio;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sistemagestionempresa.Modelos.Entidades.Clientes;

public class RepositorioClientes implements Procesos<Clientes> {
    Conexion cone = new Conexion();
    
    @Override
    public void mantenimiento(Clientes entidad, String accion) {
       try {
            Connection conn = cone.obtenerConexion();
            CallableStatement cmd = conn.prepareCall("{CALL sp_GestionClientes(?,?,?,?,?,?,?)}");
            cmd.setString(1, accion);
            cmd.setInt(2, entidad.getIdCliente());
            cmd.setString(3, entidad.getRTN());
            cmd.setString(4, entidad.getNombre());
            cmd.setString(5, entidad.getDireccion());
            cmd.setString(6, entidad.getCorreo());
            cmd.setString(7, entidad.getTelefono());

            cmd.execute();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        } 
    }

    @Override
    public void CargarTabla(JTable table, Clientes entidad, String accion) {
    DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection conn = cone.obtenerConexion();
            CallableStatement cmd = conn.prepareCall("{CALL sp_GestionClientes(?,?,?,?,?,?,?)}");
            cmd.setString(1, accion);
            cmd.setInt(2, entidad.getIdCliente());
            cmd.setString(3, entidad.getRTN());
            cmd.setString(4, entidad.getNombre());
            cmd.setString(5, entidad.getDireccion());
            cmd.setString(6, entidad.getCorreo());
            cmd.setString(7, entidad.getTelefono());

            rs = cmd.executeQuery();
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
    
    public void buscar(JTable table, String busqueda) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas = 0;

        String sql = "SELECT idCliente, RTN, nombre, direccion, correo, telefono "
                + "FROM Clientes "                
                + "WHERE nombre LIKE ? ";
    
        try {
            Connection conn = cone.obtenerConexion();
            ps = conn.prepareStatement(sql);
            String searchText = "%" + busqueda + "%";
            ps.setString(1, searchText);
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
