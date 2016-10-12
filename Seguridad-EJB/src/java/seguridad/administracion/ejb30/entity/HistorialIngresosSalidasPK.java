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
public class HistorialIngresosSalidasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_usuario", nullable = false, length = 20)
    private String idUsuario;
    @Basic(optional = false)
    @Column(name = "correlativo", nullable = false)
    private int correlativo;

    public HistorialIngresosSalidasPK() {
    }

    public HistorialIngresosSalidasPK(String idUsuario, int correlativo) {
        this.idUsuario = idUsuario;
        this.correlativo = correlativo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        hash += (int) correlativo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HistorialIngresosSalidasPK)) {
            return false;
        }
        HistorialIngresosSalidasPK other = (HistorialIngresosSalidasPK) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        if (this.correlativo != other.correlativo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "seguridad.administracion.ejb30.entity.HistorialIngresosSalidasPK[idUsuario=" + idUsuario + ", correlativo=" + correlativo + "]";
    }

}
