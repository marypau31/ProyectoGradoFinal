package com.proyectoconsultorio.myh.back.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Antecedentes")
public class AntecedentesE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     @JoinColumn(name = "Id", referencedColumnName = "Id", insertable = false, updatable = false)
     @OneToOne(optional = false)
     private PersonaE persona;
     
     @Basic(optional = false)
     @Lob
     @Column(name = "Alergias")
     private String alergias;
     
     @Basic(optional = false)
     @Lob
     @Column(name = "Toxicologicos")
     private String toxicologicos;
     
     @Basic(optional = false)
     @Lob
     @Column(name = "Quirurgicos")
     private String quirurgicos;
     
     @Basic(optional = false)
     @Lob
     @Column(name = "Familiares")
     private String familiares;
     
     @Basic(optional = false)
     @Lob
     @Column(name = "Farmacologicos")
     private String farmacologicos;
     
     @Basic(optional = false)
     @Lob
     @Column(name = "Inmunizaciones")
     private String inmunizaciones;
     
     @Basic(optional = false)
     @Lob
     @Column(name = "Traumatologicos")
     private String traumatologicos;
     
     @Basic(optional = false)
     @Lob
     @Column(name = "Ginecologicos")
     private String ginecologicos;

     public AntecedentesE() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public PersonaE getPersona() {
          return persona;
     }

     public void setPersona(PersonaE persona) {
          this.persona = persona;
     }

     public String getAlergias() {
          return alergias;
     }

     public void setAlergias(String alergias) {
          this.alergias = alergias;
     }

     public String getToxicologicos() {
          return toxicologicos;
     }

     public void setToxicologicos(String toxicologicos) {
          this.toxicologicos = toxicologicos;
     }

     public String getQuirurgicos() {
          return quirurgicos;
     }

     public void setQuirurgicos(String quirurgicos) {
          this.quirurgicos = quirurgicos;
     }

     public String getFamiliares() {
          return familiares;
     }

     public void setFamiliares(String familiares) {
          this.familiares = familiares;
     }

     public String getFarmacologicos() {
          return farmacologicos;
     }

     public void setFarmacologicos(String farmacologicos) {
          this.farmacologicos = farmacologicos;
     }

     public String getInmunizaciones() {
          return inmunizaciones;
     }

     public void setInmunizaciones(String inmunizaciones) {
          this.inmunizaciones = inmunizaciones;
     }

     public String getTraumatologicos() {
          return traumatologicos;
     }

     public void setTraumatologicos(String traumatologicos) {
          this.traumatologicos = traumatologicos;
     }

     public String getGinecologicos() {
          return ginecologicos;
     }

     public void setGinecologicos(String ginecologicos) {
          this.ginecologicos = ginecologicos;
     }
}
