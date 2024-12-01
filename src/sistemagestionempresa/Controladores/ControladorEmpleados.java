/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempresa.Controladores;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import sistemagestionempresa.Modelos.Entidades.Empleados;
import sistemagestionempresa.Modelos.Repositorio.RepositorioEmpleados;

/**
 *
 * @author Victor Alejandro
 */
public class ControladorEmpleados implements MetodosProcesos<Empleados> {

    RepositorioEmpleados repo = new RepositorioEmpleados();

    @Override
    public void Guardar(Empleados entidad) {
        if (entidad.getIdEmpleado() == 0) {
            repo.mantenimiento(entidad, "Guardar");
        } else {
            repo.mantenimiento(entidad, "Modificar");
        }
    }

    @Override
    public void Tabla(JTable tabla, Empleados entidad) {
        repo.CargarTabla(tabla, entidad, "Leer");
    }

    @Override
    public void Eliminar(Empleados entidad) {
        repo.mantenimiento(entidad, "Eliminar");
    }
    
    public void buscar(JTable tabla, String busqueda) {
        repo.buscar(tabla, busqueda);
    }

    public DefaultComboBoxModel llenarSucursales() {
        return repo.llenarSucursales();
    }

    public DefaultComboBoxModel llenarPuestos() {
        return repo.llenarPuestos();
    }

    public DefaultComboBoxModel llenarJornadas() {
        return repo.llenarJornadas();
    }

}
