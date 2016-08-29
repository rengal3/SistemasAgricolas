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
@Table(name = "tipo_obrero")
@NamedQueries({
    @NamedQuery(name = "TipoObrero.findAll", query = "SELECT t FROM TipoObrero t"),
    @NamedQuery(name = "TipoObrero.findByIdTipoObrero", query = "SELECT t FROM TipoObrero t WHERE t.idTipoObrero = :idTipoObrero"),
    @NamedQuery(name = "TipoObrero.findByTipoObrero", query = "SELECT t FROM TipoObrero t WHERE t.tipoObrero = :tipoObrero"),
    @NamedQuery(name = "TipoObrero.findByDisperso", query = "SELECT t FROM TipoObrero t WHERE t.disperso = :disperso"),
    @NamedQuery(name = "TipoObrero.findByMostrar", query = "SELECT t FROM TipoObrero t WHERE t.mostrar = :mostrar")})
public class TipoObrero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "ID_TIPO_OBRERO", nullable = false)
    private Integer idTipoObrero;
    @Size(max = 10485760)
    @Column(name = "TIPO_OBRERO", length = 10485760)
    private String tipoObrero;
    @Column(name = "DISPERSO")
    private Integer disperso;
    @Column(name = "MOSTRAR")
    private Integer mostrar;
    @OneToMany(mappedBy = "idTipoDeObrero", fetch = FetchType.LAZY)
    private List<Personal> personalList;

    public TipoObrero() {
    }

    public TipoObrero(Integer idTipoObrero) {
        this.idTipoObrero = idTipoObrero;
    }

    public Integer getIdTipoObrero() {
        return idTipoObrero;
    }

    public void setIdTipoObrero(Integer idTipoObrero) {
        this.idTipoObrero = idTipoObrero;
    }

    public String getTipoObrero() {
        return tipoObrero;
    }

    public void setTipoObrero(String tipoObrero) {
        this.tipoObrero = tipoObrero;
    }

    public Integer getDisperso() {
        return disperso;
    }

    public void setDisperso(Integer disperso) {
        this.disperso = disperso;
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
        hash += (idTipoObrero != null ? idTipoObrero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoObrero)) {
            return false;
        }
        TipoObrero other = (TipoObrero) object;
        if ((this.idTipoObrero == null && other.idTipoObrero != null) || (this.idTipoObrero != null && !this.idTipoObrero.equals(other.idTipoObrero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.TipoObrero[ idTipoObrero=" + idTipoObrero + " ]";
    }
    
}
