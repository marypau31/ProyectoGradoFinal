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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Peticion")
public class PeticionE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     
     @Basic(optional = false)
     @Column(name = "Fecha")
     @Temporal(TemporalType.TIMESTAMP)
     private Date fecha;
     
     @JoinColumn(name = "IdCita", referencedColumnName = "Id")
     @ManyToOne(optional = false)
     private CitaE cita;

     public PeticionE() {
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

     public CitaE getCita() {
          return cita;
     }

     public void setCita(CitaE cita) {
          this.cita = cita;
     }
}
