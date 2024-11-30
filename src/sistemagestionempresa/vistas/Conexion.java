/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempresa.vistas;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor Alejandro
 */
public class Conexion {
    Connection con = null;
    String usuario = "vamp";
    String password = "12345";
    String db = "DBSistemaVentas";
    String puerto= "1433";
    public DefaultTableModel datatable = new DefaultTableModel();
    
    public Connection obtenerConexion(){
    try{
        String cadena = "jdbc:sqlserver://localhost:"+puerto+";"+"databaseName="+db + ";trustServerCertificate=true;";
        con = DriverManager.getConnection(cadena, usuario, password);
        System.out.println("Conexion exitosa");
        } 
    catch(Exception ex){JOptionPane.showMessageDialog(null, "Error: "+ ex);}
    return con;
    }
    
    public void TablaCargaClientes(String data) {
        try {
            con.setAutoCommit(false); // Deshabilitar la confirmación automática para transacciones manuales

            String consulta = "Select * from " + data;
            PreparedStatement comando = con.prepareStatement(consulta);

            ResultSet resultado = comando.executeQuery();

            // Limpiar cualquier dato existente en el DefaultTableModel
            datatable.setRowCount(0);
            datatable.addColumn("ID de Cliente");
            datatable.addColumn("RTN");
            datatable.addColumn("Nombre");
            datatable.addColumn("Dirección");
            datatable.addColumn("Correo");
            datatable.addColumn("Teléfono");

            // Procesar los resultados y agregarlos al DefaultTableModel
            while (resultado.next()) {
                // Ajusta esto según las columnas reales en tu base de datos.
                Object fila [] = new Object[6];
                    for (int i = 0; i < 6; i++)
                    {
                        fila[i] = resultado.getObject(i+1);
                    }
                    datatable.addRow(fila);
                        // ... Continúa con las demás columnas según sea necesario
                }
            resultado.close();
            con.commit(); // Confirmar la transacción
        } catch (SQLException e) {
            try {
                con.rollback(); // En caso de error, hacer un rollback
            } catch (SQLException rollbackException) {
                rollbackException.printStackTrace();
            }
            e.printStackTrace(); // Manejar la excepción adecuadamente en tu aplicación
        } finally {
            try {
                con.setAutoCommit(true); // Restaurar la confirmación automática
            } catch (SQLException closeException) {
                closeException.printStackTrace();
            }
        }
    }
    
    public void registrarCliente(String rtn, String nombre, String direccion, String correo,
                           String telefono) {
        try {
            con.setAutoCommit(false); // Deshabilitar la confirmación automática para transacciones manuales

            String spInsertarClientes = "{call spinsertar_Clientes(?, ?, ?, ?, ?)}";
            CallableStatement comando = con.prepareCall(spInsertarClientes);

            comando.setString(1, rtn);
            comando.setString(2, nombre);
            comando.setString(3, direccion);
            comando.setString(4, correo);
            comando.setString(5, telefono);

            comando.executeUpdate();

            con.commit(); // Confirmar la transacción
        } catch (SQLException e) {
            try {
                con.rollback(); // En caso de error, hacer un rollback
            } catch (SQLException rollbackException) {
                rollbackException.printStackTrace();
            }
            e.printStackTrace(); // Manejar la excepción adecuadamente en tu aplicación
        } finally {
            try {
                con.setAutoCommit(true); // Restaurar la confirmación automática
            } catch (SQLException closeException) {
                closeException.printStackTrace();
            }
        }
    }
    
    public void eliminarCliente(int id) {
        try {
            con.setAutoCommit(false); // Deshabilitar la confirmación automática para transacciones manuales

            String query = "delete from Clientes where idCliente = ?";
            PreparedStatement comando = con.prepareStatement(query);
            comando.setInt(1, id);

            comando.executeUpdate();

            con.commit(); // Confirmar la transacción
        } catch (SQLException e) {
            try {
                con.rollback(); // En caso de error, hacer un rollback
            } catch (SQLException rollbackException) {
                rollbackException.printStackTrace();
            }
            e.printStackTrace(); // Manejar la excepción adecuadamente en tu aplicación
        } finally {
            try {
                con.setAutoCommit(true); // Restaurar la confirmación automática
            } catch (SQLException closeException) {
                closeException.printStackTrace();
            }
        }
    }
}
