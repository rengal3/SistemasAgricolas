/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.helper;

import java.awt.Component;
import java.math.BigDecimal;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author Renato
 */
public class Utiles_Tabla {

    public static void definirAnchoColumnasJTable( JTable tabla, int[] porcentajes) throws Exception{
        int suma_aux=0;
        
        for(int a=0;a<porcentajes.length;a++){
            suma_aux+=porcentajes[a];
        }
        if(suma_aux>100)
            throw new Exception("Los porcentajes Ingresados como ancho de columns suman mas de 100%");
        
        if(tabla.getColumnCount()!= porcentajes.length)
            throw new Exception("La cantidad de tamaños de columnas no coincide con la cantidad de columnas");
                
        int ancho = tabla.getBounds().width;
        int totales=tabla.getColumnCount();        
        int anchoColumna=0;        
        TableColumn columnaTabla;
        BigDecimal division;
        for (int i = 0; i < tabla.getColumnCount(); i++) {            
            columnaTabla = tabla.getColumnModel().getColumn(i);
            division=new BigDecimal(porcentajes[i]);
            division=division.divide(new BigDecimal(100));
            division=division.multiply(new BigDecimal(ancho));
            anchoColumna=division.intValue();           
            columnaTabla.setPreferredWidth(anchoColumna);
        }
    }

    public static void renderizarColumnasTabla_TextArea(JTable tabla, int [] columnasRender) throws Exception{
        for (int i=0;i<columnasRender.length;i++){
            tabla.getColumnModel().getColumn(columnasRender[i]).setCellRenderer(new TextAreaRenderer());
        }
    }


    static class TextAreaRenderer extends JTextArea implements TableCellRenderer {

        public TextAreaRenderer() {
          setLineWrap(true);
          setWrapStyleWord(true);
          setOpaque(true);
        }

    public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected, boolean hasFocus, int row,int column) {
           /*setText((String)value);
            return this;*/
        if (isSelected) {
            setForeground(table.getSelectionForeground());
            setBackground(table.getSelectionBackground());
            } else {
                setForeground(table.getForeground());
                setBackground(table.getBackground());
                }
        setFont(table.getFont());
        if (hasFocus) {
                setBorder( UIManager.getBorder("Table.focusCellHighlightBorder") );
                if (table.isCellEditable(row, column)) {
                    setForeground( UIManager.getColor("Table.focusCellForeground") );
                    setBackground( UIManager.getColor("Table.focusCellBackground") );
                }
            } else {
                setBorder(new EmptyBorder(1, 2, 1, 2));
            }
        setText((value == null) ? "" : value.toString());
        return this;
        }
    }
}
