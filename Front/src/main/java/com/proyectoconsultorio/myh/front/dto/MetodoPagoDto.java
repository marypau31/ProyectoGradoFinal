package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;
import java.util.List;

public class MetodoPagoDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private String nombre;
     private String descripcion;
     private Integer valor;
     private List<CitaDto> citaList;

     public MetodoPagoDto() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public String getDescripcion() {
          return descripcion;
     }

     public void setDescripcion(String descripcion) {
          this.descripcion = descripcion;
     }

     public Integer getValor() {
          return valor;
     }

     public void setValor(Integer valor) {
          this.valor = valor;
     }

     public List<CitaDto> getCitaList() {
          return citaList;
     }

     public void setCitaList(List<CitaDto> citaList) {
          this.citaList = citaList;
     }
}
