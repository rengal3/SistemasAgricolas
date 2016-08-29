/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.TipoObrero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface TipoObreroFacadeLocal {

    void create(TipoObrero tipoObrero);

    void edit(TipoObrero tipoObrero);

    void remove(TipoObrero tipoObrero);

    TipoObrero find(Object id);

    List<TipoObrero> findAll();

    List<TipoObrero> findRange(int[] range);

    int count();
    
}
