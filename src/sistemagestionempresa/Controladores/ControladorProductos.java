package sistemagestionempresa.Controladores;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import sistemagestionempresa.Modelos.Entidades.Productos;
import sistemagestionempresa.Modelos.Repositorio.RepositorioProductos;

public class ControladorProductos implements MetodosProcesos<Productos>{
    RepositorioProductos repo = new RepositorioProductos();
    
    @Override
    public void Guardar(Productos entidad) {
    if(entidad.getIdProducto()==0){
    repo.mantenimiento(entidad, "Guardar");
    }else{
    repo.mantenimiento(entidad,"Modificar");
    } 
    }

    @Override
    public void Tabla(JTable tabla, Productos entidad) {
     repo.CargarTabla(tabla,entidad,"Leer");  
    }

    @Override
    public void Eliminar(Productos entidad) {
    repo.mantenimiento(entidad,"Eliminar");   
    }
    
    public DefaultComboBoxModel llenarCategorias(){
    return repo.llenarCategorias();
    }
    
    public DefaultComboBoxModel llenarProveedores(){
    return repo.llenarProveedores();
    }
    
}
