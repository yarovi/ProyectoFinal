package com.mitocode.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Paciente;

public interface IPacienteDAO extends JpaRepository<Paciente, Integer>{

}
