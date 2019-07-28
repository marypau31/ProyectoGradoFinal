package com.proyectoconsultorio.myh.back.model;

import java.io.Serializable;
public class Acompanante implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private String parentesco;
     private Cita cita;
     private Persona persona;

     public Acompanante() {
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

     public Cita getCita() {
          return cita;
     }

     public void setCita(Cita cita) {
          this.cita = cita;
     }

     public Persona getPersona() {
          return persona;
     }

     public void setPersona(Persona persona) {
          this.persona = persona;
     }
}
