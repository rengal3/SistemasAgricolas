/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.Lob;
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
@Table(name = "PERSONAL", catalog = "AsistenciaAgricola", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Personal.findAll", query = "SELECT p FROM Personal p"),
    @NamedQuery(name = "Personal.findByIdPersonal", query = "SELECT p FROM Personal p WHERE p.idPersonal = :idPersonal"),
    @NamedQuery(name = "Personal.findByDni", query = "SELECT p FROM Personal p WHERE p.dni = :dni"),
    @NamedQuery(name = "Personal.findByFechaNacimiento", query = "SELECT p FROM Personal p WHERE p.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Personal.findByEdad", query = "SELECT p FROM Personal p WHERE p.edad = :edad"),
    @NamedQuery(name = "Personal.findByNombres", query = "SELECT p FROM Personal p WHERE p.nombres = :nombres"),
    @NamedQuery(name = "Personal.findByAPaterno", query = "SELECT p FROM Personal p WHERE p.aPaterno = :aPaterno"),
    @NamedQuery(name = "Personal.findByAMaterno", query = "SELECT p FROM Personal p WHERE p.aMaterno = :aMaterno"),
    @NamedQuery(name = "Personal.findBySexo", query = "SELECT p FROM Personal p WHERE p.sexo = :sexo"),
    @NamedQuery(name = "Personal.findByDireccion", query = "SELECT p FROM Personal p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Personal.findByFijo", query = "SELECT p FROM Personal p WHERE p.fijo = :fijo"),
    @NamedQuery(name = "Personal.findByCelular", query = "SELECT p FROM Personal p WHERE p.celular = :celular"),
    @NamedQuery(name = "Personal.findByMail", query = "SELECT p FROM Personal p WHERE p.mail = :mail"),
    @NamedQuery(name = "Personal.findByFIngreso", query = "SELECT p FROM Personal p WHERE p.fIngreso = :fIngreso"),
    @NamedQuery(name = "Personal.findByCantidad", query = "SELECT p FROM Personal p WHERE p.cantidad = :cantidad"),
    @NamedQuery(name = "Personal.findByNHijos", query = "SELECT p FROM Personal p WHERE p.nHijos = :nHijos"),
    @NamedQuery(name = "Personal.findByAsignacionFamiliar", query = "SELECT p FROM Personal p WHERE p.asignacionFamiliar = :asignacionFamiliar"),
    @NamedQuery(name = "Personal.findByAutogenerado", query = "SELECT p FROM Personal p WHERE p.autogenerado = :autogenerado"),
    @NamedQuery(name = "Personal.findByCusp", query = "SELECT p FROM Personal p WHERE p.cusp = :cusp"),
    @NamedQuery(name = "Personal.findByRimac", query = "SELECT p FROM Personal p WHERE p.rimac = :rimac"),
    @NamedQuery(name = "Personal.findByNBoleta", query = "SELECT p FROM Personal p WHERE p.nBoleta = :nBoleta"),
    @NamedQuery(name = "Personal.findByBaja", query = "SELECT p FROM Personal p WHERE p.baja = :baja"),
    @NamedQuery(name = "Personal.findByFalto", query = "SELECT p FROM Personal p WHERE p.falto = :falto"),
    @NamedQuery(name = "Personal.findByAsistio", query = "SELECT p FROM Personal p WHERE p.asistio = :asistio")})
public class Personal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "ID_PERSONAL", nullable = false)
    private Integer idPersonal;
    @Size(max = 50)
    @Column(name = "DNI", length = 50)
    private String dni;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "EDAD")
    private Integer edad;
    @Size(max = 2147483647)
    @Column(name = "NOMBRES", length = 2147483647)
    private String nombres;
    @Size(max = 2147483647)
    @Column(name = "A_PATERNO", length = 2147483647)
    private String aPaterno;
    @Size(max = 2147483647)
    @Column(name = "A_MATERNO", length = 2147483647)
    private String aMaterno;
    @Lob
    @Column(name = "FOTO")
    private byte[] foto;
    @Column(name = "SEXO")
    private Integer sexo;
    @Size(max = 2147483647)
    @Column(name = "DIRECCION", length = 2147483647)
    private String direccion;
    @Size(max = 50)
    @Column(name = "FIJO", length = 50)
    private String fijo;
    @Size(max = 50)
    @Column(name = "CELULAR", length = 50)
    private String celular;
    @Size(max = 2147483647)
    @Column(name = "MAIL", length = 2147483647)
    private String mail;
    @Column(name = "F_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fIngreso;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD", precision = 19, scale = 4)
    private BigDecimal cantidad;
    @Column(name = "N_HIJOS")
    private Integer nHijos;
    @Column(name = "ASIGNACION_FAMILIAR")
    private Integer asignacionFamiliar;
    @Size(max = 2147483647)
    @Column(name = "AUTOGENERADO", length = 2147483647)
    private String autogenerado;
    @Size(max = 2147483647)
    @Column(name = "CUSP", length = 2147483647)
    private String cusp;
    @Column(name = "RIMAC", precision = 19, scale = 4)
    private BigDecimal rimac;
    @Column(name = "N_BOLETA")
    private Integer nBoleta;
    @Column(name = "BAJA")
    private Integer baja;
    @Column(name = "FALTO")
    private Integer falto;
    @Column(name = "ASISTIO")
    private Integer asistio;
    @OneToMany(mappedBy = "idPersonal", fetch = FetchType.LAZY)
    private List<FechasDeRegistro> fechasDeRegistroList;
    @JoinColumn(name = "ID_TIPO_TRABAJADOR", referencedColumnName = "ID_TIPO_TRABAJADOR")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoTrabajador idTipoTrabajador;
    @JoinColumn(name = "TIPO_SUELDO", referencedColumnName = "ID_TIPO_SUELDO")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoSueldo tipoSueldo;
    @JoinColumn(name = "ID_TIPO_DE_OBRERO", referencedColumnName = "ID_TIPO_OBRERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoObrero idTipoDeObrero;
    @JoinColumn(name = "ID_TIPO_SEGURO", referencedColumnName = "ID_TIPO_SEGURO")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoDeSeguro idTipoSeguro;
    @JoinColumn(name = "ID_ESTADO_CIVIL", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PersonalEstadoCivil idEstadoCivil;
    @JoinColumn(name = "ID_COMISION", referencedColumnName = "ID_COMISION")
    @ManyToOne(fetch = FetchType.LAZY)
    private Comisiones idComision;
    @JoinColumn(name = "ID_CIUDAD", referencedColumnName = "ID_CIUDAD")
    @ManyToOne(fetch = FetchType.LAZY)
    private Ciudades idCiudad;
    @JoinColumn(name = "ID_CENTRO_ASISTENCIAL", referencedColumnName = "ID_CENTRO_ASISTENCIAL")
    @ManyToOne(fetch = FetchType.LAZY)
    private CentroAsistencial idCentroAsistencial;
    @JoinColumn(name = "ID_TIPO_AFP", referencedColumnName = "ID_AFP")
    @ManyToOne(fetch = FetchType.LAZY)
    private Afp idTipoAfp;
    @OneToMany(mappedBy = "idPersonal", fetch = FetchType.LAZY)
    private List<Admision> admisionList;
    @OneToMany(mappedBy = "idPersonal", fetch = FetchType.LAZY)
    private List<Hijos> hijosList;

    public Personal() {
    }

    public Personal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }

    public Integer getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getAPaterno() {
        return aPaterno;
    }

    public void setAPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getAMaterno() {
        return aMaterno;
    }

    public void setAMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFijo() {
        return fijo;
    }

    public void setFijo(String fijo) {
        this.fijo = fijo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getFIngreso() {
        return fIngreso;
    }

    public void setFIngreso(Date fIngreso) {
        this.fIngreso = fIngreso;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getNHijos() {
        return nHijos;
    }

    public void setNHijos(Integer nHijos) {
        this.nHijos = nHijos;
    }

    public Integer getAsignacionFamiliar() {
        return asignacionFamiliar;
    }

    public void setAsignacionFamiliar(Integer asignacionFamiliar) {
        this.asignacionFamiliar = asignacionFamiliar;
    }

    public String getAutogenerado() {
        return autogenerado;
    }

    public void setAutogenerado(String autogenerado) {
        this.autogenerado = autogenerado;
    }

    public String getCusp() {
        return cusp;
    }

    public void setCusp(String cusp) {
        this.cusp = cusp;
    }

    public BigDecimal getRimac() {
        return rimac;
    }

    public void setRimac(BigDecimal rimac) {
        this.rimac = rimac;
    }

    public Integer getNBoleta() {
        return nBoleta;
    }

    public void setNBoleta(Integer nBoleta) {
        this.nBoleta = nBoleta;
    }

    public Integer getBaja() {
        return baja;
    }

    public void setBaja(Integer baja) {
        this.baja = baja;
    }

    public Integer getFalto() {
        return falto;
    }

    public void setFalto(Integer falto) {
        this.falto = falto;
    }

    public Integer getAsistio() {
        return asistio;
    }

    public void setAsistio(Integer asistio) {
        this.asistio = asistio;
    }

    public List<FechasDeRegistro> getFechasDeRegistroList() {
        return fechasDeRegistroList;
    }

    public void setFechasDeRegistroList(List<FechasDeRegistro> fechasDeRegistroList) {
        this.fechasDeRegistroList = fechasDeRegistroList;
    }

    public TipoTrabajador getIdTipoTrabajador() {
        return idTipoTrabajador;
    }

    public void setIdTipoTrabajador(TipoTrabajador idTipoTrabajador) {
        this.idTipoTrabajador = idTipoTrabajador;
    }

    public TipoSueldo getTipoSueldo() {
        return tipoSueldo;
    }

    public void setTipoSueldo(TipoSueldo tipoSueldo) {
        this.tipoSueldo = tipoSueldo;
    }

    public TipoObrero getIdTipoDeObrero() {
        return idTipoDeObrero;
    }

    public void setIdTipoDeObrero(TipoObrero idTipoDeObrero) {
        this.idTipoDeObrero = idTipoDeObrero;
    }

    public TipoDeSeguro getIdTipoSeguro() {
        return idTipoSeguro;
    }

    public void setIdTipoSeguro(TipoDeSeguro idTipoSeguro) {
        this.idTipoSeguro = idTipoSeguro;
    }

    public PersonalEstadoCivil getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(PersonalEstadoCivil idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public Comisiones getIdComision() {
        return idComision;
    }

    public void setIdComision(Comisiones idComision) {
        this.idComision = idComision;
    }

    public Ciudades getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Ciudades idCiudad) {
        this.idCiudad = idCiudad;
    }

    public CentroAsistencial getIdCentroAsistencial() {
        return idCentroAsistencial;
    }

    public void setIdCentroAsistencial(CentroAsistencial idCentroAsistencial) {
        this.idCentroAsistencial = idCentroAsistencial;
    }

    public Afp getIdTipoAfp() {
        return idTipoAfp;
    }

    public void setIdTipoAfp(Afp idTipoAfp) {
        this.idTipoAfp = idTipoAfp;
    }

    public List<Admision> getAdmisionList() {
        return admisionList;
    }

    public void setAdmisionList(List<Admision> admisionList) {
        this.admisionList = admisionList;
    }

    public List<Hijos> getHijosList() {
        return hijosList;
    }

    public void setHijosList(List<Hijos> hijosList) {
        this.hijosList = hijosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersonal != null ? idPersonal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personal)) {
            return false;
        }
        Personal other = (Personal) object;
        if ((this.idPersonal == null && other.idPersonal != null) || (this.idPersonal != null && !this.idPersonal.equals(other.idPersonal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asistencia.entity.Personal[ idPersonal=" + idPersonal + " ]";
    }
    
}
