package com.utec.voting.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
*
* @author Kevin Orellana
*/
public class DAL_dui extends Conexion{
    PreparedStatement ps;//para preparar sentencias SQL
    ResultSet rs;//variable para guardar resultado de consultas sql
    Voto_Candidato v;//Variable para crear Municipio
    Conexion c= new Conexion();
    Dui dui;
    
    public String mostrarDui(Usuario objUsuario){
        String success = "";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "Select usuario_dui FROM public.\"Usuario\" where usuario_usuario = '" + objUsuario.getUsuario() + "' and usuario_password = '" + Encriptar.sha1(objUsuario.getPass()) + "';";
            ps = c.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               success = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return success;
    }
    
    public String mostrarDepartamentoPerteneciente(String dui){
        String l1 = "No entra";
        try {
            ps=c.getConnection().prepareStatement("select departamento_id from public.\"DUI\" where dui_id = ?;");
            ps.setString(1, dui);
            rs=ps.executeQuery();
            while(rs.next()){
            l1 = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    return l1;
    }
    public ArrayList<Dui> mostrarDUI(){
    ArrayList<Dui> l1 = new ArrayList<Dui>();
        try {
            ps=getConnection().prepareStatement("SELECT * FROM public.\"DUI\";");
            rs=ps.executeQuery();
            while(rs.next()){
            dui= new Dui(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getInt(11), rs.getInt(12));
            l1.add(dui);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    return l1;
    }
    public boolean insertarDui(Dui d){
        boolean b=false;
        try {
            ps=getConnection().prepareStatement("INSERT INTO public.\"DUI\"(dui_id,fecha_vencimiento,fecha_expedicion,nombres,apellido,genero_id,fecha_nacimiento,departamento_id,nombre_madre,nombre_padre,estadofamiliar_id,edad_dui) VALUES (?,?,?,?,?,?,?,?,?,?,?,?);");
            ps.setString(1, d.getDui());
            ps.setString(2, d.getFecha_vencimiento());
            ps.setString(3, d.getFecha_expedicion());
            ps.setString(4, d.getNombres());
            ps.setString(5, d.getApellidos());
            ps.setInt(6, d.getGenero_id());
            ps.setString(7, d.getFecha_nacimiento());
            ps.setInt(8, d.getDepartamento_id());
            ps.setString(9, d.getNombre_madre());
            ps.setString(10, d.getNombre_padre());
            ps.setInt(11, d.getEstado_familiar());
            ps.setInt(12, d.getEdad());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
    public boolean modificarDui(Dui d){
        boolean b=false;
        try {
            ps=getConnection().prepareStatement("UPDATE public.\"DUI\"\n" +
                    "   SET  fecha_vencimiento=?, fecha_expedicion=?, nombres=?, \n" +
                    "       apellido=?, genero_id=?, fecha_nacimiento=?, departamento_id=?, \n" +
                    "       nombre_madre=?, nombre_padre=?, estadofamiliar_id=?, edad_dui=?\n" +
                    " WHERE dui_id=?;");
            ps.setString(1, d.getFecha_vencimiento());
            ps.setString(2, d.getFecha_expedicion());
            ps.setString(3, d.getNombres());
            ps.setString(4, d.getApellidos());
            ps.setInt(5, d.getGenero_id());
            ps.setString(6, d.getFecha_nacimiento());
            ps.setInt(7, d.getDepartamento_id());
            ps.setString(8, d.getNombre_madre());
            ps.setString(9, d.getNombre_padre());
            ps.setInt(10, d.getEstado_familiar());
            ps.setInt(11, d.getEdad());
            ps.setString(12, d.getDui());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
    public boolean eliminarDui(Dui d){
        boolean b=false;
        try {
            ps=getConnection().prepareStatement("DELETE FROM public.\"DUI\" WHERE dui_id =?");
            ps.setString(1, d.getDui());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
}


