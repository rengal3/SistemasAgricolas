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
import javax.persistence.JoinColumns;
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
@Table(name = "Detalle_Rol_Funcion")
@NamedQueries({
    @NamedQuery(name = "DetalleRolFuncion.findAll", query = "SELECT d FROM DetalleRolFuncion d"),
    @NamedQuery(name = "DetalleRolFuncion.findByIdRol", query = "SELECT d FROM DetalleRolFuncion d WHERE d.detalleRolFuncionPK.idRol = :idRol"),
    @NamedQuery(name = "DetalleRolFuncion.findByIdFuncion", query = "SELECT d FROM DetalleRolFuncion d WHERE d.detalleRolFuncionPK.idFuncion = :idFuncion"),
    @NamedQuery(name = "DetalleRolFuncion.findByIdSistema", query = "SELECT d FROM DetalleRolFuncion d WHERE d.detalleRolFuncionPK.idSistema = :idSistema"),
    @NamedQuery(name = "DetalleRolFuncion.findByFechaOperacion", query = "SELECT d FROM DetalleRolFuncion d WHERE d.fechaOperacion = :fechaOperacion")})
public class DetalleRolFuncion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleRolFuncionPK detalleRolFuncionPK;
    @Basic(optional = false)
    @Column(name = "fecha_operacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaOperacion;
    @JoinColumns({
        @JoinColumn(name = "id_funcion", referencedColumnName = "id_funcion", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "id_sistema", referencedColumnName = "id_sistema", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private FuncionesRol funcionesRol;
    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Roles roles;

    public DetalleRolFuncion() {
    }

    public DetalleRolFuncion(DetalleRolFuncionPK detalleRolFuncionPK) {
        this.detalleRolFuncionPK = detalleRolFuncionPK;
    }

    public DetalleRolFuncion(DetalleRolFuncionPK detalleRolFuncionPK, Date fechaOperacion) {
        this.detalleRolFuncionPK = detalleRolFuncionPK;
        this.fechaOperacion = fechaOperacion;
    }

    public DetalleRolFuncion(int idRol, String idFuncion, int idSistema) {
        this.detalleRolFuncionPK = new DetalleRolFuncionPK(idRol, idFuncion, idSistema);
    }

    public DetalleRolFuncionPK getDetalleRolFuncionPK() {
        return detalleRolFuncionPK;
    }

    public void setDetalleRolFuncionPK(DetalleRolFuncionPK detalleRolFuncionPK) {
        this.detalleRolFuncionPK = detalleRolFuncionPK;
    }

    public Date getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(Date fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public FuncionesRol getFuncionesRol() {
        return funcionesRol;
    }

    public void setFuncionesRol(FuncionesRol funcionesRol) {
        this.funcionesRol = funcionesRol;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleRolFuncionPK != null ? detalleRolFuncionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof DetalleRolFuncion)) {
            return false;
        }
        DetalleRolFuncion other = (DetalleRolFuncion) object;
        if ((this.detalleRolFuncionPK == null && other.detalleRolFuncionPK != null) || (this.detalleRolFuncionPK != null && !this.detalleRolFuncionPK.equals(other.detalleRolFuncionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "seguridad.administracion.ejb30.entity.DetalleRolFuncion[detalleRolFuncionPK=" + detalleRolFuncionPK + "]";
    }

}
