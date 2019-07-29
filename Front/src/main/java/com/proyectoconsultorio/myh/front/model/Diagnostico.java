package com.proyectoconsultorio.myh.front.model;

import java.io.Serializable;

public class Diagnostico implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private Enfermedad enfermedad;
     private Epicrisis epicrisis;

     public Diagnostico() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public Enfermedad getEnfermedad() {
          return enfermedad;
     }

     public void setEnfermedad(Enfermedad enfermedad) {
          this.enfermedad = enfermedad;
     }

     public Epicrisis getEpicrisis() {
          return epicrisis;
     }

     public void setEpicrisis(Epicrisis epicrisis) {
          this.epicrisis = epicrisis;
     }
}
