/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.DAO;

import com.asistencia.entity.Tipo;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Renato
 */
@Startup
@Singleton
public class ObtenerParametrosSingleton implements ObtenerParametrosSingletonLocal {

    @PersistenceContext(unitName = "AdministrativoAgricolaPU")
    private EntityManager em;
    
    private List<Tipo> listaTipos;

    @PostConstruct
    public void inicializaTipos(){
        listaTipos=em.createNamedQuery("Tipo.findAll", Tipo.class).getResultList();
    }
    
    @Lock(LockType.READ)
    @Override
    public List<Tipo> getListaTipos() {
        return listaTipos;
    }

    @Lock(LockType.WRITE)
    @Override
    public void setListaTipos(List<Tipo> listaTipos) {
        this.listaTipos = listaTipos;
    }
    
    
}
