package sistemagestionempresa.Modelos.Entidades;

import java.math.BigDecimal;
import java.util.Date;


public class Productos {
    int idProducto;
    String codigo;
    String nombre;
    String descripcion;
    int cantidad;
    BigDecimal costo;
    BigDecimal precio;
    String vence;
    int Categoria;
    int Proveedor;

    public Productos(int idProducto, String codigo, String nombre, String descripcion, int cantidad, BigDecimal costo, BigDecimal precio, String vence, int Categoria, int Proveedor) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.costo = costo;
        this.precio = precio;
        this.vence = vence;
        this.Categoria = Categoria;
        this.Proveedor = Proveedor;
    }

    public Productos(int idProducto, String codigo, String nombre, String descripcion, int cantidad, BigDecimal costo, BigDecimal precio) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.costo = costo;
        this.precio = precio;
    }

    public Productos(int idProducto, int cantidad) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public Productos(int idProducto, String nombre, BigDecimal costo, BigDecimal precio, int cantidad) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.costo = costo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return  nombre;
    }

    public Productos() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getVence() {
        return vence;
    }

    public void setVence(String vence) {
        this.vence = vence;
    }

    public int getCategoria() {
        return Categoria;
    }

    public void setCategoria(int Categoria) {
        this.Categoria = Categoria;
    }

    public int getProveedor() {
        return Proveedor;
    }

    public void setProveedor(int Proveedor) {
        this.Proveedor = Proveedor;
    }
      
}
