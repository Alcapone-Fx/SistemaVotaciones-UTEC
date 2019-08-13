package com.utec.voting.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
*
* @author Kevin Orellana
*/
public class DAL_Direccion {
    PreparedStatement ps;//para preparar sentencias SQL
    ResultSet rs;//variable para guardar resultado de consultas sql
    Direccion dir;//Variable para crear partidos
    Conexion c= new Conexion();
   
    public ArrayList<Direccion> mostrarDireccion(){
    ArrayList<Direccion> l1 = new ArrayList<Direccion>();
        try {
         //   ps=c.getConnection().prepareStatement("SELECT * FROM multiplataforma.ciudad;");
            rs=ps.executeQuery();
            while(rs.next()){
            dir= new Direccion(rs.getInt(1), rs.getString(2));
            l1.add(dir);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    return l1;
    }

    public boolean insertarDireccion(Direccion dir){
        boolean b=false;
        try {
        //    ps=c.getConnection().prepareStatement("INSERT INTO ciudad VALUES (?,?)");
            ps.setInt(1, dir.getDireccionId());
            ps.setString(2, dir.getDireccionNombre());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
    
    public boolean modificarDireccion(Direccion dir){
        boolean b=false;
        try {
         //   ps=c.getConnection().prepareStatement("UPDATE ciudad SET ciudad_ciudad = ? WHERE ciudad_id = ?");
            ps.setString(1, dir.getDireccionNombre());
            ps.setInt(2, dir.getDireccionId());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
    
    public boolean eliminarDireccion(Direccion dir){
        boolean b=false;
        try {
        //    ps=c.getConnection().prepareStatement("DELETE FROM ciudad WHERE ciudad_id = ?");
            ps.setInt(1, dir.getDireccionId());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
}
