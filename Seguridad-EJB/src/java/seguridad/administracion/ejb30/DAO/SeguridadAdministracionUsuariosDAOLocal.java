/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.DAO;

import java.util.List;
import javax.ejb.Local;
import seguridad.administracion.ejb30.TO.DescripcionTiposTO;
import seguridad.administracion.ejb30.TO.SistemaTO;
import seguridad.administracion.ejb30.TO.TipoDatoTO;
import seguridad.administracion.ejb30.TO.TipoUsuarioTO;
import seguridad.administracion.ejb30.TO.UsuarioTO;
import seguridad.administracion.ejb30.entity.Usuario;

/**
 *
 * @author Luis_Angel
 */
@Local
public interface SeguridadAdministracionUsuariosDAOLocal {

    boolean insertarUsuario(Usuario nuevo_user,String zona,String unidad_organica) throws Exception;

    List<UsuarioTO> getListaTrabajadores() throws Exception;

    List<UsuarioTO> getListaUsuarios() throws Exception;

    boolean eliminarUsuario(String id_usuario) throws Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.SistemaTO> getListaDetalleUsuarioSistema(java.lang.String loguser) throws java.lang.Exception;

    boolean setSistemasUsuario(List<SistemaTO> sistemas,String id_usuario) throws Exception;

    List<TipoUsuarioTO> getTiposUsuarios() throws Exception;

    List<TipoDatoTO> getTiposDato() throws Exception;

    boolean agregaTiposUsuario(List<DescripcionTiposTO> tipos,String id_usuario) throws Exception;

    List<DescripcionTiposTO> getTiposDeUsuario(String user) throws Exception;

    public boolean insertarUsuario(seguridad.administracion.ejb30.entity.Usuario nuevo_user) throws java.lang.Exception;


    
}
