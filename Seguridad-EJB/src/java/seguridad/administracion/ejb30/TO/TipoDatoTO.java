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
public class TipoDatoTO implements Serializable{

    private String id_tipo;
    private String nom_tipo;

    public TipoDatoTO() {
    }

    public TipoDatoTO(String id_tipo, String nom_tipo) {
        this.id_tipo = id_tipo;
        this.nom_tipo = nom_tipo;
    }

    public String getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(String id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getNom_tipo() {
        return nom_tipo;
    }

    public void setNom_tipo(String nom_tipo) {
        this.nom_tipo = nom_tipo;
    }

    @Override
    public String toString() {
        return this.nom_tipo;
    }


}
