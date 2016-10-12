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
public class SistemaTO  implements Serializable{
    int codigo;
    String descripcion;

    public SistemaTO() {
    }

    public SistemaTO(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public String toString(){
        return descripcion;
    }

    
}
