package sistemagestionempresa.Modelos.Entidades;

import java.math.BigDecimal;
import java.util.List;


public class Recargos {
    int idRecargo; 
    int idFactura;
    String fechaRetorno;
    BigDecimal montoRecargo;
    List<DetalleRecargo> detalle;

    public Recargos() {
    }

    public Recargos(int idRecargo, int idFactura, String fechaRetorno, BigDecimal montoRecargo, List<DetalleRecargo> detalle) {
        this.idRecargo = idRecargo;
        this.idFactura = idFactura;
        this.fechaRetorno = fechaRetorno;
        this.montoRecargo = montoRecargo;
        this.detalle = detalle;
    }

    public int getIdRecargo() {
        return idRecargo;
    }

    public void setIdRecargo(int idRecargo) {
        this.idRecargo = idRecargo;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getFechaRetorno() {
        return fechaRetorno;
    }

    public void setFechaRetorno(String fechaRetorno) {
        this.fechaRetorno = fechaRetorno;
    }

    public BigDecimal getMontoRecargo() {
        return montoRecargo;
    }

    public void setMontoRecargo(BigDecimal montoRecargo) {
        this.montoRecargo = montoRecargo;
    }

    public List<DetalleRecargo> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleRecargo> detalle) {
        this.detalle = detalle;
    }
    
    
  
}
