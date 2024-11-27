package sistemagestionempresa.Controladores;

import sistemagestionempresa.Modelos.Entidades.Login;
import sistemagestionempresa.Modelos.Repositorio.RepositorioLogin;

/**
 *
 * @author Victor Alejandro
 */
public class ControladorLogin {
    RepositorioLogin repo = new RepositorioLogin();
    public Login Autenticacion(String nombre, String clave) {
        return repo.Autenticacion(nombre, clave);
    }
}
