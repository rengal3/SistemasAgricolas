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
@Table(name = "papeleta_salida", schema = "asistencia")
@NamedQueries({
    @NamedQuery(name = "PapeletaSalida.findAll", query = "SELECT p FROM PapeletaSalida p"),
    @NamedQuery(name = "PapeletaSalida.findByIdPapeleta", query = "SELECT p FROM PapeletaSalida p WHERE p.idPapeleta = :idPapeleta"),
    @NamedQuery(name = "PapeletaSalida.findByFechaInicio", query = "SELECT p FROM PapeletaSalida p WHERE p.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "PapeletaSalida.findByFechaFin", query = "SELECT p FROM PapeletaSalida p WHERE p.fechaFin = :fechaFin"),
    @NamedQuery(name = "PapeletaSalida.findByHoraInicio", query = "SELECT p FROM PapeletaSalida p WHERE p.horaInicio = :horaInicio"),
    @NamedQuery(name = "PapeletaSalida.findByHoraFin", query = "SELECT p FROM PapeletaSalida p WHERE p.horaFin = :horaFin"),
    @NamedQuery(name = "PapeletaSalida.findByObservacion", query = "SELECT p FROM PapeletaSalida p WHERE p.observacion = :observacion")})
public class PapeletaSalida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_papeleta", nullable = false)
    private Integer idPapeleta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "fecha_inicio", nullable = false, length = 10)
    private String fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "fecha_fin", nullable = false, length = 10)
    private String fechaFin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "hora_inicio", nullable = false, length = 5)
    private String horaInicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "hora_fin", nullable = false, length = 5)
    private String horaFin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "observacion", nullable = false, length = 100)
    private String observacion;
    @JoinColumn(name = "id_trabajador", referencedColumnName = "id_trabajador", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Trabajador idTrabajador;
    @JoinColumn(name = "id_tipo_suspension", referencedColumnName = "id_tabla_tipo")
    @ManyToOne(fetch = FetchType.LAZY)
    private Tipo idTipoSuspension;
    @JoinColumn(name = "id_tipo_papeleta", referencedColumnName = "id_tabla_tipo", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipo idTipoPapeleta;
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresa idEmpresa;
    @OneToMany(mappedBy = "idPapeleta", fetch = FetchType.LAZY)
    private List<AsistenciaResumen> asistenciaResumenList;

    public PapeletaSalida() {
    }

    public PapeletaSalida(Integer idPapeleta) {
        this.idPapeleta = idPapeleta;
    }

    public PapeletaSalida(Integer idPapeleta, String fechaInicio, String fechaFin, String horaInicio, String horaFin, String observacion) {
        this.idPapeleta = idPapeleta;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.observacion = observacion;
    }

    public Integer getIdPapeleta() {
        return idPapeleta;
    }

    public void setIdPapeleta(Integer idPapeleta) {
        this.idPapeleta = idPapeleta;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Trabajador getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(Trabajador idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public Tipo getIdTipoSuspension() {
        return idTipoSuspension;
    }

    public void setIdTipoSuspension(Tipo idTipoSuspension) {
        this.idTipoSuspension = idTipoSuspension;
    }

    public Tipo getIdTipoPapeleta() {
        return idTipoPapeleta;
    }

    public void setIdTipoPapeleta(Tipo idTipoPapeleta) {
        this.idTipoPapeleta = idTipoPapeleta;
    }

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public List<AsistenciaResumen> getAsistenciaResumenList() {
        return asistenciaResumenList;
    }

    public void setAsistenciaResumenList(List<AsistenciaResumen> asistenciaResumenList) {
        this.asistenciaResumenList = asistenciaResumenList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPapeleta != null ? idPapeleta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PapeletaSalida)) {
            return false;
        }
        PapeletaSalida other = (PapeletaSalida) object;
        if ((this.idPapeleta == null && other.idPapeleta != null) || (this.idPapeleta != null && !this.idPapeleta.equals(other.idPapeleta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.PapeletaSalida[ idPapeleta=" + idPapeleta + " ]";
    }
    
}
