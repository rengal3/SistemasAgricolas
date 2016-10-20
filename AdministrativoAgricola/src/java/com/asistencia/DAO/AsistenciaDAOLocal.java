/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.DAO;

import com.asistencia.entity.AsistenciaResumen;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface AsistenciaDAOLocal {

    void insertarMarcacion(String idempresa, String dni, String fecha, String hora) throws Exception;

    AsistenciaResumen buscarMarcacionDiaria(String fecha, String idEmpresa, long idTrabajador) throws Exception;

    
}
