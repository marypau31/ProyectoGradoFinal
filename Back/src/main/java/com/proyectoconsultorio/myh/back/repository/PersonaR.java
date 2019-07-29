package com.proyectoconsultorio.myh.back.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoconsultorio.myh.back.entity.PersonaE;

@Repository("PersonaRepository")
public interface PersonaR extends JpaRepository<PersonaE, Serializable>{

	public abstract PersonaE findById(long id);
}
