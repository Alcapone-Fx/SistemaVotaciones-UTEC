package com.utec.voting.model;

/**
*
* @author Kevin Orellana
*/
public class Municipio {
    private int municipio_id;
    private String municipio_municipio;
    
    public Municipio() {
    }

    public Municipio(int municipio_id, String municipio_municipio) {
        this.municipio_id = municipio_id;
        this.municipio_municipio = municipio_municipio;
    }

    public int getMunicipio_id() {
        return municipio_id;
    }

    public void setMunicipio_id(int municipio_id) {
        this.municipio_id = municipio_id;
    }

    public String getMunicipio_municipio() {
        return municipio_municipio;
    }

    public void setMunicipio_municipio(String municipio_municipio) {
        this.municipio_municipio = municipio_municipio;
    }
}
