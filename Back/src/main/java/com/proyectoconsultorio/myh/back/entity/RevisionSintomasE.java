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
@Table(name = "RevisionSintomas")
public class RevisionSintomasE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     @JoinColumn(name = "Id", referencedColumnName = "Id", insertable = false, updatable = false)
     @OneToOne(optional = false)
     private ConsultaE consulta;
     
     @Lob
     @Column(name = "Piel")
     private String piel;
     
     @Lob
     @Column(name = "Ojos")
     private String ojos;
     
     @Lob
     @Column(name = "Otorrino")
     private String otorrino;
     
     @Lob
     @Column(name = "Cuello")
     private String cuello;
     
     @Lob
     @Column(name = "CardioVascular")
     private String cardioVascular;
     
     @Lob
     @Column(name = "Pulmonar")
     private String pulmonar;
     
     @Lob
     @Column(name = "Digestivo")
     private String digestivo;
     
     @Lob
     @Column(name = "GenitoUrinario")
     private String genitoUrinario;
     
     @Lob
     @Column(name = "MusculoEsqueletico")
     private String musculoEsqueletico;
     
     @Lob
     @Column(name = "Otros")
     private String otros;

     public RevisionSintomasE() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
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

     public ConsultaE getConsulta() {
          return consulta;
     }

     public void setConsulta(ConsultaE consulta) {
          this.consulta = consulta;
     }
}
