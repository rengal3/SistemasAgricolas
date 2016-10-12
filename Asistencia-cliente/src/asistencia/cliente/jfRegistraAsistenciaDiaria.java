/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistencia.cliente;

import com.javaswingcomponents.clock.analog.JSCAnalogClock;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Renato
 */
public class jfRegistraAsistenciaDiaria extends javax.swing.JFrame {

    JSCAnalogClock analogClock ;
    Calendar fecha;
    String idEmpresa;
    
    /**
     * Creates new form jfRegistraAsistenciaDiaria
     */
    public jfRegistraAsistenciaDiaria() {
        this.analogClock= new JSCAnalogClock();
        this.analogClock.setDrawDate(false);
        this.analogClock.setDrawText(false);
        this.analogClock.start();
        this.analogClock.setSize(400, 400);
        initComponents();
        
        this.jpReloj.add(this.analogClock);
        this.pack();
     
        this.setVisible(true);
        
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpReloj = new javax.swing.JPanel();
        jpDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfCodigoTrabajador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        javax.swing.GroupLayout jpRelojLayout = new javax.swing.GroupLayout(jpReloj);
        jpReloj.setLayout(jpRelojLayout);
        jpRelojLayout.setHorizontalGroup(
            jpRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );
        jpRelojLayout.setVerticalGroup(
            jpRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Codigo Trabajador");

        this.jtfCodigoTrabajador.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                System.out.println(jtfCodigoTrabajador.getText());
            }
            public void removeUpdate(DocumentEvent e) {
                // text was deleted
            }
            public void insertUpdate(DocumentEvent e) {
                // text was inserted
            }
        });
        jtfCodigoTrabajador.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfCodigoTrabajador.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtfCodigoTrabajadorCaretUpdate(evt);
            }
        });
        jtfCodigoTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoTrabajadorActionPerformed(evt);
            }
        });
        jtfCodigoTrabajador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfCodigoTrabajadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodigoTrabajadorFocusLost(evt);
            }
        });
        jtfCodigoTrabajador.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jtfCodigoTrabajadorCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jtfCodigoTrabajadorInputMethodTextChanged(evt);
            }
        });
        jtfCodigoTrabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCodigoTrabajadorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCodigoTrabajadorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCodigoTrabajadorKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jpDatosLayout = new javax.swing.GroupLayout(jpDatos);
        jpDatos.setLayout(jpDatosLayout);
        jpDatosLayout.setHorizontalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCodigoTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpDatosLayout.setVerticalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfCodigoTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpReloj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpReloj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCodigoTrabajadorCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtfCodigoTrabajadorCaretUpdate
        // TODO add your handling code here:     
        
    }//GEN-LAST:event_jtfCodigoTrabajadorCaretUpdate

    private void procesarMarcacion(String codigoTrabajador){
        fecha=Calendar.getInstance(TimeZone.getTimeZone("GMT-5:00"));
        int hora=fecha.get(Calendar.HOUR_OF_DAY);
        int minuto=fecha.get(Calendar.MINUTE);
        
        
        int anio=fecha.get(Calendar.YEAR);
        int mes=fecha.get(Calendar.MONTH)+1;
        int dia=fecha.get(Calendar.DAY_OF_MONTH);
        
        System.out.println(codigoTrabajador+" -- "+ anio+"-"+mes+"-"+dia+"-"+"   ,   "+hora+":"+minuto);
    }
    private void jtfCodigoTrabajadorInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jtfCodigoTrabajadorInputMethodTextChanged
        // TODO add your handling code here:         
    }//GEN-LAST:event_jtfCodigoTrabajadorInputMethodTextChanged

    private void jtfCodigoTrabajadorCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jtfCodigoTrabajadorCaretPositionChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtfCodigoTrabajadorCaretPositionChanged

    private void jtfCodigoTrabajadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoTrabajadorFocusGained
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jtfCodigoTrabajadorFocusGained

    private void jtfCodigoTrabajadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoTrabajadorKeyPressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jtfCodigoTrabajadorKeyPressed

    private void jtfCodigoTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoTrabajadorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtfCodigoTrabajadorActionPerformed

    private void jtfCodigoTrabajadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoTrabajadorFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtfCodigoTrabajadorFocusLost

    private void jtfCodigoTrabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoTrabajadorKeyTyped
        // TODO add your handling code here:
        
      
    }//GEN-LAST:event_jtfCodigoTrabajadorKeyTyped

    private void jtfCodigoTrabajadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoTrabajadorKeyReleased
        // TODO add your handling code here:
        if(this.jtfCodigoTrabajador.getText().trim().length()==8){
            procesarMarcacion(this.jtfCodigoTrabajador.getText().trim());           
            this.jtfCodigoTrabajador.requestFocusInWindow();
            this.jtfCodigoTrabajador.setText("");
        }
    }//GEN-LAST:event_jtfCodigoTrabajadorKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfRegistraAsistenciaDiaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfRegistraAsistenciaDiaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfRegistraAsistenciaDiaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfRegistraAsistenciaDiaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfRegistraAsistenciaDiaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPanel jpReloj;
    private javax.swing.JTextField jtfCodigoTrabajador;
    // End of variables declaration//GEN-END:variables
}
