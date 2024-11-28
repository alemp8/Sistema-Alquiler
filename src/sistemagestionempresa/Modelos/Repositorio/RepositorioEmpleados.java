package sistemagestionempresa.Modelos.Repositorio;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sistemagestionempresa.Modelos.Entidades.Empleados;
import sistemagestionempresa.Modelos.Entidades.Puestos;
import sistemagestionempresa.Modelos.Entidades.Sucursales;

/**
 *
 * @author Victor Alejandro
 */
public class RepositorioEmpleados implements Procesos<Empleados> {

    Conexion cone = new Conexion();

    @Override
    public void mantenimiento(Empleados entidad, String accion) {
        try {
            Connection conn = cone.obtenerConexion();
            CallableStatement cmd = conn.prepareCall("{CALL sp_GestionEmpleados(?,?,?,?,?,?,?,?,?)}");

            cmd.setString(1, accion);
            cmd.setInt(2, entidad.getIdEmpleado());
            cmd.setString(3, entidad.getDNI());
            cmd.setString(4, entidad.getNombre());
            cmd.setBigDecimal(5, entidad.getSalario());
            cmd.setString(6, entidad.getCuenta());
            cmd.setInt(7, entidad.getIdJornada());
            cmd.setInt(8, entidad.getIdPuesto());
            cmd.setInt(9, entidad.getIdSucursal());

            cmd.execute();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }

    @Override
    public void CargarTabla(JTable table, Empleados entidad, String accion) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection conn = cone.obtenerConexion();
            CallableStatement cmd = conn.prepareCall("{CALL sp_GestionEmpleados(?,?,?,?,?,?,?,?,?)}");

            cmd.setString(1, accion);
            cmd.setInt(2, entidad.getIdEmpleado());
            cmd.setString(3, entidad.getDNI());
            cmd.setString(4, entidad.getNombre());
            cmd.setBigDecimal(5, entidad.getSalario());
            cmd.setString(6, entidad.getCuenta());
            cmd.setInt(7, entidad.getIdJornada());
            cmd.setInt(8, entidad.getIdPuesto());
            cmd.setInt(9, entidad.getIdSucursal());

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

    public DefaultComboBoxModel llenarSucursales() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        Connection conn = null;
        CallableStatement cmd = null;
        ResultSet rs = null;
        try {
            conn = cone.obtenerConexion();
            cmd = conn.prepareCall("{CALL sp_Sucursales}");
            rs = cmd.executeQuery();
            while (rs.next()) {
                int idSucursal= rs.getInt(1);
                String nombre = rs.getString(2);
                modelo.addElement(new Sucursales(idSucursal, nombre));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los roles: " + ex.getMessage());
        }

        return modelo;
    }

    public DefaultComboBoxModel llenarPuestos() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        Connection conn = null;
        CallableStatement cmd = null;
        ResultSet rs = null;
        try {
            conn = cone.obtenerConexion();
            cmd = conn.prepareCall("{CALL sp_Puestos}");
            rs = cmd.executeQuery();
            while (rs.next()) {
                int idPuesto = rs.getInt(1);
                String descripcion = rs.getString(2);
                modelo.addElement(new Puestos(idPuesto, descripcion));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los roles: " + ex.getMessage());
        }
        return modelo;
    }

    public DefaultComboBoxModel llenarJornadas() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        try {
            Connection conn = cone.obtenerConexion();
            CallableStatement cmd = conn.prepareCall("{CALL sp_Jornadas}");
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                modelo.addElement(rs.getString(2));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return modelo;
    }

}
