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
@Table(name = "empresa", catalog = "Asistencia", schema = "asistencia")
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e"),
    @NamedQuery(name = "Empresa.findByRuc", query = "SELECT e FROM Empresa e WHERE e.ruc = :ruc"),
    @NamedQuery(name = "Empresa.findByRazonSocial", query = "SELECT e FROM Empresa e WHERE e.razonSocial = :razonSocial"),
    @NamedQuery(name = "Empresa.findByDescDireccion", query = "SELECT e FROM Empresa e WHERE e.descDireccion = :descDireccion"),
    @NamedQuery(name = "Empresa.findByIdEmpresa", query = "SELECT e FROM Empresa e WHERE e.idEmpresa = :idEmpresa"),
    @NamedQuery(name = "Empresa.findByPrincipal", query = "SELECT e FROM Empresa e WHERE e.principal = :principal")})
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "ruc", nullable = false, length = 11)
    private String ruc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "razon_social", nullable = false, length = 100)
    private String razonSocial;
    @Lob
    @Column(name = "logo")
    private byte[] logo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "desc_direccion", nullable = false, length = 100)
    private String descDireccion;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "id_empresa", nullable = false, length = 3)
    private String idEmpresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "principal", nullable = false)
    private boolean principal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa", fetch = FetchType.LAZY)
    private List<Horarios> horariosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa", fetch = FetchType.LAZY)
    private List<PapeletaSalida> papeletaSalidaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa", fetch = FetchType.LAZY)
    private List<Trabajador> trabajadorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa", fetch = FetchType.LAZY)
    private List<Tipo> tipoList;
    @JoinColumn(name = "id_tipo_actividad", referencedColumnName = "id_tabla_tipo", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipo idTipoActividad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresa", fetch = FetchType.LAZY)
    private List<AsistenciaResumen> asistenciaResumenList;

    public Empresa() {
    }

    public Empresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Empresa(String idEmpresa, String ruc, String razonSocial, String descDireccion, boolean principal) {
        this.idEmpresa = idEmpresa;
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.descDireccion = descDireccion;
        this.principal = principal;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getDescDireccion() {
        return descDireccion;
    }

    public void setDescDireccion(String descDireccion) {
        this.descDireccion = descDireccion;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public boolean getPrincipal() {
        return principal;
    }

    public void setPrincipal(boolean principal) {
        this.principal = principal;
    }

    public List<Horarios> getHorariosList() {
        return horariosList;
    }

    public void setHorariosList(List<Horarios> horariosList) {
        this.horariosList = horariosList;
    }

    public List<PapeletaSalida> getPapeletaSalidaList() {
        return papeletaSalidaList;
    }

    public void setPapeletaSalidaList(List<PapeletaSalida> papeletaSalidaList) {
        this.papeletaSalidaList = papeletaSalidaList;
    }

    public List<Trabajador> getTrabajadorList() {
        return trabajadorList;
    }

    public void setTrabajadorList(List<Trabajador> trabajadorList) {
        this.trabajadorList = trabajadorList;
    }

    public List<Tipo> getTipoList() {
        return tipoList;
    }

    public void setTipoList(List<Tipo> tipoList) {
        this.tipoList = tipoList;
    }

    public Tipo getIdTipoActividad() {
        return idTipoActividad;
    }

    public void setIdTipoActividad(Tipo idTipoActividad) {
        this.idTipoActividad = idTipoActividad;
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
        hash += (idEmpresa != null ? idEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.idEmpresa == null && other.idEmpresa != null) || (this.idEmpresa != null && !this.idEmpresa.equals(other.idEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.Empresa[ idEmpresa=" + idEmpresa + " ]";
    }
    
}
