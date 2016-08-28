/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Renato
 */
@Entity
@Table(name = "TIPO_TRABAJADOR", catalog = "AsistenciaAgricola", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "TipoTrabajador.findAll", query = "SELECT t FROM TipoTrabajador t"),
    @NamedQuery(name = "TipoTrabajador.findByIdTipoTrabajador", query = "SELECT t FROM TipoTrabajador t WHERE t.idTipoTrabajador = :idTipoTrabajador"),
    @NamedQuery(name = "TipoTrabajador.findByTipoTrabajador", query = "SELECT t FROM TipoTrabajador t WHERE t.tipoTrabajador = :tipoTrabajador"),
    @NamedQuery(name = "TipoTrabajador.findByMostrar", query = "SELECT t FROM TipoTrabajador t WHERE t.mostrar = :mostrar")})
public class TipoTrabajador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "ID_TIPO_TRABAJADOR", nullable = false)
    private Integer idTipoTrabajador;
    @Size(max = 2147483647)
    @Column(name = "TIPO_TRABAJADOR", length = 2147483647)
    private String tipoTrabajador;
    @Column(name = "MOSTRAR")
    private Integer mostrar;
    @OneToMany(mappedBy = "idTipoTrabajador", fetch = FetchType.LAZY)
    private List<Personal> personalList;

    public TipoTrabajador() {
    }

    public TipoTrabajador(Integer idTipoTrabajador) {
        this.idTipoTrabajador = idTipoTrabajador;
    }

    public Integer getIdTipoTrabajador() {
        return idTipoTrabajador;
    }

    public void setIdTipoTrabajador(Integer idTipoTrabajador) {
        this.idTipoTrabajador = idTipoTrabajador;
    }

    public String getTipoTrabajador() {
        return tipoTrabajador;
    }

    public void setTipoTrabajador(String tipoTrabajador) {
        this.tipoTrabajador = tipoTrabajador;
    }

    public Integer getMostrar() {
        return mostrar;
    }

    public void setMostrar(Integer mostrar) {
        this.mostrar = mostrar;
    }

    public List<Personal> getPersonalList() {
        return personalList;
    }

    public void setPersonalList(List<Personal> personalList) {
        this.personalList = personalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoTrabajador != null ? idTipoTrabajador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoTrabajador)) {
            return false;
        }
        TipoTrabajador other = (TipoTrabajador) object;
        if ((this.idTipoTrabajador == null && other.idTipoTrabajador != null) || (this.idTipoTrabajador != null && !this.idTipoTrabajador.equals(other.idTipoTrabajador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.TipoTrabajador[ idTipoTrabajador=" + idTipoTrabajador + " ]";
    }
    
}
