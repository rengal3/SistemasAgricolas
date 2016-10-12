/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Renato
 */
@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuario.findByContrasena", query = "SELECT u FROM Usuario u WHERE u.contrasena = :contrasena"),
    @NamedQuery(name = "Usuario.findByLogeado", query = "SELECT u FROM Usuario u WHERE u.logeado = :logeado"),
    @NamedQuery(name = "Usuario.findByFecUltimoAcceso", query = "SELECT u FROM Usuario u WHERE u.fecUltimoAcceso = :fecUltimoAcceso"),
    @NamedQuery(name = "Usuario.findByFecBloqueo", query = "SELECT u FROM Usuario u WHERE u.fecBloqueo = :fecBloqueo"),
    @NamedQuery(name = "Usuario.findByIpUltimoAcceso", query = "SELECT u FROM Usuario u WHERE u.ipUltimoAcceso = :ipUltimoAcceso"),
    @NamedQuery(name = "Usuario.findByLogeosErroneos", query = "SELECT u FROM Usuario u WHERE u.logeosErroneos = :logeosErroneos"),
    @NamedQuery(name = "Usuario.findByActivo", query = "SELECT u FROM Usuario u WHERE u.activo = :activo")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_usuario", nullable = false, length = 20)
    private String idUsuario;
    @Basic(optional = false)
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "contrasena", nullable = false, length = 20)
    private String contrasena;
    @Basic(optional = false)
    @Column(name = "logeado", nullable = false)
    private boolean logeado;
    @Column(name = "fec_ultimo_acceso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecUltimoAcceso;
    @Column(name = "fec_bloqueo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecBloqueo;
    @Column(name = "ip_ultimo_acceso", length = 15)
    private String ipUltimoAcceso;
    @Basic(optional = false)
    @Column(name = "logeos_erroneos", nullable = false)
    private int logeosErroneos;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<DetalleUsuarioSistema> detalleUsuarioSistemaList;

    public Usuario() {
    }

    public Usuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(String idUsuario, String nombre, String contrasena, boolean logeado, int logeosErroneos, boolean activo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.logeado = logeado;
        this.logeosErroneos = logeosErroneos;
        this.activo = activo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean getLogeado() {
        return logeado;
    }

    public void setLogeado(boolean logeado) {
        this.logeado = logeado;
    }

    public Date getFecUltimoAcceso() {
        return fecUltimoAcceso;
    }

    public void setFecUltimoAcceso(Date fecUltimoAcceso) {
        this.fecUltimoAcceso = fecUltimoAcceso;
    }

    public Date getFecBloqueo() {
        return fecBloqueo;
    }

    public void setFecBloqueo(Date fecBloqueo) {
        this.fecBloqueo = fecBloqueo;
    }

    public String getIpUltimoAcceso() {
        return ipUltimoAcceso;
    }

    public void setIpUltimoAcceso(String ipUltimoAcceso) {
        this.ipUltimoAcceso = ipUltimoAcceso;
    }

    public int getLogeosErroneos() {
        return logeosErroneos;
    }

    public void setLogeosErroneos(int logeosErroneos) {
        this.logeosErroneos = logeosErroneos;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }


    public List<DetalleUsuarioSistema> getDetalleUsuarioSistemaList() {
        return detalleUsuarioSistemaList;
    }

    public void setDetalleUsuarioSistemaList(List<DetalleUsuarioSistema> detalleUsuarioSistemaList) {
        this.detalleUsuarioSistemaList = detalleUsuarioSistemaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "seguridad.administracion.ejb30.entity.Usuario[idUsuario=" + idUsuario + "]";
    }

}
