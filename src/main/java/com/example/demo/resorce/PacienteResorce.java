package com.example.demo.resorce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entities.Paciente;
import com.example.demo.service.PacienteService;

@RestController
@RequestMapping(value = "/pacientes")
public class PacienteResorce {
	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Paciente>findById(@PathVariable Long id){
		Paciente obj =pacienteService.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
	@GetMapping(value = "/")
	public ResponseEntity<List<Paciente>>findAll(){
		List<Paciente>list=pacienteService.findAll();
		return ResponseEntity.ok().body(list);
		
	}

}
