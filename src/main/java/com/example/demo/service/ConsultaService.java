package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.ConsultaDTO;
import com.example.demo.entities.Consulta;
import com.example.demo.entities.Medico;
import com.example.demo.entities.Paciente;
import com.example.demo.repository.ConsultaRepository;
import com.example.demo.service.execption.ObjectNotFoundExecption;

@Service
public class ConsultaService {
	
	@Autowired
	private ConsultaRepository consultaRepository;
	@Autowired
	private PacienteService pacienteService;
	@Autowired
	private MedicoService medicoService;
	
	
	public List<Consulta> findByPacienteId(Long pacienteId) {
		List<Consulta> consultas=consultaRepository.findByPacienteId(pacienteId);
		return consultas;
		
	}
	
	public Consulta save_consulta(ConsultaDTO consultaDTO) {
		Paciente paciente=pacienteService.findById(consultaDTO.getPacienteId());
		Medico medico=medicoService.findById(consultaDTO.getMedicoId());
		
		Consulta consulta= new Consulta(null, consultaDTO.getMotivo(), consultaDTO.getData(), consultaDTO.getHorario(), consultaDTO.getStatus()
				, paciente, medico);
		
		return consultaRepository.save(consulta);
		
	}

}
