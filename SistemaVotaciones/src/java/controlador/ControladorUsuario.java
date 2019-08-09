package controlador;

import modelo.*;
/**
 * yes
 * @author WilliamVásquez
 */
public class ControladorUsuario {
    public boolean crearUsuario(Usuario objUsuario){
        DAL_Usuario objModeloUsuario = new DAL_Usuario();
        return objModeloUsuario.nuevoUsuario(objUsuario);
    }
    public boolean validar(Usuario objUsuario){
        DAL_Usuario objModeloUsuario = new DAL_Usuario();
        return objModeloUsuario.auntenticar(objUsuario);
    }
    public String tipo(Usuario objUsuario){
        DAL_Usuario objModeloUsuario = new DAL_Usuario();
        return objModeloUsuario.tipo(objUsuario);
    }
    public String getVistaUsuario(Usuario objUsuario){
        String html = "";
        html += "<h1>Bienvenido " + objUsuario.getUsuario() + "</h1>";
        html += "<br><br><div><a href='LogOut'>Cerrar sesion</a></div>";
        return html;
    }
}
