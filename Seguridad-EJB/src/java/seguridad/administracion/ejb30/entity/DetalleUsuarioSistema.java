/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Diana
 */
@Entity
@Table(name = "detalle_usuario_sistema")
@NamedQueries({
    @NamedQuery(name = "DetalleUsuarioSistema.findAll", query = "SELECT d FROM DetalleUsuarioSistema d"),
    @NamedQuery(name = "DetalleUsuarioSistema.findByIdUsuario", query = "SELECT d FROM DetalleUsuarioSistema d WHERE d.detalleUsuarioSistemaPK.idUsuario = :idUsuario"),
    @NamedQuery(name = "DetalleUsuarioSistema.findByIdSistema", query = "SELECT d FROM DetalleUsuarioSistema d WHERE d.detalleUsuarioSistemaPK.idSistema = :idSistema"),
    @NamedQuery(name = "DetalleUsuarioSistema.findByIdUsuarioActivo", query = "SELECT d FROM DetalleUsuarioSistema d WHERE d.detalleUsuarioSistemaPK.idUsuario = :idUsuario and d.activo=true"),
    @NamedQuery(name = "DetalleUsuarioSistema.findByActivo", query = "SELECT d FROM DetalleUsuarioSistema d WHERE d.activo = :activo")})
public class DetalleUsuarioSistema implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleUsuarioSistemaPK detalleUsuarioSistemaPK;
    @Column(name = "activo")
    private Boolean activo;
    @JoinColumn(name = "id_sistema", referencedColumnName = "id_sistema", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sistema sistema;
    
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    public DetalleUsuarioSistema() {
    }

    public DetalleUsuarioSistema(DetalleUsuarioSistemaPK detalleUsuarioSistemaPK) {
        this.detalleUsuarioSistemaPK = detalleUsuarioSistemaPK;
    }

    public DetalleUsuarioSistema(String idUsuario, int idSistema) {
        this.detalleUsuarioSistemaPK = new DetalleUsuarioSistemaPK(idUsuario, idSistema);
    }

    public DetalleUsuarioSistemaPK getDetalleUsuarioSistemaPK() {
        return detalleUsuarioSistemaPK;
    }

    public void setDetalleUsuarioSistemaPK(DetalleUsuarioSistemaPK detalleUsuarioSistemaPK) {
        this.detalleUsuarioSistemaPK = detalleUsuarioSistemaPK;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
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
        hash += (detalleUsuarioSistemaPK != null ? detalleUsuarioSistemaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof DetalleUsuarioSistema)) {
            return false;
        }
        DetalleUsuarioSistema other = (DetalleUsuarioSistema) object;
        if ((this.detalleUsuarioSistemaPK == null && other.detalleUsuarioSistemaPK != null) || (this.detalleUsuarioSistemaPK != null && !this.detalleUsuarioSistemaPK.equals(other.detalleUsuarioSistemaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "seguridad.administracion.ejb30.entity.DetalleUsuarioSistema[detalleUsuarioSistemaPK=" + detalleUsuarioSistemaPK + "]";
    }

}
