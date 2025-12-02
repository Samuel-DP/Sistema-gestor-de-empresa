
package PRESENTACION;

import DOMINIO.CProductos;
import DOMINIO.CValidaciones;
import TRANSVERSAL.TProducto;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class jpn_Productos extends javax.swing.JPanel {
    
    public jpn_Productos() {
        initComponents();
        
        // desactivo la edicion en todas las celdas
        tbl_productos.setDefaultEditor(Object.class, null);
        
        CProductos prod = new CProductos();
        try {
            prod.listarProductos(tbl_productos);
        } catch (SQLException ex) {
            Logger.getLogger(jpn_Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_productos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        txt_marca = new javax.swing.JTextField();
        txt_ud_venta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_cod_barras = new javax.swing.JTextField();
        btn_añadir = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_sku = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        chbox_activo = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        txt_stock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_stock_max = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_stock_min = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_id_producto = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        btn_exportarCSV = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Unidad de venta:");

        jLabel3.setText("Marca:");

        tbl_productos.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_productosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_productos);

        jLabel4.setText("Descripcion:");

        jLabel5.setText("Codigo barras:");

        txt_cod_barras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cod_barrasKeyTyped(evt);
            }
        });

        btn_añadir.setBackground(new java.awt.Color(0, 153, 204));
        btn_añadir.setText("Añadir");
        btn_añadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirActionPerformed(evt);
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

        jLabel6.setText("SKU:");

        jLabel7.setText("Activo:");

        jLabel8.setText("Stock:");

        txt_stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_stockKeyTyped(evt);
            }
        });

        jLabel9.setText("Stock maximo:");

        txt_stock_max.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_stock_maxKeyTyped(evt);
            }
        });

        jLabel10.setText("Stock minimo:");

        txt_stock_min.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_stock_minKeyTyped(evt);
            }
        });

        jLabel11.setText("Id_producto:");

        txt_id_producto.setEditable(false);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(txt_ud_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txt_cod_barras, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(chbox_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_añadir, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_exportarCSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txt_sku, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txt_stock_max, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(txt_stock_min, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_stock, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(txt_id_producto)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_ud_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_cod_barras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(chbox_activo))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_sku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txt_stock_max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_stock_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txt_id_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btn_limpiar)
                        .addGap(27, 27, 27)
                        .addComponent(btn_añadir)
                        .addGap(27, 27, 27)
                        .addComponent(btn_update)
                        .addGap(30, 30, 30)
                        .addComponent(btn_exportarCSV)
                        .addGap(27, 27, 27)
                        .addComponent(btn_exit))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirActionPerformed
        
         boolean ok = validarCampos();

        if(!ok){
            JOptionPane.showMessageDialog(this, "No puede haber campos vacíos", "Atención", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        CValidaciones validar = new CValidaciones();
        
        String sku = txt_sku.getText().trim();
        if(validar.SkuUnico(sku)){
            return;
        }
        
        String codigoBarras = txt_cod_barras.getText().trim();
        if(validar.codigoBarrasUnico(codigoBarras)){
            return;
        }
        
        int stock = Integer.parseInt(txt_stock.getText());
        int stockMax = Integer.parseInt(txt_stock_max.getText());
        int stockMin = Integer.parseInt(txt_stock_min.getText());
        if(!validar.validarStock(stock, stockMax, stockMin)){
            return;
        }

        TProducto prod = new TProducto();

        prod.setNombre(txt_nombre.getText());
        prod.setDescripcion(txt_descripcion.getText());
        prod.setMarca(txt_marca.getText());
        prod.setUd_venta(txt_ud_venta.getText());
        prod.setCodigo_barras(txt_cod_barras.getText());
        prod.setSku(txt_sku.getText());
        prod.setEstado(chbox_activo.isSelected()); // checkbox = boolean
        prod.setStock(Integer.parseInt(txt_stock.getText()));
        prod.setStock_max(Integer.parseInt(txt_stock_max.getText()));
        prod.setStock_min(Integer.parseInt(txt_stock_min.getText()));
        CProductos nuevoProducto = new CProductos();

        try {
            nuevoProducto.añadirProductos(prod, tbl_productos); // refresco la tabla al añadir
            limpiarFormulario(); 
        } catch (SQLException ex) {
            Logger.getLogger(jpn_Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_btn_añadirActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void tbl_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_productosMouseClicked
        CProductos productos = new CProductos();
        
        productos.seleccionarProductos(tbl_productos, txt_id_producto, txt_nombre, txt_descripcion, txt_ud_venta, txt_cod_barras, chbox_activo, txt_marca, txt_sku, txt_stock, txt_stock_max, txt_stock_min );
    }//GEN-LAST:event_tbl_productosMouseClicked
    
    CValidaciones validaciones = new CValidaciones();
    
    // Eventos que me dejan solo escribir numeros en el formulario
    private void txt_stockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stockKeyTyped
        validaciones.soloNumeros(evt);
    }//GEN-LAST:event_txt_stockKeyTyped

    private void txt_stock_maxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stock_maxKeyTyped
        validaciones.soloNumeros(evt);
    }//GEN-LAST:event_txt_stock_maxKeyTyped

    private void txt_stock_minKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stock_minKeyTyped
        validaciones.soloNumeros(evt);
    }//GEN-LAST:event_txt_stock_minKeyTyped

    private void txt_cod_barrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod_barrasKeyTyped
        validaciones.soloNumeros(evt);
    }//GEN-LAST:event_txt_cod_barrasKeyTyped

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        int filaVista = tbl_productos.getSelectedRow();

        if (filaVista != -1){
            
            CValidaciones validar = new CValidaciones();
            int stock = Integer.parseInt(txt_stock.getText());
            int stockMax = Integer.parseInt(txt_stock_max.getText());
            int stockMin = Integer.parseInt(txt_stock_min.getText());
            if(!validar.validarStock(stock, stockMax, stockMin)){
                return;
            }
            
            TProducto p = new TProducto();

            p.setNombre(txt_nombre.getText());
            p.setDescripcion(txt_descripcion.getText());
            p.setUd_venta(txt_ud_venta.getText());
            p.setCodigo_barras(txt_cod_barras.getText());
            p.setEstado(chbox_activo.isSelected());
            p.setMarca(txt_marca.getText());
            p.setSku(txt_sku.getText());
            p.setStock(Integer.parseInt(txt_stock.getText()));
            p.setStock_max(Integer.parseInt(txt_stock_max.getText()));
            p.setStock_min(Integer.parseInt(txt_stock_min.getText()));

            // id para el WHERE
            p.setId_producto(Integer.parseInt(txt_id_producto.getText()));

            CProductos productos = new CProductos();
            try{
                productos.modificarProducto(p, tbl_productos); // refresca la tabla despues del update
            }catch(SQLException ex){
                Logger.getLogger(jpn_Productos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una fila", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_updateActionPerformed

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
            
            CProductos prod = new CProductos();
            prod.exportarProductos(ruta, tbl_productos);                    
        }   
    }//GEN-LAST:event_btn_exportarCSVActionPerformed

    
    public boolean validarCampos(){
        
        if (txt_nombre.getText().trim().isEmpty()) return false;
        if (txt_descripcion.getText().trim().isEmpty()) return false;
        if (txt_marca.getText().trim().isEmpty()) return false;
        if (txt_ud_venta.getText().trim().isEmpty()) return false;
        if (txt_cod_barras.getText().trim().isEmpty()) return false;
        if (txt_sku.getText().trim().isEmpty()) return false;
        if (txt_stock.getText().trim().isEmpty()) return false;
        if (txt_stock_max.getText().trim().isEmpty()) return false;
        if (txt_stock_min.getText().trim().isEmpty()) return false;
        if (txt_stock_min.getText().trim().isEmpty()) return false;

        return true;
    }
    
    public void limpiarFormulario(){
        txt_id_producto.setText("");
        txt_nombre.setText("");
        txt_descripcion.setText("");
        txt_marca.setText("");
        txt_ud_venta.setText("");
        txt_cod_barras.setText("");
        txt_sku.setText("");
        chbox_activo.setSelected(false);
        txt_stock.setText("");
        txt_stock_max.setText("");
        txt_stock_min.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_añadir;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_exportarCSV;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_update;
    private javax.swing.JCheckBox chbox_activo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_productos;
    private javax.swing.JTextField txt_cod_barras;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_id_producto;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_sku;
    private javax.swing.JTextField txt_stock;
    private javax.swing.JTextField txt_stock_max;
    private javax.swing.JTextField txt_stock_min;
    private javax.swing.JTextField txt_ud_venta;
    // End of variables declaration//GEN-END:variables
}
