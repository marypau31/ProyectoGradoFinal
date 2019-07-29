package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;
import java.util.List;

public class DepartamentoDto implements Serializable {

     private static final long serialVersionUID = 1L;

     private Long id;
     private int dane;
     private String nombre;
     private List<MunicipioDto> municipioList;

     public DepartamentoDto() {
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

     public List<MunicipioDto> getMunicipioList() {
          return municipioList;
     }

     public void setMunicipioList(List<MunicipioDto> municipioList) {
          this.municipioList = municipioList;
     }
}
