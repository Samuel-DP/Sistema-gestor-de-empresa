package PRESENTACION;


import DAO.Conexion_DB;
import DOMINIO.vGlobales;
import java.awt.Color;
import javax.swing.JOptionPane;


public class frmLogin extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public frmLogin() {
        initComponents();
        
        this.setLocationRelativeTo(null); //Esto me centra la ventada de mi interfaz cuando le doy al run
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        psw_pass = new javax.swing.JPasswordField();
        btn_enter = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña:");

        btn_enter.setBackground(new java.awt.Color(0, 153, 204));
        btn_enter.setText("Acceder");
        btn_enter.setBorderPainted(false);
        btn_enter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_enterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_enterMouseExited(evt);
            }
        });
        btn_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enterActionPerformed(evt);
            }
        });

        btn_exit.setBackground(new java.awt.Color(0, 153, 204));
        btn_exit.setText("Salir");
        btn_exit.setBorderPainted(false);
        btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_exitMouseExited(evt);
            }
        });
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Bienvenido a CESUR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btn_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(psw_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 68, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btn_enter))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btn_exit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(psw_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enterActionPerformed
       
       vGlobales.USER = this.txt_user.getText();
       vGlobales.PASSWORD = new String (psw_pass.getPassword());
       
       Conexion_DB conexion = new Conexion_DB();
       
       if(conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD) != null){
           
           // En caso de conexion abrir una nueva ventana
           frmPrincipal ventana = new frmPrincipal();
           ventana.show();
           this.dispose();  //este JFrame en el que estoy lo oculto
           
       }else{
            JOptionPane.showMessageDialog(this, "El acceso es incorrecto", "Error", JOptionPane.ERROR_MESSAGE );
            limpiarDatos();
       }
               
    }//GEN-LAST:event_btn_enterActionPerformed
    
    public void limpiarDatos(){
        this.txt_user.setText("");
        this.psw_pass.setText(""); 
    }
    
    // Evento que hace que cuando pase mi raton por encima cambie el color
    private void btn_enterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_enterMouseEntered
        this.btn_enter.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_btn_enterMouseEntered

    // Evento que hace que cambie el color cuando mi raton salga del boton
    private void btn_enterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_enterMouseExited
        this.btn_enter.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_btn_enterMouseExited

    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
        this.btn_exit.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
        this.btn_exit.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_btn_exitMouseExited

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed
    
    // Evento que me permite mover mi JFrame por la pantalla si lo mantenerlo presionado
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    // Evento que me permite soltar mi JFrame si lo suelto
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_formMouseDragged

    // Para eliminar la barra de arriba con los botones (- [] X) clico en mi JPanel propiedades y selecciono Undecorated
    
    public static void main(String args[]) {
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
     
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enter;
    private javax.swing.JButton btn_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField psw_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
