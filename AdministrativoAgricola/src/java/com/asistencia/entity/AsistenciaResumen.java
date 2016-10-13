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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "asistencia_resumen", schema = "asistencia")
@NamedQueries({
    @NamedQuery(name = "AsistenciaResumen.findAll", query = "SELECT a FROM AsistenciaResumen a"),
    @NamedQuery(name = "AsistenciaResumen.findByFecha", query = "SELECT a FROM AsistenciaResumen a WHERE a.asistenciaResumenPK.fecha = :fecha"),
    @NamedQuery(name = "AsistenciaResumen.findByObservacion", query = "SELECT a FROM AsistenciaResumen a WHERE a.observacion = :observacion"),
    @NamedQuery(name = "AsistenciaResumen.findByHorasOrdinarias", query = "SELECT a FROM AsistenciaResumen a WHERE a.horasOrdinarias = :horasOrdinarias"),
    @NamedQuery(name = "AsistenciaResumen.findByHorasNocturnas", query = "SELECT a FROM AsistenciaResumen a WHERE a.horasNocturnas = :horasNocturnas"),
    @NamedQuery(name = "AsistenciaResumen.findByHorasExtra25", query = "SELECT a FROM AsistenciaResumen a WHERE a.horasExtra25 = :horasExtra25"),
    @NamedQuery(name = "AsistenciaResumen.findByHorasExtra35", query = "SELECT a FROM AsistenciaResumen a WHERE a.horasExtra35 = :horasExtra35"),
    @NamedQuery(name = "AsistenciaResumen.findByDominical", query = "SELECT a FROM AsistenciaResumen a WHERE a.dominical = :dominical"),
    @NamedQuery(name = "AsistenciaResumen.findByAnio", query = "SELECT a FROM AsistenciaResumen a WHERE a.anio = :anio"),
    @NamedQuery(name = "AsistenciaResumen.findByMes", query = "SELECT a FROM AsistenciaResumen a WHERE a.mes = :mes"),
    @NamedQuery(name = "AsistenciaResumen.findByNombres", query = "SELECT a FROM AsistenciaResumen a WHERE a.nombres = :nombres"),
    @NamedQuery(name = "AsistenciaResumen.findByFeriado", query = "SELECT a FROM AsistenciaResumen a WHERE a.feriado = :feriado"),
    @NamedQuery(name = "AsistenciaResumen.findByM1", query = "SELECT a FROM AsistenciaResumen a WHERE a.m1 = :m1"),
    @NamedQuery(name = "AsistenciaResumen.findByM2", query = "SELECT a FROM AsistenciaResumen a WHERE a.m2 = :m2"),
    @NamedQuery(name = "AsistenciaResumen.findByM3", query = "SELECT a FROM AsistenciaResumen a WHERE a.m3 = :m3"),
    @NamedQuery(name = "AsistenciaResumen.findByM4", query = "SELECT a FROM AsistenciaResumen a WHERE a.m4 = :m4"),
    @NamedQuery(name = "AsistenciaResumen.findByM5", query = "SELECT a FROM AsistenciaResumen a WHERE a.m5 = :m5"),
    @NamedQuery(name = "AsistenciaResumen.findByM6", query = "SELECT a FROM AsistenciaResumen a WHERE a.m6 = :m6"),
    @NamedQuery(name = "AsistenciaResumen.findByIdEmpresa", query = "SELECT a FROM AsistenciaResumen a WHERE a.asistenciaResumenPK.idEmpresa = :idEmpresa"),
    @NamedQuery(name = "AsistenciaResumen.findByIdDocumento", query = "SELECT a FROM AsistenciaResumen a WHERE a.idDocumento = :idDocumento"),
    @NamedQuery(name = "AsistenciaResumen.findByIdTrabajador", query = "SELECT a FROM AsistenciaResumen a WHERE a.asistenciaResumenPK.idTrabajador = :idTrabajador")})
public class AsistenciaResumen implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AsistenciaResumenPK asistenciaResumenPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "observacion", nullable = false, length = 100)
    private String observacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "horas_ordinarias", nullable = false, precision = 14, scale = 2)
    private BigDecimal horasOrdinarias;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horas_nocturnas", nullable = false, precision = 14, scale = 2)
    private BigDecimal horasNocturnas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horas_extra_25", nullable = false, precision = 14, scale = 2)
    private BigDecimal horasExtra25;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horas_extra_35", nullable = false, precision = 14, scale = 2)
    private BigDecimal horasExtra35;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dominical", nullable = false)
    private boolean dominical;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "anio", nullable = false, length = 4)
    private String anio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "mes", nullable = false, length = 2)
    private String mes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombres", nullable = false, length = 100)
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Column(name = "feriado", nullable = false)
    private boolean feriado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "m1", nullable = false, length = 5)
    private String m1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "m2", nullable = false, length = 5)
    private String m2;
    @Size(max = 5)
    @Column(name = "m3", length = 5)
    private String m3;
    @Size(max = 5)
    @Column(name = "m4", length = 5)
    private String m4;
    @Size(max = 5)
    @Column(name = "m5", length = 5)
    private String m5;
    @Size(max = 5)
    @Column(name = "m6", length = 5)
    private String m6;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "id_documento", nullable = false, length = 15)
    private String idDocumento;
    @JoinColumn(name = "id_trabajador", referencedColumnName = "id_trabajador", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Trabajador trabajador;
    @JoinColumn(name = "id_papeleta", referencedColumnName = "id_papeleta")
    @ManyToOne(fetch = FetchType.LAZY)
    private PapeletaSalida idPapeleta;
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresa empresa;

    public AsistenciaResumen() {
    }

    public AsistenciaResumen(AsistenciaResumenPK asistenciaResumenPK) {
        this.asistenciaResumenPK = asistenciaResumenPK;
    }

    public AsistenciaResumen(AsistenciaResumenPK asistenciaResumenPK, String observacion, BigDecimal horasOrdinarias, BigDecimal horasNocturnas, BigDecimal horasExtra25, BigDecimal horasExtra35, boolean dominical, String anio, String mes, String nombres, boolean feriado, String m1, String m2, String idDocumento) {
        this.asistenciaResumenPK = asistenciaResumenPK;
        this.observacion = observacion;
        this.horasOrdinarias = horasOrdinarias;
        this.horasNocturnas = horasNocturnas;
        this.horasExtra25 = horasExtra25;
        this.horasExtra35 = horasExtra35;
        this.dominical = dominical;
        this.anio = anio;
        this.mes = mes;
        this.nombres = nombres;
        this.feriado = feriado;
        this.m1 = m1;
        this.m2 = m2;
        this.idDocumento = idDocumento;
    }

    public AsistenciaResumen(String fecha, String idEmpresa, long idTrabajador) {
        this.asistenciaResumenPK = new AsistenciaResumenPK(fecha, idEmpresa, idTrabajador);
    }

    public AsistenciaResumenPK getAsistenciaResumenPK() {
        return asistenciaResumenPK;
    }

    public void setAsistenciaResumenPK(AsistenciaResumenPK asistenciaResumenPK) {
        this.asistenciaResumenPK = asistenciaResumenPK;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigDecimal getHorasOrdinarias() {
        return horasOrdinarias;
    }

    public void setHorasOrdinarias(BigDecimal horasOrdinarias) {
        this.horasOrdinarias = horasOrdinarias;
    }

    public BigDecimal getHorasNocturnas() {
        return horasNocturnas;
    }

    public void setHorasNocturnas(BigDecimal horasNocturnas) {
        this.horasNocturnas = horasNocturnas;
    }

    public BigDecimal getHorasExtra25() {
        return horasExtra25;
    }

    public void setHorasExtra25(BigDecimal horasExtra25) {
        this.horasExtra25 = horasExtra25;
    }

    public BigDecimal getHorasExtra35() {
        return horasExtra35;
    }

    public void setHorasExtra35(BigDecimal horasExtra35) {
        this.horasExtra35 = horasExtra35;
    }

    public boolean getDominical() {
        return dominical;
    }

    public void setDominical(boolean dominical) {
        this.dominical = dominical;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public boolean getFeriado() {
        return feriado;
    }

    public void setFeriado(boolean feriado) {
        this.feriado = feriado;
    }

    public String getM1() {
        return m1;
    }

    public void setM1(String m1) {
        this.m1 = m1;
    }

    public String getM2() {
        return m2;
    }

    public void setM2(String m2) {
        this.m2 = m2;
    }

    public String getM3() {
        return m3;
    }

    public void setM3(String m3) {
        this.m3 = m3;
    }

    public String getM4() {
        return m4;
    }

    public void setM4(String m4) {
        this.m4 = m4;
    }

    public String getM5() {
        return m5;
    }

    public void setM5(String m5) {
        this.m5 = m5;
    }

    public String getM6() {
        return m6;
    }

    public void setM6(String m6) {
        this.m6 = m6;
    }

    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public PapeletaSalida getIdPapeleta() {
        return idPapeleta;
    }

    public void setIdPapeleta(PapeletaSalida idPapeleta) {
        this.idPapeleta = idPapeleta;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (asistenciaResumenPK != null ? asistenciaResumenPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsistenciaResumen)) {
            return false;
        }
        AsistenciaResumen other = (AsistenciaResumen) object;
        if ((this.asistenciaResumenPK == null && other.asistenciaResumenPK != null) || (this.asistenciaResumenPK != null && !this.asistenciaResumenPK.equals(other.asistenciaResumenPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.AsistenciaResumen[ asistenciaResumenPK=" + asistenciaResumenPK + " ]";
    }
    
}
