/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Renato
 */
@Entity
@Table(name = "admision_horario")
@NamedQueries({
    @NamedQuery(name = "AdmisionHorario.findAll", query = "SELECT a FROM AdmisionHorario a"),
    @NamedQuery(name = "AdmisionHorario.findById", query = "SELECT a FROM AdmisionHorario a WHERE a.id = :id"),
    @NamedQuery(name = "AdmisionHorario.findByTipo", query = "SELECT a FROM AdmisionHorario a WHERE a.tipo = :tipo"),
    @NamedQuery(name = "AdmisionHorario.findByDesde", query = "SELECT a FROM AdmisionHorario a WHERE a.desde = :desde"),
    @NamedQuery(name = "AdmisionHorario.findByHasta", query = "SELECT a FROM AdmisionHorario a WHERE a.hasta = :hasta"),
    @NamedQuery(name = "AdmisionHorario.findByHe", query = "SELECT a FROM AdmisionHorario a WHERE a.he = :he"),
    @NamedQuery(name = "AdmisionHorario.findByHs", query = "SELECT a FROM AdmisionHorario a WHERE a.hs = :hs"),
    @NamedQuery(name = "AdmisionHorario.findByMostrar", query = "SELECT a FROM AdmisionHorario a WHERE a.mostrar = :mostrar")})
public class AdmisionHorario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Size(max = 50)
    @Column(name = "TIPO", length = 50)
    private String tipo;
    @Size(max = 50)
    @Column(name = "DESDE", length = 50)
    private String desde;
    @Size(max = 50)
    @Column(name = "HASTA", length = 50)
    private String hasta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HE", precision = 19, scale = 4)
    private BigDecimal he;
    @Column(name = "HS", precision = 19, scale = 4)
    private BigDecimal hs;
    @Column(name = "MOSTRAR")
    private Integer mostrar;

    public AdmisionHorario() {
    }

    public AdmisionHorario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDesde() {
        return desde;
    }

    public void setDesde(String desde) {
        this.desde = desde;
    }

    public String getHasta() {
        return hasta;
    }

    public void setHasta(String hasta) {
        this.hasta = hasta;
    }

    public BigDecimal getHe() {
        return he;
    }

    public void setHe(BigDecimal he) {
        this.he = he;
    }

    public BigDecimal getHs() {
        return hs;
    }

    public void setHs(BigDecimal hs) {
        this.hs = hs;
    }

    public Integer getMostrar() {
        return mostrar;
    }

    public void setMostrar(Integer mostrar) {
        this.mostrar = mostrar;
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
        if (!(object instanceof AdmisionHorario)) {
            return false;
        }
        AdmisionHorario other = (AdmisionHorario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.AdmisionHorario[ id=" + id + " ]";
    }
    
}
