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
@Table(name = "HIJOS", catalog = "AsistenciaAgricola", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Hijos.findAll", query = "SELECT h FROM Hijos h"),
    @NamedQuery(name = "Hijos.findByIdHijo", query = "SELECT h FROM Hijos h WHERE h.idHijo = :idHijo"),
    @NamedQuery(name = "Hijos.findByDni", query = "SELECT h FROM Hijos h WHERE h.dni = :dni"),
    @NamedQuery(name = "Hijos.findByHijo", query = "SELECT h FROM Hijos h WHERE h.hijo = :hijo"),
    @NamedQuery(name = "Hijos.findByFNacimiento", query = "SELECT h FROM Hijos h WHERE h.fNacimiento = :fNacimiento"),
    @NamedQuery(name = "Hijos.findByEdad", query = "SELECT h FROM Hijos h WHERE h.edad = :edad"),
    @NamedQuery(name = "Hijos.findBySexo", query = "SELECT h FROM Hijos h WHERE h.sexo = :sexo")})
public class Hijos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "ID_HIJO", nullable = false)
    private Integer idHijo;
    @Size(max = 50)
    @Column(name = "DNI", length = 50)
    private String dni;
    @Size(max = 2147483647)
    @Column(name = "HIJO", length = 2147483647)
    private String hijo;
    @Column(name = "F_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fNacimiento;
    @Column(name = "EDAD")
    private Integer edad;
    @Size(max = 10)
    @Column(name = "SEXO", length = 10)
    private String sexo;
    @JoinColumn(name = "ID_PERSONAL", referencedColumnName = "ID_PERSONAL")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal idPersonal;

    public Hijos() {
    }

    public Hijos(Integer idHijo) {
        this.idHijo = idHijo;
    }

    public Integer getIdHijo() {
        return idHijo;
    }

    public void setIdHijo(Integer idHijo) {
        this.idHijo = idHijo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getHijo() {
        return hijo;
    }

    public void setHijo(String hijo) {
        this.hijo = hijo;
    }

    public Date getFNacimiento() {
        return fNacimiento;
    }

    public void setFNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
        hash += (idHijo != null ? idHijo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hijos)) {
            return false;
        }
        Hijos other = (Hijos) object;
        if ((this.idHijo == null && other.idHijo != null) || (this.idHijo != null && !this.idHijo.equals(other.idHijo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.Hijos[ idHijo=" + idHijo + " ]";
    }
    
}
