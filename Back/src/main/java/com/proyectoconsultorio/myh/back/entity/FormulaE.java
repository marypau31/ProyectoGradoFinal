package com.proyectoconsultorio.myh.back.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Formula")
public class FormulaE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     
     @Basic(optional = false)
     @Column(name = "Fecha")
     @Temporal(TemporalType.DATE)
     private Date fecha;
     
     @Lob
     @Column(name = "Observaciones")
     private String observaciones;
     
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "formula")
     private List<MedicamentosFormulaE> medicamentosFormulaList;
     
     @JoinColumn(name = "IdConsulta", referencedColumnName = "Id")
     @ManyToOne(optional = false)
     private ConsultaE consulta;

     public FormulaE() {
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

     public List<MedicamentosFormulaE> getMedicamentosFormulaList() {
          return medicamentosFormulaList;
     }

     public void setMedicamentosFormulaList(List<MedicamentosFormulaE> medicamentosFormulaList) {
          this.medicamentosFormulaList = medicamentosFormulaList;
     }

     public ConsultaE getConsulta() {
          return consulta;
     }

     public void setConsulta(ConsultaE consulta) {
          this.consulta = consulta;
     }
}
