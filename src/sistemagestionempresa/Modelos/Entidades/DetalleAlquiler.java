package sistemagestionempresa.Modelos.Entidades;

import java.math.BigDecimal;

/**
 *
 * @author Victor Alejandro
 */
public class DetalleAlquiler {
    int idDetalle;
    int idFactura;
    int idProducto;
    BigDecimal costo;
    BigDecimal precio;
    int cantidad;
    BigDecimal subtotal;

    public DetalleAlquiler() {
    }

    public DetalleAlquiler(int idDetalle, int idFactura, int idProducto, BigDecimal costo, BigDecimal precio, int cantidad, BigDecimal subtotal) {
        this.idDetalle = idDetalle;
        this.idFactura = idFactura;
        this.idProducto = idProducto;
        this.costo = costo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }
    
    
    
}
