/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.AdmisionTipos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface AdmisionTiposFacadeLocal {

    void create(AdmisionTipos admisionTipos);

    void edit(AdmisionTipos admisionTipos);

    void remove(AdmisionTipos admisionTipos);

    AdmisionTipos find(Object id);

    List<AdmisionTipos> findAll();

    List<AdmisionTipos> findRange(int[] range);

    int count();
    
}
