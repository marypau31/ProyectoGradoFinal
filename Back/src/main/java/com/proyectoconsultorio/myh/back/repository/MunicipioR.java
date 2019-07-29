package com.proyectoconsultorio.myh.back.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoconsultorio.myh.back.entity.MunicipioE;

@Repository("MunicipioRepository")
public interface MunicipioR extends JpaRepository<MunicipioE, Serializable>{

}
