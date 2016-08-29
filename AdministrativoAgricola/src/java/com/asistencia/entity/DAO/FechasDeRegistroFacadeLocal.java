/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.FechasDeRegistro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface FechasDeRegistroFacadeLocal {

    void create(FechasDeRegistro fechasDeRegistro);

    void edit(FechasDeRegistro fechasDeRegistro);

    void remove(FechasDeRegistro fechasDeRegistro);

    FechasDeRegistro find(Object id);

    List<FechasDeRegistro> findAll();

    List<FechasDeRegistro> findRange(int[] range);

    int count();
    
}
