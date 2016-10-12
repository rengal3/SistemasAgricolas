/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.DAO;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;
import seguridad.administracion.ejb30.TO.DatosUsuarioTO;
import seguridad.administracion.ejb30.TO.DetalleUsuarioSistemaTO;
import seguridad.administracion.ejb30.TO.FuncionesAccessoUsuarioTO;
import seguridad.administracion.ejb30.entity.DetalleUsuarioSistema;
import seguridad.administracion.ejb30.entity.Sistema;
import seguridad.administracion.helper.Utiles_Convertir;

/**
 *
 * @author Renato
 */
@Stateless
public class SeguridadAdministracionLoginDao implements SeguridadAdministracionLoginDaoLocal {
  @Resource(name="jdbc/seguridadAdministracion")
  DataSource dsSeguridadAdministracion;

  @PersistenceContext(unitName="SeguridadAdministracion-ejbPU")
  protected EntityManager em;

  public List loguear(String logUser, String passUser, String ip, String host, String mac)
    throws SQLException
  {
    List retorno = new ArrayList(1);
    boolean aceptar = false;
    String mensaje = "";
    Connection cnx = null;
    /*try {
      cnx = this.dsSeguridadAdministracion.getConnection();
      CallableStatement csLlamada = cnx.prepareCall("{ call sp_verificaUsuario( ?, ?, ?, ?, ?, ?, ? ) }");
      csLlamada.setString(1, logUser);
      csLlamada.setString(2, passUser);
      csLlamada.setString(3, ip);
      csLlamada.setString(4, host);
      csLlamada.setString(5, mac);
      csLlamada.registerOutParameter(6, -7);
      csLlamada.registerOutParameter(7, 12);
      csLlamada.execute();
      aceptar = csLlamada.getBoolean(6);
      mensaje = csLlamada.getString(7);
    } catch (SQLException ex) {
      aceptar = false;
      mensaje = "";

      throw ex;
    } finally {
      try {
        cnx.close();
      } catch (Exception ex) {
        Logger.getLogger(SeguridadAdministracionLoginDao.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    retorno.add(new Boolean(aceptar));
    retorno.add(mensaje);*/
    retorno.add(new Boolean(true));
    retorno.add("Bienvenido");
    return retorno;
  }

  public List desloguear(String logUser, String ip, String host, String mac) throws SQLException {
    List retorno = new ArrayList(1);
    boolean aceptar = false;
    String mensaje = "";
    Connection cnx = null;
    /*try {
      cnx = this.dsSeguridadAdministracion.getConnection();
      CallableStatement csLlamada = cnx.prepareCall("{ call sp_desloguearUsuario( ?, ?, ?, ?, ?, ? ) }");
      csLlamada.setString(1, logUser);
      csLlamada.setString(2, ip);
      csLlamada.setString(3, host);
      csLlamada.setString(4, mac);
      csLlamada.registerOutParameter(5, -7);
      csLlamada.registerOutParameter(6, 12);
      csLlamada.execute();
      aceptar = csLlamada.getBoolean(5);
      mensaje = csLlamada.getString(6);
    } catch (SQLException ex) {
      aceptar = false;
      mensaje = "";

      throw ex;
    } finally {
      try {
        cnx.close();
      } catch (Exception ex) {
        Logger.getLogger(SeguridadAdministracionLoginDao.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    retorno.add(new Boolean(aceptar));
    retorno.add(mensaje);*/
    retorno.add(new Boolean(true));
    retorno.add("DESLOGUEO SATISFACTORIO");
    return retorno;
  }

  public List<Sistema> listarDetalleUsuarioSistema(String logUser) throws Exception {
    Query consulta = this.em.createNamedQuery("DetalleUsuarioSistema.findByIdUsuarioActivo");
    consulta.setParameter("idUsuario", logUser.trim());
    List<DetalleUsuarioSistema> lista = (List<DetalleUsuarioSistema>)consulta.getResultList();
    List listaSistemas = new ArrayList(1);
    for (DetalleUsuarioSistema aux : lista) {
      listaSistemas.add(aux.getSistema());
    }
    return listaSistemas;
  }

  public List<DetalleUsuarioSistemaTO> getListaDetalleUsuarioSistema(String loguser) throws Exception {
    Query consulta = this.em.createNativeQuery("SELECT id_usuario, id_sistema, activo FROM detalle_usuario_sistema where rtrim(id_usuario)='" + loguser.trim() + "'");

    return Utiles_Convertir.convertirToTableBeanBinding_CuentaContable(consulta.getResultList());
  }

    public List<DatosUsuarioTO> getListaDatosUsuario(String log_user) throws Exception {
        Query consulta = this.em.createNativeQuery("select id_usuario, tdu.tipo_dato, tdu.nom_tipo_dato, valor from datos_usuario inner join tipo_datos_usuario tdu on datos_usuario.tipo_dato=tdu.tipo_dato where datos_usuario.id_usuario='" + log_user + "'");
        return Utiles_Convertir.convertirToTableBeanBinding_DatosUsuario(consulta.getResultList());
    }

    
    public List<FuncionesAccessoUsuarioTO> getFuncionesAccesoUsuario(String logUser) throws Exception {
        Query consulta = this.em.createNativeQuery("SELECT DISTINCT Funciones_Rol.id_funcion, " +
                "Funciones_Rol.descripcion, Funciones_Rol.id_sistema, Detalle_usuario_rol.id_usuario " +
                "FROM         Detalle_usuario_rol INNER JOIN Roles ON Detalle_usuario_rol.id_rol = " +
                "Roles.id_rol INNER JOIN Detalle_Rol_Funcion ON Roles.id_rol = " +
                "Detalle_Rol_Funcion.id_rol INNER JOIN Funciones_Rol ON " +
                "Detalle_Rol_Funcion.id_funcion = Funciones_Rol.id_funcion AND " +
                "Detalle_Rol_Funcion.id_sistema = Funciones_Rol.id_sistema " +
                "WHERE     (Detalle_usuario_rol.id_usuario = '" + logUser + "')");
        return Utiles_Convertir.convertirToTableBeanBinding_FuncionesAccesoUsuario(consulta.getResultList());
    }


     public boolean actualizarClave(String usuario, String clave_nueva) throws Exception{
          boolean retorno = false;
        Connection cnx = null;
        try {

          cnx = this.dsSeguridadAdministracion.getConnection();
            String plantilla = "update usuario set contrasena=? where id_usuario=?" ;
            PreparedStatement st = cnx.prepareStatement(plantilla);
             st.setString(1, clave_nueva);
             st.setString(2, usuario);
             st.executeUpdate();
             retorno=true;
        } catch (SQLException ex) {
          retorno = false;

          throw ex;
        } finally {
          try {
            cnx.close();
          } catch (Exception ex) {
            Logger.getLogger(SeguridadAdministracionLoginDao.class.getName()).log(Level.SEVERE, null, ex);
          }
        }

        return retorno;
  }

      public boolean verificarClave(String logUser, String passUser)
    throws SQLException
  {

    boolean retorno = false;
    Connection cnx = null;
    try {

      cnx = this.dsSeguridadAdministracion.getConnection();
      CallableStatement csLlamada = cnx.prepareCall("{ call sp_verificaClave( ?, ?, ? ) }");
      csLlamada.setString(1, logUser);
      csLlamada.setString(2, passUser);
      csLlamada.registerOutParameter(3,java.sql.Types.INTEGER);
      csLlamada.execute();
      int r = csLlamada.getInt(3);
        System.out.println(""+r);
      if(r==0)
            retorno=false;
      else
            retorno = true;
    } catch (SQLException ex) {
      retorno = false;

      throw ex;
    } finally {
      try {
        cnx.close();
      } catch (Exception ex) {
        Logger.getLogger(SeguridadAdministracionLoginDao.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    return retorno;
  }

 
}
