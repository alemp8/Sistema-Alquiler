/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemagestionempresa.vistas;

import java.awt.Color;
import sistemagestionempresa.Modelos.Entidades.Usuarios;

/**
 *
 * @author Victor Alejandro
 */
public class Menu extends javax.swing.JFrame {

    paneles panel = new paneles();
    public Menu() {
        this.setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));
        this.setContentPane(panel);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Inicio de Sesion");
    }
    
    public Menu(Usuarios usuario){
        this.setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));
        this.setContentPane(panel);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Inicio de Sesion");
        txtUsuario.setText(usuario.getNombre());
        if(usuario.getRolUsuario()!=1){
        btnUsuario.setEnabled(false);
        btnReportes.setEnabled(false);
        btnRecursos.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneles1 = new sistemagestionempresa.vistas.paneles();
        btnCerrar = new sistemagestionempresa.vistas.botones();
        btnMinimizar = new sistemagestionempresa.vistas.botones();
        paneles2 = new sistemagestionempresa.vistas.paneles();
        btnUsuario = new sistemagestionempresa.vistas.botones();
        btnInventario = new sistemagestionempresa.vistas.botones();
        btnRecursos = new sistemagestionempresa.vistas.botones();
        btnFacturacion = new sistemagestionempresa.vistas.botones();
        btnReportes = new sistemagestionempresa.vistas.botones();
        paneles7 = new sistemagestionempresa.vistas.paneles();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        labelImagen = new javax.swing.JLabel();
        paneles4 = new sistemagestionempresa.vistas.paneles();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        paneles5 = new sistemagestionempresa.vistas.paneles();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        paneles6 = new sistemagestionempresa.vistas.paneles();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneles1.setBackground(new java.awt.Color(229, 224, 216));

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

        paneles2.setBackground(new java.awt.Color(128, 150, 113));

        btnUsuario.setBackground(new java.awt.Color(128, 150, 113));
        btnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuario.setText("Usuarios");
        btnUsuario.setBorderColor(new java.awt.Color(128, 150, 113));
        btnUsuario.setColor(new java.awt.Color(128, 150, 113));
        btnUsuario.setColorClick(new java.awt.Color(179, 183, 146));
        btnUsuario.setColorOver(new java.awt.Color(179, 183, 146));
        btnUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnUsuario.setRadio(40);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnInventario.setBackground(new java.awt.Color(128, 150, 113));
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setText("Inventario");
        btnInventario.setBorderColor(new java.awt.Color(128, 150, 113));
        btnInventario.setColor(new java.awt.Color(128, 150, 113));
        btnInventario.setColorClick(new java.awt.Color(179, 183, 146));
        btnInventario.setColorOver(new java.awt.Color(179, 183, 146));
        btnInventario.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnInventario.setRadio(40);
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        btnRecursos.setBackground(new java.awt.Color(128, 150, 113));
        btnRecursos.setForeground(new java.awt.Color(255, 255, 255));
        btnRecursos.setText("Recursos  Humanos");
        btnRecursos.setBorderColor(new java.awt.Color(128, 150, 113));
        btnRecursos.setColor(new java.awt.Color(128, 150, 113));
        btnRecursos.setColorClick(new java.awt.Color(179, 183, 146));
        btnRecursos.setColorOver(new java.awt.Color(179, 183, 146));
        btnRecursos.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnRecursos.setRadio(40);
        btnRecursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecursosActionPerformed(evt);
            }
        });

        btnFacturacion.setBackground(new java.awt.Color(128, 150, 113));
        btnFacturacion.setForeground(new java.awt.Color(255, 255, 255));
        btnFacturacion.setText("Alquileres");
        btnFacturacion.setBorderColor(new java.awt.Color(128, 150, 113));
        btnFacturacion.setColor(new java.awt.Color(128, 150, 113));
        btnFacturacion.setColorClick(new java.awt.Color(179, 183, 146));
        btnFacturacion.setColorOver(new java.awt.Color(179, 183, 146));
        btnFacturacion.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnFacturacion.setRadio(40);
        btnFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturacionActionPerformed(evt);
            }
        });

        btnReportes.setBackground(new java.awt.Color(128, 150, 113));
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("Reportes");
        btnReportes.setBorderColor(new java.awt.Color(128, 150, 113));
        btnReportes.setColor(new java.awt.Color(128, 150, 113));
        btnReportes.setColorClick(new java.awt.Color(179, 183, 146));
        btnReportes.setColorOver(new java.awt.Color(179, 183, 146));
        btnReportes.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnReportes.setRadio(40);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneles2Layout = new javax.swing.GroupLayout(paneles2);
        paneles2.setLayout(paneles2Layout);
        paneles2Layout.setHorizontalGroup(
            paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneles2Layout.setVerticalGroup(
            paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        paneles7.setBackground(new java.awt.Color(165, 188, 155));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 40)); // NOI18N
        jLabel1.setText("¡Bienvenido!");

        txtUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 30)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Usuario");

        labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemagestionempresa/vistas/MenuImagen1.png"))); // NOI18N

        javax.swing.GroupLayout paneles7Layout = new javax.swing.GroupLayout(paneles7);
        paneles7.setLayout(paneles7Layout);
        paneles7Layout.setHorizontalGroup(
            paneles7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles7Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(paneles7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles7Layout.createSequentialGroup()
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(paneles7Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(113, 113, 113)))
                .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(341, 341, 341))
        );
        paneles7Layout.setVerticalGroup(
            paneles7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles7Layout.createSequentialGroup()
                .addGroup(paneles7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles7Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsuario))
                    .addGroup(paneles7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        paneles4.setBackground(new java.awt.Color(128, 150, 113));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestiona el Inventario");

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 100)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemagestionempresa/vistas/inventory-management_16813479.png"))); // NOI18N

        javax.swing.GroupLayout paneles4Layout = new javax.swing.GroupLayout(paneles4);
        paneles4.setLayout(paneles4Layout);
        paneles4Layout.setHorizontalGroup(
            paneles4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles4Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(paneles4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(86, 86, 86))))
        );
        paneles4Layout.setVerticalGroup(
            paneles4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(22, 22, 22))
        );

        paneles5.setBackground(new java.awt.Color(128, 150, 113));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gestiona tu Planilla");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 100)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemagestionempresa/vistas/MenuImagen2.png"))); // NOI18N

        javax.swing.GroupLayout paneles5Layout = new javax.swing.GroupLayout(paneles5);
        paneles5.setLayout(paneles5Layout);
        paneles5Layout.setHorizontalGroup(
            paneles5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles5Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        paneles5Layout.setVerticalGroup(
            paneles5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
        );

        paneles6.setBackground(new java.awt.Color(128, 150, 113));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 100)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemagestionempresa/vistas/MenuImagen3.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gestiona tus Alquileres");

        javax.swing.GroupLayout paneles6Layout = new javax.swing.GroupLayout(paneles6);
        paneles6.setLayout(paneles6Layout);
        paneles6Layout.setHorizontalGroup(
            paneles6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles6Layout.createSequentialGroup()
                .addGroup(paneles6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles6Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel7))
                    .addGroup(paneles6Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        paneles6Layout.setVerticalGroup(
            paneles6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout paneles1Layout = new javax.swing.GroupLayout(paneles1);
        paneles1.setLayout(paneles1Layout);
        paneles1Layout.setHorizontalGroup(
            paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles1Layout.createSequentialGroup()
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(paneles7, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paneles1Layout.createSequentialGroup()
                                .addComponent(paneles4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paneles5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paneles6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(paneles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(16, 16, 16)
                        .addComponent(paneles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneles7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paneles5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneles4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneles6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneles1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneles1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        Inventario inventario = new Inventario();
        inventario.show();
        this.dispose();
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
       Usuario user = new Usuario();
       user.show();
       this.dispose();
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnRecursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecursosActionPerformed
      Recursos plan = new Recursos();
      plan.show();
      this.dispose();
    }//GEN-LAST:event_btnRecursosActionPerformed

    private void btnFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturacionActionPerformed
       GestionAlquileres fact = new GestionAlquileres();
       fact.show();
       this.dispose();
    }//GEN-LAST:event_btnFacturacionActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
       Reportes rep = new Reportes();
       rep.show();
       this.dispose();
    }//GEN-LAST:event_btnReportesActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistemagestionempresa.vistas.botones btnCerrar;
    private sistemagestionempresa.vistas.botones btnFacturacion;
    private sistemagestionempresa.vistas.botones btnInventario;
    private sistemagestionempresa.vistas.botones btnMinimizar;
    private sistemagestionempresa.vistas.botones btnRecursos;
    private sistemagestionempresa.vistas.botones btnReportes;
    private sistemagestionempresa.vistas.botones btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelImagen;
    private sistemagestionempresa.vistas.paneles paneles1;
    private sistemagestionempresa.vistas.paneles paneles2;
    private sistemagestionempresa.vistas.paneles paneles4;
    private sistemagestionempresa.vistas.paneles paneles5;
    private sistemagestionempresa.vistas.paneles paneles6;
    private sistemagestionempresa.vistas.paneles paneles7;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
