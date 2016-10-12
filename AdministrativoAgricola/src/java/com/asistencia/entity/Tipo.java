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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
@Table(name = "tipo", catalog = "Asistencia", schema = "asistencia")
@NamedQueries({
    @NamedQuery(name = "Tipo.findAll", query = "SELECT t FROM Tipo t"),
    @NamedQuery(name = "Tipo.findByIdTablaTipo", query = "SELECT t FROM Tipo t WHERE t.idTablaTipo = :idTablaTipo"),
    @NamedQuery(name = "Tipo.findByTabla", query = "SELECT t FROM Tipo t WHERE t.tabla = :tabla"),
    @NamedQuery(name = "Tipo.findByDescripcionCampo", query = "SELECT t FROM Tipo t WHERE t.descripcionCampo = :descripcionCampo"),
    @NamedQuery(name = "Tipo.findByCodigo", query = "SELECT t FROM Tipo t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "Tipo.findByDescripcionValor", query = "SELECT t FROM Tipo t WHERE t.descripcionValor = :descripcionValor"),
    @NamedQuery(name = "Tipo.findByCantidad", query = "SELECT t FROM Tipo t WHERE t.cantidad = :cantidad"),
    @NamedQuery(name = "Tipo.findByCodSunat", query = "SELECT t FROM Tipo t WHERE t.codSunat = :codSunat")})
public class Tipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tabla_tipo", nullable = false)
    private Integer idTablaTipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "tabla", nullable = false, length = 25)
    private String tabla;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "descripcion_campo", nullable = false, length = 25)
    private String descripcionCampo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "codigo", nullable = false, length = 10)
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "descripcion_valor", nullable = false, length = 100)
    private String descripcionValor;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad", precision = 14, scale = 2)
    private BigDecimal cantidad;
    @Size(max = 10)
    @Column(name = "cod_sunat", length = 10)
    private String codSunat;
    @ManyToMany(mappedBy = "tipoList", fetch = FetchType.LAZY)
    private List<Horarios> horariosList;
    @OneToMany(mappedBy = "idTipoSuspension", fetch = FetchType.LAZY)
    private List<PapeletaSalida> papeletaSalidaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoPapeleta", fetch = FetchType.LAZY)
    private List<PapeletaSalida> papeletaSalidaList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoRegimenLaboral", fetch = FetchType.LAZY)
    private List<Trabajador> trabajadorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoTrabajador", fetch = FetchType.LAZY)
    private List<Trabajador> trabajadorList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoCategoriaOcupacional", fetch = FetchType.LAZY)
    private List<Trabajador> trabajadorList2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoPago", fetch = FetchType.LAZY)
    private List<Trabajador> trabajadorList3;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoSituacion", fetch = FetchType.LAZY)
    private List<Trabajador> trabajadorList4;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoPeriodicidadRemuneracion", fetch = FetchType.LAZY)
    private List<Trabajador> trabajadorList5;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoContrato", fetch = FetchType.LAZY)
    private List<Trabajador> trabajadorList6;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoOcupacion", fetch = FetchType.LAZY)
    private List<Trabajador> trabajadorList7;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoEducacion", fetch = FetchType.LAZY)
    private List<Trabajador> trabajadorList8;
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresa idEmpresa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoActividad", fetch = FetchType.LAZY)
    private List<Empresa> empresaList;
    @OneToMany(mappedBy = "idTipoPaisEmisorDocumento", fetch = FetchType.LAZY)
    private List<Persona> personaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoNacionalidad", fetch = FetchType.LAZY)
    private List<Persona> personaList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoSexo", fetch = FetchType.LAZY)
    private List<Persona> personaList2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoDocumento", fetch = FetchType.LAZY)
    private List<Persona> personaList3;

    public Tipo() {
    }

    public Tipo(Integer idTablaTipo) {
        this.idTablaTipo = idTablaTipo;
    }

    public Tipo(Integer idTablaTipo, String tabla, String descripcionCampo, String codigo, String descripcionValor) {
        this.idTablaTipo = idTablaTipo;
        this.tabla = tabla;
        this.descripcionCampo = descripcionCampo;
        this.codigo = codigo;
        this.descripcionValor = descripcionValor;
    }

    public Integer getIdTablaTipo() {
        return idTablaTipo;
    }

    public void setIdTablaTipo(Integer idTablaTipo) {
        this.idTablaTipo = idTablaTipo;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getDescripcionCampo() {
        return descripcionCampo;
    }

    public void setDescripcionCampo(String descripcionCampo) {
        this.descripcionCampo = descripcionCampo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcionValor() {
        return descripcionValor;
    }

    public void setDescripcionValor(String descripcionValor) {
        this.descripcionValor = descripcionValor;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodSunat() {
        return codSunat;
    }

    public void setCodSunat(String codSunat) {
        this.codSunat = codSunat;
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

    public List<PapeletaSalida> getPapeletaSalidaList1() {
        return papeletaSalidaList1;
    }

    public void setPapeletaSalidaList1(List<PapeletaSalida> papeletaSalidaList1) {
        this.papeletaSalidaList1 = papeletaSalidaList1;
    }

    public List<Trabajador> getTrabajadorList() {
        return trabajadorList;
    }

    public void setTrabajadorList(List<Trabajador> trabajadorList) {
        this.trabajadorList = trabajadorList;
    }

    public List<Trabajador> getTrabajadorList1() {
        return trabajadorList1;
    }

    public void setTrabajadorList1(List<Trabajador> trabajadorList1) {
        this.trabajadorList1 = trabajadorList1;
    }

    public List<Trabajador> getTrabajadorList2() {
        return trabajadorList2;
    }

    public void setTrabajadorList2(List<Trabajador> trabajadorList2) {
        this.trabajadorList2 = trabajadorList2;
    }

    public List<Trabajador> getTrabajadorList3() {
        return trabajadorList3;
    }

    public void setTrabajadorList3(List<Trabajador> trabajadorList3) {
        this.trabajadorList3 = trabajadorList3;
    }

    public List<Trabajador> getTrabajadorList4() {
        return trabajadorList4;
    }

    public void setTrabajadorList4(List<Trabajador> trabajadorList4) {
        this.trabajadorList4 = trabajadorList4;
    }

    public List<Trabajador> getTrabajadorList5() {
        return trabajadorList5;
    }

    public void setTrabajadorList5(List<Trabajador> trabajadorList5) {
        this.trabajadorList5 = trabajadorList5;
    }

    public List<Trabajador> getTrabajadorList6() {
        return trabajadorList6;
    }

    public void setTrabajadorList6(List<Trabajador> trabajadorList6) {
        this.trabajadorList6 = trabajadorList6;
    }

    public List<Trabajador> getTrabajadorList7() {
        return trabajadorList7;
    }

    public void setTrabajadorList7(List<Trabajador> trabajadorList7) {
        this.trabajadorList7 = trabajadorList7;
    }

    public List<Trabajador> getTrabajadorList8() {
        return trabajadorList8;
    }

    public void setTrabajadorList8(List<Trabajador> trabajadorList8) {
        this.trabajadorList8 = trabajadorList8;
    }

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public List<Empresa> getEmpresaList() {
        return empresaList;
    }

    public void setEmpresaList(List<Empresa> empresaList) {
        this.empresaList = empresaList;
    }

    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }

    public List<Persona> getPersonaList1() {
        return personaList1;
    }

    public void setPersonaList1(List<Persona> personaList1) {
        this.personaList1 = personaList1;
    }

    public List<Persona> getPersonaList2() {
        return personaList2;
    }

    public void setPersonaList2(List<Persona> personaList2) {
        this.personaList2 = personaList2;
    }

    public List<Persona> getPersonaList3() {
        return personaList3;
    }

    public void setPersonaList3(List<Persona> personaList3) {
        this.personaList3 = personaList3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTablaTipo != null ? idTablaTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipo)) {
            return false;
        }
        Tipo other = (Tipo) object;
        if ((this.idTablaTipo == null && other.idTablaTipo != null) || (this.idTablaTipo != null && !this.idTablaTipo.equals(other.idTablaTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.Tipo[ idTablaTipo=" + idTablaTipo + " ]";
    }
    
}
