
package sistemagestionempresa.vistas;

import java.awt.Color;
import sistemagestionempresa.Controladores.ControladorAlquileres;
import sistemagestionempresa.Modelos.Entidades.Alquiler;

/**
 *
 * @author Victor Alejandro
 */
public class GestionAlquileres extends javax.swing.JFrame {
    ControladorAlquileres controlador = new ControladorAlquileres();
    Alquiler alquiler = new Alquiler();
    //DetalleAlquiler detalle = new DetalleAlquiler();
    int codigo = 0;
    int fila;
    
    public GestionAlquileres() {
       this.setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));
        //this.setContentPane(panel);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Gestio de Alquileres");
        CargarTabla();
    }
    
    public void CargarTabla() {
        controlador.Tabla(Registros);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneles1 = new sistemagestionempresa.vistas.paneles();
        paneles2 = new sistemagestionempresa.vistas.paneles();
        jScrollPane1 = new javax.swing.JScrollPane();
        Registros = new sistemagestionempresa.vistas.tablaDark();
        jLabel1 = new javax.swing.JLabel();
        tbBusqueda = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        btnBuscar = new sistemagestionempresa.vistas.botones();
        btnInicio = new sistemagestionempresa.vistas.botones();
        btnCerrar = new sistemagestionempresa.vistas.botones();
        btnMinimizar = new sistemagestionempresa.vistas.botones();
        btnClientes = new sistemagestionempresa.vistas.botones();
        btnVentas = new sistemagestionempresa.vistas.botones();
        btnEliminar = new sistemagestionempresa.vistas.botones();
        btnCobrar = new sistemagestionempresa.vistas.botones();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneles1.setBackground(new java.awt.Color(229, 224, 216));

        paneles2.setBackground(new java.awt.Color(128, 150, 113));

        Registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N. Venta", "Fecha", "Cliente", "Realizada por", "Monto"
            }
        ));
        Registros.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Registros);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detalle Alquileres");

        tbBusqueda.setBackground(new java.awt.Color(128, 150, 113));
        tbBusqueda.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        tbBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        tbBusqueda.setBorder(null);
        tbBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbBusquedaKeyPressed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.setBorderColor(new java.awt.Color(255, 255, 255));
        btnBuscar.setColorClick(new java.awt.Color(204, 204, 204));
        btnBuscar.setColorOver(new java.awt.Color(204, 204, 204));
        btnBuscar.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        btnBuscar.setRadio(40);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneles2Layout = new javax.swing.GroupLayout(paneles2);
        paneles2.setLayout(paneles2Layout);
        paneles2Layout.setHorizontalGroup(
            paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbBusqueda)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        paneles2Layout.setVerticalGroup(
            paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnInicio.setBackground(new java.awt.Color(128, 150, 113));
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Inicio");
        btnInicio.setBorderColor(new java.awt.Color(128, 150, 113));
        btnInicio.setColor(new java.awt.Color(128, 150, 113));
        btnInicio.setColorClick(new java.awt.Color(179, 183, 146));
        btnInicio.setColorOver(new java.awt.Color(179, 183, 146));
        btnInicio.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnInicio.setRadio(40);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar.setBorderColor(new java.awt.Color(255, 0, 0));
        btnCerrar.setColor(new java.awt.Color(255, 0, 0));
        btnCerrar.setColorClick(new java.awt.Color(204, 0, 0));
        btnCerrar.setColorOver(new java.awt.Color(204, 0, 0));
        btnCerrar.setRadio(100);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnMinimizar.setBackground(new java.awt.Color(255, 204, 0));
        btnMinimizar.setBorderColor(new java.awt.Color(255, 204, 0));
        btnMinimizar.setColor(new java.awt.Color(255, 204, 0));
        btnMinimizar.setColorClick(new java.awt.Color(255, 153, 0));
        btnMinimizar.setColorOver(new java.awt.Color(255, 153, 0));
        btnMinimizar.setRadio(100);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(128, 150, 113));
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("Clientes");
        btnClientes.setBorderColor(new java.awt.Color(128, 150, 113));
        btnClientes.setColor(new java.awt.Color(128, 150, 113));
        btnClientes.setColorClick(new java.awt.Color(179, 183, 146));
        btnClientes.setColorOver(new java.awt.Color(179, 183, 146));
        btnClientes.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnClientes.setRadio(40);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(128, 150, 113));
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setText("Alquilar");
        btnVentas.setBorderColor(new java.awt.Color(128, 150, 113));
        btnVentas.setColor(new java.awt.Color(128, 150, 113));
        btnVentas.setColorClick(new java.awt.Color(179, 183, 146));
        btnVentas.setColorOver(new java.awt.Color(179, 183, 146));
        btnVentas.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnVentas.setRadio(40);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderColor(new java.awt.Color(255, 0, 0));
        btnEliminar.setColor(new java.awt.Color(255, 0, 0));
        btnEliminar.setColorClick(new java.awt.Color(204, 0, 0));
        btnEliminar.setColorOver(new java.awt.Color(204, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnEliminar.setRadio(40);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCobrar.setBackground(new java.awt.Color(51, 51, 255));
        btnCobrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCobrar.setText("Retornar");
        btnCobrar.setBorderColor(new java.awt.Color(51, 51, 255));
        btnCobrar.setColor(new java.awt.Color(51, 51, 255));
        btnCobrar.setColorClick(new java.awt.Color(0, 0, 255));
        btnCobrar.setColorOver(new java.awt.Color(0, 0, 255));
        btnCobrar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCobrar.setRadio(40);
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneles1Layout = new javax.swing.GroupLayout(paneles1);
        paneles1.setLayout(paneles1Layout);
        paneles1Layout.setHorizontalGroup(
            paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paneles1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paneles1Layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addComponent(paneles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        paneles1Layout.setVerticalGroup(
            paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles1Layout.createSequentialGroup()
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCobrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(paneles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
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

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Menu menu = new Menu();
        menu.show();
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        Cliente cli = new Cliente();
        cli.show();
        this.dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        Facturacion fact = new Facturacion();
        fact.show();
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        Retorno retorno = new Retorno();
        retorno.show();
    }//GEN-LAST:event_btnCobrarActionPerformed

    private void RegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrosMouseClicked
        fila = Registros.rowAtPoint(evt.getPoint());
        codigo = Integer.valueOf(String.valueOf(Registros.getValueAt(fila, 0)));
    }//GEN-LAST:event_RegistrosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        controlador.Eliminar(codigo);
        CargarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbBusquedaKeyPressed
        controlador.buscar(Registros, tbBusqueda.getText());
    }//GEN-LAST:event_tbBusquedaKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        controlador.buscar(Registros, tbBusqueda.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GestionAlquileres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionAlquileres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionAlquileres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionAlquileres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionAlquileres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistemagestionempresa.vistas.tablaDark Registros;
    private sistemagestionempresa.vistas.botones btnBuscar;
    private sistemagestionempresa.vistas.botones btnCerrar;
    private sistemagestionempresa.vistas.botones btnClientes;
    private sistemagestionempresa.vistas.botones btnCobrar;
    private sistemagestionempresa.vistas.botones btnEliminar;
    private sistemagestionempresa.vistas.botones btnInicio;
    private sistemagestionempresa.vistas.botones btnMinimizar;
    private sistemagestionempresa.vistas.botones btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator6;
    private sistemagestionempresa.vistas.paneles paneles1;
    private sistemagestionempresa.vistas.paneles paneles2;
    private javax.swing.JTextField tbBusqueda;
    // End of variables declaration//GEN-END:variables
}
