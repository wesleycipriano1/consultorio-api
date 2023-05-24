package com.example.demo.dtos;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

	public class ConsultaDTO implements Serializable{
	    
		private static final long serialVersionUID = 1L;
		private Long pacienteId;
	    private Long medicoId;
	    private String motivo;
	    private LocalDate data;
	    private LocalTime horario;
	    private String status="pendente";
	    
	    public ConsultaDTO() {
			// TODO Auto-generated constructor stub
		}
	    

	    

	    public ConsultaDTO(Long pacienteId, Long medicoId, String motivo, LocalDate data, LocalTime horario,
				String status) {
			super();
			this.pacienteId = pacienteId;
			this.medicoId = medicoId;
			this.motivo = motivo;
			this.data = data;
			this.horario = horario;
			this.status = status;
		}




		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getPacienteId() {
	        return pacienteId;
	    }

	    public void setPacienteId(Long pacienteId) {
	        this.pacienteId = pacienteId;
	    }

	    public Long getMedicoId() {
	        return medicoId;
	    }

	    public void setMedicoId(Long medicoId) {
	        this.medicoId = medicoId;
	    }

	    public String getMotivo() {
	        return motivo;
	    }

	    public void setMotivo(String motivo) {
	        this.motivo = motivo;
	    }

	    public LocalDate getData() {
	        return data;
	    }

	    public void setData(LocalDate data) {
	        this.data = data;
	    }

	    public LocalTime getHorario() {
	        return horario;
	    }

	    public void setHorario(LocalTime horario) {
	        this.horario = horario;
	    }
	}



