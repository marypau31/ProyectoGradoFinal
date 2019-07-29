package com.proyectoconsultorio.myh.front.model;

import java.io.Serializable;
public class AccesoUsuario implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private Boolean crear;
     private Boolean leer;
     private Boolean modificar;
     private Boolean borrar;
     private Acceso acceso;
     private Usuario usuario;

     public AccesoUsuario() {
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

     public Acceso getAcceso() {
          return acceso;
     }

     public void setAcceso(Acceso acceso) {
          this.acceso = acceso;
     }

     public Usuario getUsuario() {
          return usuario;
     }

     public void setUsuario(Usuario usuario) {
          this.usuario = usuario;
     }
}
