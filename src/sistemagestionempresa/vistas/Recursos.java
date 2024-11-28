package sistemagestionempresa.vistas;

import java.awt.Color;

/**
 *
 * @author Victor Alejandro
 */
public class Recursos extends javax.swing.JFrame {

    public Recursos() {
        this.setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Recursos Humanos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneles1 = new sistemagestionempresa.vistas.paneles();
        btnEmpleados = new sistemagestionempresa.vistas.botones();
        btnSucursales = new sistemagestionempresa.vistas.botones();
        btnMinimizar = new sistemagestionempresa.vistas.botones();
        btnCerrar = new sistemagestionempresa.vistas.botones();
        btnInicio = new sistemagestionempresa.vistas.botones();
        btnPuestos = new sistemagestionempresa.vistas.botones();
        btnPuestos1 = new sistemagestionempresa.vistas.botones();
        jLabel1 = new javax.swing.JLabel();
        paneles2 = new sistemagestionempresa.vistas.paneles();
        jScrollPane1 = new javax.swing.JScrollPane();
        Registros = new sistemagestionempresa.vistas.tablaDark();
        jLabel2 = new javax.swing.JLabel();
        tbFiltro = new javax.swing.JTextField();
        btnAgregar1 = new sistemagestionempresa.vistas.botones();
        btnAgregar2 = new sistemagestionempresa.vistas.botones();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneles1.setBackground(new java.awt.Color(229, 224, 216));

        btnEmpleados.setBackground(new java.awt.Color(128, 150, 113));
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setText("Empleados");
        btnEmpleados.setBorderColor(new java.awt.Color(128, 150, 113));
        btnEmpleados.setColor(new java.awt.Color(128, 150, 113));
        btnEmpleados.setColorClick(new java.awt.Color(179, 183, 146));
        btnEmpleados.setColorOver(new java.awt.Color(179, 183, 146));
        btnEmpleados.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnEmpleados.setRadio(40);
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });

        btnSucursales.setBackground(new java.awt.Color(128, 150, 113));
        btnSucursales.setForeground(new java.awt.Color(255, 255, 255));
        btnSucursales.setText("Sucursales");
        btnSucursales.setBorderColor(new java.awt.Color(128, 150, 113));
        btnSucursales.setColor(new java.awt.Color(128, 150, 113));
        btnSucursales.setColorClick(new java.awt.Color(179, 183, 146));
        btnSucursales.setColorOver(new java.awt.Color(179, 183, 146));
        btnSucursales.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnSucursales.setRadio(40);
        btnSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSucursalesActionPerformed(evt);
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

        btnCerrar.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar.setBorderColor(new java.awt.Color(255, 0, 0));
        btnCerrar.setColor(new java.awt.Color(255, 0, 0));
        btnCerrar.setColorClick(new java.awt.Color(153, 0, 0));
        btnCerrar.setColorOver(new java.awt.Color(153, 0, 0));
        btnCerrar.setRadio(100);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

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

        btnPuestos.setBackground(new java.awt.Color(128, 150, 113));
        btnPuestos.setForeground(new java.awt.Color(255, 255, 255));
        btnPuestos.setText("Puestos");
        btnPuestos.setBorderColor(new java.awt.Color(128, 150, 113));
        btnPuestos.setColor(new java.awt.Color(128, 150, 113));
        btnPuestos.setColorClick(new java.awt.Color(179, 183, 146));
        btnPuestos.setColorOver(new java.awt.Color(179, 183, 146));
        btnPuestos.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnPuestos.setRadio(40);
        btnPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuestosActionPerformed(evt);
            }
        });

        btnPuestos1.setBackground(new java.awt.Color(128, 150, 113));
        btnPuestos1.setForeground(new java.awt.Color(255, 255, 255));
        btnPuestos1.setText("Planilla");
        btnPuestos1.setBorderColor(new java.awt.Color(128, 150, 113));
        btnPuestos1.setColor(new java.awt.Color(128, 150, 113));
        btnPuestos1.setColorClick(new java.awt.Color(179, 183, 146));
        btnPuestos1.setColorOver(new java.awt.Color(179, 183, 146));
        btnPuestos1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnPuestos1.setRadio(40);
        btnPuestos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuestos1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setText("Lista de Planillas");

        paneles2.setBackground(new java.awt.Color(128, 150, 113));

        Registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Realizada por", "Mes ", "Empleado", "Horas", "Bonos", "Deducciones", "Total"
            }
        ));
        Registros.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(Registros);
        if (Registros.getColumnModel().getColumnCount() > 0) {
            Registros.getColumnModel().getColumn(3).setHeaderValue("Empleado");
            Registros.getColumnModel().getColumn(4).setHeaderValue("Horas");
            Registros.getColumnModel().getColumn(5).setHeaderValue("Bonos");
            Registros.getColumnModel().getColumn(6).setHeaderValue("Deducciones");
        }

        javax.swing.GroupLayout paneles2Layout = new javax.swing.GroupLayout(paneles2);
        paneles2.setLayout(paneles2Layout);
        paneles2Layout.setHorizontalGroup(
            paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        paneles2Layout.setVerticalGroup(
            paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel2.setText("Filtrar por");

        tbFiltro.setBackground(new java.awt.Color(229, 224, 216));
        tbFiltro.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N

        btnAgregar1.setBackground(new java.awt.Color(255, 0, 0));
        btnAgregar1.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar1.setText("Eliminar");
        btnAgregar1.setBorderColor(new java.awt.Color(255, 0, 0));
        btnAgregar1.setColor(new java.awt.Color(255, 0, 0));
        btnAgregar1.setColorClick(new java.awt.Color(204, 0, 0));
        btnAgregar1.setColorOver(new java.awt.Color(204, 0, 0));
        btnAgregar1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAgregar1.setRadio(40);

        btnAgregar2.setBackground(new java.awt.Color(0, 153, 102));
        btnAgregar2.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar2.setText("Modificar");
        btnAgregar2.setBorderColor(new java.awt.Color(0, 153, 102));
        btnAgregar2.setColor(new java.awt.Color(0, 153, 102));
        btnAgregar2.setColorClick(new java.awt.Color(0, 102, 102));
        btnAgregar2.setColorOver(new java.awt.Color(0, 102, 102));
        btnAgregar2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAgregar2.setRadio(40);

        javax.swing.GroupLayout paneles1Layout = new javax.swing.GroupLayout(paneles1);
        paneles1.setLayout(paneles1Layout);
        paneles1Layout.setHorizontalGroup(
            paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPuestos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paneles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paneles1Layout.createSequentialGroup()
                                .addGap(395, 395, 395)
                                .addComponent(jLabel1)))
                        .addGap(24, 24, 24))))
            .addGroup(paneles1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
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
                            .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPuestos1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(paneles1Layout.createSequentialGroup()
                                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(paneles1Layout.createSequentialGroup()
                                .addComponent(btnAgregar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7)))
                        .addComponent(paneles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        Empleado emp = new Empleado();
        emp.show();
        this.dispose();
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSucursalesActionPerformed
        Sucursal suc = new Sucursal();
        suc.show();
        this.dispose();
    }//GEN-LAST:event_btnSucursalesActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Menu menu = new Menu();
        menu.show();
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuestosActionPerformed
      Puesto puesto = new Puesto();
      puesto.show();
    }//GEN-LAST:event_btnPuestosActionPerformed

    private void btnPuestos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuestos1ActionPerformed
        Planillas plan = new Planillas();
        plan.show();
    }//GEN-LAST:event_btnPuestos1ActionPerformed

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
            java.util.logging.Logger.getLogger(Recursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistemagestionempresa.vistas.tablaDark Registros;
    private sistemagestionempresa.vistas.botones btnAgregar1;
    private sistemagestionempresa.vistas.botones btnAgregar2;
    private sistemagestionempresa.vistas.botones btnCerrar;
    private sistemagestionempresa.vistas.botones btnEmpleados;
    private sistemagestionempresa.vistas.botones btnInicio;
    private sistemagestionempresa.vistas.botones btnMinimizar;
    private sistemagestionempresa.vistas.botones btnPuestos;
    private sistemagestionempresa.vistas.botones btnPuestos1;
    private sistemagestionempresa.vistas.botones btnSucursales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private sistemagestionempresa.vistas.paneles paneles1;
    private sistemagestionempresa.vistas.paneles paneles2;
    private javax.swing.JTextField tbFiltro;
    // End of variables declaration//GEN-END:variables
}
