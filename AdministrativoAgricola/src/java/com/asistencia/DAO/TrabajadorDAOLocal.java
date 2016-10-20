/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.DAO;

import com.asistencia.entity.Trabajador;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface TrabajadorDAOLocal {

    Trabajador buscarTrabajadorPorDNI(String dni) throws Exception;
    
}
