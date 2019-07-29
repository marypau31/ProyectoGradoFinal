package com.proyectoconsultorio.myh.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoconsultorio.myh.back.model.Acceso;
import com.proyectoconsultorio.myh.back.model.Departamento;
import com.proyectoconsultorio.myh.back.model.Enfermedad;
import com.proyectoconsultorio.myh.back.model.Municipio;
import com.proyectoconsultorio.myh.back.model.Persona;
import com.proyectoconsultorio.myh.back.model.Sivigila;
import com.proyectoconsultorio.myh.back.service.IPrimerUsoS;

@RestController
@RequestMapping("/V1/PrimerUso")
public class PrimerUsoController {

	@Autowired
	@Qualifier("PrimerUsoService")
	private IPrimerUsoS service;
	
	
	@PutMapping("/CargaDatos/Accesos")
	@ResponseStatus(HttpStatus.CREATED)
	public void CargaAccesos(@RequestBody List<Acceso> list) {
		service.CargaAccesos(list);
	}
	
	@PutMapping("/CargaDatos/Departamentos")
	@ResponseStatus(HttpStatus.CREATED)
	public void CargaDepartamentos(@RequestBody List<Departamento> list) {
		service.CargaDepartamentos(list);
	}
	
	@PutMapping("/CargaDatos/Municipios")
	@ResponseStatus(HttpStatus.CREATED)
	public void CargaMunicipios(@RequestBody List<Municipio> list) {
		service.CargaMunicipios(list);
	}
	
	@PutMapping("/CargaDatos/Sivigila")
	@ResponseStatus(HttpStatus.CREATED)
	public void CargaSivigila(@RequestBody List<Sivigila> list) {
		service.CargaSivigila(list);
	}
	
	@PutMapping("/CargaDatos/Enfermedades")
	@ResponseStatus(HttpStatus.CREATED)
	public void CargaEnfermedades(@RequestBody List<Enfermedad> list) {
		service.CargaEnfermedades(list);
	}
	
	@PostMapping("/Usuario/CrearUsuario")
	public int CrearUsuario(@RequestBody Persona model) {
		return service.CrearUsuario(model);
	}
	
	@GetMapping("/Usuario/CantUsuario")
	public @ResponseBody long VerCantUsarios() {
		return service.VerCantUsuario();
	}
}
