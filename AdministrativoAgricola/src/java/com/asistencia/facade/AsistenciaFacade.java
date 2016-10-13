/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.facade;

import com.asistencia.TO.AdmisionTO;
import com.asistencia.TO.AdmisionTipoTO;
import com.asistencia.business.AsistenciaBusinessLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Renato
 */
@Stateless
public class AsistenciaFacade implements AsistenciaFacadeRemote {

    @EJB
    AsistenciaBusinessLocal asistenciaBusiness;

    @Override
    public void procesarRegistroMarcacion(String idempresa, String dni, String fecha, String hora) throws Exception {
        asistenciaBusiness.procesarRegistroMarcacion(idempresa, dni, fecha, hora);
    }
    
   
    
}
