package modelo;

/**
 *
 * @author KevinManuel
 */
public class Genero {
    private int generoId;//variable para el Id de genero de la tabla Genero
    private String genero;//variable para el Tipo de genero de la tabla Genero

    //Constructor vacio
    public Genero() {
    }

     //Constructor lleno para la clase Genero
    public Genero(int generoId, String genero) {
        this.generoId = generoId;
        this.genero = genero;
    }

    //Métodos accesores GetterAndSetter para la clase Genero
    public int getGeneroId() {
        return generoId;
    }

    public void setGeneroId(int generoId) {
        this.generoId = generoId;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
