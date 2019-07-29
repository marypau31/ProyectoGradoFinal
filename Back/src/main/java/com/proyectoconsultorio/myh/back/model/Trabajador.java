package com.proyectoconsultorio.myh.back.model;

import java.io.Serializable;

import com.proyectoconsultorio.myh.back.model.Customize.Fechas;

public class Trabajador implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private Persona persona;
     private String cargo;
     private int salario;
     private Fechas fechaIngreso;
     private Usuario usuario;

     public Trabajador() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
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

     public Fechas getFechaIngreso() {
          return fechaIngreso;
     }

     public void setFechaIngreso(Fechas fechaIngreso) {
          this.fechaIngreso = fechaIngreso;
     }

     public Persona getPersona() {
          return persona;
     }

     public void setPersona(Persona persona) {
          this.persona = persona;
     }

     public Usuario getUsuario() {
          return usuario;
     }

     public void setUsuario(Usuario usuario) {
          this.usuario = usuario;
     }
}
