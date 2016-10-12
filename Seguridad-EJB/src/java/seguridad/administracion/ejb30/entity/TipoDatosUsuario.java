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
@Table(name = "tipo_datos_usuario")
@NamedQueries({
    @NamedQuery(name = "TipoDatosUsuario.findAll", query = "SELECT t FROM TipoDatosUsuario t"),
    @NamedQuery(name = "TipoDatosUsuario.findByTipoDato", query = "SELECT t FROM TipoDatosUsuario t WHERE t.tipoDato = :tipoDato"),
    @NamedQuery(name = "TipoDatosUsuario.findByNomTipoDato", query = "SELECT t FROM TipoDatosUsuario t WHERE t.nomTipoDato = :nomTipoDato")})
public class TipoDatosUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "tipo_dato", nullable = false)
    private Integer tipoDato;
    @Column(name = "nom_tipo_dato", length = 50)
    private String nomTipoDato;
  

    public TipoDatosUsuario() {
    }

    public TipoDatosUsuario(Integer tipoDato) {
        this.tipoDato = tipoDato;
    }

    public Integer getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(Integer tipoDato) {
        this.tipoDato = tipoDato;
    }

    public String getNomTipoDato() {
        return nomTipoDato;
    }

    public void setNomTipoDato(String nomTipoDato) {
        this.nomTipoDato = nomTipoDato;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoDato != null ? tipoDato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TipoDatosUsuario)) {
            return false;
        }
        TipoDatosUsuario other = (TipoDatosUsuario) object;
        if ((this.tipoDato == null && other.tipoDato != null) || (this.tipoDato != null && !this.tipoDato.equals(other.tipoDato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "seguridad.administracion.ejb30.entity.TipoDatosUsuario[tipoDato=" + tipoDato + "]";
    }

}
