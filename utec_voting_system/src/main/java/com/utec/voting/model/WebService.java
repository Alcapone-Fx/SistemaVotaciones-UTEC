package com.utec.voting.model;

/**
 *
 * @author Casa
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONArray;

@Path("/webservice")
public class WebService extends Conexion {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Object getResponse() {
		Connection con;// variable de conexión
		PreparedStatement ps;// para preparar sentencias SQL
		ResultSet rs;
		CandidatoDiputado can;
		ArrayList<Object> l1 = new ArrayList<Object>();
		ArrayList<String> l2 = new ArrayList<String>();
		try {
			String sql = "SELECT * FROM public.\"CandidatoDiputado\";";
			ps = getConnection().prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				l2.add(rs.getString(2) + " " + rs.getString(3));
				l1.add(l2);
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.toString());
		}
		JSONArray gson = new JSONArray(Arrays.asList(l2));
		return gson;
	}
}
