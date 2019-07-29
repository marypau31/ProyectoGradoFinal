package com.proyectoconsultorio.myh.front.bean.primerUso;

import com.proyectoconsultorio.myh.front.dto.PersonaDto;
import com.proyectoconsultorio.myh.front.dto.TrabajadorDto;
import com.proyectoconsultorio.myh.front.dto.UsuarioDto;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;


@ManagedBean
@ViewScoped
public class CrearUsuarioBean implements Serializable {

     private static final long serialVersionUID = 1L;
     
     private PersonaDto persona; 
     
     public CrearUsuarioBean() {
          persona = new PersonaDto();
          persona.setTrabajador(new TrabajadorDto());
          persona.getTrabajador().setUsuario(new UsuarioDto());
     }
     
     

     public PersonaDto getPersona() {
          return persona;
     }

     public void setPersona(PersonaDto persona) {
          this.persona = persona;
     }
     
}
