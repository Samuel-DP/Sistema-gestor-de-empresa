
package DOMINIO;

import DAO.Conexion_DB;
import TRANSVERSAL.TCliente;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.sql.CallableStatement;
import javax.swing.table.TableModel;

public class CClientes {
    
    public void listarClientes(JTable tbl_clientes) throws SQLException{
        
        Conexion_DB conexion = new Conexion_DB();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql = "select * from clientes";
        
        modelo.addColumn("Id cliente");
        modelo.addColumn("Razon social");
        modelo.addColumn("Nombre comercial");
        modelo.addColumn("Tipo pago");
        modelo.addColumn("Calle");
        modelo.addColumn("C. Postal");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Provincia");
        modelo.addColumn("Pais");
        modelo.addColumn("Correo");
        modelo.addColumn("Tlf");
        modelo.addColumn("Nif");
        
        String [] datos = new String[12];
        
        Statement st;
        
        try{
            st = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD).createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);
                
                modelo.addRow(datos);
            }
            tbl_clientes.setModel(modelo);
            
        }catch(SQLException ex){
            Logger.getLogger(CClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            conexion.cerrarConexion();
        }
        
    }
    
    public void seleccionarCliente(JTable tbl_clientes, JTextField txt_razon_social, JTextField txt_nombre_comercial, JComboBox cmb_tipoPago, JTextField txt_calle, 
            JTextField txt_cod_postal, JTextField txt_ciudad, JTextField txt_provincia, JTextField txt_correo, JTextField txt_tlf, JTextField txt_pais, JTextField txt_id_cliente, JTextField txt_nif ){
        
        try{
            int fila_seleccionada = tbl_clientes.getSelectedRow();
            
            if(fila_seleccionada != -1){
                
                // Esto lo pongo porque tengo algun campo que puede ser nulo como razon social y sino da error
                java.util.function.Function<Object,String> val = o -> (o == null) ? "" : o.toString();
                
                txt_id_cliente.setText(tbl_clientes.getValueAt(fila_seleccionada, 0).toString());
                
                txt_razon_social.setText(val.apply(tbl_clientes.getValueAt(fila_seleccionada, 1))); // Este dato puede ser NULO
                
                txt_nombre_comercial.setText(tbl_clientes.getValueAt(fila_seleccionada, 2).toString());
                cmb_tipoPago.setSelectedItem(tbl_clientes.getValueAt(fila_seleccionada, 3).toString());
                txt_calle.setText(tbl_clientes.getValueAt(fila_seleccionada, 4).toString());
                txt_cod_postal.setText(tbl_clientes.getValueAt(fila_seleccionada, 5).toString());
                txt_ciudad.setText(tbl_clientes.getValueAt(fila_seleccionada, 6).toString());
                txt_provincia.setText(tbl_clientes.getValueAt(fila_seleccionada, 7).toString());
                txt_pais.setText(tbl_clientes.getValueAt(fila_seleccionada, 8).toString());
                txt_correo.setText(tbl_clientes.getValueAt(fila_seleccionada, 9).toString());
                txt_tlf.setText(tbl_clientes.getValueAt(fila_seleccionada, 10).toString());
                txt_nif.setText(tbl_clientes.getValueAt(fila_seleccionada, 11).toString());
                
            }
        }catch (Exception ex){
            System.out.println("Error al seleccionar la fila " + ex.getMessage());
        }      
    }    
    
    public void añadirCliente(TCliente c, JTable tbl_clientes) throws SQLException{
        
        Conexion_DB conexion = new Conexion_DB();
    
        String sql = "INSERT INTO clientes (razon_social, nombre_comercial, tipo_pago, nombre_calle, codigo_postal, ciudad, provincia, pais, correo, telefono, nif ) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        try{
            CallableStatement cs = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD).prepareCall(sql);

            cs.setString(1, c.getRazon_social());
            cs.setString(2, c.getNombre_comercial());
            cs.setObject(3, c.getTipo_pago().name(), java.sql.Types.OTHER); // Envío enum como tipo OTHER
            cs.setString(4, c.getNombre_calle());
            cs.setInt(5, c.getCodigo_postal());
            cs.setString(6, c.getCiudad());
            cs.setString(7, c.getProvincia());
            cs.setString(8, c.getPais());          
            cs.setString(9, c.getCorreo());
            cs.setString(10, c.getTelefono());
            cs.setString(11, c.getNif());
            
            cs.execute();

            JOptionPane.showMessageDialog(null, "Cliente añadido con éxito", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);

            listarClientes(tbl_clientes); // Actualizo la tabla para mostrar el nuevo cliente

        }catch(Exception e){
            System.out.println("Error al añadir cliente: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al añadir cliente", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        }finally{
            conexion.cerrarConexion();
        } 
        
    }
    
    public void actualizarCliente(TCliente c, JTable tbl_clientes) throws SQLException{
        
        Conexion_DB conexion = new Conexion_DB();
        
        String sql = "update clientes set razon_social = ?, nombre_comercial = ?, tipo_pago = ?, nombre_calle = ?, codigo_postal = ?,"
                + " ciudad = ?, provincia = ?, pais = ?, correo = ?, telefono = ?, nif = ? where id_cliente = ?";
        
        try {
            CallableStatement cs = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD).prepareCall(sql);

            cs.setString(1, c.getRazon_social());
            cs.setString(2, c.getNombre_comercial());
            cs.setObject(3, c.getTipo_pago().name(), java.sql.Types.OTHER); // Enum como Types.OTHER
            cs.setString(4, c.getNombre_calle());
            cs.setInt(5, c.getCodigo_postal());
            cs.setString(6, c.getCiudad());
            cs.setString(7, c.getProvincia());
            cs.setString(8, c.getPais());
            cs.setString(9, c.getCorreo());
            cs.setString(10, c.getTelefono());
            cs.setString(11, c.getNif());
            cs.setInt(12, c.getId_cliente());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Cliente modificado con éxito", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);

            listarClientes(tbl_clientes); // Actualiza la tabla con los datos nuevos

        } catch (Exception e) {
            System.out.println("Error al modificar cliente: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al modificar cliente", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        } finally {
            conexion.cerrarConexion();
        }
        
    }
    
    public void exportarClientes(String ruta, JTable tbl_clientes){
        
        try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {

           TableModel model = tbl_clientes.getModel();
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
