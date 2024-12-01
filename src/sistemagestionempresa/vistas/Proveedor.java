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
public class Proveedor extends javax.swing.JFrame {
    Conexion cone = new Conexion();
    int codigo;
    int fila;
    
    public Proveedor() {
       this.setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Proveedores");
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
        ps = conn.prepareStatement("SELECT Codigo, RTN, Nombre, Direccion, Correo, Telefono FROM Proveedores");
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Registros = new sistemagestionempresa.vistas.tablaDark();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tbRTN = new javax.swing.JTextField();
        tbNombre = new javax.swing.JTextField();
        tbDireccion = new javax.swing.JTextField();
        tbCorreo = new javax.swing.JTextField();
        tbTelefono = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        tbCerrar = new sistemagestionempresa.vistas.botones();
        tbMinimizar = new sistemagestionempresa.vistas.botones();
        btnEliminar = new sistemagestionempresa.vistas.botones();
        btnGuardar = new sistemagestionempresa.vistas.botones();
        btnInicio = new sistemagestionempresa.vistas.botones();
        btnInventario = new sistemagestionempresa.vistas.botones();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneles1.setBackground(new java.awt.Color(229, 224, 216));
        paneles1.setForeground(new java.awt.Color(204, 255, 204));

        paneles2.setBackground(new java.awt.Color(128, 150, 113));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Proveedores");

        Registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "RTN", "Nombre", "Direccion", "Correo", "Telefono"
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
                .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles2Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1))
                    .addGroup(paneles2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        paneles2Layout.setVerticalGroup(
            paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setText("RTN");

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setText("Direccion");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel5.setText("Correo");

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setText("Telefono");

        tbRTN.setBackground(new java.awt.Color(229, 224, 216));
        tbRTN.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tbRTN.setBorder(null);

        tbNombre.setBackground(new java.awt.Color(229, 224, 216));
        tbNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tbNombre.setBorder(null);

        tbDireccion.setBackground(new java.awt.Color(229, 224, 216));
        tbDireccion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tbDireccion.setBorder(null);

        tbCorreo.setBackground(new java.awt.Color(229, 224, 216));
        tbCorreo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tbCorreo.setBorder(null);

        tbTelefono.setBackground(new java.awt.Color(229, 224, 216));
        tbTelefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tbTelefono.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel7.setText("Registro");

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

        tbMinimizar.setBackground(new java.awt.Color(255, 204, 0));
        tbMinimizar.setBorderColor(new java.awt.Color(255, 204, 0));
        tbMinimizar.setColor(new java.awt.Color(255, 204, 0));
        tbMinimizar.setColorClick(new java.awt.Color(255, 153, 0));
        tbMinimizar.setColorOver(new java.awt.Color(255, 153, 0));
        tbMinimizar.setRadio(100);
        tbMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbMinimizarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout paneles1Layout = new javax.swing.GroupLayout(paneles1);
        paneles1.setLayout(paneles1Layout);
        paneles1Layout.setHorizontalGroup(
            paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel7))
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(paneles1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(222, 222, 222))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbRTN, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(tbNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(tbDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(tbCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(tbTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(paneles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                .addGap(397, 397, 397)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        paneles1Layout.setVerticalGroup(
            paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))))
                .addGap(34, 34, 34)
                .addComponent(paneles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(paneles1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbRTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
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

    private void tbMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbMinimizarActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_tbMinimizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    if (!Validar()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese todos los datos requeridos.");
    } else {
        Guardar(); 
        Limpiar();
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void Limpiar(){
    tbRTN.setText("");
    tbNombre.setText("");
    tbDireccion.setText("");
    tbCorreo.setText("");
    tbTelefono.setText("");
    }
    
    private void RegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrosMouseClicked
       fila = Registros.rowAtPoint(evt.getPoint());
       codigo = Integer.valueOf(String.valueOf(Registros.getValueAt(fila, 0)));
       tbRTN.setText(String.valueOf(Registros.getValueAt(fila, 1)));
       tbNombre.setText(String.valueOf(Registros.getValueAt(fila, 2)));
       tbDireccion.setText(String.valueOf(Registros.getValueAt(fila, 3)));
       tbCorreo.setText(String.valueOf(Registros.getValueAt(fila, 4)));
       tbTelefono.setText(String.valueOf(Registros.getValueAt(fila, 5)));
    }//GEN-LAST:event_RegistrosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         try{
            Connection conn = cone.obtenerConexion();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Proveedores WHERE Codigo = ?");
            ps.setInt(1,codigo);
            ps.executeUpdate();
            
            Limpiar();
            CargarTabla();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }   
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Menu menu = new Menu();
        menu.show();
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        Inventario inventario = new Inventario();
        inventario.show();
        this.dispose();
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void Guardar(){
        String RTN = tbRTN.getText();
        String nombre = tbNombre.getText();
        String direccion = tbDireccion.getText();
        String correo = tbCorreo.getText();
        String telefono = tbTelefono.getText();
        
        try{
            Connection conn = cone.obtenerConexion();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO Proveedores(RTN, Nombre, Direccion, Correo, Telefono) Values (?,?,?,?,?)");
            ps.setString(1,RTN);
            ps.setString(2,nombre);
            ps.setString(3,direccion);
            ps.setString(4,correo);
            ps.setString(5,telefono);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            CargarTabla();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }   
    }
    
    private boolean Validar() {
    if (tbNombre.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "El campo Nombre es obligatorio.");
        return false;
    } 
    if (tbRTN.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "El campo RTN es obligatorio.");
        return false;
    }
    if (tbNombre.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "El campo RTN es obligatorio.");
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
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistemagestionempresa.vistas.tablaDark Registros;
    private sistemagestionempresa.vistas.botones btnEliminar;
    private sistemagestionempresa.vistas.botones btnGuardar;
    private sistemagestionempresa.vistas.botones btnInicio;
    private sistemagestionempresa.vistas.botones btnInventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private sistemagestionempresa.vistas.paneles paneles1;
    private sistemagestionempresa.vistas.paneles paneles2;
    private sistemagestionempresa.vistas.botones tbCerrar;
    private javax.swing.JTextField tbCorreo;
    private javax.swing.JTextField tbDireccion;
    private sistemagestionempresa.vistas.botones tbMinimizar;
    private javax.swing.JTextField tbNombre;
    private javax.swing.JTextField tbRTN;
    private javax.swing.JTextField tbTelefono;
    // End of variables declaration//GEN-END:variables
}
