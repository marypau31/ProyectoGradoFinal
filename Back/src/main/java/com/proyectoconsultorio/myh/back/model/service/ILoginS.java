package com.proyectoconsultorio.myh.back.model.service;

import com.proyectoconsultorio.myh.back.model.Usuario;

public interface ILoginS {

	public Usuario iniciarSesion(Usuario usuario);
	
	public void cerrarSesion(Usuario usuario);
}
