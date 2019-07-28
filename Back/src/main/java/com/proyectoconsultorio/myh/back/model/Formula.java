package com.proyectoconsultorio.myh.back.model;

import java.io.Serializable;
import java.util.List;

public class Formula implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private Fechas fecha;
     private String observaciones;
     private List<MedicamentosFormula> medicamentosFormulaList;
     private Consulta consulta;

     public Formula() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public Fechas getFecha() {
		return fecha;
	}

	public void setFecha(Fechas fecha) {
		this.fecha = fecha;
	}

	public String getObservaciones() {
          return observaciones;
     }

     public void setObservaciones(String observaciones) {
          this.observaciones = observaciones;
     }

     public List<MedicamentosFormula> getMedicamentosFormulaList() {
          return medicamentosFormulaList;
     }

     public void setMedicamentosFormulaList(List<MedicamentosFormula> medicamentosFormulaList) {
          this.medicamentosFormulaList = medicamentosFormulaList;
     }

     public Consulta getConsulta() {
          return consulta;
     }

     public void setConsulta(Consulta consulta) {
          this.consulta = consulta;
     }
}
