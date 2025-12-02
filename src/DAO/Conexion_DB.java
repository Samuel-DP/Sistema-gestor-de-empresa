package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion_DB {
    
    Connection conexion = null; 
    
    public Connection getConexion(String url, String usuario, String password ){
        
        try {
            Class.forName("org.postgresql.Driver");
             // String url = "jdbc:postgresql://"+ host + ":" + puerto + "/" + db; // Me creo mi cadena de conexion, ya no la necestio aqui la pongo en vGlobales 
            
            conexion = DriverManager.getConnection(url, usuario, password);
            
            System.out.println("Conexion establecida");
            
        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex.getMessage());
        } 
        
        return conexion;
        
    } 
    
    public void cerrarConexion() throws SQLException{
        if(conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }  
    
}
