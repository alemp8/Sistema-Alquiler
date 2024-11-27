package sistemagestionempresa.Modelos.Entidades;

/**
 *
 * @author Victor Alejandro
 */
public class Login {
    private boolean usuarioEncontrado;
    private Usuarios usuario;

    public Login(boolean usuarioEncontrado, Usuarios usuario) {
        this.usuarioEncontrado = usuarioEncontrado;
        this.usuario = usuario;
    }

    public boolean isUsuarioEncontrado() {
        return usuarioEncontrado;
    }

    public Usuarios getUsuario() {
        return usuario;
    }
}
