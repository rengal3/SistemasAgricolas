/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.business;

import com.asistencia.DAO.AsistenciaDAOLocal;
import com.asistencia.DAO.HorariosDAOLocal;
import com.asistencia.DAO.TiposDAOLocal;
import com.asistencia.entity.AsistenciaResumen;
import com.asistencia.entity.AsistenciaResumenPK;
import com.asistencia.entity.DAO.AsistenciaResumenFacadeLocal;
import com.asistencia.entity.DAO.HorariosFacadeLocal;
import com.asistencia.entity.Horarios;
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
    HorariosDAOLocal horariosDAO;

    @EJB
    TiposDAOLocal tiposDAO;
    
    
    @Override
    public void procesarRegistroMarcacion(String idempresa,String dni,String fecha,String hora) throws Exception{
        int minutosTolerancia=0;
        //lee los minutos de tolerancia
        minutosTolerancia=tiposDAO.getTipoTablaCodigo("opciones_sistema", "A-001",idempresa).getCantidad().intValue();
        //buscar el horario para el dni
        Horarios h=horariosDAO.getHorarioByDNI(dni);
        
        System.out.println(minutosTolerancia+"  -  "+h.getM1()+" : "+h.getM2());
        AsistenciaResumen marcacion=new AsistenciaResumen();
        marcacion.setAsistenciaResumenPK(new AsistenciaResumenPK());
        
    }
    

    
    
    
}
