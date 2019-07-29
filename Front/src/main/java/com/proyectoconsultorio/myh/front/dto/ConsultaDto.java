package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class ConsultaDto implements Serializable {

     private static final long serialVersionUID = 1L;

     private Long id;
     private Date fecha;
     private boolean tipoCita;
     private String motivoConsulta;
     private String enfermedadActual;
     private Integer presionSistola;
     private Integer presionDiastola;
     private Integer pulsacion;
     private Integer respiracion;
     private Float temperatura;
     private Integer peso;
     private Integer altura;
     private Float imc;
     private String observaciones;
     private CondicionesGeneralesDto condicionesGenerales;
     private List<ProcedimientoDto> procedimientoList;
     private EpicrisisDto epicrisis;
     private List<IncapacidadDto> incapacidadList;
     private List<FormulaDto> formulaList;
     private RevisionSintomasDto revisionsintomas;

     public ConsultaDto() {
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

     public CondicionesGeneralesDto getCondicionesGenerales() {
          return condicionesGenerales;
     }

     public void setCondicionesGenerales(CondicionesGeneralesDto condicionesGenerales) {
          this.condicionesGenerales = condicionesGenerales;
     }

     public List<ProcedimientoDto> getProcedimientoList() {
          return procedimientoList;
     }

     public void setProcedimientoList(List<ProcedimientoDto> procedimientoList) {
          this.procedimientoList = procedimientoList;
     }

     public EpicrisisDto getEpicrisis() {
          return epicrisis;
     }

     public void setEpicrisis(EpicrisisDto epicrisis) {
          this.epicrisis = epicrisis;
     }

     public List<IncapacidadDto> getIncapacidadList() {
          return incapacidadList;
     }

     public void setIncapacidadList(List<IncapacidadDto> incapacidadList) {
          this.incapacidadList = incapacidadList;
     }

     public List<FormulaDto> getFormulaList() {
          return formulaList;
     }

     public void setFormulaList(List<FormulaDto> formulaList) {
          this.formulaList = formulaList;
     }

     public RevisionSintomasDto getRevisionsintomas() {
          return revisionsintomas;
     }

     public void setRevisionsintomas(RevisionSintomasDto revisionsintomas) {
          this.revisionsintomas = revisionsintomas;
     }
}