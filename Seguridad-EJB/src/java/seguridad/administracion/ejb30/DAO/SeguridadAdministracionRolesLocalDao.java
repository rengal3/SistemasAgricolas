/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.DAO;

import javax.ejb.Local;

/**
 *
 * @author Diana
 */
@Local
public interface SeguridadAdministracionRolesLocalDao {

    public java.util.List<seguridad.administracion.ejb30.TO.SistemaTO> getListaSistemas() throws java.lang.Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.FuncionRolTO> getListaFunciones() throws java.lang.Exception;

    public boolean insertarfuncionRol(java.util.List<seguridad.administracion.ejb30.entity.DetalleRolFuncion> detalles, seguridad.administracion.ejb30.entity.Roles rol) throws java.lang.Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.RolTO> getListaRoles() throws java.lang.Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.DetalleFuncionRolTO> obtenerDetalleFuncionRol(int codigo);

     public boolean modificarfuncionRol(java.util.List<seguridad.administracion.ejb30.entity.DetalleRolFuncion> detallesagregar,java.util.List<seguridad.administracion.ejb30.entity.DetalleRolFuncion> detalleseliminar, seguridad.administracion.ejb30.entity.Roles rol, int estado) throws java.lang.Exception;

    public boolean insertarusuarioRol(java.util.List<seguridad.administracion.ejb30.entity.Detalleusuariorol> detallesa, java.util.List<seguridad.administracion.ejb30.entity.Detalleusuariorol> detallese) throws java.lang.Exception;

    public java.util.List<seguridad.administracion.ejb30.TO.DetalleUsuarioRolTO> obtenerDetalleUsuarioRol(java.lang.String codigo);

    

    
}
