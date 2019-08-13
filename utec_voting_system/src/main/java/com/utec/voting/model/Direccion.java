package com.utec.voting.model;

/**
*
* @author Kevin Orellana
*/
public class Direccion {
    private int direccionId;
    private String direccionNombre;

    public Direccion() {
    }

    public Direccion(int direccionId, String direccionNombre) {
        this.direccionId = direccionId;
        this.direccionNombre = direccionNombre;
    }

    public int getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(int direccionId) {
        this.direccionId = direccionId;
    }

    public String getDireccionNombre() {
        return direccionNombre;
    }

    public void setDireccionNombre(String direccionNombre) {
        this.direccionNombre = direccionNombre;
    }
}
