package com.proyectoconsultorio.myh.back.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "Acceso")
public class AccesoE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     
     @Basic(optional = false)
     @Column(name = "Modulo")
     private String modulo;
     
     @Lob
     @Column(name = "Descripcion")
     private String descripcion;

     public AccesoE() {
     }

	public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getModulo() {
          return modulo;
     }

     public void setModulo(String modulo) {
          this.modulo = modulo;
     }

     public String getDescripcion() {
          return descripcion;
     }

     public void setDescripcion(String descripcion) {
          this.descripcion = descripcion;
     }
}
