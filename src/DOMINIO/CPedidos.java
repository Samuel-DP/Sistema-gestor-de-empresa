
package DOMINIO;

import DAO.Conexion_DB;
import TRANSVERSAL.TPedido;
import com.toedter.calendar.JDateChooser;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class CPedidos {
    
    public void listarPedidos(JTable tbl_pedidos) throws SQLException{
        
        Conexion_DB conexion = new Conexion_DB();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql = "select * from pedidos";
        
        modelo.addColumn("id_pedido");
        modelo.addColumn("num_factura");
        modelo.addColumn("fecha_factura");
        modelo.addColumn("fecha_venta");
        modelo.addColumn("id_cliente");
        modelo.addColumn("tipo_pago");
        modelo.addColumn("fecha_entrega");
        modelo.addColumn("estado_pedido");
        
        String[] datos = new String[8];
        
        Statement st;
        
        try {
            st = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD).createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                
                //Cambio el id por el nombre del cliente 
                String idCliente = rs.getString(5);
                datos[4] = obtenerNombreCliente(idCliente);  
                
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                
                modelo.addRow(datos);
                
            }
            tbl_pedidos.setModel(modelo);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            conexion.cerrarConexion();
        }
        
    }
    
    public void añadirPedido(TPedido p,JTable tbl_pedidos) throws SQLException{
        
        Conexion_DB conexion = new Conexion_DB();
          
        String sql = " insert into pedidos (num_factura, fecha_factura, fecha_venta, id_cliente, tipo_pago, fecha_entrega, estado_pedido) values (?,?,?,?,?,?,?)";
        
        try{
            CallableStatement cs = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD).prepareCall(sql);
            
            cs.setString(1, p.getNum_factura());
            cs.setDate(2, java.sql.Date.valueOf(p.getFecha_factura())); // Tengo que convertir el LocalDate en --> java.sql.Date.valueOf(localdate)
            cs.setDate(3, java.sql.Date.valueOf(p.getFecha_venta()));
            cs.setInt(4, p.getId_cliente());
            cs.setObject(5, p.getTipo_pago().name(), java.sql.Types.OTHER); // Envio el valor como ENUM Types.OTHER
            cs.setDate(6, java.sql.Date.valueOf(p.getFecha_entrega()));
            cs.setObject(7, p.getEstado_pedido().name(), java.sql.Types.OTHER); // Envio el valor como ENUM Types.OTHER
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Pedido añadido con exito", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
            
            listarPedidos(tbl_pedidos); // Para que se actualice la tabla despues de insertar y se vea
            
        }catch(Exception e){
             System.out.println("Error en añadir pedido" + e.getMessage());
             JOptionPane.showMessageDialog(null, "Error al añadir pedido", "ATENCION", JOptionPane.ERROR_MESSAGE);
        }finally{
            conexion.cerrarConexion();
        }
        
    }
    
    public void seleccionarPedido(JTable tbl_pedidos, JTextField num_factura, JDateChooser fecha_factura , JDateChooser fecha_venta , JTextField id_cliente , JComboBox tipo_pago ,
            JDateChooser fecha_entrega ,JComboBox estado_pedido, JTextField txt_id_pedido ){
        
        try{
            int fila_seleccionada = tbl_pedidos.getSelectedRow();
            
            if(fila_seleccionada != -1){
                num_factura.setText(tbl_pedidos.getValueAt(fila_seleccionada, 1).toString());
                
                fecha_factura.setDate(toDate(tbl_pedidos.getValueAt(fila_seleccionada, 2).toString()));
                fecha_venta.setDate(toDate(tbl_pedidos.getValueAt(fila_seleccionada, 3).toString()));
                
                 // En la tabla tengo el nombre del cliente
                String nombreCliente = tbl_pedidos.getValueAt(fila_seleccionada, 4).toString();

                // lo convertimos a ID
                String idReal = obtenerIdClientePorNombre(nombreCliente);
                
                // y esto es lo que ponemos en el JTextField (numeero)
                id_cliente.setText(idReal);
                
                tipo_pago.setSelectedItem(tbl_pedidos.getValueAt(fila_seleccionada, 5).toString());
                
                fecha_entrega.setDate(toDate(tbl_pedidos.getValueAt(fila_seleccionada, 6).toString()));
                
                estado_pedido.setSelectedItem(tbl_pedidos.getValueAt(fila_seleccionada, 7).toString());
                
                txt_id_pedido.setText(tbl_pedidos.getValueAt(fila_seleccionada, 0).toString());
            }
            
        }catch (Exception ex){
            System.out.println("Error al seleccionar la fila" + ex.getMessage());
        }
        
    }
    
    // Metodo para convertir mi fecha que se guarda en String en la tabla a Date del JDateChooser
    private Date toDate(String fecha) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
            sdf.setLenient(false);
            return sdf.parse(fecha);
        } catch (Exception e) {
            return null;
        }
    }
    
    public void modificarPedido (TPedido p, JTable tbl_pedidos) throws SQLException{
        
        Conexion_DB conexion = new Conexion_DB();
        
        String sql = "update pedidos set num_factura = ?, fecha_factura = ?, fecha_venta = ?, id_cliente = ?, tipo_pago = ?, fecha_entrega = ?, estado_pedido = ? where id_pedido = ? ";
        
        try{
            CallableStatement cs = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD).prepareCall(sql);
            
            cs.setString(1, p.getNum_factura());
            cs.setDate(2, java.sql.Date.valueOf(p.getFecha_factura())); // Tengo que convertir el LocalDate en --> java.sql.Date.valueOf(localdate)
            cs.setDate(3, java.sql.Date.valueOf(p.getFecha_venta()));
            cs.setInt(4, p.getId_cliente());
            cs.setObject(5, p.getTipo_pago().name(), java.sql.Types.OTHER); // Envio el valor como ENUM Types.OTHER
            cs.setDate(6, java.sql.Date.valueOf(p.getFecha_entrega()));
            cs.setObject(7, p.getEstado_pedido().name(), java.sql.Types.OTHER); // Envio el valor como ENUM Types.OTHER
            cs.setInt(8, p.getId_pedido());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Pedido modificado con exito", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
            
            listarPedidos(tbl_pedidos); // Para que se actualice la tabla despues de insertar y se vea
            
        }catch(Exception e){
            System.out.println("Error al modificar cliente" + e.getMessage());
        }finally{
            conexion.cerrarConexion();
        }      
    }
    
    public void exportarPedidos(String ruta, JTable tbl_pedidos){
        
        try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {

           TableModel model = tbl_pedidos.getModel();
           int colCount = model.getColumnCount();
           int rowCount = model.getRowCount();

           // CABECERAS
           for (int col = 0; col < colCount; col++) {
               pw.print(model.getColumnName(col));
               if (col < colCount - 1) {
                   pw.print(";");  // Separo asi poque excel usa ; como separador estandar
               }
           }
           pw.println();

           // FILAS
           for (int row = 0; row < rowCount; row++) {
               for (int col = 0; col < colCount; col++) {
                   Object valor = model.getValueAt(row, col);
                   String texto = (valor != null) ? valor.toString() : "";

                   pw.print(texto);

                   if (col < colCount - 1) {
                       pw.print(";");  
                   }
               }
               pw.println();  
           }

           JOptionPane.showMessageDialog(null, "Se ha exportado con éxito");

       } catch (IOException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       }
    }    
    
    // Obtengo el nombre real del cliente para poder mostrarlo en mi tabla de pedidos
    public String obtenerNombreCliente(String idCliente) throws SQLException {
        
        String nombre = "";
        Conexion_DB conexion = new Conexion_DB();
        
        String sql = "SELECT nombre_comercial FROM clientes WHERE id_cliente = " + idCliente;

        try {
            Statement st = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD).createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                nombre = rs.getString(1);
            }

        } catch (Exception e) {
            System.out.println("Error obteniendo nombre de cliente: " + e.getMessage());
        } finally {
            conexion.cerrarConexion();
        }

        return nombre;
    }
    
    // Como yo trabajo con id vuelvo a convertir el nombre del cliente en el id para rellenar mi Input txt_id_cliente
    public String obtenerIdClientePorNombre(String nombreCliente) throws SQLException {
        String id = "";
        Conexion_DB conexion = new Conexion_DB();

        String sql = "SELECT id_cliente FROM clientes WHERE nombre_comercial = '" + nombreCliente + "'";

        try {
            Statement st = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD).createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                id = rs.getString(1);
            }

        } catch (Exception e) {
            System.out.println("Error obteniendo id de cliente: " + e.getMessage());
        } finally {
            conexion.cerrarConexion();
        }

        return id;
    }    
    
}
