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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Renato
 */
@Entity
@Table(name = "sistema")
@NamedQueries({
    @NamedQuery(name = "Sistema.findAll", query = "SELECT s FROM Sistema s"),
    @NamedQuery(name = "Sistema.findByIdSistema", query = "SELECT s FROM Sistema s WHERE s.idSistema = :idSistema"),
    @NamedQuery(name = "Sistema.findByNombreSistema", query = "SELECT s FROM Sistema s WHERE s.nombreSistema = :nombreSistema")})
public class Sistema implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_sistema", nullable = false)
    private Integer idSistema;
    @Basic(optional = false)
    @Column(name = "nombre_sistema", nullable = false, length = 50)
    private String nombreSistema;
    @Lob
    @Column(name = "ruta_ejecucion", length = 2147483647)
    private String rutaEjecucion;
    /*@OneToMany(mappedBy = "idSistemaPadre")
    private List<Sistema> sistemaList;
    @JoinColumn(name = "id_sistema_padre", referencedColumnName = "id_sistema")
    @ManyToOne
    private Sistema idSistemaPadre;*/
    

    public Sistema() {
    }

    public Sistema(Integer idSistema) {
        this.idSistema = idSistema;
    }

    public Sistema(Integer idSistema, String nombreSistema) {
        this.idSistema = idSistema;
        this.nombreSistema = nombreSistema;
    }

    public Integer getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(Integer idSistema) {
        this.idSistema = idSistema;
    }

    public String getNombreSistema() {
        return nombreSistema;
    }

    public void setNombreSistema(String nombreSistema) {
        this.nombreSistema = nombreSistema;
    }

    public String getRutaEjecucion() {
        return rutaEjecucion;
    }

    public void setRutaEjecucion(String rutaEjecucion) {
        this.rutaEjecucion = rutaEjecucion;
    }

   /* public List<Sistema> getSistemaList() {
        return sistemaList;
    }

    public void setSistemaList(List<Sistema> sistemaList) {
        this.sistemaList = sistemaList;
    }*/

   /* public Sistema getIdSistemaPadre() {
        return idSistemaPadre;
    }

    public void setIdSistemaPadre(Sistema idSistemaPadre) {
        this.idSistemaPadre = idSistemaPadre;
    }*/

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSistema != null ? idSistema.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Sistema)) {
            return false;
        }
        Sistema other = (Sistema) object;
        if ((this.idSistema == null && other.idSistema != null) || (this.idSistema != null && !this.idSistema.equals(other.idSistema))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "seguridad.administracion.ejb30.entity.Sistema[idSistema=" + idSistema + "]";
    }

}
