package com.utec.voting.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
*
* @author Kevin Orellana
*/
public class DAL_CandidatoDiputado {
     PreparedStatement ps;//para preparar sentencias SQL
    ResultSet rs;//variable para guardar resultado de consultas sql
    CandidatoDiputado can;//Variable para crear generos
    Conexion c= new Conexion();
    
    public ArrayList<CandidatoDiputado> mostrarCandidato(){
    ArrayList<CandidatoDiputado> l1= new ArrayList<CandidatoDiputado>();
        try {
            ps=c.getConnection().prepareStatement("SELECT * FROM public.\"CandidatoDiputado\"");
            rs = ps.executeQuery();
            while(rs.next()){
            can= new CandidatoDiputado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            l1.add(can);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    return l1;
    }
    
    public boolean ingresarCandidato(CandidatoDiputado can){
        boolean b=false;
        try {
            ps=c.getConnection().prepareStatement("INSERT INTO public.\"CandidatoDiputado\"(candidatodiputado_nombre,candidatodiputado_apellido,candidatopartido_id) VALUES (?,?,?);");
            ps.setString(1, can.getCandidato_nombre());
            ps.setString(2, can.getCandidato_apellido());
            ps.setInt(3, can.getCandidatodiputado_partido());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
    
    public boolean modificarCandidato(CandidatoDiputado can){
        boolean b=false;
        try {
            ps=c.getConnection().prepareStatement("UPDATE public.\"CandidatoDiputado\" SET candidatodiputado_nombre=?, candidatodiputado_apellido=?, candidatopartido_id=? WHERE candidatodiputado_id=?");
            ps.setString(1, can.getCandidato_nombre());
            ps.setString(2, can.getCandidato_apellido());
            ps.setInt(3, can.getCandidatodiputado_partido());
            ps.setInt(4, can.getCandidato_id());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
    
    public boolean eliminarCandidato(CandidatoDiputado can){
        boolean b=false;
        try {
          ps=c.getConnection().prepareStatement("DELETE FROM public.\"CandidatoDiputado\" WHERE candidatodiputado_id=?");
            ps.setInt(1, can.getCandidato_id());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
    
    public ArrayList<CandidatoDiputado> mostrarCandidatosEspecificos(String departamento){
    ArrayList<CandidatoDiputado> l1= new ArrayList<CandidatoDiputado>();
        try {
            ps=c.getConnection().prepareStatement("SELECT * FROM public.\"CandidatoDiputado\" where candidatopartido_departamentoid = '"+departamento+"' ORDER BY candidatopartido_id");
            rs = ps.executeQuery();
            while(rs.next()){
            can= new CandidatoDiputado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
            l1.add(can);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    return l1;
    }
    
    public static void main(String[] args) {
        DAL_dui dui = new DAL_dui();
        Dui n = new Dui("05557867-3", "12-12-1212", "12-12-1212", "William", "Vazquez", 1, "12-12-1222",11, "Madre", "Padre", 1, 28);
        dui.insertarDui(n);
        Usuarios u = new Usuarios("05557867-3", "admin", "admin", 1);
        DAL_Usuarios ob = new DAL_Usuarios();
        System.out.println(ob.insertarUsuario(u));
    }
}
