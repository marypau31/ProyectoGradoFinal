package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class FormulaDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private Date fecha;
     private String observaciones;
     private List<MedicamentosFormulaDto> medicamentosFormulaList;
     private ConsultaDto consulta;

     public FormulaDto() {
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

	public String getObservaciones() {
          return observaciones;
     }

     public void setObservaciones(String observaciones) {
          this.observaciones = observaciones;
     }

     public List<MedicamentosFormulaDto> getMedicamentosFormulaList() {
          return medicamentosFormulaList;
     }

     public void setMedicamentosFormulaList(List<MedicamentosFormulaDto> medicamentosFormulaList) {
          this.medicamentosFormulaList = medicamentosFormulaList;
     }

     public ConsultaDto getConsulta() {
          return consulta;
     }

     public void setConsulta(ConsultaDto consulta) {
          this.consulta = consulta;
     }
}
