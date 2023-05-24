package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long>{
	List<Consulta> findByPacienteId(Long pacienteId);
	List<Consulta>findByMedicoId(Long medicoId);

}
