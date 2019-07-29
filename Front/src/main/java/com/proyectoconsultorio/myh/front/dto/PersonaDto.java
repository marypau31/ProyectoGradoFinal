package com.proyectoconsultorio.myh.front.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PersonaDto implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private Long id;
     private String nombres;
     private String apellidos;
     private String tipoDocumento;
     private String numeroDocumento;
     private Date fechaNacimiento;
     private Integer edad;
     private String rh;
     private String genero;
     private String estadoCivil;
     private String direccion;
     private String telefono;
     private String celular;
     private String correo;
     private String especial;
     private String zonaResidencia;
     private AntecedentesDto antecedentes;
     private MunicipioDto municipio;
     private List<AcompananteDto> acompananteList;
     private TrabajadorDto trabajador;
     private List<EpicrisisDto> epicrisisList;
     private List<CitaDto> citaList;

     public PersonaDto() {
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

     public AntecedentesDto getAntecedentes() {
          return antecedentes;
     }

     public void setAntecedentes(AntecedentesDto antecedentes) {
          this.antecedentes = antecedentes;
     }

     public MunicipioDto getMunicipio() {
          return municipio;
     }

     public void setMunicipio(MunicipioDto municipio) {
          this.municipio = municipio;
     }

     public List<AcompananteDto> getAcompananteList() {
          return acompananteList;
     }

     public void setAcompananteList(List<AcompananteDto> acompananteList) {
          this.acompananteList = acompananteList;
     }

     public TrabajadorDto getTrabajador() {
          return trabajador;
     }

     public void setTrabajador(TrabajadorDto trabajador) {
          this.trabajador = trabajador;
     }

     public List<EpicrisisDto> getEpicrisisList() {
          return epicrisisList;
     }

     public void setEpicrisisList(List<EpicrisisDto> epicrisisList) {
          this.epicrisisList = epicrisisList;
     }

     public List<CitaDto> getCitaList() {
          return citaList;
     }

     public void setCitaList(List<CitaDto> citaList) {
          this.citaList = citaList;
     }
}
