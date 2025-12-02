package PRESENTACION;

import DOMINIO.CEmpleados;
import DOMINIO.CValidaciones;
import TRANSVERSAL.TEmpleado;
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

public class jpn_Empleados extends javax.swing.JPanel {

    
    public jpn_Empleados() {
        initComponents();
        
        // desactivo la edicion en todas las celdas
        tbl_infoEmpleados.setDefaultEditor(Object.class, null);
        
        CEmpleados empleados = new CEmpleados();
        try {
            empleados.listarEmpleados(tbl_infoEmpleados);
        } catch (SQLException ex) {
            Logger.getLogger(jpn_Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido1 = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_infoEmpleados = new javax.swing.JTable();
        txt_cod_postal = new javax.swing.JTextField();
        txt_ciudad = new javax.swing.JTextField();
        txt_provincia = new javax.swing.JTextField();
        txt_pais = new javax.swing.JTextField();
        txt_domiciliacion = new javax.swing.JTextField();
        btn_añadir = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_tlf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_departamento = new javax.swing.JTextField();
        txt_puesto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_apellido2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_nombre_calle = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_salario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        chbox_activo = new javax.swing.JCheckBox();
        date_fecha_nac = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        date_fecha_alta = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        txt_id_empleado = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        btn_exportarCSV = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(705, 576));

        jLabel2.setText("DNI:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Domiciliacion bancaria:");

        jLabel5.setText("Ciudad:");

        jLabel6.setText("Provincia:");

        jLabel7.setText("Codigo postal:");

        jLabel8.setText("Pais");

        jLabel9.setText("Apellido 1:");

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        txt_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dniActionPerformed(evt);
            }
        });

        tbl_infoEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_infoEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_infoEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_infoEmpleados);

        txt_cod_postal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_cod_postal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod_postalActionPerformed(evt);
            }
        });
        txt_cod_postal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cod_postalKeyTyped(evt);
            }
        });

        txt_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ciudadActionPerformed(evt);
            }
        });

        txt_provincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_provinciaActionPerformed(evt);
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

        btn_actualizar.setBackground(new java.awt.Color(0, 153, 204));
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(255, 51, 51));
        btn_salir.setText("Salir");
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jLabel10.setText("Telefono");

        jLabel11.setText("Departamento:");

        jLabel12.setText("Puesto:");

        txt_puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_puestoActionPerformed(evt);
            }
        });

        jLabel1.setText("Apellido 2: ");

        jLabel13.setText("Nombre calle:");

        jLabel14.setText("Correo:");

        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });

        jLabel15.setText("Salario:");

        txt_salario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_salarioKeyTyped(evt);
            }
        });

        jLabel16.setText("Activo:");

        chbox_activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbox_activoActionPerformed(evt);
            }
        });

        jLabel17.setText("F. nacimiento:");

        jLabel18.setText("Fecha alta:");

        jLabel19.setText("Id_empleado:");

        txt_id_empleado.setEditable(false);

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
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txt_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txt_nombre_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txt_cod_postal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txt_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(txt_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(txt_tlf, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(date_fecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txt_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(chbox_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt_id_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(date_fecha_alta, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(72, 72, 72)
                            .addComponent(btn_exportarCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(88, 88, 88)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(16, 16, 16)
                            .addComponent(txt_domiciliacion, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txt_nombre_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(txt_cod_postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txt_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_tlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel17))
                    .addComponent(date_fecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(chbox_activo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15))))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_domiciliacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel14))
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_id_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_fecha_alta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_añadir)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_actualizar)
                        .addComponent(btn_salir)
                        .addComponent(btn_limpiar)
                        .addComponent(btn_exportarCSV)))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1346, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cod_postalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod_postalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_postalActionPerformed

    private void txt_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dniActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirActionPerformed
        
        boolean ok = validarCampos();

        if (!ok){
            JOptionPane.showMessageDialog(this, "No puede haber campos vacíos", "Atención", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        CValidaciones validar = new CValidaciones();
        
                
        String dni = txt_dni.getText();
        if(!validar.validarDniNif(dni)){
            return;
        }
        
        String yaExisteDni = txt_dni.getText();
        if(validar.yaExisteDniEmpleado(yaExisteDni)){
            return;
        }
        
        String correo = txt_correo.getText();
        if(!validar.validarCorreo(correo)){
            return;
        }
        
        String yaExisteCorreo = txt_correo.getText().trim();
        if(validar.yaExisteCorreoEmpleado(yaExisteCorreo)){
            return;
        }
        
        double salario = Double.parseDouble(txt_salario.getText());
        if(!validar.salarioValido(salario)){
            return;
        }
        
        Date fechaNacimiento = date_fecha_nac.getDate();
        Date fechaAlta = date_fecha_alta.getDate();
        if(!validar.fechaEmpleadosOk(fechaNacimiento, fechaAlta)){
            return;
        }
        
        
        TEmpleado e = new TEmpleado();

        e.setNombre(txt_nombre.getText());
        e.setApellido1(txt_apellido1.getText());
        e.setApellido2(txt_apellido2.getText());
        e.setDni(txt_dni.getText());
        e.setNombre_calle(txt_nombre_calle.getText());
        e.setCodigo_postal(Integer.parseInt(txt_cod_postal.getText()));
        e.setCiudad(txt_ciudad.getText());
        e.setProvincia(txt_provincia.getText());
        e.setPais(txt_pais.getText());
        e.setTelefono(txt_tlf.getText());
        e.setCorreo(txt_correo.getText());
        e.setDepartamento(txt_departamento.getText());
        e.setPuesto(txt_puesto.getText());
        e.setSalario(Double.parseDouble(txt_salario.getText()));
        
        e.setActivo(chbox_activo.isSelected());
        
        e.setDomiciliacion_bancaria(txt_domiciliacion.getText());
        
        e.setFecha_nacimiento(toLocalDate(date_fecha_nac.getDate()));
        e.setFecha_alta(toLocalDate(date_fecha_alta.getDate()));

        CEmpleados nuevoEmp = new CEmpleados();

        try {     
            nuevoEmp.insertarEmpleado(e, tbl_infoEmpleados);
            limpiarCampos();
        } catch (SQLException ex) {
            Logger.getLogger(jpn_Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }           
                  
    }//GEN-LAST:event_btn_añadirActionPerformed

    // Metodo para convertir JDateChooser de mi formulario --> en LocalDate
    private static LocalDate toLocalDate(Date d){
        if(d == null) return null;
        return d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
    
    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        
        int filaVista = tbl_infoEmpleados.getSelectedRow();
        
        if (filaVista != -1){
            
            CValidaciones validar = new CValidaciones();
            
            String correo = txt_correo.getText();
            if(!validar.validarCorreo(correo)){
                return;
            }
            
            String dni = txt_dni.getText();
            if(!validar.validarDniNif(dni)){
                return;
            }
            
            double salario = Double.parseDouble(txt_salario.getText());
            if(!validar.salarioValido(salario)){
                return;
            }
            
            Date fechaNacimiento = date_fecha_nac.getDate();
            Date fechaAlta = date_fecha_alta.getDate();
            if(!validar.fechaEmpleadosOk(fechaNacimiento, fechaAlta)){
                return;
            }

            TEmpleado e = new TEmpleado();

            e.setDni(txt_dni.getText());
            e.setNombre(txt_nombre.getText());
            e.setApellido1(txt_apellido1.getText());
            e.setApellido2(txt_apellido2.getText());
            e.setId_empleado(Integer.parseInt(txt_id_empleado.getText())); // NECESARIO PARA EL WHERE
            e.setNombre_calle(txt_nombre_calle.getText());
            e.setCodigo_postal(Integer.parseInt(txt_cod_postal.getText()));
            e.setCiudad(txt_ciudad.getText());
            e.setProvincia(txt_provincia.getText());
            e.setPais(txt_pais.getText());
            e.setTelefono(txt_tlf.getText());
            e.setCorreo(txt_correo.getText());
            e.setDepartamento(txt_departamento.getText());
            e.setPuesto(txt_puesto.getText());
            e.setSalario(Double.parseDouble(txt_salario.getText()));
            e.setDomiciliacion_bancaria(txt_domiciliacion.getText());
            e.setFecha_nacimiento(toLocalDate(date_fecha_nac.getDate()));
            e.setFecha_alta(toLocalDate(date_fecha_alta.getDate()));
            e.setActivo(chbox_activo.isSelected());

            CEmpleados ce = new CEmpleados();
            try{
                ce.modificarEmpleado(e, tbl_infoEmpleados);
            }catch(SQLException ex){
                Logger.getLogger(jpn_Empleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una fila", "Atencion", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private boolean validarCampos(){        
        if (txt_nombre.getText().trim().isEmpty()) return false;
        if (txt_apellido1.getText().trim().isEmpty()) return false;
        if (txt_apellido2.getText().trim().isEmpty()) return false;
        if (txt_dni.getText().trim().isEmpty()) return false;
        if (txt_nombre_calle.getText().trim().isEmpty()) return false;
        if (txt_cod_postal.getText().trim().isEmpty()) return false;
        if (txt_ciudad.getText().trim().isEmpty()) return false;
        if (txt_provincia.getText().trim().isEmpty()) return false;
        if (txt_pais.getText().trim().isEmpty()) return false;
        if (txt_tlf.getText().trim().isEmpty()) return false;
        if (txt_correo.getText().trim().isEmpty()) return false;
        if (txt_departamento.getText().trim().isEmpty()) return false;
        if (txt_puesto.getText().trim().isEmpty()) return false;
        if (txt_salario.getText().trim().isEmpty()) return false;
        if (txt_domiciliacion.getText().trim().isEmpty()) return false;

        if (date_fecha_nac.getDate() == null) return false;
        if (date_fecha_alta.getDate() == null) return false;

        return true;
    }
    
    private void limpiarCampos(){
        txt_nombre.setText("");
        txt_apellido1.setText("");
        txt_apellido2.setText("");
        txt_dni.setText("");
        txt_nombre_calle.setText("");
        txt_cod_postal.setText("");
        txt_ciudad.setText("");
        txt_provincia.setText("");
        txt_pais.setText("");
        txt_tlf.setText("");
        txt_correo.setText("");
        txt_departamento.setText("");
        txt_puesto.setText("");
        txt_salario.setText("");
        txt_domiciliacion.setText("");
        chbox_activo.setSelected(false);
        txt_id_empleado.setText("");

        date_fecha_nac.setDate(null);
        date_fecha_alta.setDate(null);
    }
    
    private void txt_provinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_provinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_provinciaActionPerformed

    private void txt_puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_puestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_puestoActionPerformed

    private void txt_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ciudadActionPerformed

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

    private void chbox_activoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbox_activoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbox_activoActionPerformed

    private void tbl_infoEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_infoEmpleadosMouseClicked
        CEmpleados pedidos = new CEmpleados();
        
        pedidos.seleccionarEmpleado(tbl_infoEmpleados, txt_nombre, txt_apellido1, txt_apellido2, txt_dni, txt_id_empleado, txt_nombre_calle, txt_cod_postal, txt_ciudad, txt_provincia, 
                txt_pais, txt_tlf, txt_correo, txt_departamento, txt_puesto, txt_salario, chbox_activo, txt_domiciliacion, date_fecha_nac, date_fecha_alta );
        
    }//GEN-LAST:event_tbl_infoEmpleadosMouseClicked
    
    // este evento me bloquea cualquier caracter que no sea numero
    private void txt_cod_postalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod_postalKeyTyped
        CValidaciones validaciones = new CValidaciones();
        validaciones.soloNumeros(evt);      
    }//GEN-LAST:event_txt_cod_postalKeyTyped

    private void txt_salarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salarioKeyTyped
        CValidaciones validaciones = new CValidaciones();
        validaciones.soloNumeros(evt);
    }//GEN-LAST:event_txt_salarioKeyTyped

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        
        limpiarCampos();
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
            
            CEmpleados empleados = new CEmpleados();
            empleados.exportarEmpleados(ruta, tbl_infoEmpleados);                    
        }   
    }//GEN-LAST:event_btn_exportarCSVActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_añadir;
    private javax.swing.JButton btn_exportarCSV;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JCheckBox chbox_activo;
    private com.toedter.calendar.JDateChooser date_fecha_alta;
    private com.toedter.calendar.JDateChooser date_fecha_nac;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_infoEmpleados;
    private javax.swing.JTextField txt_apellido1;
    private javax.swing.JTextField txt_apellido2;
    private javax.swing.JTextField txt_ciudad;
    private javax.swing.JTextField txt_cod_postal;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_departamento;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_domiciliacion;
    private javax.swing.JTextField txt_id_empleado;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombre_calle;
    private javax.swing.JTextField txt_pais;
    private javax.swing.JTextField txt_provincia;
    private javax.swing.JTextField txt_puesto;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JTextField txt_tlf;
    // End of variables declaration//GEN-END:variables
}
