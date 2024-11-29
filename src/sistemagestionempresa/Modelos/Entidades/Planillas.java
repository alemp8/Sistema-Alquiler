/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempresa.Modelos.Entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Victor Alejandro
 */
public class Planillas {
    int idPlanilla;
    Date fecha;
    int realizadapor;
    List<DetallePlanilla> detalle;

    public Planillas(int idPlanilla, Date fecha, int realizadapor, List<DetallePlanilla> detalle) {
        this.idPlanilla = idPlanilla;
        this.fecha = fecha;
        this.realizadapor = realizadapor;
        this.detalle = detalle;
    }

    public Planillas() {
    }

    public int getIdPlanilla() {
        return idPlanilla;
    }

    public void setIdPlanilla(int idPlanilla) {
        this.idPlanilla = idPlanilla;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getRealizadapor() {
        return realizadapor;
    }

    public void setRealizadapor(int realizadapor) {
        this.realizadapor = realizadapor;
    }

    public List<DetallePlanilla> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetallePlanilla> detalle) {
        this.detalle = detalle;
    }
    
    
}
