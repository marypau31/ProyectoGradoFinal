package com.proyectoconsultorio.myh.back.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoconsultorio.myh.back.entity.DepartamentoE;

@Repository("DepartamentoRepository")
public interface DepartamentoR extends JpaRepository<DepartamentoE, Serializable>{

}
