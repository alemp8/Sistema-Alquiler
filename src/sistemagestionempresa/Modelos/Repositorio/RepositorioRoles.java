package sistemagestionempresa.Modelos.Repositorio;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sistemagestionempresa.Modelos.Entidades.Roles;

/**
 *
 * @author Victor Alejandro
 */
public class RepositorioRoles implements Procesos<Roles>{
    Conexion cone = new Conexion();
     
    @Override
    public void mantenimiento(Roles entidad, String accion) {
     try{
        Connection conn = cone.obtenerConexion();
        CallableStatement cmd = conn.prepareCall("{CALL sp_GestionRoles(?,?,?)}");
        
        cmd.setString(1,accion);
        cmd.setInt(2,entidad.getIdRol());
        cmd.setString(3,entidad.getNombre());
        
        cmd.execute();
        } 
    catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Error: "+ ex);
    }     
    }

    @Override
    public void CargarTabla(JTable table, Roles entidad, String accion) {
     DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
        Connection conn = cone.obtenerConexion();
        CallableStatement cmd = conn.prepareCall("{CALL sp_GestionRoles(?,?,?)}");
        cmd.setString(1,accion);
        cmd.setInt(2,entidad.getIdRol());
        cmd.setString(3,entidad.getNombre());
        
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
