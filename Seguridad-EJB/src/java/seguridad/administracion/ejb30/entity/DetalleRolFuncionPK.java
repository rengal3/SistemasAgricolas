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
public class DetalleRolFuncionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_rol", nullable = false)
    private int idRol;
    @Basic(optional = false)
    @Column(name = "id_funcion", nullable = false, length = 6)
    private String idFuncion;
    @Basic(optional = false)
    @Column(name = "id_sistema", nullable = false)
    private int idSistema;

    public DetalleRolFuncionPK() {
    }

    public DetalleRolFuncionPK(int idRol, String idFuncion, int idSistema) {
        this.idRol = idRol;
        this.idFuncion = idFuncion;
        this.idSistema = idSistema;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(String idFuncion) {
        this.idFuncion = idFuncion;
    }

    public int getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(int idSistema) {
        this.idSistema = idSistema;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idRol;
        hash += (idFuncion != null ? idFuncion.hashCode() : 0);
        hash += (int) idSistema;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof DetalleRolFuncionPK)) {
            return false;
        }
        DetalleRolFuncionPK other = (DetalleRolFuncionPK) object;
        if (this.idRol != other.idRol) {
            return false;
        }
        if ((this.idFuncion == null && other.idFuncion != null) || (this.idFuncion != null && !this.idFuncion.equals(other.idFuncion))) {
            return false;
        }
        if (this.idSistema != other.idSistema) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "seguridad.administracion.ejb30.entity.DetalleRolFuncionPK[idRol=" + idRol + ", idFuncion=" + idFuncion + ", idSistema=" + idSistema + "]";
    }

}
