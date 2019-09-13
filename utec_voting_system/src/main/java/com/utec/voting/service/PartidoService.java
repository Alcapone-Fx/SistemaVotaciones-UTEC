package com.utec.voting.service;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

import com.utec.voting.jdbc.Conexion;
import com.utec.voting.modelo.Partido;

public class PartidoService extends Conexion implements Service<Partido>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public ArrayList<Partido> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean save(Partido t) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean update(Partido t) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Partido t) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Partido finById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Partido finById(String id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
