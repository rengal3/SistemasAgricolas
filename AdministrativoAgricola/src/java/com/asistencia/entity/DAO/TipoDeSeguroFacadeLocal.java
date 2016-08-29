/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.TipoDeSeguro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface TipoDeSeguroFacadeLocal {

    void create(TipoDeSeguro tipoDeSeguro);

    void edit(TipoDeSeguro tipoDeSeguro);

    void remove(TipoDeSeguro tipoDeSeguro);

    TipoDeSeguro find(Object id);

    List<TipoDeSeguro> findAll();

    List<TipoDeSeguro> findRange(int[] range);

    int count();
    
}
