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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Persona")
public class PersonaE implements Serializable {

     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "Id")
     private Long id;
     
     @Basic(optional = false)
     @Column(name = "Nombres")
     private String nombres;
     
     @Basic(optional = false)
     @Column(name = "Apellidos")
     private String apellidos;
     
     @Column(name = "TipoDocumento")
     private String tipoDocumento;
     
     @Column(name = "NumeroDocumento", unique = true)
     private String numeroDocumento;
     
     @Column(name = "FechaNacimiento")
     @Temporal(TemporalType.DATE)
     private Date fechaNacimiento;
     
     @Column(name = "Edad")
     private Integer edad;
     
     @Column(name = "RH")
     private String rh;
     
     @Column(name = "Genero")
     private String genero;
     
     @Column(name = "EstadoCivil")
     private String estadoCivil;
     
     @Column(name = "Direccion")
     private String direccion;
     
     @Column(name = "Telefono")
     private String telefono;
     
     @Column(name = "Celular")
     private String celular;
     
     @Column(name = "Correo")
     private String correo;
     
     @Column(name = "Especial")
     private String especial;
     
     @Column(name = "ZonaResidencia")
     private String zonaResidencia;
     
     @OneToOne(cascade = CascadeType.ALL, mappedBy = "persona")
     private AntecedentesE antecedentes;
     
     @JoinColumn(name = "IdMunicipio", referencedColumnName = "Id")
     @ManyToOne
     private MunicipioE municipio;
     
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
     private List<AcompananteE> acompananteList;
     
     @OneToOne(cascade = CascadeType.ALL, mappedBy = "persona")
     private TrabajadorE trabajador;
     
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
     private List<EpicrisisE> epicrisisList;
     
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
     private List<CitaE> citaList;

     public PersonaE() {
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getNombres() {
          return nombres;
     }

     public void setNombres(String nombres) {
          this.nombres = nombres;
     }

     public String getApellidos() {
          return apellidos;
     }

     public void setApellidos(String apellidos) {
          this.apellidos = apellidos;
     }

     public String getTipoDocumento() {
          return tipoDocumento;
     }

     public void setTipoDocumento(String tipoDocumento) {
          this.tipoDocumento = tipoDocumento;
     }

     public String getNumeroDocumento() {
          return numeroDocumento;
     }

     public void setNumeroDocumento(String numeroDocumento) {
          this.numeroDocumento = numeroDocumento;
     }

     public Date getFechaNacimiento() {
          return fechaNacimiento;
     }

     public void setFechaNacimiento(Date fechaNacimiento) {
          this.fechaNacimiento = fechaNacimiento;
     }

     public Integer getEdad() {
          return edad;
     }

     public void setEdad(Integer edad) {
          this.edad = edad;
     }

     public String getRh() {
          return rh;
     }

     public void setRh(String rh) {
          this.rh = rh;
     }

     public String getGenero() {
          return genero;
     }

     public void setGenero(String genero) {
          this.genero = genero;
     }

     public String getEstadoCivil() {
          return estadoCivil;
     }

     public void setEstadoCivil(String estadoCivil) {
          this.estadoCivil = estadoCivil;
     }

     public String getDireccion() {
          return direccion;
     }

     public void setDireccion(String direccion) {
          this.direccion = direccion;
     }

     public String getTelefono() {
          return telefono;
     }

     public void setTelefono(String telefono) {
          this.telefono = telefono;
     }

     public String getCelular() {
          return celular;
     }

     public void setCelular(String celular) {
          this.celular = celular;
     }

     public String getCorreo() {
          return correo;
     }

     public void setCorreo(String correo) {
          this.correo = correo;
     }

     public String getEspecial() {
          return especial;
     }

     public void setEspecial(String especial) {
          this.especial = especial;
     }

     public String getZonaResidencia() {
          return zonaResidencia;
     }

     public void setZonaResidencia(String zonaResidencia) {
          this.zonaResidencia = zonaResidencia;
     }

     public AntecedentesE getAntecedentes() {
          return antecedentes;
     }

     public void setAntecedentes(AntecedentesE antecedentes) {
          this.antecedentes = antecedentes;
     }

     public MunicipioE getMunicipio() {
          return municipio;
     }

     public void setMunicipio(MunicipioE municipio) {
          this.municipio = municipio;
     }

     public List<AcompananteE> getAcompananteList() {
          return acompananteList;
     }

     public void setAcompananteList(List<AcompananteE> acompananteList) {
          this.acompananteList = acompananteList;
     }

     public TrabajadorE getTrabajador() {
          return trabajador;
     }

     public void setTrabajador(TrabajadorE trabajador) {
          this.trabajador = trabajador;
     }

     public List<EpicrisisE> getEpicrisisList() {
          return epicrisisList;
     }

     public void setEpicrisisList(List<EpicrisisE> epicrisisList) {
          this.epicrisisList = epicrisisList;
     }

     public List<CitaE> getCitaList() {
          return citaList;
     }

     public void setCitaList(List<CitaE> citaList) {
          this.citaList = citaList;
     }
}
