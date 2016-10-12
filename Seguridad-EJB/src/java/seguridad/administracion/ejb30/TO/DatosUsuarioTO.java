/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.TO;

import java.io.Serializable;

/**
 *
 * @author Luis_Angel
 */
public class DatosUsuarioTO implements Serializable{

    private String log_user;
    private String tipo_dato;
    private String valor_dato;
    private String descripcion_dato;

    public DatosUsuarioTO() {
    }

    public DatosUsuarioTO(String log_user, String tipo_dato, String descripcion_dato, String valor_dato) {
        this.log_user = log_user;
        this.tipo_dato = tipo_dato;
        this.valor_dato = valor_dato;
        this.descripcion_dato = descripcion_dato;
    }

    public String getDescripcion_dato() {
        return descripcion_dato;
    }

    public void setDescripcion_dato(String descripcion_dato) {
        this.descripcion_dato = descripcion_dato;
    }

    public String getLog_user() {
        return log_user;
    }

    public void setLog_user(String log_user) {
        this.log_user = log_user;
    }

    public String getTipo_dato() {
        return tipo_dato;
    }

    public void setTipo_dato(String tipo_dato) {
        this.tipo_dato = tipo_dato;
    }

    public String getValor_dato() {
        return valor_dato;
    }

    public void setValor_dato(String valor_dato) {
        this.valor_dato = valor_dato;
    }

    
}
