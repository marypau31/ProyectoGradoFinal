package com.proyectoconsultorio.myh.back.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoconsultorio.myh.back.entity.UsuarioE;

@Repository("UsuarioRepository")
public interface UsuarioR extends JpaRepository<UsuarioE, Serializable>{

	public abstract UsuarioE findByUsernameAndPassword (String username, String password);
}
