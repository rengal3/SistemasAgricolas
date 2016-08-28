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
@Table(name = "AFP", catalog = "AsistenciaAgricola", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Afp.findAll", query = "SELECT a FROM Afp a"),
    @NamedQuery(name = "Afp.findByIdAfp", query = "SELECT a FROM Afp a WHERE a.idAfp = :idAfp"),
    @NamedQuery(name = "Afp.findByAfp", query = "SELECT a FROM Afp a WHERE a.afp = :afp"),
    @NamedQuery(name = "Afp.findByMostrar", query = "SELECT a FROM Afp a WHERE a.mostrar = :mostrar")})
public class Afp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "ID_AFP", nullable = false)
    private Integer idAfp;
    @Size(max = 2147483647)
    @Column(name = "AFP", length = 2147483647)
    private String afp;
    @Column(name = "MOSTRAR")
    private Integer mostrar;
    @OneToMany(mappedBy = "idTipoAfp", fetch = FetchType.LAZY)
    private List<Personal> personalList;
    @OneToMany(mappedBy = "idAfp", fetch = FetchType.LAZY)
    private List<Comisiones> comisionesList;

    public Afp() {
    }

    public Afp(Integer idAfp) {
        this.idAfp = idAfp;
    }

    public Integer getIdAfp() {
        return idAfp;
    }

    public void setIdAfp(Integer idAfp) {
        this.idAfp = idAfp;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
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

    public List<Comisiones> getComisionesList() {
        return comisionesList;
    }

    public void setComisionesList(List<Comisiones> comisionesList) {
        this.comisionesList = comisionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAfp != null ? idAfp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Afp)) {
            return false;
        }
        Afp other = (Afp) object;
        if ((this.idAfp == null && other.idAfp != null) || (this.idAfp != null && !this.idAfp.equals(other.idAfp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.Afp[ idAfp=" + idAfp + " ]";
    }
    
}
