package com.example.demo.resorce;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Medico;
import com.example.demo.service.MedicoService;



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
	private List<Medico> findAll(){
		List<Medico> obj=medicoService.findAll();
		return obj;
		
		
		
		
	}

}
