package com.proyectoconsultorio.myh.back.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Municipio")
public class MunicipioE implements Serializable {

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
     @Column(name = "Nombre")
     private String nombre;
     
     @OneToMany(mappedBy = "municipio")
     private List<PersonaE> personaList;
     
     @JoinColumn(name = "IdDepartamento", referencedColumnName = "Id")
     @ManyToOne(optional = false)
     private DepartamentoE departamento;

     public MunicipioE() {
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

     public List<PersonaE> getPersonaList() {
          return personaList;
     }

     public void setPersonaList(List<PersonaE> personaList) {
          this.personaList = personaList;
     }

     public DepartamentoE getDepartamento() {
          return departamento;
     }

     public void setDepartamento(DepartamentoE departamento) {
          this.departamento = departamento;
     }
}
