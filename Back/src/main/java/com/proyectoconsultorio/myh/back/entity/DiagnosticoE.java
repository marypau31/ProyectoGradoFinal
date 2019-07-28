package com.proyectoconsultorio.myh.back.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Diagnostico")
public class DiagnosticoE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     
     @JoinColumn(name = "IdEnfermedad", referencedColumnName = "Id")
     @ManyToOne(optional = false)
     private EnfermedadE enfermedad;
     
     @JoinColumn(name = "IdEpicrisis", referencedColumnName = "Id")
     @ManyToOne(optional = false)
     private EpicrisisE epicrisis;

     public DiagnosticoE() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public EnfermedadE getEnfermedad() {
          return enfermedad;
     }

     public void setEnfermedad(EnfermedadE enfermedad) {
          this.enfermedad = enfermedad;
     }

     public EpicrisisE getEpicrisis() {
          return epicrisis;
     }

     public void setEpicrisis(EpicrisisE epicrisis) {
          this.epicrisis = epicrisis;
     }
}
