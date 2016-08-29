/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "admision")
@NamedQueries({
    @NamedQuery(name = "Admision.findAll", query = "SELECT a FROM Admision a"),
    @NamedQuery(name = "Admision.findByIdAdmision", query = "SELECT a FROM Admision a WHERE a.idAdmision = :idAdmision"),
    @NamedQuery(name = "Admision.findByFechaRegistro", query = "SELECT a FROM Admision a WHERE a.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "Admision.findByFechaIngreso", query = "SELECT a FROM Admision a WHERE a.fechaIngreso = :fechaIngreso"),
    @NamedQuery(name = "Admision.findBySemana", query = "SELECT a FROM Admision a WHERE a.semana = :semana"),
    @NamedQuery(name = "Admision.findByHIngreso", query = "SELECT a FROM Admision a WHERE a.hIngreso = :hIngreso"),
    @NamedQuery(name = "Admision.findByFechaSalida", query = "SELECT a FROM Admision a WHERE a.fechaSalida = :fechaSalida"),
    @NamedQuery(name = "Admision.findByHSalida", query = "SELECT a FROM Admision a WHERE a.hSalida = :hSalida"),
    @NamedQuery(name = "Admision.findByHoras", query = "SELECT a FROM Admision a WHERE a.horas = :horas"),
    @NamedQuery(name = "Admision.findByCerrado", query = "SELECT a FROM Admision a WHERE a.cerrado = :cerrado"),
    @NamedQuery(name = "Admision.findByPlanilla", query = "SELECT a FROM Admision a WHERE a.planilla = :planilla"),
    @NamedQuery(name = "Admision.findByRealizado", query = "SELECT a FROM Admision a WHERE a.realizado = :realizado"),
    @NamedQuery(name = "Admision.findByObservacion", query = "SELECT a FROM Admision a WHERE a.observacion = :observacion"),
    @NamedQuery(name = "Admision.findByModifico", query = "SELECT a FROM Admision a WHERE a.modifico = :modifico")})
public class Admision implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "ID_ADMISION", nullable = false)
    private Integer idAdmision;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "SEMANA")
    private Integer semana;
    @Size(max = 50)
    @Column(name = "H_INGRESO", length = 50)
    private String hIngreso;
    @Column(name = "FECHA_SALIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSalida;
    @Size(max = 50)
    @Column(name = "H_SALIDA", length = 50)
    private String hSalida;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HORAS", precision = 19, scale = 4)
    private BigDecimal horas;
    @Column(name = "CERRADO")
    private Integer cerrado;
    @Column(name = "PLANILLA")
    private Integer planilla;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REALIZADO", nullable = false)
    private int realizado;
    @Size(max = 10485760)
    @Column(name = "OBSERVACION", length = 10485760)
    private String observacion;
    @Size(max = 10485760)
    @Column(name = "MODIFICO", length = 10485760)
    private String modifico;
    @JoinColumn(name = "ID_PERSONAL", referencedColumnName = "ID_PERSONAL")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal idPersonal;
    @JoinColumn(name = "Id_Dia", referencedColumnName = "ID_DIA")
    @ManyToOne(fetch = FetchType.LAZY)
    private Dias idDia;
    @JoinColumn(name = "ID_TIPOS", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AdmisionTipos idTipos;

    public Admision() {
    }

    public Admision(Integer idAdmision) {
        this.idAdmision = idAdmision;
    }

    public Admision(Integer idAdmision, int realizado) {
        this.idAdmision = idAdmision;
        this.realizado = realizado;
    }

    public Integer getIdAdmision() {
        return idAdmision;
    }

    public void setIdAdmision(Integer idAdmision) {
        this.idAdmision = idAdmision;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Integer getSemana() {
        return semana;
    }

    public void setSemana(Integer semana) {
        this.semana = semana;
    }

    public String getHIngreso() {
        return hIngreso;
    }

    public void setHIngreso(String hIngreso) {
        this.hIngreso = hIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHSalida() {
        return hSalida;
    }

    public void setHSalida(String hSalida) {
        this.hSalida = hSalida;
    }

    public BigDecimal getHoras() {
        return horas;
    }

    public void setHoras(BigDecimal horas) {
        this.horas = horas;
    }

    public Integer getCerrado() {
        return cerrado;
    }

    public void setCerrado(Integer cerrado) {
        this.cerrado = cerrado;
    }

    public Integer getPlanilla() {
        return planilla;
    }

    public void setPlanilla(Integer planilla) {
        this.planilla = planilla;
    }

    public int getRealizado() {
        return realizado;
    }

    public void setRealizado(int realizado) {
        this.realizado = realizado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getModifico() {
        return modifico;
    }

    public void setModifico(String modifico) {
        this.modifico = modifico;
    }

    public Personal getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(Personal idPersonal) {
        this.idPersonal = idPersonal;
    }

    public Dias getIdDia() {
        return idDia;
    }

    public void setIdDia(Dias idDia) {
        this.idDia = idDia;
    }

    public AdmisionTipos getIdTipos() {
        return idTipos;
    }

    public void setIdTipos(AdmisionTipos idTipos) {
        this.idTipos = idTipos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdmision != null ? idAdmision.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admision)) {
            return false;
        }
        Admision other = (Admision) object;
        if ((this.idAdmision == null && other.idAdmision != null) || (this.idAdmision != null && !this.idAdmision.equals(other.idAdmision))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.Admision[ idAdmision=" + idAdmision + " ]";
    }
    
}
