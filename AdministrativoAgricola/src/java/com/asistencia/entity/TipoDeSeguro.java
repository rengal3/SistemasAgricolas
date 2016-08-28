/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "TIPO_DE_SEGURO", catalog = "AsistenciaAgricola", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "TipoDeSeguro.findAll", query = "SELECT t FROM TipoDeSeguro t"),
    @NamedQuery(name = "TipoDeSeguro.findByIdTipoSeguro", query = "SELECT t FROM TipoDeSeguro t WHERE t.idTipoSeguro = :idTipoSeguro"),
    @NamedQuery(name = "TipoDeSeguro.findByTipoSeguro", query = "SELECT t FROM TipoDeSeguro t WHERE t.tipoSeguro = :tipoSeguro"),
    @NamedQuery(name = "TipoDeSeguro.findByPorcentaje", query = "SELECT t FROM TipoDeSeguro t WHERE t.porcentaje = :porcentaje"),
    @NamedQuery(name = "TipoDeSeguro.findByMostrar", query = "SELECT t FROM TipoDeSeguro t WHERE t.mostrar = :mostrar")})
public class TipoDeSeguro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "ID_TIPO_SEGURO", nullable = false)
    private Integer idTipoSeguro;
    @Size(max = 2147483647)
    @Column(name = "TIPO_SEGURO", length = 2147483647)
    private String tipoSeguro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJE", precision = 19, scale = 4)
    private BigDecimal porcentaje;
    @Column(name = "MOSTRAR")
    private Integer mostrar;
    @OneToMany(mappedBy = "idTipoSeguro", fetch = FetchType.LAZY)
    private List<Personal> personalList;

    public TipoDeSeguro() {
    }

    public TipoDeSeguro(Integer idTipoSeguro) {
        this.idTipoSeguro = idTipoSeguro;
    }

    public Integer getIdTipoSeguro() {
        return idTipoSeguro;
    }

    public void setIdTipoSeguro(Integer idTipoSeguro) {
        this.idTipoSeguro = idTipoSeguro;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
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
        hash += (idTipoSeguro != null ? idTipoSeguro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDeSeguro)) {
            return false;
        }
        TipoDeSeguro other = (TipoDeSeguro) object;
        if ((this.idTipoSeguro == null && other.idTipoSeguro != null) || (this.idTipoSeguro != null && !this.idTipoSeguro.equals(other.idTipoSeguro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.TipoDeSeguro[ idTipoSeguro=" + idTipoSeguro + " ]";
    }
    
}
