package sistemagestionempresa.Controladores;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import sistemagestionempresa.Modelos.Entidades.Usuarios;
import sistemagestionempresa.Modelos.Repositorio.RepositorioUsuarios;

/**
 *
 * @author Victor Alejandro
 */
public class ControladorUsuarios implements MetodosControladores<Usuarios>{
   RepositorioUsuarios repo = new RepositorioUsuarios(); 

    @Override
    public void Guardar(Usuarios entidad) {
       if(entidad.getIdUsuario()==0){
       repo.Guardar(entidad);
       }else{
       repo.Modificar(entidad);
       }
    }

    @Override
    public void lista(JTable table) {
       repo.lista(table);
    }

    @Override
    public void Eliminar(int id) {
        repo.Eliminar(id);
    }
    
    public DefaultComboBoxModel CargarCombos(){
     return repo.llenarComboBox();
    }
}
