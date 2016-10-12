/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.business;

import com.asistencia.DAO.AsistenciaDAOLocal;
import com.asistencia.entity.AsistenciaResumen;
import com.asistencia.entity.AsistenciaResumenPK;
import com.asistencia.entity.DAO.AsistenciaResumenFacadeLocal;
import com.asistencia.entity.DAO.HorariosFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Renato
 */
@Stateless
public class AsistenciaBusiness implements AsistenciaBusinessLocal {

    @EJB
    AsistenciaDAOLocal asistenciaDao;
    
    @EJB
    AsistenciaResumenFacadeLocal asistenciaResumenDAO;
    
    @EJB
    HorariosFacadeLocal horariosDAO;

    @Override
    public void procesarRegistroMarcacion(String idempresa,String dni,String fecha,String hora) throws Exception{
        
        
        AsistenciaResumen marcacion=new AsistenciaResumen();
        marcacion.setAsistenciaResumenPK(new AsistenciaResumenPK());
        
    }
    

    
    
    
}
