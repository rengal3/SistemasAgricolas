/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridad.administracion.helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import seguridad.administracion.ejb30.TO.DatosUsuarioTO;
import seguridad.administracion.ejb30.TO.DescripcionTiposTO;
import seguridad.administracion.ejb30.TO.DetalleFuncionRolTO;
import seguridad.administracion.ejb30.TO.DetalleUsuarioRolTO;
import seguridad.administracion.ejb30.TO.DetalleUsuarioSistemaTO;
import seguridad.administracion.ejb30.TO.FuncionRolTO;
import seguridad.administracion.ejb30.TO.FuncionesAccessoUsuarioTO;
import seguridad.administracion.ejb30.TO.RolTO;
import seguridad.administracion.ejb30.TO.SistemaTO;
import seguridad.administracion.ejb30.TO.TipoDatoTO;
import seguridad.administracion.ejb30.TO.TipoUsuarioTO;
import seguridad.administracion.ejb30.TO.UsuarioTO;

/**
 *
 * @author Renato
 */
public class Utiles_Convertir {

  public static List<DetalleUsuarioSistemaTO> convertirToTableBeanBinding_CuentaContable(List datos)
  {
    List lista = new ArrayList(1);
    for (Iterator i$ = datos.iterator(); i$.hasNext(); )
    {
      Object obj = i$.next();
      Object[] array = ((List)obj).toArray();
      String d1;
      try
      {
        d1 = array[0].toString();
      } catch (Exception e) {
        d1 = "";
      }
      Integer d2;
      try {
        d2 = new Integer(array[1].toString());
      } catch (Exception e) {
        d2 = null;
      }      
      Boolean d4;
      try {
        d4 = new Boolean(array[2].toString());
      } catch (Exception e) {
        d4 = null;
      }
      lista.add(new DetalleUsuarioSistemaTO(d1, d2, d4));
    }
    return lista;
  }
    public static List<FuncionRolTO> convertirToTableBeanBinding_Funciones(List datos)
  {
    List lista = new ArrayList(1);
    for (Iterator i$ = datos.iterator(); i$.hasNext(); )
    {
      Object obj = i$.next();
      Object[] array = ((List)obj).toArray();
       String d1;
      try {
        d1 = array[0].toString();
      } catch (Exception e) {
        d1 = null;
      }
      String d2;
      try {
        d2 = array[1].toString();
      } catch (Exception e) {
        d2 = null;
      }
       String d3;
      try {
        d3 = array[2].toString();
      } catch (Exception e) {
        d3 = null;
      }

      lista.add(new FuncionRolTO(d1, d2, d3));
    }
    return lista;
  }
    public static List<SistemaTO> convertirToTableBeanBinding_Sistemas(List datos)
  {
    List lista = new ArrayList(1);
    for (Iterator i$ = datos.iterator(); i$.hasNext(); )
    {
      Object obj = i$.next();
      Object[] array = ((List)obj).toArray();
      Integer d1;
      try
      {
        d1 = new Integer(array[0].toString());
      } catch (Exception e) {
        d1 = null;
      }
      String d2;
      try {
        d2 = array[1].toString();
      } catch (Exception e) {
        d2 = null;
      }


      lista.add(new SistemaTO(d1, d2));
    }
    return lista;
  }

     public static List<TipoUsuarioTO> convertirToTableBeanBinding_TiposUsuario(List datos){
            List lista = new ArrayList(1);
            for (Iterator i$ = datos.iterator(); i$.hasNext(); )
            {
              Object obj = i$.next();
              Object[] array = ((List)obj).toArray();
              Integer d1;
              try
              {
                d1 = new Integer(array[0].toString());
              } catch (Exception e) {
                d1 = null;
              }
              String d2;
              try {
                d2 = array[1].toString();
              } catch (Exception e) {
                d2 = null;
              }


              lista.add(new TipoUsuarioTO(d1, d2));
            }
            return lista;
    }

    public static List<UsuarioTO> convertirToTableBeanBinding_Trabajadores(List datos)
  {
    List lista = new ArrayList(1);
    for (Iterator i$ = datos.iterator(); i$.hasNext(); )
    {
      Object obj = i$.next();
      Object[] array = ((List)obj).toArray();
      
      String d1;
      try {
        d1 = array[0].toString();
      } catch (Exception e) {
        d1 = "";
      }
      String d2;
      try {
        d2 = array[1].toString();
      } catch (Exception e) {
        d2 = "";
      }
      String d3;
      try {
        d3 = array[2].toString();
      } catch (Exception e) {
        d3 = "";
      }
       String d4;
      try {
        d4 = array[3].toString();
      } catch (Exception e) {
        d4 = "";
      }
        String d5;
      try {
        d5 = array[4].toString();
      } catch (Exception e) {
        d5 = "";
      }

      lista.add(new UsuarioTO(d1, d2,d3,d4,d5));
    }
    return lista;
  }
    public static List<DetalleFuncionRolTO> convertirToTableBeanBinding_DetalleFuncion(List datos)
  {
    List lista = new ArrayList(1);
    for (Iterator i$ = datos.iterator(); i$.hasNext(); )
    {
      Object obj = i$.next();
      Object[] array = ((List)obj).toArray();
      Integer d1;
      try
      {
        d1 = new Integer(array[0].toString());
      } catch (Exception e) {
        d1 = null;
      }
      String d2;
      try {
        d2 = array[1].toString();
      } catch (Exception e) {
        d2 = null;
      }
      Integer d3;
      try
      {
        d3 = new Integer(array[2].toString());
      } catch (Exception e) {
        d3 = null;
      }
      String d4;
      try {
        d4= array[3].toString();
      } catch (Exception e) {
        d4 = null;
      }
      String d5;
      try {
        d5 = array[4].toString();
      } catch (Exception e) {
        d5 = null;
      }
      Date d6;
      try {
        d6= new Date(array[5].toString());
      } catch (Exception e) {
        d6 = null;
      }

      lista.add(new DetalleFuncionRolTO(d1, d2,d3, d4, d5,d6));
    }
    return lista;
  }
public static List<RolTO> convertirToTableBeanBinding_Rol(List datos)
  {
    List lista = new ArrayList(1);
    for (Iterator i$ = datos.iterator(); i$.hasNext(); )
    {
      Object obj = i$.next();
      Object[] array = ((List)obj).toArray();
      Integer d1;
      try
      {
        d1 = new Integer(array[0].toString());
      } catch (Exception e) {
        d1 = null;
      }
      String d2;
      try {
        d2 = array[1].toString();
      } catch (Exception e) {
        d2 = null;
      }

      lista.add(new RolTO(d1, d2));
    }
    return lista;
  }

   public static List<UsuarioTO>convertirToTableBeanBinding_Usuarios(List datos){
       List lista = new ArrayList(1);
    for (Iterator i$ = datos.iterator(); i$.hasNext(); )
    {
      Object obj = i$.next();
      Object[] array = ((List)obj).toArray();
      String d1;
      try
      {
        d1 = array[0].toString();
      } catch (Exception e) {
        d1 = "";
      }
      String d2;
      try {
        d2 = array[1].toString();
      } catch (Exception e) {
        d2 = null;
      }

      lista.add(new UsuarioTO(d1, d2));
    }
    return lista;
   }
    public static List<DetalleUsuarioRolTO> convertirToTableBeanBinding_DetalleUsuarioRol(List datos)
  {
    List lista = new ArrayList(1);
    for (Iterator i$ = datos.iterator(); i$.hasNext(); )
    {
      Object obj = i$.next();
      Object[] array = ((List)obj).toArray();
      Integer d1;
      try
      {
        d1 = new Integer(array[0].toString());
      } catch (Exception e) {
        d1 = null;
      }
      String d2;
      try {
        d2 = array[1].toString();
      } catch (Exception e) {
        d2 = null;
      }
      String d3;
      try {
        d3 = array[2].toString();
      } catch (Exception e) {
        d3 = null;
      }
     
      Date d4;
      try {
        d4= new Date(array[3].toString());
      } catch (Exception e) {
        d4 = new Date();
      }

      lista.add(new DetalleUsuarioRolTO(d1, d2,d3, d4));
    }
    return lista;
  }

     public static List<DatosUsuarioTO>convertirToTableBeanBinding_DatosUsuario(List datos){
       List lista = new ArrayList(1);
    for (Iterator i$ = datos.iterator(); i$.hasNext(); )
    {
      Object obj = i$.next();
      Object[] array = ((List)obj).toArray();
      String d1;
      try
      {
        d1 = array[0].toString();
      } catch (Exception e) {
        d1 = "";
      }
      String d2;
      try {
        d2 = array[1].toString();
      } catch (Exception e) {
        d2 = null;
      }
      String d3;
      try {
        d3 = array[2].toString();
      } catch (Exception e) {
        d3 = null;
      }
      String d4;
      try {
        d4 = array[3].toString();
      } catch (Exception e) {
        d4 = null;
      }

      lista.add(new DatosUsuarioTO(d1, d2,d3,d4));
    }
    return lista;
   }

     public static List<FuncionesAccessoUsuarioTO>convertirToTableBeanBinding_FuncionesAccesoUsuario(List datos){
       List lista = new ArrayList(1);
    for (Iterator i$ = datos.iterator(); i$.hasNext(); )
    {
      Object obj = i$.next();
      Object[] array = ((List)obj).toArray();
      String d1;
      try
      {
        d1 = array[0].toString();
      } catch (Exception e) {
        d1 = "";
      }
      String d2;
      try {
        d2 = array[1].toString();
      } catch (Exception e) {
        d2 = null;
      }
      String d3;
      try {
        d3 = array[2].toString();
      } catch (Exception e) {
        d3 = null;
      }
      String d4;
      try {
        d4 = array[3].toString();
      } catch (Exception e) {
        d4 = null;
      }

      lista.add(new FuncionesAccessoUsuarioTO(d1, d2,d3,d4));
    }
    return lista;
   }

     public static List<TipoDatoTO>convertirToTableBeanBinding_TiposDato(List datos){
       List lista = new ArrayList(1);
        for (Iterator i$ = datos.iterator(); i$.hasNext(); )
        {
          Object obj = i$.next();
          Object[] array = ((List)obj).toArray();
          String d1;
          try
          {
            d1 = array[0].toString();
          } catch (Exception e) {
            d1 = "";
          }
          String d2;
          try {
            d2 = array[1].toString();
          } catch (Exception e) {
            d2 = null;
          }

          lista.add(new TipoDatoTO(d1, d2));
        }
        return lista;
   }

     public static List<DescripcionTiposTO>convertirToTableBeanBinding_TiposDeUsuario(List datos){
       List lista = new ArrayList(1);
    for (Iterator i$ = datos.iterator(); i$.hasNext(); )
    {
      Object obj = i$.next();
      Object[] array = ((List)obj).toArray();
      String d1;
      try
      {
        d1 = array[0].toString();
      } catch (Exception e) {
        d1 = "";
      }
      String d2;
      try {
        d2 = array[1].toString();
      } catch (Exception e) {
        d2 = null;
      }
      String d3;
      try {
        d3 = array[2].toString();
      } catch (Exception e) {
        d3 = null;
      }
    
      lista.add(new DescripcionTiposTO(d1, d2,d3));
    }
    return lista;
   }


}
