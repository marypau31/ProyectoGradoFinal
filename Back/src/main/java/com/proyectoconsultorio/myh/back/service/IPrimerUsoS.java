package com.proyectoconsultorio.myh.back.service;

import java.util.List;

import com.proyectoconsultorio.myh.back.model.Acceso;
import com.proyectoconsultorio.myh.back.model.Departamento;
import com.proyectoconsultorio.myh.back.model.Enfermedad;
import com.proyectoconsultorio.myh.back.model.Municipio;
import com.proyectoconsultorio.myh.back.model.Persona;
import com.proyectoconsultorio.myh.back.model.Sivigila;

public interface IPrimerUsoS {
	
	public void CargaAccesos(List<Acceso> list);
	
	public void CargaMunicipios(List<Municipio> lista);
	
	public void CargaDepartamentos(List<Departamento> lista);
	
	public void CargaSivigila(List<Sivigila> lista);
	
	public void CargaEnfermedades(List<Enfermedad> lista);
	
	public int CrearUsuario(Persona entity);
	
	public long VerCantUsuario();
}
