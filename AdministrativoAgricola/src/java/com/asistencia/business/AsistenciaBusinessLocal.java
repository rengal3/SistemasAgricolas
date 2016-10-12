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

    void procesarRegistroMarcacion(String idempresa,String dni,String fecha,String hora) throws Exception;

   
}
