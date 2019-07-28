package com.proyectoconsultorio.myh.back.model;

import java.io.Serializable;
import java.util.List;

public class Cita implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private Fechas fechaAsignada;
     private Fechas horaAsignada;
     private String estado;
     private String tipo;
     private Integer cantCert;
     private List<Peticion> peticionList;
     private List<Acompanante> acompananteList;
     private MetodoPago metodoPago;
     private Persona persona;

     public Cita() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public Fechas getFechaAsignada() {
		return fechaAsignada;
	}

	public void setFechaAsignada(Fechas fechaAsignada) {
		this.fechaAsignada = fechaAsignada;
	}

	public Fechas getHoraAsignada() {
		return horaAsignada;
	}

	public void setHoraAsignada(Fechas horaAsignada) {
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

     public List<Peticion> getPeticionList() {
          return peticionList;
     }

     public void setPeticionList(List<Peticion> peticionList) {
          this.peticionList = peticionList;
     }

     public List<Acompanante> getAcompananteList() {
          return acompananteList;
     }

     public void setAcompananteList(List<Acompanante> acompananteList) {
          this.acompananteList = acompananteList;
     }

     public MetodoPago getMetodoPago() {
          return metodoPago;
     }

     public void setMetodoPago(MetodoPago metodoPago) {
          this.metodoPago = metodoPago;
     }

     public Persona getPersona() {
          return persona;
     }

     public void setPersona(Persona persona) {
          this.persona = persona;
     }
}
