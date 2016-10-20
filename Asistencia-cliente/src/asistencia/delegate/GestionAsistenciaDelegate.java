/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistencia.delegate;

import com.asistencia.TO.AdmisionTO;
import com.asistencia.TO.AdmisionTipoTO;
import com.asistencia.TO.MensajesUsuario;
import com.asistencia.facade.AsistenciaFacadeRemote;
import java.util.List;
import java.util.Properties;
import javax.naming.InitialContext;

/**
 *
 * @author Renato
 */
public class GestionAsistenciaDelegate {
     private static GestionAsistenciaDelegate gestionDelegate;
    private AsistenciaFacadeRemote gestionFacade;
    
    private GestionAsistenciaDelegate() throws Exception{
        try{
         Properties props = new Properties();
            /*props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
            props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
            props.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
            */props.setProperty("org.omg.CORBA.ORBInitialHost", "127.0.0.1");
            props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
         
          InitialContext ctx = new InitialContext(props);  
            
           //InitialContext ctx = new InitialContext();
          this.gestionFacade = ((AsistenciaFacadeRemote)
                  ctx.lookup("com.asistencia.facade.AsistenciaFacadeRemote"));

        }
        catch (Exception e) {
            throw e;
        }
    }
    
    public static GestionAsistenciaDelegate getInstance() throws Exception {
    if (gestionDelegate == null) {
      gestionDelegate = new GestionAsistenciaDelegate();
    }
    return gestionDelegate;
  }

    public MensajesUsuario procesarRegistroMarcacion(String idempresa, String dni, String fecha, String hora) throws Exception {
        return gestionFacade.procesarRegistroMarcacion(idempresa, dni, fecha, hora);
    }

    
    public void insertaAdmisionTipo(AdmisionTipoTO admision) throws Exception {
        //gestionFacade.insertarAdmisionTipo(admision);
    }
    /*
    public List<AdmisionTipoTO> getListaAdmisionTipoTO() throws Exception {
        return gestionFacade.getListaAdmisionTipoTO();
    }

    public List<AdmisionTO> getListaAdmision() throws Exception {
        return gestionFacade.getListaAdmision();
    }
    public void modificarAdmisionTipo(AdmisionTipoTO admision)throws Exception{
         gestionFacade.modificarAdmisionTipo(admision);
     }
     public void eliminaAdmisionTipos(AdmisionTipoTO admision1)throws Exception{
         //System.out.println("id gestionasistencia delegate:id "+admision1.getId());
        // admision1.getId();
         gestionFacade.eliminaAdmisionTipos(admision1);
//         System.out.println("id gestionasistencia delegate: adminsion "+admision1);
     }
    */
    

   
}
