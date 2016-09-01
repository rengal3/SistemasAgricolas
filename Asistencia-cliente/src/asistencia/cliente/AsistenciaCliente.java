/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistencia.cliente;

import asistencia.delegate.GestionAsistenciaDelegate;
import com.asistencia.TO.AdmisionTipoTO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Renato
 */
public class AsistenciaCliente {

    public static String nombre;
    public int i=0;
    public static String apellido;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nombre="renato";
        apellido="Vilchez";
        
        try {
            List<AdmisionTipoTO> lista=GestionAsistenciaDelegate.getInstance().getListaAdmisionTipoTO();
            for(AdmisionTipoTO admision:lista){
                System.out.println(admision.getId()+"-"+admision.getDescripcion()+"-"+admision.getSigla());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(AsistenciaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
