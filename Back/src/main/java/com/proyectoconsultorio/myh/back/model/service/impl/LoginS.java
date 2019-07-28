package com.proyectoconsultorio.myh.back.model.service.impl;

import com.proyectoconsultorio.myh.back.entity.PersonaE;
import com.proyectoconsultorio.myh.back.entity.UsuarioE;
import com.proyectoconsultorio.myh.back.model.Usuario;
import com.proyectoconsultorio.myh.back.model.mapper.LoginMapper;
import com.proyectoconsultorio.myh.back.model.repository.AccesoR;
import com.proyectoconsultorio.myh.back.model.repository.AccesoUsuarioR;
import com.proyectoconsultorio.myh.back.model.repository.PersonaR;
import com.proyectoconsultorio.myh.back.model.repository.TrabajadorR;
import com.proyectoconsultorio.myh.back.model.repository.UsuarioR;
import com.proyectoconsultorio.myh.back.model.service.ILoginS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("LoginService")
public class LoginS implements ILoginS {

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
          Usuario result = new Usuario();
          UsuarioE usuarioE = usuarioR.findByUsernameAndPassword(model.getUsername(), model.getPassword());
          result = mapper.mapperOutIniciarSesion(usuarioE);
          long id = usuarioE.getId();
          PersonaE personaE = personaR.findById(id);
          result = mapper.mapperOutIniciarSesion(result, personaE);
          return result;
     }

     @Override
     public void cerrarSesion(Usuario usuario) {
          // TODO Auto-generated method stub

     }

}
