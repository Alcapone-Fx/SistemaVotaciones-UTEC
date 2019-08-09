package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * yes
 * @author WilliamVásquez
 */
public class Usuario {
    private String usuario;
    private String pass;
    private String email;
    private String ultima_session;

    public Usuario(String usuario, String pass, String email) {
        this.usuario = usuario;
        this.pass = pass;
        this.email = email;
        Date obj = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YY-MM-dd hh:mm:ss");
        this.ultima_session = formatoFecha.format(obj);
        
    }
    
    public Usuario(String usuario, String pass){
        this.usuario = usuario;
        this.pass = pass;
    }
    
    public Usuario(String usuario){
        this.usuario = usuario;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUltima_session() {
        return ultima_session;
    }

    public void setUltima_session(String ultima_session) {
        this.ultima_session = ultima_session;
    }
        
}
