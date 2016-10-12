/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.TO;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Diana
 */
public class DetalleUsuarioRolTO implements Serializable{
  int id_rol;
  String id_usuario;
  String descripcion;
  Date fecha;

    public DetalleUsuarioRolTO() {
    }

    public DetalleUsuarioRolTO(int id_rol, String id_usuario, String descripcion, Date fecha) {
        this.id_rol = id_rol;
        this.id_usuario = id_usuario;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }


}
