package sistemagestionempresa.Modelos.Entidades;

import java.math.BigDecimal;
import java.util.List;


public class Alquiler {
    int idFactura;
    String fecha;
    int idCliente;
    int Realizadopor;
    BigDecimal monto;
    List<DetalleAlquiler> detalle;

    public Alquiler() {
    }

    public Alquiler(int idFactura, String fecha, int idCliente, int Realizadopor, BigDecimal monto, List<DetalleAlquiler> detalle) {
        this.idFactura = idFactura;
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.Realizadopor = Realizadopor;
        this.monto = monto;
        this.detalle = detalle;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getRealizadopor() {
        return Realizadopor;
    }

    public void setRealizadopor(int Realizadopor) {
        this.Realizadopor = Realizadopor;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public List<DetalleAlquiler> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleAlquiler> detalle) {
        this.detalle = detalle;
    }
    
    
    
}
