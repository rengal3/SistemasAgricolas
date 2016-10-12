/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.facade;

import java.sql.SQLException;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import seguridad.administracion.ejb30.TO.DatosUsuarioTO;
import seguridad.administracion.ejb30.TO.DescripcionTiposTO;
import seguridad.administracion.ejb30.TO.DetalleFuncionRolTO;
import seguridad.administracion.ejb30.TO.DetalleUsuarioRolTO;
import seguridad.administracion.ejb30.TO.DetalleUsuarioSistemaTO;
import seguridad.administracion.ejb30.TO.FuncionRolTO;
import seguridad.administracion.ejb30.TO.FuncionesAccessoUsuarioTO;
import seguridad.administracion.ejb30.TO.RolTO;
import seguridad.administracion.ejb30.TO.SistemaTO;
import seguridad.administracion.ejb30.TO.TipoDatoTO;
import seguridad.administracion.ejb30.TO.TipoUsuarioTO;
import seguridad.administracion.ejb30.TO.UsuarioTO;
import seguridad.administracion.ejb30.business.SeguridadAdministracionLoginLocal;
import seguridad.administracion.ejb30.business.SeguridadAdministracionRolLocal;
import seguridad.administracion.ejb30.business.SeguridadAdministracionUsuarioLocal;
import seguridad.administracion.ejb30.entity.DetalleRolFuncion;
import seguridad.administracion.ejb30.entity.Detalleusuariorol;
import seguridad.administracion.ejb30.entity.Roles;
import seguridad.administracion.ejb30.entity.Sistema;
import seguridad.administracion.ejb30.entity.Usuario;

/**
 *
 * @author Renato
 */
@Stateless
public class SeguridadAdministracionGestionFacade implements SeguridadAdministracionGestionFacadeRemote {
   
    @EJB
    private SeguridadAdministracionUsuarioLocal seguridadAdministracionUsuario;

  @EJB
  SeguridadAdministracionLoginLocal SeguridadAdministracionLoginRemote;
  @EJB
  SeguridadAdministracionRolLocal SeguridadAdministracionLocal;




  public List loguear(String logUser, String passUser, String ip, String host, String mac)
    throws SQLException
  {
    return this.SeguridadAdministracionLoginRemote.loguear(logUser, passUser, ip, host, mac);
  }

  public List desloguear(String logUser, String ip, String host, String mac) throws SQLException {
    return this.SeguridadAdministracionLoginRemote.desloguear(logUser, ip, host, mac);
  }

  public List<Sistema> listaDetalleUsuarioSistemaActivo(String logUser) throws Exception {
    return this.SeguridadAdministracionLoginRemote.listarDetalleUsuarioSistema(logUser);
  }
   public List<DetalleUsuarioSistemaTO> getListaDetalleUsuarioSistema(String paramString) throws Exception {
       return SeguridadAdministracionLoginRemote.getListaDetalleUsuarioSistema(paramString);
    }

  public List<SistemaTO> getListaSistema() throws Exception {
        return SeguridadAdministracionLocal.getListaSistema();
  }
   public List<FuncionRolTO> getListaFunciones() throws Exception {
        return SeguridadAdministracionLocal.getListaFunciones();
  }

    public boolean insertarUsuario(Usuario new_user,String zona,String unidad_organica) throws Exception {
        return this.seguridadAdministracionUsuario.insertarUsuario(new_user,zona,unidad_organica);
    }

     public List<UsuarioTO> getListaTrabajadores() throws Exception{
          return this.seguridadAdministracionUsuario.getListaTrabajadores();
     }
      public boolean insertarfuncionRol(List<DetalleRolFuncion> detalles, Roles rol) throws Exception{
      return SeguridadAdministracionLocal.insertarfuncionRol(detalles, rol);

  }
   public List<RolTO> getListaRoles() throws Exception {
    return SeguridadAdministracionLocal.getListaRoles();
  }
   public List<DetalleFuncionRolTO> obtenerDetalleFuncionRol(int codigo){
    return SeguridadAdministracionLocal.obtenerDetalleFuncionRol(codigo);
  }
    public boolean modificarfuncionRol(List<DetalleRolFuncion> detallesagregar, List<DetalleRolFuncion> detallesaeliminar, Roles rol, int estado) throws Exception{
      return SeguridadAdministracionLocal.modificarfuncionRol(detallesagregar, detallesaeliminar, rol, estado);


  }

    public List<UsuarioTO> getListaUsuarios() throws Exception{
            return this.seguridadAdministracionUsuario.getListaUsuarios();
      }
     public boolean eliminarUsuario(String id_usuario) throws Exception{
           return this.seguridadAdministracionUsuario.eliminarUsuario(id_usuario);
      }

     public List<SistemaTO> getListaSistemasUsuario(String loguser) throws Exception{
            return this.seguridadAdministracionUsuario.getListaDetalleUsuarioSistema(loguser);
     }

     public List<TipoUsuarioTO> getTiposUsuarios() throws Exception{
            return this.seguridadAdministracionUsuario.getTiposUsuarios();
     }

     public boolean setSistemasUsuario(List<SistemaTO> sistemas,String id_usuario) throws Exception{
            return this.seguridadAdministracionUsuario.setSistemasUsuario(sistemas, id_usuario);
     }
     public boolean insertarusuarioRol(List<Detalleusuariorol> detalles,List<Detalleusuariorol> detallese) throws Exception{
      return SeguridadAdministracionLocal.insertarusuarioRol(detalles, detallese);
  }

     public List<DatosUsuarioTO> getListaDatosUsuario(String log_user) throws Exception {
        return this.SeguridadAdministracionLoginRemote.getListaDatosUsuario(log_user);
     }
       public List<DetalleUsuarioRolTO> obtenerDetalleUsuarioRol(String codigo){
        return SeguridadAdministracionLocal.obtenerDetalleUsuarioRol(codigo);
       }
     public List<FuncionesAccessoUsuarioTO> getFuncionesAccesoUsuario(String logUser) throws Exception {
             return SeguridadAdministracionLoginRemote.getFuncionesAccesoUsuario(logUser);
         }

      public List<TipoDatoTO> getTiposDato() throws Exception {
            return this.seguridadAdministracionUsuario.getTiposDato();
       }

       public boolean agregaTiposUsuario(List<DescripcionTiposTO> tipos,String id_usuario) throws Exception {
            return this.seguridadAdministracionUsuario.agregaTiposUsuario(tipos,id_usuario);
       }

       public List<DescripcionTiposTO> getTiposDeUsuario(String user) throws Exception{
            return this.seguridadAdministracionUsuario.getTiposDeUsuario(user);
       }

        public boolean insertarUsuario(Usuario nuevo_user) throws Exception {
            return this.seguridadAdministracionUsuario.insertarUsuario(nuevo_user);
        }

       public boolean verificarClave(String logUser, String passUser)throws SQLException {
            return this.SeguridadAdministracionLoginRemote.verificarClave(logUser, passUser);
        }

         public boolean actualizarClave(String usuario, String clave_nueva) throws Exception{
            return this.SeguridadAdministracionLoginRemote.actualizarClave(usuario, clave_nueva);
         }

       
}
