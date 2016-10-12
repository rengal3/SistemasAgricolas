/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.facade;

import java.sql.SQLException;
import java.util.List;
import javax.ejb.Remote;
import seguridad.administracion.ejb30.TO.DatosUsuarioTO;
import seguridad.administracion.ejb30.TO.DetalleUsuarioSistemaTO;
import seguridad.administracion.ejb30.TO.FuncionesAccessoUsuarioTO;
import seguridad.administracion.ejb30.entity.Sistema;
import seguridad.administracion.ejb30.entity.Usuario;

/**
 *
 * @author Renato
 */
@Remote
public interface SeguridadAdministracionGestionFacadeRemote {
  public  List loguear(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
    throws SQLException;

  public  List desloguear(String paramString1, String paramString2, String paramString3, String paramString4)
    throws SQLException;

  public  List<Sistema> listaDetalleUsuarioSistemaActivo(String paramString)
    throws Exception;

  public  List<DetalleUsuarioSistemaTO> getListaDetalleUsuarioSistema(String paramString)
    throws Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.SistemaTO> getListaSistema() throws java.lang.Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.FuncionRolTO> getListaFunciones() throws java.lang.Exception;

    boolean insertarUsuario(Usuario new_user,String zona,String unidad_organica) throws Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.UsuarioTO> getListaTrabajadores() throws java.lang.Exception;

    public boolean insertarfuncionRol(java.util.List<seguridad.administracion.ejb30.entity.DetalleRolFuncion> detalles, seguridad.administracion.ejb30.entity.Roles rol) throws java.lang.Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.RolTO> getListaRoles() throws java.lang.Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.DetalleFuncionRolTO> obtenerDetalleFuncionRol(int codigo);

    public boolean modificarfuncionRol(java.util.List<seguridad.administracion.ejb30.entity.DetalleRolFuncion> detallesagregar, java.util.List<seguridad.administracion.ejb30.entity.DetalleRolFuncion> detallesaeliminar, seguridad.administracion.ejb30.entity.Roles rol, int estado) throws java.lang.Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.UsuarioTO> getListaUsuarios() throws java.lang.Exception;

    public boolean eliminarUsuario(java.lang.String id_usuario) throws java.lang.Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.SistemaTO> getListaSistemasUsuario(java.lang.String loguser) throws java.lang.Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.TipoUsuarioTO> getTiposUsuarios() throws java.lang.Exception;

    public boolean setSistemasUsuario(java.util.List<seguridad.administracion.ejb30.TO.SistemaTO> sistemas, java.lang.String id_usuario) throws java.lang.Exception;

     public boolean insertarusuarioRol(java.util.List<seguridad.administracion.ejb30.entity.Detalleusuariorol> detalles, java.util.List<seguridad.administracion.ejb30.entity.Detalleusuariorol> detallese) throws java.lang.Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.DetalleUsuarioRolTO> obtenerDetalleUsuarioRol(java.lang.String codigo);

    public List<DatosUsuarioTO> getListaDatosUsuario(String log_user) throws Exception;
   
    public List<FuncionesAccessoUsuarioTO> getFuncionesAccesoUsuario(String logUser) throws Exception ;

    public java.util.List<seguridad.administracion.ejb30.TO.TipoDatoTO> getTiposDato() throws java.lang.Exception;

    public boolean agregaTiposUsuario(java.util.List<seguridad.administracion.ejb30.TO.DescripcionTiposTO> tipos, java.lang.String id_usuario) throws java.lang.Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.DescripcionTiposTO> getTiposDeUsuario(java.lang.String user) throws java.lang.Exception;

    public boolean insertarUsuario(seguridad.administracion.ejb30.entity.Usuario nuevo_user) throws java.lang.Exception;

    public boolean verificarClave(java.lang.String logUser, java.lang.String passUser) throws java.sql.SQLException;

    public boolean actualizarClave(java.lang.String usuario, java.lang.String clave_nueva) throws java.lang.Exception;

   
  
}
