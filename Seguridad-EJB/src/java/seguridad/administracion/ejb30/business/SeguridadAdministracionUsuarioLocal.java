/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.business;

import javax.ejb.Local;
import seguridad.administracion.ejb30.entity.Usuario;

/**
 *
 * @author Luis_Angel
 */
@Local
public interface SeguridadAdministracionUsuarioLocal {

    boolean insertarUsuario(Usuario new_user,String zona,String unidad_organica) throws Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.UsuarioTO> getListaTrabajadores() throws java.lang.Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.UsuarioTO> getListaUsuarios() throws java.lang.Exception;

    public boolean eliminarUsuario(java.lang.String id_usuario) throws java.lang.Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.SistemaTO> getListaDetalleUsuarioSistema(java.lang.String loguser) throws java.lang.Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.TipoUsuarioTO> getTiposUsuarios() throws java.lang.Exception;

    public boolean setSistemasUsuario(java.util.List<seguridad.administracion.ejb30.TO.SistemaTO> sistemas, java.lang.String id_usuario) throws java.lang.Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.TipoDatoTO> getTiposDato() throws java.lang.Exception;

    public boolean agregaTiposUsuario(java.util.List<seguridad.administracion.ejb30.TO.DescripcionTiposTO> tipos, java.lang.String id_usuario) throws java.lang.Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.DescripcionTiposTO> getTiposDeUsuario(java.lang.String user) throws java.lang.Exception;

    public boolean insertarUsuario(seguridad.administracion.ejb30.entity.Usuario nuevo_user) throws java.lang.Exception;
    
}
