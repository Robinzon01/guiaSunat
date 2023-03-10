
package robin.com.guisunat;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import robin.com.guisunat.bean.UnidadMedidaBean;
import robin.com.guisunat.controlador.ArticuloCls;
import robin.com.guisunat.controlador.ClienteCls;
import robin.com.guisunat.controlador.InicioCls;
import robin.com.guisunat.controlador.ReporteCls;
import robin.com.guisunat.dao.ArfamcDao;
import robin.com.guisunat.dao.UnidadMedidaDao;
import robin.com.guisunat.entidad.Arfamc;
import robin.com.guisunat.entidad.SerieGuia;
import robin.com.guisunat.modelo.DetalleGuia;
import robin.com.guisunat.modelo.ModalidadTraslado;
import robin.com.guisunat.modelo.MotivoTraslado;
import robin.com.guisunat.modelo.TipoDocumentoCliente;
import robin.com.guisunat.util.Util;

public class Main extends javax.swing.JFrame {
    JList Thelist                = new JList();
    JScrollPane SUBIRYBAJAR      = new JScrollPane();
    DefaultListModel modelolista = new DefaultListModel();
    
    DefaultTableModel dtm;
    
    private InicioCls inicioCls = new InicioCls();
    private Util util = new Util();
    
    private int totalProductos = 0;

   
    public Main() {
        initComponents();
        this.inicioCls.llenarSerieCorreGuia(cbxSerieCorreGuia);
        this.inicioCls.llenarSerieCorreDocuRefe(cbxSerieCorreDocRef);
        this.util.obtenerFechaSistema(txtFechaEmision);
        this.util.obtenerFechaSistema(txtFechaTraslado);
        this.inicioCls.llenarTipoDocumento(cbxTipDocClient);
        cbxTipDocClient.setSelectedIndex(3);
        this.inicioCls.llenarTipoDocumento(cbxTipDocTransportista);
        cbxTipDocTransportista.setSelectedIndex(3);
        this.inicioCls.getDireccionCia(txtDirecCia, txtUbigeoCia);
        txtNroDocuCliente.requestFocus();
        inicioCls.listarMotivoTraslado(cbxMotTraslado);
        inicioCls.listarModalidadTraslado(cbxModalidadTraslado);
        inicioCls.llenarUnidadMedida(cbxUMProducto);
        
        dtm = (DefaultTableModel) jtDetaGuia.getModel();
        
        this.capturarTotalProductos();

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jpPricipal = new javax.swing.JPanel();
        jpCabecera = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        cbxSerieCorreGuia = new javax.swing.JComboBox<>();
        txtFechaEmision = new javax.swing.JFormattedTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxTipDocClient = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNroDocuCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxMotTraslado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbxModalidadTraslado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtFechaTraslado = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCodPuerto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbxTipDocTransportista = new javax.swing.JComboBox<>();
        lblNroTransporte = new javax.swing.JLabel();
        txtNroTransporte = new javax.swing.JTextField();
        lblNombreTransporte = new javax.swing.JLabel();
        txtNombreTransporte = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnSeleccionarCliente = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtPlacaVeiculo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtDirecCia = new javax.swing.JTextField();
        txtDirecCliente = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtUbigeoCia = new javax.swing.JTextField();
        txtUbigeoCliente = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtSerieCorreDocuRefe = new javax.swing.JTextField();
        txtPesoBruto = new javax.swing.JSpinner();
        txtNumeroBultos = new javax.swing.JSpinner();
        txtNumeroContenedor = new javax.swing.JSpinner();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbxSerieCorreDocRef = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        chBoxEditarPuntoLLegada = new javax.swing.JCheckBox();
        jpSegundo = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtDescripProducto = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetaGuia = new javax.swing.JTable();
        txtCantidadProducto = new javax.swing.JSpinner();
        cbxUMProducto = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        btnSeleccionarProducto = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        txtTotalProducto = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txtObservacionGuia = new javax.swing.JTextField();
        jpBotonesGuia = new javax.swing.JPanel();
        btnCrearguia = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jpPricipal.setBackground(new java.awt.Color(255, 255, 255));
        jpPricipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jpCabecera.setBackground(new java.awt.Color(255, 255, 255));
        jpCabecera.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gu??a de Remisi??n Electr??nica" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbxSerieCorreGuia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbxSerieCorreGuia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtFechaEmision.setEditable(false);
        txtFechaEmision.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaEmision.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("SERIE Y CORRELATIVO  :");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setText("FECHA  EMISI??N :");

        javax.swing.GroupLayout jpCabeceraLayout = new javax.swing.GroupLayout(jpCabecera);
        jpCabecera.setLayout(jpCabeceraLayout);
        jpCabeceraLayout.setHorizontalGroup(
            jpCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxSerieCorreGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jpCabeceraLayout.setVerticalGroup(
            jpCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSerieCorreGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("CLIENTE : ");
        jLabel1.setToolTipText("");

        jLabel2.setText("Tipo Documento ");

        jLabel3.setText("Nro. Documento   ");

        txtNroDocuCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNroDocuCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNroDocuCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNroDocuClienteKeyPressed(evt);
            }
        });

        jLabel4.setText("Raz??n Social o Nombre");

        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("DATOS DE TRASLADO :  ");

        jLabel6.setText("Motivo del Traslado    ");

        jLabel7.setText("Modalidad de Traslado   ");

        cbxModalidadTraslado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxModalidadTrasladoItemStateChanged(evt);
            }
        });

        jLabel8.setText("Fecha Inicial de Traslado  ");

        txtFechaTraslado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setText("Peso Bruto (KGM)  ");

        jLabel10.setText("N??mero de Bultos ");

        jLabel11.setText("N??mero de Contenedor  ");

        jLabel12.setText("C??digo de puerto  ");

        txtCodPuerto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("DATOS DEL TRANSPORTE : ");

        jLabel14.setText("Tipo Documento ");

        lblNroTransporte.setText("N?? RUC Empresa Transporte");

        txtNroTransporte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNroTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroTransporteActionPerformed(evt);
            }
        });

        lblNombreTransporte.setText("Raz??n Social ");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("+");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnSeleccionarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSeleccionarCliente.setText("+");
        btnSeleccionarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeleccionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarClienteActionPerformed(evt);
            }
        });
        btnSeleccionarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSeleccionarClienteKeyPressed(evt);
            }
        });

        jLabel17.setText("N?? Placa Veh??culo");

        txtPlacaVeiculo.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("PUNTO DE PARTIDA:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("PUNTO DE LLEGADA:");

        jLabel20.setText("Direcci??n");

        jLabel21.setText("Direcci??n");

        txtDirecCia.setEditable(false);
        txtDirecCia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDirecCia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirecCiaActionPerformed(evt);
            }
        });

        txtDirecCliente.setEditable(false);
        txtDirecCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel22.setText("Ubigeo");

        jLabel23.setText("Ubigeo");

        txtUbigeoCia.setEditable(false);
        txtUbigeoCia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtUbigeoCliente.setEditable(false);
        txtUbigeoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("DOCUMENTO DE REFERENCIA :  ");

        jLabel25.setText("Serie del Correlativo ");

        txtSerieCorreDocuRefe.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 51));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("*");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 0, 51));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("*");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 0, 51));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("*");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 0, 51));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("*");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 0, 51));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("*");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 0, 51));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("*");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 0, 51));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("*");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 0, 51));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("*");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 0, 51));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("*");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 0, 51));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("*");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 0, 51));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("*");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 0, 51));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("*");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 0, 51));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("*");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 0, 51));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("*");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 0, 51));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("*");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 0, 51));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("*");

        jLabel15.setText("Factura ");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("+");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        chBoxEditarPuntoLLegada.setText("Editar");
        chBoxEditarPuntoLLegada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chBoxEditarPuntoLLegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chBoxEditarPuntoLLegadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPricipalLayout = new javax.swing.GroupLayout(jpPricipal);
        jpPricipal.setLayout(jpPricipalLayout);
        jpPricipalLayout.setHorizontalGroup(
            jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPricipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPricipalLayout.createSequentialGroup()
                        .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUbigeoCia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDirecCia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPricipalLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPricipalLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUbigeoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPricipalLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chBoxEditarPuntoLLegada))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPricipalLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPricipalLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDirecCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPricipalLayout.createSequentialGroup()
                        .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPricipalLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(cbxSerieCorreDocRef, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(txtSerieCorreDocuRefe, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPricipalLayout.createSequentialGroup()
                        .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpPricipalLayout.createSequentialGroup()
                                .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxMotTraslado, 0, 183, Short.MAX_VALUE)
                                    .addGroup(jpPricipalLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPesoBruto)
                                    .addGroup(jpPricipalLayout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpPricipalLayout.createSequentialGroup()
                                        .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jpPricipalLayout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jpPricipalLayout.createSequentialGroup()
                                                .addComponent(cbxModalidadTraslado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(86, 86, 86)))
                                        .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jpPricipalLayout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtFechaTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jpPricipalLayout.createSequentialGroup()
                                        .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jpPricipalLayout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtNumeroBultos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNumeroContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11))
                                        .addGap(86, 86, 86)
                                        .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(txtCodPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPricipalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jpCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPricipalLayout.createSequentialGroup()
                                            .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpPricipalLayout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(cbxTipDocClient, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNroDocuCliente)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpPricipalLayout.createSequentialGroup()
                                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(27, 27, 27))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPricipalLayout.createSequentialGroup()
                                                    .addComponent(btnSeleccionarCliente)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                            .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpPricipalLayout.createSequentialGroup()
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtNombreCliente)))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPricipalLayout.createSequentialGroup()
                                            .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpPricipalLayout.createSequentialGroup()
                                                    .addComponent(jLabel14)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(cbxTipDocTransportista, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblNroTransporte)
                                                .addGroup(jpPricipalLayout.createSequentialGroup()
                                                    .addComponent(txtNroTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpPricipalLayout.createSequentialGroup()
                                                    .addComponent(lblNombreTransporte)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtNombreTransporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jpPricipalLayout.createSequentialGroup()
                                                    .addComponent(jLabel17)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(51, 51, 51))))
        );
        jpPricipalLayout.setVerticalGroup(
            jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPricipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipDocClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNroDocuCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxMotTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxModalidadTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesoBruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNumeroBultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpPricipalLayout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblNroTransporte)
                            .addComponent(lblNombreTransporte)
                            .addComponent(jLabel17)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxTipDocTransportista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNroTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(chBoxEditarPuntoLLegada))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel44)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDirecCia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDirecCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUbigeoCia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUbigeoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(txtSerieCorreDocuRefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(cbxSerieCorreDocRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpSegundo.setBackground(new java.awt.Color(255, 255, 255));
        jpSegundo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("PRODUCTO : ");

        jLabel27.setText("C??digo");

        txtCodigoProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel28.setText("Descripci??n  ");

        txtDescripProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescripProductoKeyPressed(evt);
            }
        });

        jLabel29.setText("Cantidad ");

        btnAgregarProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarProducto.setText("+");
        btnAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarProducto.setText("-");
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        jtDetaGuia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM", "C??DIGO", "CANTIDAD", "UNI/MEDIDA", "DESCRIPCI??N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtDetaGuia);
        if (jtDetaGuia.getColumnModel().getColumnCount() > 0) {
            jtDetaGuia.getColumnModel().getColumn(0).setMinWidth(50);
            jtDetaGuia.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtDetaGuia.getColumnModel().getColumn(0).setMaxWidth(50);
            jtDetaGuia.getColumnModel().getColumn(1).setMinWidth(100);
            jtDetaGuia.getColumnModel().getColumn(1).setPreferredWidth(100);
            jtDetaGuia.getColumnModel().getColumn(1).setMaxWidth(100);
            jtDetaGuia.getColumnModel().getColumn(2).setMinWidth(90);
            jtDetaGuia.getColumnModel().getColumn(2).setPreferredWidth(90);
            jtDetaGuia.getColumnModel().getColumn(2).setMaxWidth(90);
            jtDetaGuia.getColumnModel().getColumn(3).setMinWidth(80);
            jtDetaGuia.getColumnModel().getColumn(3).setPreferredWidth(80);
            jtDetaGuia.getColumnModel().getColumn(3).setMaxWidth(80);
            jtDetaGuia.getColumnModel().getColumn(4).setMinWidth(450);
            jtDetaGuia.getColumnModel().getColumn(4).setPreferredWidth(450);
            jtDetaGuia.getColumnModel().getColumn(4).setMaxWidth(450);
        }

        txtCantidadProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadProductoKeyReleased(evt);
            }
        });

        jLabel16.setText("Unidad Medida");

        btnSeleccionarProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSeleccionarProducto.setText("+");
        btnSeleccionarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarProductoActionPerformed(evt);
            }
        });

        jLabel48.setText("Total Item  :");

        txtTotalProducto.setEditable(false);
        txtTotalProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel49.setText("Observacion :");

        jpBotonesGuia.setBackground(new java.awt.Color(255, 255, 255));
        jpBotonesGuia.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCrearguia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCrearguia.setText("GUARDAR GU??A DE REMISI??N");
        btnCrearguia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearguia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearguiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBotonesGuiaLayout = new javax.swing.GroupLayout(jpBotonesGuia);
        jpBotonesGuia.setLayout(jpBotonesGuiaLayout);
        jpBotonesGuiaLayout.setHorizontalGroup(
            jpBotonesGuiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesGuiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrearguia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpBotonesGuiaLayout.setVerticalGroup(
            jpBotonesGuiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesGuiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrearguia)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSegundoLayout = new javax.swing.GroupLayout(jpSegundo);
        jpSegundo.setLayout(jpSegundoLayout);
        jpSegundoLayout.setHorizontalGroup(
            jpSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSegundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSegundoLayout.createSequentialGroup()
                        .addComponent(jpBotonesGuia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jpSegundoLayout.createSequentialGroup()
                        .addGroup(jpSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator7)
                            .addGroup(jpSegundoLayout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(jpSegundoLayout.createSequentialGroup()
                        .addGroup(jpSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpSegundoLayout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSeleccionarProducto))
                            .addComponent(txtDescripProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jpSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxUMProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpSegundoLayout.createSequentialGroup()
                                .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregarProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminarProducto))
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jpSegundoLayout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtObservacionGuia)
                        .addContainerGap())))
            .addGroup(jpSegundoLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpSegundoLayout.setVerticalGroup(
            jpSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSegundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel16)
                    .addComponent(btnSeleccionarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProducto)
                    .addComponent(btnEliminarProducto)
                    .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxUMProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txtTotalProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(txtObservacionGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpBotonesGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPricipal, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpPricipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpSegundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNroTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroTransporteActionPerformed

    private void txtNroDocuClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDocuClienteKeyPressed
        // TODO add your handling code here:
        this.util.solonumero(evt);
        this.util.SinEspcBlanco(evt, txtNroDocuCliente);
        if (txtNroDocuCliente.getText().trim().length() >= 4) {
            ClienteCls clienteCls = new ClienteCls(); //cbxSerieCorreGuia.getItemAt( cbxSerieCorreGuia.getSelectedIndex() ).getSerie()
            String tipoDocumento  = cbxTipDocClient.getItemAt( cbxTipDocClient.getSelectedIndex() ).getCodigo();
            clienteCls.cargarClientes(tipoDocumento, "NO_CLIENTE", txtNroDocuCliente, Thelist, SUBIRYBAJAR, modelolista, jPopupMenu1);
        } else {
            jPopupMenu1.setVisible(false);
            Thelist.removeAll();
            modelolista.removeAllElements();
            txtNroDocuCliente.requestFocus();
        }
    }//GEN-LAST:event_txtNroDocuClienteKeyPressed

    private void txtNombreClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyPressed
        // TODO add your handling code here:
        if (txtNombreCliente.getText().trim().length() >= 4) {
            ClienteCls clienteCls = new ClienteCls();
            String tipoDocumento  = cbxTipDocClient.getItemAt( cbxTipDocClient.getSelectedIndex() ).getCodigo();
            clienteCls.cargarClientes(tipoDocumento, "NOMBRE", txtNombreCliente, Thelist, SUBIRYBAJAR, modelolista, jPopupMenu1);
        } else {
            jPopupMenu1.setVisible(false);
            Thelist.removeAll();
            modelolista.removeAllElements();
            txtNombreCliente.requestFocus();
        }
    }//GEN-LAST:event_txtNombreClienteKeyPressed

    private void btnSeleccionarClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSeleccionarClienteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeleccionarClienteKeyPressed

    private void btnSeleccionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarClienteActionPerformed

        if(Thelist.getSelectedIndex() > -1) {
            String valor = Thelist.getSelectedValue().toString();
            String[] datos = valor.split("-");
            txtNroDocuCliente.setText(datos[0]);
            txtNombreCliente.setText(datos[1]);
            jPopupMenu1.setVisible(false);
            ClienteCls clienteCls = new ClienteCls();
            clienteCls.cargarDirecionCliente(datos[0], txtDirecCliente, txtUbigeoCliente);
        }
    }//GEN-LAST:event_btnSeleccionarClienteActionPerformed

    private void cbxModalidadTrasladoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxModalidadTrasladoItemStateChanged
        // TODO add your handling code here:
        if (cbxModalidadTraslado.getSelectedIndex() > -1 ) {
            String codigo = cbxModalidadTraslado.getItemAt( cbxModalidadTraslado.getSelectedIndex() ).getCodigo();
            txtPlacaVeiculo.setText("");
            switch (codigo) {
                case "01":
                    lblNroTransporte.setText("N?? RUC Empresa Transporte");
                    lblNombreTransporte.setText("Raz??n Social ");                    
                    txtPlacaVeiculo.setEditable(false);
                    cbxTipDocTransportista.setSelectedIndex(3);
                    break;
                case "02":
                    lblNroTransporte.setText("N?? DNI Conductor");
                    lblNombreTransporte.setText("Nombre de Conductor");          
                    txtPlacaVeiculo.setEditable(true);
                    cbxTipDocTransportista.setSelectedIndex(1);
                    break;    
                default:
                    throw new AssertionError();
            }
        }
    }//GEN-LAST:event_cbxModalidadTrasladoItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (cbxSerieCorreDocRef.getSelectedIndex() > -1) {
            String valor = cbxSerieCorreDocRef.getSelectedItem().toString();
            txtSerieCorreDocuRefe.setText(valor);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtDescripProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripProductoKeyPressed
        // TODO add your handling code here:
        if (txtDescripProducto.getText().trim().length() >= 4) {
            ArticuloCls cls = new ArticuloCls();            
            cls.cargarArticulos(txtDescripProducto, Thelist, SUBIRYBAJAR, modelolista, jPopupMenu1);
        } else {
            jPopupMenu1.setVisible(false);
            Thelist.removeAll();
            modelolista.removeAllElements();
            txtDescripProducto.requestFocus();
        }
    }//GEN-LAST:event_txtDescripProductoKeyPressed

    private void btnSeleccionarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarProductoActionPerformed
        // TODO add your handling code here:
        if(Thelist.getSelectedIndex() > -1) {
            String valor = Thelist.getSelectedValue().toString();
            
            String[] datos = valor.split(",");
            txtCodigoProducto.setText(datos[0]);
            txtDescripProducto.setText(datos[2]);
            //cbxTipDocTransportista.setSelectedIndex(3);
            UnidadMedidaDao umDao = new UnidadMedidaDao();
            UnidadMedidaBean umBean = umDao.getUnidadMedida("01", datos[1]);
            cbxUMProducto.setSelectedItem(umBean);
            jPopupMenu1.setVisible(false);
            
        }
    }//GEN-LAST:event_btnSeleccionarProductoActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        // TODO add your handling code here:
        this.agregarProducto();
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void txtCantidadProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadProductoKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.agregarProducto();
        }
    }//GEN-LAST:event_txtCantidadProductoKeyReleased

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "??Est?? seguro de eliminar el producto?", "Confirmaci??n", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            if (jtDetaGuia.getSelectedRow() != -1) {
                dtm.removeRow(jtDetaGuia.getSelectedRow());
                this.capturarTotalProductos();
                this.actualizarItemProducto();
            }
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnCrearguiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearguiaActionPerformed
        // TODO add your handling code here:
        // CLIENTE
        String nroDocuCliente = txtNroDocuCliente.getText();
        String nombreCliente = txtNombreCliente.getText();
        //this.validarDatosCliente(nroDocuCliente, nombreCliente);
        if (nroDocuCliente.trim().length() == 0) {
            txtNroDocuCliente.requestFocus();
            JOptionPane.showMessageDialog(null, "Ingres?? el Nro. Documento del Cliente.");
            return;
        }
        
        if (nombreCliente.trim().length() == 0) {
            txtNombreCliente.requestFocus();
            JOptionPane.showMessageDialog(null, "Ingres?? la Raz??n Social o Nombre del Cliente.");
            return;
        }
        
        //DATOS DE TRASLADO
        String fecInicioTraslado = txtFechaTraslado.getText();
        String pesoBruto = txtPesoBruto.getValue().toString();
        String numeroBultos = txtNumeroBultos.getValue().toString();
        String numeroContenedor = txtNumeroContenedor.getValue().toString();
        String codigoPuerto = txtCodigoProducto.getText();
        //this.validarDatosTraslado(fecInicioTraslado, pesoBruto, numeroBultos);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fecEmision = txtFechaEmision.getText();
        try {
          Date fechaIniTraslado = formato.parse(fecInicioTraslado);
          Date fechaEmision     = formato.parse(fecEmision);          
          int diff = fechaIniTraslado.compareTo(fechaEmision);
          if (diff < 0) {
              txtFechaTraslado.requestFocus();
              JOptionPane.showMessageDialog(null, "La fecha de inicio de traslado no debe ser menor a la fecha de Emisi??n de la Gu??a.");
              return;
          }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Fecha de Traslado no valido.");
            return;
        }
        
        if(Double.parseDouble(pesoBruto) <= 0 ){
            txtPesoBruto.requestFocus();
            JOptionPane.showMessageDialog(null, "El Peso Bruto debe ser mayor a CERO.");
            return;
        }
        
        if(Integer.parseInt(numeroBultos) <= 0 ){
            txtNumeroBultos.requestFocus();
            JOptionPane.showMessageDialog(null, "El Numero de Bulto debe ser mayor a CERO.");
            return;
        }
        
        //DATOS DEL TRANSPORTE
        String nroTransporte = txtNroTransporte.getText();
        String nombreTransporte = txtNombreTransporte.getText();
        String numeroPlaca = txtPlacaVeiculo.getText();
        //this.validarDatosTransporte(nroTransporte, nombreTransporte, numeroPlaca);
        String modalidaTraslado = cbxModalidadTraslado.getItemAt( cbxModalidadTraslado.getSelectedIndex() ).getCodigo();
        switch (modalidaTraslado) {
            case "01":// PUBLICO
                if(nroTransporte.trim().length() == 0) {
                    txtNroTransporte.requestFocus();
                    JOptionPane.showMessageDialog(null, "Ingres?? el Nro. RUC Empresa Transporte.");
                    return;
                }
                if(nombreTransporte.trim().length() == 0) {
                    txtNombreTransporte.requestFocus();
                    JOptionPane.showMessageDialog(null, "Ingres?? la Raz??n Social del Transporte.");
                    return;
                }
                break;
            case "02": // PRIVADO
                if(nroTransporte.trim().length() == 0) {
                    txtNroTransporte.requestFocus();
                    JOptionPane.showMessageDialog(null, "Ingres?? el Nro. DNI Conductor.");
                    return;
                }
                if(nombreTransporte.trim().length() == 0) {
                    txtNombreTransporte.requestFocus();
                    JOptionPane.showMessageDialog(null, "Ingres?? el Nombre del Conductor.");
                    return;
                }
                
                if (numeroPlaca.trim().length() == 0) {
                    txtPlacaVeiculo.requestFocus();
                    JOptionPane.showMessageDialog(null, "Ingres?? el Nro. Placa del Veh??culo.");
                    return;
                }
                break;    
            default:
                throw new AssertionError();
        }
        
        //PUNTO DE LLEGADA
        String direcCliente = txtDirecCliente.getText();
        String ubigeoCliente = txtUbigeoCliente.getText();
        //this.validarPuntoLlegada(direcCliente, ubigeoCliente);
        if (direcCliente.trim().length() == 0) {     
            JOptionPane.showMessageDialog(null, "Ingres?? la direcci??n del Cliente.");
            return;
        }
        
        if (ubigeoCliente.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingres?? el ubigeo del Cliente.");
            return;
        }
        
        if(jtDetaGuia.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Ingres?? un producto para el detalle de la Gu??a.");
            return;
        }
        Boolean veriCeroDetaGuia = false;
        for (int i = 0; i < jtDetaGuia.getRowCount(); i++) {
            int cantidad =  Integer.parseInt(dtm.getValueAt(i, 2).toString());
            if (cantidad <= 0) {
                veriCeroDetaGuia = true;
                String codProducto =  dtm.getValueAt(i, 1).toString();
                JOptionPane.showMessageDialog(null, "El producto con c??digo "+codProducto+" no puede ser menor o igual a cero.");
                break;
            }
        }
        
        if (!veriCeroDetaGuia) {
             this.guardarGuia();
        }
        
    }//GEN-LAST:event_btnCrearguiaActionPerformed

    private void chBoxEditarPuntoLLegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chBoxEditarPuntoLLegadaActionPerformed
        // TODO add your handling code here:
        if (chBoxEditarPuntoLLegada.isSelected()) {
            txtDirecCliente.setEditable(true);
            txtUbigeoCliente.setEditable(true);
        } else {
            txtDirecCliente.setEditable(false);
            txtUbigeoCliente.setEditable(false);
        }
    }//GEN-LAST:event_chBoxEditarPuntoLLegadaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            ReporteCls reporte = new ReporteCls();
            
            ArfamcDao arfamcDao = new ArfamcDao();
            Arfamc arfamc = arfamcDao.getCia("01");
            
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("REPORT_LOCALE", new java.util.Locale("es", "PE"));
            parametros.put("RUC_CIA", arfamc.getNoClienteOnline());
            parametros.put("RAZON_SOCIAL_CIA", arfamc.getNombre());
            parametros.put("DESC1_CIA", arfamc.getDesc1());
            parametros.put("DESC2_CIA", arfamc.getDesc2());
            parametros.put("DESC3_CIA", arfamc.getDesc3());
            
            String serieGuia     = cbxSerieCorreGuia.getItemAt( cbxSerieCorreGuia.getSelectedIndex() ).getSerie();
            Long correlativoGuia = cbxSerieCorreGuia.getItemAt( cbxSerieCorreGuia.getSelectedIndex() ).getConsDesde();
            
            parametros.put("SERIE_CIA", serieGuia);
            parametros.put("CORRELATIVO_CIA", String.valueOf(correlativoGuia));
            parametros.put("FEC_EMSION", txtFechaEmision.getText());
            parametros.put("FEC_TRASLADO", txtFechaTraslado.getText());
            //CLIENTE
            parametros.put("NRO_CLIENTE", txtNroDocuCliente.getText());
            parametros.put("NOMBRE_CLIENTE", txtNombreCliente.getText().toUpperCase());
            //DIRECCION DE PARTIDA
            parametros.put("DIREC_PARTIDA", txtDirecCia.getText().toUpperCase());
            parametros.put("UBIGEO_PARTIDA", txtUbigeoCia.getText().toUpperCase());
            //DIRECCION DE LLEGADA
            parametros.put("DIREC_LLEGADA", txtDirecCliente.getText().toUpperCase());
            parametros.put("UBIGEO_LLEGADA", txtUbigeoCliente.getText().toUpperCase());
            //DATOS DE TRASLADO
            String motivoTraslado = cbxMotTraslado.getItemAt( cbxMotTraslado.getSelectedIndex() ).getNombre();
            parametros.put("MOTIVO_TRASLADO", motivoTraslado.toUpperCase());
            String modalidadTraslado = cbxModalidadTraslado.getItemAt( cbxModalidadTraslado.getSelectedIndex() ).getDescripcion();
            parametros.put("MODALIDAD_TRASLADO", modalidadTraslado.toUpperCase());
            
            String pesoBruto = txtPesoBruto.getValue().toString();
            String numeroBultos = txtNumeroBultos.getValue().toString();
            String numeroContenedor = txtNumeroContenedor.getValue().toString();
            String codigoPuerto = txtCodigoProducto.getText();
            
            parametros.put("NUMERO_BULTO", numeroBultos);
            parametros.put("PESO_BRUTO", pesoBruto);
            parametros.put("CODIGO_PUERTO", codigoPuerto);
            parametros.put("NUMERO_CONTENEDOR", numeroContenedor);
            
            //DATOS DEL TRANSPORTE:
            String tipoNroTrasporte = cbxTipDocTransportista.getItemAt( cbxTipDocTransportista.getSelectedIndex() ).getDescripcion();
            parametros.put("TIPO_DOCU_TRANSPORTE", tipoNroTrasporte.toUpperCase());
            String nroDocuNombreTrans = txtNroTransporte.getText()+"-"+txtNombreTransporte.getText();
            parametros.put("NRO_DOCU_NOM_TRANSPORTE", nroDocuNombreTrans.toUpperCase());
            parametros.put("NRO_PLACA", txtPlacaVeiculo.getText());
            
            Collection<DetalleGuia> detalleGuias = this.listaDetalleGuia();
            
            reporte.llamarGuia("GuiaRemsion", parametros, detalleGuias  );
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtDirecCiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirecCiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirecCiaActionPerformed
    
    private List<DetalleGuia> listaDetalleGuia() {
      List<DetalleGuia> detalleGuias = new ArrayList<>();
      //Collection<DetalleGuia> detalleGuias = new ArrayList<DetalleGuia>();
      for (int i = 0; i < jtDetaGuia.getRowCount(); i++) {
            String item = dtm.getValueAt(i, 0).toString();
            //Long item = Long.valueOf( dtm.getValueAt(i, 1).toString() );
            String codigo = dtm.getValueAt(i, 1).toString();
            String cantidad = dtm.getValueAt(i, 2).toString();
            String um = dtm.getValueAt(i, 3).toString();
            String descripcion = dtm.getValueAt(i, 4).toString();
            
            detalleGuias.add( new DetalleGuia(item,codigo,cantidad,um,descripcion) );
            
      }
      return detalleGuias;
    }
    
    private void guardarGuia(){
        int resp = JOptionPane.showConfirmDialog(null, "??Est?? seguro de Guardar?", "Confirmaci??n", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            
        }
    }
    private void validarDatosCliente(String nroDocuCliente, String nombreCliente) {
        
        if (nroDocuCliente.trim().length() == 0) {
            txtNroDocuCliente.requestFocus();
            JOptionPane.showMessageDialog(null, "Ingres?? el Nro. Documento del Cliente.");
            return;
        }
        
        if (nombreCliente.trim().length() == 0) {
            txtNombreCliente.requestFocus();
            JOptionPane.showMessageDialog(null, "Ingres?? la Raz??n Social o Nombre del Cliente.");
            return;
        }
    }
    
    private void validarDatosTraslado(String fecInicioTraslado, String pesoBruto, String numeroBultos) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fecEmision = txtFechaEmision.getText();
        try {
          Date fechaIniTraslado = formato.parse(fecInicioTraslado);
          Date fechaEmision     = formato.parse(fecEmision);          
          int diff = fechaIniTraslado.compareTo(fechaEmision);
          if (diff < 0) {
              txtFechaTraslado.requestFocus();
              JOptionPane.showMessageDialog(null, "La fecha de inicio de traslado no debe ser menor a la fecha de Emisi??n de la Gu??a.");
              return;
          }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Fecha de Traslado no valido.");
            return;
        }
        
        if(Double.parseDouble(pesoBruto) <= 0 ){
            txtPesoBruto.requestFocus();
            JOptionPane.showMessageDialog(null, "El Peso Bruto debe ser mayor a CERO.");
            return;
        }
        
        if(Integer.parseInt(numeroBultos) <= 0 ){
            txtNumeroBultos.requestFocus();
            JOptionPane.showMessageDialog(null, "El Numero de Bulto debe ser mayor a CERO.");
            return;
        }
        
    }
    
    private void validarDatosTransporte(String nroTransporte, String nombreTransporte, String numeroPlaca){
        String modalidaTraslado = cbxModalidadTraslado.getItemAt( cbxModalidadTraslado.getSelectedIndex() ).getCodigo();
        switch (modalidaTraslado) {
            case "01":// PUBLICO
                if(nroTransporte.trim().length() == 0) {
                    txtNroTransporte.requestFocus();
                    JOptionPane.showMessageDialog(null, "Ingres?? el Nro. RUC Empresa Transporte.");
                    return;
                }
                if(nombreTransporte.trim().length() == 0) {
                    txtNombreTransporte.requestFocus();
                    JOptionPane.showMessageDialog(null, "Ingres?? la Raz??n Social del Transporte.");
                    return;
                }
                break;
            case "02": // PRIVADO
                if(nroTransporte.trim().length() == 0) {
                    txtNroTransporte.requestFocus();
                    JOptionPane.showMessageDialog(null, "Ingres?? el Nro. DNI Conductor.");
                    return;
                }
                if(nombreTransporte.trim().length() == 0) {
                    txtNombreTransporte.requestFocus();
                    JOptionPane.showMessageDialog(null, "Ingres?? el Nombre del Conductor.");
                    return;
                }
                
                if (numeroPlaca.trim().length() == 0) {
                    txtPlacaVeiculo.requestFocus();
                    JOptionPane.showMessageDialog(null, "Ingres?? el Nro. Placa del Veh??culo.");
                    return;
                }
                break;    
            default:
                throw new AssertionError();
        }
    }
    
    private void validarPuntoLlegada(String direcCliente, String ubigeoCliente) {
        
        if (direcCliente.trim().length() == 0) {     
            JOptionPane.showMessageDialog(null, "Ingres?? la direcci??n del Cliente.");
            return;
        }
        
        if (ubigeoCliente.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingres?? el ubigeo del Cliente.");
            return;
        }
    }
    
    private void actualizarItemProducto() {
        for (int i = 0; i < jtDetaGuia.getRowCount(); i++) {
             dtm.setValueAt(String.valueOf(i+1), i, 0);
        }
    }
    
    private void agregarProducto() {
        String codProducto = txtCodigoProducto.getText();
        String nombreProducto = txtDescripProducto.getText();     
        String um = cbxUMProducto.getItemAt( cbxUMProducto.getSelectedIndex() ).getCodSunat();
        String cantidad = txtCantidadProducto.getValue().toString();
        if (codProducto.trim().length() == 0)  {
            JOptionPane.showMessageDialog(null, "Ingres?? el C??digo del Producto");
        } else if (nombreProducto.trim().length() == 0){
            JOptionPane.showMessageDialog(null, "Ingres?? la Descripci??n del Producto");
        } else if ( Double.parseDouble(cantidad) <= 0){
            JOptionPane.showMessageDialog(null, "Ingres?? la Cantidad mayor a Cero del Producto");
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "??Est?? seguro de agregar el producto?", "Confirmaci??n", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                if (this.verificarDuplicadoCodigoProducto(codProducto.trim().toUpperCase())) {
                    Object[] fila = {String.valueOf(jtDetaGuia.getRowCount() + 1 ), codProducto.trim().toUpperCase(), Integer.parseInt(cantidad), um, nombreProducto.trim().toUpperCase() };                
                    dtm.addRow(fila);
                    this.capturarTotalProductos();    
                }
                
            }
        }    
    }
    
    private Boolean verificarDuplicadoCodigoProducto(String codigo) {
        Boolean resultado = true;
        for (int i = 0; i < jtDetaGuia.getRowCount(); i++) {
            String codProducto =  dtm.getValueAt(i, 1).toString();
            if (codProducto.equals(codigo)) {
                resultado = false;
                break;
            }
       }
       return resultado; 
    }
    
    private void capturarTotalProductos() {
      this.totalProductos = jtDetaGuia.getRowCount();
      txtTotalProducto.setText( String.valueOf(totalProductos) );
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnCrearguia;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnSeleccionarCliente;
    private javax.swing.JButton btnSeleccionarProducto;
    private javax.swing.JComboBox<ModalidadTraslado> cbxModalidadTraslado;
    private javax.swing.JComboBox<MotivoTraslado> cbxMotTraslado;
    private javax.swing.JComboBox<SerieGuia> cbxSerieCorreDocRef;
    private javax.swing.JComboBox<SerieGuia> cbxSerieCorreGuia;
    private javax.swing.JComboBox<TipoDocumentoCliente> cbxTipDocClient;
    private javax.swing.JComboBox<TipoDocumentoCliente> cbxTipDocTransportista;
    private javax.swing.JComboBox<UnidadMedidaBean> cbxUMProducto;
    private javax.swing.JCheckBox chBoxEditarPuntoLLegada;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel jpBotonesGuia;
    private javax.swing.JPanel jpCabecera;
    private javax.swing.JPanel jpPricipal;
    private javax.swing.JPanel jpSegundo;
    private javax.swing.JTable jtDetaGuia;
    private javax.swing.JLabel lblNombreTransporte;
    private javax.swing.JLabel lblNroTransporte;
    private javax.swing.JSpinner txtCantidadProducto;
    private javax.swing.JTextField txtCodPuerto;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDescripProducto;
    private javax.swing.JTextField txtDirecCia;
    private javax.swing.JTextField txtDirecCliente;
    private javax.swing.JFormattedTextField txtFechaEmision;
    private javax.swing.JFormattedTextField txtFechaTraslado;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreTransporte;
    private javax.swing.JTextField txtNroDocuCliente;
    private javax.swing.JTextField txtNroTransporte;
    private javax.swing.JSpinner txtNumeroBultos;
    private javax.swing.JSpinner txtNumeroContenedor;
    private javax.swing.JTextField txtObservacionGuia;
    private javax.swing.JSpinner txtPesoBruto;
    private javax.swing.JTextField txtPlacaVeiculo;
    private javax.swing.JTextField txtSerieCorreDocuRefe;
    private javax.swing.JTextField txtTotalProducto;
    private javax.swing.JTextField txtUbigeoCia;
    private javax.swing.JTextField txtUbigeoCliente;
    // End of variables declaration//GEN-END:variables
}
