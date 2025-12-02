package PRESENTACION;

import DOMINIO.CClientes;
import DOMINIO.CValidaciones;
import TRANSVERSAL.TCliente;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class jpn_Clientes extends javax.swing.JPanel {

  
    public jpn_Clientes() {         
        initComponents();  
        
        // desactivo la edicion en todas las celdas
        tbl_clientes.setDefaultEditor(Object.class, null);
        
        CClientes clientes = new CClientes();
        try {
            clientes.listarClientes(tbl_clientes);
        } catch (SQLException ex) {
            Logger.getLogger(jpn_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cmb_tipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "tarjeta",
            "efectivo",
            "domiciliacion_bancaria"
        }));      
       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();
        txt_nombre_comercial = new javax.swing.JTextField();
        txt_razon_social = new javax.swing.JTextField();
        txt_calle = new javax.swing.JTextField();
        txt_ciudad = new javax.swing.JTextField();
        txt_provincia = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_id_cliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_cod_postal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_pais = new javax.swing.JTextField();
        txt_tlf = new javax.swing.JTextField();
        cmb_tipoPago = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txt_nif = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        btn_exportarCSV = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Razon social:");

        jLabel2.setText("Nombre comercial:");

        jLabel3.setText("Tipo pago:");

        jLabel4.setText("Calle:");

        jLabel5.setText("Ciudad:");

        jLabel6.setText("Provincia:");

        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_clientes);

        txt_razon_social.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_razon_socialActionPerformed(evt);
            }
        });

        txt_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ciudadActionPerformed(evt);
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
        btn_update.setPreferredSize(new java.awt.Dimension(73, 23));
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

        jLabel7.setText("Id_cliente:");

        txt_id_cliente.setEditable(false);

        jLabel8.setText("Codigo postal:");

        txt_cod_postal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cod_postalKeyTyped(evt);
            }
        });

        jLabel9.setText("Pais:");

        jLabel10.setText("Correo:");

        jLabel11.setText("Telefono:");

        cmb_tipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setText("NIF:");

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
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(txt_razon_social, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(txt_cod_postal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(88, 88, 88)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_tlf, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txt_nombre_comercial, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(txt_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_exportarCSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(txt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(cmb_tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txt_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel7)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_id_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(txt_nif)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_razon_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_cod_postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_tlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre_comercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cmb_tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(txt_nif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btn_limpiar)
                        .addGap(31, 31, 31)
                        .addComponent(btn_add)
                        .addGap(37, 37, 37)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btn_exportarCSV)
                        .addGap(35, 35, 35)
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

    private void txt_razon_socialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_razon_socialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_razon_socialActionPerformed

    private void txt_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ciudadActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        
        boolean ok = validarCampos();

        if (!ok){
            JOptionPane.showMessageDialog(this, "No puede haber campos vacíos", "Atención", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
              
        CValidaciones validar = new CValidaciones();
        
        String nif = txt_nif.getText();
        if(!validar.validarDniNif(nif)){
            return;
        }
        
        String yaExisteNif = txt_nif.getText();
        if(validar.yaExisteNif(yaExisteNif)){
            return;
        }
        
        String correo = txt_correo.getText();
        if(!validar.validarCorreo(correo)){
            return;
        }
        
        String yaExisteCorreo = txt_correo.getText().trim();
        if(validar.yaExisteCorreo(yaExisteCorreo)){
            return;
        }
        

        TCliente c = new TCliente();

        c.setRazon_social(txt_razon_social.getText());
        c.setNombre_comercial(txt_nombre_comercial.getText());

        String tipoPagoSeleccionado = (String) cmb_tipoPago.getSelectedItem();
        c.setTipo_pago(TCliente.TipoPago.valueOf(tipoPagoSeleccionado)); // Enum del tipo de pago

        c.setNombre_calle(txt_calle.getText());
        c.setCodigo_postal(Integer.parseInt(txt_cod_postal.getText()));
        c.setCiudad(txt_ciudad.getText());
        c.setProvincia(txt_provincia.getText());
        c.setPais(txt_pais.getText());
        c.setTelefono(txt_tlf.getText());
        c.setCorreo(txt_correo.getText());
        c.setNif(txt_nif.getText());

        CClientes nuevoCliente = new CClientes();

        try {
            nuevoCliente.añadirCliente(c, tbl_clientes); // paso la tabla para refrescar los datos
            limpiarFormulario(); // limpia los campos del formulario
        } catch (SQLException ex) {
            Logger.getLogger(jpn_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        
        int filaVista = tbl_clientes.getSelectedRow();

        if (filaVista != -1){
            
            CValidaciones validar = new CValidaciones();
        
            String correo = txt_correo.getText();
            if(!validar.validarCorreo(correo)){
                return;
            }

            String nif = txt_nif.getText();
            if(!validar.validarDniNif(nif)){
                return;
            }
            
            TCliente c = new TCliente();

            c.setRazon_social(txt_razon_social.getText());
            c.setNombre_comercial(txt_nombre_comercial.getText());

            String tp = String.valueOf(cmb_tipoPago.getSelectedItem());
            c.setTipo_pago(TCliente.TipoPago.valueOf(tp));

            c.setNombre_calle(txt_calle.getText());
            c.setCodigo_postal(Integer.parseInt(txt_cod_postal.getText()));
            c.setCiudad(txt_ciudad.getText());
            c.setProvincia(txt_provincia.getText());
            c.setPais(txt_pais.getText());
            c.setTelefono(txt_tlf.getText());
            c.setCorreo(txt_correo.getText());
            c.setNif(txt_nif.getText());

            // id para el WHERE
            c.setId_cliente(Integer.parseInt(txt_id_cliente.getText()));

            CClientes nuevoCliente = new CClientes();
            try{
                nuevoCliente.actualizarCliente(c, tbl_clientes); // refresco la tabla despues del update
            }catch(SQLException ex){
                Logger.getLogger(jpn_Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una fila", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed
    
    private void tbl_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clientesMouseClicked
        CClientes clientes = new CClientes();
        
        clientes.seleccionarCliente(tbl_clientes, txt_razon_social, txt_nombre_comercial, cmb_tipoPago, txt_calle, txt_cod_postal, txt_ciudad, txt_provincia, txt_correo, txt_tlf, txt_pais, txt_id_cliente, txt_nif   );
    }//GEN-LAST:event_tbl_clientesMouseClicked
    
    // evento que solo permite escribir numeros 
    private void txt_cod_postalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod_postalKeyTyped
        CValidaciones validaciones = new CValidaciones();
        validaciones.soloNumeros(evt);
    }//GEN-LAST:event_txt_cod_postalKeyTyped

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
            
            CClientes clientes = new CClientes();
            clientes.exportarClientes(ruta, tbl_clientes);                    
        }   
    }//GEN-LAST:event_btn_exportarCSVActionPerformed
        
    public boolean validarCampos(){
        
        /*if (txt_razon_social.getText().trim().isEmpty()) return false;*/ // En la DB lo tengo como que puede set NOT NULL
        if (txt_nombre_comercial.getText().trim().isEmpty()) return false;
        if (cmb_tipoPago.getSelectedItem() == null) return false;
        if (cmb_tipoPago.getSelectedItem() == null) return false;
        if (txt_calle.getText().trim().isEmpty()) return false;
        if (txt_cod_postal.getText().trim().isEmpty()) return false;  
        if (txt_ciudad.getText().trim().isEmpty()) return false;
        if (txt_provincia.getText().trim().isEmpty()) return false;
        if (txt_pais.getText().trim().isEmpty()) return false;
        if (txt_tlf.getText().trim().isEmpty()) return false;
        if (txt_correo.getText().trim().isEmpty()) return false;
        if (txt_nif.getText().trim().isEmpty()) return false;
        
        return true;
    }
    
    public void limpiarFormulario(){
        txt_id_cliente.setText("");
        txt_razon_social.setText("");
        txt_nombre_comercial.setText("");
        cmb_tipoPago.setSelectedIndex(-1); // deja el combo sin selección
        txt_calle.setText("");
        txt_cod_postal.setText("");
        txt_ciudad.setText("");
        txt_provincia.setText("");
        txt_pais.setText("");
        txt_tlf.setText("");
        txt_correo.setText("");
        txt_nif.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_exportarCSV;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cmb_tipoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTable tbl_clientes;
    private javax.swing.JTextField txt_calle;
    private javax.swing.JTextField txt_ciudad;
    private javax.swing.JTextField txt_cod_postal;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_id_cliente;
    private javax.swing.JTextField txt_nif;
    private javax.swing.JTextField txt_nombre_comercial;
    private javax.swing.JTextField txt_pais;
    private javax.swing.JTextField txt_provincia;
    private javax.swing.JTextField txt_razon_social;
    private javax.swing.JTextField txt_tlf;
    // End of variables declaration//GEN-END:variables
}
