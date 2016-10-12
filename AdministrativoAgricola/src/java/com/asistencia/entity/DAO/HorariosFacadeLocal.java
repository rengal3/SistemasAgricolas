/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.Horarios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface HorariosFacadeLocal {

    void create(Horarios horarios);

    void edit(Horarios horarios);

    void remove(Horarios horarios);

    Horarios find(Object id);

    List<Horarios> findAll();

    List<Horarios> findRange(int[] range);

    int count();
    
}
