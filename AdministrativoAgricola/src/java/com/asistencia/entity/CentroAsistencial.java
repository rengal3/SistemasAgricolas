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
@Table(name = "CENTRO_ASISTENCIAL", catalog = "AsistenciaAgricola", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "CentroAsistencial.findAll", query = "SELECT c FROM CentroAsistencial c"),
    @NamedQuery(name = "CentroAsistencial.findByIdCentroAsistencial", query = "SELECT c FROM CentroAsistencial c WHERE c.idCentroAsistencial = :idCentroAsistencial"),
    @NamedQuery(name = "CentroAsistencial.findByCentroAsistencial", query = "SELECT c FROM CentroAsistencial c WHERE c.centroAsistencial = :centroAsistencial"),
    @NamedQuery(name = "CentroAsistencial.findByDireccion", query = "SELECT c FROM CentroAsistencial c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "CentroAsistencial.findByMostrar", query = "SELECT c FROM CentroAsistencial c WHERE c.mostrar = :mostrar")})
public class CentroAsistencial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "ID_CENTRO_ASISTENCIAL", nullable = false)
    private Integer idCentroAsistencial;
    @Size(max = 2147483647)
    @Column(name = "CENTRO_ASISTENCIAL", length = 2147483647)
    private String centroAsistencial;
    @Size(max = 2147483647)
    @Column(name = "DIRECCION", length = 2147483647)
    private String direccion;
    @Column(name = "MOSTRAR")
    private Integer mostrar;
    @OneToMany(mappedBy = "idCentroAsistencial", fetch = FetchType.LAZY)
    private List<Personal> personalList;

    public CentroAsistencial() {
    }

    public CentroAsistencial(Integer idCentroAsistencial) {
        this.idCentroAsistencial = idCentroAsistencial;
    }

    public Integer getIdCentroAsistencial() {
        return idCentroAsistencial;
    }

    public void setIdCentroAsistencial(Integer idCentroAsistencial) {
        this.idCentroAsistencial = idCentroAsistencial;
    }

    public String getCentroAsistencial() {
        return centroAsistencial;
    }

    public void setCentroAsistencial(String centroAsistencial) {
        this.centroAsistencial = centroAsistencial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
        hash += (idCentroAsistencial != null ? idCentroAsistencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CentroAsistencial)) {
            return false;
        }
        CentroAsistencial other = (CentroAsistencial) object;
        if ((this.idCentroAsistencial == null && other.idCentroAsistencial != null) || (this.idCentroAsistencial != null && !this.idCentroAsistencial.equals(other.idCentroAsistencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.CentroAsistencial[ idCentroAsistencial=" + idCentroAsistencial + " ]";
    }
    
}
