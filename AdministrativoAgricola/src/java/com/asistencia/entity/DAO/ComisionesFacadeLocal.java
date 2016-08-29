/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.Comisiones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface ComisionesFacadeLocal {

    void create(Comisiones comisiones);

    void edit(Comisiones comisiones);

    void remove(Comisiones comisiones);

    Comisiones find(Object id);

    List<Comisiones> findAll();

    List<Comisiones> findRange(int[] range);

    int count();
    
}
