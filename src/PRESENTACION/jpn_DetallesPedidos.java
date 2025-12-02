package PRESENTACION;

import DOMINIO.CDetallesPedidos;
import DOMINIO.CValidaciones;
import TRANSVERSAL.TDetallesPedidos;
import java.awt.BorderLayout;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;



public class jpn_DetallesPedidos extends javax.swing.JPanel {

    
    public jpn_DetallesPedidos(
            String numFactura,
            Date fechaFactura,
            Date fechaVenta,
            String idCliente,
            String tipoPago,
            Date fechaEntrega,
            String estado,
            String idPedido) {
        
        initComponents();
        
        // desactivo la edicion en todas las celdas
        tbl_detalles.setDefaultEditor(Object.class, null);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        // Paso todos estos valores para que se vean ya en mi panel de detalles pedidos
        this.factura.setText(numFactura);
        this.fechaFactura.setText(sdf.format(fechaFactura));
        this.fechaVenta.setText(sdf.format(fechaVenta));
        this.idCliente.setText(idCliente);
        this.tipoPago.setText(tipoPago); 
        this.fechaEntrega.setText(sdf.format(fechaEntrega));
        this.estado.setText(estado);
        this.idPedido.setText(idPedido);
        
        jpn_desgloseIVA.setVisible(false); // Oculto el desglose al iniciar
        
        CDetallesPedidos detalles = new CDetallesPedidos();
        try {
            detalles.listarDetallesPedidos(tbl_detalles, this.idPedido.getText());
        } catch (SQLException ex) {
            Logger.getLogger(jpn_DetallesPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cmb_tipoIva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "normal",
            "reducido",
            "super_reducido"
        }));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpn_fondoDetallesPed = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_detalles = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id_producto = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        txt_descuento = new javax.swing.JTextField();
        btn_desglose = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jpn_desgloseIVA = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_total_sin_iva = new javax.swing.JTextField();
        txt_iva_a_pagar = new javax.swing.JTextField();
        txt_total_pagar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_fecha_factura = new javax.swing.JLabel();
        txt_num_factura = new javax.swing.JLabel();
        txt_iva10 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_iva4 = new javax.swing.JTextField();
        txt_iva21 = new javax.swing.JTextField();
        cmb_tipoIva = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        factura = new javax.swing.JTextField();
        idCliente = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        idPedido = new javax.swing.JTextField();
        tipoPago = new javax.swing.JTextField();
        estado = new javax.swing.JTextField();
        fechaEntrega = new javax.swing.JTextField();
        fechaFactura = new javax.swing.JTextField();
        fechaVenta = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        btn_exportarCSV = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(677, 500));

        jpn_fondoDetallesPed.setBackground(new java.awt.Color(153, 153, 153));

        tbl_detalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_detalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_detallesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_detalles);

        jLabel9.setText("Id producto:");

        jLabel11.setText("Cantidad:");

        id_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_productoKeyTyped(evt);
            }
        });

        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });
        txt_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyTyped(evt);
            }
        });

        jLabel1.setText("Precio unitario:");

        jLabel2.setText("IVA :");

        jLabel3.setText("% Descuento:");

        txt_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_precioKeyTyped(evt);
            }
        });

        txt_descuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descuentoKeyTyped(evt);
            }
        });

        btn_desglose.setBackground(new java.awt.Color(0, 153, 204));
        btn_desglose.setText("Desglose IVA");
        btn_desglose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_desglose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desgloseActionPerformed(evt);
            }
        });

        btn_atras.setBackground(new java.awt.Color(0, 153, 204));
        btn_atras.setText("Atras");
        btn_atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(0, 153, 204));
        btn_add.setText("Añadir");
        btn_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(0, 153, 204));
        btn_update.setText("Actualizar");
        btn_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_exit.setBackground(new java.awt.Color(255, 51, 51));
        btn_exit.setText("Salir");
        btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        jpn_desgloseIVA.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Total sin IVA ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("IVA a pagar");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Total a pagar");

        txt_total_sin_iva.setEditable(false);

        txt_iva_a_pagar.setEditable(false);

        txt_total_pagar.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Numero de factura");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PRESENTACION/logoCesur2 (1).png"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Fecha factura");

        txt_fecha_factura.setText("dfgadf");

        txt_num_factura.setText("jLabel22");

        txt_iva10.setEditable(false);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("IVA 21 %");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("IVA 10 %");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("IVA 4 %");

        txt_iva4.setEditable(false);

        txt_iva21.setEditable(false);

        javax.swing.GroupLayout jpn_desgloseIVALayout = new javax.swing.GroupLayout(jpn_desgloseIVA);
        jpn_desgloseIVA.setLayout(jpn_desgloseIVALayout);
        jpn_desgloseIVALayout.setHorizontalGroup(
            jpn_desgloseIVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_desgloseIVALayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpn_desgloseIVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_desgloseIVALayout.createSequentialGroup()
                        .addComponent(txt_fecha_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_desgloseIVALayout.createSequentialGroup()
                        .addGroup(jpn_desgloseIVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpn_desgloseIVALayout.createSequentialGroup()
                                .addGroup(jpn_desgloseIVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpn_desgloseIVALayout.createSequentialGroup()
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_iva10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpn_desgloseIVALayout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_iva_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpn_desgloseIVALayout.createSequentialGroup()
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_iva4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpn_desgloseIVALayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(txt_total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpn_desgloseIVALayout.createSequentialGroup()
                                .addGroup(jpn_desgloseIVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpn_desgloseIVALayout.createSequentialGroup()
                                        .addGroup(jpn_desgloseIVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)
                                        .addGroup(jpn_desgloseIVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_total_sin_iva, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(txt_iva21)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpn_desgloseIVALayout.createSequentialGroup()
                                        .addGroup(jpn_desgloseIVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_num_factura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(17, 17, 17))))
        );
        jpn_desgloseIVALayout.setVerticalGroup(
            jpn_desgloseIVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_desgloseIVALayout.createSequentialGroup()
                .addGroup(jpn_desgloseIVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_desgloseIVALayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_num_factura)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_desgloseIVALayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_fecha_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jpn_desgloseIVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_total_sin_iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpn_desgloseIVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txt_iva21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jpn_desgloseIVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txt_iva10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpn_desgloseIVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txt_iva4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jpn_desgloseIVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_iva_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpn_desgloseIVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        cmb_tipoIva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Pedido:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Detalles de Pedido:");

        jLabel13.setText("Nº Factura:");

        jLabel14.setText("Fecha factura:");

        jLabel15.setText("Fecha venta:");

        jLabel16.setText("Id_cliente:");

        factura.setEditable(false);

        idCliente.setEditable(false);

        jLabel17.setText("Tipo pago:");

        jLabel18.setText("Fecha entrega:");

        jLabel19.setText("Estado:");

        jLabel20.setText("Id_pedido:");

        idPedido.setEditable(false);
        idPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPedidoActionPerformed(evt);
            }
        });

        tipoPago.setEditable(false);

        estado.setEditable(false);

        fechaEntrega.setEditable(false);

        fechaFactura.setEditable(false);

        fechaVenta.setEditable(false);

        btn_limpiar.setBackground(new java.awt.Color(0, 153, 204));
        btn_limpiar.setText("Limpiar campos");
        btn_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_exportarCSV.setBackground(new java.awt.Color(0, 153, 204));
        btn_exportarCSV.setText("Exportar CSV");
        btn_exportarCSV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exportarCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exportarCSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpn_fondoDetallesPedLayout = new javax.swing.GroupLayout(jpn_fondoDetallesPed);
        jpn_fondoDetallesPed.setLayout(jpn_fondoDetallesPedLayout);
        jpn_fondoDetallesPedLayout.setHorizontalGroup(
            jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                        .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(idCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpn_fondoDetallesPedLayout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fechaVenta))
                                    .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(factura))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpn_fondoDetallesPedLayout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fechaFactura)))
                                .addGap(104, 104, 104)
                                .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                            .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_fondoDetallesPedLayout.createSequentialGroup()
                                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(28, 28, 28)))
                                            .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tipoPago)
                                                .addComponent(fechaEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                                        .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addComponent(estado)))
                                    .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(idPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))))
                            .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(id_producto, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(txt_cantidad))
                                .addGap(98, 98, 98)
                                .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(cmb_tipoIva, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_fondoDetallesPedLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(txt_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane2))
                        .addGap(59, 59, 59)
                        .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_desglose, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(btn_atras, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addComponent(jpn_desgloseIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_exportarCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jpn_fondoDetallesPedLayout.setVerticalGroup(
            jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel10)
                .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jpn_desgloseIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_limpiar)
                            .addGap(18, 18, 18)
                            .addComponent(btn_add)
                            .addGap(17, 17, 17)
                            .addComponent(btn_update)
                            .addGap(18, 18, 18)
                            .addComponent(btn_exportarCSV)
                            .addGap(18, 18, 18)
                            .addComponent(btn_exit)
                            .addGap(56, 56, 56))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpn_fondoDetallesPedLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18)
                                        .addComponent(fechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(fechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(17, 17, 17)
                            .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                    .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(fechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16)))
                                .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                    .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19))
                                    .addGap(14, 14, 14)
                                    .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20))))
                            .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(id_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                            .addComponent(btn_desglose)
                                            .addGap(17, 17, 17)
                                            .addComponent(btn_atras))
                                        .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                            .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1))
                                            .addGap(8, 8, 8)
                                            .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cmb_tipoIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jpn_fondoDetallesPedLayout.createSequentialGroup()
                                                    .addGap(7, 7, 7)
                                                    .addComponent(jLabel2)))
                                            .addGap(17, 17, 17)
                                            .addGroup(jpn_fondoDetallesPedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(txt_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGap(29, 29, 29)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_fondoDetallesPed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_fondoDetallesPed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
                
        jpn_Pedidos pedidos = new jpn_Pedidos();
        
        jpn_fondoDetallesPed.removeAll();
        jpn_fondoDetallesPed.setLayout(new java.awt.BorderLayout());
        jpn_fondoDetallesPed.add(pedidos, BorderLayout.CENTER);
        jpn_fondoDetallesPed.revalidate();
        jpn_fondoDetallesPed.repaint();
        
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed
   
    CValidaciones validaciones = new CValidaciones();
    
    private void txt_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyTyped
        validaciones.soloNumeros(evt);
    }//GEN-LAST:event_txt_cantidadKeyTyped

    private void txt_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioKeyTyped
         validaciones.soloNumeros(evt);
    }//GEN-LAST:event_txt_precioKeyTyped

    private void txt_descuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descuentoKeyTyped
         validaciones.soloNumeros(evt);
    }//GEN-LAST:event_txt_descuentoKeyTyped

    private void tbl_detallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_detallesMouseClicked
        
        CDetallesPedidos pedidos = new CDetallesPedidos();
        
        pedidos.seleccionarDetallesPedidos(tbl_detalles, id_producto, txt_cantidad, txt_precio, cmb_tipoIva, txt_descuento );
        
    }//GEN-LAST:event_tbl_detallesMouseClicked
    
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        boolean ok = validarCampos();

       if (!ok){
           JOptionPane.showMessageDialog(this, "No puede haber campos vacíos", "Atención", JOptionPane.INFORMATION_MESSAGE);
           return;
       }
       
       CValidaciones validar = new CValidaciones();
       
       int idProd = Integer.parseInt(id_producto.getText());
       if(!validar.existeProducto(idProd)){
           return;
       }

       TDetallesPedidos detalle = new TDetallesPedidos();

       detalle.setId_pedido(Integer.parseInt(idPedido.getText()));
       detalle.setId_producto(Integer.parseInt(id_producto.getText()));
       detalle.setCantidad(Integer.parseInt(txt_cantidad.getText()));
       detalle.setPrecio_unit(Double.parseDouble(txt_precio.getText()));

       String ivaSeleccionado = (String) cmb_tipoIva.getSelectedItem();
       detalle.setIva(TDetallesPedidos.IVA.valueOf(ivaSeleccionado));

       detalle.setDescuento(Double.parseDouble(txt_descuento.getText()));

       CDetallesPedidos nuevoDetalle = new CDetallesPedidos();

       try {
           nuevoDetalle.anadirDetallePedido(tbl_detalles, detalle);
           limpiarFormulario(); 
       } catch (SQLException ex) {
           Logger.getLogger(jpn_DetallesPedidos.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btn_addActionPerformed

    private void id_productoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_productoKeyTyped
        validaciones.soloNumeros(evt);
    }//GEN-LAST:event_id_productoKeyTyped

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        int filaVista = tbl_detalles.getSelectedRow();

        if (filaVista != -1){
            
            String nombreOriginal = tbl_detalles.getValueAt(filaVista, 0).toString();
            
            CDetallesPedidos detalles = new CDetallesPedidos();

            String idProdOriginalStr = "";
            
            try {
                idProdOriginalStr = detalles.obtenerIdProductoPorNombre(nombreOriginal);
            } catch (SQLException ex) {
                Logger.getLogger(jpn_DetallesPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            int idProdOriginal = Integer.parseInt(idProdOriginalStr.trim());

            // Nuevo id de producto, el que hay en el JTextField
            int idProdNuevo = Integer.parseInt(id_producto.getText().trim());
            
            CValidaciones validar = new CValidaciones();          
            if(!validar.existeProducto(idProdNuevo)){
                return;
            }
            
            TDetallesPedidos d = new TDetallesPedidos();

            d.setId_pedido(Integer.parseInt(idPedido.getText()));
            d.setId_producto(idProdNuevo); // Nuevo id prod
            d.setCantidad(Integer.parseInt(txt_cantidad.getText()));
            d.setPrecio_unit(Double.parseDouble(txt_precio.getText()));

            String ivaSel = String.valueOf(cmb_tipoIva.getSelectedItem());
            d.setIva(TDetallesPedidos.IVA.valueOf(ivaSel));

            d.setDescuento(Double.parseDouble(txt_descuento.getText()));

            try{
                detalles.modificarDetalles(d, idProdOriginal, tbl_detalles);
            }catch(SQLException ex){
                Logger.getLogger(jpn_DetallesPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una fila", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_updateActionPerformed
    
    private void btn_desgloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desgloseActionPerformed
        
        if(tbl_detalles.getRowCount() == 0){
            JOptionPane.showMessageDialog(this, "No hay detalles de pedido", "Atención", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        double baseImponibleTotal = 0.0;
        double iva21Total = 0.0;
        double iva10Total = 0.0;
        double iva4Total = 0.0;
        
        // Recorro todas las filas de mi tabla para obtener el total de los detalles
        for(int fila = 0; fila < tbl_detalles.getRowCount(); fila++){
            
            int cantidad = Integer.parseInt(tbl_detalles.getValueAt(fila, 1).toString());
            double precioUd = Double.parseDouble(tbl_detalles.getValueAt(fila, 2).toString());
            String tipoIva = tbl_detalles.getValueAt(fila, 3).toString();
            
            // El descuento puede ser 0
            double precioDescuentoPorc = 0.0;
            Object descObj = tbl_detalles.getValueAt(fila, 4);
            if (descObj != null) {
                String descStr = descObj.toString().trim();
                if (!descStr.isEmpty()) {
                    precioDescuentoPorc = Double.parseDouble(descStr);
                }    
            }          
            
            double porcIva;
            switch (tipoIva.toLowerCase()) {
                case "normal":          
                    porcIva = 0.21;
                    break;
                case "reducido":        
                    porcIva = 0.10;
                    break;
                case "super_reducido":  
                    porcIva = 0.04;
                    break;
                default:
                    porcIva = 0.0;
            }
            
            // Cálculos 
            double subtotal = cantidad * precioUd; // sin descuento
            double importeDescuento = subtotal * (precioDescuentoPorc / 100.0);
            double baseImponibleLinea = subtotal - importeDescuento; // base sin IVA
            double ivaLinea = baseImponibleLinea * porcIva;
            
            baseImponibleTotal += baseImponibleLinea;

            switch (tipoIva.toLowerCase()) {
                case "normal":          
                    iva21Total += ivaLinea;
                    break;
                case "reducido":        
                    iva10Total += ivaLinea;
                    break;
                case "super_reducido": 
                    iva4Total += ivaLinea;
                    break;
            }
            
        }
        
        // Totales finales
        double ivaTotal = iva21Total + iva10Total + iva4Total;
        double totalFactura = baseImponibleTotal + ivaTotal;      
        
         // Mostramos datos en los campos de la factura
        txt_total_sin_iva.setText(String.format("%.2f", baseImponibleTotal));
        txt_iva21.setText(String.format("%.2f", iva21Total));
        txt_iva10.setText(String.format("%.2f", iva10Total));
        txt_iva4.setText(String.format("%.2f", iva4Total));
        txt_iva_a_pagar.setText(String.format("%.2f", ivaTotal));
        txt_total_pagar.setText(String.format("%.2f", totalFactura));

        txt_num_factura.setText(factura.getText());
        txt_fecha_factura.setText(fechaFactura.getText());
        
        jpn_desgloseIVA.setVisible(true);
        jpn_desgloseIVA.revalidate();
        jpn_desgloseIVA.repaint();
        
    }//GEN-LAST:event_btn_desgloseActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void idPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPedidoActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_exportarCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportarCSVActionPerformed
                                       
        JFileChooser fc = new JFileChooser();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("(*.csv)", "csv");
        
        fc.setFileFilter(filtro);
        
        int seleccion = fc.showSaveDialog(this);
        
        if(seleccion == JFileChooser.APPROVE_OPTION){
            
            File fichero = fc.getSelectedFile();
            String ruta = fichero.getAbsolutePath();
            
            // Aseguro extensión .csv
            if (!ruta.toLowerCase().endsWith(".csv")) {
                ruta += ".csv";
            }
            
            CDetallesPedidos detalles = new CDetallesPedidos();
            detalles.exportarDetalles(ruta, tbl_detalles);                    
        }   
    }//GEN-LAST:event_btn_exportarCSVActionPerformed

    public boolean validarCampos(){
        if (idPedido.getText().trim().isEmpty()) return false;
        if (id_producto.getText().trim().isEmpty()) return false;
        if (txt_cantidad.getText().trim().isEmpty()) return false;
        if (txt_precio.getText().trim().isEmpty()) return false;
        if (cmb_tipoIva.getSelectedItem() == null) return false;
        if (txt_descuento.getText().trim().isEmpty()) return false;

        return true;
    }

    public void limpiarFormulario(){
        id_producto.setText("");
        txt_cantidad.setText("");
        txt_precio.setText("");
        cmb_tipoIva.setSelectedIndex(-1); 
        txt_descuento.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_desglose;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_exportarCSV;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cmb_tipoIva;
    private javax.swing.JTextField estado;
    private javax.swing.JTextField factura;
    private javax.swing.JTextField fechaEntrega;
    private javax.swing.JTextField fechaFactura;
    private javax.swing.JTextField fechaVenta;
    private javax.swing.JTextField idCliente;
    private javax.swing.JTextField idPedido;
    private javax.swing.JTextField id_producto;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpn_desgloseIVA;
    private javax.swing.JPanel jpn_fondoDetallesPed;
    private javax.swing.JTable tbl_detalles;
    private javax.swing.JTextField tipoPago;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_descuento;
    private javax.swing.JLabel txt_fecha_factura;
    private javax.swing.JTextField txt_iva10;
    private javax.swing.JTextField txt_iva21;
    private javax.swing.JTextField txt_iva4;
    private javax.swing.JTextField txt_iva_a_pagar;
    private javax.swing.JLabel txt_num_factura;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_total_pagar;
    private javax.swing.JTextField txt_total_sin_iva;
    // End of variables declaration//GEN-END:variables
}
