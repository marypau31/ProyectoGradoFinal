package com.proyectoconsultorio.myh.front.util;

import java.io.IOException;
import javax.faces.context.ExternalContext;

public class Redireccion{
     
     private final ExternalContext context;

     public Redireccion(ExternalContext context) {
          this.context = context;
     }
     
     public void prinicipal() throws IOException {
          context.redirect(context.getRequestContextPath()+"/proyectoConsultorio/MenuPrincipal.xhtml");
     }
}
