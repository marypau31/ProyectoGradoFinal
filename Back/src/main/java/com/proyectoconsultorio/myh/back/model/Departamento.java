package com.proyectoconsultorio.myh.back.model;

import java.io.Serializable;
import java.util.List;

public class Departamento implements Serializable {

     private static final long serialVersionUID = 1L;

     private Long id;
     private int dane;
     private String nombre;
     private List<Municipio> municipioList;

     public Departamento() {
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

     public List<Municipio> getMunicipioList() {
          return municipioList;
     }

     public void setMunicipioList(List<Municipio> municipioList) {
          this.municipioList = municipioList;
     }
}
