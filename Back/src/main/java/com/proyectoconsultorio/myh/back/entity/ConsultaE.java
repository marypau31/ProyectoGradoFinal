package com.proyectoconsultorio.myh.back.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "Consulta")
public class ConsultaE implements Serializable {

     private static final long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     
     @Basic(optional = false)
     @Column(name = "Fecha")
     @Temporal(TemporalType.TIMESTAMP)
     private Date fecha;
     
     @Basic(optional = false)
     @Column(name = "TipoCita")
     private boolean tipoCita;
     
     @Lob
     @Column(name = "MotivoConsulta")
     private String motivoConsulta;
     
     @Lob
     @Column(name = "EnfermedadActual")
     private String enfermedadActual;
     
     @Column(name = "presionSistola")
     private Integer presionSistola;
     
     @Column(name = "PresionDiastola")
     private Integer presionDiastola;
     
     @Column(name = "Pulsacion")
     private Integer pulsacion;
     
     @Column(name = "Respiracion")
     private Integer respiracion;
     
     @Column(name = "Temperatura")
     private Float temperatura;
     
     @Column(name = "Peso")
     private Integer peso;
     
     @Column(name = "Altura")
     private Integer altura;
     
     @Column(name = "IMC")
     private Float imc;
     
     @Lob
     @Column(name = "Observaciones")
     private String observaciones;
     
     @OneToOne(cascade = CascadeType.ALL, mappedBy = "consulta")
     private CondicionesGeneralesE condicionesGenerales;
     
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "consulta")
     private List<ProcedimientoE> procedimientoList;
     
     @JoinColumn(name = "IdEpicrisis", referencedColumnName = "Id")
     @ManyToOne(optional = false)
     private EpicrisisE epicrisis;
     
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "consulta")
     private List<IncapacidadE> incapacidadList;
     
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "consulta")
     private List<FormulaE> formulaList;
     
     @OneToOne(cascade = CascadeType.ALL, mappedBy = "consulta")
     private RevisionSintomasE revisionsintomas;

     public ConsultaE() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public Date getFecha() {
          return fecha;
     }

     public void setFecha(Date fecha) {
          this.fecha = fecha;
     }

     public boolean isTipoCita() {
          return tipoCita;
     }

     public void setTipoCita(boolean tipoCita) {
          this.tipoCita = tipoCita;
     }

     public String getMotivoConsulta() {
          return motivoConsulta;
     }

     public void setMotivoConsulta(String motivoConsulta) {
          this.motivoConsulta = motivoConsulta;
     }

     public String getEnfermedadActual() {
          return enfermedadActual;
     }

     public void setEnfermedadActual(String enfermedadActual) {
          this.enfermedadActual = enfermedadActual;
     }

     public Integer getPresionSistola() {
          return presionSistola;
     }

     public void setPresionSistola(Integer presionSistola) {
          this.presionSistola = presionSistola;
     }

     public Integer getPresionDiastola() {
          return presionDiastola;
     }

     public void setPresionDiastola(Integer presionDiastola) {
          this.presionDiastola = presionDiastola;
     }

     public Integer getPulsacion() {
          return pulsacion;
     }

     public void setPulsacion(Integer pulsacion) {
          this.pulsacion = pulsacion;
     }

     public Integer getRespiracion() {
          return respiracion;
     }

     public void setRespiracion(Integer respiracion) {
          this.respiracion = respiracion;
     }

     public Float getTemperatura() {
          return temperatura;
     }

     public void setTemperatura(Float temperatura) {
          this.temperatura = temperatura;
     }

     public Integer getPeso() {
          return peso;
     }

     public void setPeso(Integer peso) {
          this.peso = peso;
     }

     public Integer getAltura() {
          return altura;
     }

     public void setAltura(Integer altura) {
          this.altura = altura;
     }

     public Float getImc() {
          return imc;
     }

     public void setImc(Float imc) {
          this.imc = imc;
     }

     public String getObservaciones() {
          return observaciones;
     }

     public void setObservaciones(String observaciones) {
          this.observaciones = observaciones;
     }

     public CondicionesGeneralesE getCondicionesGenerales() {
          return condicionesGenerales;
     }

     public void setCondicionesGenerales(CondicionesGeneralesE condicionesGenerales) {
          this.condicionesGenerales = condicionesGenerales;
     }

     public List<ProcedimientoE> getProcedimientoList() {
          return procedimientoList;
     }

     public void setProcedimientoList(List<ProcedimientoE> procedimientoList) {
          this.procedimientoList = procedimientoList;
     }

     public EpicrisisE getEpicrisis() {
          return epicrisis;
     }

     public void setEpicrisis(EpicrisisE epicrisis) {
          this.epicrisis = epicrisis;
     }

     public List<IncapacidadE> getIncapacidadList() {
          return incapacidadList;
     }

     public void setIncapacidadList(List<IncapacidadE> incapacidadList) {
          this.incapacidadList = incapacidadList;
     }

     public List<FormulaE> getFormulaList() {
          return formulaList;
     }

     public void setFormulaList(List<FormulaE> formulaList) {
          this.formulaList = formulaList;
     }

     public RevisionSintomasE getRevisionsintomas() {
          return revisionsintomas;
     }

     public void setRevisionsintomas(RevisionSintomasE revisionsintomas) {
          this.revisionsintomas = revisionsintomas;
     }
}