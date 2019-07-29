package com.proyectoconsultorio.myh.front.bean.general;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class ComboBoxesBean implements Serializable{
     
     private static final long serialVersionUID = 1L;
     
     private final List<String> documentos;
     private final List<String> generos;
     private final List<String> rh;
     private final List<String> estadoCivil;
     private final List<String> primero; //Para El/La
     private final List<String> segundo; //Para El/La
     private final List<String> especial;
     private final List<String> ZonaResidencial;
     
     public ComboBoxesBean() {
          documentos = new ArrayList<>();
          generos = new ArrayList<>();
          rh = new ArrayList<>();
          estadoCivil = new ArrayList<>();
          primero = new ArrayList<>();
          segundo = new ArrayList<>();
          especial = new ArrayList<>();
          ZonaResidencial = new ArrayList<>();
     }
     
     public List<String> getEspecial() {
          especial.clear();
          especial.add("Protección de ancianatos");
          especial.add("Indígenas");
          especial.add("Habitante de la calle");
          especial.add("Desvinculado del conflicto Armado");
          especial.add("Bajo protección del ICBF");
          especial.add("Bajo protección de otra institución");
          especial.add("Víctimas");
          return especial;
     }

     public List<String> getDocumentos() {
          documentos.clear();
          documentos.add("Cédula de ciudadanía");
          documentos.add("Cédula Venezolana");
          documentos.add("Cédula de extranjería");
          documentos.add("Carné diplomático");
          documentos.add("Pasaporte");
          documentos.add("Salvoconducto");
          documentos.add("Permiso Especial de permanencia");
          documentos.add("Registro civil");
          documentos.add("Registro civil Venezolano");
          documentos.add("Tarjeta de identidad");
          documentos.add("Certificado de nacido vivo");
          documentos.add("Adulto sin identificar");
          documentos.add("Menor sin identificar");
          return documentos;
     }

     public List<String> getGeneros() {
          generos.clear();
          generos.add("Masculino");
          generos.add("Femenino");
          generos.add("No Define");
          return generos;
     }

     public List<String> getRh() {
          rh.clear();
          rh.add("O+");
          rh.add("O-");
          rh.add("B+");
          rh.add("B-");
          rh.add("A+");
          rh.add("A-");
          rh.add("AB+");
          rh.add("AB-");
          return rh;
     }

     public List<String> getEstadoCivil() {
          estadoCivil.clear();
          estadoCivil.add("No Aplica");
          estadoCivil.add("Soltero(a)");
          estadoCivil.add("Casado(a)");
          estadoCivil.add("Unión de hecho");
          estadoCivil.add("Divorciado(a)");
          estadoCivil.add("Viudo(a)");
          return estadoCivil;
     }

     public List<String> getPrimero() {
          primero.clear();
          primero.add("El");
          primero.add("La");
          return primero;
     }

     public List<String> getSegundo() {
          segundo.clear();
          segundo.add("niño");
          segundo.add("joven");
          segundo.add("señor");
          segundo.add("niña");
          segundo.add("señorita");
          segundo.add("señora");
          return segundo;
     }

     public List<String> getZonaResidencial() {
          ZonaResidencial.clear();
          ZonaResidencial.add("Urbano");
          ZonaResidencial.add("Rural");
          return ZonaResidencial;
     }
}
