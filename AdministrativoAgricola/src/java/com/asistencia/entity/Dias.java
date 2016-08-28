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
@Table(name = "DIAS", catalog = "AsistenciaAgricola", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Dias.findAll", query = "SELECT d FROM Dias d"),
    @NamedQuery(name = "Dias.findByIdDia", query = "SELECT d FROM Dias d WHERE d.idDia = :idDia"),
    @NamedQuery(name = "Dias.findByDia", query = "SELECT d FROM Dias d WHERE d.dia = :dia"),
    @NamedQuery(name = "Dias.findBySobreTiempo", query = "SELECT d FROM Dias d WHERE d.sobreTiempo = :sobreTiempo"),
    @NamedQuery(name = "Dias.findByAdicional", query = "SELECT d FROM Dias d WHERE d.adicional = :adicional"),
    @NamedQuery(name = "Dias.findByDominical", query = "SELECT d FROM Dias d WHERE d.dominical = :dominical")})
public class Dias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "ID_DIA", nullable = false)
    private Integer idDia;
    @Size(max = 2147483647)
    @Column(name = "DIA", length = 2147483647)
    private String dia;
    @Column(name = "SOBRE_TIEMPO")
    private Integer sobreTiempo;
    @Column(name = "ADICIONAL")
    private Integer adicional;
    @Column(name = "DOMINICAL")
    private Integer dominical;
    @OneToMany(mappedBy = "idDia", fetch = FetchType.LAZY)
    private List<Admision> admisionList;

    public Dias() {
    }

    public Dias(Integer idDia) {
        this.idDia = idDia;
    }

    public Integer getIdDia() {
        return idDia;
    }

    public void setIdDia(Integer idDia) {
        this.idDia = idDia;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Integer getSobreTiempo() {
        return sobreTiempo;
    }

    public void setSobreTiempo(Integer sobreTiempo) {
        this.sobreTiempo = sobreTiempo;
    }

    public Integer getAdicional() {
        return adicional;
    }

    public void setAdicional(Integer adicional) {
        this.adicional = adicional;
    }

    public Integer getDominical() {
        return dominical;
    }

    public void setDominical(Integer dominical) {
        this.dominical = dominical;
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
        hash += (idDia != null ? idDia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dias)) {
            return false;
        }
        Dias other = (Dias) object;
        if ((this.idDia == null && other.idDia != null) || (this.idDia != null && !this.idDia.equals(other.idDia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.Dias[ idDia=" + idDia + " ]";
    }
    
}
