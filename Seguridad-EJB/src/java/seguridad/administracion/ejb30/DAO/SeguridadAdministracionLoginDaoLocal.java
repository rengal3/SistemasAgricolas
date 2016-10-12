/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.DAO;

import java.sql.SQLException;
import java.util.List;
import javax.ejb.Local;
import seguridad.administracion.ejb30.TO.DatosUsuarioTO;
import seguridad.administracion.ejb30.TO.DetalleUsuarioSistemaTO;
import seguridad.administracion.ejb30.TO.FuncionesAccessoUsuarioTO;
import seguridad.administracion.ejb30.entity.Sistema;

/**
 *
 * @author Renato
 */
@Local
public interface SeguridadAdministracionLoginDaoLocal {
   public  List loguear(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
    throws SQLException;

  public  List desloguear(String paramString1, String paramString2, String paramString3, String paramString4)
    throws SQLException;

  public  List<Sistema> listarDetalleUsuarioSistema(String paramString)
    throws Exception;

  public  List<DetalleUsuarioSistemaTO> getListaDetalleUsuarioSistema(String paramString)
    throws Exception;

    List<DatosUsuarioTO> getListaDatosUsuario(String log_user) throws Exception;

    List<FuncionesAccessoUsuarioTO> getFuncionesAccesoUsuario(String logUser) throws Exception;

    public boolean actualizarClave(java.lang.String usuario, java.lang.String clave_nueva) throws java.lang.Exception;

    public boolean verificarClave(java.lang.String logUser, java.lang.String passUser) throws java.sql.SQLException;
}
