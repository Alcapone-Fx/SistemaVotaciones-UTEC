package com.utec.voting.model;

/**
 *
 * @author Kevin Orellana
 */
public class VotoUsuario {
    private int voto_id;
    private String usuario_dui;

    public VotoUsuario() {
    }

    public VotoUsuario(int voto_id, String usuario_dui) {
        this.voto_id = voto_id;
        this.usuario_dui = usuario_dui;
    }

    public int getVoto_id() {
        return voto_id;
    }

    public void setVoto_id(int voto_id) {
        this.voto_id = voto_id;
    }

    public String getUsuario_dui() {
        return usuario_dui;
    }

    public void setUsuario_dui(String usuario_dui) {
        this.usuario_dui = usuario_dui;
    }
    
    
}
