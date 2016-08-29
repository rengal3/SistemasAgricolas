/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.TipoTrabajador;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface TipoTrabajadorFacadeLocal {

    void create(TipoTrabajador tipoTrabajador);

    void edit(TipoTrabajador tipoTrabajador);

    void remove(TipoTrabajador tipoTrabajador);

    TipoTrabajador find(Object id);

    List<TipoTrabajador> findAll();

    List<TipoTrabajador> findRange(int[] range);

    int count();
    
}
