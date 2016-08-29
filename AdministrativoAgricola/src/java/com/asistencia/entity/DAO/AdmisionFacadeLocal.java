/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.Admision;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface AdmisionFacadeLocal {

    void create(Admision admision);

    void edit(Admision admision);

    void remove(Admision admision);

    Admision find(Object id);

    List<Admision> findAll();

    List<Admision> findRange(int[] range);

    int count();
    
}
