package com.example.demo.resorce;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.dtos.MedicoDTO;
import com.example.demo.entities.Medico;
import com.example.demo.service.MedicoService;

import jakarta.servlet.Servlet;



@RestController
@RequestMapping(value = "/medicos")
public class Medicoresorce {
	
	@Autowired
	private MedicoService medicoService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Medico> findById(@PathVariable Long id){
		Medico obj= medicoService.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
	@GetMapping(value = "/")
	public  ResponseEntity<List<MedicoDTO>> findAll(){
		List<Medico> list=medicoService.findAll();
		List<MedicoDTO>listDTO=list.stream().map(obj-> new MedicoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
		}
	@PostMapping(value = "/")
	public ResponseEntity<Medico>add_medico(@RequestBody Medico medico){
		medico=medicoService.add_medico(medico);
		URI uri=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(medico.getId()).toUri();
		return ResponseEntity.created(uri).build();
		
	}

}
