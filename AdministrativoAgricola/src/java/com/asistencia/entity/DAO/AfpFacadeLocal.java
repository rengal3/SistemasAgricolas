/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.Afp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface AfpFacadeLocal {

    void create(Afp afp);

    void edit(Afp afp);

    void remove(Afp afp);

    Afp find(Object id);

    List<Afp> findAll();

    List<Afp> findRange(int[] range);

    int count();
    
}
