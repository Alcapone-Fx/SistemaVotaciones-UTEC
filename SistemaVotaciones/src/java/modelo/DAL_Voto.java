/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Casa
 */
import java.sql.*;
import java.util.*;

public class DAL_Voto {
    PreparedStatement ps;//para preparar sentencias SQL
    ResultSet rs;//variable para guardar resultado de consultas sql
    Voto_Candidato v;//Variable para crear Municipio
    Conexion c= new Conexion();
    
    public int mostrarUltimoVoto()
    {
        int l1 = 0;
        try {
            ps=c.getConnection().prepareStatement("SELECT * FROM public.\"Voto\"\n" +
"ORDER BY voto_id\n" +
"DESC LIMIT 1");
            rs=ps.executeQuery();
            while(rs.next()){
            l1 = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    return l1;
    }
    
    public void ingresarVoto(int i)
    {
        try {
            ps=c.getConnection().prepareStatement("INSERT INTO public.\"Voto\"(\n" +
"	voto_id)\n" +
"	VALUES (?);");
            ps.setInt(1, i);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
