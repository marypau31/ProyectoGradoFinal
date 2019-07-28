package com.proyectoconsultorio.myh.back.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ExamenProcedimiento")
public class ExamenProcedimientoE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     
     @Basic(optional = false)
     @Column(name = "Nombre")
     private String nombre;
     
     @Basic(optional = false)
     @Lob
     @Column(name = "Descripcion")
     private String descripcion;
     
     @JoinColumn(name = "IdProcedimiento", referencedColumnName = "Id")
     @ManyToOne(optional = false)
     private ProcedimientoE procedimiento;

     public ExamenProcedimientoE() {
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

     public ProcedimientoE getProcedimiento() {
          return procedimiento;
     }

     public void setProcedimiento(ProcedimientoE procedimiento) {
          this.procedimiento = procedimiento;
     }
}
