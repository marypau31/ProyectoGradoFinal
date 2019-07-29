package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;
import java.util.List;

public class MunicipioDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private int dane;
     private String nombre;
     private List<PersonaDto> personaList;
     private DepartamentoDto departamento;

     public MunicipioDto() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public int getDane() {
          return dane;
     }

     public void setDane(int dane) {
          this.dane = dane;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public List<PersonaDto> getPersonaList() {
          return personaList;
     }

     public void setPersonaList(List<PersonaDto> personaList) {
          this.personaList = personaList;
     }

     public DepartamentoDto getDepartamento() {
          return departamento;
     }

     public void setDepartamento(DepartamentoDto departamento) {
          this.departamento = departamento;
     }
}
