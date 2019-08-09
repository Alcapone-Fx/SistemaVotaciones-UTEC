
package modelo;
import java.util.*;
import java.sql.*;
/**
 *
 * @author Mario Muzo
 */
public class DAL_Departamento extends Conexion{
    PreparedStatement ps;//para preparar sentencias SQL
    ResultSet rs;//variable para guardar resultado de consultas sql
    Departamento d;//Variable para crear Municipio
    
    public ArrayList<Departamento> mostrarDepartamento(){
    ArrayList<Departamento> l1 = new ArrayList<Departamento>();
        try {
            ps=getConnection().prepareStatement("SELECT * FROM public.\"Departamento\";");
            rs=ps.executeQuery();
            while(rs.next()){
            d= new Departamento(rs.getInt(1), rs.getString(2));
            l1.add(d);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    return l1;
    }
    
    public boolean modificarDepartamento(Departamento d){
        boolean b=false;
        try {
            ps=getConnection().prepareStatement("UPDATE public.\"Departamento\" SET departamento_nombre ='"+d.getDepartamento_nombre()+"' WHERE departamento_id = ?;");
            ps.setInt(1, d.getDepartamento_id());
            if(ps.executeUpdate()==1){
                b=true;
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return b;
    }
}
