package com.proyectoconsultorio.myh.back.model.repository;

import com.proyectoconsultorio.myh.back.entity.AccesoUsuarioE;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("AccesoUsuarioRepository")
public interface AccesoUsuarioR extends JpaRepository<AccesoUsuarioE, Serializable>{

}
