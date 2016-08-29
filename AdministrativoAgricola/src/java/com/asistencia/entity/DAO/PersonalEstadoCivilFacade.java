/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.PersonalEstadoCivil;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Renato
 */
@Stateless
public class PersonalEstadoCivilFacade extends AbstractFacade<PersonalEstadoCivil> implements PersonalEstadoCivilFacadeLocal {

    @PersistenceContext(unitName = "AdministrativoAgricolaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonalEstadoCivilFacade() {
        super(PersonalEstadoCivil.class);
    }
    
}
