package com.mitocode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.IPacienteDAO;
import com.mitocode.model.Paciente;
import com.mitocode.service.IPacienteService;

@Service
public class PacienteServiceImpl implements IPacienteService{
		
	@Autowired
	private IPacienteDAO dao;

	@Override
	public Paciente registrar(Paciente t) {
		return dao.save(t);
	}

	@Override
	public Paciente modificar(Paciente t) {
		return dao.save(t);		
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Paciente listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Paciente> listar() {
		return dao.findAll();
	}

}
