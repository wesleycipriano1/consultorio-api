package com.example.demo.dtos;

import java.io.Serializable;

import com.example.demo.entities.Medico;

public class MedicoDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private  String nome;
	private String  especiliadade;
	public MedicoDTO() {
		// TODO Auto-generated constructor stub
	}
	public MedicoDTO(Medico medico) {
		super();
		this.id = medico.getId();
		this.nome = medico.getNome();
		this.especiliadade = medico.getEspecialidade();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspeciliadade() {
		return especiliadade;
	}
	public void setEspeciliadade(String especiliadade) {
		this.especiliadade = especiliadade;
	}

}
