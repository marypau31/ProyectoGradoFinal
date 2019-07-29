package com.proyectoconsultorio.myh.back.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.proyectoconsultorio.myh.back.entity.AccesoE;
import com.proyectoconsultorio.myh.back.entity.AccesoUsuarioE;
import com.proyectoconsultorio.myh.back.entity.DepartamentoE;
import com.proyectoconsultorio.myh.back.entity.EnfermedadE;
import com.proyectoconsultorio.myh.back.entity.MunicipioE;
import com.proyectoconsultorio.myh.back.entity.PersonaE;
import com.proyectoconsultorio.myh.back.entity.SivigilaE;
import com.proyectoconsultorio.myh.back.entity.TrabajadorE;
import com.proyectoconsultorio.myh.back.entity.UsuarioE;
import com.proyectoconsultorio.myh.back.model.Acceso;
import com.proyectoconsultorio.myh.back.model.Departamento;
import com.proyectoconsultorio.myh.back.model.Enfermedad;
import com.proyectoconsultorio.myh.back.model.Municipio;
import com.proyectoconsultorio.myh.back.model.Persona;
import com.proyectoconsultorio.myh.back.model.Sivigila;

@Component
public class PrimerUsoMapper {
	
	private FechasMapper mapper;

	public List<AccesoE> mapperInAccesosList(List<Acceso> list) {
		List<AccesoE> listE = new ArrayList<AccesoE>();
		for (Acceso model : list) {
			AccesoE entity = new AccesoE();
			entity.setId(model.getId());
			entity.setModulo(model.getModulo());
			if (model.getDescripcion() != null) {
				entity.setDescripcion(model.getDescripcion());
			}
			listE.add(entity);
		}
		return listE;
	}
	
	public List<DepartamentoE> mapperInDepartamentoList(List<Departamento> list) {
		List<DepartamentoE> listE = new ArrayList<DepartamentoE>();
		for (Departamento model : list) {
			DepartamentoE entity = new DepartamentoE();
			entity.setId(model.getId());
			entity.setDane(model.getDane());
			entity.setNombre(model.getNombre());
			listE.add(entity);
		}
		return listE;
	}
	
	public List<EnfermedadE> mapperInEnfermedadList(List<Enfermedad> list) {
		List<EnfermedadE> listE = new ArrayList<EnfermedadE>();
		for (Enfermedad model : list) {
			EnfermedadE entity = new EnfermedadE();
			entity.setId(model.getId());
			entity.setCie(model.getCie());
			entity.setNombre(model.getNombre());
			entity.setFrecuente(model.getFrecuente());
			if (model.getSivigila() != null) {
				entity.setSivigila(new SivigilaE());
				entity.getSivigila().setId(model.getSivigila().getId());
			}
			listE.add(entity);
		}
		return listE;
	}
	
	public List<MunicipioE> mapperInMunicipioList(List<Municipio> list) {
		List<MunicipioE> listE = new ArrayList<MunicipioE>();
		for (Municipio model : list) {
			MunicipioE entity = new MunicipioE();
			entity.setId(model.getId());
			entity.setDane(model.getDane());
			entity.setNombre(model.getNombre());
			entity.setDepartamento(new DepartamentoE());
			entity.getDepartamento().setId(model.getDepartamento().getId());
			listE.add(entity);
		}
		return listE;
	}
	
	public List<SivigilaE> mapperInSivigilaList(List<Sivigila> list) {
		List<SivigilaE> listE = new ArrayList<SivigilaE>();
		for (Sivigila model : list) {
			SivigilaE entity = new SivigilaE();
			entity.setCod(model.getCod());
			entity.setId(model.getId());
			entity.setNombre(model.getNombre());
			if (model.getDescripcion() != null) {
				entity.setDescripcion(model.getDescripcion());
			}
			listE.add(entity);
		}
		return listE;
	}
	
	public PersonaE mapperInPersona(Persona model) {
		PersonaE entity = new PersonaE();
		entity.setId(model.getId());
		entity.setNombres(model.getNombres());
		entity.setApellidos(model.getApellidos());
		entity.setNumeroDocumento(model.getNumeroDocumento());
		entity.setTipoDocumento(model.getTipoDocumento());
		return entity;
	}
	
	public TrabajadorE mapperInTrabajador(Persona model) {
		mapper = new FechasMapper();
		TrabajadorE entity = new TrabajadorE();
		entity.setId(model.getId());
		entity.setFechaIngreso(mapper.fechaMapper(model.getTrabajador().getFechaIngreso()));
		entity.setCargo(model.getTrabajador().getCargo());
		return entity;
	}
	
	public UsuarioE mapperInUsuario(Persona model) {
		UsuarioE entity = new UsuarioE();
		entity.setUsername(model.getTrabajador().getUsuario().getUsername());
		entity.setPassword(model.getTrabajador().getUsuario().getPassword());
		entity.setActivo(true);
		entity.setBloqueado(false);
		entity.setId(model.getId());
		entity.setTrabajador(mapperInTrabajador(model));
		return entity;
	}

	public AccesoUsuarioE mapperInAccesoUsuarioList(Persona model) {
		AccesoUsuarioE accesoE = new AccesoUsuarioE();
		accesoE.setId((long) 1);
		accesoE.setUsuario(mapperInUsuario(model));
		accesoE.setAcceso(new AccesoE());
		accesoE.getAcceso().setId((long)1);
		accesoE.setCrear(true);
		accesoE.setModificar(false);
		accesoE.setLeer(true);
		accesoE.setBorrar(false);
		return accesoE;
	}
}
