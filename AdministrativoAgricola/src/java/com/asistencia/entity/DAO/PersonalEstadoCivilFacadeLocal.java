/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.PersonalEstadoCivil;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface PersonalEstadoCivilFacadeLocal {

    void create(PersonalEstadoCivil personalEstadoCivil);

    void edit(PersonalEstadoCivil personalEstadoCivil);

    void remove(PersonalEstadoCivil personalEstadoCivil);

    PersonalEstadoCivil find(Object id);

    List<PersonalEstadoCivil> findAll();

    List<PersonalEstadoCivil> findRange(int[] range);

    int count();
    
}
