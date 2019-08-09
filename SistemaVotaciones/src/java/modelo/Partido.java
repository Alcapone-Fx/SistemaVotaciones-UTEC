package modelo;

/**
 *
 * @author KevinManuel
 */
public class Partido {
    private int partidoId;//variable para el ID del partido de la tabla Partido
    private String patidoNombre;//variable para el Nombre del partido de la tabla Partido
    
    //Constructor vacio
    public Partido() {
    }

     //Constructor lleno para la clase Partido
    public Partido(int partidoId, String patidoNombre) {
        this.partidoId = partidoId;
        this.patidoNombre = patidoNombre;
    }

    //Métodos accesores GetterAndSetter para la clase Partido
    public int getPartidoId() {
        return partidoId;
    }

    public void setPartidoId(int partidoId) {
        this.partidoId = partidoId;
    }

    public String getPatidoNombre() {
        return patidoNombre;
    }

    public void setPatidoNombre(String patidoNombre) {
        this.patidoNombre = patidoNombre;
    }
}
