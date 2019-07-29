package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;
import java.util.List;
public class UsuarioDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private TrabajadorDto trabajador;
     private String username;
     private String password;
     private boolean activo;
     private boolean bloqueado;
     private List<AccesoUsuarioDto> accesoUsuarioList;
     

     public UsuarioDto() {
     }

     public TrabajadorDto getTrabajador() {
          return trabajador;
     }

     public void setTrabajador(TrabajadorDto trabajador) {
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

     public List<AccesoUsuarioDto> getAccesoUsuarioList() {
          return accesoUsuarioList;
     }

     public void setAccesoUsuarioList(List<AccesoUsuarioDto> accesoUsuarioList) {
          this.accesoUsuarioList = accesoUsuarioList;
     }
}
