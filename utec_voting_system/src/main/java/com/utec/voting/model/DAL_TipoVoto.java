package com.utec.voting.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
*
* @author Kevin Orellana
*/
public class DAL_TipoVoto {
    PreparedStatement ps;//para preparar sentencias SQL
    ResultSet rs;//variable para guardar resultado de consultas sql
    TipoVoto tpvoto;//Variable para crear tipoVoto
    Conexion c= new Conexion();
    
    public ArrayList<TipoVoto> mostrar(){
    ArrayList<TipoVoto> l1 = new ArrayList<TipoVoto>();
        try {
           // ps=c.getConnection().prepareStatement("SELECT * FROM multiplataforma.tipo_voto;");
            rs=ps.executeQuery();
            while(rs.next()){
            tpvoto= new TipoVoto(rs.getInt(1), rs.getString(2));
            l1.add(tpvoto);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    return l1;
    }
    
    public void insertarTipoVoto(TipoVoto tpvoto){
        try {
          //  ps=c.getConnection().prepareStatement("call ingresarTipovoto(?,?)");
            ps.setInt(1, tpvoto.getTipovotoId());
            ps.setString(2, tpvoto.getTipovotoTipo());
            rs=ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
    }
    
    public void modificarTipoVoto(TipoVoto tpvoto){
        try {
          //  ps=c.getConnection().prepareStatement("call modificarTipoVoto(?,?)");
            ps.setInt(1, tpvoto.getTipovotoId());
            ps.setString(2, tpvoto.getTipovotoTipo());
            rs=ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
    }
    
    public void eliminarTipoVoto(TipoVoto tpvoto){
        try {
        //    ps=c.getConnection().prepareStatement("call eliminarTipovoto(?)");
            ps.setInt(1, tpvoto.getTipovotoId());
            rs=ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
    }
}
