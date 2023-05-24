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

import com.example.demo.dtos.TelefoneDTO;
import com.example.demo.entities.Telefone;
import com.example.demo.service.TelefoneService;

@RestController
@RequestMapping(value = "telefones")
public class TelefoneResorce {
	@Autowired
	private TelefoneService telefoneService;
	@GetMapping("/")
	public List<TelefoneDTO> findAll() {
		List<Telefone> telefones = telefoneService.findAll();
	    return telefones.stream()
	        .map(telefone -> new TelefoneDTO(telefone.getId(), telefone.getNumero()))
	        .collect(Collectors.toList());

	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Telefone>findById(@PathVariable Long id){
		Telefone tel=telefoneService.findById(id);
		return ResponseEntity.ok().body(tel);
		
	}
	@PostMapping(value = "/{pacienteId}")
	public ResponseEntity<Telefone> add_telefone(@PathVariable Long pacienteId,@RequestBody Telefone telefone) {
		telefone=telefoneService.add_telefone(telefone,pacienteId);
		URI uri=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(telefone.getId()).toUri();
		return ResponseEntity.created(uri).build();
		
	}

}
