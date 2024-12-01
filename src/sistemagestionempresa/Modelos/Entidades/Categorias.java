package sistemagestionempresa.Modelos.Entidades;

/**
 *
 * @author Victor Alejandro
 */
public class Categorias {
    int idCat;
    String nombre;

    public Categorias(int idCat, String nombre) {
        this.idCat = idCat;
        this.nombre = nombre;
    }

    public Categorias() {
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
