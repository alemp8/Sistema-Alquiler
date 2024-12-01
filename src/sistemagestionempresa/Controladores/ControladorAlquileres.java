package sistemagestionempresa.Controladores;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import sistemagestionempresa.Modelos.Entidades.Alquiler;
import sistemagestionempresa.Modelos.Repositorio.RepositorioAlquiler;

public class ControladorAlquileres {

    RepositorioAlquiler repo = new RepositorioAlquiler();

    public void Guardar(Alquiler entidad) {
        if (entidad.getIdFactura() == 0) {
            repo.Guardar(entidad);
        } else {
            // repo.Modificar(entidad);
        }
    }

    public void Tabla(JTable tabla) {
        repo.CargarTabla(tabla);
    }

    public DefaultComboBoxModel Clientes() {
        return repo.llenarClientes();
    }

    public DefaultComboBoxModel Productos() {
        return repo.llenarProductos();
    }

    public void Eliminar(int codigo) {
        repo.Eliminar(codigo);
    }

}
