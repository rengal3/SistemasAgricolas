/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asistencia.business;

import com.asistencia.DAO.AsistenciaDAOLocal;
import com.asistencia.DAO.HorariosDAOLocal;
import com.asistencia.DAO.ObtenerParametrosSingletonLocal;
import com.asistencia.DAO.TiposDAOLocal;
import com.asistencia.DAO.TrabajadorDAOLocal;
import com.asistencia.TO.MensajesUsuario;
import com.asistencia.entity.AsistenciaResumen;
import com.asistencia.entity.AsistenciaResumenPK;
import com.asistencia.entity.DAO.AsistenciaResumenFacadeLocal;
import com.asistencia.entity.Horarios;
import com.asistencia.entity.Trabajador;
import com.asistencia.helper.Buscar;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

/**
 *
 * @author Renato
 */
@Stateless
public class AsistenciaBusiness implements AsistenciaBusinessLocal {

    int minutosTolerancia=0,minutosMaximosAntes=0,minutosMaximosDespues=0,minutosEntreMarcaciones=0;
    
    @EJB
    AsistenciaDAOLocal asistenciaDao;
    
    @EJB
    AsistenciaResumenFacadeLocal asistenciaResumenEntityDAO;
    
    @EJB
    HorariosDAOLocal horariosDAO;

    @EJB
    TiposDAOLocal tiposDAO;
    
    @EJB
    TrabajadorDAOLocal trabajadorDAO;
    
    @EJB
    ObtenerParametrosSingletonLocal parametrosSingleton;
    
    
    @PostConstruct
    public void obtenerParametrosAsietencia(){
        
    }
    
    private MensajesUsuario aplicarPoliticasMarcaciones(Horarios horario,String hora,AsistenciaResumen marcacionAnterior){
        MensajesUsuario ret=new MensajesUsuario();
        
        return ret;
    }
    
    @Override
    public MensajesUsuario procesarRegistroMarcacion(String idempresa,String dni,String fecha,String hora) throws Exception{        
        MensajesUsuario retorno=new MensajesUsuario();
        //lee los minutos de tolerancia        
        minutosTolerancia=Buscar.buscarTipoPorTablaCodigo(parametrosSingleton.getListaTipos(), "opciones_sistema", "A-001",idempresa).getCantidad().intValue();
        
        //lee los minutos máximos permitidos para marcar antes del horario        
        minutosMaximosAntes=Buscar.buscarTipoPorTablaCodigo(parametrosSingleton.getListaTipos(), "opciones_sistema", "A-002",idempresa).getCantidad().intValue();
        
        //lee los minutos máximos permitidos para marcar después del horario        
        minutosMaximosDespues=Buscar.buscarTipoPorTablaCodigo(parametrosSingleton.getListaTipos(), "opciones_sistema", "A-003",idempresa).getCantidad().intValue();
         
        //lee los minutos máximos permitidos entre marcaciones        
        minutosEntreMarcaciones=Buscar.buscarTipoPorTablaCodigo(parametrosSingleton.getListaTipos(), "opciones_sistema", "A-004",idempresa).getCantidad().intValue();
        
        //buscar id del trabajador por DNI
        Trabajador trabBuscado=trabajadorDAO.buscarTrabajadorPorDNI(dni);
        if(trabBuscado==null){
                retorno.setError(true);
                retorno.setMensajeCabecera("DNI : "+dni);
                retorno.setMensajeCuerpo("NO HA SIDO REGISTRADO. REGISTRESE COMO TRABAJADOR EN EL SISTEMA");
                return retorno;
        }
        String nombre=trabBuscado.getIdPersona().getApPaterno().trim()+" "+
                    trabBuscado.getIdPersona().getApMaterno().trim()+" , "+
                    trabBuscado.getIdPersona().getNombres().trim();
        //buscar el horario para el dni
        Horarios h=horariosDAO.getHorarioByDNI(dni);
        if(h==null){
                retorno.setError(true);
                retorno.setMensajeCabecera(nombre);
                retorno.setMensajeCuerpo("NO TIENE ASIGNADO HORARIO");
                return retorno;
        }
        //-------------------------------------------------------------------------------------------------
        //buscar marcaciones realizadas en el mismo día
        AsistenciaResumen marcacionAnterior=asistenciaDao.buscarMarcacionDiaria(fecha, idempresa, trabBuscado.getIdTrabajador());
        
        //borrar despues
        System.out.println("-----------opciones---------------------");
        System.out.println("tolerancia: "+minutosTolerancia);
        System.out.println("antes: "+minutosMaximosAntes);
        System.out.println("despues: "+minutosMaximosDespues);
        System.out.println("entre: "+minutosEntreMarcaciones);        
        System.out.println("Horario Establecido :"+h.getM1()+" : "+h.getM2());
        System.out.println("Marcacion brindada: "+fecha+"  -  "+hora);
        //fin borrar-------------------------------------------------
        
        if(marcacionAnterior==null){
            String anio=fecha.substring(6,10 );
            String mes=fecha.substring(3,5);
            String dia=fecha.substring(0, 2);
            
            int horaMarcada=Integer.valueOf(hora.substring(0, 2));
            int minuMarcada=Integer.valueOf(hora.substring(3, 5));
            
            int horaHorario1=Integer.valueOf(h.getM1().substring(0, 2));
            int minuHorario1=Integer.valueOf(h.getM1().substring(3, 5));
            
            //verificar que la primera marcación del día no se haga antes de X minutos antes del horario
            LocalTime m1=new LocalTime(horaMarcada,minuMarcada);        
            LocalTime m2=new LocalTime(horaHorario1,minuHorario1);
            if(m1.compareTo(m2.minusMinutes(minutosMaximosAntes))<0){
                retorno.setError(true);
                retorno.setMensajeCabecera(nombre);
                retorno.setMensajeCuerpo("MARCACION FUERA DEL HORARIO ESTABLECIDO. SU HORARIO EMPIEZA A LAS: "+h.getM1().trim());
                return retorno;
            }
            //-----------------------------------------------------------------------------------------
            
            AsistenciaResumen marcacion=new AsistenciaResumen();
            if(Buscar.buscarVerificarSiFeriado(parametrosSingleton.getListaTipos(), fecha, idempresa)){
                marcacion.setFeriado(true);
            }
            LocalDate da=new LocalDate(Integer.parseInt(anio),Integer.parseInt(mes),Integer.parseInt(dia));
            if(da.getDayOfWeek()==7){
                marcacion.setDominical(true);
            }
            marcacion.setAsistenciaResumenPK(new AsistenciaResumenPK(fecha, idempresa, trabBuscado.getIdTrabajador()));
            marcacion.setAnio(anio);
            marcacion.setMes(mes);
            marcacion.setNombres(nombre);
            marcacion.setIdDocumento(dni);
            marcacion.setM1(hora);
            asistenciaResumenEntityDAO.create(marcacion);
            retorno.setMensajeCuerpo("1° MARCACION CORRECTAMENTE REGISTRADA");
            retorno.setMensajeCabecera(nombre);
        }else{
            if(marcacionAnterior.getM2()==null){
                marcacionAnterior.setM2(hora);
                asistenciaResumenEntityDAO.edit(marcacionAnterior);
                retorno.setMensajeCuerpo("2° MARCACION CORRECTAMENTE REGISTRADA");
                retorno.setMensajeCabecera(nombre);
            }else if(marcacionAnterior.getM3()==null){
                marcacionAnterior.setM3(hora);
                asistenciaResumenEntityDAO.edit(marcacionAnterior);
                retorno.setMensajeCabecera("3° MARCACION CORRECTAMENTE REGISTRADA");
                retorno.setMensajeCuerpo(nombre);
            }else if(marcacionAnterior.getM4()==null){
                marcacionAnterior.setM4(hora);
                asistenciaResumenEntityDAO.edit(marcacionAnterior);
                retorno.setMensajeCuerpo("4° MARCACION CORRECTAMENTE REGISTRADA");
                retorno.setMensajeCabecera(nombre);
            }else if(marcacionAnterior.getM5()==null){
                marcacionAnterior.setM5(hora);
                asistenciaResumenEntityDAO.edit(marcacionAnterior);
                retorno.setMensajeCuerpo("5° MARCACION CORRECTAMENTE REGISTRADA");
                retorno.setMensajeCabecera(nombre);
            }else{
                marcacionAnterior.setM6(hora);
                asistenciaResumenEntityDAO.edit(marcacionAnterior);
                retorno.setMensajeCuerpo("6 ° MARCACION CORRECTAMENTE REGISTRADA");
                retorno.setMensajeCabecera(nombre);
            }
        }
        
        
        
        return retorno;
    }
    

    
    
    
}
