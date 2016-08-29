/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.helper;

import com.asistencia.TO.AdmisionTipoTO;
import com.asistencia.entity.AdmisionTipos;

/**
 *
 * @author Renato
 */
public class Conversiones {
    
    public static AdmisionTipos getAadmisionTipoFromTO(AdmisionTipoTO admision) throws Exception{
        AdmisionTipos adm=new AdmisionTipos();
        adm.setId(admision.getId());
        adm.setDescripcion(admision.getDescripcion());
        adm.setMostrar(admision.getMostrar());
        adm.setSigla(admision.getSigla());
        return adm;                
    }
}
