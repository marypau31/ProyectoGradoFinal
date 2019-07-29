package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;
import java.util.List;

public class EpicrisisDto implements Serializable {

     private static final long serialVersionUID = 1L;

     private Long id;
     private List<ConsultaDto> consultaList;
     private List<DiagnosticoDto> diagnosticoList;
     private PersonaDto persona;

     public EpicrisisDto() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public List<ConsultaDto> getConsultaList() {
          return consultaList;
     }

     public void setConsultaList(List<ConsultaDto> consultaList) {
          this.consultaList = consultaList;
     }

     public List<DiagnosticoDto> getDiagnosticoList() {
          return diagnosticoList;
     }

     public void setDiagnosticoList(List<DiagnosticoDto> diagnosticoList) {
          this.diagnosticoList = diagnosticoList;
     }

     public PersonaDto getPersona() {
          return persona;
     }

     public void setPersona(PersonaDto persona) {
          this.persona = persona;
     }
}
