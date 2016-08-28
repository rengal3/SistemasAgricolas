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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "COMISIONES", catalog = "AsistenciaAgricola", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Comisiones.findAll", query = "SELECT c FROM Comisiones c"),
    @NamedQuery(name = "Comisiones.findByIdComision", query = "SELECT c FROM Comisiones c WHERE c.idComision = :idComision"),
    @NamedQuery(name = "Comisiones.findByNombre", query = "SELECT c FROM Comisiones c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Comisiones.findByComision", query = "SELECT c FROM Comisiones c WHERE c.comision = :comision"),
    @NamedQuery(name = "Comisiones.findByPrima", query = "SELECT c FROM Comisiones c WHERE c.prima = :prima"),
    @NamedQuery(name = "Comisiones.findByAporteObligatorio", query = "SELECT c FROM Comisiones c WHERE c.aporteObligatorio = :aporteObligatorio"),
    @NamedQuery(name = "Comisiones.findByPorcentajeTotal", query = "SELECT c FROM Comisiones c WHERE c.porcentajeTotal = :porcentajeTotal"),
    @NamedQuery(name = "Comisiones.findByMostrar", query = "SELECT c FROM Comisiones c WHERE c.mostrar = :mostrar")})
public class Comisiones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "ID_COMISION", nullable = false)
    private Integer idComision;
    @Size(max = 2147483647)
    @Column(name = "NOMBRE", length = 2147483647)
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COMISION", precision = 19, scale = 4)
    private BigDecimal comision;
    @Column(name = "PRIMA", precision = 19, scale = 4)
    private BigDecimal prima;
    @Column(name = "APORTE_OBLIGATORIO", precision = 19, scale = 4)
    private BigDecimal aporteObligatorio;
    @Column(name = "PORCENTAJE_TOTAL", precision = 19, scale = 4)
    private BigDecimal porcentajeTotal;
    @Column(name = "MOSTRAR")
    private Integer mostrar;
    @OneToMany(mappedBy = "idComision", fetch = FetchType.LAZY)
    private List<Personal> personalList;
    @JoinColumn(name = "ID_AFP", referencedColumnName = "ID_AFP")
    @ManyToOne(fetch = FetchType.LAZY)
    private Afp idAfp;

    public Comisiones() {
    }

    public Comisiones(Integer idComision) {
        this.idComision = idComision;
    }

    public Integer getIdComision() {
        return idComision;
    }

    public void setIdComision(Integer idComision) {
        this.idComision = idComision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getComision() {
        return comision;
    }

    public void setComision(BigDecimal comision) {
        this.comision = comision;
    }

    public BigDecimal getPrima() {
        return prima;
    }

    public void setPrima(BigDecimal prima) {
        this.prima = prima;
    }

    public BigDecimal getAporteObligatorio() {
        return aporteObligatorio;
    }

    public void setAporteObligatorio(BigDecimal aporteObligatorio) {
        this.aporteObligatorio = aporteObligatorio;
    }

    public BigDecimal getPorcentajeTotal() {
        return porcentajeTotal;
    }

    public void setPorcentajeTotal(BigDecimal porcentajeTotal) {
        this.porcentajeTotal = porcentajeTotal;
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

    public Afp getIdAfp() {
        return idAfp;
    }

    public void setIdAfp(Afp idAfp) {
        this.idAfp = idAfp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComision != null ? idComision.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comisiones)) {
            return false;
        }
        Comisiones other = (Comisiones) object;
        if ((this.idComision == null && other.idComision != null) || (this.idComision != null && !this.idComision.equals(other.idComision))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.Comisiones[ idComision=" + idComision + " ]";
    }
    
}
