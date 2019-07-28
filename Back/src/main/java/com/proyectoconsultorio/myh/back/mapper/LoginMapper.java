package com.proyectoconsultorio.myh.back.mapper;

import com.proyectoconsultorio.myh.back.entity.AccesoE;
import com.proyectoconsultorio.myh.back.entity.AccesoUsuarioE;
import com.proyectoconsultorio.myh.back.entity.PersonaE;
import com.proyectoconsultorio.myh.back.entity.UsuarioE;
import com.proyectoconsultorio.myh.back.model.Acceso;
import com.proyectoconsultorio.myh.back.model.AccesoUsuario;
import com.proyectoconsultorio.myh.back.model.Persona;
import com.proyectoconsultorio.myh.back.model.Trabajador;
import com.proyectoconsultorio.myh.back.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LoginMapper {
	
	public UsuarioE mapperInIniciarSesion(Usuario model) {
		UsuarioE entity = new UsuarioE();
		entity.setUsername(model.getUsername());
		entity.setPassword(model.getPassword());
		return entity;
	}
	
	public Usuario mapperOutIniciarSesion(UsuarioE entity) {
		Usuario model = new Usuario();
		model.setUsername(entity.getUsername());
		model.setId(entity.getId());
		return model;
	}
	
	public Usuario mapperOutIniciarSesion(Usuario model, PersonaE entity) {
		model.setTrabajador(new Trabajador());
		model.getTrabajador().setPersona(new Persona());
		model.getTrabajador().getPersona().setId(entity.getId());
		model.getTrabajador().getPersona().setNombres(entity.getNombres());
		model.getTrabajador().getPersona().setApellidos(entity.getApellidos());
		return model;
	}
	
	public Usuario mapperOutIniciarSesion(Usuario model, List<AccesoUsuarioE> listE) {
		model.setAccesoUsuarioList(new ArrayList<AccesoUsuario>());
		for (AccesoUsuarioE entity : listE) {
			AccesoUsuario accesoUsuario = new AccesoUsuario();
			accesoUsuario.setId(entity.getId());
			accesoUsuario.setCrear(entity.getCrear());
			accesoUsuario.setModificar(entity.getModificar());
			accesoUsuario.setLeer(entity.getLeer());
			accesoUsuario.setModificar(entity.getModificar());
			accesoUsuario.setAcceso(new Acceso());
			accesoUsuario.getAcceso().setId(entity.getAcceso().getId());
			model.getAccesoUsuarioList().add(accesoUsuario);
		}
		return model;
	}
	
	public Usuario mapperOutIniciarSesion(Usuario model, AccesoE entity) {
		for (AccesoUsuario iterable : model.getAccesoUsuarioList()) {
			if (Objects.equals(iterable.getAcceso().getId(), entity.getId())) {
				iterable.getAcceso().setModulo(entity.getModulo());
				iterable.getAcceso().setDescripcion(entity.getDescripcion());
				break;
			}
			
		}
		return model;
	}
}
