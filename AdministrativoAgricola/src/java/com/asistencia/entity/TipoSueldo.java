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
@Table(name = "tipo_sueldo")
@NamedQueries({
    @NamedQuery(name = "TipoSueldo.findAll", query = "SELECT t FROM TipoSueldo t"),
    @NamedQuery(name = "TipoSueldo.findByIdTipoSueldo", query = "SELECT t FROM TipoSueldo t WHERE t.idTipoSueldo = :idTipoSueldo"),
    @NamedQuery(name = "TipoSueldo.findBySueldo", query = "SELECT t FROM TipoSueldo t WHERE t.sueldo = :sueldo"),
    @NamedQuery(name = "TipoSueldo.findByImporte", query = "SELECT t FROM TipoSueldo t WHERE t.importe = :importe"),
    @NamedQuery(name = "TipoSueldo.findByMostrar", query = "SELECT t FROM TipoSueldo t WHERE t.mostrar = :mostrar")})
public class TipoSueldo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "ID_TIPO_SUELDO", nullable = false)
    private Integer idTipoSueldo;
    @Size(max = 10485760)
    @Column(name = "SUELDO", length = 10485760)
    private String sueldo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "IMPORTE", precision = 19, scale = 4)
    private BigDecimal importe;
    @Column(name = "MOSTRAR")
    private Integer mostrar;
    @OneToMany(mappedBy = "tipoSueldo", fetch = FetchType.LAZY)
    private List<Personal> personalList;

    public TipoSueldo() {
    }

    public TipoSueldo(Integer idTipoSueldo) {
        this.idTipoSueldo = idTipoSueldo;
    }

    public Integer getIdTipoSueldo() {
        return idTipoSueldo;
    }

    public void setIdTipoSueldo(Integer idTipoSueldo) {
        this.idTipoSueldo = idTipoSueldo;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
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
        hash += (idTipoSueldo != null ? idTipoSueldo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoSueldo)) {
            return false;
        }
        TipoSueldo other = (TipoSueldo) object;
        if ((this.idTipoSueldo == null && other.idTipoSueldo != null) || (this.idTipoSueldo != null && !this.idTipoSueldo.equals(other.idTipoSueldo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.TipoSueldo[ idTipoSueldo=" + idTipoSueldo + " ]";
    }
    
}
