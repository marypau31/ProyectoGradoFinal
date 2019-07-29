package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;

public class AccesoDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private String modulo;
     private String descripcion;

     public AccesoDto() {
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
