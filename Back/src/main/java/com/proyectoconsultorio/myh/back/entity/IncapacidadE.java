package com.proyectoconsultorio.myh.back.entity;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Incapacidad")
public class IncapacidadE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     
     @Column(name = "Fecha")
     @Temporal(TemporalType.DATE)
     private Date fecha;
     
     @Basic(optional = false)
     @Column(name = "Dias")
     private int dias;
     
     @Lob
     @Column(name = "Descripcion")
     private String descripcion;
     
     @JoinColumn(name = "IdConsulta", referencedColumnName = "Id")
     @ManyToOne(optional = false)
     private ConsultaE consulta;

     public IncapacidadE() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public Date getFecha() {
          return fecha;
     }

     public void setFecha(Date fecha) {
          this.fecha = fecha;
     }

     public int getDias() {
          return dias;
     }

     public void setDias(int dias) {
          this.dias = dias;
     }

     public String getDescripcion() {
          return descripcion;
     }

     public void setDescripcion(String descripcion) {
          this.descripcion = descripcion;
     }

     public ConsultaE getConsulta() {
          return consulta;
     }

     public void setConsulta(ConsultaE consulta) {
          this.consulta = consulta;
     }
}
