package com.utec.voting.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
*
* @author Kevin Orellana
*/
public class DAL_Partido extends Conexion{
    PreparedStatement ps;//para preparar sentencias SQL
    ResultSet rs;//variable para guardar resultado de consultas sql
    Partido ptdo;//Variable para crear partidos
   
    public ArrayList<Partido> mostrarPartido(){
    ArrayList<Partido> l1 = new ArrayList<Partido>();
        try {
          ps=getConnection().prepareStatement("SELECT * FROM public.\"Partido\";");
            rs=ps.executeQuery();
            while(rs.next()){
            ptdo= new Partido(rs.getInt(1), rs.getString(2));
            l1.add(ptdo);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    return l1;
    }
    
   public boolean insertarPartido(Partido p){
        boolean bandera = false;
        try {
          ps=getConnection().prepareStatement("INSERT INTO public.\"Partido\"(partido_partido) VALUES (?);");
            ps.setString(1, p.getPatidoNombre());
            if(ps.executeUpdate()==1){
                bandera = true;  
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return bandera;
    }
   public boolean modificarPartido(Partido p){
        boolean bandera = false;
        try {
          ps=getConnection().prepareStatement("UPDATE public.\"Partido\" SET partido_partido='"+p.getPatidoNombre()+"' WHERE partido_id= ?;");
          ps.setInt(1, p.getPartidoId());
            if(ps.executeUpdate()==1){
                bandera = true;  
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return bandera;
    }
   public boolean eliminarPartido(Partido p){
        boolean bandera = false;
        try {
           ps=getConnection().prepareStatement("DELETE FROM public.\"Partido\" WHERE partido_id= ?;");
            ps.setInt(1, p.getPartidoId());
            if(ps.executeUpdate()==1){
                bandera = true;  
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return bandera;
    }

    public static void main(String[] args) {
        DAL_Partido ob = new DAL_Partido();
        Partido p;
        p= new Partido(0, "Arena");
        System.out.println(ob.insertarPartido(p));
    }
}
