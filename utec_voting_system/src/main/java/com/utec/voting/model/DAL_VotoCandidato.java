package com.utec.voting.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
*
* @author Kevin Orellana
*/
public class DAL_VotoCandidato {
    PreparedStatement ps;//para preparar sentencias SQL
    ResultSet rs;//variable para guardar resultado de consultas sql
    Voto_Candidato v;//Variable para crear Municipio
    Conexion c= new Conexion();
    
    public int mostrar(){
    int l1 = 0;
        try {
            ps=c.getConnection().prepareStatement("Select count(*) from public.\"VotoCandidatoDiputado\";");
            rs=ps.executeQuery();
            while(rs.next()){
            l1 = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    return l1;
    }
    
    public void insertarVotoCandidatoDiputado(int cadidatodiputado_id, int voto_id)
    {
        try {
            ps=c.getConnection().prepareStatement("INSERT INTO public.\"VotoCandidatoDiputado\"(candidatodiputado_id, voto_id)\n" +
"	VALUES (?, ?);");
            ps.setInt(1, cadidatodiputado_id);
            ps.setInt(2, voto_id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        
    }
    
    public static void main(String[] args) {
        DAL_VotoCandidato ob = new DAL_VotoCandidato();
        ob.insertarVotoCandidatoDiputado(7, 16);
    }
}
