/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.business;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import seguridad.administracion.ejb30.DAO.SeguridadAdministracionUsuariosDAOLocal;
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
@Stateless
public class SeguridadAdministracionUsuario implements SeguridadAdministracionUsuarioLocal {
    @EJB
    private SeguridadAdministracionUsuariosDAOLocal seguridadAdministracionUsuariosDAO;

    public boolean insertarUsuario(Usuario new_user,String zona,String unidad_organica) throws Exception {
        return this.seguridadAdministracionUsuariosDAO.insertarUsuario(new_user,zona,unidad_organica);
    }

     public List<UsuarioTO> getListaTrabajadores() throws Exception{
        return this.seguridadAdministracionUsuariosDAO.getListaTrabajadores();
     }

      public List<UsuarioTO> getListaUsuarios() throws Exception{
        return this.seguridadAdministracionUsuariosDAO.getListaUsuarios();
      }

      public boolean eliminarUsuario(String id_usuario) throws Exception{
        return this.seguridadAdministracionUsuariosDAO.eliminarUsuario(id_usuario);
      }

       public List<SistemaTO> getListaDetalleUsuarioSistema(String loguser) throws Exception{
        return this.seguridadAdministracionUsuariosDAO.getListaDetalleUsuarioSistema(loguser);
       }

       public List<TipoUsuarioTO> getTiposUsuarios() throws Exception{
        return this.seguridadAdministracionUsuariosDAO.getTiposUsuarios();
       }

       public boolean setSistemasUsuario(List<SistemaTO> sistemas,String id_usuario) throws Exception{
        return this.seguridadAdministracionUsuariosDAO.setSistemasUsuario(sistemas, id_usuario);
       }

        public List<TipoDatoTO> getTiposDato() throws Exception {
            return this.seguridadAdministracionUsuariosDAO.getTiposDato();
        }

         public boolean agregaTiposUsuario(List<DescripcionTiposTO> tipos,String id_usuario) throws Exception {
                return this.seguridadAdministracionUsuariosDAO.agregaTiposUsuario(tipos, id_usuario);
         }

         public List<DescripcionTiposTO> getTiposDeUsuario(String user) throws Exception{
                return this.seguridadAdministracionUsuariosDAO.getTiposDeUsuario(user);
         }

          public boolean insertarUsuario(Usuario nuevo_user) throws Exception {
                return this.seguridadAdministracionUsuariosDAO.insertarUsuario(nuevo_user);
          }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
 
}
