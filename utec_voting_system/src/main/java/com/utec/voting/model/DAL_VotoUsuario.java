package com.utec.voting.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
*
* @author Kevin Orellana
*/
public class DAL_VotoUsuario extends Conexion{
    PreparedStatement ps;//para preparar sentencias SQL
    ResultSet rs;//variable para guardar resultado de consultas sql
    Voto_Candidato v;//Variable para crear Municipio
    Conexion c= new Conexion();
    
    public void insertarVotoUsuario(int voto_id, String usuario_id)
    {
        try {
            ps=c.getConnection().prepareStatement("INSERT INTO public.\"VotoUsuario\"(\n" +
"	voto_id, usuario_id)\n" +
"	VALUES (?, ?);");
            ps.setInt(1, voto_id);
            ps.setString(2, usuario_id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        
    }
    
    public void updateSufragio(String dui)
    {
        try {
            ps=c.getConnection().prepareStatement("UPDATE public.\"VotoUsuario\" SET sufragio = 1 where usuario_id = ?");
            ps.setString(1, dui);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
    public int knowSufragio(String dui)
    {
        int sufragio = 0;
        try {
            ps = getConnection().prepareStatement("SELECT sufragio FROM public.\"VotoUsuario\" where usuario_id =?");
            ps.setString(1, dui);
            rs = ps.executeQuery();
            while(rs.next())
            {
                sufragio = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return sufragio;
    }
    
    public static void main(String[] args) {
        DAL_VotoUsuario ob = new DAL_VotoUsuario();
        System.out.println(ob.knowSufragio("05557867-2"));
    }
}
