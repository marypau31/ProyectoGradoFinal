package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;

public class RevisionSintomasDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private ConsultaDto consulta;
     private String piel;
     private String ojos;
     private String otorrino;
     private String cuello;
     private String cardioVascular;
     private String pulmonar;
     private String digestivo;
     private String genitoUrinario;
     private String musculoEsqueletico;
     private String otros;

     public RevisionSintomasDto() {
     }

     public String getPiel() {
          return piel;
     }

     public void setPiel(String piel) {
          this.piel = piel;
     }

     public String getOjos() {
          return ojos;
     }

     public void setOjos(String ojos) {
          this.ojos = ojos;
     }

     public String getOtorrino() {
          return otorrino;
     }

     public void setOtorrino(String otorrino) {
          this.otorrino = otorrino;
     }

     public String getCuello() {
          return cuello;
     }

     public void setCuello(String cuello) {
          this.cuello = cuello;
     }

     public String getCardioVascular() {
          return cardioVascular;
     }

     public void setCardioVascular(String cardioVascular) {
          this.cardioVascular = cardioVascular;
     }

     public String getPulmonar() {
          return pulmonar;
     }

     public void setPulmonar(String pulmonar) {
          this.pulmonar = pulmonar;
     }

     public String getDigestivo() {
          return digestivo;
     }

     public void setDigestivo(String digestivo) {
          this.digestivo = digestivo;
     }

     public String getGenitoUrinario() {
          return genitoUrinario;
     }

     public void setGenitoUrinario(String genitoUrinario) {
          this.genitoUrinario = genitoUrinario;
     }

     public String getMusculoEsqueletico() {
          return musculoEsqueletico;
     }

     public void setMusculoEsqueletico(String musculoEsqueletico) {
          this.musculoEsqueletico = musculoEsqueletico;
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
