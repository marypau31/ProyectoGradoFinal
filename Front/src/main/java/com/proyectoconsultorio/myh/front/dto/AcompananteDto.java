package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;
public class AcompananteDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private String parentesco;
     private CitaDto cita;
     private PersonaDto persona;

     public AcompananteDto() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getParentesco() {
          return parentesco;
     }

     public void setParentesco(String parentesco) {
          this.parentesco = parentesco;
     }

     public CitaDto getCita() {
          return cita;
     }

     public void setCita(CitaDto cita) {
          this.cita = cita;
     }

     public PersonaDto getPersona() {
          return persona;
     }

     public void setPersona(PersonaDto persona) {
          this.persona = persona;
     }
}
