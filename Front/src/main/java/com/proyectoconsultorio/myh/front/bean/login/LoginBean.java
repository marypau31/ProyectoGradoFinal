package com.proyectoconsultorio.myh.front.bean.login;

import com.proyectoconsultorio.myh.front.dto.UsuarioDto;
import com.proyectoconsultorio.myh.front.util.Mensajes;
import com.proyectoconsultorio.myh.front.util.Redireccion;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;


@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {
     
     private static final long serialVersionUID = 1L;
     
     private UsuarioDto usuario;
     private final String user;
     private final String pass;
     private Redireccion redireccionar;
     private Mensajes mensaje;
     
     public LoginBean() {
          usuario = new UsuarioDto();
          user = "usuario";
          pass = "contraseña";
     }
     
     public boolean verificarPrimerUso() {
          return true;
     }
     
     public void iniciarSesion() {
          FacesContext fContext = FacesContext.getCurrentInstance();
          mensaje = new Mensajes(fContext);
          //trae el usuario del confirmado
          
          //si es null es invalido, de lo contrario exitoso
          //si es exitoso crea el menu y el sesion map
          
          //prueba bean login
          if (usuario.getUsername().equals(user) && usuario.getPassword().equals(pass)) {
               ExternalContext eContext = fContext.getExternalContext();
               eContext.getSessionMap().put("user", "usuario");
               fContext.addMessage(null, mensaje.mensajeExitoso("Inicio Sesión", "SE inicia sesión"));
               try {
                    redireccionar = new Redireccion(eContext);
                    redireccionar.prinicipal();
               } catch (IOException ex) {
                    Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
                    fContext.addMessage(null, mensaje.mensajeError("Redirección", "Ocurrió un error al redireccionar"));
               }
          } else {
               fContext.addMessage(null, mensaje.mensajeError("Inicio Sesión", "Error de usuario y/o contraseña"));
          }
     }
     
     public boolean verificarSesion() {
          return false;
     }
     
     public void cerrarSesion() {
          FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
     }

     public UsuarioDto getUsuario() {
          return usuario;
     }

     public void setUsuario(UsuarioDto usuario) {
          this.usuario = usuario;
     }
     
}
