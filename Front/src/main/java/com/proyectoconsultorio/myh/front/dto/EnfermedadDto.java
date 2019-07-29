package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;
import java.util.List;

public class EnfermedadDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private String cie;
     private String nombre;
     private boolean frecuente;
     private SivigilaDto sivigila;
     private List<DiagnosticoDto> diagnosticoList;

     public EnfermedadDto() {
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

     public SivigilaDto getSivigila() {
          return sivigila;
     }

     public void setSivigila(SivigilaDto sivigila) {
          this.sivigila = sivigila;
     }

     public List<DiagnosticoDto> getDiagnosticoList() {
          return diagnosticoList;
     }

     public void setDiagnosticoList(List<DiagnosticoDto> diagnosticoList) {
          this.diagnosticoList = diagnosticoList;
     }
}
