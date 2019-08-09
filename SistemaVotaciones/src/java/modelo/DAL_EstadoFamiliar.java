package modelo;

import java.sql.*;
import java.util.*;
/**
 *
 * @author KevinManuel
 */
public class DAL_EstadoFamiliar extends Conexion{
    Connection con;//variable de conexión
    PreparedStatement ps;//para preparar sentencias SQL
    ResultSet rs;//variable para guardar resultado de consultas sql
    EstadoFamiliar estadoF;//Variable para crear generos
    public ArrayList<EstadoFamiliar> mostrarEstado(){
    ArrayList<EstadoFamiliar> l1= new ArrayList<EstadoFamiliar>();
        try {
            ps=getConnection().prepareStatement("SELECT * FROM public.\"EstadoFamiliar\";");
            rs=ps.executeQuery();
            while(rs.next()){
            estadoF= new EstadoFamiliar(rs.getInt(1), rs.getString(2));
            l1.add(estadoF);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    return l1;
    }
    public void insertarEstadoFamilia(EstadoFamiliar estadoF){
        try {
        //    ps=getConnection().prepareStatement("call ingresarEstadoFamiliar(?,?)");
            ps.setInt(1, estadoF.getEstadoFamiliarId());
            ps.setString(2, estadoF.getEstado());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    public void modificarEstadoFamilia(EstadoFamiliar estadoF){
        try {
        //    ps=getConnection().prepareStatement("call modificarEstadoFamiliar(?,?)");
            ps.setInt(1, estadoF.getEstadoFamiliarId());
            ps.setString(2, estadoF.getEstado());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void eliminarEstadoFamilia(EstadoFamiliar estadoF){
        try {
         //   ps=getConnection().prepareStatement("call eliminarEstadoFamiliar(?)");
            ps.setInt(1, estadoF.getEstadoFamiliarId());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
