package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CitaDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private Date fechaAsignada;
     private Date horaAsignada;
     private String estado;
     private String tipo;
     private Integer cantCert;
     private List<PeticionDto> peticionList;
     private List<AcompananteDto> acompananteList;
     private MetodoPagoDto metodoPago;
     private PersonaDto persona;

     public CitaDto() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public Date getFechaAsignada() {
		return fechaAsignada;
	}

	public void setFechaAsignada(Date fechaAsignada) {
		this.fechaAsignada = fechaAsignada;
	}

	public Date getHoraAsignada() {
		return horaAsignada;
	}

	public void setHoraAsignada(Date horaAsignada) {
		this.horaAsignada = horaAsignada;
	}

	public String getEstado() {
          return estado;
     }

     public void setEstado(String estado) {
          this.estado = estado;
     }

     public String getTipo() {
          return tipo;
     }

     public void setTipo(String tipo) {
          this.tipo = tipo;
     }

     public Integer getCantCert() {
          return cantCert;
     }

     public void setCantCert(Integer cantCert) {
          this.cantCert = cantCert;
     }

     public List<PeticionDto> getPeticionList() {
          return peticionList;
     }

     public void setPeticionList(List<PeticionDto> peticionList) {
          this.peticionList = peticionList;
     }

     public List<AcompananteDto> getAcompananteList() {
          return acompananteList;
     }

     public void setAcompananteList(List<AcompananteDto> acompananteList) {
          this.acompananteList = acompananteList;
     }

     public MetodoPagoDto getMetodoPago() {
          return metodoPago;
     }

     public void setMetodoPago(MetodoPagoDto metodoPago) {
          this.metodoPago = metodoPago;
     }

     public PersonaDto getPersona() {
          return persona;
     }

     public void setPersona(PersonaDto persona) {
          this.persona = persona;
     }
}
