/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.DAO;


import java.util.List;
import java.util.Vector;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.sql.DataSource;
import seguridad.administracion.ejb30.entity.Sistema;
import javax.persistence.Query;
import seguridad.administracion.ejb30.TO.DetalleFuncionRolTO;
import seguridad.administracion.ejb30.TO.DetalleUsuarioRolTO;
import seguridad.administracion.ejb30.TO.FuncionRolTO;
import seguridad.administracion.ejb30.TO.RolTO;
import seguridad.administracion.ejb30.TO.SistemaTO;
import seguridad.administracion.ejb30.TO.UsuarioTO;
import seguridad.administracion.ejb30.entity.DetalleRolFuncion;
import seguridad.administracion.ejb30.entity.DetalleRolFuncionPK;
import seguridad.administracion.ejb30.entity.Detalleusuariorol;
import seguridad.administracion.ejb30.entity.FuncionesRol;
import seguridad.administracion.ejb30.entity.Roles;
import seguridad.administracion.ejb30.entity.Usuario;
import seguridad.administracion.helper.Utiles_Convertir;



/**
 *
 * @author Diana
 */
@Stateless
public class SeguridadAdministracionRolesDAO implements SeguridadAdministracionRolesLocalDao {
  @Resource(name="jdbc/seguridadAdministracion")
  DataSource dsSeguridadAdministracion;

  @PersistenceContext(unitName="SeguridadAdministracion-ejbPU")
  protected EntityManager em;

  @PersistenceUnit(unitName="SeguridadAdministracion-pu")
    EntityManagerFactory emf;
    EntityManager em1;


 @PostConstruct
  public void inicializaBean()
  {
    this.em1 = this.emf.createEntityManager();
  }

  @PreDestroy
  public void finalizaBean() {
    this.em1.close();
  }
  
  public List<SistemaTO> getListaSistemas() throws Exception {
         Query consulta= em1.createNativeQuery("select id_sistema, nombre_sistema from sistema");
         return Utiles_Convertir.convertirToTableBeanBinding_Sistemas(consulta.getResultList());
  }
  public List<FuncionRolTO> getListaFunciones() throws Exception {
    Query consulta = this.em1.createNativeQuery("select f.id_funcion, f.descripcion, s.nombre_sistema from " +
            "funciones_rol f inner join sistema s on f.id_sistema=s.id_sistema");
    return Utiles_Convertir.convertirToTableBeanBinding_Funciones(consulta.getResultList());
  }
  public List<RolTO> getListaRoles() throws Exception {
    Query consulta = this.em1.createNativeQuery("select id_rol, descripcion_rol from roles");
    return Utiles_Convertir.convertirToTableBeanBinding_Rol(consulta.getResultList());
  }
  public int buscarRol(){
        String conss = "select top 1 id_rol from roles order by id_rol desc";
        Query consulta = this.em1.createNativeQuery(conss);
        String res=((Vector)consulta.getSingleResult()).get(0).toString();
        return Integer.parseInt(res);
  }
  public boolean insertarfuncionRol(List<DetalleRolFuncion> detalles, Roles rol) throws Exception{
      boolean retorno=false;
      EntityTransaction tx = this.em1.getTransaction();
      tx.begin();
      try {
          em1.persist(rol);
          this.em1.flush();
          for(DetalleRolFuncion deta: detalles) {
              DetalleRolFuncionPK pk= new DetalleRolFuncionPK(rol.getIdRol(),deta.getDetalleRolFuncionPK().getIdFuncion(), deta.getDetalleRolFuncionPK().getIdSistema());
              deta.setDetalleRolFuncionPK(pk);
              em1.persist(deta);
          }
          this.em1.flush();
          tx.commit();
          retorno = true;
      }
      catch (Exception e) {
      tx.rollback();
      throw e;
      }
      return retorno;


  }
  public boolean modificarfuncionRol(List<DetalleRolFuncion> detallesagregar, List<DetalleRolFuncion> detallesaeliminar, Roles rol, int estado) throws Exception{
      boolean retorno=false;
      EntityTransaction tx = this.em1.getTransaction();
      tx.begin();
      try {
          if(estado==1){
              em1.merge(rol);
              for(DetalleRolFuncion deta: detallesagregar) {
                  em1.persist(deta);
              }
              for(DetalleRolFuncion deta: detallesaeliminar) {
                  DetalleRolFuncionPK pk= new DetalleRolFuncionPK(deta.getDetalleRolFuncionPK().getIdRol(),deta.getDetalleRolFuncionPK().getIdFuncion(), deta.getDetalleRolFuncionPK().getIdSistema());
                  em1.remove(em1.merge(em1.find(DetalleRolFuncion.class, pk)));
              }
          }
          if(estado==2){
              em1.remove(em1.find(Roles.class, rol.getIdRol()));
              
          }

          this.em1.flush();
          tx.commit();
          retorno = true;
      }
      catch (Exception e) {
      tx.rollback();
      throw e;
      }
      return retorno;


  }
  public List<DetalleFuncionRolTO> obtenerDetalleFuncionRol(int codigo){
        Query consulta = this.em1.createNativeQuery("select d.id_rol,f.id_funcion,f.id_sistema,f.descripcion, " +
                "s.nombre_sistema,  d.fecha_operacion from detalle_rol_funcion d inner join funciones_rol f " +
                "on d.id_funcion=f.id_funcion  inner join sistema s on d.id_sistema= s.id_sistema where id_rol='"+codigo+"'");
       return Utiles_Convertir.convertirToTableBeanBinding_DetalleFuncion(consulta.getResultList());
  }
   public boolean insertarusuarioRol(List<Detalleusuariorol> detallesa,List<Detalleusuariorol> detallese) throws Exception{
      boolean retorno=false;
      EntityTransaction tx = this.em1.getTransaction();
      tx.begin();
      try {
          System.out.print("ta"+detallesa.size());
          System.out.print("to"+detallese.size());
          for(Detalleusuariorol deta: detallesa) {
              System.out.println("entro1110");
              em1.persist(deta);
          }
          for(Detalleusuariorol deta: detallese) {
              em1.remove(em1.find(Detalleusuariorol.class, deta.getDetalleusuariorolPK()));
              System.out.println("entro");
          }
          this.em1.flush();
          tx.commit();
          retorno = true;
      }
      catch (Exception e) {
      tx.rollback();
      throw e;
      }
      return retorno;


  }
public List<DetalleUsuarioRolTO> obtenerDetalleUsuarioRol(String codigo){
        Query consulta = this.em1.createNativeQuery("select d.id_rol, d.id_usuario, r.descripcion_rol, d.fecha_operacion" +
                " from detalle_usuario_rol d inner join roles r on d.id_rol= r.id_rol where id_usuario='"+codigo+"'");
       return Utiles_Convertir.convertirToTableBeanBinding_DetalleUsuarioRol(consulta.getResultList());
  }
}
