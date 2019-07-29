package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;
import java.util.Date;


public class PeticionDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private Date fecha;
     private CitaDto cita;

     public PeticionDto() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public Date getFecha() {
          return fecha;
     }

     public void setFecha(Date fecha) {
          this.fecha = fecha;
     }

     public CitaDto getCita() {
          return cita;
     }

     public void setCita(CitaDto cita) {
          this.cita = cita;
     }
}
