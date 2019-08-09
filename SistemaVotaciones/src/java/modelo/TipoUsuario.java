package modelo;

/**
 *
 * @author Kevin
 */
public class TipoUsuario {
    private int tipoUsuarioId; //varibale para el ID del tipoUsuario de la tabla TipoUsuario
    private String tipoUsuarioTipo; //variable para el tipoUsuario de la tabla TipoUsuario
    
    //Constructor vacio 
    public TipoUsuario() {
    }
    
    //Constructor lleno para la clase TipoUsuario
    public TipoUsuario(int tipoUsuarioId, String tipoUsuarioTipo) {
        this.tipoUsuarioId = tipoUsuarioId;
        this.tipoUsuarioTipo = tipoUsuarioTipo;
    }

    //Métodos accesores GetterAndSetter para la clase TipoUsuario
    public int getTipoUsuarioId() {
        return tipoUsuarioId;
    }

    public void setTipoUsuarioId(int tipoUsuarioId) {
        this.tipoUsuarioId = tipoUsuarioId;
    }

    public String getTipoUsuarioTipo() {
        return tipoUsuarioTipo;
    }

    public void setTipoUsuarioTipo(String tipoUsuarioTipo) {
        this.tipoUsuarioTipo = tipoUsuarioTipo;
    }
}
