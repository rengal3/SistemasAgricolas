/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Renato
 */
@Entity
@Table(name = "historial_ingresos_salidas")
@NamedQueries({
    @NamedQuery(name = "HistorialIngresosSalidas.findAll", query = "SELECT h FROM HistorialIngresosSalidas h"),
    @NamedQuery(name = "HistorialIngresosSalidas.findByIdUsuario", query = "SELECT h FROM HistorialIngresosSalidas h WHERE h.historialIngresosSalidasPK.idUsuario = :idUsuario"),
    @NamedQuery(name = "HistorialIngresosSalidas.findByCorrelativo", query = "SELECT h FROM HistorialIngresosSalidas h WHERE h.historialIngresosSalidasPK.correlativo = :correlativo"),
    @NamedQuery(name = "HistorialIngresosSalidas.findByTipoMovimiento", query = "SELECT h FROM HistorialIngresosSalidas h WHERE h.tipoMovimiento = :tipoMovimiento"),
    @NamedQuery(name = "HistorialIngresosSalidas.findByFecha", query = "SELECT h FROM HistorialIngresosSalidas h WHERE h.fecha = :fecha"),
    @NamedQuery(name = "HistorialIngresosSalidas.findByIp", query = "SELECT h FROM HistorialIngresosSalidas h WHERE h.ip = :ip"),
    @NamedQuery(name = "HistorialIngresosSalidas.findByHost", query = "SELECT h FROM HistorialIngresosSalidas h WHERE h.host = :host"),
    @NamedQuery(name = "HistorialIngresosSalidas.findByMac", query = "SELECT h FROM HistorialIngresosSalidas h WHERE h.mac = :mac")})
public class HistorialIngresosSalidas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HistorialIngresosSalidasPK historialIngresosSalidasPK;
    @Basic(optional = false)
    @Column(name = "tipo_movimiento", nullable = false)
    private char tipoMovimiento;
    @Basic(optional = false)
    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "ip", nullable = false, length = 17)
    private String ip;
    @Basic(optional = false)
    @Column(name = "host", nullable = false, length = 100)
    private String host;
    @Basic(optional = false)
    @Column(name = "mac", nullable = false, length = 17)
    private String mac;

    public HistorialIngresosSalidas() {
    }

    public HistorialIngresosSalidas(HistorialIngresosSalidasPK historialIngresosSalidasPK) {
        this.historialIngresosSalidasPK = historialIngresosSalidasPK;
    }

    public HistorialIngresosSalidas(HistorialIngresosSalidasPK historialIngresosSalidasPK, char tipoMovimiento, Date fecha, String ip, String host, String mac) {
        this.historialIngresosSalidasPK = historialIngresosSalidasPK;
        this.tipoMovimiento = tipoMovimiento;
        this.fecha = fecha;
        this.ip = ip;
        this.host = host;
        this.mac = mac;
    }

    public HistorialIngresosSalidas(String idUsuario, int correlativo) {
        this.historialIngresosSalidasPK = new HistorialIngresosSalidasPK(idUsuario, correlativo);
    }

    public HistorialIngresosSalidasPK getHistorialIngresosSalidasPK() {
        return historialIngresosSalidasPK;
    }

    public void setHistorialIngresosSalidasPK(HistorialIngresosSalidasPK historialIngresosSalidasPK) {
        this.historialIngresosSalidasPK = historialIngresosSalidasPK;
    }

    public char getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(char tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historialIngresosSalidasPK != null ? historialIngresosSalidasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HistorialIngresosSalidas)) {
            return false;
        }
        HistorialIngresosSalidas other = (HistorialIngresosSalidas) object;
        if ((this.historialIngresosSalidasPK == null && other.historialIngresosSalidasPK != null) || (this.historialIngresosSalidasPK != null && !this.historialIngresosSalidasPK.equals(other.historialIngresosSalidasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "seguridad.administracion.ejb30.entity.HistorialIngresosSalidas[historialIngresosSalidasPK=" + historialIngresosSalidasPK + "]";
    }

}
