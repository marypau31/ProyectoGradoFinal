package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;
import java.util.Date;

public class TrabajadorDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private PersonaDto persona;
     private String cargo;
     private int salario;
     private Date fechaIngreso;
     private UsuarioDto usuario;

     public TrabajadorDto() {
     }

     public String getCargo() {
          return cargo;
     }

     public void setCargo(String cargo) {
          this.cargo = cargo;
     }

     public int getSalario() {
          return salario;
     }

     public void setSalario(int salario) {
          this.salario = salario;
     }

     public Date getFechaIngreso() {
          return fechaIngreso;
     }

     public void setFechaIngreso(Date fechaIngreso) {
          this.fechaIngreso = fechaIngreso;
     }

     public PersonaDto getPersona() {
          return persona;
     }

     public void setPersona(PersonaDto persona) {
          this.persona = persona;
     }

     public UsuarioDto getUsuario() {
          return usuario;
     }

     public void setUsuario(UsuarioDto usuario) {
          this.usuario = usuario;
     }
}
