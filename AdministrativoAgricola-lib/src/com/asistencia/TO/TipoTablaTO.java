/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.asistencia.TO;

import java.io.Serializable;

/**
 *
 * @author Diana
 */
public class TipoTablaTO implements Serializable {
  public Integer id_tabla_tipo;
  public String tabla;

    public TipoTablaTO() {
    }

  

    public TipoTablaTO(String tabla) {
        this.tabla = tabla;
    }

    public Integer getId_tabla_tipo() {
        return id_tabla_tipo;
    }

    public void setId_tabla_tipo(Integer id_tabla_tipo) {
        this.id_tabla_tipo = id_tabla_tipo;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }
  @Override
  public String toString()
  {
    return tabla;
  }

}
