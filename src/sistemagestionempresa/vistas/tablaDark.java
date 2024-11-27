/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempresa.vistas;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor Alejandro
 */
public class tablaDark extends JTable{

    public tablaDark() {
        super();
        configurarTabla();
    }

    public tablaDark(DefaultTableModel model) {
        super(model);
        configurarTabla();
    }

    private void configurarTabla() {
        // Configuración del encabezado
        getTableHeader().setBorder(null);
        getTableHeader().setBackground(new Color(51, 41, 64));
        getTableHeader().setForeground(Color.WHITE);
       

        // Asignar el renderizador para el encabezado
        getTableHeader().setDefaultRenderer(new TablamodoOscuro());

        // Configurar el renderizador de las celdas
        setDefaultRenderer(Object.class, new TablaceldaOscuro());
    }

    private class TablamodoOscuro extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            com.setBackground(new Color(128,150,113));
            com.setForeground(Color.WHITE);
            
            return com;
        }
    }

    private class TablaceldaOscuro extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (isSelected) {
                com.setBackground(new Color(128,150,113));
                com.setForeground(Color.WHITE);
            } else {
                com.setBackground(row % 2 == 0 ? new Color(179,183,146) : new Color(179,183,146));
                com.setForeground(Color.BLACK);
            }

            return com;
        }
    }
}
