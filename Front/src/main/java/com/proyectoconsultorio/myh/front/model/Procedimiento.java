package com.proyectoconsultorio.myh.front.model;

import com.proyectoconsultorio.myh.front.model.custom.Fechas;
import java.io.Serializable;
import java.util.List;

public class Procedimiento implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private Fechas fecha;
     private String observaciones;
     private Consulta consulta;
     private List<ExamenProcedimiento> examenProcedimientoList;

     public Procedimiento() {
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

     public String getObservaciones() {
          return observaciones;
     }

     public void setObservaciones(String observaciones) {
          this.observaciones = observaciones;
     }

     public Consulta getConsulta() {
          return consulta;
     }

     public void setConsulta(Consulta consulta) {
          this.consulta = consulta;
     }

     public List<ExamenProcedimiento> getExamenProcedimientoList() {
          return examenProcedimientoList;
     }

     public void setExamenProcedimientoList(List<ExamenProcedimiento> examenProcedimientoList) {
          this.examenProcedimientoList = examenProcedimientoList;
     }
}
