/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.helper;

import com.asistencia.TO.AdmisionTO;
import com.asistencia.TO.AdmisionTipoTO;
import com.asistencia.entity.AdmisionTipos;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
    
    public static List<AdmisionTipoTO> getListAdmisionTipoTO(List<AdmisionTipos> lista) throws Exception{
        List<AdmisionTipoTO> retorno=new ArrayList();
        for(AdmisionTipos a:lista){
            retorno.add(new AdmisionTipoTO(a.getId(),a.getDescripcion(),a.getSigla(),a.getMostrar()));
        }
        
        return retorno;
    }
     public static List<AdmisionTO> convertirTOAdmision(List datos) {
        List lista = new ArrayList(1);
        for (Iterator i$ = datos.iterator(); i$.hasNext();) {
            Object obj = i$.next();
            Object[] array = ((List) obj).toArray();
            Integer d1;
            try {
                d1 = new Integer(array[0].toString());
            } catch (Exception e) {
                d1 = null;
            }
            String d2;
            try {
                d2 = array[1].toString();
            } catch (Exception e) {
                d2 = "";
            }
            
            String d3;
            try {
                d3 = array[2].toString();
            } catch (Exception e) {
                d3 = "";
            }
            
            String d4;
            try {
                d4 = array[3].toString();
            } catch (Exception e) {
                d4 = "";
            }

            BigDecimal d5;
            try {
                d5 = new BigDecimal(array[4].toString());
            } catch (Exception e) {
                d5 = null;
            }

              String d6;
            try {
                d6 = array[5].toString();
            } catch (Exception e) {
                d6 = "";
            }
            
            String d7;
            try {
                d7 = array[6].toString();
            } catch (Exception e) {
                d7 = "";
            }
            
            String d8;
            try {
                d8 = array[7].toString();
            } catch (Exception e) {
                d8 = "";
            }

            lista.add(new AdmisionTO(d1,d2,d3,d4,d5,d6,d7,d8));
        }
        return lista;
    }
}
