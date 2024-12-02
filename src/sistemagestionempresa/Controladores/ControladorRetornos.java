/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempresa.Controladores;

import javax.swing.JTable;
import sistemagestionempresa.Modelos.Entidades.Recargos;
import sistemagestionempresa.Modelos.Repositorio.RepositorioRetornos;

/**
 *
 * @author Victor Alejandro
 */
public class ControladorRetornos {
    RepositorioRetornos repo = new  RepositorioRetornos();
    
    public void Guardar(Recargos recargo){
     repo.Guardar(recargo);
    }
    
    public void detalles(JTable table, int codigo){
     repo.CargarDetalles(table, codigo);
    }
    
}
