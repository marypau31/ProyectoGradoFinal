package com.proyectoconsultorio.myh.front.model;

import java.io.Serializable;
import java.util.List;
public class Usuario implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private Trabajador trabajador;
     private String username;
     private String password;
     private boolean activo;
     private boolean bloqueado;
     private List<AccesoUsuario> accesoUsuarioList;
     

     public Usuario() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public Trabajador getTrabajador() {
          return trabajador;
     }

     public void setTrabajador(Trabajador trabajador) {
          this.trabajador = trabajador;
     }

     public String getUsername() {
          return username;
     }

     public void setUsername(String username) {
          this.username = username;
     }

     public String getPassword() {
          return password;
     }

     public void setPassword(String password) {
          this.password = password;
     }

     public boolean isActivo() {
          return activo;
     }

     public void setActivo(boolean activo) {
          this.activo = activo;
     }

     public boolean isBloqueado() {
          return bloqueado;
     }

     public void setBloqueado(boolean bloqueado) {
          this.bloqueado = bloqueado;
     }

     public List<AccesoUsuario> getAccesoUsuarioList() {
          return accesoUsuarioList;
     }

     public void setAccesoUsuarioList(List<AccesoUsuario> accesoUsuarioList) {
          this.accesoUsuarioList = accesoUsuarioList;
     }
}
