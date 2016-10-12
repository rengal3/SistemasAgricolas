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
public class DetalleUsuarioSistemaTO implements Serializable{
  private String id_usuario;
  private Integer id_sistema; 
  private Boolean activo;

  public DetalleUsuarioSistemaTO(String idus, Integer id_sis, Boolean act)
  {
    this.id_usuario = idus;
    this.id_sistema = id_sis;    
    this.activo = act;
  }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Integer getId_sistema() {
        return id_sistema;
    }

    public void setId_sistema(Integer id_sistema) {
        this.id_sistema = id_sistema;
    }   

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }
  
}
