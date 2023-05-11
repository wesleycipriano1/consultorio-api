package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Paciente;

public interface PacienteRepsoitory extends JpaRepository<Paciente, Long>{

}
