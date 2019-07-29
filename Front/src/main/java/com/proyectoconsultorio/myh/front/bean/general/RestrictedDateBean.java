package com.proyectoconsultorio.myh.front.bean.general;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@RequestScoped
public class RestrictedDateBean implements Serializable {
     
     private static final long serialVersionUID = 1L;
     
     private Date minimalDate;
     private Date maximumDate;

     public RestrictedDateBean() {
     }

     public Date getMinimalDate() {
          Calendar calendar = Calendar.getInstance();
          return calendar.getTime();
     }

     public Date getMaximumDate() {
          Calendar calendar = Calendar.getInstance();
          return calendar.getTime();
     }
     
}
