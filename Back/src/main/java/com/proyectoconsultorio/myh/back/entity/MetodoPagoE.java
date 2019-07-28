package com.proyectoconsultorio.myh.back.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "MetodoPago")
public class MetodoPagoE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     
     @Column(name = "Nombre")
     private String nombre;
     
     @Lob
     @Column(name = "Descripcion")
     private String descripcion;
     
     @Column(name = "Valor")
     private Integer valor;
     
     @OneToMany(mappedBy = "metodoPago")
     private List<CitaE> citaList;

     public MetodoPagoE() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public String getDescripcion() {
          return descripcion;
     }

     public void setDescripcion(String descripcion) {
          this.descripcion = descripcion;
     }

     public Integer getValor() {
          return valor;
     }

     public void setValor(Integer valor) {
          this.valor = valor;
     }

     public List<CitaE> getCitaList() {
          return citaList;
     }

     public void setCitaList(List<CitaE> citaList) {
          this.citaList = citaList;
     }
}
