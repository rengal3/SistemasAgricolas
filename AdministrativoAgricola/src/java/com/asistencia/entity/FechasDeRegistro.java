/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Renato
 */
@Entity
@Table(name = "FECHAS_DE_REGISTRO", catalog = "AsistenciaAgricola", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "FechasDeRegistro.findAll", query = "SELECT f FROM FechasDeRegistro f"),
    @NamedQuery(name = "FechasDeRegistro.findById", query = "SELECT f FROM FechasDeRegistro f WHERE f.id = :id"),
    @NamedQuery(name = "FechasDeRegistro.findByIngresa", query = "SELECT f FROM FechasDeRegistro f WHERE f.ingresa = :ingresa"),
    @NamedQuery(name = "FechasDeRegistro.findByConcluye", query = "SELECT f FROM FechasDeRegistro f WHERE f.concluye = :concluye"),
    @NamedQuery(name = "FechasDeRegistro.findByObservacion", query = "SELECT f FROM FechasDeRegistro f WHERE f.observacion = :observacion")})
public class FechasDeRegistro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "INGRESA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ingresa;
    @Column(name = "CONCLUYE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date concluye;
    @Size(max = 2147483647)
    @Column(name = "OBSERVACION", length = 2147483647)
    private String observacion;
    @JoinColumn(name = "ID_PERSONAL", referencedColumnName = "ID_PERSONAL")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal idPersonal;

    public FechasDeRegistro() {
    }

    public FechasDeRegistro(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getIngresa() {
        return ingresa;
    }

    public void setIngresa(Date ingresa) {
        this.ingresa = ingresa;
    }

    public Date getConcluye() {
        return concluye;
    }

    public void setConcluye(Date concluye) {
        this.concluye = concluye;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Personal getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(Personal idPersonal) {
        this.idPersonal = idPersonal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FechasDeRegistro)) {
            return false;
        }
        FechasDeRegistro other = (FechasDeRegistro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.FechasDeRegistro[ id=" + id + " ]";
    }
    
}
