/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.TO;

import java.io.Serializable;

/**
 *
 * @author Renato
 */
public class FuncionesAccessoUsuarioTO implements Serializable{

    private String id_funcion;
    private String descripcion_funcion;
    private String id_sistema;
    private String id_usuario;

    public FuncionesAccessoUsuarioTO(){

    }

    public FuncionesAccessoUsuarioTO(String id_funcion, String descripcion_funcion, String id_sistema, String id_usuario) {
        this.id_funcion = id_funcion;
        this.descripcion_funcion = descripcion_funcion;
        this.id_sistema = id_sistema;
        this.id_usuario = id_usuario;
    }

    public String getDescripcion_funcion() {
        return descripcion_funcion;
    }

    public void setDescripcion_funcion(String descripcion_funcion) {
        this.descripcion_funcion = descripcion_funcion;
    }

    public String getId_funcion() {
        return id_funcion;
    }

    public void setId_funcion(String id_funcion) {
        this.id_funcion = id_funcion;
    }

    public String getId_sistema() {
        return id_sistema;
    }

    public void setId_sistema(String id_sistema) {
        this.id_sistema = id_sistema;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    

}
