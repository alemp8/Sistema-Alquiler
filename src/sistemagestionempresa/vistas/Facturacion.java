package sistemagestionempresa.vistas;

import java.awt.Color;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemagestionempresa.Controladores.ControladorAlquileres;
import sistemagestionempresa.Controladores.ControladorPlanillas;
import sistemagestionempresa.Modelos.Entidades.Alquiler;
import sistemagestionempresa.Modelos.Entidades.DetalleAlquiler;
import sistemagestionempresa.Modelos.Entidades.DetallePlanilla;
import sistemagestionempresa.Modelos.Entidades.Productos;
import sistemagestionempresa.Modelos.Entidades.Usuarios;

/**
 *
 * @author Victor Alejandro
 */
public class Facturacion extends javax.swing.JFrame {

    ControladorAlquileres controlador = new ControladorAlquileres();
    Alquiler alquiler = new Alquiler();
    ControladorPlanillas contro = new ControladorPlanillas();
    //DetalleAlquiler detalle = new DetalleAlquiler();
    int codigo = 0;
    int fila;
    private DefaultTableModel modelo;
    int cantProd;

    public Facturacion() {
        this.setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Facturación");
        modelo = (DefaultTableModel) Registros.getModel();
        CargarCombos();
        ImageIcon icono = new ImageIcon(getClass().getResource("seo-tag_12223021.png"));
        this.setIconImage(icono.getImage());
    }

    public void CargarCombos() {
        cbClientes.setModel(controlador.Clientes());
        cbProducto.setModel(controlador.Productos());
        cbUsuarios.setModel(contro.llenarUsuarios());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneles1 = new sistemagestionempresa.vistas.paneles();
        btnAgregar = new sistemagestionempresa.vistas.botones();
        btnCobrar = new sistemagestionempresa.vistas.botones();
        btnInicio = new sistemagestionempresa.vistas.botones();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        paneles2 = new sistemagestionempresa.vistas.paneles();
        jLabel6 = new javax.swing.JLabel();
        tbTotal = new javax.swing.JTextField();
        fecha = new com.toedter.calendar.JDateChooser();
        btnCerrar = new sistemagestionempresa.vistas.botones();
        btnMinimizar = new sistemagestionempresa.vistas.botones();
        cbClientes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tbCodigo = new javax.swing.JTextField();
        tbPrecio = new javax.swing.JTextField();
        tbPrecioArticulo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnQuitar = new sistemagestionempresa.vistas.botones();
        jScrollPane1 = new javax.swing.JScrollPane();
        Registros = new sistemagestionempresa.vistas.tablaDark();
        tbCantidad = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        cbProducto = new javax.swing.JComboBox<>();
        btnLimpiar = new sistemagestionempresa.vistas.botones();
        cbUsuarios = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneles1.setBackground(new java.awt.Color(229, 224, 216));

        btnAgregar.setBackground(new java.awt.Color(0, 153, 102));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("+");
        btnAgregar.setBorderColor(new java.awt.Color(0, 153, 102));
        btnAgregar.setColor(new java.awt.Color(0, 153, 102));
        btnAgregar.setColorClick(new java.awt.Color(0, 102, 102));
        btnAgregar.setColorOver(new java.awt.Color(0, 102, 102));
        btnAgregar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAgregar.setRadio(40);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCobrar.setBackground(new java.awt.Color(51, 51, 255));
        btnCobrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCobrar.setText("Cobrar");
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

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel1.setText("Fecha de Entrega");

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel2.setText("Cliente");

        paneles2.setBackground(new java.awt.Color(104, 157, 89));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total");

        tbTotal.setBackground(new java.awt.Color(104, 157, 89));
        tbTotal.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tbTotal.setForeground(new java.awt.Color(255, 255, 255));
        tbTotal.setText("0.00");
        tbTotal.setBorder(null);
        tbTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneles2Layout = new javax.swing.GroupLayout(paneles2);
        paneles2.setLayout(paneles2Layout);
        paneles2Layout.setHorizontalGroup(
            paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        paneles2Layout.setVerticalGroup(
            paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

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

        cbClientes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel4.setText("Producto");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel5.setText("Codigo");

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel7.setText("Precio Alquiler (Unidad)");

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel8.setText("Precio Articulo");

        tbCodigo.setBackground(new java.awt.Color(229, 224, 216));
        tbCodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tbCodigo.setBorder(null);

        tbPrecio.setBackground(new java.awt.Color(229, 224, 216));
        tbPrecio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tbPrecio.setBorder(null);

        tbPrecioArticulo.setBackground(new java.awt.Color(229, 224, 216));
        tbPrecioArticulo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tbPrecioArticulo.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        btnQuitar.setBackground(new java.awt.Color(255, 0, 0));
        btnQuitar.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitar.setText("-");
        btnQuitar.setBorderColor(new java.awt.Color(255, 0, 0));
        btnQuitar.setColor(new java.awt.Color(255, 0, 0));
        btnQuitar.setColorClick(new java.awt.Color(204, 0, 0));
        btnQuitar.setColorOver(new java.awt.Color(204, 0, 0));
        btnQuitar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnQuitar.setRadio(40);
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        Registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Costo", "Precio", "Cantidad", "Sub Total"
            }
        ));
        Registros.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Registros);

        tbCantidad.setBackground(new java.awt.Color(229, 224, 216));
        tbCantidad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tbCantidad.setBorder(null);

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel11.setText("Cantidad");

        cbProducto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProductoActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 102, 0));
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorderColor(new java.awt.Color(255, 102, 0));
        btnLimpiar.setColor(new java.awt.Color(255, 102, 0));
        btnLimpiar.setColorClick(new java.awt.Color(255, 51, 0));
        btnLimpiar.setColorOver(new java.awt.Color(255, 51, 0));
        btnLimpiar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnLimpiar.setRadio(40);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cbUsuarios.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        cbUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUsuariosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel3.setText("Usuario");

        javax.swing.GroupLayout paneles1Layout = new javax.swing.GroupLayout(paneles1);
        paneles1.setLayout(paneles1Layout);
        paneles1Layout.setHorizontalGroup(
            paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(357, 357, 357)
                        .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addComponent(paneles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tbCantidad)
                                        .addComponent(cbClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(tbCodigo)
                                        .addComponent(tbPrecio)
                                        .addComponent(tbPrecioArticulo)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11))
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cbProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(paneles1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        paneles1Layout.setVerticalGroup(
            paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles1Layout.createSequentialGroup()
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneles1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(paneles1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(cbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbPrecioArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Menu menu = new Menu();
        menu.show();
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void tbTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTotalActionPerformed

    }//GEN-LAST:event_tbTotalActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    private void Limpiar() {
        cbProducto.setSelectedIndex(0);
        tbCodigo.setText("");
        tbPrecioArticulo.setText("");
        tbPrecio.setText("");
        tbCantidad.setText("");
        cantProd = 0;
    }

    private boolean Validacion() {
        if (cbClientes.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente.");
            return false;
        }
        if (cbUsuarios.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un usuario.");
            return false;
        }
        if (tbTotal.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El precio no puede estar vacío.");
            return false;
        }
        if (tbCantidad.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "La cantidad no puede estar vacía.");
            return false;
        }
        try {
            Integer.parseInt(tbCantidad.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser un número válido.");
            return false;
        }
        return true;
    }

    private void cbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProductoActionPerformed
        Productos producto = (Productos) cbProducto.getSelectedItem();
        String codigo = String.valueOf(producto.getIdProducto());
        String costo = String.valueOf(producto.getCosto());
        String precio = String.valueOf(producto.getPrecio());
        tbCodigo.setText(codigo);
        tbPrecioArticulo.setText(costo);
        tbPrecio.setText(precio);
        this.cantProd = producto.getCantidad();
    }//GEN-LAST:event_cbProductoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int cantidad = Integer.parseInt(tbCantidad.getText());
        if (cantidad > cantProd) {
            JOptionPane.showMessageDialog(this, "No hay suficiente en existencia");
        } else {
            String[] datos = new String[6];
            datos[0] = tbCodigo.getText();
            datos[1] = cbProducto.getSelectedItem().toString();
            datos[2] = tbPrecioArticulo.getText();
            datos[3] = tbPrecio.getText();
            datos[4] = tbCantidad.getText();
            String precioStr = String.valueOf(tbPrecio.getText());
            BigDecimal precio = new BigDecimal(precioStr);

            BigDecimal subtotal = precio.multiply(BigDecimal.valueOf(cantidad));
            datos[5] = subtotal.toString();

            modelo.addRow(datos);
            calcularTotal();
            Limpiar();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        if (!Validacion()) {
            JOptionPane.showMessageDialog(this, "Tienes que ingresar todos los datos");
        } else {
            int codigo=0;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaFact = sdf.format(fecha.getDate());
            int idCliente= cbClientes.getSelectedIndex();
            String montoStr = tbTotal.getText();
            BigDecimal monto = new BigDecimal(montoStr);           
            Usuarios usuario = (Usuarios) cbUsuarios.getSelectedItem();
            alquiler.setRealizadopor(usuario.getIdUsuario());
            alquiler.setFecha(fechaFact);
            alquiler.setIdCliente(idCliente);
            alquiler.setIdFactura(codigo);
            alquiler.setMonto(monto);
            List<DetalleAlquiler> lista = new ArrayList<>();
            DefaultTableModel modelo = (DefaultTableModel) Registros.getModel();
            for (int i = 0; i < modelo.getRowCount(); i++) {
                DetalleAlquiler detalle = new DetalleAlquiler();
                detalle.setIdProducto(Integer.parseInt(modelo.getValueAt(i, 0).toString()));
                String costo = modelo.getValueAt(i, 2).toString();
                String precio = modelo.getValueAt(i, 3).toString();
                String subtotal = modelo.getValueAt(i, 5).toString();
                detalle.setCosto(new BigDecimal(costo));
                detalle.setPrecio(new BigDecimal(precio));
                detalle.setCantidad(Integer.parseInt(modelo.getValueAt(i, 4).toString()));
                detalle.setSubtotal(new BigDecimal(subtotal));
                lista.add(detalle);
            }
            alquiler.setDetalle(lista);
            controlador.Guardar(alquiler);
            JOptionPane.showMessageDialog(this, "Registro Exitoso");
            this.dispose();
        }
    }//GEN-LAST:event_btnCobrarActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        modelo.removeRow(fila);
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void RegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrosMouseClicked
        fila = Registros.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_RegistrosMouseClicked

    private void cbUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUsuariosActionPerformed

    public void calcularTotal() {
        BigDecimal total = BigDecimal.ZERO;
        DefaultTableModel modelo = (DefaultTableModel) Registros.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Object valorSubtotal = modelo.getValueAt(i, 5);
            if (valorSubtotal != null) {
                try {
                    BigDecimal subtotal = new BigDecimal(valorSubtotal.toString());
                    total = total.add(subtotal);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error al calcular el total: " + e.getMessage());
                }
            }
        }
        String totalStr = String.valueOf(total);
        tbTotal.setText(totalStr);
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
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistemagestionempresa.vistas.tablaDark Registros;
    private sistemagestionempresa.vistas.botones btnAgregar;
    private sistemagestionempresa.vistas.botones btnCerrar;
    private sistemagestionempresa.vistas.botones btnCobrar;
    private sistemagestionempresa.vistas.botones btnInicio;
    private sistemagestionempresa.vistas.botones btnLimpiar;
    private sistemagestionempresa.vistas.botones btnMinimizar;
    private sistemagestionempresa.vistas.botones btnQuitar;
    private javax.swing.JComboBox<String> cbClientes;
    private javax.swing.JComboBox<String> cbProducto;
    private javax.swing.JComboBox<String> cbUsuarios;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private sistemagestionempresa.vistas.paneles paneles1;
    private sistemagestionempresa.vistas.paneles paneles2;
    private javax.swing.JTextField tbCantidad;
    private javax.swing.JTextField tbCodigo;
    private javax.swing.JTextField tbPrecio;
    private javax.swing.JTextField tbPrecioArticulo;
    private javax.swing.JTextField tbTotal;
    // End of variables declaration//GEN-END:variables
}
