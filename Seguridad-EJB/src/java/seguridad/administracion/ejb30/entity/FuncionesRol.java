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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Renato
 */
@Entity
@Table(name = "Funciones_Rol")
@NamedQueries({
    @NamedQuery(name = "FuncionesRol.findAll", query = "SELECT f FROM FuncionesRol f"),
    @NamedQuery(name = "FuncionesRol.findByIdFuncion", query = "SELECT f FROM FuncionesRol f WHERE f.funcionesRolPK.idFuncion = :idFuncion"),
    @NamedQuery(name = "FuncionesRol.findByDescripcion", query = "SELECT f FROM FuncionesRol f WHERE f.descripcion = :descripcion"),
    @NamedQuery(name = "FuncionesRol.findByIdSistema", query = "SELECT f FROM FuncionesRol f WHERE f.funcionesRolPK.idSistema = :idSistema")})
public class FuncionesRol implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FuncionesRolPK funcionesRolPK;
    @Basic(optional = false)
    @Column(name = "descripcion", nullable = false, length = 50)
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "funcionesRol")
    private List<DetalleRolFuncion> detalleRolFuncionList;

    public FuncionesRol() {
    }

    public FuncionesRol(FuncionesRolPK funcionesRolPK) {
        this.funcionesRolPK = funcionesRolPK;
    }

    public FuncionesRol(FuncionesRolPK funcionesRolPK, String descripcion) {
        this.funcionesRolPK = funcionesRolPK;
        this.descripcion = descripcion;
    }

    public FuncionesRol(String idFuncion, int idSistema) {
        this.funcionesRolPK = new FuncionesRolPK(idFuncion, idSistema);
    }

    public FuncionesRolPK getFuncionesRolPK() {
        return funcionesRolPK;
    }

    public void setFuncionesRolPK(FuncionesRolPK funcionesRolPK) {
        this.funcionesRolPK = funcionesRolPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (funcionesRolPK != null ? funcionesRolPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FuncionesRol)) {
            return false;
        }
        FuncionesRol other = (FuncionesRol) object;
        if ((this.funcionesRolPK == null && other.funcionesRolPK != null) || (this.funcionesRolPK != null && !this.funcionesRolPK.equals(other.funcionesRolPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "seguridad.administracion.ejb30.entity.FuncionesRol[funcionesRolPK=" + funcionesRolPK + "]";
    }

}
