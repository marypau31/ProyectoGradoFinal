package com.proyectoconsultorio.myh.front.model;

import java.io.Serializable;

public class Acceso implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private String modulo;
     private String descripcion;

     public Acceso() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getModulo() {
          return modulo;
     }

     public void setModulo(String modulo) {
          this.modulo = modulo;
     }

     public String getDescripcion() {
          return descripcion;
     }

     public void setDescripcion(String descripcion) {
          this.descripcion = descripcion;
     }
}
