package sistemagestionempresa.Modelos.Repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Alejandro
 */
public class Conexion {
    Connection con = null;
    String usuario = "vamp";
    String password = "12345";
    String db = "DBAlquiler";
    String puerto= "1433";
    
    public Connection obtenerConexion(){
    try{
        String cadena = "jdbc:sqlserver://localhost:"+puerto+";"+"databaseName="+db + ";trustServerCertificate=true;";
        con = DriverManager.getConnection(cadena, usuario, password);
        System.out.println("Conexion exitosa");
        } 
    catch(Exception ex){JOptionPane.showMessageDialog(null, "Error: "+ ex);}
    return con;
    }
    
    
}
