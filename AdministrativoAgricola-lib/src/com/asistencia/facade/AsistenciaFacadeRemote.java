/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.facade;

import com.asistencia.TO.AdmisionTO;
import com.asistencia.TO.AdmisionTipoTO;
import com.asistencia.TO.MensajesUsuario;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Renato
 */
@Remote
public interface AsistenciaFacadeRemote {

 MensajesUsuario procesarRegistroMarcacion(String idempresa, String dni, String fecha, String hora) throws Exception ;
   
    
}

   


