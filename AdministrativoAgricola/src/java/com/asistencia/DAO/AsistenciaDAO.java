/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.DAO;

import com.asistencia.TO.AdmisionTO;
import com.asistencia.TO.AdmisionTipoTO;
import com.asistencia.entity.AdmisionTipos;
import com.asistencia.entity.Admision;
import com.asistencia.entity.DAO.AdmisionTiposFacadeLocal;
import com.asistencia.entity.Personal;
import com.asistencia.helper.Conversiones;
import com.asistencia.helper.NativeQueryResultsMapper;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Renato
 */
@Stateless
public class AsistenciaDAO implements AsistenciaDAOLocal {

    @PersistenceContext(unitName = "AdministrativoAgricolaPU")
    private EntityManager em;
    
    @EJB
    AdmisionTiposFacadeLocal admisionTiposEJB;
    
    @Override
    public void insertarAdmisionTipo(AdmisionTipoTO admisionTipo) throws Exception {           
        admisionTiposEJB.create(Conversiones.getAadmisionTipoFromTO(admisionTipo));               
    }

    @Override
    public List<AdmisionTipoTO> getAdmisionTipoTO() throws Exception {
        return Conversiones.getListAdmisionTipoTO(admisionTiposEJB.findAll());
    }

    @Override
    public List<AdmisionTO> getListaAdmision() throws Exception {
         Query consulta = this.em.createNativeQuery("SELECT     ADMISION.ID_PERSONAL,personal.dni, ADMISION.H_INGRESO, "
                 + "ADMISION.H_SALIDA, ADMISION.HORAS, TIPO_OBRERO.TIPO_OBRERO, ADMISION_TIPOS.DESCRIPCION, "
                 + "coalesce(ADMISION.MODIFICO,'') as modifico, admision.id_admision " +
                    "FROM         ADMISION INNER JOIN " +
                    " PERSONAL ON ADMISION.ID_PERSONAL = PERSONAL.ID_PERSONAL INNER JOIN" +
                    " TIPO_OBRERO ON PERSONAL.ID_TIPO_DE_OBRERO = TIPO_OBRERO.ID_TIPO_OBRERO INNER JOIN" +
                    " ADMISION_TIPOS ON ADMISION.ID_TIPOS = ADMISION_TIPOS.ID");
         
        //return Conversiones.convertirTOAdmision(consulta.getResultList());
        return NativeQueryResultsMapper.map(consulta.getResultList(), AdmisionTO.class);
    }

//    @Override
//    public void modificaAdmision(AdmisionTO admision) throws Exception {
//        Integer idAdmision=admision.getIdAdmision();  
//        Admision adm=em.find(Admision.class, idAdmision);
//        adm.setIdPersonal(new Personal(admision.getIdPersona()));
//        adm.setHoras(admision.getHoras());
//        adm.setHIngreso(admision.gethIngreso());
//        adm.setHSalida(admision.gethSalida());
//        adm.setModifico(admision.getModifico());
//        
//        em.merge(adm);
//        em.flush();
//    }

    @Override
    public void eliminaAdmision(AdmisionTO admision) throws Exception {
        Integer idAdmision=admision.getIdAdmision();       
        em.remove(em.find(Admision.class, idAdmision));
        em.flush();
    }

    @Override
    public void modificaAdmision(AdmisionTO admision) throws Exception {
        Integer idAdmision=admision.getIdAdmision();  
        Admision adm=em.find(Admision.class, idAdmision);
        adm.setIdPersonal(new Personal(admision.getIdPersona()));
        adm.setHoras(admision.getHoras());
        adm.setHIngreso(admision.gethIngreso());
        adm.setHSalida(admision.gethSalida());
        adm.setModifico(admision.getModifico());
        
        em.merge(adm);
        em.flush();
    }

//    @Override
//    public void eliminaAdmision(AdmisionTO admision) throws Exception {
//        Integer idAdmision=admision.getIdAdmision();       
//        em.remove(em.find(Admision.class, idAdmision));
//        em.flush();
//    }
    
    @Override
    public void modificarAdmisionTipo(AdmisionTipoTO admision)throws Exception{
        //Integer idtipo=admision.getId();
        AdmisionTipos adm=em.find(AdmisionTipos.class,(int)admision.getId());
        adm.setId(admision.getId());
        adm.setDescripcion(admision.getDescripcion());
        adm.setSigla(admision.getSigla());
        adm.setMostrar(admision.getMostrar());
        em.merge(adm);
        em.flush();
    }
    
    @Override
    public void eliminaAdmisionTipos(AdmisionTipoTO admision)throws Exception{
        //Integer idtipo=admision.getId();
       // System.out.println("id tipo asistencia dao"+idtipo);
        em.remove(em.find(AdmisionTipos.class,(int) admision.getId()));
        em.flush();
    
    }
  
}
