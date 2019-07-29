package com.proyectoconsultorio.myh.front.model;

import java.io.Serializable;
import java.util.List;

public class Sivigila implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private int cod;
     private String nombre;
     private String descripcion;
     private List<Enfermedad> enfermedadList;

     public Sivigila() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public int getCod() {
          return cod;
     }

     public void setCod(int cod) {
          this.cod = cod;
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

     public List<Enfermedad> getEnfermedadList() {
          return enfermedadList;
     }

     public void setEnfermedadList(List<Enfermedad> enfermedadList) {
          this.enfermedadList = enfermedadList;
     }
}
