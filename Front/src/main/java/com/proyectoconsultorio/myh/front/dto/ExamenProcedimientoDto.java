package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;

public class ExamenProcedimientoDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private String nombre;
     private String descripcion;
     private ProcedimientoDto procedimiento;

     public ExamenProcedimientoDto() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public String getDescripcion() {
          return descripcion;
     }

     public void setDescripcion(String descripcion) {
          this.descripcion = descripcion;
     }

     public ProcedimientoDto getProcedimiento() {
          return procedimiento;
     }

     public void setProcedimiento(ProcedimientoDto procedimiento) {
          this.procedimiento = procedimiento;
     }
}
