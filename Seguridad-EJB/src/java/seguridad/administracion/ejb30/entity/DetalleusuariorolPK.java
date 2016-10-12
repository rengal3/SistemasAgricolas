/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Renato
 */
@Embeddable
public class DetalleusuariorolPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_rol", nullable = false)
    private int idRol;
    @Basic(optional = false)
    @Column(name = "id_usuario", nullable = false, length = 20)
    private String idUsuario;

    public DetalleusuariorolPK() {
    }

    public DetalleusuariorolPK(int idRol, String idUsuario) {
        this.idRol = idRol;
        this.idUsuario = idUsuario;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idRol;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof DetalleusuariorolPK)) {
            return false;
        }
        DetalleusuariorolPK other = (DetalleusuariorolPK) object;
        if (this.idRol != other.idRol) {
            return false;
        }
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "seguridad.administracion.ejb30.entity.DetalleusuariorolPK[idRol=" + idRol + ", idUsuario=" + idUsuario + "]";
    }

}
