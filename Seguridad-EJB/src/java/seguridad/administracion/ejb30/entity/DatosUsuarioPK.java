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
 * @author Luis_Angel
 */
@Embeddable
public class DatosUsuarioPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private String idUsuario;
    @Basic(optional = false)
    @Column(name = "tipo_dato")
    private int tipoDato;
    @Basic(optional = false)
    @Column(name = "valor")
    private String valor;

    public DatosUsuarioPK() {
    }

    public DatosUsuarioPK(String idUsuario, int tipoDato, String valor) {
        this.idUsuario = idUsuario;
        this.tipoDato = tipoDato;
        this.valor = valor;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(int tipoDato) {
        this.tipoDato = tipoDato;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        hash += (int) tipoDato;
        hash += (valor != null ? valor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof DatosUsuarioPK)) {
            return false;
        }
        DatosUsuarioPK other = (DatosUsuarioPK) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        if (this.tipoDato != other.tipoDato) {
            return false;
        }
        if ((this.valor == null && other.valor != null) || (this.valor != null && !this.valor.equals(other.valor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "seguridad.administracion.ejb30.entity.DatosUsuarioPK[idUsuario=" + idUsuario + ", tipoDato=" + tipoDato + ", valor=" + valor + "]";
    }

}
