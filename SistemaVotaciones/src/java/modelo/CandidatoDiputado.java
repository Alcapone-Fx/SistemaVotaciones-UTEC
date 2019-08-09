package modelo;

/**
 *
 * @author Kevin
 */
public class CandidatoDiputado {
    private int candidato_id;
    private String candidato_nombre;
    private String candidato_apellido;
    private int candidatodiputado_partido;
    private int candidato_departamento;

    public CandidatoDiputado() {
    }

    public CandidatoDiputado(int candidato_id, String candidato_nombre, String candidato_apellido, int candidatodiputado_partido) {
        this.candidato_id = candidato_id;
        this.candidato_nombre = candidato_nombre;
        this.candidato_apellido = candidato_apellido;
        this.candidatodiputado_partido = candidatodiputado_partido;
    }
    
    public CandidatoDiputado(int candidato_id, String candidato_nombre, String candidato_apellido, int candidatodiputado_partido, int departamento) {
        this.candidato_id = candidato_id;
        this.candidato_nombre = candidato_nombre;
        this.candidato_apellido = candidato_apellido;
        this.candidatodiputado_partido = candidatodiputado_partido;
        this.candidato_departamento = departamento;
    }

    public int getCandidato_departamento() {
        return candidato_departamento;
    }

    public void setCandidato_departamento(int candidato_departamento) {
        this.candidato_departamento = candidato_departamento;
    }

    public int getCandidato_id() {
        return candidato_id;
    }

    public void setCandidato_id(int candidato_id) {
        this.candidato_id = candidato_id;
    }

    public String getCandidato_nombre() {
        return candidato_nombre;
    }

    public void setCandidato_nombre(String candidato_nombre) {
        this.candidato_nombre = candidato_nombre;
    }

    public String getCandidato_apellido() {
        return candidato_apellido;
    }

    public void setCandidato_apellido(String candidato_apellido) {
        this.candidato_apellido = candidato_apellido;
    }

    public int getCandidatodiputado_partido() {
        return candidatodiputado_partido;
    }

    public void setCandidatodiputado_partido(int candidatodiputado_partido) {
        this.candidatodiputado_partido = candidatodiputado_partido;
    } 
}
