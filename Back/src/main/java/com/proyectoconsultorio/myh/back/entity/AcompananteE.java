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
@Table(name = "Acompanante")
public class AcompananteE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     
     @Basic(optional = false)
     @Column(name = "Parentesco")
     private String parentesco;
     
     @JoinColumn(name = "IdCita", referencedColumnName = "Id")
     @ManyToOne(optional = false)
     private CitaE cita;
     
     @JoinColumn(name = "IdPersona", referencedColumnName = "Id")
     @ManyToOne(optional = false)
     private PersonaE persona;

     public AcompananteE() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getParentesco() {
          return parentesco;
     }

     public void setParentesco(String parentesco) {
          this.parentesco = parentesco;
     }

     public CitaE getCita() {
          return cita;
     }

     public void setCita(CitaE cita) {
          this.cita = cita;
     }

     public PersonaE getPersona() {
          return persona;
     }

     public void setPersona(PersonaE persona) {
          this.persona = persona;
     }
}
