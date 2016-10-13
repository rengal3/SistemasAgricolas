/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.helper;

import com.asistencia.TO.TipoTO;
import com.asistencia.entity.Empresa;
import com.asistencia.entity.Tipo;

/**
 *
 * @author Renato
 */
public class Conversiones {
    
    public static Tipo convertirToTipo_TipoTO(TipoTO tip) {
        Tipo retorno = new Tipo(tip.getId_tabla_tipo());
        retorno.setCodigo(tip.getCodigo());
        retorno.setDescripcionCampo(tip.getDescripcion_campo());
        retorno.setDescripcionValor(tip.getDescripcion_valor());
        retorno.setTabla(tip.getTabla());
        retorno.setCantidad(tip.getCantidad());
        retorno.setCodSunat(tip.getCodigo_sunat());
        retorno.setIdEmpresa(new Empresa(tip.getId_empresa()));
        return retorno;
    }
     
}
