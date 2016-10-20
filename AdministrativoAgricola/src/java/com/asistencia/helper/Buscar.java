/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.helper;

import com.asistencia.entity.Tipo;
import java.util.List;

/**
 *
 * @author Renato
 */
public class Buscar {
    
    public static Tipo buscarTipoPorTablaCodigo(List<Tipo> listaTipos,String id_tabla,String id_codigo,String id_empresa){
        Tipo retorno=null;
        for(Tipo buscar:listaTipos){
            if((buscar.getTabla().trim().equalsIgnoreCase(id_tabla)) && 
                    (buscar.getCodigo().trim().equalsIgnoreCase(id_codigo)) && 
                            (buscar.getIdEmpresa().getIdEmpresa().trim().equalsIgnoreCase(id_empresa))){
                            retorno=buscar;
            }
        }
        
        return retorno;
    }
    
    public static boolean buscarVerificarSiFeriado(List<Tipo> listaTipos,String fecha,String id_empresa){
        boolean retorno=false;
        for(Tipo buscar:listaTipos){
            if(buscar.getTabla().trim().equalsIgnoreCase("tabla_feriados") && 
                    buscar.getIdEmpresa().getIdEmpresa().trim().equalsIgnoreCase(id_empresa) &&
                    buscar.getCodigo().trim().equalsIgnoreCase(fecha.substring(0, 5))){
                retorno=true;
            }
        }
        
        return retorno;
    }
           
}
