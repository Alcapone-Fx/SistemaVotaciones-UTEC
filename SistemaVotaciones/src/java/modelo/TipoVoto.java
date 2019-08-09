
package modelo;

/**
 * yes
 * @author Mario Muzo
 */
public class TipoVoto {
    private int tipovotoId; //varibale para el ID del tipo_voto de la tabla TipoVoto
    private String tipovotoTipo; //variable para el tipo de voto de la tabla TipoVoto

    //Constructror vacio
    public TipoVoto() {
    }

    //Constructor lleno para la clase TipoVoto
    public TipoVoto(int tipovotoId, String tipovotoTipo) {
        this.tipovotoId = tipovotoId;
        this.tipovotoTipo = tipovotoTipo;
    }
    
    //Métodos accesores GetterAndSetter para la clase TipoVoto
    public int getTipovotoId() {
        return tipovotoId;
    }

    public void setTipovotoId(int tipovotoId) {
        this.tipovotoId = tipovotoId;
    }

    public String getTipovotoTipo() {
        return tipovotoTipo;
    }

    public void setTipovotoTipo(String tipovotoTipo) {
        this.tipovotoTipo = tipovotoTipo;
    }
       
}
