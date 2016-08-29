/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.DAO;

import com.asistencia.TO.AdmisionTipoTO;
import com.asistencia.entity.DAO.AdmisionTiposFacadeLocal;
import com.asistencia.helper.Conversiones;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Renato
 */
@Stateless
public class AsistenciaDAO implements AsistenciaDAOLocal {

    @EJB
    AdmisionTiposFacadeLocal admisionTiposEJB;
    
    @Override
    public boolean insertarAdmisionTipo(AdmisionTipoTO admisionTipo) throws Exception {
        boolean retorno= false;        
        admisionTiposEJB.create(Conversiones.getAadmisionTipoFromTO(admisionTipo));        
        return retorno;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
