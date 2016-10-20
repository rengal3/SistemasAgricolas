/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.DAO;

import com.asistencia.entity.Trabajador;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Renato
 */
@Stateless
public class TrabajadorDAO implements TrabajadorDAOLocal {
    @PersistenceContext(unitName = "AdministrativoAgricolaPU")
    private EntityManager em;

    @Override
    public Trabajador buscarTrabajadorPorDNI(String dni) throws Exception {
        try{
            Trabajador retorno= em.createNamedQuery("Trabajador.findByNumDocumento",Trabajador.class).
                setParameter("numDocumento", dni).getSingleResult();
                return retorno;
            }catch(NoResultException e){
                return null;
            }catch(Exception ef){
                throw ef;
            }
        
    }
    
    
    
}
