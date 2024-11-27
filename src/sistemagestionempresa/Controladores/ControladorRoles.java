/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempresa.Controladores;

import java.util.List;
import javax.swing.JTable;
import sistemagestionempresa.Modelos.Entidades.Roles;
import sistemagestionempresa.Modelos.Repositorio.RepositorioRoles;

/**
 *
 * @author Victor Alejandro
 */
public class ControladorRoles implements MetodosProcesos<Roles>{
    
    RepositorioRoles repo = new RepositorioRoles(); 

    @Override
    public void Guardar(Roles entidad) {
     if(entidad.getIdRol()==0) {
     repo.mantenimiento(entidad, "Guardar");
     } else{
     repo.mantenimiento(entidad, "Modificar");
     }
    }

    @Override
    public void Eliminar(Roles entidad) {
        repo.mantenimiento(entidad, "Eliminar");
    }

    @Override
    public void Tabla(JTable tabla, Roles entidad) {
        repo.CargarTabla(tabla, entidad,"Leer");
    }
    
}
