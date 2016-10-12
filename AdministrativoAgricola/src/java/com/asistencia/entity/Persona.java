/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Renato
 */
@Entity
@Table(name = "persona", catalog = "Asistencia", schema = "asistencia")
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findByNumDocumento", query = "SELECT p FROM Persona p WHERE p.numDocumento = :numDocumento"),
    @NamedQuery(name = "Persona.findByApMaterno", query = "SELECT p FROM Persona p WHERE p.apMaterno = :apMaterno"),
    @NamedQuery(name = "Persona.findByApPaterno", query = "SELECT p FROM Persona p WHERE p.apPaterno = :apPaterno"),
    @NamedQuery(name = "Persona.findByNombres", query = "SELECT p FROM Persona p WHERE p.nombres = :nombres"),
    @NamedQuery(name = "Persona.findByFechaNacimiento", query = "SELECT p FROM Persona p WHERE p.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Persona.findByCorreo", query = "SELECT p FROM Persona p WHERE p.correo = :correo"),
    @NamedQuery(name = "Persona.findByIdPersona", query = "SELECT p FROM Persona p WHERE p.idPersona = :idPersona")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "num_documento", nullable = false, length = 15)
    private String numDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ap_materno", nullable = false, length = 40)
    private String apMaterno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ap_paterno", nullable = false, length = 40)
    private String apPaterno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nombres", nullable = false, length = 40)
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_nacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Size(max = 20)
    @Column(name = "correo", length = 20)
    private String correo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_persona", nullable = false)
    private Long idPersona;
    @OneToMany(mappedBy = "idPersona", fetch = FetchType.LAZY)
    private List<Trabajador> trabajadorList;
    @JoinColumn(name = "id_tipo_pais_emisor_documento", referencedColumnName = "id_tabla_tipo")
    @ManyToOne(fetch = FetchType.LAZY)
    private Tipo idTipoPaisEmisorDocumento;
    @JoinColumn(name = "id_tipo_nacionalidad", referencedColumnName = "id_tabla_tipo", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipo idTipoNacionalidad;
    @JoinColumn(name = "id_tipo_sexo", referencedColumnName = "id_tabla_tipo", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipo idTipoSexo;
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id_tabla_tipo", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipo idTipoDocumento;

    public Persona() {
    }

    public Persona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public Persona(Long idPersona, String numDocumento, String apMaterno, String apPaterno, String nombres, Date fechaNacimiento) {
        this.idPersona = idPersona;
        this.numDocumento = numDocumento;
        this.apMaterno = apMaterno;
        this.apPaterno = apPaterno;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public List<Trabajador> getTrabajadorList() {
        return trabajadorList;
    }

    public void setTrabajadorList(List<Trabajador> trabajadorList) {
        this.trabajadorList = trabajadorList;
    }

    public Tipo getIdTipoPaisEmisorDocumento() {
        return idTipoPaisEmisorDocumento;
    }

    public void setIdTipoPaisEmisorDocumento(Tipo idTipoPaisEmisorDocumento) {
        this.idTipoPaisEmisorDocumento = idTipoPaisEmisorDocumento;
    }

    public Tipo getIdTipoNacionalidad() {
        return idTipoNacionalidad;
    }

    public void setIdTipoNacionalidad(Tipo idTipoNacionalidad) {
        this.idTipoNacionalidad = idTipoNacionalidad;
    }

    public Tipo getIdTipoSexo() {
        return idTipoSexo;
    }

    public void setIdTipoSexo(Tipo idTipoSexo) {
        this.idTipoSexo = idTipoSexo;
    }

    public Tipo getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Tipo idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.Persona[ idPersona=" + idPersona + " ]";
    }
    
}
