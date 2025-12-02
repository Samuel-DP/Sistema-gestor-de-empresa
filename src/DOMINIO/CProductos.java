
package DOMINIO;
import DAO.Conexion_DB;
import TRANSVERSAL.TProducto;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;
import javax.swing.table.TableModel;

public class CProductos {
    
    public void listarProductos(JTable tbl_productos) throws SQLException{
        
        Conexion_DB conexion = new Conexion_DB();
    
        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "SELECT * FROM productos";

        modelo.addColumn("Id producto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripción");
        modelo.addColumn("Marca");
        modelo.addColumn("Ud. venta");
        modelo.addColumn("Código barras");
        modelo.addColumn("SKU");
        modelo.addColumn("Estado");
        modelo.addColumn("Stock");
        modelo.addColumn("Stock máximo");
        modelo.addColumn("Stock mínimo");

        String[] datos = new String[11];

        Statement st;

        try {
            st = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD).createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString("id_producto");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("descripcion");
                datos[3] = rs.getString("marca");
                datos[4] = rs.getString("ud_venta");
                datos[5] = rs.getString("codigo_barras");
                datos[6] = rs.getString("sku");
                datos[7] = rs.getBoolean("estado") ? "Activo" : "Inactivo"; // convierte el boolean a texto
                datos[8] = rs.getString("stock");
                datos[9] = rs.getString("stock_max");
                datos[10] = rs.getString("stock_min");

                modelo.addRow(datos);
            }
            tbl_productos.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(CProductos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexion.cerrarConexion();
        }
        
    }
    
    public void seleccionarProductos(JTable tbl_productos, JTextField txt_id_producto,JTextField txt_nombre, JTextField txt_descripcion, JTextField ud_venta, JTextField txt_cod_barras, JCheckBox chbox_activo, 
            JTextField txt_marca, JTextField txt_sku, JTextField txt_stock, JTextField txt_stock_max, JTextField txt_stock_min){
    
        try{
            int fila = tbl_productos.getSelectedRow();
            if (fila != -1){
                
                txt_id_producto.setText(tbl_productos.getValueAt(fila, 0).toString());
                txt_nombre.setText(tbl_productos.getValueAt(fila, 1).toString());
                txt_descripcion.setText(tbl_productos.getValueAt(fila, 2).toString());
                txt_marca.setText(tbl_productos.getValueAt(fila, 3).toString());
                ud_venta.setText(tbl_productos.getValueAt(fila, 4).toString());
                txt_cod_barras.setText(tbl_productos.getValueAt(fila, 5).toString());
                txt_sku.setText(tbl_productos.getValueAt(fila, 6).toString());

                // Checkbox
                Object valor = tbl_productos.getValueAt(fila, 7);
                String activo = (valor == null ? "" : valor.toString().trim().toLowerCase());
                chbox_activo.setSelected(activo.equals("activo"));

                txt_stock.setText(tbl_productos.getValueAt(fila, 8).toString());
                txt_stock_max.setText(tbl_productos.getValueAt(fila, 9).toString());
                txt_stock_min.setText(tbl_productos.getValueAt(fila, 10).toString());
            }
        }catch (Exception ex){
            System.out.println("Error al seleccionar la fila " + ex.getMessage());
        }
        
    }
    
    public void añadirProductos(TProducto p, JTable tbl_productos) throws SQLException{
        
        Conexion_DB conexion = new Conexion_DB();
        
        String sql = "insert into productos (nombre, descripcion, marca, ud_venta, codigo_barras, sku, estado, stock, stock_max, stock_min) values (?,?,?,?,?,?,?,?,?,?)";
        
        try {
            CallableStatement cs = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD).prepareCall(sql);

            cs.setString(1, p.getNombre());
            cs.setString(2, p.getDescripcion());
            cs.setString(3, p.getMarca());
            cs.setString(4, p.getUd_venta());
            cs.setString(5, p.getCodigo_barras());
            cs.setString(6, p.getSku());
            cs.setBoolean(7, p.isEstado()); 
            cs.setInt(8, p.getStock());
            cs.setInt(9, p.getStock_max());
            cs.setInt(10, p.getStock_min());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Producto añadido con éxito", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);

            listarProductos(tbl_productos); // actualiza la tabla

        } catch (Exception e) {
            System.out.println("Error al añadir producto: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al añadir producto", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        } finally {
            conexion.cerrarConexion();
        }
        
    }
    
    public void modificarProducto(TProducto p, JTable tbl_productos) throws SQLException{
               
        Conexion_DB conexion = new Conexion_DB();
    
        String sql = "UPDATE productos SET nombre = ?, descripcion = ?, marca = ?, ud_venta = ?, "
                   + "codigo_barras = ?, sku = ?, estado = ?, stock = ?, stock_max = ?, stock_min = ? "
                   + "WHERE id_producto = ?";

        try{
            CallableStatement cs = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD).prepareCall(sql);

            cs.setString(1, p.getNombre());
            cs.setString(2, p.getDescripcion());
            cs.setString(3, p.getMarca());
            cs.setString(4, p.getUd_venta());
            cs.setString(5, p.getCodigo_barras());
            cs.setString(6, p.getSku());
            cs.setBoolean(7, p.isEstado());
            cs.setInt(8, p.getStock());
            cs.setInt(9, p.getStock_max());
            cs.setInt(10, p.getStock_min());
            cs.setInt(11, p.getId_producto());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Producto modificado con éxito", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);

            listarProductos(tbl_productos); // Actualiza la tabla después del update

        }catch(Exception e){
            System.out.println("Error al modificar producto: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al modificar producto", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        }finally{
            conexion.cerrarConexion();
        }
        
    }
    
    public void exportarProductos(String ruta, JTable tbl_productos){
        
        try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {

           TableModel model = tbl_productos.getModel();
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
    
}
