package com.proyectoconsultorio.myh.back.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class UsuarioE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     @JoinColumn(name = "Id", referencedColumnName = "Id", insertable = false, updatable = false)
     @OneToOne(optional = false)
     private TrabajadorE trabajador;
     
     @Basic(optional = false)
     @Column(name = "Username", unique = true)
     private String username;
     
     @Basic(optional = false)
     @Column(name = "Password")
     private String password;
     
     @Basic(optional = false)
     @Column(name = "Activo")
     private boolean activo;
     
     @Basic(optional = false)
     @Column(name = "Bloqueado")
     private boolean bloqueado;
     
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
     private List<AccesoUsuarioE> accesoUsuarioList;
     

     public UsuarioE() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public TrabajadorE getTrabajador() {
          return trabajador;
     }

     public void setTrabajador(TrabajadorE trabajador) {
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

     public List<AccesoUsuarioE> getAccesoUsuarioList() {
          return accesoUsuarioList;
     }

     public void setAccesoUsuarioList(List<AccesoUsuarioE> accesoUsuarioList) {
          this.accesoUsuarioList = accesoUsuarioList;
     }
}
