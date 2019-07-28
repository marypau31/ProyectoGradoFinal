package com.proyectoconsultorio.myh.back.model.service.impl;

import com.proyectoconsultorio.myh.back.entity.AccesoE;
import com.proyectoconsultorio.myh.back.entity.AccesoUsuarioE;
import com.proyectoconsultorio.myh.back.entity.DepartamentoE;
import com.proyectoconsultorio.myh.back.entity.EnfermedadE;
import com.proyectoconsultorio.myh.back.entity.MunicipioE;
import com.proyectoconsultorio.myh.back.entity.PersonaE;
import com.proyectoconsultorio.myh.back.entity.SivigilaE;
import com.proyectoconsultorio.myh.back.entity.TrabajadorE;
import com.proyectoconsultorio.myh.back.entity.UsuarioE;
import com.proyectoconsultorio.myh.back.model.Acceso;
import com.proyectoconsultorio.myh.back.model.Departamento;
import com.proyectoconsultorio.myh.back.model.Enfermedad;
import com.proyectoconsultorio.myh.back.model.Municipio;
import com.proyectoconsultorio.myh.back.model.Persona;
import com.proyectoconsultorio.myh.back.model.Sivigila;
import com.proyectoconsultorio.myh.back.model.mapper.PrimerUsoMapper;
import com.proyectoconsultorio.myh.back.model.repository.AccesoR;
import com.proyectoconsultorio.myh.back.model.repository.AccesoUsuarioR;
import com.proyectoconsultorio.myh.back.model.repository.DepartamentoR;
import com.proyectoconsultorio.myh.back.model.repository.EnfermedadR;
import com.proyectoconsultorio.myh.back.model.repository.MunicipioR;
import com.proyectoconsultorio.myh.back.model.repository.PersonaR;
import com.proyectoconsultorio.myh.back.model.repository.SivigilaR;
import com.proyectoconsultorio.myh.back.model.repository.TrabajadorR;
import com.proyectoconsultorio.myh.back.model.repository.UsuarioR;
import com.proyectoconsultorio.myh.back.model.service.IPrimerUsoS;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("PrimerUsoService")
public class PrimerUsoS implements IPrimerUsoS {

     @Autowired
     @Qualifier("AccesoRepository")
     private AccesoR accesoR;

     @Autowired
     @Qualifier("MunicipioRepository")
     private MunicipioR municipioR;

     @Autowired
     @Qualifier("DepartamentoRepository")
     private DepartamentoR departamentoR;

     @Autowired
     @Qualifier("SivigilaRepository")
     private SivigilaR sivigilaR;

     @Autowired
     @Qualifier("EnfermedadRepository")
     private EnfermedadR enfermedadR;

     @Autowired
     @Qualifier("UsuarioRepository")
     private UsuarioR usuarioR;

     @Autowired
     @Qualifier("PersonaRepository")
     private PersonaR personaR;

     @Autowired
     @Qualifier("TrabajadorRepository")
     private TrabajadorR trabajadorR;

     @Autowired
     @Qualifier("AccesoUsuarioRepository")
     private AccesoUsuarioR accesoUsuarioR;

     private PrimerUsoMapper mapper;

     @Override
     public void CargaAccesos(List<Acceso> list) {
          if (usuarioR.count() == 0) {
               if (accesoR.count() == 0) {
                    mapper = new PrimerUsoMapper();
                    List<AccesoE> listaE = mapper.mapperInAccesosList(list);
                    try {
                         for (AccesoE entity : listaE) {
                              accesoR.save(entity);
                         }
                    } catch (Exception e) {
                    }
               }
          }
     }

     @Override
     public void CargaMunicipios(List<Municipio> lista) {
          if (usuarioR.count() == 0) {
               if (municipioR.count() == 0) {
                    mapper = new PrimerUsoMapper();
                    List<MunicipioE> listaE = mapper.mapperInMunicipioList(lista);
                    try {
                         for (MunicipioE entity : listaE) {
                              municipioR.save(entity);
                         }
                    } catch (Exception e) {
                    }
               }
          }
     }

     @Override
     public void CargaDepartamentos(List<Departamento> lista) {
          if (usuarioR.count() == 0) {
               if (departamentoR.count() == 0) {
                    mapper = new PrimerUsoMapper();
                    List<DepartamentoE> listaE = mapper.mapperInDepartamentoList(lista);
                    try {
                         for (DepartamentoE entity : listaE) {
                              departamentoR.save(entity);
                         }
                    } catch (Exception e) {
                    }
               }
          }
     }

     @Override
     public void CargaSivigila(List<Sivigila> lista) {
          if (usuarioR.count() == 0) {
               if (sivigilaR.count() == 0) {
                    mapper = new PrimerUsoMapper();
                    List<SivigilaE> listaE = mapper.mapperInSivigilaList(lista);
                    try {
                         for (SivigilaE entity : listaE) {
                              sivigilaR.save(entity);
                         }
                    } catch (Exception e) {
                    }
               }
          }
     }

     @Override
     public void CargaEnfermedades(List<Enfermedad> lista) {
          if (usuarioR.count() == 0) {
               if (enfermedadR.count() == 0) {
                    mapper = new PrimerUsoMapper();
                    List<EnfermedadE> listaE = mapper.mapperInEnfermedadList(lista);
                    try {
                         for (EnfermedadE entity : listaE) {
                              enfermedadR.save(entity);
                         }
                    } catch (Exception e) {
                    }
               }
          }
     }

     @Override
     public int CrearUsuario(Persona model) {
          if (usuarioR.count() == 0) {
               mapper = new PrimerUsoMapper();
               PersonaE persona = mapper.mapperInPersona(model);
               TrabajadorE trabajador = mapper.mapperInTrabajador(model);
               UsuarioE usuario = mapper.mapperInUsuario(model);
               AccesoUsuarioE accesoUsuario = mapper.mapperInAccesoUsuarioList(model);
               try {
                    personaR.save(persona);
                    List<PersonaE> listP = personaR.findAll();
                    trabajador.setPersona(listP.get(listP.size() - 1));
                    trabajador.setId(listP.get(listP.size() - 1).getId());
                    trabajadorR.save(trabajador);
                    List<TrabajadorE> listT = trabajadorR.findAll();
                    usuario.setTrabajador(listT.get(listT.size() - 1));
                    usuario.setId(listT.get(listT.size() - 1).getId());
                    usuarioR.save(usuario);
                    List<UsuarioE> listU = usuarioR.findAll();
                    accesoUsuario.setUsuario(listU.get(listU.size() - 1));
                    accesoUsuarioR.save(accesoUsuario);
                    return 1;
               } catch (Exception e) {
                    return -1;
               }
          } else {
               return 0;
          }
     }

     @Override
     public long VerCantUsuario() {
          long c = -1;
          try {
               c = usuarioR.count();
          } catch (Exception e) {
          }
          return c;
     }
}
