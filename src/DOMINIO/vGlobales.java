
package DOMINIO;

public class vGlobales {
    
    // String USER = "postgres"; // Este es el admin de mi base de datos // Lo que quiero es q mis variables user y password no se vean desde Conexion_DB
    // String PASSWORD = "user"; // Contraseña que hemos puesto en nuestra DB
    
    public static String USER ="";
    public static String PASSWORD ="";
    
    public static String host = "localhost";
    public static String puerto = "5432";
    public static String db = "Aplicacion_Cesur1Ev"; // Segun a la DB que me quiera conectar usare Cesur_2025 o Aplicacion_Cesur1Ev o la que sea
    
    public static String getCadena(){
        
        String cadena_con = "jdbc:postgresql://"+ host + ":" + puerto + "/" + db;
        
        return cadena_con;
        
    }
   
}
