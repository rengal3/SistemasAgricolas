/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.DAO;

import com.asistencia.entity.Horarios;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Renato
 */
@Stateless
public class HorariosDAO implements HorariosDAOLocal {

    @PersistenceContext(unitName = "AdministrativoAgricolaPU")
    private EntityManager em;
    
    @Override
    public Horarios getHorarioByDNI(String dni) throws Exception {
        return em.createQuery("select h from Horarios h  JOIN  h.tipoList t JOIN  t.trabajadorList1 tr"
                + " where tr.numDocumento=:dni", Horarios.class).setParameter("dni", dni).getSingleResult();
    }

 
    
}
