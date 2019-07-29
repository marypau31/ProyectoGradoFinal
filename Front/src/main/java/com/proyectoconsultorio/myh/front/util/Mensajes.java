package com.proyectoconsultorio.myh.front.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Mensajes{
     
     private static final long serialVersionUID = 1L;
     
     private final FacesContext context;

     public Mensajes(FacesContext context) {
          this.context = context;
          this.context.getExternalContext().getFlash().setKeepMessages(true);
     }
     
     public FacesMessage mensajeExitoso(String titulo, String detalle){
          return new FacesMessage(FacesMessage.SEVERITY_INFO, titulo, detalle);
     }
     
     public FacesMessage mensajeAdvertencia(String titulo, String detalle){
          return new FacesMessage(FacesMessage.SEVERITY_WARN, titulo, detalle);
     }
     
     public FacesMessage mensajeError(String titulo, String detalle){
          return new FacesMessage(FacesMessage.SEVERITY_FATAL, titulo, detalle);
     }
     
     public FacesMessage mensajeBloqueo(String titulo, String detalle){
          return new FacesMessage(FacesMessage.SEVERITY_ERROR, titulo, detalle);
     }
}
