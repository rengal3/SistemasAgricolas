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
@Table(name = "PERSONAL_ESTADO_CIVIL", catalog = "AsistenciaAgricola", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "PersonalEstadoCivil.findAll", query = "SELECT p FROM PersonalEstadoCivil p"),
    @NamedQuery(name = "PersonalEstadoCivil.findById", query = "SELECT p FROM PersonalEstadoCivil p WHERE p.id = :id"),
    @NamedQuery(name = "PersonalEstadoCivil.findByEstadoCivil", query = "SELECT p FROM PersonalEstadoCivil p WHERE p.estadoCivil = :estadoCivil"),
    @NamedQuery(name = "PersonalEstadoCivil.findByMostrar", query = "SELECT p FROM PersonalEstadoCivil p WHERE p.mostrar = :mostrar")})
public class PersonalEstadoCivil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Size(max = 50)
    @Column(name = "ESTADO_CIVIL", length = 50)
    private String estadoCivil;
    @Column(name = "MOSTRAR")
    private Integer mostrar;
    @OneToMany(mappedBy = "idEstadoCivil", fetch = FetchType.LAZY)
    private List<Personal> personalList;

    public PersonalEstadoCivil() {
    }

    public PersonalEstadoCivil(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonalEstadoCivil)) {
            return false;
        }
        PersonalEstadoCivil other = (PersonalEstadoCivil) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.PersonalEstadoCivil[ id=" + id + " ]";
    }
    
}
