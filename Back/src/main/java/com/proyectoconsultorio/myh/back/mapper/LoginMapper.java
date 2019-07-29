package com.proyectoconsultorio.myh.back.mapper;

import java.util.ArrayList;
import java.util.List;

import com.proyectoconsultorio.myh.back.entity.AccesoUsuarioE;
import com.proyectoconsultorio.myh.back.entity.PersonaE;
import com.proyectoconsultorio.myh.back.entity.UsuarioE;
import com.proyectoconsultorio.myh.back.model.Acceso;
import com.proyectoconsultorio.myh.back.model.AccesoUsuario;
import com.proyectoconsultorio.myh.back.model.Persona;
import com.proyectoconsultorio.myh.back.model.Trabajador;
import com.proyectoconsultorio.myh.back.model.Usuario;

public class LoginMapper {
	
	public UsuarioE mapperInIniciarSesion(Usuario model) {
		UsuarioE entity = new UsuarioE();
		entity.setUsername(model.getUsername());
		entity.setPassword(model.getPassword());
		return entity;
	}
	
	public Usuario mapperOutIniciarSesion(List<AccesoUsuarioE> listE, UsuarioE entityU, PersonaE entityP) {
		Usuario model = new Usuario();
		model.setUsername(entityU.getUsername());
		model.setId(entityU.getId());
		model.setTrabajador(new Trabajador());
		model.getTrabajador().setPersona(new Persona());
		model.getTrabajador().getPersona().setNombres(entityP.getNombres());
		model.getTrabajador().getPersona().setApellidos(entityP.getApellidos());
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
			accesoUsuario.getAcceso().setModulo(entity.getAcceso().getModulo());
			accesoUsuario.getAcceso().setDescripcion(entity.getAcceso().getDescripcion());
			model.getAccesoUsuarioList().add(accesoUsuario);
		}
		return model;
	}
}
