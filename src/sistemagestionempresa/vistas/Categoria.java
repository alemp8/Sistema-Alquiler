package sistemagestionempresa.vistas;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor Alejandro
 */
public class Categoria extends javax.swing.JFrame {
    Conexion cone = new Conexion();
    int codigo;
    int fila;
    
    public Categoria() {
        this.setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Categoria");
        //CargarTabla();
    }

     private void CargarTabla(){
       DefaultTableModel  modelo = (DefaultTableModel)Registros.getModel();
       modelo.setRowCount(0);
       PreparedStatement ps;
       ResultSet rs;
       ResultSetMetaData rsmd;
       int columnas;
       
       try {
        Connection conn = cone.obtenerConexion();
        ps = conn.prepareStatement("SELECT idCat, descripcion  FROM Categoria");
        rs = ps.executeQuery();
        rsmd = rs.getMetaData();
        columnas = rsmd.getColumnCount();
        while (rs.next()) {
            Object[] fila = new Object[columnas];
            for (int i = 0; i < columnas; i++) {
                fila[i] = rs.getObject(i + 1);
            }
            modelo.addRow(fila);
        }
    }
       catch(Exception ex){
       JOptionPane.showMessageDialog(null, ex.toString());
       }
   }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneles1 = new sistemagestionempresa.vistas.paneles();
        paneles2 = new sistemagestionempresa.vistas.paneles();
        jScrollPane1 = new javax.swing.JScrollPane();
        Registros = new sistemagestionempresa.vistas.tablaDark();
        jLabel3 = new javax.swing.JLabel();
        tbCerrar = new sistemagestionempresa.vistas.botones();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tbNombre = new javax.swing.JTextField();
        btnEliminar = new sistemagestionempresa.vistas.botones();
        btnGuardar = new sistemagestionempresa.vistas.botones();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneles1.setBackground(new java.awt.Color(246, 246, 246));

        paneles2.setBackground(new java.awt.Color(128, 150, 113));

        Registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Categoria"
            }
        ));
        Registros.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Registros);

        javax.swing.GroupLayout paneles2Layout = new javax.swing.GroupLayout(paneles2);
        paneles2.setLayout(paneles2Layout);
        paneles2Layout.setHorizontalGroup(
            paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        paneles2Layout.setVerticalGroup(
            paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel3.setText("Lista de Categorias");

        tbCerrar.setBackground(new java.awt.Color(255, 0, 0));
        tbCerrar.setBorderColor(new java.awt.Color(255, 0, 0));
        tbCerrar.setColor(new java.awt.Color(255, 0, 0));
        tbCerrar.setColorClick(new java.awt.Color(204, 0, 0));
        tbCerrar.setColorOver(new java.awt.Color(204, 0, 0));
        tbCerrar.setRadio(100);
        tbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCerrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel1.setText("Registro ");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setText("Nombre de Categoria");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        tbNombre.setBackground(new java.awt.Color(246, 246, 246));
        tbNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tbNombre.setBorder(null);

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderColor(new java.awt.Color(204, 0, 0));
        btnEliminar.setColor(new java.awt.Color(204, 0, 0));
        btnEliminar.setColorClick(new java.awt.Color(255, 0, 0));
        btnEliminar.setColorOver(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnEliminar.setRadio(40);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 153, 0));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderColor(new java.awt.Color(0, 153, 0));
        btnGuardar.setColor(new java.awt.Color(0, 153, 0));
        btnGuardar.setColorClick(new java.awt.Color(0, 204, 51));
        btnGuardar.setColorOver(new java.awt.Color(0, 204, 51));
        btnGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnGuardar.setRadio(40);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneles1Layout = new javax.swing.GroupLayout(paneles1);
        paneles1.setLayout(paneles1Layout);
        paneles1Layout.setHorizontalGroup(
            paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles1Layout.createSequentialGroup()
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2))
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                        .addComponent(paneles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(95, 95, 95)
                        .addComponent(tbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        paneles1Layout.setVerticalGroup(
            paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles1Layout.createSequentialGroup()
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))))
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paneles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneles1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneles1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCerrarActionPerformed
       this.dispose();
    }//GEN-LAST:event_tbCerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    if (!Validar()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese todos los datos requeridos.");
    } else {
        Guardar(); 
        Limpiar();
    } 
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void RegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrosMouseClicked
       fila = Registros.rowAtPoint(evt.getPoint());
       codigo = Integer.valueOf(String.valueOf(Registros.getValueAt(fila, 0)));
       tbNombre.setText(String.valueOf(Registros.getValueAt(fila, 1)));
    }//GEN-LAST:event_RegistrosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            Connection conn = cone.obtenerConexion();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Categoria WHERE idCat = ?");
            ps.setInt(1,codigo);
            ps.executeUpdate();
            
            Limpiar();
            CargarTabla();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }  
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void Guardar(){
        String descripcion = tbNombre.getText();
        
        try{
            Connection conn = cone.obtenerConexion();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO Categoria(descripcion) Values (?)");
            ps.setString(1,descripcion);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            CargarTabla();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }   
    }
    
    private void Limpiar(){
        tbNombre.setText("");
    }
    
    private boolean Validar() {
    if (tbNombre.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "El campo Nombre es obligatorio.");
        return false;
    } 
    return true;
}
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Categoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistemagestionempresa.vistas.tablaDark Registros;
    private sistemagestionempresa.vistas.botones btnEliminar;
    private sistemagestionempresa.vistas.botones btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private sistemagestionempresa.vistas.paneles paneles1;
    private sistemagestionempresa.vistas.paneles paneles2;
    private sistemagestionempresa.vistas.botones tbCerrar;
    private javax.swing.JTextField tbNombre;
    // End of variables declaration//GEN-END:variables
}
