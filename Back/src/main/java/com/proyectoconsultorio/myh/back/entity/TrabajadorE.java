package com.proyectoconsultorio.myh.back.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Trabajador")
public class TrabajadorE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     @JoinColumn(name = "Id", referencedColumnName = "Id", insertable = false, updatable = false)
     @OneToOne(optional = false)
     private PersonaE persona;
     
     @Basic(optional = false)
     @Column(name = "Cargo")
     private String cargo;
     
     @Column(name = "Salario")
     private int salario;
     
     @Basic(optional = false)
     @Column(name = "FechaIngreso")
     @Temporal(TemporalType.DATE)
     private Date fechaIngreso;
     
     
     @OneToOne(cascade = CascadeType.ALL, mappedBy = "trabajador")
     private UsuarioE usuario;

     public TrabajadorE() {
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

     public Date getFechaIngreso() {
          return fechaIngreso;
     }

     public void setFechaIngreso(Date fechaIngreso) {
          this.fechaIngreso = fechaIngreso;
     }

     public PersonaE getPersona() {
          return persona;
     }

     public void setPersona(PersonaE persona) {
          this.persona = persona;
     }

     public UsuarioE getUsuario() {
          return usuario;
     }

     public void setUsuario(UsuarioE usuario) {
          this.usuario = usuario;
     }
}
