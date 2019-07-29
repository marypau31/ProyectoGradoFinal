package com.proyectoconsultorio.myh.back.model;

import java.io.Serializable;

public class MedicamentosFormula implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private String medicamento;
     private String descripcion;
     private Formula formula;

     public MedicamentosFormula() {
     }
     
     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getMedicamento() {
          return medicamento;
     }

     public void setMedicamento(String medicamento) {
          this.medicamento = medicamento;
     }

     public String getDescripcion() {
          return descripcion;
     }

     public void setDescripcion(String descripcion) {
          this.descripcion = descripcion;
     }

     public Formula getFormula() {
          return formula;
     }

     public void setFormula(Formula formula) {
          this.formula = formula;
     }
}
