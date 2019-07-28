package com.proyectoconsultorio.myh.back.model.repository;

import com.proyectoconsultorio.myh.back.entity.AccesoE;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("AccesoRepository")
public interface AccesoR extends JpaRepository<AccesoE, Serializable>{
	
	public abstract AccesoE findByModulo(String modulo);
}
