package modelo;
import java.sql.*;
/**
 *
 * @author KevinManuel
 */
public class Conexion {
    private String username = "postgres";
    private String password = "Itca123";
    private String hostname = "127.0.0.1";
    private String puerto = "5432";
    private String base = "multiplataforma";
    private String classname = "org.postgresql.Driver";
    private String url = "jdbc:postgresql://" + hostname + ":" + puerto + "/" + base;
    private static Connection conecto;
    
    public Conexion(){
        try {
            Class.forName(classname).newInstance();
            conecto = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
    
    public Connection getConnection() {
        return this.conecto;
    }
}
