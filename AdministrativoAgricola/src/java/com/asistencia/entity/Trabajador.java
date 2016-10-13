/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "trabajador", schema = "asistencia")
@NamedQueries({
    @NamedQuery(name = "Trabajador.findAll", query = "SELECT t FROM Trabajador t"),
    @NamedQuery(name = "Trabajador.findByIdTipoDocumento", query = "SELECT t FROM Trabajador t WHERE t.idTipoDocumento = :idTipoDocumento"),
    @NamedQuery(name = "Trabajador.findByNumDocumento", query = "SELECT t FROM Trabajador t WHERE t.numDocumento = :numDocumento"),
    @NamedQuery(name = "Trabajador.findByDiscapacitado", query = "SELECT t FROM Trabajador t WHERE t.discapacitado = :discapacitado"),
    @NamedQuery(name = "Trabajador.findByCuspp", query = "SELECT t FROM Trabajador t WHERE t.cuspp = :cuspp"),
    @NamedQuery(name = "Trabajador.findBySindicalizado", query = "SELECT t FROM Trabajador t WHERE t.sindicalizado = :sindicalizado"),
    @NamedQuery(name = "Trabajador.findByIdTrabajador", query = "SELECT t FROM Trabajador t WHERE t.idTrabajador = :idTrabajador")})
public class Trabajador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tipo_documento", nullable = false)
    private int idTipoDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "num_documento", nullable = false, length = 15)
    private String numDocumento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "discapacitado", nullable = false)
    private boolean discapacitado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "cuspp", nullable = false, length = 12)
    private String cuspp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sindicalizado", nullable = false)
    private boolean sindicalizado;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_trabajador", nullable = false)
    private Long idTrabajador;
    @Lob
    @Column(name = "foto")
    private byte[] foto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTrabajador", fetch = FetchType.LAZY)
    private List<PapeletaSalida> papeletaSalidaList;
    @JoinColumn(name = "id_tipo_regimen_laboral", referencedColumnName = "id_tabla_tipo", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipo idTipoRegimenLaboral;
    @JoinColumn(name = "id_tipo_trabajador", referencedColumnName = "id_tabla_tipo", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipo idTipoTrabajador;
    @JoinColumn(name = "id_tipo_categoria_ocupacional", referencedColumnName = "id_tabla_tipo", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipo idTipoCategoriaOcupacional;
    @JoinColumn(name = "id_tipo_pago", referencedColumnName = "id_tabla_tipo", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipo idTipoPago;
    @JoinColumn(name = "id_tipo_situacion", referencedColumnName = "id_tabla_tipo", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipo idTipoSituacion;
    @JoinColumn(name = "id_tipo_periodicidad_remuneracion", referencedColumnName = "id_tabla_tipo", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipo idTipoPeriodicidadRemuneracion;
    @JoinColumn(name = "id_tipo_contrato", referencedColumnName = "id_tabla_tipo", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipo idTipoContrato;
    @JoinColumn(name = "id_tipo_ocupacion", referencedColumnName = "id_tabla_tipo", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipo idTipoOcupacion;
    @JoinColumn(name = "id_tipo_educacion", referencedColumnName = "id_tabla_tipo", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipo idTipoEducacion;
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @ManyToOne(fetch = FetchType.LAZY)
    private Persona idPersona;
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresa idEmpresa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "trabajador", fetch = FetchType.LAZY)
    private List<AsistenciaResumen> asistenciaResumenList;

    public Trabajador() {
    }

    public Trabajador(Long idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public Trabajador(Long idTrabajador, int idTipoDocumento, String numDocumento, boolean discapacitado, String cuspp, boolean sindicalizado) {
        this.idTrabajador = idTrabajador;
        this.idTipoDocumento = idTipoDocumento;
        this.numDocumento = numDocumento;
        this.discapacitado = discapacitado;
        this.cuspp = cuspp;
        this.sindicalizado = sindicalizado;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public boolean getDiscapacitado() {
        return discapacitado;
    }

    public void setDiscapacitado(boolean discapacitado) {
        this.discapacitado = discapacitado;
    }

    public String getCuspp() {
        return cuspp;
    }

    public void setCuspp(String cuspp) {
        this.cuspp = cuspp;
    }

    public boolean getSindicalizado() {
        return sindicalizado;
    }

    public void setSindicalizado(boolean sindicalizado) {
        this.sindicalizado = sindicalizado;
    }

    public Long getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(Long idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public List<PapeletaSalida> getPapeletaSalidaList() {
        return papeletaSalidaList;
    }

    public void setPapeletaSalidaList(List<PapeletaSalida> papeletaSalidaList) {
        this.papeletaSalidaList = papeletaSalidaList;
    }

    public Tipo getIdTipoRegimenLaboral() {
        return idTipoRegimenLaboral;
    }

    public void setIdTipoRegimenLaboral(Tipo idTipoRegimenLaboral) {
        this.idTipoRegimenLaboral = idTipoRegimenLaboral;
    }

    public Tipo getIdTipoTrabajador() {
        return idTipoTrabajador;
    }

    public void setIdTipoTrabajador(Tipo idTipoTrabajador) {
        this.idTipoTrabajador = idTipoTrabajador;
    }

    public Tipo getIdTipoCategoriaOcupacional() {
        return idTipoCategoriaOcupacional;
    }

    public void setIdTipoCategoriaOcupacional(Tipo idTipoCategoriaOcupacional) {
        this.idTipoCategoriaOcupacional = idTipoCategoriaOcupacional;
    }

    public Tipo getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(Tipo idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public Tipo getIdTipoSituacion() {
        return idTipoSituacion;
    }

    public void setIdTipoSituacion(Tipo idTipoSituacion) {
        this.idTipoSituacion = idTipoSituacion;
    }

    public Tipo getIdTipoPeriodicidadRemuneracion() {
        return idTipoPeriodicidadRemuneracion;
    }

    public void setIdTipoPeriodicidadRemuneracion(Tipo idTipoPeriodicidadRemuneracion) {
        this.idTipoPeriodicidadRemuneracion = idTipoPeriodicidadRemuneracion;
    }

    public Tipo getIdTipoContrato() {
        return idTipoContrato;
    }

    public void setIdTipoContrato(Tipo idTipoContrato) {
        this.idTipoContrato = idTipoContrato;
    }

    public Tipo getIdTipoOcupacion() {
        return idTipoOcupacion;
    }

    public void setIdTipoOcupacion(Tipo idTipoOcupacion) {
        this.idTipoOcupacion = idTipoOcupacion;
    }

    public Tipo getIdTipoEducacion() {
        return idTipoEducacion;
    }

    public void setIdTipoEducacion(Tipo idTipoEducacion) {
        this.idTipoEducacion = idTipoEducacion;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
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
        hash += (idTrabajador != null ? idTrabajador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trabajador)) {
            return false;
        }
        Trabajador other = (Trabajador) object;
        if ((this.idTrabajador == null && other.idTrabajador != null) || (this.idTrabajador != null && !this.idTrabajador.equals(other.idTrabajador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.Trabajador[ idTrabajador=" + idTrabajador + " ]";
    }
    
}
