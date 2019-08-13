package com.utec.voting.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
*
* @author Kevin Orellana
*/
public class DAL_Usuarios extends Conexion{
    PreparedStatement ps;//para preparar sentencias SQL
    ResultSet rs;//variable para guardar resultado de consultas sql
    Usuarios u;//Variable para crear tipoUsuario
    
    public ArrayList<Usuarios> mostrarUsuario(){
    ArrayList<Usuarios> l1 = new ArrayList<Usuarios>();
        try {
            ps=getConnection().prepareStatement("SELECT * FROM public.\"Usuario\";");
            rs=ps.executeQuery();
            while(rs.next()){
            u = new Usuarios(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            l1.add(u);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    return l1;
    }

    public boolean insertarUsuario(Usuarios u){
        boolean b=false;
        try {
            ps=getConnection().prepareStatement("INSERT INTO public.\"Usuario\"(usuario_dui,usuario_usuario,usuario_password,usuario_tipo) VALUES (?,?,?,?);");
            ps.setString(1, u.getUsuario_dui());
            ps.setString(2, u.getUsuario_usuario());
            ps.setString(3, Encriptar.sha1(u.getUsuario_password()));
            ps.setInt(4, u.getUsuario_tipo());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
    
    public boolean modificarUsuario(Usuarios u){
        boolean b=false;
        try {
            ps=getConnection().prepareStatement("UPDATE public.\"Usuario\" SET usuario_usuario=?,usuario_password=?,usuario_tipo=? WHERE usuario_dui= ?;");
            ps.setString(1, u.getUsuario_usuario());
            ps.setString(2, Encriptar.sha1(u.getUsuario_password()));
            ps.setInt(3, u.getUsuario_tipo());
            ps.setString(4, u.getUsuario_dui());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
    
    public boolean eliminarUsuario(Usuarios u){
        boolean b=false;
        try {
            ps=getConnection().prepareStatement("DELETE FROM public.\"Usuario\" WHERE usuario_dui = ?;");
            ps.setString(1, u.getUsuario_dui());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
    /*public static void main(String[] args) {
       Usuarios u;
       DAL_Usuarios ob = new DAL_Usuarios();
       u = new Usuarios("87654326-9", "prueba", "prueba", 1);
        System.out.println(ob.eliminarUsuario(u));
    }*/
}
