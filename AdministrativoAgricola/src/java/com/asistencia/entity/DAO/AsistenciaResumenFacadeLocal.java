/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.AsistenciaResumen;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface AsistenciaResumenFacadeLocal {

    void create(AsistenciaResumen asistenciaResumen);

    void edit(AsistenciaResumen asistenciaResumen);

    void remove(AsistenciaResumen asistenciaResumen);

    AsistenciaResumen find(Object id);

    List<AsistenciaResumen> findAll();

    List<AsistenciaResumen> findRange(int[] range);

    int count();
    
}
