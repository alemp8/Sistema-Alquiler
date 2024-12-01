package sistemagestionempresa.Modelos.Repositorio;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sistemagestionempresa.Modelos.Entidades.Roles;
import sistemagestionempresa.Modelos.Entidades.Usuarios;

/**
 *
 * @author Victor Alejandro
 */
public class RepositorioUsuarios implements MetodosCRUD<Usuarios> {

    Conexion cone = new Conexion();

    @Override
    public void Guardar(Usuarios entidad) {
        try {
            Connection conn = cone.obtenerConexion();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO Usuarios(nombre,apellido,correo,telefono,clave,idRol) Values (?,?,?,?,?,?)");
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getApellido());
            ps.setString(3, entidad.getCorreo());
            ps.setString(4, entidad.getTelefono());
            ps.setString(5, entidad.getClave());
            ps.setInt(6, entidad.getRolUsuario());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    @Override
    public void Modificar(Usuarios entidad) {
        try {
            Connection conn = cone.obtenerConexion();
            String sql = "UPDATE Usuarios SET nombre = ?, apellido = ?, correo = ?, telefono = ?, clave = ?, idRol = ? WHERE idUsuario = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getApellido());
            ps.setString(3, entidad.getCorreo());
            ps.setString(4, entidad.getTelefono());
            ps.setString(5, entidad.getClave());
            ps.setInt(6, entidad.getRolUsuario());
            ps.setInt(7, entidad.getIdUsuario());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    @Override
    public void lista(JTable table) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas = 0;
        try {
            Connection conn = cone.obtenerConexion();
            String sql = "SELECT u.idUsuario, u.nombre, u.apellido, u.correo, u.telefono, u.clave, r.descripcion "
                    + "FROM Roles r "
                    + "JOIN Usuarios u ON u.idRol = r.idRol";
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

    @Override
    public void Eliminar(int id) {
        try {
            Connection conn = cone.obtenerConexion();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Usuarios WHERE idUsuario = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public DefaultComboBoxModel llenarComboBox() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        Connection conn = null;
        CallableStatement cmd = null;
        ResultSet rs = null;
        try {
            conn = cone.obtenerConexion();
            cmd = conn.prepareCall("{CALL sp_Roles}");
            rs = cmd.executeQuery();
            while (rs.next()) {
                int idRol = rs.getInt(1);
                String nombre = rs.getString(2);
                modelo.addElement(new Roles(idRol, nombre));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los roles: " + ex.getMessage());
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

        String sql = "SELECT u.idUsuario, u.nombre, u.apellido, u.correo, u.telefono, u.clave, r.descripcion "
                + "FROM Roles r "
                + "JOIN Usuarios u ON u.idRol = r.idRol "
                + "WHERE u.nombre LIKE ? OR u.apellido LIKE ? OR r.descripcion LIKE ?";

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
