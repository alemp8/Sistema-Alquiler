/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempresa.Controladores;

import javax.swing.JTable;
import sistemagestionempresa.Modelos.Entidades.Clientes;
import sistemagestionempresa.Modelos.Repositorio.RepositorioClientes;

/**
 *
 * @author Victor Alejandro
 */
public class ControladorClientes implements MetodosProcesos<Clientes>{
    RepositorioClientes repo = new RepositorioClientes();
    
    @Override
    public void Guardar(Clientes entidad) {
        if (entidad.getIdCliente() == 0) {
            repo.mantenimiento(entidad, "Guardar");
        } else {
            repo.mantenimiento(entidad, "Modificar");
        } 
    }

     public void buscar(JTable tabla, String busqueda) {
        repo.buscar(tabla, busqueda);
    }
     
    @Override
    public void Tabla(JTable tabla, Clientes entidad) {
        repo.CargarTabla(tabla, entidad, "Leer");
    }

    @Override
    public void Eliminar(Clientes entidad) {
         repo.mantenimiento(entidad, "Eliminar");
    }
    
}
