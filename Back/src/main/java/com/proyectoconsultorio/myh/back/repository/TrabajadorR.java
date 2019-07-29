package com.proyectoconsultorio.myh.back.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoconsultorio.myh.back.entity.TrabajadorE;
import com.proyectoconsultorio.myh.back.entity.UsuarioE;

@Repository("TrabajadorRepository")
public interface TrabajadorR extends JpaRepository<TrabajadorE, Serializable>{

	public abstract TrabajadorE findById(long id);
	public abstract TrabajadorE findByUsuario(UsuarioE usuario);
}
