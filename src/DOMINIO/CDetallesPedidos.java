
package DOMINIO;

import DAO.Conexion_DB;
import TRANSVERSAL.TDetallesPedidos;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.CallableStatement;
import javax.swing.table.TableModel;

public class CDetallesPedidos {
   
    
    public void listarDetallesPedidos(JTable tbl_detalles, String idPedidoStr) throws SQLException {

        Conexion_DB conexion = new Conexion_DB();

        DefaultTableModel modelo = new DefaultTableModel();
        
        int idPedido = Integer.parseInt(idPedidoStr.trim());

        String sql = "SELECT id_producto, cantidad, precio_unit, iva, descuento FROM detalles_pedidos WHERE id_pedido = ? "; 

        modelo.addColumn("Id producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio ud");
        modelo.addColumn("Iva");
        modelo.addColumn("Descuento");

        String[] datos = new String[5];

        try {
            // ESTA CONSULTA SI O SI LA TENGO QUE HACER CON PREPAREDSTATEMENT YA QUE LE TENGO QUE PASAR EL PARAMETRO ID_PEDIDO, SINO DA ERROR CON EL CALLABLESTATEMENT
            
            Connection con = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);   // AQUI LE PASO EL ID_PEDIDO AL ? 

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                String idProducto = rs.getString(1);
                 
                datos[0] = obtenerNombreProducto(idProducto);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3); 
                datos[3] = rs.getString(4); 
                datos[4] = rs.getString(5); 

                modelo.addRow(datos);
            }

            tbl_detalles.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(CDetallesPedidos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexion.cerrarConexion();
        }
    }
    
    public void seleccionarDetallesPedidos(JTable tbl_detalles, JTextField id_producto, JTextField txt_cantidad, 
            JTextField txt_precio, JComboBox cmb_tipoIva, JTextField txt_descuento){
        
        try {
            int fila = tbl_detalles.getSelectedRow();

            if (fila != -1) {
                
                // En la tabla tengo el nombre del producto
                String nombreProducto = tbl_detalles.getValueAt(fila, 0).toString();
                
                // Lo convierto en ID para el formulario
                String idProducto = obtenerIdProductoPorNombre(nombreProducto);
                id_producto.setText(idProducto);
                
                txt_cantidad.setText(tbl_detalles.getValueAt(fila, 1).toString());
                txt_precio.setText(tbl_detalles.getValueAt(fila, 2).toString());
                
                cmb_tipoIva.setSelectedItem(tbl_detalles.getValueAt(fila, 3).toString());
                
                txt_descuento.setText(tbl_detalles.getValueAt(fila, 4).toString());
            }

        } catch (Exception ex) {
            System.out.println("Error al seleccionar detalle: " + ex.getMessage());
        }
        
    }
    
    public void anadirDetallePedido(JTable tbl_detalles, TDetallesPedidos d) throws SQLException{
        Conexion_DB conexion = new Conexion_DB();
    
        String sql = "INSERT INTO detalles_pedidos (id_pedido, id_producto, cantidad, precio_unit, iva, descuento) VALUES (?,?,?,?,?,?)";

        try {    
            CallableStatement cs = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD).prepareCall(sql);
            
            cs.setInt(1, d.getId_pedido());
            cs.setInt(2, d.getId_producto());
            cs.setInt(3, d.getCantidad());
            cs.setDouble(4, d.getPrecio_unit());
            cs.setObject(5, d.getIva().name(), java.sql.Types.OTHER); 
            cs.setDouble(6, d.getDescuento());

            cs.execute();

            JOptionPane.showMessageDialog(null,"Detalle de pedido añadido con éxito","ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
            

            listarDetallesPedidos(tbl_detalles, String.valueOf(d.getId_pedido()));

        } catch (Exception e) {
            System.out.println("Error en añadir detalle de pedido: " + e.getMessage());
            JOptionPane.showMessageDialog(null,"Error al añadir detalle de pedido, ya existe un producto con ese ID añadido, actualice la cantidad si quiere ","ATENCIÓN",JOptionPane.ERROR_MESSAGE);
        } finally {
            conexion.cerrarConexion();
        }
    }
    
    public void modificarDetalles(TDetallesPedidos d, int idProdOriginal, JTable tbl_detalles) throws SQLException{
        Conexion_DB conexion = new Conexion_DB();
    
        String sql = "update detalles_pedidos set id_producto = ?, cantidad = ?, precio_unit = ?, iva = ?, descuento = ? where id_pedido = ? and id_producto = ?";

        try{
            CallableStatement cs = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD).prepareCall(sql);

            cs.setInt(1, d.getId_producto()); // El nuevo id producto
            cs.setInt(2, d.getCantidad());
            cs.setDouble(3, d.getPrecio_unit());
            cs.setObject(4, d.getIva().name(), java.sql.Types.OTHER);
            cs.setDouble(5, d.getDescuento());
            cs.setInt(6, d.getId_pedido());
            cs.setInt(7, idProdOriginal); //  id producto original para el WHERE

            cs.execute();

            JOptionPane.showMessageDialog(null, "Detalle modificado con éxito", "ATENCION", JOptionPane.INFORMATION_MESSAGE);

            listarDetallesPedidos(tbl_detalles, String.valueOf(d.getId_pedido()));

        }catch(Exception e){
            System.out.println("Error al modificar detalle " + e.getMessage());
        }finally{
            conexion.cerrarConexion();
        }
    }
    
    public void exportarDetalles(String ruta, JTable tbl_detalles){
        
        try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {

           TableModel model = tbl_detalles.getModel();
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
    
    // Obtengo el nombre real del producto para poder mostrarlo en mi tabla de detalles
    public String obtenerNombreProducto(String idProducto) throws SQLException {
        
        String nombre = "";
        Conexion_DB conexion = new Conexion_DB();
        
        String sql = "SELECT nombre FROM productos WHERE id_producto = " + idProducto;

        try {
            Statement st = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD).createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                nombre = rs.getString(1);
            }

        } catch (Exception e) {
            System.out.println("Error obteniendo nombre de producto: " + e.getMessage());
        } finally {
            conexion.cerrarConexion();
        }

        return nombre;
    }
    
    // Como yo trabajo con id, vuelvo a convertir el nombre del prodcuto en el id para rellenar mi Input txt_id_producto
    public String obtenerIdProductoPorNombre(String nombreProducto) throws SQLException {
        String id = "";
        Conexion_DB conexion = new Conexion_DB();

        String sql = "SELECT id_producto FROM productos WHERE nombre = '" + nombreProducto + "'";

        try {
            Statement st = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD).createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                id = rs.getString(1);
            }

        } catch (Exception e) {
            System.out.println("Error obteniendo id de producto: " + e.getMessage());
        } finally {
            conexion.cerrarConexion();
        }

        return id;
    }        
    
}
