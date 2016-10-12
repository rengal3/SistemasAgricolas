/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.business;

import java.sql.SQLException;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import seguridad.administracion.ejb30.DAO.SeguridadAdministracionLoginDaoLocal;
import seguridad.administracion.ejb30.TO.DatosUsuarioTO;
import seguridad.administracion.ejb30.TO.DetalleUsuarioSistemaTO;
import seguridad.administracion.ejb30.TO.FuncionesAccessoUsuarioTO;
import seguridad.administracion.ejb30.entity.Sistema;

/**
 *
 * @author Renato
 */
@Stateless
public class SeguridadAdministracionLogin implements SeguridadAdministracionLoginLocal {
  @EJB
  SeguridadAdministracionLoginDaoLocal seguridadAdministracionLoginDAORemote;

  public List loguear(String logUser, String passUser, String ip, String host, String mac)
    throws SQLException
  {
    return this.seguridadAdministracionLoginDAORemote.loguear(logUser, passUser, ip, host, mac);
  }

  public List desloguear(String logUser, String ip, String host, String mac) throws SQLException {
    return this.seguridadAdministracionLoginDAORemote.desloguear(logUser, ip, host, mac);
  }

  public List<Sistema> listarDetalleUsuarioSistema(String logUser) throws Exception {
    return this.seguridadAdministracionLoginDAORemote.listarDetalleUsuarioSistema(logUser);
  }

  public List<DetalleUsuarioSistemaTO> getListaDetalleUsuarioSistema(String loguser) throws Exception {
    return this.seguridadAdministracionLoginDAORemote.getListaDetalleUsuarioSistema(loguser);
  }

  public List<DatosUsuarioTO> getListaDatosUsuario(String log_user) throws Exception {
    return this.seguridadAdministracionLoginDAORemote.getListaDatosUsuario(log_user);
  }
  public List<FuncionesAccessoUsuarioTO> getFuncionesAccesoUsuario(String logUser) throws Exception {
      return this.seguridadAdministracionLoginDAORemote.getFuncionesAccesoUsuario(logUser);
  }

    public boolean verificarClave(String logUser, String passUser)throws SQLException {
        return this.seguridadAdministracionLoginDAORemote.verificarClave(logUser, passUser);
  }

   public boolean actualizarClave(String usuario, String clave_nueva) throws Exception{
        return this.seguridadAdministracionLoginDAORemote.actualizarClave(usuario, clave_nueva);
   }

}
