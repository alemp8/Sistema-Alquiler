/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempresa.Modelos.Entidades;

/**
 *
 * @author Victor Alejandro
 */
public class Puestos {
    int idPuesto;
    String descripcion;

    public Puestos(int idPuesto, String descripcion) {
        this.idPuesto = idPuesto;
        this.descripcion = descripcion;
    }

    public Puestos() {
    }
    

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
    
}
