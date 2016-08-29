/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.Dias;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface DiasFacadeLocal {

    void create(Dias dias);

    void edit(Dias dias);

    void remove(Dias dias);

    Dias find(Object id);

    List<Dias> findAll();

    List<Dias> findRange(int[] range);

    int count();
    
}
