/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.DAO;

import com.asistencia.entity.Horarios;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface HorariosDAOLocal {

    Horarios getHorarioByDNI(String dni) throws Exception;
    
}
