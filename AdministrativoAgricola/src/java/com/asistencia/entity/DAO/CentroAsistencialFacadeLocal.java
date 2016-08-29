/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.CentroAsistencial;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface CentroAsistencialFacadeLocal {

    void create(CentroAsistencial centroAsistencial);

    void edit(CentroAsistencial centroAsistencial);

    void remove(CentroAsistencial centroAsistencial);

    CentroAsistencial find(Object id);

    List<CentroAsistencial> findAll();

    List<CentroAsistencial> findRange(int[] range);

    int count();
    
}
