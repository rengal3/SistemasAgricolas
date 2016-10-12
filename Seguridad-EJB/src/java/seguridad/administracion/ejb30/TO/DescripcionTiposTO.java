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
public class DescripcionTiposTO implements Serializable{

    private String tipo_dato;
    private String nom_tipo_dato;
    private String descripcion_dato;
    private String id_descripcion_dato;

    public DescripcionTiposTO(String tipo_dato, String nom_tipo_dato, String descripcion_dato, String id_descripcion_dato) {
        this.tipo_dato = tipo_dato;
        this.nom_tipo_dato = nom_tipo_dato;
        this.descripcion_dato = descripcion_dato;
        this.id_descripcion_dato = id_descripcion_dato;
    }

    public DescripcionTiposTO(String tipo_dato, String id_descripcion_dato) {
        this.tipo_dato = tipo_dato;
        this.id_descripcion_dato = id_descripcion_dato;
    }

    public DescripcionTiposTO(String tipo_dato, String nom_tipo_dato, String id_descripcion_dato) {
        this.tipo_dato = tipo_dato;
        this.nom_tipo_dato = nom_tipo_dato;
        this.id_descripcion_dato = id_descripcion_dato;
    }

    

    
    public String getDescripcion_dato() {
        return descripcion_dato;
    }

    public void setDescripcion_dato(String descripcion_dato) {
        this.descripcion_dato = descripcion_dato;
    }

    public String getId_descripcion_dato() {
        return id_descripcion_dato;
    }

    public void setId_descripcion_dato(String id_descripcion_dato) {
        this.id_descripcion_dato = id_descripcion_dato;
    }

    public String getNom_tipo_dato() {
        return nom_tipo_dato;
    }

    public void setNom_tipo_dato(String nom_tipo_dato) {
        this.nom_tipo_dato = nom_tipo_dato;
    }

    public String getTipo_dato() {
        return tipo_dato;
    }

    public void setTipo_dato(String tipo_dato) {
        this.tipo_dato = tipo_dato;
    }

    
}
