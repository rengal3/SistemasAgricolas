/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.business;

import com.asistencia.TO.AdmisionTO;
import com.asistencia.TO.AdmisionTipoTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface AsistenciaBusinessLocal {

    void insertarAdmisionTipo(AdmisionTipoTO admision) throws Exception;
    List<AdmisionTipoTO> getAdmisionTipoTO() throws Exception;
    List<AdmisionTO> getListaAdmision() throws Exception ;
    
}
