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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "horarios", schema = "asistencia")
@NamedQueries({
    @NamedQuery(name = "Horarios.findAll", query = "SELECT h FROM Horarios h"),
    @NamedQuery(name = "Horarios.findByIdHorario", query = "SELECT h FROM Horarios h WHERE h.idHorario = :idHorario"),
    @NamedQuery(name = "Horarios.findByDescHorario", query = "SELECT h FROM Horarios h WHERE h.descHorario = :descHorario"),
    @NamedQuery(name = "Horarios.findByM1", query = "SELECT h FROM Horarios h WHERE h.m1 = :m1"),
    @NamedQuery(name = "Horarios.findByM2", query = "SELECT h FROM Horarios h WHERE h.m2 = :m2"),
    @NamedQuery(name = "Horarios.findByM3", query = "SELECT h FROM Horarios h WHERE h.m3 = :m3"),
    @NamedQuery(name = "Horarios.findByM4", query = "SELECT h FROM Horarios h WHERE h.m4 = :m4"),
    @NamedQuery(name = "Horarios.findByM5", query = "SELECT h FROM Horarios h WHERE h.m5 = :m5"),
    @NamedQuery(name = "Horarios.findByM6", query = "SELECT h FROM Horarios h WHERE h.m6 = :m6"),
    @NamedQuery(name = "Horarios.findByHorasTotales", query = "SELECT h FROM Horarios h WHERE h.horasTotales = :horasTotales"),
    @NamedQuery(name = "Horarios.findByHorasDescontar", query = "SELECT h FROM Horarios h WHERE h.horasDescontar = :horasDescontar"),
    @NamedQuery(name = "Horarios.findByGeneraHextra", query = "SELECT h FROM Horarios h WHERE h.generaHextra = :generaHextra"),
    @NamedQuery(name = "Horarios.findByGeneraHnocturna", query = "SELECT h FROM Horarios h WHERE h.generaHnocturna = :generaHnocturna")})
public class Horarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_horario", nullable = false)
    private Integer idHorario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "desc_horario", nullable = false, length = 100)
    private String descHorario;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "horas_totales", nullable = false, precision = 14, scale = 2)
    private BigDecimal horasTotales;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horas_descontar", nullable = false, precision = 14, scale = 2)
    private BigDecimal horasDescontar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "genera_hextra", nullable = false)
    private boolean generaHextra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "genera_hnocturna", nullable = false)
    private boolean generaHnocturna;
    @JoinTable(name = "asistencia.detalle_horario_tipotrabajador", joinColumns = {
        @JoinColumn(name = "id_horario", referencedColumnName = "id_horario", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "id_tipo_trabajador", referencedColumnName = "id_tabla_tipo", nullable = false)})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Tipo> tipoList;
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresa idEmpresa;

    public Horarios() {
    }

    public Horarios(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Horarios(Integer idHorario, String descHorario, String m1, String m2, BigDecimal horasTotales, BigDecimal horasDescontar, boolean generaHextra, boolean generaHnocturna) {
        this.idHorario = idHorario;
        this.descHorario = descHorario;
        this.m1 = m1;
        this.m2 = m2;
        this.horasTotales = horasTotales;
        this.horasDescontar = horasDescontar;
        this.generaHextra = generaHextra;
        this.generaHnocturna = generaHnocturna;
    }

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public String getDescHorario() {
        return descHorario;
    }

    public void setDescHorario(String descHorario) {
        this.descHorario = descHorario;
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

    public BigDecimal getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(BigDecimal horasTotales) {
        this.horasTotales = horasTotales;
    }

    public BigDecimal getHorasDescontar() {
        return horasDescontar;
    }

    public void setHorasDescontar(BigDecimal horasDescontar) {
        this.horasDescontar = horasDescontar;
    }

    public boolean getGeneraHextra() {
        return generaHextra;
    }

    public void setGeneraHextra(boolean generaHextra) {
        this.generaHextra = generaHextra;
    }

    public boolean getGeneraHnocturna() {
        return generaHnocturna;
    }

    public void setGeneraHnocturna(boolean generaHnocturna) {
        this.generaHnocturna = generaHnocturna;
    }

    public List<Tipo> getTipoList() {
        return tipoList;
    }

    public void setTipoList(List<Tipo> tipoList) {
        this.tipoList = tipoList;
    }

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHorario != null ? idHorario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horarios)) {
            return false;
        }
        Horarios other = (Horarios) object;
        if ((this.idHorario == null && other.idHorario != null) || (this.idHorario != null && !this.idHorario.equals(other.idHorario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.Horarios[ idHorario=" + idHorario + " ]";
    }
    
}
