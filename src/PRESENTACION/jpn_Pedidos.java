
package PRESENTACION;

import DOMINIO.CPedidos;
import DOMINIO.CValidaciones;
import TRANSVERSAL.TPedido;
import java.io.File;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class jpn_Pedidos extends javax.swing.JPanel {

    
    public jpn_Pedidos() {
        initComponents();
        
        // desactivo la edicion en todas las celdas
        tbl_pedidos.setDefaultEditor(Object.class, null);
        
          
        try {
            CPedidos pedidos = new CPedidos();
            pedidos.listarPedidos(tbl_pedidos);
        } catch (SQLException ex) {
            Logger.getLogger(jpn_Pedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Cambio los valores por defecto de mi combo box a estos 
        cmb_tipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "tarjeta",
            "efectivo",
            "domiciliacion_bancaria"
        }));
        
        cmb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "encargado",
            "facturado",
            "anulado"
        }));
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jpn_contenidoPedidos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmb_tipoPago = new javax.swing.JComboBox<>();
        cmb_estado = new javax.swing.JComboBox<>();
        txt_num_factura = new javax.swing.JTextField();
        txt_id_cliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pedidos = new javax.swing.JTable();
        btn_insertar = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        date_fecha_factura = new com.toedter.calendar.JDateChooser();
        date_fecha_venta = new com.toedter.calendar.JDateChooser();
        date_fecha_entrega = new com.toedter.calendar.JDateChooser();
        btn_exit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_id_pedido = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        btn_exportarCSV = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jpn_contenidoPedidos.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Nº factura:");

        jLabel2.setText("Fecha factura:");

        jLabel3.setText("Fecha venta:");

        jLabel4.setText("Id_Cliente:");

        jLabel5.setText("Tipo pago:");

        jLabel6.setText("Fecha entrega:");

        jLabel7.setText("Estado:");

        cmb_tipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_tipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tipoPagoActionPerformed(evt);
            }
        });

        cmb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txt_id_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_id_clienteKeyTyped(evt);
            }
        });

        tbl_pedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_pedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_pedidos);

        btn_insertar.setBackground(new java.awt.Color(0, 153, 204));
        btn_insertar.setText("Añadir");
        btn_insertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarActionPerformed(evt);
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

        jLabel8.setText("Id_Pedido:");

        txt_id_pedido.setEditable(false);

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

        javax.swing.GroupLayout jpn_contenidoPedidosLayout = new javax.swing.GroupLayout(jpn_contenidoPedidos);
        jpn_contenidoPedidos.setLayout(jpn_contenidoPedidosLayout);
        jpn_contenidoPedidosLayout.setHorizontalGroup(
            jpn_contenidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_contenidoPedidosLayout.createSequentialGroup()
                .addGroup(jpn_contenidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_contenidoPedidosLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(jpn_contenidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_insertar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_exportarCSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpn_contenidoPedidosLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jpn_contenidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpn_contenidoPedidosLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(date_fecha_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpn_contenidoPedidosLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txt_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(166, 166, 166)
                        .addGroup(jpn_contenidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jpn_contenidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_estado, 0, 120, Short.MAX_VALUE)
                            .addComponent(txt_id_pedido)))
                    .addGroup(jpn_contenidoPedidosLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jpn_contenidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jpn_contenidoPedidosLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txt_num_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmb_tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpn_contenidoPedidosLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(date_fecha_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date_fecha_entrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jpn_contenidoPedidosLayout.setVerticalGroup(
            jpn_contenidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_contenidoPedidosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpn_contenidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_num_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpn_contenidoPedidosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jpn_contenidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))))
                .addGap(28, 28, 28)
                .addGroup(jpn_contenidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_fecha_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpn_contenidoPedidosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jpn_contenidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(date_fecha_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(jpn_contenidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_contenidoPedidosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addComponent(date_fecha_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpn_contenidoPedidosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(cmb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jpn_contenidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_contenidoPedidosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addGroup(jpn_contenidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txt_id_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jpn_contenidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_contenidoPedidosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btn_limpiar)
                        .addGap(29, 29, 29)
                        .addComponent(btn_insertar)
                        .addGap(27, 27, 27)
                        .addComponent(btn_update)
                        .addGap(29, 29, 29)
                        .addComponent(btn_exportarCSV)
                        .addGap(26, 26, 26)
                        .addComponent(btn_exit))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_contenidoPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_contenidoPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_tipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipoPagoActionPerformed
        
    }//GEN-LAST:event_cmb_tipoPagoActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarActionPerformed
        
        boolean ok = validarCampos();
        
        if (!ok){
            JOptionPane.showMessageDialog(this, "No puede haber campos vacios", "Atencion", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        CValidaciones validar = new CValidaciones();
        
        String factura = txt_num_factura.getText();
        if(validar.yaExisteFactura(factura)){
            return;
        }
        
        int idCliente = Integer.parseInt(txt_id_cliente.getText());
        if(!validar.existeCliente(idCliente)){
            return;
        }
        
        Date fechaFactura = date_fecha_factura.getDate();
        Date fechaVenta = date_fecha_venta.getDate();
        Date fechaEntrega = date_fecha_entrega.getDate();
        if(!validar.fechaOk(fechaFactura, fechaVenta, fechaEntrega )){
            return;
        }
            
        TPedido p = new TPedido();
        
        p.setNum_factura(txt_num_factura.getText());
        p.setFecha_factura(toLocalDate(date_fecha_factura.getDate()));
        p.setFecha_venta(toLocalDate(date_fecha_venta.getDate()));
        p.setId_cliente(Integer.parseInt(txt_id_cliente.getText()));

        String seleccionado = (String) cmb_tipoPago.getSelectedItem();
        p.setTipo_pago((TPedido.TipoPago.valueOf(seleccionado))); // Mis combo box tienen mis enum

        p.setFecha_entrega(toLocalDate(date_fecha_entrega.getDate()));

        String est = (String) cmb_estado.getSelectedItem();
        p.setEstado_pedido((TPedido.EstadoPedido.valueOf(est))); // Mis combo box tienen mis enum

        CPedidos nuevoPedido = new CPedidos();

        try {
            nuevoPedido.añadirPedido(p, tbl_pedidos); // paso mi tabla tmbn para que se vea al añadir el pedido
            limpiarFormulario(); // limpio las casillas de formulario
        } catch (SQLException ex) {
            Logger.getLogger(jpn_Pedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_insertarActionPerformed

    // Evento para que cuando clicke encima de mi tabla se me rellenen automaticamente los campos del formulario
    // y me lleve a detalles ventas
    private void tbl_pedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_pedidosMouseClicked
       CPedidos pedidos = new CPedidos();
       
       pedidos.seleccionarPedido(tbl_pedidos, txt_num_factura , date_fecha_factura , date_fecha_venta , txt_id_cliente , cmb_tipoPago  ,date_fecha_entrega  ,cmb_estado, txt_id_pedido );
       
       // Cuando clicke dos veces en un fila me lleva a detalles ventas
       if (evt.getClickCount() == 2 && tbl_pedidos.getSelectedRow() != -1) {
           
           jpn_DetallesPedidos detalles = new jpn_DetallesPedidos(txt_num_factura.getText() , date_fecha_factura.getDate() , date_fecha_venta.getDate() , txt_id_cliente.getText()
                   , cmb_tipoPago.getSelectedItem().toString()  ,date_fecha_entrega.getDate()  ,cmb_estado.getSelectedItem().toString(), txt_id_pedido.getText()); 

           jpn_contenidoPedidos.removeAll();
           jpn_contenidoPedidos.setLayout(new java.awt.BorderLayout());
           jpn_contenidoPedidos.add(detalles, java.awt.BorderLayout.CENTER);
           jpn_contenidoPedidos.revalidate();
           jpn_contenidoPedidos.repaint();
        }
       
    }//GEN-LAST:event_tbl_pedidosMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
       
        int filaVista = tbl_pedidos.getSelectedRow();
        
        if (filaVista != -1){
            
            CValidaciones validar = new CValidaciones();
            
            Date fechaFactura = date_fecha_factura.getDate();
            Date fechaVenta = date_fecha_venta.getDate();
            Date fechaEntrega = date_fecha_entrega.getDate();
            if(!validar.fechaOk(fechaFactura, fechaVenta, fechaEntrega )){
                return;
            }
            
            int idCliente = Integer.parseInt(txt_id_cliente.getText());
            if(!validar.existeCliente(idCliente)){
                return;
            }
            
            TPedido p = new TPedido();
       
            p.setNum_factura(txt_num_factura.getText());
            p.setFecha_factura(toLocalDate(date_fecha_factura.getDate()));
            p.setFecha_venta(toLocalDate(date_fecha_venta.getDate()));
            p.setId_cliente(Integer.parseInt(txt_id_cliente.getText()));

            String tp = String.valueOf(cmb_tipoPago.getSelectedItem());
            p.setTipo_pago(TPedido.TipoPago.valueOf(tp));

            p.setFecha_entrega(toLocalDate(date_fecha_entrega.getDate()));

            String est = String.valueOf(cmb_estado.getSelectedItem());
            p.setEstado_pedido(TPedido.EstadoPedido.valueOf(est));

            // Necesito el id del pedido para hacer el where
            p.setId_pedido(Integer.parseInt(txt_id_pedido.getText()));

            CPedidos nuevopedido = new CPedidos();
            try{
               nuevopedido.modificarPedido(p, tbl_pedidos); // le paso la tabla tbn para que se muestre actualizada al hacer el update
            }catch(SQLException ex){
                Logger.getLogger(jpn_Pedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una fila", "Atencion", JOptionPane.INFORMATION_MESSAGE);
        }
      
    }//GEN-LAST:event_btn_updateActionPerformed

    private void txt_id_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_id_clienteKeyTyped
        CValidaciones validaciones = new CValidaciones();
        validaciones.soloNumeros(evt);
    }//GEN-LAST:event_txt_id_clienteKeyTyped

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
            
            CPedidos pedidos = new CPedidos();
            pedidos.exportarPedidos(ruta, tbl_pedidos);                    
        }   
    }//GEN-LAST:event_btn_exportarCSVActionPerformed
            
    // Metodo para convertir JDateChooser de mi formulario --> en LocalDate
    private static LocalDate toLocalDate(Date d){
        if(d == null) return null;
        return d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
    
    private boolean validarCampos(){
        if (txt_num_factura.getText().trim().isEmpty()) return false;
        if (date_fecha_factura.getDate() == null) return false;
        if (date_fecha_venta.getDate() == null) return false;
        if (txt_id_cliente.getText().trim().isEmpty()) return false;
        if (cmb_tipoPago.getSelectedItem() == null) return false;
        if (date_fecha_entrega.getDate() == null) return false;
        if (cmb_estado.getSelectedItem() == null) return false;
        
        return true;
        
    }
    
    public void limpiarFormulario(){
        txt_num_factura.setText("");
        date_fecha_factura.setDate(null); // esto me resetea mi fecha
        cmb_tipoPago.setSelectedIndex(-1); // Esto me deja el combo sin eleccion
        cmb_estado.setSelectedIndex(-1);
        date_fecha_venta.setDate(null);
        txt_id_cliente.setText("");
        date_fecha_entrega.setDate(null);
        txt_id_pedido.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_exportarCSV;
    private javax.swing.JButton btn_insertar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cmb_estado;
    private javax.swing.JComboBox<String> cmb_tipoPago;
    private com.toedter.calendar.JDateChooser date_fecha_entrega;
    private com.toedter.calendar.JDateChooser date_fecha_factura;
    private com.toedter.calendar.JDateChooser date_fecha_venta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpn_contenidoPedidos;
    private javax.swing.JTable tbl_pedidos;
    private javax.swing.JTextField txt_id_cliente;
    private javax.swing.JTextField txt_id_pedido;
    private javax.swing.JTextField txt_num_factura;
    // End of variables declaration//GEN-END:variables
}
