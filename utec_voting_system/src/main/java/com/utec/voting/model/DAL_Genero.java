package com.utec.voting.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
*
* @author Kevin Orellana
*/
public class DAL_Genero extends Conexion{
    ResultSet rs;
    PreparedStatement ps;
    Genero g;
     public ArrayList<Genero> mostrarGenero(){
    ArrayList<Genero> l1 = new ArrayList<Genero>();
        try {
            ps=getConnection().prepareStatement("SELECT * FROM public.\"Genero\";");
            rs=ps.executeQuery();
            while(rs.next()){
            g= new Genero(rs.getInt(1), rs.getString(2));
            l1.add(g);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    return l1;
    }
}
