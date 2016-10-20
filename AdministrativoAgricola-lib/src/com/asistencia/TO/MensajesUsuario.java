/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.TO;

import java.io.Serializable;

/**
 *
 * @author Renato
 */
public class MensajesUsuario implements Serializable{
    
    private boolean error=false;
    private String mensajeCabecera;
    private String mensajeCuerpo;

    public MensajesUsuario() {
    }

    public MensajesUsuario(boolean error, String mensajeCabecera, String mensajeCuerpo) {
        this.error = error;
        this.mensajeCabecera = mensajeCabecera;
        this.mensajeCuerpo = mensajeCuerpo;
    }

    public MensajesUsuario(String mensajeCabecera, String mensajeCuerpo) {
        this.mensajeCabecera = mensajeCabecera;
        this.mensajeCuerpo = mensajeCuerpo;        
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMensajeCabecera() {
        return mensajeCabecera;
    }

    public void setMensajeCabecera(String mensajeCabecera) {
        this.mensajeCabecera = mensajeCabecera;
    }

    public String getMensajeCuerpo() {
        return mensajeCuerpo;
    }

    public void setMensajeCuerpo(String mensajeCuerpo) {
        this.mensajeCuerpo = mensajeCuerpo;
    }
    
    
    
}
