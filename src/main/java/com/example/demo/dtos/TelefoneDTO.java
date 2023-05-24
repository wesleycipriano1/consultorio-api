package com.example.demo.dtos;

import java.io.Serializable;
import java.util.Objects;

public class TelefoneDTO implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String  numero;
	
	public TelefoneDTO() {
		// TODO Auto-generated constructor stub
	}

	public TelefoneDTO(Long id, String numero) {
		super();
		this.id = id;
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TelefoneDTO other = (TelefoneDTO) obj;
		return Objects.equals(id, other.id);
	}

}
