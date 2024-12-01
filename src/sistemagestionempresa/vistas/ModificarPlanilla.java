/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemagestionempresa.vistas;

import java.awt.Color;
import javax.swing.JOptionPane;
import sistemagestionempresa.Controladores.ControladorPlanillas;
import sistemagestionempresa.Modelos.Entidades.Empleados;
import sistemagestionempresa.Modelos.Entidades.Planillas;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import sistemagestionempresa.Modelos.Entidades.DetallePlanilla;
import sistemagestionempresa.Modelos.Entidades.Usuarios;

/**
 *
 * @author Victor Alejandro
 */
public class ModificarPlanilla extends javax.swing.JFrame {

    int fila;
    Planillas planilla = new Planillas();
    ControladorPlanillas controlador = new ControladorPlanillas();
    private DefaultTableModel modelo;

    public ModificarPlanilla() {
        initComponents();
    }

    public ModificarPlanilla(int codDetalle) {
        this.setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));
        initComponents();
        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        txtFecha.setText(fecha);
        this.setLocationRelativeTo(null);
        this.setTitle("Planilla");
        controlador.Detalle(Registros, codDetalle);
        modelo = (DefaultTableModel) Registros.getModel();
        String codigo = String.valueOf(codDetalle);
        txtCodigo.setText(codigo);
        CargarCombos();
    }

    public void CargarCombos() {
        cbEmpleados.setModel(controlador.llenarEmpleados());
        cbUsuarios.setModel(controlador.llenarUsuarios());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneles1 = new sistemagestionempresa.vistas.paneles();
        jLabel1 = new javax.swing.JLabel();
        paneles2 = new sistemagestionempresa.vistas.paneles();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbEmpleados = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        cbUsuarios = new javax.swing.JComboBox<>();
        paneles3 = new sistemagestionempresa.vistas.paneles();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tbCodigo = new javax.swing.JTextField();
        tbBruto = new javax.swing.JTextField();
        tbBono = new javax.swing.JTextField();
        tbDedu = new javax.swing.JTextField();
        tbNeto = new javax.swing.JTextField();
        btnAgregar = new sistemagestionempresa.vistas.botones();
        btnQuitar = new sistemagestionempresa.vistas.botones();
        botones1 = new sistemagestionempresa.vistas.botones();
        btnModificar = new sistemagestionempresa.vistas.botones();
        jScrollPane1 = new javax.swing.JScrollPane();
        Registros = new sistemagestionempresa.vistas.tablaDark();
        tbCerrar = new sistemagestionempresa.vistas.botones();
        btnGuardar = new sistemagestionempresa.vistas.botones();
        txtCodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneles1.setBackground(new java.awt.Color(246, 246, 246));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setText("Modificar Planilla N. ");

        paneles2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel2.setText("Fecha");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel3.setText("Realizada por");

        cbEmpleados.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        cbEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmpleadosActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel5.setText("Empleado");

        txtFecha.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtFecha.setText("Fecha");

        cbUsuarios.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        cbUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneles2Layout = new javax.swing.GroupLayout(paneles2);
        paneles2.setLayout(paneles2Layout);
        paneles2Layout.setHorizontalGroup(
            paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles2Layout.createSequentialGroup()
                .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2))
                    .addGroup(paneles2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(txtFecha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(36, 36, 36))
        );
        paneles2Layout.setVerticalGroup(
            paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles2Layout.createSequentialGroup()
                        .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paneles2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        paneles3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel8.setText("Salario Bruto");

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel9.setText("Bonificaciones");

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel10.setText("Deducciones");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel11.setText("Saldo Neto");

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel12.setText("Codigo");

        tbCodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        tbBruto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        tbBono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tbBono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbBonoActionPerformed(evt);
            }
        });

        tbDedu.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        tbNeto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        btnAgregar.setBackground(new java.awt.Color(0, 204, 102));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setBorderColor(new java.awt.Color(0, 204, 102));
        btnAgregar.setColor(new java.awt.Color(0, 204, 102));
        btnAgregar.setColorClick(new java.awt.Color(0, 153, 102));
        btnAgregar.setColorOver(new java.awt.Color(0, 153, 102));
        btnAgregar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnAgregar.setRadio(100);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnQuitar.setBackground(new java.awt.Color(255, 0, 0));
        btnQuitar.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitar.setBorderColor(new java.awt.Color(255, 0, 0));
        btnQuitar.setColor(new java.awt.Color(255, 0, 0));
        btnQuitar.setColorClick(new java.awt.Color(255, 0, 0));
        btnQuitar.setColorOver(new java.awt.Color(255, 0, 0));
        btnQuitar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnQuitar.setRadio(100);
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        botones1.setBackground(new java.awt.Color(0, 204, 102));
        botones1.setForeground(new java.awt.Color(255, 255, 255));
        botones1.setText("Calcular");
        botones1.setBorderColor(new java.awt.Color(0, 204, 102));
        botones1.setColor(new java.awt.Color(0, 204, 102));
        botones1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        botones1.setRadio(40);
        botones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botones1ActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 102, 0));
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setBorderColor(new java.awt.Color(255, 102, 0));
        btnModificar.setColor(new java.awt.Color(255, 102, 0));
        btnModificar.setColorClick(new java.awt.Color(255, 102, 0));
        btnModificar.setColorOver(new java.awt.Color(255, 102, 0));
        btnModificar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnModificar.setRadio(100);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneles3Layout = new javax.swing.GroupLayout(paneles3);
        paneles3.setLayout(paneles3Layout);
        paneles3Layout.setHorizontalGroup(
            paneles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(paneles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(paneles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(paneles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbBono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(paneles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbDedu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(paneles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(tbNeto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneles3Layout.createSequentialGroup()
                        .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botones1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        paneles3Layout.setVerticalGroup(
            paneles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(paneles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneles3Layout.createSequentialGroup()
                        .addGroup(paneles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(6, 6, 6)
                        .addGroup(paneles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbBruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbBono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbDedu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbNeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botones1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(paneles3Layout.createSequentialGroup()
                        .addGroup(paneles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Detalle", "N.", "Empleado", "Salario Bruto", "Bonificaciones", "Deducciones", "Salario Neto"
            }
        ));
        Registros.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Registros);

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

        txtCodigo.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        txtCodigo.setText("0");

        javax.swing.GroupLayout paneles1Layout = new javax.swing.GroupLayout(paneles1);
        paneles1.setLayout(paneles1Layout);
        paneles1Layout.setHorizontalGroup(
            paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles1Layout.createSequentialGroup()
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(paneles3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(paneles2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        paneles1Layout.setVerticalGroup(
            paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles1Layout.createSequentialGroup()
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigo)))
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(paneles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneles3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        Guardar();
        Recursos plan = new Recursos();
        plan.show();
        this.dispose();

    }//GEN-LAST:event_btnGuardarActionPerformed

    public void Guardar() {
        Date fechaPlanilla = new Date(txtFecha.getText());
        Usuarios usuario = (Usuarios) cbUsuarios.getSelectedItem();
        int codPlanilla = Integer.parseInt(txtCodigo.getText());
        planilla.setIdPlanilla(codPlanilla);
        planilla.setRealizadapor(usuario.getIdUsuario());
        planilla.setFecha(fechaPlanilla);
        List<DetallePlanilla> lista = new ArrayList<>();
        DefaultTableModel modelo = (DefaultTableModel) Registros.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            DetallePlanilla detalle = new DetallePlanilla();
            detalle.setIdDetalle(Integer.parseInt(modelo.getValueAt(i, 0).toString()));
            detalle.setIdEmpleado(Integer.parseInt(modelo.getValueAt(i, 1).toString()));
            String sueldoBruto = modelo.getValueAt(i, 3).toString();
            String bono = modelo.getValueAt(i, 4).toString();
            String deducciones = modelo.getValueAt(i, 5).toString();
            String neto = modelo.getValueAt(i, 6).toString();
            detalle.setSueldoBruto(new BigDecimal(sueldoBruto));
            detalle.setBonificaciones(new BigDecimal(bono));
            detalle.setDeducciones(new BigDecimal(deducciones));
            detalle.setSueldoNeto(new BigDecimal(neto));
            lista.add(detalle);
        }

        planilla.setDetalle(lista);
        controlador.Modificar(planilla);
    }

    private void cbEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmpleadosActionPerformed
        Empleados empleado = (Empleados) cbEmpleados.getSelectedItem();
        String idEmpleado = String.valueOf(empleado.getIdEmpleado());
        String salario = String.valueOf(empleado.getSalario());
        tbCodigo.setText(idEmpleado);
        tbBruto.setText(salario);
    }//GEN-LAST:event_cbEmpleadosActionPerformed

    private void tbBonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbBonoActionPerformed

    }//GEN-LAST:event_tbBonoActionPerformed

    private void botones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botones1ActionPerformed
        try {
            BigDecimal bonos = new BigDecimal(tbBono.getText().trim());
            BigDecimal deducciones = new BigDecimal(tbDedu.getText().trim());
            BigDecimal salario = new BigDecimal(tbBruto.getText().trim());

            BigDecimal resultado = salario.add(bonos).subtract(deducciones);

            String neto = resultado.toString();
            tbNeto.setText(neto);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: Por favor ingresa un valor numérico válido", "Entrada Inválida", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botones1ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String[] datos = new String[7];

        datos[0] = "0";
        datos[1] = tbCodigo.getText();
        datos[2] = cbEmpleados.getSelectedItem().toString();
        datos[3] = tbBruto.getText();
        datos[4] = tbBono.getText();
        datos[5] = tbDedu.getText();
        datos[6] = tbNeto.getText();

        modelo.addRow(datos);
        Limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cbUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUsuariosActionPerformed
        
    }//GEN-LAST:event_cbUsuariosActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        modelo.removeRow(Registros.getSelectedRow());
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void RegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrosMouseClicked
        fila = Registros.rowAtPoint(evt.getPoint());
        tbCodigo.setText(String.valueOf(Registros.getValueAt(fila, 1)));
        tbCodigo.setEnabled(false);
        tbBruto.setText(String.valueOf(Registros.getValueAt(fila, 3)));
        tbBruto.setEnabled(false);
        tbBono.setText(String.valueOf(Registros.getValueAt(fila, 4)));
        tbDedu.setText(String.valueOf(Registros.getValueAt(fila, 5)));
        cbEmpleados.setEnabled(false);
    }//GEN-LAST:event_RegistrosMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String bono = tbBono.getText();
        String deducciones = tbDedu.getText();
        String sueldoNeto = tbNeto.getText();
        Registros.setValueAt(bono, fila, 4);  
        Registros.setValueAt(deducciones, fila, 5);
        Registros.setValueAt(sueldoNeto, fila, 6);  
        cbEmpleados.setEnabled(true);
        tbCodigo.setEnabled(true);
        tbBruto.setEnabled(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    public void Limpiar() {
        tbCodigo.setText("");
        tbBruto.setText("");
        tbBono.setText("");
        tbDedu.setText("");
        tbNeto.setText("");
        cbEmpleados.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(ModificarPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarPlanilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistemagestionempresa.vistas.tablaDark Registros;
    private sistemagestionempresa.vistas.botones botones1;
    private sistemagestionempresa.vistas.botones btnAgregar;
    private sistemagestionempresa.vistas.botones btnGuardar;
    private sistemagestionempresa.vistas.botones btnModificar;
    private sistemagestionempresa.vistas.botones btnQuitar;
    private javax.swing.JComboBox<String> cbEmpleados;
    private javax.swing.JComboBox<String> cbUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private sistemagestionempresa.vistas.paneles paneles1;
    private sistemagestionempresa.vistas.paneles paneles2;
    private sistemagestionempresa.vistas.paneles paneles3;
    private javax.swing.JTextField tbBono;
    private javax.swing.JTextField tbBruto;
    private sistemagestionempresa.vistas.botones tbCerrar;
    private javax.swing.JTextField tbCodigo;
    private javax.swing.JTextField tbDedu;
    private javax.swing.JTextField tbNeto;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtFecha;
    // End of variables declaration//GEN-END:variables
}
