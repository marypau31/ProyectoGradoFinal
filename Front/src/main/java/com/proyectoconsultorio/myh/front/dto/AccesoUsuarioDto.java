package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;
public class AccesoUsuarioDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private Boolean crear;
     private Boolean leer;
     private Boolean modificar;
     private Boolean borrar;
     private AccesoDto acceso;
     private UsuarioDto usuario;

     public AccesoUsuarioDto() {
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

     public AccesoDto getAcceso() {
          return acceso;
     }

     public void setAcceso(AccesoDto acceso) {
          this.acceso = acceso;
     }

     public UsuarioDto getUsuario() {
          return usuario;
     }

     public void setUsuario(UsuarioDto usuario) {
          this.usuario = usuario;
     }
}
