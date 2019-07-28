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
@Table(name = "CondicionesGenerales")
public class CondicionesGeneralesE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     @JoinColumn(name = "Id", referencedColumnName = "Id", insertable = false, updatable = false)
     @OneToOne(optional = false)
     private ConsultaE consulta;
     
     @Lob
     @Column(name = "Cabeza")
     private String cabeza;
     
     @Lob
     @Column(name = "Cuello")
     private String cuello;
     
     @Lob
     @Column(name = "Ojos")
     private String ojos;
     
     @Lob
     @Column(name = "Oidos")
     private String oidos;
     
     @Lob
     @Column(name = "Nariz")
     private String nariz;
     
     @Lob
     @Column(name = "OroFaringe")
     private String orofaringe;
     
     @Lob
     @Column(name = "Dorso")
     private String dorso;
     
     @Lob
     @Column(name = "Mamas")
     private String mamas;
     
     @Lob
     @Column(name = "Cardiaco")
     private String cardiaco;
     
     @Lob
     @Column(name = "Pulmonar")
     private String pulmonar;
     
     @Lob
     @Column(name = "Abdomen")
     private String abdomen;
     
     @Lob
     @Column(name = "Genitales")
     private String genitales;
     
     @Lob
     @Column(name = "Extremidades")
     private String extremidades;
     
     @Lob
     @Column(name = "Neurologico")
     private String neurologico;
     
     @Lob
     @Column(name = "Piel")
     private String piel;
     
     @Lob
     @Column(name = "Otros")
     private String otros;

     public CondicionesGeneralesE() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getCabeza() {
          return cabeza;
     }

     public void setCabeza(String cabeza) {
          this.cabeza = cabeza;
     }

     public String getCuello() {
          return cuello;
     }

     public void setCuello(String cuello) {
          this.cuello = cuello;
     }

     public String getOjos() {
          return ojos;
     }

     public void setOjos(String ojos) {
          this.ojos = ojos;
     }

     public String getOidos() {
          return oidos;
     }

     public void setOidos(String oidos) {
          this.oidos = oidos;
     }

     public String getNariz() {
          return nariz;
     }

     public void setNariz(String nariz) {
          this.nariz = nariz;
     }

     public String getOrofaringe() {
          return orofaringe;
     }

     public void setOrofaringe(String orofaringe) {
          this.orofaringe = orofaringe;
     }

     public String getDorso() {
          return dorso;
     }

     public void setDorso(String dorso) {
          this.dorso = dorso;
     }

     public String getMamas() {
          return mamas;
     }

     public void setMamas(String mamas) {
          this.mamas = mamas;
     }

     public String getCardiaco() {
          return cardiaco;
     }

     public void setCardiaco(String cardiaco) {
          this.cardiaco = cardiaco;
     }

     public String getPulmonar() {
          return pulmonar;
     }

     public void setPulmonar(String pulmonar) {
          this.pulmonar = pulmonar;
     }

     public String getAbdomen() {
          return abdomen;
     }

     public void setAbdomen(String abdomen) {
          this.abdomen = abdomen;
     }

     public String getGenitales() {
          return genitales;
     }

     public void setGenitales(String genitales) {
          this.genitales = genitales;
     }

     public String getExtremidades() {
          return extremidades;
     }

     public void setExtremidades(String extremidades) {
          this.extremidades = extremidades;
     }

     public String getNeurologico() {
          return neurologico;
     }

     public void setNeurologico(String neurologico) {
          this.neurologico = neurologico;
     }

     public String getPiel() {
          return piel;
     }

     public void setPiel(String piel) {
          this.piel = piel;
     }

     public String getOtros() {
          return otros;
     }

     public void setOtros(String otros) {
          this.otros = otros;
     }

     public ConsultaE getConsulta() {
          return consulta;
     }

     public void setConsulta(ConsultaE consulta) {
          this.consulta = consulta;
     }
}
