package com.proyectoconsultorio.myh.back.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoconsultorio.myh.back.entity.AccesoE;

@Repository("AccesoRepository")
public interface AccesoR extends JpaRepository<AccesoE, Serializable>{
	
	public abstract AccesoE findById(long id);
	
}
