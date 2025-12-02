package CLASESOBSOLETAS;

/*
import PRESENTACION.*;
import TRANSVERSAL.Empleado;
import DOMINIO.Agenda;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class jpn_Empleados extends javax.swing.JPanel {

    
    public jpn_Empleados() {
        
        modelo = new DefaultTableModel();
         
        initComponents();
        
        // Esto me permite seleccionar una fila
        this.tbl_infoEmpleados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // Cada vez que cambiemos de selección, cargamos los datos del cliente en el formulario
        tbl_infoEmpleados.getSelectionModel().addListSelectionListener(e -> {
            if(!e.getValueIsAdjusting()){ //ejecuta el metodo solo cuando el cambio de seleccion haya terminado
                cargarEmpSeleccionadoEnFormulario();
            }
        });
        
        this.tbl_infoEmpleados.setModel(modelo);
        
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("DNI");
        modelo.addColumn("Puesto");
        modelo.addColumn("Sueldo");
        modelo.addColumn("Departamento");
        modelo.addColumn("F. Alta");
        modelo.addColumn("F. Baja");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        modelo.addColumn("Direccion");
        
        agenda = new Agenda();
        
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
        txt_apellido = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_infoEmpleados = new javax.swing.JTable();
        txt_puesto = new javax.swing.JTextField();
        txt_sueldo = new javax.swing.JTextField();
        txt_departamento = new javax.swing.JTextField();
        txt_fechaAlta = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        btn_añadir = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_exportar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_fechaBaja = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_tlf = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        txt_idEmpleado = new javax.swing.JTextField();

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
        jScrollPane1.setViewportView(tbl_infoEmpleados);

        txt_puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_puestoActionPerformed(evt);
            }
        });

        txt_sueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sueldoActionPerformed(evt);
            }
        });

        txt_departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_departamentoActionPerformed(evt);
            }
        });

        btn_añadir.setBackground(new java.awt.Color(51, 153, 255));
        btn_añadir.setText("Añadir");
        btn_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirActionPerformed(evt);
            }
        });

        btn_actualizar.setBackground(new java.awt.Color(0, 153, 51));
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_exportar.setBackground(new java.awt.Color(51, 153, 255));
        btn_exportar.setText("Exportar");

        btn_salir.setBackground(new java.awt.Color(255, 51, 51));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jLabel10.setText("Telefono");

        jLabel11.setText("Departamento:");

        jLabel12.setText("Puesto:");

        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });

        jLabel1.setText("Apellido 2: ");

        jLabel13.setText("Nombre calle:");

        jLabel14.setText("Correo:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel15.setText("Salario:");

        jLabel16.setText("Activo:");

        jCheckBox1.setText("Alta/Baja");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel17.setText("Fecha nacimiento:");

        jLabel18.setText("Fecha alta:");

        jButton1.setText("Mostrar empleados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txt_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(txt_fechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(txt_fechaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tlf, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1042, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_añadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_exportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(txt_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(txt_idEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_idEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txt_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txt_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_fechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_fechaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(txt_tlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16))))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(28, 28, 28)
                        .addComponent(btn_añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn_exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1390, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_puestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_puestoActionPerformed

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
        
        String id_emp = this.txt_idEmpleado.getText();
        String nombre = this.txt_nombre.getText();
        String apellido = this.txt_apellido.getText();
        String dni = this.txt_dni.getText();
        String puesto = this.txt_puesto.getText();
        String sueldoTexto = this.txt_sueldo.getText();
        String departamento = this.txt_departamento.getText();
        String fecha_alta = this.txt_fechaAlta.getText();
        String fecha_baja = this.txt_fechaBaja.getText();
        String telefono = this.txt_tlf.getText();
        String correo = this.txt_correo.getText();
        String direccion = this.txt_direccion.getText();
        
        if(id_emp.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || puesto.isEmpty() ||
                sueldoTexto.isEmpty() || departamento.isEmpty() || fecha_alta.isEmpty() || telefono.isEmpty() ||correo.isEmpty() || direccion.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "No puede haber espacios vacios, excepto fecha de baja ", "ATENCION", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        double sueldo = 0;
        
        try{
            sueldo = Double.parseDouble(sueldoTexto);
            if(sueldo <= 0){
                JOptionPane.showMessageDialog(null, "El saldo debe ser mayor de 0", "ATENCION", JOptionPane.ERROR_MESSAGE);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error al insertar el sueldo, usar punto para poner decimales", "Error", JOptionPane.ERROR_MESSAGE );
            return;
        }
        
        if(!agenda.validarDniNif(dni)){
            return;
        }
        
        if(!agenda.validarCorreo(correo)){
            return;
        }
        
        Empleado empleado = new Empleado(id_emp, nombre, apellido, dni, puesto, sueldo, departamento, fecha_alta, fecha_baja, telefono, correo, direccion);
        
        // Añado el empleado a mi agenda
        agenda.añadirEmpleado(empleado);
        
        // Lo muestro en la tabla
        rellenarTabla();
        
        limpiarFormulario();
        
        
    }//GEN-LAST:event_btn_añadirActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        
        int fila_seleccionada = this.tbl_infoEmpleados.getSelectedRow();
        
        if(fila_seleccionada == -1){
            JOptionPane.showMessageDialog(null, "Seleccione el empleado que desee actualizar", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        int filaModelo = this.tbl_infoEmpleados.convertRowIndexToModel(fila_seleccionada); // Esto convierte el indice de la fila seleccionada desde la interfaz al modelo de datos real de la tabla
        
        TableModel m = this.tbl_infoEmpleados.getModel(); // Obtengo el modelo de la tabla q es dnd realmente estan los datos , asi podre acceder a los valores de cada celda.
        
        int colDni = 3; // Columna 4 en mi tabla
        
        String dniClave = String.valueOf(m.getValueAt(filaModelo, colDni)); // Obtengo el valor del DNI del cliente seleccionado        
        
        String nuevo_id_emp = this.txt_idEmpleado.getText();
        String nuevo_nombre = this.txt_nombre.getText();
        String nuevo_apellido = this.txt_apellido.getText();
        String nuevo_dni = this.txt_dni.getText();
        String nuevo_puesto = this.txt_puesto.getText();
        String nuevo_sueldoTexto = this.txt_sueldo.getText();
        String nuevo_departamento = this.txt_departamento.getText();
        String nuevo_fecha_alta = this.txt_fechaAlta.getText();
        String nuevo_fecha_baja = this.txt_fechaBaja.getText();
        String nuevo_telefono = this.txt_tlf.getText();
        String nuevo_correo = this.txt_correo.getText();
        String nuevo_direccion = this.txt_direccion.getText();
        
        if(nuevo_id_emp.isEmpty() || nuevo_nombre.isEmpty() || nuevo_apellido.isEmpty() || nuevo_dni.isEmpty() || nuevo_puesto.isEmpty() ||
                nuevo_sueldoTexto.isEmpty() || nuevo_departamento.isEmpty() || nuevo_fecha_alta.isEmpty() || nuevo_telefono.isEmpty() || nuevo_correo.isEmpty() || nuevo_direccion.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "No puede haber espacios vacios, excepto fecha de baja ", "ATENCION", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        double nuevo_sueldo = 0;
        try{
            nuevo_sueldo = Double.parseDouble(nuevo_sueldoTexto);
            if(nuevo_sueldo < 0){
                JOptionPane.showMessageDialog(null, "El saldo debe ser mayor de 0", "ATENCION", JOptionPane.ERROR_MESSAGE);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error al insertar el sueldo, usar punto para poner decimales", "Error", JOptionPane.ERROR_MESSAGE );
            return;
        }
        
        if(!agenda.validarDniNif(nuevo_dni)){
            return;
        }
        
        boolean ok = agenda.actualizarEmpleado(dniClave, nuevo_id_emp, nuevo_nombre, nuevo_apellido, nuevo_dni, nuevo_puesto,
                            nuevo_sueldo, nuevo_departamento, nuevo_fecha_alta, nuevo_fecha_baja, nuevo_telefono, nuevo_correo, nuevo_direccion);
        
        if(!ok){
            JOptionPane.showMessageDialog(null, "No se pudo actualizar (no encontrado o DNI duplicado).", "ATENCION", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        rellenarTabla();
        
        limpiarFormulario();
        
        JOptionPane.showMessageDialog(null, "Cliente actualizado", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
       
        
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void txt_departamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_departamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_departamentoActionPerformed

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

    private void txt_sueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sueldoActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void rellenarTabla(){
        
        // Vacio mi tabla
        modelo.setRowCount(0);
        
        Empleado empleados[] = agenda.getEmpleados();
        
        Object fila[];
        
        for (int i = 0; i < empleados.length; i++){
            if(empleados[i] != null ){
                fila = new Object[12];
                fila[0] = empleados[i].getIdEmp();
                fila[1] = empleados[i].getNombre();
                fila[2] = empleados[i].getApellido();
                fila[3] = empleados[i].getDni();
                fila[4] = empleados[i].getPuesto();
                fila[5] = empleados[i].getSueldo();
                fila[6] = empleados[i].getDepartamento();
                fila[7] = empleados[i].getFecha_alta();
                fila[8] = empleados[i].getFecha_baja();
                fila[9] = empleados[i].getTelefono();
                fila[10] = empleados[i].getCorreo();
                fila[11] = empleados[i].getDireccion();
                modelo.addRow(fila);
            }
        }  
    }
    
    public void cargarEmpSeleccionadoEnFormulario(){
        
        int filaVista = this.tbl_infoEmpleados.getSelectedRow();
        
        if(filaVista == -1){
            return;
        }else{
            // Convierte el numero de fila Vista a la fila real del Modelo (DefaultTableModel)
            int filaModelo = tbl_infoEmpleados.convertRowIndexToModel(filaVista);
            
            txt_idEmpleado.setText(String.valueOf(modelo.getValueAt(filaModelo, 0)));
            txt_nombre.setText(String.valueOf(modelo.getValueAt(filaModelo, 1)));
            txt_apellido.setText(String.valueOf(modelo.getValueAt(filaModelo, 2)));
            txt_dni.setText(String.valueOf(modelo.getValueAt(filaModelo, 3)));
            txt_puesto.setText(String.valueOf(modelo.getValueAt(filaModelo, 4)));
            txt_sueldo.setText(String.valueOf(modelo.getValueAt(filaModelo, 5)));
            txt_departamento.setText(String.valueOf(modelo.getValueAt(filaModelo, 6)));
            txt_fechaAlta.setText(String.valueOf(modelo.getValueAt(filaModelo, 7)));
            txt_fechaBaja.setText(String.valueOf(modelo.getValueAt(filaModelo, 8)));
            txt_tlf.setText(String.valueOf(modelo.getValueAt(filaModelo, 9)));
            txt_correo.setText(String.valueOf(modelo.getValueAt(filaModelo, 10)));
            txt_direccion.setText(String.valueOf(modelo.getValueAt(filaModelo, 11)));
        }
        
    }
    
    public void limpiarFormulario(){
        this.txt_idEmpleado.setText("");
        this.txt_nombre.setText("");
        this.txt_apellido.setText("");
        this.txt_dni.setText("");
        this.txt_puesto.setText("");
        this.txt_sueldo.setText("");
        this.txt_departamento.setText("");
        this.txt_fechaAlta.setText("");
        this.txt_fechaBaja.setText("");
        this.txt_tlf.setText("");
        this.txt_correo.setText("");
        this.txt_direccion.setText("");
    }
    
    private Agenda agenda;
    private DefaultTableModel modelo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_añadir;
    private javax.swing.JButton btn_exportar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tbl_infoEmpleados;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_departamento;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_fechaAlta;
    private javax.swing.JTextField txt_fechaBaja;
    private javax.swing.JTextField txt_idEmpleado;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_puesto;
    private javax.swing.JTextField txt_sueldo;
    private javax.swing.JTextField txt_tlf;
    // End of variables declaration//GEN-END:variables
}

*/
