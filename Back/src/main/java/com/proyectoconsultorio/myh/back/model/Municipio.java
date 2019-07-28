package com.proyectoconsultorio.myh.back.model;

import java.io.Serializable;
import java.util.List;

public class Municipio implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private int dane;
     private String nombre;
     private List<Persona> personaList;
     private Departamento departamento;

     public Municipio() {
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

     public List<Persona> getPersonaList() {
          return personaList;
     }

     public void setPersonaList(List<Persona> personaList) {
          this.personaList = personaList;
     }

     public Departamento getDepartamento() {
          return departamento;
     }

     public void setDepartamento(Departamento departamento) {
          this.departamento = departamento;
     }
}
