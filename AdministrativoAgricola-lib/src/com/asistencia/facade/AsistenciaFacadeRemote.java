/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.facade;

import com.asistencia.TO.AdmisionTipoTO;
import javax.ejb.Remote;

/**
 *
 * @author Renato
 */
@Remote
public interface AsistenciaFacadeRemote {

    boolean insertarAdmisionTipo(AdmisionTipoTO admision) throws Exception;
    
}
