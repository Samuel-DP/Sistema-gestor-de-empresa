package CLASESOBSOLETAS;
/*
import DOMINIO.*;
import TRANSVERSAL.Empleado;
import TRANSVERSAL.Cliente;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Agenda {
    private Cliente[] clientes;
    private Empleado[] empleados;

    //Constructores
    
    public Agenda(){
        this.clientes = new Cliente[10];
        this.empleados = new Empleado[100];
    }
    
    public Agenda(int num){
        this.clientes = new Cliente[num];
        this.empleados = new Empleado[num];
    }
    
    public Cliente[] getClientes(){
        return clientes;
    }
    
    public Empleado[] getEmpleados(){
        return empleados;
    }
    
    //Primero tengo que comprobar si el cliente existe 
    
    public boolean existeCliente(Cliente c){
        for(int i = 0; i < clientes.length; i++){
            //Controlo los contactos nulos
            if(clientes[i] != null && clientes[i].equals(c)){
                return true;
            }
        } 
        return false;
    }
    
    public boolean agendaLlena(){
        for(int i = 0; i < clientes.length; i++){
            if(clientes[i] == null){ //tengo sitio para guardar el contacto
                return false;
            }
        }
        return true;
    }
    
    public void addClientes(Cliente c){
        if(existeCliente(c)){
            JOptionPane.showMessageDialog(null, "El cliente ya existe", "ATENCION!!", JOptionPane.INFORMATION_MESSAGE);
        }else if(agendaLlena()){
            JOptionPane.showMessageDialog(null, "Agenda llena de clientes, no se puede añadir", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
        }else{
            boolean encontrado = false;
            for(int i = 0; i < clientes.length && !encontrado ; i++){
                if(clientes[i] == null){
                    clientes[i] = c;
                    encontrado = true;
                }
            }
            if(encontrado){
                JOptionPane.showMessageDialog(null, "Contacto añadido con exito", "ATENCION", JOptionPane.INFORMATION_MESSAGE );
            }else{
                JOptionPane.showMessageDialog(null, "No se ha podido añadir el contacto", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    //Metodo para eliminar contacto 
    public void delCliente(Cliente c){
        
        boolean encontrado = false;
        
        for(int i = 0; i < clientes.length && !encontrado; i++){
            if(clientes[i] != null && clientes[i].equals(c)){
                clientes[i] = null; // lo borro
                encontrado = true;
            }
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, "Contacto eliminado con exito", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "No se ha podido eliminar", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public boolean actualizarCliente(String dniClave ,String nuevoNombre, String nuevoApellido, String nuevoDni,  String nuevaDireccion, String nuevoTelefono, String nuevoCorreo  ){
        if(dniClave == null){
            return false;
        }
        String clave = dniClave.trim();
        
        if(clientes == null || clientes.length == 0){
            return false;
        }
        
        String ndni = (nuevoDni == null) ? "" : nuevoDni.trim();
        
        // Solo validar duplicados si el dni cambia y no esta vacio
        if(!ndni.isEmpty() && !ndni.equalsIgnoreCase(clave)){
            for(Cliente c : clientes){
                if(c != null && c.getDni_nif() != null && c.getDni_nif().trim().equalsIgnoreCase(ndni) ){
                    //YA exite un cliente con ese DNI
                    return false; 
                }
            }
        }
        
        // Buscar el cliente por la clave, dni original
        for(int i = 0; i < clientes.length; i++){
            Cliente c = clientes[i];
            if (c != null && c.getDni_nif() != null && c.getDni_nif().trim().equalsIgnoreCase(clave)){
                
                c.setNombre(nuevoNombre);
                c.setApellido(nuevoApellido);
                
                if (!ndni.isEmpty()){
                    c.setDni_nif(ndni);
                }
                
                c.setDireccion(nuevaDireccion);
                c.setTelefono(nuevoTelefono);
                c.setCorreo(nuevoCorreo);
                return true;
            }
        }
        return false;
       
    } 
   
    public boolean validarDniNif(String dni) {
        
        if (dni == null || dni.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El DNI/NIF no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        dni = dni.trim().toUpperCase();

        // Comprobar el formato que son 8 números + 1 letra
        if (!dni.matches("\\d{8}[A-Z]")) {
            JOptionPane.showMessageDialog(null, "Formato incorrecto.EL DNI Debe tener 8 números y una letra (ejemplo: 12345678A).", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Calcular letra correcta
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numero = Integer.parseInt(dni.substring(0, 8));
        char letraCorrecta = letras.charAt(numero % 23);
        char letraUsuario = dni.charAt(8);

        if (letraUsuario != letraCorrecta) {
            JOptionPane.showMessageDialog(null, "La letra del DNI/NIF no es correcta.\nDebería ser: " + letraCorrecta, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
    
    //Comprueba los duplicados
    public boolean existeClientePorDni(String dni) {
        if (dni == null || clientes == null){
            return false;
        }
        
        String buscar = dni.trim().toUpperCase();
        
        for (Cliente c : clientes) {
            if (c != null && c.getDni_nif() != null && c.getDni_nif().trim().toUpperCase().equals(buscar)) {
                return true;
            }
        }
        return false;
    }
    
    
    public void importarClientes(String ruta) {
        int importados = 0;
        
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))){
            
            while(true){
                try{
                    Object obj = ois.readObject();
                    if(obj instanceof Cliente){ // Comprobamos que el objeto leido sea un cliente
                        Cliente aux = (Cliente) obj; // Se convierte a tipo cliente con (Cliente) obj
                        if(!existeClientePorDni(aux.getDni_nif())){
                            addClientes(aux);
                            importados++;
                        }  
                    }
                    
                    JOptionPane.showMessageDialog(null, "Se ha importado con exito");
                    
                }catch(EOFException ex){    // Exception para end of File, se usa para saber que hemos llegado al final del archivo y hacemos break para salir del bucle.
                    break;
                }
                
            }
        } catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void exportarClientes(String ruta){
        
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))){
            //Recorrer contactos de la agenda
            for(int i = 0; i < clientes.length; i++){
                //Leemos los q  no son nulos
                if(clientes[i] != null){
                    oos.writeObject(clientes[i]);
                }
            }
            
            JOptionPane.showMessageDialog(null, "Se ha exportado con exito");
            
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }    
    }
    
    //ME FALTAN METODO PARA VALIDAR EL NIF(nº identificacion fiscal) Y EL DNI MIRAR que es el mismo nº para personas fisicas por lo q me basta un metdod para los dos. OK
    
    
    
    // CODIGO EMPLEADOS DESDE AQUI
    
    public boolean agendaEmpLlena(){
        for(int i = 0; i < empleados.length; i++){
            if(empleados[i] == null){
                return false;
            }
        }
        return true;   
    }
    
    public boolean existeEmpleado(Empleado e){
        for(int i = 0; i < empleados.length; i++){
            if(empleados[i] != null && empleados[i].equals(e))
                return true;
        }
        return false;
    }
    
    public void añadirEmpleado(Empleado e){
        
        boolean existe = existeEmpleado(e);
        
        if(existe){
            JOptionPane.showMessageDialog(null, "El empleado ya existe", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(agendaEmpLlena()){
            JOptionPane.showMessageDialog(null, "Agenda empleados llena, no se piuede añadir");    
        } else{
            boolean encontrado = false;
            for(int i = 0; i < empleados.length && !encontrado; i++){
                if(empleados[i] == null){
                    empleados[i] = e;
                    encontrado = true;
                }
            }
            if(encontrado){
                JOptionPane.showMessageDialog(null, "Empleado añadido con exito", "ATENCION", JOptionPane.INFORMATION_MESSAGE); 
            }else{
                JOptionPane.showMessageDialog(null, "No se ha podido añadir el empleado", "ATENCION", JOptionPane.INFORMATION_MESSAGE); 
            }
        } 
    }
    
    // Compruebo si mi empleado ya existe por dni
    public boolean existeEmp(String dni){
        
        for(int i = 0; i < empleados.length; i++){
            if(empleados[i] != null && empleados[i].getDni().equalsIgnoreCase(dni)){ // 
                return true;
            }
        }
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
    
    public void eliminarEmp(Empleado e){
        
        boolean encontrado = false;
        
        for(int i = 0; i < empleados.length && !encontrado; i++){
            if(empleados[i] != null && empleados[i].equals(e)){
                empleados[i] = null; // Lo borro
                encontrado = true;
            }
        }
        if(encontrado){
            
            JOptionPane.showMessageDialog(null, "Empleado eliminado con exito", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo eliminar", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public boolean actualizarEmpleado(String dniClave, String nuevo_id_emp, String nuevo_nombre, String nuevo_apellido, String nuevo_dni, String nuevo_puesto, Double nuevo_sueldo,
    String nuevo_departamento, String nuevo_fecha_alta, String nuevo_fecha_baja, String nuevo_telefono, String nuevo_correo, String nuevo_direccion){
        
        if(dniClave == null){
            return false;
        }
        
        String clave = dniClave.trim();
        
        if(empleados == null || empleados.length == 0){
            return false;
        }
        
        String ndni = (nuevo_dni == null) ? "" : nuevo_dni.trim();
        
        // Solo validar duplicados si el dni cambia y no esta vacio
        if(!ndni.isEmpty() && !ndni.equalsIgnoreCase(clave)){
            for(Empleado e : empleados){
                if(e != null && e.getDni() != null && e.getDni().trim().equalsIgnoreCase(ndni) ){
                    //YA exite un cliente con ese DNI
                    return false; 
                }
            }
        }
        
        // Buscar el empleado por la clave, dni original
        for(int i = 0; i < empleados.length; i++){
            Empleado e = empleados[i];
            if (e != null && e.getDni() != null && e.getDni().trim().equalsIgnoreCase(clave)){
                
                e.setIdEmp(nuevo_id_emp);
                e.setNombre(nuevo_nombre);
                e.setApellido(nuevo_apellido);
                
                if (!ndni.isEmpty()){
                    e.setDni(ndni);
                }
                
                e.setPuesto(nuevo_puesto);
                e.setSueldo(nuevo_sueldo);
                e.setDepartamento(nuevo_departamento);
                e.setFecha_alta(nuevo_fecha_alta);
                e.setFecha_baja(nuevo_fecha_baja);
                e.setTelefono(nuevo_telefono);
                e.setCorreo(nuevo_correo);
                e.setDireccion(nuevo_direccion);
                return true;
            }
        }
        return false;
 
    }
    
}

*/
