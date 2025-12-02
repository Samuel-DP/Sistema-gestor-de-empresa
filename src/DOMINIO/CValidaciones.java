
package DOMINIO;

import DAO.Conexion_DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class CValidaciones {
    
    public boolean validarDniNif(String dni) {
        
        if (dni == null || dni.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El DNI/NIF no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        dni = dni.trim().toUpperCase();

        // DNI 8 números + letra 
        if (dni.matches("\\d{8}[A-Z]")) {

            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            int numero = Integer.parseInt(dni.substring(0, 8));
            char letraCorrecta = letras.charAt(numero % 23);
            char letraUsuario = dni.charAt(8);

            if (letraUsuario != letraCorrecta) {
                JOptionPane.showMessageDialog(null, "La letra del DNI no es correcta. Debe ser: " + letraCorrecta, "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            return true; // DNI válido
        }

        // CIF/NIF de empresa: letra inicial + 7 dígitos + dígito/letra
        if (dni.matches("^[ABCDEFGHJKLMNPQRSUVW]\\d{7}[0-9A-J]$")) {
            return true; 
        }

        JOptionPane.showMessageDialog(null, "Formato incorrecto de DNI/NIF.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public boolean validarCorreo(String correo){
        
        if(correo == null || correo.trim().isEmpty()){
            return false;
        }
        
        // Expresion para validar correos comunes
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        
        if(!correo.matches(regex)){
            JOptionPane.showMessageDialog(null, "Error correo mal escrito", "ATENCION", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
        
    }
    
    public boolean salarioValido(double salario){
    
        if(salario <= 15000 || salario > 60000 ){
            JOptionPane.showMessageDialog(null, "El salario debe ser > 15000 o menor a 60k", "Atencion", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    public void soloNumeros(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        
            // Permitir borrar y suprimir
        if (c == java.awt.event.KeyEvent.VK_BACK_SPACE || c == java.awt.event.KeyEvent.VK_DELETE) {
            return;
        }
        
        if(!Character.isDigit(c)){
            evt.consume(); // no permite escribir letras 
            JOptionPane.showMessageDialog(null, "Solo se permiten numeros ", "Atencion", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //Comprueba NIF duplicados EN CLIENTES 
    public boolean yaExisteNif(String nif) {
        
        if (nif == null || nif.trim().isEmpty()) return false;

        String sql = "SELECT 1 FROM clientes WHERE nif = ? LIMIT 1";

        try (Connection cn = new Conexion_DB().getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD);
                
            PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, nif.trim());

            try (ResultSet rs = ps.executeQuery()) {
                boolean existe = rs.next();
                if (existe) {
                    javax.swing.JOptionPane.showMessageDialog(null, "El NIF " + nif + " ya existe en la base de datos.", "NIF duplicado", javax.swing.JOptionPane.WARNING_MESSAGE );
                }
                return existe;
            }

        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error consultando el NIF: " + e.getMessage(), "Error de base de datos", javax.swing.JOptionPane.ERROR_MESSAGE );
            return false;
        }
    }
    
    // COMPRUEBA CORRREO DUPLICADOS EN CLIENTES 
    public boolean yaExisteCorreo(String correo) {

        if (correo == null || correo.trim().isEmpty()) {
            return false; // no validamos aquí formato, solo existencia
        }

        String sql = "SELECT 1 FROM clientes WHERE correo = ? LIMIT 1";

        try (Connection cn = new Conexion_DB().getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD);
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, correo.trim());

            try (ResultSet rs = ps.executeQuery()) {
                boolean existe = rs.next();

                if (existe) {
                    JOptionPane.showMessageDialog( null, "El correo " + correo + " ya está registrado.", "Correo duplicado", JOptionPane.WARNING_MESSAGE );
                }

                return existe;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog( null, "Error consultando el correo: " + e.getMessage(), "Error de base de datos", JOptionPane.ERROR_MESSAGE );
            return false;
        }
    }
        
        // COMPRUEBA CORREOS DUPLICADOS EN EMPLEADOS
    public boolean yaExisteCorreoEmpleado(String correo) {

        if (correo == null || correo.trim().isEmpty()) {
            return false; // No validamos formato aquí, solo existencia en la DB
        }

        String sql = "SELECT 1 FROM empleados WHERE correo = ? LIMIT 1";

        try (Connection cn = new Conexion_DB().getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD);
            PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, correo.trim());

            try (ResultSet rs = ps.executeQuery()) {
                boolean existe = rs.next();

                if (existe) {
                    JOptionPane.showMessageDialog(null,"El correo " + correo + " ya está registrado en empleados.", "Correo duplicado", JOptionPane.WARNING_MESSAGE );
                }

                return existe;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error consultando el correo: " + e.getMessage(), "Error de base de datos", JOptionPane.ERROR_MESSAGE );
            return false;
        }
    }
    
    // COMPRUEBA DNI EXISTENTES EN EMPEADOS
    public boolean yaExisteDniEmpleado(String dni) {

        if (dni == null || dni.trim().isEmpty()) return false;

        String sql = "SELECT 1 FROM empleados WHERE dni = ? LIMIT 1";

        try (Connection cn = new Conexion_DB().getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD);
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, dni.trim());

            try (ResultSet rs = ps.executeQuery()) {
                boolean existe = rs.next();
                if (existe) {
                    javax.swing.JOptionPane.showMessageDialog(null, "El DNI " + dni + " ya existe en la base de datos.","DNI duplicado",javax.swing.JOptionPane.WARNING_MESSAGE);
                }
                return existe;
            }

        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error consultando el DNI: " + e.getMessage(),  "Error de base de datos",javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean SkuUnico(String sku) {

        if (sku == null || sku.trim().isEmpty()) return false;

        String sql = "SELECT 1 FROM productos WHERE sku = ? LIMIT 1";

        try (Connection cn = new Conexion_DB().getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD);
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, sku.trim());

            try (ResultSet rs = ps.executeQuery()) {
                boolean existe = rs.next();

                if (existe) {
                    javax.swing.JOptionPane.showMessageDialog(null,"El SKU " + sku + " ya existe en la base de datos.","SKU duplicado",javax.swing.JOptionPane.WARNING_MESSAGE);
                }
                return existe;
            }

        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error consultando el SKU: " + e.getMessage(), "Error de base de datos",javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean codigoBarrasUnico(String cod) {

        if (cod == null || cod.trim().isEmpty()) return false;

        String sql = "SELECT 1 FROM productos WHERE codigo_barras = ? LIMIT 1";

        try (Connection cn = new Conexion_DB().getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD);
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, cod.trim());

            try (ResultSet rs = ps.executeQuery()) {
                boolean existe = rs.next();

                if (existe) {
                    javax.swing.JOptionPane.showMessageDialog(null,"El codido de barras " + cod + " ya existe en la base de datos.","codido de barras duplicado",javax.swing.JOptionPane.WARNING_MESSAGE);
                }
                return existe;
            }

        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error consultando el codido de barras: " + e.getMessage(), "Error de base de datos",javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean yaExisteFactura(String factura) {

       if (factura == null || factura.trim().isEmpty()) return false;

       String sql = "SELECT 1 FROM pedidos WHERE num_factura = ? LIMIT 1";

       try (Connection cn = new Conexion_DB().getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD);
            PreparedStatement ps = cn.prepareStatement(sql)) {

           ps.setString(1, factura.trim());

           try (ResultSet rs = ps.executeQuery()) {
               boolean existe = rs.next();

               if (existe) {
                   javax.swing.JOptionPane.showMessageDialog(null,"La factura " + factura + " ya existe en la base de datos.", "Factura duplicada",javax.swing.JOptionPane.WARNING_MESSAGE);
               }

               return existe;
           }

       } catch (SQLException e) {
           javax.swing.JOptionPane.showMessageDialog(null, "Error consultando la factura: " + e.getMessage(), "Error de base de datos",javax.swing.JOptionPane.ERROR_MESSAGE);
           return false;
       }
   }
    
    // VERIFICO SI EXISTE EL CLIENTE PARA INSERTAR UN PEDIDO
    public boolean existeCliente(int idCliente) {

        String sql = "SELECT 1 FROM clientes WHERE id_cliente = ? LIMIT 1";

        try (Connection cn = new Conexion_DB().getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD);
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, idCliente);

            try (ResultSet rs = ps.executeQuery()) {
                boolean existe = rs.next();

                if (!existe) {
                    JOptionPane.showMessageDialog(null,"No existe un cliente con el ID: " + idCliente,"Cliente no encontrado",JOptionPane.ERROR_MESSAGE);
                }

                return existe; 
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error consultando el cliente: " + e.getMessage(),"Error de Base de Datos",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    // VERIFICO SI EXISTE EL PRODUCTO ANTES DE INSERTAR UN DETALLE DE PEDIDO
    public boolean existeProducto(int idProd){
        
        String sql = "SELECT * FROM productos WHERE id_producto = ?";
        
        try(Connection cn = new Conexion_DB().getConexion(vGlobales.getCadena(), vGlobales.USER, vGlobales.PASSWORD);
             PreparedStatement ps = cn.prepareStatement(sql)) {
            
                ps.setInt (1, idProd);
                
                try(ResultSet rs = ps.executeQuery()){
                    boolean existe = rs.next();
                    
                    if(!existe){
                        JOptionPane.showMessageDialog(null,"No existe un producto con ese ID: " + idProd,"Producto no encontrado",JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
                    
                    return existe;
                }  
            
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"Error consultando el producto: " + e.getMessage(),"Error de Base de Datos",JOptionPane.ERROR_MESSAGE);
            return false;
        }
                           
    }
    
    public boolean validarStock(int stock, int stockMax, int stockMin){
        
        if(stock >= stockMax){
            JOptionPane.showMessageDialog(null, "Error, el stock no puede ser >= stock maximo", "ATENCION", JOptionPane.ERROR_MESSAGE);
            return false;
            
        }else if(stockMin >= stockMax){
            JOptionPane.showMessageDialog(null, "Error, el stock minimo no puede ser >= stock maximo", "ATENCION", JOptionPane.ERROR_MESSAGE);
            return false;
            
        }else if(stock <= stockMin ){
            JOptionPane.showMessageDialog(null, "Error, el stock no puede ser <= stock minimo", "ATENCION", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    public boolean fechaOk(Date fechaFactura, Date fechaVenta, Date fechaEntrega){
        
        if(fechaVenta.compareTo(fechaFactura) < 0){
            JOptionPane.showMessageDialog(null, "Error, la fecha de la venta no puede ser anterior a la de la factura", "ATENCION", JOptionPane.ERROR_MESSAGE);
            return false;
            
        }else if(fechaEntrega.compareTo(fechaVenta) < 0){
            JOptionPane.showMessageDialog(null,"Error: la fecha de entrega no puede ser anterior a la fecha de venta","ATENCIÓN",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
        

    public boolean fechaEmpleadosOk(Date fechaNacimiento, Date fechaAlta){
        
        if(fechaNacimiento.compareTo(fechaAlta) >= 0){
            JOptionPane.showMessageDialog(null, "Error, la fecha de nacimiento debe ser anterior a la fecha de alta", "ATENCION", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
