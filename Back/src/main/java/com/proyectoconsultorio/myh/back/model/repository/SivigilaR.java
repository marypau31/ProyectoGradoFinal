package com.proyectoconsultorio.myh.back.model.repository;

import com.proyectoconsultorio.myh.back.entity.SivigilaE;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("SivigilaRepository")
public interface SivigilaR extends JpaRepository<SivigilaE, Serializable>{

	public abstract SivigilaE findByCod(String cod);
	
}
