/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistencia.cliente.pruebas;

import asistencia.delegate.GestionAsistenciaDelegate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Renato
 */
public class PruebasMarcaciones {
    
    public static void main(String ar[]){
        try {
            GestionAsistenciaDelegate.getInstance().procesarRegistroMarcacion("001", "43516825", "13/10/2016", "05:00");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
