/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Casa
 */
public class Voto_Candidato {
    private int voto_id;
    private int candidato_id;

    public Voto_Candidato() {
    }

    public Voto_Candidato(int voto_id, int candidato_id) {
        this.voto_id = voto_id;
        this.candidato_id = candidato_id;
    }

    public int getVoto_id() {
        return voto_id;
    }

    public void setVoto_id(int voto_id) {
        this.voto_id = voto_id;
    }

    public int getCandidato_id() {
        return candidato_id;
    }

    public void setCandidato_id(int candidato_id) {
        this.candidato_id = candidato_id;
    }
    
    
}
