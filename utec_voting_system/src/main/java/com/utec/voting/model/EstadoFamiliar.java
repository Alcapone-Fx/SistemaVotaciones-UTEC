package com.utec.voting.model;

/**
*
* @author Kevin Orellana
*/
public class EstadoFamiliar {
    private int estadoFamiliarId;//varialble para el ID de la tabla estadoFamiliar
   private String estado;//variable para el nombre del Estado en la tabla estadoFamiliar

   //Constructor vacio para la clase EstadoFamiliar
    public EstadoFamiliar() {
    }

    //Constructor lleno para la clase EstadoFamiliar
    public EstadoFamiliar(int estadoFamiliarId, String estado) {
        this.estadoFamiliarId = estadoFamiliarId;
        this.estado = estado;
    }

    //Métodos accesores GetterAndSetter para la clase EstadoFamiliar
    public int getEstadoFamiliarId() {
        return estadoFamiliarId;
    }

    public void setEstadoFamiliarId(int estadoFamiliarId) {
        this.estadoFamiliarId = estadoFamiliarId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
