package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;

public class DiagnosticoDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private EnfermedadDto enfermedad;
     private EpicrisisDto epicrisis;

     public DiagnosticoDto() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public EnfermedadDto getEnfermedad() {
          return enfermedad;
     }

     public void setEnfermedad(EnfermedadDto enfermedad) {
          this.enfermedad = enfermedad;
     }

     public EpicrisisDto getEpicrisis() {
          return epicrisis;
     }

     public void setEpicrisis(EpicrisisDto epicrisis) {
          this.epicrisis = epicrisis;
     }
}
