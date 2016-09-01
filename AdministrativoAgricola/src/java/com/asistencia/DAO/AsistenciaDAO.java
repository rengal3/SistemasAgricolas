/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.DAO;

import com.asistencia.TO.AdmisionTO;
import com.asistencia.TO.AdmisionTipoTO;
import com.asistencia.entity.DAO.AdmisionTiposFacadeLocal;
import com.asistencia.helper.Conversiones;
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
    public boolean insertarAdmisionTipo(AdmisionTipoTO admisionTipo) throws Exception {
        boolean retorno= false;        
        admisionTiposEJB.create(Conversiones.getAadmisionTipoFromTO(admisionTipo));        
        return retorno;
    }

    @Override
    public List<AdmisionTipoTO> getAdmisionTipoTO() throws Exception {
        return Conversiones.getListAdmisionTipoTO(admisionTiposEJB.findAll());
    }

    @Override
    public List<AdmisionTO> getListaAdmision() throws Exception {
         Query consulta = this.em.createNativeQuery("SELECT     ADMISION.ID_PERSONAL,personal.dni, ADMISION.H_INGRESO, "
                 + "ADMISION.H_SALIDA, ADMISION.HORAS, TIPO_OBRERO.TIPO_OBRERO, ADMISION_TIPOS.DESCRIPCION, "
                 + "coalesce(ADMISION.MODIFICO,'') as modifico " +
                    "FROM         ADMISION INNER JOIN " +
                    " PERSONAL ON ADMISION.ID_PERSONAL = PERSONAL.ID_PERSONAL INNER JOIN" +
                    " TIPO_OBRERO ON PERSONAL.ID_TIPO_DE_OBRERO = TIPO_OBRERO.ID_TIPO_OBRERO INNER JOIN" +
                    " ADMISION_TIPOS ON ADMISION.ID_TIPOS = ADMISION_TIPOS.ID");
        return Conversiones.convertirTOAdmision(consulta.getResultList());
    }

    
    
    
}
