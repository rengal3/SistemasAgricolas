/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.TO;

import com.helper.NativeQueryResultColumn;
import com.helper.NativeQueryResultEntity;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Renato
 */
@NativeQueryResultEntity
public class AdmisionTO implements Serializable{
    @NativeQueryResultColumn(index=0)
    private int idPersona;
    @NativeQueryResultColumn(index=1)
    private String dni;
    @NativeQueryResultColumn(index=2)
    private String hIngreso;
    @NativeQueryResultColumn(index=3)
    private String hSalida;
    @NativeQueryResultColumn(index=4)
    private BigDecimal horas;
    @NativeQueryResultColumn(index=5)
    private String tipoObrero;
    @NativeQueryResultColumn(index=6)
    private String tipoAdmision;
    @NativeQueryResultColumn(index=7)
    private String modifico;

    @NativeQueryResultColumn(index=8)
    private int idAdmision;
    
    public AdmisionTO() {
    }

    public AdmisionTO(int idPersona, String dni, String hIngreso, String hSalida,
            BigDecimal horas, String tipoObrero, String tipoAdmision, String modifico,int idadmision) {
        this.idPersona = idPersona;
        this.dni = dni;
        this.hIngreso = hIngreso;
        this.hSalida = hSalida;
        this.horas = horas;
        this.tipoObrero = tipoObrero;
        this.tipoAdmision = tipoAdmision;
        this.modifico = modifico;
        this.idAdmision=idadmision;
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

    public int getIdAdmision() {
        return idAdmision;
    }

    public void setIdAdmision(int idAdmision) {
        this.idAdmision = idAdmision;
    }
    
    
}
