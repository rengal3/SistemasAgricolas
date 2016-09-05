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
public class AdmisionTipoTO implements Serializable{
    
    private int id;    
    private String descripcion;    
    private String sigla;    
    private int mostrar;

    public AdmisionTipoTO() {
    }

    public AdmisionTipoTO(int id, String descripcion, String sigla, int mostrar) {
        this.id = id;
        this.descripcion = descripcion;
        this.sigla = sigla;
        this.mostrar = mostrar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getMostrar() {
        return mostrar;
    }

    public void setMostrar(int mostrar) {
        this.mostrar = mostrar;
    }
    
    @Override
    public String toString() {
        return sigla+" - "+descripcion+ "id tipos AdmisionTipoTO "+id ;
    }
    
}
