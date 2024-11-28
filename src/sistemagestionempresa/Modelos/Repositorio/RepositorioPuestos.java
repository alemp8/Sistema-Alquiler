/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempresa.Modelos.Repositorio;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sistemagestionempresa.Modelos.Entidades.Puestos;

/**
 *
 * @author Victor Alejandro
 */
public class RepositorioPuestos implements Procesos<Puestos> {
   Conexion cone = new Conexion();

    @Override
    public void mantenimiento(Puestos entidad, String accion) {
      try{
        Connection conn = cone.obtenerConexion();
        CallableStatement cmd = conn.prepareCall("{CALL sp_GestionPuestos(?,?,?)}");
        
        cmd.setString(1,accion);
        cmd.setInt(2,entidad.getIdPuesto());
        cmd.setString(3,entidad.getDescripcion());
        
        cmd.execute();
        } 
    catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Error: "+ ex);
    }    
    }

    @Override
    public void CargarTabla(JTable table, Puestos entidad, String accion) {
     DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
        Connection conn = cone.obtenerConexion();
        CallableStatement cmd = conn.prepareCall("{CALL sp_GestionPuestos(?,?,?)}");
        
        cmd.setString(1,accion);
        cmd.setInt(2,entidad.getIdPuesto());
        cmd.setString(3,entidad.getDescripcion());
        
        rs = cmd.executeQuery();
        rsmd = rs.getMetaData();
        columnas = rsmd.getColumnCount();
        
        while(rs.next()){
        Object [] fila = new Object[columnas];
        for(int i=0;i<columnas;i++){
            fila[i]= rs.getObject(i+1);
        }
        modelo.addRow(fila);
        }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ ex);
        }        
    }
   
}
