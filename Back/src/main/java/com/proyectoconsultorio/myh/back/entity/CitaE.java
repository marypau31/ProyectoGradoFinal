package com.proyectoconsultorio.myh.back.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "Cita")
public class CitaE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     
     @Basic(optional = false)
     @Column(name = "FechaAsignada")
     @Temporal(TemporalType.DATE)
     private Date fechaAsignada;
     
     @Basic(optional = false)
     @Column(name = "HoraAsignada")
     @Temporal(TemporalType.TIME)
     private Date horaAsignada;
     
     @Basic(optional = false)
     @Column(name = "Estado")
     private String estado;
     
     @Column(name = "Tipo")
     private String tipo;
     
     @Column(name = "CantCert")
     private Integer cantCert;
     
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "cita")
     private List<PeticionE> peticionList;
     
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "cita")
     private List<AcompananteE> acompananteList;
     
     @JoinColumn(name = "IdModoPago", referencedColumnName = "Id")
     @ManyToOne
     private MetodoPagoE metodoPago;
     
     @JoinColumn(name = "IdPersona", referencedColumnName = "Id")
     @ManyToOne(optional = false)
     private PersonaE persona;

     public CitaE() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public Date getFechaAsignada() {
          return fechaAsignada;
     }

     public void setFechaAsignada(Date fechaAsignada) {
          this.fechaAsignada = fechaAsignada;
     }

     public Date getHoraAsignada() {
          return horaAsignada;
     }

     public void setHoraAsignada(Date horaAsignada) {
          this.horaAsignada = horaAsignada;
     }

     public String getEstado() {
          return estado;
     }

     public void setEstado(String estado) {
          this.estado = estado;
     }

     public String getTipo() {
          return tipo;
     }

     public void setTipo(String tipo) {
          this.tipo = tipo;
     }

     public Integer getCantCert() {
          return cantCert;
     }

     public void setCantCert(Integer cantCert) {
          this.cantCert = cantCert;
     }

     public List<PeticionE> getPeticionList() {
          return peticionList;
     }

     public void setPeticionList(List<PeticionE> peticionList) {
          this.peticionList = peticionList;
     }

     public List<AcompananteE> getAcompananteList() {
          return acompananteList;
     }

     public void setAcompananteList(List<AcompananteE> acompananteList) {
          this.acompananteList = acompananteList;
     }

     public MetodoPagoE getMetodoPago() {
          return metodoPago;
     }

     public void setMetodoPago(MetodoPagoE metodoPago) {
          this.metodoPago = metodoPago;
     }

     public PersonaE getPersona() {
          return persona;
     }

     public void setPersona(PersonaE persona) {
          this.persona = persona;
     }
}
