package com.proyectoconsultorio.myh.back.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Epicrisis")
public class EpicrisisE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "epicrisis")
     private List<ConsultaE> consultaList;
     
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "epicrisis")
     private List<DiagnosticoE> diagnosticoList;
     
     @JoinColumn(name = "IdPersona", referencedColumnName = "Id")
     @ManyToOne(optional = false)
     private PersonaE persona;

     public EpicrisisE() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public List<ConsultaE> getConsultaList() {
          return consultaList;
     }

     public void setConsultaList(List<ConsultaE> consultaList) {
          this.consultaList = consultaList;
     }

     public List<DiagnosticoE> getDiagnosticoList() {
          return diagnosticoList;
     }

     public void setDiagnosticoList(List<DiagnosticoE> diagnosticoList) {
          this.diagnosticoList = diagnosticoList;
     }

     public PersonaE getPersona() {
          return persona;
     }

     public void setPersona(PersonaE persona) {
          this.persona = persona;
     }
}
