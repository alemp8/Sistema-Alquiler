package sistemagestionempresa.Modelos.Entidades;

/**
 *
 * @author Victor Alejandro
 */
public class Clientes {
    int idCliente;
    String RTN;
    String Nombre;
    String Direccion;
    String Correo;
    String Telefono;

    public Clientes() {
    }

    public Clientes(int idCliente, String RTN, String Nombre, String Direccion, String Correo, String Telefono) {
        this.idCliente = idCliente;
        this.RTN = RTN;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRTN() {
        return RTN;
    }

    public void setRTN(String RTN) {
        this.RTN = RTN;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
    
}
