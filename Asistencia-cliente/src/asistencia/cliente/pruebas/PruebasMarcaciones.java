/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistencia.cliente.pruebas;

import asistencia.delegate.GestionAsistenciaDelegate;
import com.asistencia.TO.MensajesUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Renato
 */
public class PruebasMarcaciones {
    
    public static void main(String ar[]){
        try {
            //MensajesUsuario ret=GestionAsistenciaDelegate.getInstance().procesarRegistroMarcacion("001", "43516825", "08/10/2016", "12:15");
            MensajesUsuario ret=GestionAsistenciaDelegate.getInstance().procesarRegistroMarcacion("001", "43468270", "08/10/2016", "12:15");
            System.out.println(ret.getMensajeCabecera()+"\t"+ret.getMensajeCuerpo());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
