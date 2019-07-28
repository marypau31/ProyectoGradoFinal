package com.proyectoconsultorio.myh.back.model.repository;

import com.proyectoconsultorio.myh.back.entity.DepartamentoE;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("DepartamentoRepository")
public interface DepartamentoR extends JpaRepository<DepartamentoE, Serializable>{

}
