package sistemagestionempresa.Modelos.Repositorio;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sistemagestionempresa.Modelos.Entidades.Productos;

/**
 *
 * @author Victor Alejandro
 */
public class RepositorioProductos implements Procesos<Productos> {
    Conexion cone = new Conexion();
     
    @Override
    public void mantenimiento(Productos entidad, String accion) {
      try{
        Connection conn = cone.obtenerConexion();
        CallableStatement cmd = conn.prepareCall("{CALL sp_GestionProductos(?,?,?,?,?,?,?,?,?,?,?)}"); 
        cmd.setString(1,accion);
        cmd.setInt(2,entidad.getIdProducto());
        cmd.setString(3,entidad.getCodigo());
        cmd.setString(4,entidad.getNombre());
        cmd.setString(5,entidad.getDescripcion());
        cmd.setInt(6,entidad.getCantidad());
        cmd.setBigDecimal(7,entidad.getCosto());
        cmd.setBigDecimal(8,entidad.getPrecio());
        cmd.setString(9, entidad.getVence());
        cmd.setInt(10,entidad.getCategoria());
        cmd.setInt(11, entidad.getProveedor());
        
        cmd.execute();
        } 
    catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Error: "+ ex);
    }      
    }

    @Override
    public void CargarTabla(JTable table, Productos entidad, String accion) {
      DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
        Connection conn = cone.obtenerConexion();
        CallableStatement cmd = conn.prepareCall("{CALL sp_GestionProductos(?,?,?,?,?,?,?,?,?,?,?)}");
        
        cmd.setString(1,accion);
        cmd.setInt(2,entidad.getIdProducto());
        cmd.setString(3,entidad.getCodigo());
        cmd.setString(4,entidad.getNombre());
        cmd.setString(5,entidad.getDescripcion());
        cmd.setInt(6,entidad.getCantidad());
        cmd.setBigDecimal(7,entidad.getCosto());
        cmd.setBigDecimal(8,entidad.getPrecio());
        cmd.setString(9, entidad.getVence());
        cmd.setInt(10,entidad.getCategoria());
        cmd.setInt(11, entidad.getProveedor());
        
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
    
    public DefaultComboBoxModel llenarCategorias(){
    DefaultComboBoxModel modelo = new DefaultComboBoxModel();
    modelo.addElement("Seleccione");
    
    try{
    Connection conn = cone.obtenerConexion();
    CallableStatement cmd = conn.prepareCall("{CALL sp_Categorias}");
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
    Connection conn = cone.obtenerConexion();
    CallableStatement cmd = conn.prepareCall("{CALL sp_Proveedores}");
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
