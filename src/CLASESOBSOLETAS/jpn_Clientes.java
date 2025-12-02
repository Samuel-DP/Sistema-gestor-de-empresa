package CLASESOBSOLETAS;

/*
import PRESENTACION.*;
import DOMINIO.Agenda;
import TRANSVERSAL.Cliente;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



public class jpn_Clientes extends javax.swing.JPanel {

  
    public jpn_Clientes() {
        
        modelo = new DefaultTableModel();
        
        initComponents();
        
        this.tbl_infoClientes.setModel(modelo);
        
        // Solo permite seleccionar una sola fila
        tbl_infoClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // Cada vez que cambiemos de selección, cargamos los datos del cliente en el formulario
        tbl_infoClientes.getSelectionModel().addListSelectionListener(e -> {
            if(!e.getValueIsAdjusting()){ //ejecuta el metodo solo cuando el cambio de seleccion haya terminado
                cargarClienteSeleccionadoEnFormulario();
            }
        });
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("DNI/NIF");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        
        agenda = new Agenda();
        
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
        tbl_infoClientes = new javax.swing.JTable();
        txt_apellido = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_dni_nif = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_importar = new javax.swing.JButton();
        btn_exportar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("DNI/NIF:");

        jLabel4.setText("Direccion:");

        jLabel5.setText("Telefono:");

        jLabel6.setText("Correo:");

        tbl_infoClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_infoClientes);

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(51, 153, 255));
        btn_add.setText("Añadir");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_del.setBackground(new java.awt.Color(51, 153, 255));
        btn_del.setText("Eliminar");
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(0, 153, 51));
        btn_update.setText("Actualizar");
        btn_update.setPreferredSize(new java.awt.Dimension(73, 23));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_exit.setBackground(new java.awt.Color(255, 51, 51));
        btn_exit.setText("Salir");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        btn_importar.setBackground(new java.awt.Color(51, 153, 255));
        btn_importar.setText("Importar");
        btn_importar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_importarActionPerformed(evt);
            }
        });

        btn_exportar.setBackground(new java.awt.Color(51, 153, 255));
        btn_exportar.setText("Exportar");
        btn_exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exportarActionPerformed(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(txt_dni_nif, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_del, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_importar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txt_dni_nif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btn_add)
                        .addGap(27, 27, 27)
                        .addComponent(btn_del)
                        .addGap(37, 37, 37)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btn_importar)
                        .addGap(37, 37, 37)
                        .addComponent(btn_exportar)
                        .addGap(37, 37, 37)
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

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        String nombre = this.txt_nombre.getText();
        String apellido = this.txt_apellido.getText();
        String dni_nif = this.txt_dni_nif.getText();
        String direccion = this.txt_direccion.getText();
        String telefono = this.txt_telefono.getText();
        String correo = this.txt_correo.getText();
        
        if (!agenda.validarDniNif(dni_nif)) {
            return; // Si es inválido, detener el proceso
        }
        
        if(!agenda.validarCorreo(correo)){
            return;
        }
        
       // Evitar duplicados
        if (agenda.existeClientePorDni(dni_nif)) {
            JOptionPane.showMessageDialog(this,"Ya existe un cliente con el DNI/NIF " + dni_nif, "DNI/NIF duplicado", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(nombre.isEmpty() || apellido.isEmpty() || dni_nif.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || correo.isEmpty()){
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios","ATENCION", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        Cliente c = new Cliente(nombre, apellido, dni_nif, direccion, telefono, correo);
        
        //Añado los clientes a mi agenda
        agenda.addClientes(c);
        
        //Invoco a la funcion rellenar tabla
        
        rellenarTabla();
        
        // Borro los datos de mis casillas despues de añadir un cliente para que se queden vacias para el siguiente
        limpiarFormulario();
        
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        
        //Seleccionamos una fila
        int fila_seleccionada = this.tbl_infoClientes.getSelectedRow();
        
        //Como saber si se ha seleccionado una fila 
        if(fila_seleccionada == -1){
            JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila ", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
        }else{
            String nombre = (String)modelo.getValueAt(fila_seleccionada, 0); //Primera columna
            String apellido = (String)modelo.getValueAt(fila_seleccionada, 1); //Segunda columna
            String dni_nif = (String)modelo.getValueAt(fila_seleccionada, 2);
            String direccion = (String)modelo.getValueAt(fila_seleccionada, 3);
            String telefono = (String)modelo.getValueAt(fila_seleccionada, 4);
            String correo = (String)modelo.getValueAt(fila_seleccionada, 5);
            
            Cliente aux = new Cliente(nombre, apellido, dni_nif, direccion, telefono, correo);
            
            agenda.delCliente(aux);
            
            //Vuelvo a reescribir la tabla
            rellenarTabla();
            
            //Borro los datos d las casillas
            limpiarFormulario();
            
        }
    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        int fila_seleccionada = this.tbl_infoClientes.getSelectedRow(); //Seleccionamos la fila que queremos actualizar
        
        if(fila_seleccionada == -1){
            JOptionPane.showMessageDialog(null, "Selecciona el cliente que deseas actualizar", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        int filaModelo = tbl_infoClientes.convertRowIndexToModel(fila_seleccionada);
        TableModel m = tbl_infoClientes.getModel();
        int colDni = 2; // ajusta si tu DNI está en otra columna
        
        //Clave inmutable para localizar el registro original
        String dniClave = String.valueOf(m.getValueAt(filaModelo, colDni));
        
        //Nuevos valores desde los JtextFild q el usuario puede editar
        String nuevoNombre = txt_nombre.getText().trim();
        String nuevoApellido = txt_apellido.getText().trim();
        String nuevoDni_nif = txt_dni_nif.getText().trim();
        String nuevaDireccion = txt_direccion.getText().trim();
        String nuevoTelefono = txt_telefono.getText().trim();
        String nuevoCorreo = txt_correo.getText().trim();
        
        if(nuevoNombre.isEmpty() || nuevoApellido.isEmpty() || nuevaDireccion.isEmpty() || nuevoTelefono.isEmpty() || nuevoCorreo.isEmpty()){
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        //Validar dni/nif antes de actualizar
        if (!agenda.validarDniNif(nuevoDni_nif)) {
            return; // Si es inválido, detener el proceso
        }
        
        boolean ok = agenda.actualizarCliente(dniClave, nuevoNombre, nuevoApellido, nuevoDni_nif, nuevaDireccion, nuevoTelefono, nuevoCorreo);
        
        if(!ok){
            JOptionPane.showMessageDialog(null, "No se pudo actualizar (no encontrado o DNI duplicado).", "ATENCION", JOptionPane.WARNING_MESSAGE);
            return;
        }
       
        rellenarTabla();
        
        limpiarFormulario();
        
        JOptionPane.showMessageDialog(null, "Cliente actualizado", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_importarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_importarActionPerformed
        
        JFileChooser fc = new JFileChooser(); //Nos abre una ventana de dialogo para poder navegar por los directorios
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.dat", "dat");
        
        fc.setFileFilter(filtro);
        
        //Abrimos una ventana y guardamos la opcion seleccionada por el usuario
        int seleccion = fc.showOpenDialog(this);
        
        if(seleccion == JFileChooser.APPROVE_OPTION){
            
            File fichero = fc.getSelectedFile();
            
            fc.setFileFilter(filtro);
            
            agenda.importarClientes(fichero.getAbsolutePath());
            
            rellenarTabla();           
        }     
    }//GEN-LAST:event_btn_importarActionPerformed

    private void btn_exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportarActionPerformed
        
        JFileChooser fc = new JFileChooser();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.dat", "dat");
        
        fc.setFileFilter(filtro);
        
        int seleccion = fc.showOpenDialog(this);
        
        if(seleccion == JFileChooser.APPROVE_OPTION){
            
            File fichero = fc.getSelectedFile();
            
            agenda.exportarClientes(fichero.getAbsolutePath());
            
            rellenarTabla();
            
        }   
    }//GEN-LAST:event_btn_exportarActionPerformed

    private void rellenarTabla(){
        //Vacio tabla
        modelo.setRowCount(0);
        
        Cliente clientes[] = agenda.getClientes();
        
        Object[] fila;
        for(int i = 0; i < clientes.length; i++){
            if(clientes[i] != null){
                //Creamos la fila
                 fila = new Object[6];
                 fila[0] = clientes[i].getNombre();
                 fila[1] = clientes[i].getApellido();
                 fila[2] = clientes[i].getDni_nif();
                 fila[3] = clientes[i].getDireccion();
                 fila[4] = clientes[i].getTelefono();
                 fila[5] = clientes[i].getCorreo();
                 modelo.addRow(fila);                
            }
        }
    }    
    
    private void cargarClienteSeleccionadoEnFormulario(){
        int filaVista = tbl_infoClientes.getSelectedRow();
        
        if(filaVista == -1){
            return;
        }else{
            // Convierte el numero de fila Vista a la fila real del Modelo (DefaultTableModel)
            int filaModelo = tbl_infoClientes.convertRowIndexToModel(filaVista);
            
            txt_nombre.setText(String.valueOf(modelo.getValueAt(filaModelo, 0)));
            txt_apellido.setText(String.valueOf(modelo.getValueAt(filaModelo, 1)));
            txt_dni_nif.setText(String.valueOf(modelo.getValueAt(filaModelo, 2)));
            txt_direccion.setText(String.valueOf(modelo.getValueAt(filaModelo, 3)));
            txt_telefono.setText(String.valueOf(modelo.getValueAt(filaModelo, 4)));
            txt_correo.setText(String.valueOf(modelo.getValueAt(filaModelo, 5)));
            
        }    
    }
    
    private void limpiarFormulario(){
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_dni_nif.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        txt_correo.setText("");
    }
    
    
    private DefaultTableModel modelo;
    private Agenda agenda;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_exportar;
    private javax.swing.JButton btn_importar;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_infoClientes;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni_nif;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}

*/
