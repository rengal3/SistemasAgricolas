/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.TO;

import java.io.Serializable;

/**
 *
 * @author Diana
 */
public class FuncionRolTO implements Serializable{
    String codigo;
    String descripcion;
    String sistema;

    public FuncionRolTO() {
    }

    public FuncionRolTO(String codigo, String descripcion, String sistema) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.sistema = sistema;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
     @Override
    public String toString(){
        return descripcion;
    }


}
