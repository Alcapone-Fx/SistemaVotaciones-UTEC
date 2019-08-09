package modelo;

import java.sql.*;
import java.util.*;
/**
 *
 * @author KevinManuel
 */
public class DAL_Municipio extends Conexion{
    PreparedStatement ps;//para preparar sentencias SQL
    ResultSet rs;//variable para guardar resultado de consultas sql
    Municipio m;//Variable para crear Municipio
    
    public ArrayList<Municipio> mostrarMunicipio(){
    ArrayList<Municipio> l1 = new ArrayList<Municipio>();
        try {
        //    ps=getConnection().prepareStatement("SELECT * FROM multiplataforma.municipio;");
            rs=ps.executeQuery();
            while(rs.next()){
            m= new Municipio(rs.getInt(1), rs.getString(2));
            l1.add(m);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    return l1;
    }
    
    public boolean ingresarMunicipio(Municipio m){
        boolean b=false;
        try {
        //    ps=getConnection().prepareStatement("call ingresarMunicipio(?,?)");
            ps.setInt(1, m.getMunicipio_id());
            ps.setString(2, m.getMunicipio_municipio());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
    
    public boolean modificarMunicipio(Municipio m){
        boolean b=false;
        try {
        //    ps=getConnection().prepareStatement("call modificarMunicipio(?,?)");
            ps.setInt(1, m.getMunicipio_id());
            ps.setString(2, m.getMunicipio_municipio());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
    
    public boolean eliminarMunicipio(Municipio m){
        boolean b=false;
        try {
        //    ps=getConnection().prepareStatement("call eliminarMunicipio(?)");
            ps.setInt(1, m.getMunicipio_id());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
}
