/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.PapeletaSalida;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface PapeletaSalidaFacadeLocal {

    void create(PapeletaSalida papeletaSalida);

    void edit(PapeletaSalida papeletaSalida);

    void remove(PapeletaSalida papeletaSalida);

    PapeletaSalida find(Object id);

    List<PapeletaSalida> findAll();

    List<PapeletaSalida> findRange(int[] range);

    int count();
    
}
