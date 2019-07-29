package com.proyectoconsultorio.myh.back.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoconsultorio.myh.back.entity.SivigilaE;

@Repository("SivigilaRepository")
public interface SivigilaR extends JpaRepository<SivigilaE, Serializable>{

	public abstract SivigilaE findByCod(String cod);
	
}
