package com.proyectoconsultorio.myh.front.model;

import com.proyectoconsultorio.myh.front.model.custom.Fechas;
import java.io.Serializable;

public class Peticion implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private Fechas fecha;
     private Cita cita;

     public Peticion() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public Fechas getFecha() {
          return fecha;
     }

     public void setFecha(Fechas fecha) {
          this.fecha = fecha;
     }

     public Cita getCita() {
          return cita;
     }

     public void setCita(Cita cita) {
          this.cita = cita;
     }
}
