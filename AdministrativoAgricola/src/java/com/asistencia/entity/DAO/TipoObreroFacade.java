/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity.DAO;

import com.asistencia.entity.TipoObrero;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Renato
 */
@Stateless
public class TipoObreroFacade extends AbstractFacade<TipoObrero> implements TipoObreroFacadeLocal {

    @PersistenceContext(unitName = "AdministrativoAgricolaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoObreroFacade() {
        super(TipoObrero.class);
    }
    
}
