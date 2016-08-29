/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.AdmisionHorario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface AdmisionHorarioFacadeLocal {

    void create(AdmisionHorario admisionHorario);

    void edit(AdmisionHorario admisionHorario);

    void remove(AdmisionHorario admisionHorario);

    AdmisionHorario find(Object id);

    List<AdmisionHorario> findAll();

    List<AdmisionHorario> findRange(int[] range);

    int count();
    
}
