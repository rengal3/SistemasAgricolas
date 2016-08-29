/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.Hijos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface HijosFacadeLocal {

    void create(Hijos hijos);

    void edit(Hijos hijos);

    void remove(Hijos hijos);

    Hijos find(Object id);

    List<Hijos> findAll();

    List<Hijos> findRange(int[] range);

    int count();
    
}
