package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Medico;
import com.example.demo.repository.MedicoRepository;
import com.example.demo.service.execption.ObjectNotFoundExecption;

@Service
public class MedicoService {
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	public Medico findById(Long id) {
		Optional<Medico> obj=medicoRepository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundExecption("medico não encontrado! id"+ id +"tipo"+Medico.class.getName() ));
		
	}
	public List<Medico> findAll() {
		List<Medico> obj=medicoRepository.findAll();
		return obj;
	}

}
