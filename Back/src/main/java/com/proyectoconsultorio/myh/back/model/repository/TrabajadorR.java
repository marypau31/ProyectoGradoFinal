package com.proyectoconsultorio.myh.back.model.repository;

import com.proyectoconsultorio.myh.back.entity.TrabajadorE;
import com.proyectoconsultorio.myh.back.entity.UsuarioE;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("TrabajadorRepository")
public interface TrabajadorR extends JpaRepository<TrabajadorE, Serializable>{

	public abstract TrabajadorE findById(long id);
	public abstract TrabajadorE findByUsuario(UsuarioE usuario);
}
