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
public class TipoUsuarioTO implements Serializable{

    private int id_tipo_usuario;
    private String nombre_tipo_usuario;

    public TipoUsuarioTO(int id_tipo_usuario, String nombre_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
        this.nombre_tipo_usuario = nombre_tipo_usuario;
    }

    public int getId_tipo_usuario() {
        return id_tipo_usuario;
    }

    public void setId_tipo_usuario(int id_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
    }

    public String getNombre_tipo_usuario() {
        return nombre_tipo_usuario;
    }

    public void setNombre_tipo_usuario(String nombre_tipo_usuario) {
        this.nombre_tipo_usuario = nombre_tipo_usuario;
    }

    
}
