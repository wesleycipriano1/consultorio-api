package com.example.demo.resorce;

import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.ConsultaDTO;
import com.example.demo.entities.Consulta;
import com.example.demo.service.ConsultaService;

@RestController
@RequestMapping(value="/consultas")
public class ConsultaResorce {
	@Autowired
	private ConsultaService consultaService;
	
	@GetMapping(value = "paciente/{pacienteId}")
	public  ResponseEntity<List<Consulta>> findByPacienteId(@PathVariable Long pacienteId){
		List<Consulta>consultas=consultaService.findByPacienteId(pacienteId);
		if (consultas.isEmpty()) {
			return ResponseEntity.noContent().build();
			
		}
		return ResponseEntity.ok(consultas);
		
	}
	
	@PostMapping(value="/")
    public ResponseEntity<Consulta> criarConsulta(@RequestBody ConsultaDTO consultaDTO) {
        try {
            Consulta consulta = consultaService.save_consulta(consultaDTO);
            return ResponseEntity.ok(consulta);
        } catch (ObjectNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

}
