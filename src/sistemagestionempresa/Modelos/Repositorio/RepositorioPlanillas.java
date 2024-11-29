/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempresa.Modelos.Repositorio;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sistemagestionempresa.Modelos.Entidades.DetallePlanilla;
import sistemagestionempresa.Modelos.Entidades.Empleados;
import sistemagestionempresa.Modelos.Entidades.Planillas;
import sistemagestionempresa.Modelos.Entidades.Usuarios;

/**
 *
 * @author Victor Alejandro
 */
public class RepositorioPlanillas {

    Conexion cone = new Conexion();

    public void Guardar(Planillas entidad) {
        Connection conn = null;
        PreparedStatement stmtPlanilla = null;
        PreparedStatement stmtDetalle = null;
        ResultSet rs = null;

        try {
            conn = cone.obtenerConexion();
            String sqlPlanilla = "INSERT INTO Planillas (fecha, realizadaPor) VALUES (?, ?)";
            stmtPlanilla = conn.prepareStatement(sqlPlanilla, PreparedStatement.RETURN_GENERATED_KEYS);
            stmtPlanilla.setDate(1, new java.sql.Date(entidad.getFecha().getTime()));
            stmtPlanilla.setInt(2, entidad.getRealizadapor());
            stmtPlanilla.executeUpdate();
            rs = stmtPlanilla.getGeneratedKeys();
            if (rs.next()) {
                int idPlanilla = rs.getInt(1);
                entidad.setIdPlanilla(idPlanilla);
            }
            for (DetallePlanilla detalle : entidad.getDetalle()) {
                String sqlDetalle = "INSERT INTO DetallePlanilla (idPlanilla, idEmpleado, sueldoBruto, bonificaciones, deducciones, sueldoNeto) VALUES (?, ?, ?, ?, ?, ?)";
                stmtDetalle = conn.prepareStatement(sqlDetalle);
                stmtDetalle.setInt(1, entidad.getIdPlanilla());
                stmtDetalle.setInt(2, detalle.getIdEmpleado());
                stmtDetalle.setBigDecimal(3, detalle.getSueldoBruto());
                stmtDetalle.setBigDecimal(4, detalle.getBonificaciones());
                stmtDetalle.setBigDecimal(5, detalle.getDeducciones());
                stmtDetalle.setBigDecimal(6, detalle.getSueldoNeto());
                stmtDetalle.executeUpdate();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }

    public void Modificar(Planillas entidad) {
        Connection conn = null;
        PreparedStatement stmtPlanilla = null;
        PreparedStatement stmtDetalle = null;

        try {
            conn = cone.obtenerConexion();

            String sqlPlanilla = "UPDATE Planillas SET fecha = ?, realizadaPor = ? WHERE idPlanilla = ?";
            stmtPlanilla = conn.prepareStatement(sqlPlanilla);
            stmtPlanilla.setDate(1, new java.sql.Date(entidad.getFecha().getTime()));
            stmtPlanilla.setInt(2, entidad.getRealizadapor());
            stmtPlanilla.setInt(3, entidad.getIdPlanilla());
            stmtPlanilla.executeUpdate();

            for (DetallePlanilla detalle : entidad.getDetalle()) {
                String sqlDetalle = "UPDATE DetallePlanilla SET idEmpleado = ?, sueldoBruto = ?, bonificaciones = ?, deducciones = ?, sueldoNeto = ? WHERE idDetalle = ?";
                stmtDetalle = conn.prepareStatement(sqlDetalle);
                stmtDetalle.setInt(1, detalle.getIdEmpleado());
                stmtDetalle.setBigDecimal(2, detalle.getSueldoBruto());
                stmtDetalle.setBigDecimal(3, detalle.getBonificaciones());
                stmtDetalle.setBigDecimal(4, detalle.getDeducciones());
                stmtDetalle.setBigDecimal(5, detalle.getSueldoNeto());
                stmtDetalle.setInt(6, detalle.getIdDetalle());
                stmtDetalle.executeUpdate();
            }

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }

    public void CargarTabla(JTable table) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        try {
            Connection conn = cone.obtenerConexion();
            String sql = "SELECT p.idPlanilla, p.fecha, u.nombre "
                    + "FROM Planillas p "
                    + "JOIN Usuarios u ON p.realizadaPor = u.idUsuario ";

            PreparedStatement stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
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

    public void CargarDetalles(JTable table, int codigo) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas = 0;
        String sql = "SELECT dp.idDetalle, dp.idPlanilla,  e.nombre, dp.sueldoBruto, "
                + "dp.bonificaciones, dp.deducciones, dp.sueldoNeto "
                + "FROM DetallePlanilla dp "
                + "JOIN Empleados e ON dp.idEmpleado = e.idEmpleado "
                + "WHERE dp.idPlanilla = ?";
        try {
            Connection conn = cone.obtenerConexion();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
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

    public DefaultComboBoxModel llenarEmpleados() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        Connection conn = null;
        CallableStatement cmd = null;
        ResultSet rs = null;
        try {
            conn = cone.obtenerConexion();
            cmd = conn.prepareCall("{CALL sp_Empleados}");
            rs = cmd.executeQuery();
            while (rs.next()) {
                int idEmpleado = rs.getInt(1);
                String nombre = rs.getString(2);
                BigDecimal salario = rs.getBigDecimal(3);
                modelo.addElement(new Empleados(idEmpleado, nombre, salario));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los roles: " + ex.getMessage());
        }

        return modelo;
    }

    public DefaultComboBoxModel llenarUsuarios() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        Connection conn = null;
        CallableStatement cmd = null;
        ResultSet rs = null;
        try {
            conn = cone.obtenerConexion();
            cmd = conn.prepareCall("{CALL sp_UsuarioPlanilla}");
            rs = cmd.executeQuery();
            while (rs.next()) {
                int idUsuario = rs.getInt(1);
                String nombre = rs.getString(2);

                modelo.addElement(new Usuarios(idUsuario, nombre));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los roles: " + ex.getMessage());
        }

        return modelo;
    }

    public void Eliminar(int codigo) {
        try {
            Connection conn = cone.obtenerConexion();
            conn.setAutoCommit(false);
            PreparedStatement psDetalle = conn.prepareStatement("DELETE FROM DetallePlanilla WHERE idPlanilla = ?");
            psDetalle.setInt(1, codigo);
            psDetalle.executeUpdate();
            PreparedStatement psPlanilla = conn.prepareStatement("DELETE FROM Planillas WHERE idPlanilla = ?");
            psPlanilla.setInt(1, codigo);
            psPlanilla.executeUpdate();
            conn.commit();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
        }
    }

}
