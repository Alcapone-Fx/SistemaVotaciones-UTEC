package com.utec.voting.model;

/**
*
* @author Kevin Orellana
*/
public class Dui {
    private String dui;
    private String fecha_vencimiento;
    private String fecha_expedicion;
    private String nombres;
    private String apellidos;
    private int genero_id;
    private String fecha_nacimiento;
    private int departamento_id;
    private String nombre_madre;
    private String nombre_padre;
    private int estado_familiar;
    private int edad;

    public Dui() {
    }
    
    public Dui(String dui)
    {
        this.dui = dui;
    }

    public Dui(String dui, String fecha_vencimiento, String fecha_expedicion, String nombres, String apellidos, int genero_id, String fecha_nacimiento, int departamento_id, String nombre_madre, String nombre_padre, int estado_familiar, int edad) {
        this.dui = dui;
        this.fecha_vencimiento = fecha_vencimiento;
        this.fecha_expedicion = fecha_expedicion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero_id = genero_id;
        this.fecha_nacimiento = fecha_nacimiento;
        this.departamento_id = departamento_id;
        this.nombre_madre = nombre_madre;
        this.nombre_padre = nombre_padre;
        this.estado_familiar = estado_familiar;
        this.edad = edad;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getFecha_expedicion() {
        return fecha_expedicion;
    }

    public void setFecha_expedicion(String fecha_expedicion) {
        this.fecha_expedicion = fecha_expedicion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getGenero_id() {
        return genero_id;
    }

    public void setGenero_id(int genero_id) {
        this.genero_id = genero_id;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(int departamento_id) {
        this.departamento_id = departamento_id;
    }

    public String getNombre_madre() {
        return nombre_madre;
    }

    public void setNombre_madre(String nombre_madre) {
        this.nombre_madre = nombre_madre;
    }

    public String getNombre_padre() {
        return nombre_padre;
    }

    public void setNombre_padre(String nombre_padre) {
        this.nombre_padre = nombre_padre;
    }

    public int getEstado_familiar() {
        return estado_familiar;
    }

    public void setEstado_familiar(int estado_familiar) {
        this.estado_familiar = estado_familiar;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
