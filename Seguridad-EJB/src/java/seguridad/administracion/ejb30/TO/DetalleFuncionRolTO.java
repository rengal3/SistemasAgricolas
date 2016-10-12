/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.ejb30.TO;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author CAROLINA
 */
public class DetalleFuncionRolTO implements Serializable{
    int codigo;
    String codfuncion;
    int codsistema;
    String funcion;
    String sistema;
    Date fecha;

    public DetalleFuncionRolTO() {
    }

    public DetalleFuncionRolTO(int codigo, String codfuncion, int codsistema, String funcion, String sistema, Date fecha) {
        this.codigo = codigo;
        this.codfuncion = codfuncion;
        this.codsistema = codsistema;
        this.funcion = funcion;
        this.sistema = sistema;
        this.fecha = fecha;
    }

    public String getCodfuncion() {
        return codfuncion;
    }

    public void setCodfuncion(String codfuncion) {
        this.codfuncion = codfuncion;
    }

    public int getCodsistema() {
        return codsistema;
    }

    public void setCodsistema(int codsistema) {
        this.codsistema = codsistema;
    }

   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }



}
