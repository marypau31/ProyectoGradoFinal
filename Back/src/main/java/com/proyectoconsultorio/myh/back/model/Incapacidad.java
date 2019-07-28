package com.proyectoconsultorio.myh.back.model;

import com.proyectoconsultorio.myh.back.model.custom.Fechas;
import java.io.Serializable;

public class Incapacidad implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private Fechas fecha;
     private int dias;
     private String descripcion;
     private Consulta consulta;

     public Incapacidad() {
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

     public int getDias() {
          return dias;
     }

     public void setDias(int dias) {
          this.dias = dias;
     }

     public String getDescripcion() {
          return descripcion;
     }

     public void setDescripcion(String descripcion) {
          this.descripcion = descripcion;
     }

     public Consulta getConsulta() {
          return consulta;
     }

     public void setConsulta(Consulta consulta) {
          this.consulta = consulta;
     }
}
