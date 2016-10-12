/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.DAO;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.sql.DataSource;
import seguridad.administracion.ejb30.TO.DescripcionTiposTO;
import seguridad.administracion.ejb30.TO.SistemaTO;
import seguridad.administracion.ejb30.TO.TipoDatoTO;
import seguridad.administracion.ejb30.TO.TipoUsuarioTO;
import seguridad.administracion.ejb30.TO.UsuarioTO;
import seguridad.administracion.ejb30.entity.DatosUsuario;
import seguridad.administracion.ejb30.entity.DatosUsuarioPK;
import seguridad.administracion.ejb30.entity.DetalleUsuarioSistema;
import seguridad.administracion.ejb30.entity.Usuario;
import seguridad.administracion.helper.Utiles_Convertir;

/**
 *
 * @author Luis_Angel
 */
@Stateless
public class SeguridadAdministracionUsuariosDAO implements SeguridadAdministracionUsuariosDAOLocal {
    @EJB
    private SeguridadAdministracionLoginDaoLocal seguridadAdministracionLoginDao;

  @Resource(name="jdbc/seguridadAdministracion")
  DataSource dsSeguridadAdministracion;

  @PersistenceContext(unitName="SeguridadAdministracion-ejbPU")
  protected EntityManager em;


   @PersistenceUnit(unitName="recursos_humanos-pu")
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


    public boolean insertarUsuario(Usuario nuevo_user,String zona,String unidad_organica) throws Exception {
          boolean retorno = false;
           try {
              this.em.persist(nuevo_user);
               this.em.flush();
               this.em.persist(new DatosUsuario(new DatosUsuarioPK(nuevo_user.getIdUsuario(), 1, nuevo_user.getIdUsuario())));
              this.em.persist(new DatosUsuario(new DatosUsuarioPK(nuevo_user.getIdUsuario(), 4, zona)));
              this.em.persist(new DatosUsuario(new DatosUsuarioPK(nuevo_user.getIdUsuario(), 2, unidad_organica)));
              this.em.flush();
              retorno = true;
            } catch (Exception e) {
           
              throw e;
            }
           return retorno;
    }

    public boolean insertarUsuario(Usuario nuevo_user) throws Exception {
          boolean retorno = false;
           try {
              this.em.persist(nuevo_user);
              this.em.flush();
              retorno = true;
            } catch (Exception e) {

              throw e;
            }
           return retorno;
    }

    public List<UsuarioTO> getListaTrabajadores() throws Exception {
        Query consulta = this.em1.createNativeQuery("select dni,zona.nom_zona,cod_uni_organizativa,Persona.ap_paterno+' '+Persona.ap_materno+' , '+Persona.nombre, zona.id_zona from trabajador inner join Persona on Trabajador.dni=Persona.codigo_persona inner join zona on Trabajador.cod_zona=zona.id_zona");
        return Utiles_Convertir.convertirToTableBeanBinding_Trabajadores(consulta.getResultList());
    }

    public List<UsuarioTO> getListaUsuarios() throws Exception {
         Query consulta = this.em.createNativeQuery("select id_usuario,nombre from usuario");
        return Utiles_Convertir.convertirToTableBeanBinding_Usuarios(consulta.getResultList());
    }

    public boolean eliminarUsuario(String id_usuario) throws Exception {
         boolean retorno = false;
           try {
              this.em.remove(this.em.find(Usuario.class, id_usuario));
              this.em.flush();

              retorno = true;
            } catch (Exception e) {

              throw e;
            }
           return retorno;
    }

    public List<SistemaTO> getListaDetalleUsuarioSistema(String loguser) throws Exception {
     Query consulta = this.em.createNativeQuery("SELECT  s.id_sistema, s.nombre_sistema FROM detalle_usuario_sistema dus inner join sistema s on dus.id_sistema=s.id_sistema where rtrim(id_usuario)='" + loguser.trim() + "'");
        return Utiles_Convertir.convertirToTableBeanBinding_Sistemas(consulta.getResultList());
     }

    public boolean setSistemasUsuario(List<SistemaTO> sistemas,String id_usuario) throws Exception {
        boolean retorno = false;
              try {
                    Query q = this.em.createNamedQuery("DetalleUsuarioSistema.findByIdUsuario");
                    q.setParameter("idUsuario",id_usuario);
                    List<DetalleUsuarioSistema> sistemas_usuario = q.getResultList();
                    for( DetalleUsuarioSistema dus :  sistemas_usuario){
                        this.em.remove(dus);
                        this.em.flush();
                    }

                     for(SistemaTO si : sistemas){
                         DetalleUsuarioSistema obj = new DetalleUsuarioSistema(id_usuario,si.getCodigo());
                         obj.setActivo(true);
                         this.em.persist(obj);
                         this.em.flush();
                    }
                retorno = true;
                  
              }  catch (Exception e) {
                         throw e;
                }
 
           return retorno;
    }


    public List<TipoUsuarioTO> getTiposUsuarios() throws Exception {
        Query consulta = this.em.createNativeQuery("SELECT  id_tipo_usuario,nom_tipo_usuario FROM tipo_usuario");
        return Utiles_Convertir.convertirToTableBeanBinding_TiposUsuario(consulta.getResultList());
    }

    public List<TipoDatoTO> getTiposDato() throws Exception {
         Query consulta = this.em.createNativeQuery("SELECT  tipo_dato,nom_tipo_dato FROM tipo_datos_usuario");
         return Utiles_Convertir.convertirToTableBeanBinding_TiposDato(consulta.getResultList());
    }

    public boolean agregaTiposUsuario(List<DescripcionTiposTO> tipos,String id_usuario) throws Exception {
        boolean retorno = false;
              try {
 
                    Query q = this.em.createNamedQuery("DatosUsuario.findByIdUsuario");
                    q.setParameter("idUsuario",id_usuario);
                    List<DatosUsuario> datos_usuario = q.getResultList();
                    for( DatosUsuario dus :  datos_usuario){
                        this.em.remove(dus);
                        this.em.flush();
                    }

                     for(DescripcionTiposTO dto : tipos){
                         DatosUsuario obj = new DatosUsuario(new DatosUsuarioPK(id_usuario,Integer.parseInt(dto.getTipo_dato()),dto.getId_descripcion_dato()));
                         this.em.persist(obj);
                         this.em.flush();
                     }
                retorno = true;

              }  catch (Exception e) {
                         throw e;
                }

           return retorno;
    }

    public List<DescripcionTiposTO> getTiposDeUsuario(String user) throws Exception {
        Query consulta = this.em.createNativeQuery("SELECT  du.tipo_dato,tdu.nom_tipo_dato,du.valor FROM datos_usuario du inner join tipo_datos_usuario tdu on du.tipo_dato=tdu.tipo_dato where du.id_usuario = '" + user + "'");
         return Utiles_Convertir.convertirToTableBeanBinding_TiposDeUsuario(consulta.getResultList());

    }

    


   

    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
 
}
