package com.utec.voting.model;

/**
*
* @author Kevin Orellana
*/
public class Departamento {
    private int departamento_id;
    private String departamento_nombre;

    public Departamento() {
    }

    public Departamento(int departamento_id, String departamento_nombre) {
        this.departamento_id = departamento_id;
        this.departamento_nombre = departamento_nombre;
    }

    public int getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(int departamento_id) {
        this.departamento_id = departamento_id;
    }

    public String getDepartamento_nombre() {
        return departamento_nombre;
    }

    public void setDepartamento_nombre(String departamento_nombre) {
        this.departamento_nombre = departamento_nombre;
    }
}
