package sistemagestionempresa.Controladores;

import javax.swing.JTable;
import sistemagestionempresa.Modelos.Repositorio.RepositorioReportes;

/**
 *
 * @author Victor Alejandro
 */
public class ControladorReportes {
    RepositorioReportes repo = new RepositorioReportes();
    
    public void Recargos(JTable table) {
       repo.listaRecargos(table);
    }
    
    public void Alquileres(JTable table) {
       repo.DetallesAlquiler(table);
    }
    
    public void BuscarRecargo(JTable table, String busqueda) {
       repo.buscarRecargo(table, busqueda);
    }
    
    public void BuscarDetalle(JTable table, String busqueda) {
       repo.buscarDetalle(table, busqueda);
    }
}
