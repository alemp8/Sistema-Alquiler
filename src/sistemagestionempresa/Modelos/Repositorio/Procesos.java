package sistemagestionempresa.Modelos.Repositorio;

import javax.swing.JTable;

/**
 *
 * @author Victor Alejandro
 */
public interface Procesos<T> {
    public void mantenimiento(T entidad, String accion);
    public void CargarTabla(JTable table,T entidad, String accion);
}
