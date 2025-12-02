
package DOMINIO;

import DAO.Conexion_DB;
import TRANSVERSAL.TEmpleado;
import com.toedter.calendar.JDateChooser;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

public class CEmpleados {
    
    public void listarEmpleados(JTable tbl_infoEmpleados) throws SQLException{
        
        Conexion_DB conexion = new Conexion_DB();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql = "select * from empleados";
        
        modelo.addColumn("Id_empleado");
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido1");
        modelo.addColumn("Apellido2");
        modelo.addColumn("Nombre calle");
        modelo.addColumn("Codigo Postal");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Provincia");
        modelo.addColumn("Pais");
        modelo.addColumn("Tlf");
        modelo.addColumn("Correo");
        modelo.addColumn("Departamento");
        modelo.addColumn("Puesto");
        modelo.addColumn("Salario");
        modelo.addColumn("D. Bancaria");
        modelo.addColumn("F. nacimiento");
        modelo.addColumn("F. alta");
        modelo.addColumn("Activo");
        
        String[] datos = new String[19];
        
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
                 datos[12] = rs.getString(13);
                 datos[13] = rs.getString(14);
                 datos[14] = rs.getString(15);
                 datos[15] = rs.getString(16);
                 datos[16] = rs.getString(17);
                 datos[17] = rs.getString(18);
                 datos[18] = rs.getString(19);
                 
                 modelo.addRow(datos);
             }
             tbl_infoEmpleados.setModel(modelo);
            
        }catch(SQLException ex){
            
        }finally{
            conexion.cerrarConexion();
        }
        
    }
    
    
    public void seleccionarEmpleado(JTable tbl_infoEmpleados, JTextField txt_nombre, JTextField txt_apellido1, JTextField txt_apellido2, JTextField txt_dni, JTextField txt_id_empleado,
            JTextField txt_nombre_calle, JTextField txt_cod_postal, JTextField txt_ciudad, JTextField txt_provincia, JTextField txt_pais, JTextField txt_tlf, JTextField txt_correo,
            JTextField txt_departamento, JTextField txt_puesto, JTextField txt_salario,  JCheckBox chbox_activo, JTextField txt_domiciliacion, JDateChooser date_fecha_nac, JDateChooser date_fecha_alta){
        
        try{
            int fila_seleccionada = tbl_infoEmpleados.getSelectedRow();
            
            if(fila_seleccionada != -1){
                // Acuerdate de seguir el orden que has seguido en las columnas de listarEmpleados
                txt_id_empleado.setText(tbl_infoEmpleados.getValueAt(fila_seleccionada, 0).toString());
                txt_dni.setText(tbl_infoEmpleados.getValueAt(fila_seleccionada, 1).toString());
                txt_nombre.setText(tbl_infoEmpleados.getValueAt(fila_seleccionada, 2).toString());
                txt_apellido1.setText(tbl_infoEmpleados.getValueAt(fila_seleccionada, 3).toString());
                txt_apellido2.setText(tbl_infoEmpleados.getValueAt(fila_seleccionada, 4).toString());
                txt_nombre_calle.setText(tbl_infoEmpleados.getValueAt(fila_seleccionada, 5).toString());
                txt_cod_postal.setText(tbl_infoEmpleados.getValueAt(fila_seleccionada, 6).toString());
                txt_ciudad.setText(tbl_infoEmpleados.getValueAt(fila_seleccionada, 7).toString()); 
                txt_provincia.setText(tbl_infoEmpleados.getValueAt(fila_seleccionada, 8).toString());
                txt_pais.setText(tbl_infoEmpleados.getValueAt(fila_seleccionada, 9).toString());
                txt_tlf.setText(tbl_infoEmpleados.getValueAt(fila_seleccionada, 10).toString());
                txt_correo.setText(tbl_infoEmpleados.getValueAt(fila_seleccionada, 11).toString());
                txt_departamento.setText(tbl_infoEmpleados.getValueAt(fila_seleccionada, 12).toString());
                txt_puesto.setText(tbl_infoEmpleados.getValueAt(fila_seleccionada, 13).toString());
                
                txt_salario.setText(tbl_infoEmpleados.getValueAt(fila_seleccionada, 14).toString());
                
                txt_domiciliacion.setText(tbl_infoEmpleados.getValueAt(fila_seleccionada, 15).toString());
            
                // Date
                date_fecha_nac.setDate(toDate(tbl_infoEmpleados.getValueAt(fila_seleccionada, 16).toString()));
                date_fecha_alta.setDate(toDate(tbl_infoEmpleados.getValueAt(fila_seleccionada, 17).toString()));
                
                // Checkbox  
                Object valor = tbl_infoEmpleados.getValueAt(fila_seleccionada, 18);
                String activo = (valor == null ? "" : valor.toString().trim().toLowerCase());
                chbox_activo.setSelected(activo.equals("t"));
      
            }else{
                System.out.println("No hay fila seleccionada");
            }
            
        }catch(Exception ex){
            System.out.println("Error al seleccionar la fila" + ex.getMessage());
        }
        
    }
    
     // Metodo para convertir mi fecha que se guarda en String en la tabla --> a Date del JDateChooser
    private Date toDate(String fecha) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // coincide con la BD
            sdf.setLenient(false);
            return sdf.parse(fecha);
        } catch (Exception e) {
            return null;
        }
    }
    
    public void insertarEmpleado(TEmpleado e, JTable tbl_infoEmpleados) throws SQLException{
        
        Conexion_DB conexion = new Conexion_DB();
          
        String sql = " insert into empleados (dni, nombre, apellido1, apellido2, nombre_calle, codigo_postal, ciudad, provincia, pais, telefono,"
                + " correo, departamento, puesto, salario, domiciliacion_bancaria, fecha_nacimiento, fecha_alta, activo) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            CallableStatement cs = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD).prepareCall(sql);

            cs.setString(1, e.getDni());
            cs.setString(2, e.getNombre());
            cs.setString(3, e.getApellido1());
            cs.setString(4, e.getApellido2());
            cs.setString(5, e.getNombre_calle());
            cs.setInt(6, e.getCodigo_postal());
            cs.setString(7, e.getCiudad());
            cs.setString(8, e.getProvincia());
            cs.setString(9, e.getPais());
            cs.setString(10, e.getTelefono());
            cs.setString(11, e.getCorreo());
            cs.setString(12, e.getDepartamento());
            cs.setString(13, e.getPuesto());
            cs.setDouble(14, e.getSalario());
            cs.setString(15, e.getDomiciliacion_bancaria());
            cs.setDate(16, java.sql.Date.valueOf(e.getFecha_nacimiento())); 
            cs.setDate(17, java.sql.Date.valueOf(e.getFecha_alta()));
            cs.setBoolean(18, e.isActivo()); // Checkbox 

            cs.execute();

            JOptionPane.showMessageDialog(null, "Empleado añadido con éxito", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);

            listarEmpleados(tbl_infoEmpleados);

        } catch (Exception ex) {
            System.out.println("Error al insertar empleado: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al añadir empleado", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        } finally {
            conexion.cerrarConexion();
        }  
    }
    
    public void modificarEmpleado(TEmpleado e, JTable tbl_infoEmpleados ) throws SQLException{
        
        Conexion_DB conexion = new Conexion_DB();
        
        String sql = "update empleados set dni = ?, nombre = ?, apellido1 = ?, apellido2 = ?, nombre_calle = ?, codigo_postal = ?, ciudad = ?, provincia = ?, pais = ?, telefono = ?,"
                + " correo = ?, departamento = ?, puesto = ?, salario = ?, domiciliacion_bancaria = ?, fecha_nacimiento = ?, fecha_alta = ?, activo = ? where id_empleado = ? ";
        
        try {
            CallableStatement cs = conexion.getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD).prepareCall(sql);

            cs.setString(1, e.getDni());
            cs.setString(2, e.getNombre());
            cs.setString(3, e.getApellido1());
            cs.setString(4, e.getApellido2());
            cs.setString(5, e.getNombre_calle());
            cs.setInt(6, e.getCodigo_postal());
            cs.setString(7, e.getCiudad());
            cs.setString(8, e.getProvincia());
            cs.setString(9, e.getPais());
            cs.setString(10, e.getTelefono());
            cs.setString(11, e.getCorreo());
            cs.setString(12, e.getDepartamento());
            cs.setString(13, e.getPuesto());
            cs.setDouble(14, e.getSalario());
            cs.setString(15, e.getDomiciliacion_bancaria());
            cs.setDate(16, java.sql.Date.valueOf(e.getFecha_nacimiento()));
            cs.setDate(17, java.sql.Date.valueOf(e.getFecha_alta()));
            cs.setBoolean(18, e.isActivo());
            cs.setInt(19, e.getId_empleado());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Empleado modificado con éxito", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);

            listarEmpleados(tbl_infoEmpleados);

        } catch (Exception ex) {
            System.out.println("Error al modificar empleado: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al modificar empleado", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        } finally {
            conexion.cerrarConexion();
        }
        
    }
    
    public void exportarEmpleados(String ruta, JTable tbl_empleados){
        
        try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {

           TableModel model = tbl_empleados.getModel();
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
