package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Paciente;
import com.example.demo.entities.Telefone;
import com.example.demo.repository.PacienteRepsoitory;
import com.example.demo.repository.TelefoneRepository;

@SpringBootApplication
public class ConsultorioSpringApplication {
		@Autowired
		private PacienteRepsoitory pacienteRepsoitory;
		@Autowired
		private TelefoneRepository telefoneRepository;
		
	public static void main(String[] args) {
		SpringApplication.run(ConsultorioSpringApplication.class, args);
		
	}

	

}
