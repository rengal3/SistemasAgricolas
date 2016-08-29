/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.business;

import com.asistencia.DAO.AsistenciaDAOLocal;
import com.asistencia.TO.AdmisionTipoTO;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Renato
 */
@Stateless
public class AsistenciaBusiness implements AsistenciaBusinessLocal {

    @EJB
    AsistenciaDAOLocal asistenciaDao;
    
    @Override
    public boolean insertarAdmisionTipo(AdmisionTipoTO admision) throws Exception {
        return asistenciaDao.insertarAdmisionTipo(admision);
    }

    
}
