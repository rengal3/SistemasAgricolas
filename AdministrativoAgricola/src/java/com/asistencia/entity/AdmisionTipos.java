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
@Table(name = "ADMISION_TIPOS", catalog = "AsistenciaAgricola", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "AdmisionTipos.findAll", query = "SELECT a FROM AdmisionTipos a"),
    @NamedQuery(name = "AdmisionTipos.findById", query = "SELECT a FROM AdmisionTipos a WHERE a.id = :id"),
    @NamedQuery(name = "AdmisionTipos.findByDescripcion", query = "SELECT a FROM AdmisionTipos a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "AdmisionTipos.findBySigla", query = "SELECT a FROM AdmisionTipos a WHERE a.sigla = :sigla"),
    @NamedQuery(name = "AdmisionTipos.findByMostrar", query = "SELECT a FROM AdmisionTipos a WHERE a.mostrar = :mostrar")})
public class AdmisionTipos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "DESCRIPCION", length = 2147483647)
    private String descripcion;
    @Size(max = 50)
    @Column(name = "SIGLA", length = 50)
    private String sigla;
    @Column(name = "MOSTRAR")
    private Integer mostrar;
    @OneToMany(mappedBy = "idTipos", fetch = FetchType.LAZY)
    private List<Admision> admisionList;

    public AdmisionTipos() {
    }

    public AdmisionTipos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getMostrar() {
        return mostrar;
    }

    public void setMostrar(Integer mostrar) {
        this.mostrar = mostrar;
    }

    public List<Admision> getAdmisionList() {
        return admisionList;
    }

    public void setAdmisionList(List<Admision> admisionList) {
        this.admisionList = admisionList;
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
        if (!(object instanceof AdmisionTipos)) {
            return false;
        }
        AdmisionTipos other = (AdmisionTipos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.AdmisionTipos[ id=" + id + " ]";
    }
    
}
