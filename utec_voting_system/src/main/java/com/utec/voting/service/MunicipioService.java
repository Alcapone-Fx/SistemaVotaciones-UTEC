package com.utec.voting.service;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

import com.utec.voting.jdbc.Conexion;
import com.utec.voting.modelo.Municipio;

public class MunicipioService extends Conexion implements Service<Municipio>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public ArrayList<Municipio> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean save(Municipio t) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean update(Municipio t) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Municipio t) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Municipio finById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Municipio finById(String id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
