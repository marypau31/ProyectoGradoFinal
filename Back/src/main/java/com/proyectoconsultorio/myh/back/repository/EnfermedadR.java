package com.proyectoconsultorio.myh.back.repository;

import com.proyectoconsultorio.myh.back.entity.EnfermedadE;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("EnfermedadRepository")
public interface EnfermedadR extends JpaRepository<EnfermedadE, Serializable>{

}
