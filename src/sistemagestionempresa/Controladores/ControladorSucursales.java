package sistemagestionempresa.Controladores;

import javax.swing.JTable;
import sistemagestionempresa.Modelos.Entidades.Sucursales;
import sistemagestionempresa.Modelos.Repositorio.RepositorioSucursales;

/**
 *
 * @author Victor Alejandro
 */
public class ControladorSucursales implements MetodosProcesos<Sucursales> {
   RepositorioSucursales repo = new RepositorioSucursales();

    @Override
    public void Guardar(Sucursales entidad) {
     if(entidad.getIdSucursal()==0) {
     repo.mantenimiento(entidad, "Guardar");
     } else{
     repo.mantenimiento(entidad, "Modificar");
     }   
    }

    @Override
    public void Tabla(JTable tabla, Sucursales entidad) {
       repo.CargarTabla(tabla, entidad,"Leer");
    }
    
    public void buscar(JTable tabla, String busqueda) {
        repo.buscar(tabla, busqueda);
    }

    @Override
    public void Eliminar(Sucursales entidad) {
         repo.mantenimiento(entidad, "Eliminar");
    }
   
}
