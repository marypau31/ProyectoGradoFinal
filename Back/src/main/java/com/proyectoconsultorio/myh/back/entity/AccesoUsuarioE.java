package com.proyectoconsultorio.myh.back.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AccesoUsuario")
public class AccesoUsuarioE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     
     @Column(name = "crear")
     @Basic(optional = false)
     private Boolean crear;
     
     @Column(name = "leer")
     @Basic(optional = false)
     private Boolean leer;
     
     @Column(name = "modificar")
     @Basic(optional = false)
     private Boolean modificar;
     
     @Column(name = "borrar")
     @Basic(optional = false)
     private Boolean borrar;
     
     @JoinColumn(name = "IdAcceso", referencedColumnName = "Id")
     @ManyToOne(optional = false)
     private AccesoE acceso;
     
     @JoinColumn(name = "IdUsuario", referencedColumnName = "Id")
     @ManyToOne(optional = false)
     private UsuarioE usuario;

     public AccesoUsuarioE() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public Boolean getCrear() {
          return crear;
     }

     public void setCrear(Boolean crear) {
          this.crear = crear;
     }

     public Boolean getLeer() {
          return leer;
     }

     public void setLeer(Boolean leer) {
          this.leer = leer;
     }

     public Boolean getModificar() {
          return modificar;
     }

     public void setModificar(Boolean modificar) {
          this.modificar = modificar;
     }

     public Boolean getBorrar() {
          return borrar;
     }

     public void setBorrar(Boolean borrar) {
          this.borrar = borrar;
     }

     public AccesoE getAcceso() {
          return acceso;
     }

     public void setAcceso(AccesoE acceso) {
          this.acceso = acceso;
     }

     public UsuarioE getUsuario() {
          return usuario;
     }

     public void setUsuario(UsuarioE usuario) {
          this.usuario = usuario;
     }
}
