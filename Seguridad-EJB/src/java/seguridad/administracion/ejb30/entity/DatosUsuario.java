/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Luis_Angel
 */
@Entity
@Table(name = "datos_usuario")
@NamedQueries({
    @NamedQuery(name = "DatosUsuario.findAll", query = "SELECT d FROM DatosUsuario d"),
    @NamedQuery(name = "DatosUsuario.findByIdUsuario", query = "SELECT d FROM DatosUsuario d WHERE d.datosUsuarioPK.idUsuario = :idUsuario"),
    @NamedQuery(name = "DatosUsuario.findByTipoDato", query = "SELECT d FROM DatosUsuario d WHERE d.datosUsuarioPK.tipoDato = :tipoDato"),
    @NamedQuery(name = "DatosUsuario.findByValor", query = "SELECT d FROM DatosUsuario d WHERE d.datosUsuarioPK.valor = :valor")})
public class DatosUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DatosUsuarioPK datosUsuarioPK;
    

    public DatosUsuario() {
    }

    public DatosUsuario(DatosUsuarioPK datosUsuarioPK) {
        this.datosUsuarioPK = datosUsuarioPK;
    }

    public DatosUsuario(String idUsuario, int tipoDato, String valor) {
        this.datosUsuarioPK = new DatosUsuarioPK(idUsuario, tipoDato, valor);
    }

    public DatosUsuarioPK getDatosUsuarioPK() {
        return datosUsuarioPK;
    }

    public void setDatosUsuarioPK(DatosUsuarioPK datosUsuarioPK) {
        this.datosUsuarioPK = datosUsuarioPK;
    }

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (datosUsuarioPK != null ? datosUsuarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof DatosUsuario)) {
            return false;
        }
        DatosUsuario other = (DatosUsuario) object;
        if ((this.datosUsuarioPK == null && other.datosUsuarioPK != null) || (this.datosUsuarioPK != null && !this.datosUsuarioPK.equals(other.datosUsuarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "seguridad.administracion.ejb30.entity.DatosUsuario[datosUsuarioPK=" + datosUsuarioPK + "]";
    }

}
