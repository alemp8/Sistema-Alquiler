/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempresa.vistas;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Alejandro
 */
public class llenarComboBox {
  Conexion con = new Conexion();
    
    public DefaultComboBoxModel llenarCategorias(){
    DefaultComboBoxModel modelo = new DefaultComboBoxModel();
    modelo.addElement("Seleccione");
    
    try{
    Connection conn = con.obtenerConexion();
    CallableStatement cmd = conn.prepareCall("{CALL sp_categorias}");
    ResultSet rs = cmd.executeQuery();
    while(rs.next()){
    modelo.addElement(rs.getString(2));
    }
    }
    catch(Exception ex){
    JOptionPane.showMessageDialog(null, ex.toString());
    }
    return modelo;
    }  
    
    public DefaultComboBoxModel llenarProveedores(){
    DefaultComboBoxModel modelo = new DefaultComboBoxModel();
    modelo.addElement("Seleccione");
    
    try{
    Connection conn = con.obtenerConexion();
    CallableStatement cmd = conn.prepareCall("{CALL sp_proveedores}");
    ResultSet rs = cmd.executeQuery();
    while(rs.next()){
    modelo.addElement(rs.getString(2));
    }
    }
    catch(Exception ex){
    JOptionPane.showMessageDialog(null, ex.toString());
    }
    return modelo;
    }  
   
}
