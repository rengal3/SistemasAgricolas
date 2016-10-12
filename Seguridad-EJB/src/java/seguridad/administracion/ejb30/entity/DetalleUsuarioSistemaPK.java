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
 * @author Diana
 */
@Embeddable
public class DetalleUsuarioSistemaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private String idUsuario;
    @Basic(optional = false)
    @Column(name = "id_sistema")
    private int idSistema;

    public DetalleUsuarioSistemaPK() {
    }

    public DetalleUsuarioSistemaPK(String idUsuario, int idSistema) {
        this.idUsuario = idUsuario;
        this.idSistema = idSistema;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
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
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        hash += (int) idSistema;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof DetalleUsuarioSistemaPK)) {
            return false;
        }
        DetalleUsuarioSistemaPK other = (DetalleUsuarioSistemaPK) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        if (this.idSistema != other.idSistema) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "seguridad.administracion.ejb30.entity.DetalleUsuarioSistemaPK[idUsuario=" + idUsuario + ", idSistema=" + idSistema + "]";
    }

}
