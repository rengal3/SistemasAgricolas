/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Renato
 */
@Entity
@Table(name = "Roles")
@NamedQueries({
    @NamedQuery(name = "Roles.findAll", query = "SELECT r FROM Roles r"),
    @NamedQuery(name = "Roles.findByIdRol", query = "SELECT r FROM Roles r WHERE r.idRol = :idRol"),
    @NamedQuery(name = "Roles.findByDescripcionRol", query = "SELECT r FROM Roles r WHERE r.descripcionRol = :descripcionRol")})
public class Roles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_rol", nullable = false)
    private Integer idRol;
    @Column(name = "descripcion_rol", length = 100)
    private String descripcionRol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roles")
    private List<Detalleusuariorol> detalleusuariorolList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roles")
    private List<DetalleRolFuncion> detalleRolFuncionList;

    public Roles() {
    }

    public Roles(Integer idRol) {
        this.idRol = idRol;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getDescripcionRol() {
        return descripcionRol;
    }

    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }

    public List<Detalleusuariorol> getDetalleusuariorolList() {
        return detalleusuariorolList;
    }

    public void setDetalleusuariorolList(List<Detalleusuariorol> detalleusuariorolList) {
        this.detalleusuariorolList = detalleusuariorolList;
    }

    public List<DetalleRolFuncion> getDetalleRolFuncionList() {
        return detalleRolFuncionList;
    }

    public void setDetalleRolFuncionList(List<DetalleRolFuncion> detalleRolFuncionList) {
        this.detalleRolFuncionList = detalleRolFuncionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRol != null ? idRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Roles)) {
            return false;
        }
        Roles other = (Roles) object;
        if ((this.idRol == null && other.idRol != null) || (this.idRol != null && !this.idRol.equals(other.idRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "seguridad.administracion.ejb30.entity.Roles[idRol=" + idRol + "]";
    }

}
