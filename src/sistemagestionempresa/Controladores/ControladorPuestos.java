/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempresa.Controladores;

import javax.swing.JTable;
import sistemagestionempresa.Modelos.Entidades.Puestos;
import sistemagestionempresa.Modelos.Repositorio.RepositorioPuestos;

/**
 *
 * @author Victor Alejandro
 */
public class ControladorPuestos implements MetodosProcesos<Puestos> {
    RepositorioPuestos repo = new RepositorioPuestos();
    @Override
    public void Guardar(Puestos entidad) {
     if(entidad.getIdPuesto()==0) {
     repo.mantenimiento(entidad, "Guardar");
     } else{
     repo.mantenimiento(entidad, "Modificar");
     }   
    }

    @Override
    public void Tabla(JTable tabla, Puestos entidad) {
     repo.CargarTabla(tabla, entidad,"Leer");    
    }

    @Override
    public void Eliminar(Puestos entidad) {
     repo.mantenimiento(entidad, "Eliminar");   
    }
    
}
