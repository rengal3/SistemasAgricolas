/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.TO;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Renato
 */
public class AdmisionTO implements Serializable{
    private int idPersona;
    private String dni;
    private String hIngreso;
    private String hSalida;
    private BigDecimal horas;
    private String tipoObrero;
    private String tipoAdmision;
    private String modifico;

    public AdmisionTO() {
    }

    public AdmisionTO(int idPersona, String dni, String hIngreso, String hSalida, BigDecimal horas, String tipoObrero, String tipoAdmision, String modifico) {
        this.idPersona = idPersona;
        this.dni = dni;
        this.hIngreso = hIngreso;
        this.hSalida = hSalida;
        this.horas = horas;
        this.tipoObrero = tipoObrero;
        this.tipoAdmision = tipoAdmision;
        this.modifico = modifico;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String gethIngreso() {
        return hIngreso;
    }

    public void sethIngreso(String hIngreso) {
        this.hIngreso = hIngreso;
    }

    public String gethSalida() {
        return hSalida;
    }

    public void sethSalida(String hSalida) {
        this.hSalida = hSalida;
    }

    public BigDecimal getHoras() {
        return horas;
    }

    public void setHoras(BigDecimal horas) {
        this.horas = horas;
    }

    public String getTipoObrero() {
        return tipoObrero;
    }

    public void setTipoObrero(String tipoObrero) {
        this.tipoObrero = tipoObrero;
    }

    public String getTipoAdmision() {
        return tipoAdmision;
    }

    public void setTipoAdmision(String tipoAdmision) {
        this.tipoAdmision = tipoAdmision;
    }

    public String getModifico() {
        return modifico;
    }

    public void setModifico(String modifico) {
        this.modifico = modifico;
    }
    
    
}
