package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;

public class MedicamentosFormulaDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private String medicamento;
     private String descripcion;
     private FormulaDto formula;

     public MedicamentosFormulaDto() {
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

     public FormulaDto getFormula() {
          return formula;
     }

     public void setFormula(FormulaDto formula) {
          this.formula = formula;
     }
}
