package com.proyectoconsultorio.myh.back.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MedicamentosFormula")
public class MedicamentosFormulaE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     
     @Basic(optional = false)
     @Column(name = "Medicamento")
     private String medicamento;
     
     @Lob
     @Basic(optional = false)
     @Column(name = "Descripcion")
     private String descripcion;
     
     @JoinColumn(name = "IdFormula", referencedColumnName = "Id")
     @ManyToOne(optional = false)
     private FormulaE formula;

     public MedicamentosFormulaE() {
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

     public FormulaE getFormula() {
          return formula;
     }

     public void setFormula(FormulaE formula) {
          this.formula = formula;
     }
}
