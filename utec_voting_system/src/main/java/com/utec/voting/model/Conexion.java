package com.utec.voting.model;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.log4j.Logger;

/**
*
* @author Kevin Orellana
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
    
    /**
     * Variable de logueo para errores.
     */
    static final Logger logger = Logger.getLogger(Conexion.class);
    
    public Conexion(){
        try {
            Class.forName(classname).newInstance();
            conecto = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
        	logger.error("Error" + e);
        }
    }
    
    public Connection getConnection() {
        return this.conecto;
    }
}
