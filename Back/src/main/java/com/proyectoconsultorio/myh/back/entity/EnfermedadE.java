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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Enfermedad")
public class EnfermedadE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     
     @Basic(optional = false)
     @Column(name = "CIE", unique = true)
     private String cie;
     
     @Lob
     @Basic(optional = false)
     @Column(name = "Nombre")
     private String nombre;
     
     @Basic(optional = false)
     @Column(name = "Frecuente")
     private boolean frecuente;
     
     @JoinColumn(name = "IdSivigila", referencedColumnName = "Id")
     @ManyToOne
     private SivigilaE sivigila;
     
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "enfermedad")
     private List<DiagnosticoE> diagnosticoList;

     public EnfermedadE() {
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

     public SivigilaE getSivigila() {
          return sivigila;
     }

     public void setSivigila(SivigilaE sivigila) {
          this.sivigila = sivigila;
     }

     public List<DiagnosticoE> getDiagnosticoList() {
          return diagnosticoList;
     }

     public void setDiagnosticoList(List<DiagnosticoE> diagnosticoList) {
          this.diagnosticoList = diagnosticoList;
     }
}
