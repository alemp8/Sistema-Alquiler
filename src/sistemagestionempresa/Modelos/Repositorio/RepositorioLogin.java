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
import sistemagestionempresa.Modelos.Entidades.Login;
import sistemagestionempresa.Modelos.Entidades.Roles;
import sistemagestionempresa.Modelos.Entidades.Usuarios;
/**
 *
 * @author Victor Alejandro
 */
public class RepositorioLogin {
    Conexion cone = new Conexion();
    
    public Login Autenticacion(String nombre, String clave) {
    Usuarios usuario = null;  
    boolean usuarioEncontrado = false;  
    
    try {
        Connection conn = cone.obtenerConexion();
        String sql = "SELECT idUsuario, nombre, apellido, correo, telefono, clave, idRol FROM Usuarios WHERE nombre = ? AND clave = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nombre);
        ps.setString(2, clave);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int idUsuario = rs.getInt("idUsuario");
            String apellido = rs.getString("apellido");
            String correo = rs.getString("correo");
            String telefono = rs.getString("telefono");
            String claveUsuario = rs.getString("clave");
            int idRol = rs.getInt("idRol");
            usuario = new Usuarios(idUsuario, nombre, apellido, correo, telefono, claveUsuario, idRol);
            usuarioEncontrado = true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos.");
        }
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error en la base de datos: " + ex.getMessage());
    }
    return new Login(usuarioEncontrado, usuario);
}

}
