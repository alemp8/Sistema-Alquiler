/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemagestionempresa.Controladores;

import javax.swing.JTable;


/**
 *
 * @author Victor Alejandro
 */
public interface MetodosProcesos<T> {
    public void Guardar(T entidad);
    public void Tabla(JTable tabla, T entidad);
    public void Eliminar(T entidad);
}
