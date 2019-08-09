
package modelo;

/**
 *
 * @author Mario Muzo
 */
public class Usuarios {
    private String usuario_dui;
    private String usuario_usuario;
    private String usuario_password;
    private int usuario_tipo;

    public Usuarios() {
    }

    public Usuarios(String usuario_dui, String usuario_usuario, String usuario_password, int usuario_tipo) {
        this.usuario_dui = usuario_dui;
        this.usuario_usuario = usuario_usuario;
        this.usuario_password = usuario_password;
        this.usuario_tipo = usuario_tipo;
    }

    public String getUsuario_dui() {
        return usuario_dui;
    }

    public void setUsuario_dui(String usuario_dui) {
        this.usuario_dui = usuario_dui;
    }

    public String getUsuario_usuario() {
        return usuario_usuario;
    }

    public void setUsuario_usuario(String usuario_usuario) {
        this.usuario_usuario = usuario_usuario;
    }

    public String getUsuario_password() {
        return usuario_password;
    }

    public void setUsuario_password(String usuario_password) {
        this.usuario_password = usuario_password;
    }

    public int getUsuario_tipo() {
        return usuario_tipo;
    }

    public void setUsuario_tipo(int usuario_tipo) {
        this.usuario_tipo = usuario_tipo;
    }
    
}
