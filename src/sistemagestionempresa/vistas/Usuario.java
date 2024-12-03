package sistemagestionempresa.vistas;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sistemagestionempresa.Controladores.ControladorUsuarios;
import sistemagestionempresa.Modelos.Entidades.Roles;
import sistemagestionempresa.Modelos.Entidades.Usuarios;

/**
 *
 * @author Victor Alejandro
 */
public class Usuario extends javax.swing.JFrame {

    ControladorUsuarios controlador = new ControladorUsuarios();
    Usuarios usuario = new Usuarios();
    int fila;
    int codigo = 0;

    public Usuario() {
        this.setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));
        //this.setContentPane(panel);
        initComponents();
        ImageIcon icono = new ImageIcon(getClass().getResource("seo-tag_12223021.png"));
        this.setIconImage(icono.getImage());
        this.setLocationRelativeTo(null);
        this.setTitle("Usuarios");
        CargarTabla();
        CargarCombos();
    }

    public void CargarCombos() {
        cbTipo.setModel(controlador.CargarCombos());
    }

    public void CargarTabla() {
        controlador.lista(Registros);
    }

    public void Guardar() {
        usuario.setIdUsuario(codigo);
        usuario.setNombre(tbNombre.getText());
        usuario.setApellido(tbApellido.getText());
        usuario.setCorreo(tbCorreo.getText());
        usuario.setTelefono(tbTelefono.getText());
        usuario.setClave(tbClave.getText());
        Roles rol = (Roles) cbTipo.getSelectedItem();
        usuario.setRolUsuario(rol.getIdRol());
        controlador.Guardar(usuario);
    }

    public void Limpiar() {
        tbNombre.setText("");
        tbApellido.setText("");
        tbTelefono.setText("");
        tbCorreo.setText("");
        tbClave.setText("");
        cbTipo.setSelectedIndex(0);
        codigo = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneles1 = new sistemagestionempresa.vistas.paneles();
        paneles2 = new sistemagestionempresa.vistas.paneles();
        jScrollPane2 = new javax.swing.JScrollPane();
        Registros = new sistemagestionempresa.vistas.tablaDark();
        tbBusqueda = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        btnBuscar = new sistemagestionempresa.vistas.botones();
        btnInicio = new sistemagestionempresa.vistas.botones();
        btnMinimizar = new sistemagestionempresa.vistas.botones();
        btnCerrar = new sistemagestionempresa.vistas.botones();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tbApellido = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        tbCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        tbClave = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        tbTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        tbNombre = new javax.swing.JTextField();
        btnEliminar = new sistemagestionempresa.vistas.botones();
        btnGuardar = new sistemagestionempresa.vistas.botones();
        btnRoles = new sistemagestionempresa.vistas.botones();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneles1.setBackground(new java.awt.Color(229, 224, 216));

        paneles2.setBackground(new java.awt.Color(128, 150, 113));

        Registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Correo", "Telefono", "Clave", "Tipo"
            }
        ));
        Registros.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        Registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Registros);

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
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        paneles2Layout.setVerticalGroup(
            paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneles2Layout.createSequentialGroup()
                        .addComponent(tbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
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

        btnMinimizar.setBackground(new java.awt.Color(255, 204, 0));
        btnMinimizar.setBorderColor(new java.awt.Color(255, 204, 0));
        btnMinimizar.setColor(new java.awt.Color(255, 204, 0));
        btnMinimizar.setColorClick(new java.awt.Color(255, 153, 0));
        btnMinimizar.setColorOver(new java.awt.Color(255, 153, 0));
        btnMinimizar.setMaximumSize(new java.awt.Dimension(20, 20));
        btnMinimizar.setMinimumSize(new java.awt.Dimension(20, 20));
        btnMinimizar.setRadio(100);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar.setBorderColor(new java.awt.Color(255, 0, 0));
        btnCerrar.setColor(new java.awt.Color(255, 0, 0));
        btnCerrar.setColorClick(new java.awt.Color(204, 0, 0));
        btnCerrar.setColorOver(new java.awt.Color(204, 0, 0));
        btnCerrar.setMaximumSize(new java.awt.Dimension(20, 20));
        btnCerrar.setMinimumSize(new java.awt.Dimension(20, 20));
        btnCerrar.setRadio(100);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel2.setText("Lista de Usuarios");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        tbApellido.setBackground(new java.awt.Color(229, 224, 216));
        tbApellido.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        tbApellido.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setText("Registro");

        tbCorreo.setBackground(new java.awt.Color(229, 224, 216));
        tbCorreo.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        tbCorreo.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel3.setText("Nombre");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel4.setText("Apellido");

        tbClave.setBackground(new java.awt.Color(229, 224, 216));
        tbClave.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        tbClave.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel5.setText("Correo");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel6.setText("Clave");

        tbTelefono.setBackground(new java.awt.Color(229, 224, 216));
        tbTelefono.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        tbTelefono.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel7.setText("Telefono");

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel8.setText("Tipo de Usuario");

        cbTipo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        tbNombre.setBackground(new java.awt.Color(229, 224, 216));
        tbNombre.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        tbNombre.setBorder(null);

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderColor(new java.awt.Color(255, 0, 0));
        btnEliminar.setColor(new java.awt.Color(255, 0, 0));
        btnEliminar.setColorClick(new java.awt.Color(255, 51, 51));
        btnEliminar.setColorOver(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnEliminar.setRadio(40);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 153, 51));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderColor(new java.awt.Color(0, 153, 51));
        btnGuardar.setColor(new java.awt.Color(0, 153, 51));
        btnGuardar.setColorClick(new java.awt.Color(51, 255, 51));
        btnGuardar.setColorOver(new java.awt.Color(51, 255, 51));
        btnGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnGuardar.setRadio(40);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnRoles.setBackground(new java.awt.Color(128, 150, 113));
        btnRoles.setForeground(new java.awt.Color(255, 255, 255));
        btnRoles.setText("Roles");
        btnRoles.setBorderColor(new java.awt.Color(128, 150, 113));
        btnRoles.setColor(new java.awt.Color(128, 150, 113));
        btnRoles.setColorClick(new java.awt.Color(179, 183, 146));
        btnRoles.setColorOver(new java.awt.Color(179, 183, 146));
        btnRoles.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnRoles.setRadio(40);
        btnRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRolesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneles1Layout = new javax.swing.GroupLayout(paneles1);
        paneles1.setLayout(paneles1Layout);
        paneles1Layout.setHorizontalGroup(
            paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneles1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paneles1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbClave, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35)))
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                        .addComponent(paneles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(247, 247, 247))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        paneles1Layout.setVerticalGroup(
            paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(paneles1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Menu menu = new Menu();
        menu.show();
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRolesActionPerformed
        Rol rol = new Rol();
        rol.show();
    }//GEN-LAST:event_btnRolesActionPerformed

    public boolean Validacion() {
        if (tbNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Nombre no puede estar vacío.");
            return false;
        }
        if (tbApellido.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Apellido no puede estar vacío.");
            return false;
        }
        if (tbCorreo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Correo no puede estar vacío.");
            return false;
        }
        if (tbTelefono.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Teléfono no puede estar vacío.");
            return false;
        }
        if (tbClave.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Clave no puede estar vacío.");
            return false;
        }
        if (cbTipo.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "El tipo de Usuario no puede ser ese.");
            return false;
        }
        return true;
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (Validacion()) {
            Guardar();
            Limpiar();
            CargarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void RegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrosMouseClicked
        fila = Registros.rowAtPoint(evt.getPoint());
        codigo = Integer.valueOf(String.valueOf(Registros.getValueAt(fila, 0)));
        tbNombre.setText(String.valueOf(Registros.getValueAt(fila, 1)));
        tbApellido.setText(String.valueOf(Registros.getValueAt(fila, 2)));
        tbCorreo.setText(String.valueOf(Registros.getValueAt(fila, 3)));
        tbTelefono.setText(String.valueOf(Registros.getValueAt(fila, 4)));
        tbClave.setText(String.valueOf(Registros.getValueAt(fila, 5)));
    }//GEN-LAST:event_RegistrosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        controlador.Eliminar(codigo);
        Limpiar();
        CargarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbBusquedaKeyPressed
       controlador.buscar(Registros, tbBusqueda.getText());
    }//GEN-LAST:event_tbBusquedaKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       controlador.buscar(Registros, tbBusqueda.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistemagestionempresa.vistas.tablaDark Registros;
    private sistemagestionempresa.vistas.botones btnBuscar;
    private sistemagestionempresa.vistas.botones btnCerrar;
    private sistemagestionempresa.vistas.botones btnEliminar;
    private sistemagestionempresa.vistas.botones btnGuardar;
    private sistemagestionempresa.vistas.botones btnInicio;
    private sistemagestionempresa.vistas.botones btnMinimizar;
    private sistemagestionempresa.vistas.botones btnRoles;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private sistemagestionempresa.vistas.paneles paneles1;
    private sistemagestionempresa.vistas.paneles paneles2;
    private javax.swing.JTextField tbApellido;
    private javax.swing.JTextField tbBusqueda;
    private javax.swing.JTextField tbClave;
    private javax.swing.JTextField tbCorreo;
    private javax.swing.JTextField tbNombre;
    private javax.swing.JTextField tbTelefono;
    // End of variables declaration//GEN-END:variables
}
