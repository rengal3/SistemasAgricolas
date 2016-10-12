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
public class UsuarioTO implements Serializable{

    private String dni;
    private String cod_zona;
    private String unid_organizativa;
    private String nombre;
    private String id_zona;

    public UsuarioTO() {
    }

    public UsuarioTO(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    
    public UsuarioTO(String dni, String cod_zona, String unid_organizativa, String nombre) {
        this.dni = dni;
        this.cod_zona = cod_zona;
        this.unid_organizativa = unid_organizativa;
        this.nombre = nombre;
    }

    public UsuarioTO(String dni, String cod_zona, String unid_organizativa, String nombre, String id_zona) {
        this.dni = dni;
        this.cod_zona = cod_zona;
        this.unid_organizativa = unid_organizativa;
        this.nombre = nombre;
        this.id_zona = id_zona;
    }

    public String getId_zona() {
        return id_zona;
    }

    public void setId_zona(String id_zona) {
        this.id_zona = id_zona;
    }


    public String getCod_zona() {
        return cod_zona;
    }

    public void setCod_zona(String cod_zona) {
        this.cod_zona = cod_zona;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnid_organizativa() {
        return unid_organizativa;
    }

    public void setUnid_organizativa(String unid_organizativa) {
        this.unid_organizativa = unid_organizativa;
    }

    @Override
    public String toString() {
        return this.nombre + " - " + this.dni;
    }

    
}
