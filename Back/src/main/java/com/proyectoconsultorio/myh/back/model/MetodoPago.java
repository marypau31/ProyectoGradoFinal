package com.proyectoconsultorio.myh.back.model;

import java.io.Serializable;
import java.util.List;

public class MetodoPago implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private String nombre;
     private String descripcion;
     private Integer valor;
     private List<Cita> citaList;

     public MetodoPago() {
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

     public List<Cita> getCitaList() {
          return citaList;
     }

     public void setCitaList(List<Cita> citaList) {
          this.citaList = citaList;
     }
}
