package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ProcedimientoDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private Date fecha;
     private String observaciones;
     private ConsultaDto consulta;
     private List<ExamenProcedimientoDto> examenProcedimientoList;

     public ProcedimientoDto() {
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

     public String getObservaciones() {
          return observaciones;
     }

     public void setObservaciones(String observaciones) {
          this.observaciones = observaciones;
     }

     public ConsultaDto getConsulta() {
          return consulta;
     }

     public void setConsulta(ConsultaDto consulta) {
          this.consulta = consulta;
     }

     public List<ExamenProcedimientoDto> getExamenProcedimientoList() {
          return examenProcedimientoList;
     }

     public void setExamenProcedimientoList(List<ExamenProcedimientoDto> examenProcedimientoList) {
          this.examenProcedimientoList = examenProcedimientoList;
     }
}
