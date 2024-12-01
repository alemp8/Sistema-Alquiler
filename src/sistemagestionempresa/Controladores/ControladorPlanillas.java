package sistemagestionempresa.Controladores;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import sistemagestionempresa.Modelos.Entidades.Empleados;
import sistemagestionempresa.Modelos.Entidades.Planillas;
import sistemagestionempresa.Modelos.Repositorio.RepositorioEmpleados;
import sistemagestionempresa.Modelos.Repositorio.RepositorioPlanillas;

/**
 *
 * @author Victor Alejandro
 */
public class ControladorPlanillas {

    RepositorioPlanillas repo = new RepositorioPlanillas();

    public void Guardar(Planillas entidad) {
      repo.Guardar(entidad);        
    }
    
    public void Modificar(Planillas entidad) {
      repo.Modificar(entidad);  
    }

    public void Tabla(JTable tabla) {
        repo.CargarTabla(tabla);
    }
    
    public void buscar(JTable tabla, String busqueda) {
        repo.buscar(tabla, busqueda);
    }
    
     public void Detalle(JTable tabla, int codigo) {
        repo.CargarDetalles(tabla,codigo);
    }

    public void Eliminar(int codigo) {
       repo.Eliminar(codigo);
    }
    
    public void EliminarDetalle(int codigo) {
       repo.EliminarDetalle(codigo);
    }
    
    public DefaultComboBoxModel llenarEmpleados(){
        return repo.llenarEmpleados();
    }
    
    public DefaultComboBoxModel llenarUsuarios(){
        return repo.llenarUsuarios();
    }

}
