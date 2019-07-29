package com.proyectoconsultorio.myh.back.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoconsultorio.myh.back.entity.AccesoUsuarioE;
import com.proyectoconsultorio.myh.back.entity.UsuarioE;

@Repository("AccesoUsuarioRepository")
public interface AccesoUsuarioR extends JpaRepository<AccesoUsuarioE, Serializable>{
	
	public abstract List<AccesoUsuarioE> findByUsuario(UsuarioE entity);
	public abstract List<AccesoUsuarioE> findByUsuario(String idUsuario);

}
