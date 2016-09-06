/*
 * Utiles_MensajesDialogo.java
 *
 * Created on 17 de julio de 2007, 10:16
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.helper;
import javax.swing.*;
/**
 *
 * @author Renato
 */
public class Utiles_MensajesDialogo {
    
    /** Creates a new instance of Utiles_MensajesDialogo */
    public Utiles_MensajesDialogo() {
    }
    
    public static void mensajeInfo( String m ){
        
        try{
             JOptionPane.showMessageDialog( null, m, "Informacion", JOptionPane.INFORMATION_MESSAGE );
        }catch( Exception er ){
            er.printStackTrace();
        }
        
    }
    
    public static void mensajeError( String m ){        
        try{
             JOptionPane.showMessageDialog( null, m, "Error", JOptionPane.ERROR_MESSAGE );
        }catch( Exception er ){
            er.printStackTrace();
        }        
    }
    
    public static void mensajeAlerta( String m ){
        try{
             JOptionPane.showMessageDialog( null, m, "Alerta", JOptionPane.WARNING_MESSAGE );
        }catch( Exception er ){
            er.printStackTrace();
        }        
    }
    
    public static boolean mensajeConfirmacion( String m ){
        int x = -1;
        try{
            x = JOptionPane.showConfirmDialog( null, m, "Confirmacion", JOptionPane.YES_NO_OPTION );
            if( JOptionPane.YES_OPTION == x ){
                return true;
            }
        }catch( Exception er ){
            er.printStackTrace();
        }       
        return false;
    }

    public static void mensajeExito(  ){

        try{
             JOptionPane.showMessageDialog( null, "La operación se realizo satisfactoriamente", "Resultado de la Operacion", JOptionPane.INFORMATION_MESSAGE );
        }catch( Exception er ){
            er.printStackTrace();
        }

    }

    public static void mensajeFracaso( String m ){
        try{
             JOptionPane.showMessageDialog( null, "La operacion no se pudo completar: " + m, "Resultado de la operacion", JOptionPane.ERROR_MESSAGE );
        }catch( Exception er ){
            er.printStackTrace();
        }
    }
    
}
