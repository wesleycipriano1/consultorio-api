package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Paciente;
import com.example.demo.entities.Telefone;
import com.example.demo.repository.PacienteRepsoitory;
import com.example.demo.repository.TelefoneRepository;
import com.example.demo.service.execption.ObjectNotFoundExecption;

@Service
public class TelefoneService {
	@Autowired
	private TelefoneRepository telefoneRepository;
	@Autowired
	private PacienteService pacienteService;
	
	public Telefone findById(Long id) {
		Optional<Telefone> tel=telefoneRepository.findById(id);
		return tel.orElseThrow(()-> new ObjectNotFoundExecption("telefone  não encontrado! id"+ id +"tipo"+Telefone.class.getName() ));
		
	}
	public List<Telefone> findAll() {
	    return telefoneRepository.findAll();
	}
	public Telefone add_telefone(Telefone telefone ,Long pacienteId) {
		telefone.setId(null);
		
		Paciente paciente= pacienteService.findById(pacienteId);
		telefone.setPaciente(paciente);
		
		return telefoneRepository.save(telefone);
		
	}

}
