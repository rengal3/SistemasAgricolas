/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.business;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import seguridad.administracion.ejb30.DAO.SeguridadAdministracionRolesLocalDao;
import seguridad.administracion.ejb30.TO.DetalleFuncionRolTO;
import seguridad.administracion.ejb30.TO.DetalleUsuarioRolTO;
import seguridad.administracion.ejb30.TO.FuncionRolTO;
import seguridad.administracion.ejb30.TO.RolTO;
import seguridad.administracion.ejb30.TO.SistemaTO;
import seguridad.administracion.ejb30.entity.DetalleRolFuncion;
import seguridad.administracion.ejb30.entity.Detalleusuariorol;
import seguridad.administracion.ejb30.entity.Roles;
import seguridad.administracion.ejb30.entity.Sistema;

/**
 *
 * @author Diana
 */
@Stateless
public class SeguridadAdministracionRol implements SeguridadAdministracionRolLocal {
  @EJB
  SeguridadAdministracionRolesLocalDao seguridadAdministracionRolesDao;

   public List<SistemaTO> getListaSistema() throws Exception {
        return seguridadAdministracionRolesDao.getListaSistemas();
  }
   public List<FuncionRolTO> getListaFunciones() throws Exception {
        return seguridadAdministracionRolesDao.getListaFunciones();
  }
   public boolean insertarfuncionRol(List<DetalleRolFuncion> detalles, Roles rol) throws Exception{
      return seguridadAdministracionRolesDao.insertarfuncionRol(detalles, rol);

  }
   public List<RolTO> getListaRoles() throws Exception {
    return seguridadAdministracionRolesDao.getListaRoles();
  }
   public List<DetalleFuncionRolTO> obtenerDetalleFuncionRol(int codigo){
    return seguridadAdministracionRolesDao.obtenerDetalleFuncionRol(codigo);
  }
    public boolean modificarfuncionRol(List<DetalleRolFuncion> detallesagregar, List<DetalleRolFuncion> detallesaeliminar, Roles rol, int estado) throws Exception{
      return seguridadAdministracionRolesDao.modificarfuncionRol(detallesagregar, detallesaeliminar, rol, estado);


  }
    public boolean insertarusuarioRol(List<Detalleusuariorol> detalles,List<Detalleusuariorol> detallese) throws Exception{
      return seguridadAdministracionRolesDao.insertarusuarioRol(detalles, detallese);

  }
    public List<DetalleUsuarioRolTO> obtenerDetalleUsuarioRol(String codigo){
       return seguridadAdministracionRolesDao.obtenerDetalleUsuarioRol(codigo);
  }
 
}
