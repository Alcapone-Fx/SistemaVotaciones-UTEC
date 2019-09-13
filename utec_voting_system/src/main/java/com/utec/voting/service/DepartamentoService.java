package com.utec.voting.service;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

import com.utec.voting.jdbc.Conexion;
import com.utec.voting.modelo.Departamento;

public class DepartamentoService extends Conexion implements Service<Departamento>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public ArrayList<Departamento> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean save(Departamento t) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean update(Departamento t) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Departamento t) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Departamento finById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Departamento finById(String id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
