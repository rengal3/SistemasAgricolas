/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Renato
 */
@Embeddable
public class AsistenciaResumenPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "fecha", nullable = false, length = 10)
    private String fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "id_empresa", nullable = false, length = 3)
    private String idEmpresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_trabajador", nullable = false)
    private long idTrabajador;

    public AsistenciaResumenPK() {
    }

    public AsistenciaResumenPK(String fecha, String idEmpresa, long idTrabajador) {
        this.fecha = fecha;
        this.idEmpresa = idEmpresa;
        this.idTrabajador = idTrabajador;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public long getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(long idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fecha != null ? fecha.hashCode() : 0);
        hash += (idEmpresa != null ? idEmpresa.hashCode() : 0);
        hash += (int) idTrabajador;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsistenciaResumenPK)) {
            return false;
        }
        AsistenciaResumenPK other = (AsistenciaResumenPK) object;
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        if ((this.idEmpresa == null && other.idEmpresa != null) || (this.idEmpresa != null && !this.idEmpresa.equals(other.idEmpresa))) {
            return false;
        }
        if (this.idTrabajador != other.idTrabajador) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.AsistenciaResumenPK[ fecha=" + fecha + ", idEmpresa=" + idEmpresa + ", idTrabajador=" + idTrabajador + " ]";
    }
    
}
