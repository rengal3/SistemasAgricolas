/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.DAO;

import com.asistencia.entity.AsistenciaResumen;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Renato
 */
@Stateless
public class AsistenciaDAO implements AsistenciaDAOLocal {

    @PersistenceContext(unitName = "AdministrativoAgricolaPU")
    private EntityManager em;

    @Override
    public void insertarMarcacion(String idempresa, String dni, String fecha, String hora) throws Exception {
        
    }

    @Override
    public AsistenciaResumen buscarMarcacionDiaria(String fecha, String idEmpresa, long idTrabajador) throws Exception {
        AsistenciaResumen retorno=null;
        try{
           
            retorno=em.createQuery("select a from AsistenciaResumen a where "
                    + "a.asistenciaResumenPK.fecha=:fecha and "
                    + "a.asistenciaResumenPK.idEmpresa=:idempresa and "
                    + "a.asistenciaResumenPK.idTrabajador=:idtrabajador", AsistenciaResumen.class).setParameter("fecha", fecha)
                    .setParameter("idempresa", idEmpresa).setParameter("idtrabajador", idTrabajador).getSingleResult();
            em.refresh(retorno);
        }catch(NoResultException e){
            return null;
        }catch(Exception ef){
            throw ef;
        }
        
        return retorno;
    }
    
    
   
    
    
}
