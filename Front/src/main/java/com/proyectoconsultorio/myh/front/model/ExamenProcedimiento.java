package com.proyectoconsultorio.myh.front.model;

import java.io.Serializable;

public class ExamenProcedimiento implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private String nombre;
     private String descripcion;
     private Procedimiento procedimiento;

     public ExamenProcedimiento() {
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

     public Procedimiento getProcedimiento() {
          return procedimiento;
     }

     public void setProcedimiento(Procedimiento procedimiento) {
          this.procedimiento = procedimiento;
     }
}
