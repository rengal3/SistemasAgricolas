/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.DAO;

import com.asistencia.TO.AdmisionTO;
import com.asistencia.TO.AdmisionTipoTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface AsistenciaDAOLocal {

    void insertarAdmisionTipo(AdmisionTipoTO admisionTipo) throws Exception;

    List<AdmisionTipoTO> getAdmisionTipoTO() throws Exception;

    List<AdmisionTO> getListaAdmision() throws Exception;

    void modificaAdmision(AdmisionTO admision) throws Exception;

    void eliminaAdmision(AdmisionTO admision) throws Exception;
    void modificarAdmisionTipo(AdmisionTipoTO admision)throws Exception;
    void eliminaAdmisionTipos(AdmisionTipoTO admision)throws Exception;
}
