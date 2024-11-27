/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemagestionempresa.Controladores;

import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Victor Alejandro
 */
public interface MetodosControladores<T> {
    public void Guardar(T entidad);
    public void lista(JTable table);
    public void Eliminar(int id);
}
