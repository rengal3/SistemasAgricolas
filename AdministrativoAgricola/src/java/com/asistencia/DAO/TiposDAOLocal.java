/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.DAO;

import com.asistencia.TO.TipoTO;
import com.asistencia.entity.Tipo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Renato
 */
@Local
public interface TiposDAOLocal {
    public List<TipoTO> getListaTiposTabla(String tabla,String id_empresa) throws Exception ;
    
    public boolean insertarTipo(TipoTO tipoto) throws Exception ;
    public boolean eliminarTipo(TipoTO tipoto) throws Exception;

    Tipo getTipoTablaCodigo(String id_tabla, String id_codigo,String id_empresa) throws Exception;
}
