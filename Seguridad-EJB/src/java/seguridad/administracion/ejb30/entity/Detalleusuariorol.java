/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Renato
 */
@Entity
@Table(name = "Detalle_usuario_rol")
@NamedQueries({
    @NamedQuery(name = "Detalleusuariorol.findAll", query = "SELECT d FROM Detalleusuariorol d"),
    @NamedQuery(name = "Detalleusuariorol.findByIdRol", query = "SELECT d FROM Detalleusuariorol d WHERE d.detalleusuariorolPK.idRol = :idRol"),
    @NamedQuery(name = "Detalleusuariorol.findByIdUsuario", query = "SELECT d FROM Detalleusuariorol d WHERE d.detalleusuariorolPK.idUsuario = :idUsuario"),
    @NamedQuery(name = "Detalleusuariorol.findByFechaOperacion", query = "SELECT d FROM Detalleusuariorol d WHERE d.fechaOperacion = :fechaOperacion")})
public class Detalleusuariorol implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleusuariorolPK detalleusuariorolPK;
    @Basic(optional = false)
    @Column(name = "fecha_operacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaOperacion;
    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Roles roles;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Detalleusuariorol() {
    }

    public Detalleusuariorol(DetalleusuariorolPK detalleusuariorolPK) {
        this.detalleusuariorolPK = detalleusuariorolPK;
    }

    public Detalleusuariorol(DetalleusuariorolPK detalleusuariorolPK, Date fechaOperacion) {
        this.detalleusuariorolPK = detalleusuariorolPK;
        this.fechaOperacion = fechaOperacion;
    }

    public Detalleusuariorol(int idRol, String idUsuario) {
        this.detalleusuariorolPK = new DetalleusuariorolPK(idRol, idUsuario);
    }

    public DetalleusuariorolPK getDetalleusuariorolPK() {
        return detalleusuariorolPK;
    }

    public void setDetalleusuariorolPK(DetalleusuariorolPK detalleusuariorolPK) {
        this.detalleusuariorolPK = detalleusuariorolPK;
    }

    public Date getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(Date fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleusuariorolPK != null ? detalleusuariorolPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Detalleusuariorol)) {
            return false;
        }
        Detalleusuariorol other = (Detalleusuariorol) object;
        if ((this.detalleusuariorolPK == null && other.detalleusuariorolPK != null) || (this.detalleusuariorolPK != null && !this.detalleusuariorolPK.equals(other.detalleusuariorolPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "seguridad.administracion.ejb30.entity.Detalleusuariorol[detalleusuariorolPK=" + detalleusuariorolPK + "]";
    }

}
