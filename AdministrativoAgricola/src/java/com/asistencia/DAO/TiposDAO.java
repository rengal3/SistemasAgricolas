/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.DAO;

import com.asistencia.TO.TipoTO;
import com.asistencia.entity.Tipo;
import com.asistencia.helper.Conversiones;
import com.asistencia.helper.NativeQueryResultsMapper;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Renato
 */
@Stateless
public class TiposDAO implements TiposDAOLocal {

    @PersistenceContext(unitName = "AdministrativoAgricolaPU")
    private EntityManager em;
    
    @Override
    public List<TipoTO> getListaTiposTabla(String tabla,String id_empresa) throws Exception {
        Query consulta = this.em.createNativeQuery("select id_tabla_tipo, tabla, descripcion_campo, "
                + " codigo, descripcion_valor, cantidad from tipo where tabla='" + tabla + "' "
                + "and id_empresa='"+id_empresa+"' " );
        return NativeQueryResultsMapper.map(consulta.getResultList(),TipoTO.class);
    } 

    
    @Override
    public boolean insertarTipo(TipoTO tipoto) throws Exception {
        boolean estado = false;
        EntityTransaction tx = this.em.getTransaction();
        tx.begin();
        try {
            Tipo tipo = Conversiones.convertirToTipo_TipoTO(tipoto);
            this.em.persist(tipo);
            this.em.flush();
            tx.commit();
            estado = true;

        } catch (Exception e) {
            tx.rollback();
            throw e;
        }
        return estado;
    }

    @Override
    public boolean eliminarTipo(TipoTO tipoto) throws Exception {
        boolean estado = false;
        EntityTransaction tx = this.em.getTransaction();
        tx.begin();
        try {
            Tipo tipo = this.em.find(Tipo.class, tipoto.getId_tabla_tipo());
            this.em.remove(this.em.merge(tipo));
            this.em.flush();
            tx.commit();
            estado = true;

        } catch (Exception e) {
            tx.rollback();
            throw e;
        }
        return estado;
    }

    @Override
    public Tipo getTipoTablaCodigo(String id_tabla, String id_codigo,String id_empresa) throws Exception {
        Query q=em.createNamedQuery("Tipo.findByTablaCodigo",Tipo.class);
        q.setParameter("tabla", id_tabla);
        q.setParameter("codigo", id_codigo);
        q.setParameter("idempresa", id_empresa);
        return (Tipo)q.getSingleResult();
    }

}
