package com.utec.voting.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 
 * @author Kevin Orellana
 */
public class DAL_Usuario extends Conexion {
	public boolean nuevoUsuario(Usuario objUsuario) {
		boolean success = false;
		PreparedStatement ps = null;
		try {
			String sql = "call nuevoUsuario(?,?,?,?)";
			ps = getConnection().prepareCall(sql);
			ps.setString(1, objUsuario.getUsuario());
			// ps.setString(2, Encriptar.sha1(objUsuario.getPass()));
			ps.setString(3, objUsuario.getEmail());
			ps.setString(4, objUsuario.getUltima_session());
			if (ps.executeUpdate() == 1)
				success = true;
		} catch (Exception e) {
			System.out.println("Error" + e);
		} finally {
			try {
				if (getConnection() != null)
					getConnection().close();
				if (ps != null)
					ps.close();
			} catch (Exception e) {
			}
		}
		return success;
	}

	public boolean auntenticar(Usuario objUsuario) {
		boolean success = false;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "Select * FROM public.\"Usuario\" where usuario_usuario = '" + objUsuario.getUsuario() + "' and usuario_password = '" + Encriptar.sha1(objUsuario.getPass()) + "';";
			ps = getConnection().prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				success = true;
			}
		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		} finally {
			try {
				if (getConnection() != null)
					getConnection().close();
				if (ps != null)
					ps.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				System.out.println("Error" + e);
			}
		}
		return success;
	}

	public String tipo(Usuario objUsuario) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String tipo = "";
		try {
			String sql = "select usuario_tipo FROM public.\"Usuario\" where usuario_usuario = '" + objUsuario.getUsuario() + "' and usuario_password = '" + Encriptar.sha1(objUsuario.getPass()) + "';";
			ps = getConnection().prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				tipo = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		} finally {
			try {
				if (getConnection() != null)
					getConnection().close();
				if (ps != null)
					ps.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				System.out.println("Error" + e);
			}
		}
		return tipo;
	}
}