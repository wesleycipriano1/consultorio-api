package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Paciente;
import com.example.demo.repository.PacienteRepsoitory;
import com.example.demo.service.execption.ObjectNotFoundExecption;

@Service
public class PacienteService {
	@Autowired
	private PacienteRepsoitory pacienteRepsoitory;
	
	
	public Paciente findById(Long id) {
		Optional<Paciente>obj=pacienteRepsoitory.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundExecption("paciente não encontrado! id"+ id +"tipo"+Paciente.class.getName() ));
		
	}
	public List<Paciente> findAll(){
		List<Paciente>list=pacienteRepsoitory.findAll();
		return list;
	}
	
	public Paciente Add_paciente(Paciente paciente) {
		paciente.setId(null);
		return pacienteRepsoitory.save(paciente);
		
	}

}
