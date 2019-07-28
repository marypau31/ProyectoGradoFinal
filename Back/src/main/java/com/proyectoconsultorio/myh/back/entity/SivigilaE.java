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
@Table(name = "Sivigila")
public class SivigilaE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     
     @Basic(optional = false)
     @Column(name = "Cod")
     private int cod;
     
     @Basic(optional = false)
     @Column(name = "Nombre")
     private String nombre;
     
     @Lob
     @Column(name = "Descripcion")
     private String descripcion;
     
     @OneToMany(mappedBy = "sivigila")
     private List<EnfermedadE> enfermedadList;

     public SivigilaE() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public int getCod() {
          return cod;
     }

     public void setCod(int cod) {
          this.cod = cod;
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

     public List<EnfermedadE> getEnfermedadList() {
          return enfermedadList;
     }

     public void setEnfermedadList(List<EnfermedadE> enfermedadList) {
          this.enfermedadList = enfermedadList;
     }
}
