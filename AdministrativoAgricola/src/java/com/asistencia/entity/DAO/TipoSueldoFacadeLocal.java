/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.TipoSueldo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface TipoSueldoFacadeLocal {

    void create(TipoSueldo tipoSueldo);

    void edit(TipoSueldo tipoSueldo);

    void remove(TipoSueldo tipoSueldo);

    TipoSueldo find(Object id);

    List<TipoSueldo> findAll();

    List<TipoSueldo> findRange(int[] range);

    int count();
    
}
