/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.asistencia.TO;

import com.helper.NativeQueryResultColumn;
import com.helper.NativeQueryResultEntity;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Renato
 */
@NativeQueryResultEntity
public class TipoTO implements Serializable{
    @NativeQueryResultColumn(index=0)
    private Integer id_tabla_tipo;
    @NativeQueryResultColumn(index=1)    
    private String tabla;
    @NativeQueryResultColumn(index=2)
    private String descripcion_campo;
    @NativeQueryResultColumn(index=3)
    private String codigo;
    @NativeQueryResultColumn(index=4)
    private String descripcion_valor;
    @NativeQueryResultColumn(index=5)
    private BigDecimal cantidad;
    private String codigo_sunat;
    private String id_empresa;
    public TipoTO()
  {
  }

    public TipoTO(String codigo, String descripcion_valor) {
        this.codigo = codigo;
        this.descripcion_valor = descripcion_valor;
    }

    public TipoTO(Integer id_tabla_tipo, String descripcion_valor, String codigo) {
        this.id_tabla_tipo = id_tabla_tipo;
        this.descripcion_valor = descripcion_valor;
        this.codigo=codigo;
    }
    public TipoTO(Integer id_tabla_tipo, String descripcion_valor) {
        this.id_tabla_tipo = id_tabla_tipo;
        this.descripcion_valor = descripcion_valor;
    }
  public TipoTO(Integer idtabla)
  {
    this.id_tabla_tipo = idtabla;
  }

  public TipoTO(Integer idtabla, String tab, String desc_camp, String cod, String desc_val) {
    this.id_tabla_tipo = idtabla;
    this.tabla = tab;
    this.descripcion_campo = desc_camp;
    this.codigo = cod;
    this.descripcion_valor = desc_val;
  }

    public TipoTO(Integer id_tabla_tipo, String tabla, String descripcion_campo, String codigo, 
            String descripcion_valor, BigDecimal cantidad, String codigo_sunat) {
        this.id_tabla_tipo = id_tabla_tipo;
        this.tabla = tabla;
        this.descripcion_campo = descripcion_campo;
        this.codigo = codigo;
        this.descripcion_valor = descripcion_valor;
        this.cantidad = cantidad;
        this.codigo_sunat=codigo_sunat;
    }

    public String getCodigo_sunat() {
        return codigo_sunat;
    }

    public void setCodigo_sunat(String codigo_sunat) {
        this.codigo_sunat = codigo_sunat;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }
  
  public String getCodigo() {
    return this.codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion_campo() {
    return this.descripcion_campo;
  }

  public void setDescripcion_campo(String descripcion_campo) {
    this.descripcion_campo = descripcion_campo;
  }

  public String getDescripcion_valor() {
    return this.descripcion_valor;
  }

  public void setDescripcion_valor(String descripcion_valor) {
    this.descripcion_valor = descripcion_valor;
  }

  public Integer getId_tabla_tipo() {
    return this.id_tabla_tipo;
  }

  public void setId_tabla_tipo(Integer id_tabla_tipo) {
    this.id_tabla_tipo = id_tabla_tipo;
  }

  public String getTabla() {
    return this.tabla;
  }

  public void setTabla(String tabla) {
    this.tabla = tabla;
  }

    public String getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(String id_empresa) {
        this.id_empresa = id_empresa;
    }

  
  @Override
  public String toString()
  {
    return this.descripcion_valor + " - " + this.codigo;
  }
}
