package com.proyectoconsultorio.myh.back.model;

import java.io.Serializable;
public class Antecedentes implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private Persona persona;
     private String alergias;
     private String toxicologicos;
     private String quirurgicos;
     private String familiares;
     private String farmacologicos;
     private String inmunizaciones;
     private String traumatologicos;
     private String ginecologicos;

     public Antecedentes() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public Persona getPersona() {
          return persona;
     }

     public void setPersona(Persona persona) {
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
