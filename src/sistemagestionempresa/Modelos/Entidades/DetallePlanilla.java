/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempresa.Modelos.Entidades;

import java.math.BigDecimal;

/**
 *
 * @author Victor Alejandro
 */
public class DetallePlanilla {
    int idDetalle;
    int idPlanilla;
    int idEmpleado;
    BigDecimal sueldoBruto;
    BigDecimal bonificaciones;
    BigDecimal deducciones;
    BigDecimal sueldoNeto;

    public DetallePlanilla(int idDetalle, int idPlanilla, int idEmpleado, BigDecimal sueldoBruto, BigDecimal bonificaciones, BigDecimal deducciones, BigDecimal sueldoNeto) {
        this.idDetalle = idDetalle;
        this.idPlanilla = idPlanilla;
        this.idEmpleado = idEmpleado;
        this.sueldoBruto = sueldoBruto;
        this.bonificaciones = bonificaciones;
        this.deducciones = deducciones;
        this.sueldoNeto = sueldoNeto;
    }

    public DetallePlanilla(int idDetalle, int idEmpleado, BigDecimal sueldoBruto, BigDecimal bonificaciones, BigDecimal deducciones, BigDecimal sueldoNeto) {
        this.idDetalle = idDetalle;
        this.idEmpleado = idEmpleado;
        this.sueldoBruto = sueldoBruto;
        this.bonificaciones = bonificaciones;
        this.deducciones = deducciones;
        this.sueldoNeto = sueldoNeto;
    }
    
    

    public DetallePlanilla() {
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdPlanilla() {
        return idPlanilla;
    }

    public void setIdPlanilla(int idPlanilla) {
        this.idPlanilla = idPlanilla;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public BigDecimal getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(BigDecimal sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public BigDecimal getBonificaciones() {
        return bonificaciones;
    }

    public void setBonificaciones(BigDecimal bonificaciones) {
        this.bonificaciones = bonificaciones;
    }

    public BigDecimal getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(BigDecimal deducciones) {
        this.deducciones = deducciones;
    }

    public BigDecimal getSueldoNeto() {
        return sueldoNeto;
    }

    public void setSueldoNeto(BigDecimal sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }
    
    
}
