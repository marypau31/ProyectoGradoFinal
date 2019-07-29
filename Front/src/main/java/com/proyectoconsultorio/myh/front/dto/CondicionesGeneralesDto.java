package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;
public class CondicionesGeneralesDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private ConsultaDto consulta;
     private String cabeza;
     private String cuello;
     private String ojos;
     private String oidos;
     private String nariz;
     private String orofaringe;
     private String dorso;
     private String mamas;
     private String cardiaco;
     private String pulmonar;
     private String abdomen;
     private String genitales;
     private String extremidades;
     private String neurologico;
     private String piel;
     private String otros;

     public CondicionesGeneralesDto() {
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

     public ConsultaDto getConsulta() {
          return consulta;
     }

     public void setConsulta(ConsultaDto consulta) {
          this.consulta = consulta;
     }
}
