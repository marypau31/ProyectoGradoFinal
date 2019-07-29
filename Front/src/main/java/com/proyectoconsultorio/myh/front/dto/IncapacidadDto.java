package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;
import java.util.Date;

public class IncapacidadDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private Date fecha;
     private int dias;
     private String descripcion;
     private ConsultaDto consulta;

     public IncapacidadDto() {
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

     public ConsultaDto getConsulta() {
          return consulta;
     }

     public void setConsulta(ConsultaDto consulta) {
          this.consulta = consulta;
     }
}
