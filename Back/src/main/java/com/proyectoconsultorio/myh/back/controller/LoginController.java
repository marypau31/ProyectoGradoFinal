package com.proyectoconsultorio.myh.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoconsultorio.myh.back.model.Usuario;
import com.proyectoconsultorio.myh.back.service.ILoginS;

@RestController
@RequestMapping("/V1/Login")
public class LoginController {
	
	@Autowired
	@Qualifier("LoginService")
	private ILoginS service;
	
	@PostMapping("/IniciarSesion")
	public Usuario iniciarSesion(@RequestBody Usuario usuario) {
		return service.iniciarSesion(usuario);
	}
	
	@PostMapping("/CerrarSesion")
	public void cerrarSesion(@RequestBody Usuario usuario) {
		service.cerrarSesion(usuario);
	}

}
