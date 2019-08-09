package modelo;

import java.util.*;
import java.sql.*;
/**
 *
 * @author KevinManuel
 */
public class DAL_TipoUsuario extends Conexion{
    PreparedStatement ps;//para preparar sentencias SQL
    ResultSet rs;//variable para guardar resultado de consultas sql
    TipoUsuario tpuser;//Variable para crear tipoUsuario
    
    public ArrayList<TipoUsuario> mostrarTipousuario(){
    ArrayList<TipoUsuario> l1 = new ArrayList<TipoUsuario>();
        try {
            ps=getConnection().prepareStatement("SELECT * FROM public.\"TipoUsuario\";");
            rs=ps.executeQuery();
            while(rs.next()){
            tpuser= new TipoUsuario(rs.getInt(1), rs.getString(2));
            l1.add(tpuser);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    return l1;
    }

    public boolean insertarTipoUsuario(TipoUsuario tpuser){
        boolean b=false;
        try {
            ps=getConnection().prepareStatement("INSERT INTO public.\"TipoUsuario\"(tipousuario_tipo) VALUES (?);");
            ps.setString(1, tpuser.getTipoUsuarioTipo());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
    
    public boolean modificarTipoUsuario(TipoUsuario tpuser){
        boolean b=false;
        try {
            ps=getConnection().prepareStatement("UPDATE public.\"TipoUsuario\" SET tipousuario_tipo ='"+tpuser.getTipoUsuarioTipo()+"' WHERE tipousuario_id = ?;");
            ps.setInt(1, tpuser.getTipoUsuarioId());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
    
    public boolean eliminarTipoUsuario(TipoUsuario tpuser){
        boolean b=false;
        try {
            ps=getConnection().prepareStatement("DELETE FROM public.\"TipoUsuario\" WHERE tipousuario_id = ?;");
            ps.setInt(1, tpuser.getTipoUsuarioId());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
}
