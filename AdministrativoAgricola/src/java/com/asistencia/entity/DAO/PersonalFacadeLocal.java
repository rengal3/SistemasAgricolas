/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.Personal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface PersonalFacadeLocal {

    void create(Personal personal);

    void edit(Personal personal);

    void remove(Personal personal);

    Personal find(Object id);

    List<Personal> findAll();

    List<Personal> findRange(int[] range);

    int count();
    
}
