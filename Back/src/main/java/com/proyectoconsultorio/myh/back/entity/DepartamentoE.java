package com.proyectoconsultorio.myh.back.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Departamento")
public class DepartamentoE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     
     @Basic(optional = false)
     @Column(name = "DANE", unique = true)
     private int dane;
     
     @Basic(optional = false)
     @Column(name = "nombre")
     private String nombre;
     
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "departamento")
     private List<MunicipioE> municipioList;

     public DepartamentoE() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public int getDane() {
          return dane;
     }

     public void setDane(int dane) {
          this.dane = dane;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public List<MunicipioE> getMunicipioList() {
          return municipioList;
     }

     public void setMunicipioList(List<MunicipioE> municipioList) {
          this.municipioList = municipioList;
     }
}
