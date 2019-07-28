package com.proyectoconsultorio.myh.back.model;

import java.io.Serializable;
import java.util.List;

public class Enfermedad implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private String cie;
     private String nombre;
     private boolean frecuente;
     private Sivigila sivigila;
     private List<Diagnostico> diagnosticoList;

     public Enfermedad() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getCie() {
          return cie;
     }

     public void setCie(String cie) {
          this.cie = cie;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public boolean getFrecuente() {
          return frecuente;
     }

     public void setFrecuente(boolean frecuente) {
          this.frecuente = frecuente;
     }

     public Sivigila getSivigila() {
          return sivigila;
     }

     public void setSivigila(Sivigila sivigila) {
          this.sivigila = sivigila;
     }

     public List<Diagnostico> getDiagnosticoList() {
          return diagnosticoList;
     }

     public void setDiagnosticoList(List<Diagnostico> diagnosticoList) {
          this.diagnosticoList = diagnosticoList;
     }
}
