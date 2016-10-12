/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.DAO;

import com.asistencia.TO.AdmisionTO;
import com.asistencia.TO.AdmisionTipoTO;

import com.asistencia.helper.Conversiones;
import com.asistencia.helper.NativeQueryResultsMapper;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
    
}
