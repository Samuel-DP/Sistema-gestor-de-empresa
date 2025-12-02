package PRESENTACION;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class frmPrincipal extends javax.swing.JFrame {

    
    public frmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null); //Esto hace que me salga la ventada en el medio cuando le de al run, se puede hacer por codigo o desde propiedades de la interfaz
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jpn_fondo = new javax.swing.JPanel();
        jpn_MnVertical = new javax.swing.JPanel();
        btn_clientes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_pedidos = new javax.swing.JButton();
        btn_productos = new javax.swing.JButton();
        btn_empleados = new javax.swing.JButton();
        jpn_MnHorizontal = new javax.swing.JPanel();
        jpn_contenido = new javax.swing.JPanel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 800));

        jpn_fondo.setBackground(new java.awt.Color(255, 255, 255));
        jpn_fondo.setPreferredSize(new java.awt.Dimension(921, 570));

        jpn_MnVertical.setBackground(new java.awt.Color(0, 51, 153));

        btn_clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_clientes.setText("Clientes");
        btn_clientes.setBorder(null);
        btn_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clientesMouseExited(evt);
            }
        });
        btn_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoCesur.jpg"))); // NOI18N

        btn_pedidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_pedidos.setText("Pedidos");
        btn_pedidos.setBorder(null);
        btn_pedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pedidosMouseExited(evt);
            }
        });
        btn_pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedidosActionPerformed(evt);
            }
        });

        btn_productos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_productos.setText("Productos");
        btn_productos.setBorder(null);
        btn_productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_productosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_productosMouseExited(evt);
            }
        });
        btn_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productosActionPerformed(evt);
            }
        });

        btn_empleados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_empleados.setText("Empleados");
        btn_empleados.setBorder(null);
        btn_empleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_empleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_empleadosMouseExited(evt);
            }
        });
        btn_empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpn_MnVerticalLayout = new javax.swing.GroupLayout(jpn_MnVertical);
        jpn_MnVertical.setLayout(jpn_MnVerticalLayout);
        jpn_MnVerticalLayout.setHorizontalGroup(
            jpn_MnVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_MnVerticalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_MnVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_empleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_pedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpn_MnVerticalLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpn_MnVerticalLayout.setVerticalGroup(
            jpn_MnVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_MnVerticalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btn_clientes)
                .addGap(29, 29, 29)
                .addComponent(btn_empleados)
                .addGap(26, 26, 26)
                .addComponent(btn_productos)
                .addGap(27, 27, 27)
                .addComponent(btn_pedidos)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        jpn_MnHorizontal.setBackground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout jpn_MnHorizontalLayout = new javax.swing.GroupLayout(jpn_MnHorizontal);
        jpn_MnHorizontal.setLayout(jpn_MnHorizontalLayout);
        jpn_MnHorizontalLayout.setHorizontalGroup(
            jpn_MnHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpn_MnHorizontalLayout.setVerticalGroup(
            jpn_MnHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        jpn_contenido.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jpn_contenidoLayout = new javax.swing.GroupLayout(jpn_contenido);
        jpn_contenido.setLayout(jpn_contenidoLayout);
        jpn_contenidoLayout.setHorizontalGroup(
            jpn_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 777, Short.MAX_VALUE)
        );
        jpn_contenidoLayout.setVerticalGroup(
            jpn_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpn_fondoLayout = new javax.swing.GroupLayout(jpn_fondo);
        jpn_fondo.setLayout(jpn_fondoLayout);
        jpn_fondoLayout.setHorizontalGroup(
            jpn_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_fondoLayout.createSequentialGroup()
                .addComponent(jpn_MnVertical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpn_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpn_MnHorizontal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpn_fondoLayout.setVerticalGroup(
            jpn_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_MnVertical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpn_fondoLayout.createSequentialGroup()
                .addComponent(jpn_MnHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpn_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
       Inicio(1);
    }//GEN-LAST:event_btn_clientesActionPerformed

    private void btn_empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empleadosActionPerformed
        Inicio(2);
    }//GEN-LAST:event_btn_empleadosActionPerformed

    private void btn_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productosActionPerformed
        Inicio(3);
    }//GEN-LAST:event_btn_productosActionPerformed

    private void btn_pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pedidosActionPerformed
        Inicio(4);
    }//GEN-LAST:event_btn_pedidosActionPerformed

    private void btn_clientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseEntered
        this.btn_clientes.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_btn_clientesMouseEntered

    private void btn_clientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseExited
        this.btn_clientes.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_btn_clientesMouseExited

    private void btn_empleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_empleadosMouseEntered
        this.btn_empleados.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_btn_empleadosMouseEntered

    private void btn_empleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_empleadosMouseExited
        this.btn_empleados.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_btn_empleadosMouseExited

    private void btn_productosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productosMouseEntered
         this.btn_productos.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_btn_productosMouseEntered

    private void btn_productosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productosMouseExited
        this.btn_productos.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_btn_productosMouseExited

    private void btn_pedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pedidosMouseEntered
        this.btn_pedidos.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_btn_pedidosMouseEntered

    private void btn_pedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pedidosMouseExited
        this.btn_pedidos.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_btn_pedidosMouseExited

    //COMO tengo dos JFrame y por defecto dos main, lo comento para mostrar el que quiero que es el otro
    /*
    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }
    */
    
    private void Inicio(int opcion){
        
        JPanel panelAMostrar = null;
        
        switch(opcion){
                
            case 1 :
                
                panelAMostrar = new jpn_Clientes();
                
                break;
                
            case 2 :
                
                  panelAMostrar = new jpn_Empleados();
                
                break;
                
            case 3 :
                
                panelAMostrar = new jpn_Productos();
                
                break;
                
            case 4 :
                panelAMostrar = new jpn_Pedidos();
                
                break;
        }
        
        if(panelAMostrar != null){
            
            panelAMostrar.setSize(2048, 1024);
            panelAMostrar.setLocation(0,0);
                    
            jpn_contenido.removeAll(); //esto elimina lo que haya en  mi panel de pantalla de inicio
            jpn_contenido.add(panelAMostrar,BorderLayout.CENTER); //Añado a este objeto lo que yo he creado
            jpn_contenido.revalidate();
            jpn_contenido.repaint(); //Me lo repintas
                    
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_empleados;
    private javax.swing.JButton btn_pedidos;
    private javax.swing.JButton btn_productos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpn_MnHorizontal;
    private javax.swing.JPanel jpn_MnVertical;
    private javax.swing.JPanel jpn_contenido;
    private javax.swing.JPanel jpn_fondo;
    // End of variables declaration//GEN-END:variables
}
