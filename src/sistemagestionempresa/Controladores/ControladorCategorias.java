package sistemagestionempresa.Controladores;

import javax.swing.JTable;
import sistemagestionempresa.Modelos.Entidades.Categorias;
import sistemagestionempresa.Modelos.Repositorio.RepositorioCategorias;

/**
 *
 * @author Victor Alejandro
 */
public class ControladorCategorias implements MetodosProcesos<Categorias> {

    RepositorioCategorias repo = new RepositorioCategorias();

    @Override
    public void Guardar(Categorias entidad) {
        if (entidad.getIdCat() == 0) {
            repo.mantenimiento(entidad, "Guardar");
        } else {
            repo.mantenimiento(entidad, "Modificar");
        }
    }

    @Override
    public void Tabla(JTable tabla, Categorias entidad) {
        repo.CargarTabla(tabla, entidad, "Leer");
    }

    @Override
    public void Eliminar(Categorias entidad) {
        repo.mantenimiento(entidad, "Eliminar");
    }

}
