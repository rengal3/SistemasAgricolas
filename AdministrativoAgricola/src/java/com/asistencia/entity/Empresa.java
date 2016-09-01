/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.asistencia.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Diana
 */
@Entity
@Table(name = "EMPRESA")
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e"),
    @NamedQuery(name = "Empresa.findByRuc", query = "SELECT e FROM Empresa e WHERE e.ruc = :ruc"),
    @NamedQuery(name = "Empresa.findByRazonSocial", query = "SELECT e FROM Empresa e WHERE e.razonSocial = :razonSocial"),
    @NamedQuery(name = "Empresa.findByDescDireccion", query = "SELECT e FROM Empresa e WHERE e.descDireccion = :descDireccion"),
    @NamedQuery(name = "Empresa.findByIdEmpresa", query = "SELECT e FROM Empresa e WHERE e.idEmpresa = :idEmpresa")})
public class Empresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ruc")
    private String ruc;
    @Basic(optional = false)
    @Column(name = "razon_social")
    private String razonSocial;
    @Lob
    @Column(name = "logo")
    private byte[] logo;
    @Basic(optional = false)
    @Column(name = "desc_direccion")
    private String descDireccion;
    @Id
    @Basic(optional = false)
    @Column(name = "id_empresa")
    private String idEmpresa;
    
    

    @Column(name = "principal")
    private boolean principal;

    public Empresa() {
    }

    public Empresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Empresa(String idEmpresa, String ruc, String razonSocial, String descDireccion) {
        this.idEmpresa = idEmpresa;
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.descDireccion = descDireccion;
    }

    public boolean isPrincipal() {
        return principal;
    }

    public void setPrincipal(boolean principal) {
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

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresa != null ? idEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

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
        return "suministros.ejb30.entity.Empresa[idEmpresa=" + idEmpresa + "]";
    }

}
