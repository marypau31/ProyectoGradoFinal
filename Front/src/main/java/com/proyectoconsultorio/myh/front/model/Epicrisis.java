package com.proyectoconsultorio.myh.front.model;

import java.io.Serializable;
import java.util.List;

public class Epicrisis implements Serializable {

     private static final long serialVersionUID = 1L;

     private Long id;
     private List<Consulta> consultaList;
     private List<Diagnostico> diagnosticoList;
     private Persona persona;

     public Epicrisis() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public List<Consulta> getConsultaList() {
          return consultaList;
     }

     public void setConsultaList(List<Consulta> consultaList) {
          this.consultaList = consultaList;
     }

     public List<Diagnostico> getDiagnosticoList() {
          return diagnosticoList;
     }

     public void setDiagnosticoList(List<Diagnostico> diagnosticoList) {
          this.diagnosticoList = diagnosticoList;
     }

     public Persona getPersona() {
          return persona;
     }

     public void setPersona(Persona persona) {
          this.persona = persona;
     }
}
