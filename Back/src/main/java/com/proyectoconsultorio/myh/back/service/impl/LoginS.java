package com.proyectoconsultorio.myh.back.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.proyectoconsultorio.myh.back.entity.AccesoE;
import com.proyectoconsultorio.myh.back.entity.AccesoUsuarioE;
import com.proyectoconsultorio.myh.back.entity.PersonaE;
import com.proyectoconsultorio.myh.back.entity.UsuarioE;
import com.proyectoconsultorio.myh.back.mapper.LoginMapper;
import com.proyectoconsultorio.myh.back.model.Usuario;
import com.proyectoconsultorio.myh.back.repository.AccesoR;
import com.proyectoconsultorio.myh.back.repository.AccesoUsuarioR;
import com.proyectoconsultorio.myh.back.repository.PersonaR;
import com.proyectoconsultorio.myh.back.repository.TrabajadorR;
import com.proyectoconsultorio.myh.back.repository.UsuarioR;
import com.proyectoconsultorio.myh.back.service.ILoginS;

@Service("LoginService")
public class LoginS implements ILoginS{

	@Autowired
	@Qualifier("UsuarioRepository")
	private UsuarioR usuarioR;
	
	@Autowired
	@Qualifier("AccesoUsuarioRepository")
	private AccesoUsuarioR accesoUsuarioR;
	
	@Autowired
	@Qualifier("AccesoRepository")
	private AccesoR accesoR;
	
	@Autowired
	@Qualifier("PersonaRepository")
	private PersonaR personaR;
	
	@Autowired
	@Qualifier("TrabajadorRepository")
	private TrabajadorR trabajadorR;
	
	private LoginMapper mapper;

	@Override
	public Usuario iniciarSesion(Usuario model) {
		mapper = new LoginMapper();
		UsuarioE requestE = mapper.mapperInIniciarSesion(model);
		UsuarioE usuarioE = usuarioR.findByUsernameAndPassword(requestE.getUsername(), requestE.getPassword());
		long id = usuarioE.getId();
		PersonaE personaE = personaR.findById(id);
		List<AccesoUsuarioE> listE = accesoUsuarioR.findByUsuario(usuarioE);
		for (AccesoUsuarioE accesoUsuarioE : listE) {
			id = accesoUsuarioE.getAcceso().getId();
			AccesoE accesoE = accesoR.findById(id);
			accesoUsuarioE.setAcceso(accesoE);
		}
		return mapper.mapperOutIniciarSesion(listE, usuarioE, personaE);
	}

	@Override
	public void cerrarSesion(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}
	
	
}
