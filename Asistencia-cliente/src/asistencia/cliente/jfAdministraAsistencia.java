/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistencia.cliente;

import asistencia.delegate.GestionAsistenciaDelegate;
import com.asistencia.TO.AdmisionTO;
import com.asistencia.TO.AdmisionTipoTO;
import com.helper.Utiles_MensajesDialogo;
import com.helper.Utiles_Tabla;
import com.jidesoft.hints.ListDataIntelliHints;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;

/**
 *
 * @author Renato
 */
public class jfAdministraAsistencia extends javax.swing.JFrame {

    private JTableBinding jTableBinding;
    private List<AdmisionTO> asistencias;
    private BindingGroup bindingGroup;
    private ListDataIntelliHints intelliHintsTipoAdmision;
    private AdmisionTipoTO tipoAdmisionBuscada;
    /**
     * Creates new form jfAdministraAsistencia
     */
    public jfAdministraAsistencia() {
        initComponents();
        
        try {
            cargaHintsIndependientes();
        } catch (Exception ex) {            
            ex.printStackTrace();
        }
    }

     private void cargaHintsIndependientes() throws Exception {
        /*this.intelliHintsTipoAdmision = new ListDataIntelliHints(
                this.jtfTipoAdmision, GestionAsistenciaDelegate.getInstance().getListaAdmisionTipoTO());*/
                //((JList) this.intelliHintsTipoAdmision.getDelegateComponent()).setFixedCellWidth(306);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAsistencias = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jtfTipoAdmision = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Asistencias Encontradas"));

        jtAsistencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Personal", "DNI", "H Ingreso", "H Salida", "Horas", "Tipo Obrero", "Tipo Asistencia", "Observacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtAsistencias);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        );

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtfTipoAdmision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTipoAdmisionActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo Admision");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(486, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfTipoAdmision, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTipoAdmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
           // this.asistencias=GestionAsistenciaDelegate.getInstance().getListaAdmision();
        } catch (Exception ex) {
            Logger.getLogger(jfAdministraAsistencia.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            this.asistencias=new ArrayList(1);
        }
        
        this.actualizaTablaAsistencias(asistencias);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfTipoAdmisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTipoAdmisionActionPerformed
        // TODO add your handling code here:
        buscarAdmisionTipo();
    }//GEN-LAST:event_jtfTipoAdmisionActionPerformed

    private void buscarAdmisionTipo() {        
        
            try {
                this.tipoAdmisionBuscada = (AdmisionTipoTO) this.intelliHintsTipoAdmision.getSelectedHint();
            } catch (NullPointerException ex) {
                this.tipoAdmisionBuscada = null;
            }
        if (this.tipoAdmisionBuscada == null) {
            Utiles_MensajesDialogo.mensajeError("Elija un Tipo de Admision de la Lista Desplegable");
            this.jtfTipoAdmision.setText("");
            this.tipoAdmisionBuscada = null;
        } else {

            this.jtfTipoAdmision.setText(
                    this.tipoAdmisionBuscada.getSigla()+" - "+this.tipoAdmisionBuscada.getDescripcion());
            System.out.println(this.tipoAdmisionBuscada.getSigla()+" - "+this.tipoAdmisionBuscada.getDescripcion());
           //aplicar operaciones de aplicar filtros en la tabla
        }

    }
     private void actualizaTablaAsistencias(List<AdmisionTO> aasistencias_tmp){
        this.bindingGroup = new BindingGroup();
        this.jTableBinding = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ, aasistencias_tmp, this.jtAsistencias);

        JTableBinding.ColumnBinding columnBinding0 = this.jTableBinding.addColumnBinding(ELProperty.create("${idPersona}"));

        columnBinding0.setColumnName("Id Trabajador");
        columnBinding0.setColumnClass(Integer.class);
        columnBinding0.setEditable(false);

        JTableBinding.ColumnBinding columnBinding0_1 = this.jTableBinding.addColumnBinding(ELProperty.create("${dni}"));

        columnBinding0_1.setColumnName("DNI");
        columnBinding0_1.setColumnClass(String.class);
        columnBinding0_1.setEditable(false);

        JTableBinding.ColumnBinding columnBinding1 = this.jTableBinding.addColumnBinding(ELProperty.create("${hIngreso}"));

        columnBinding1.setColumnName("H. Ingreso");
        columnBinding1.setColumnClass(String.class);
        columnBinding1.setEditable(false);

      
        JTableBinding.ColumnBinding columnBinding3 = this.jTableBinding.addColumnBinding(ELProperty.create("${hSalida}"));

        columnBinding3.setColumnName("H. Salida");
        columnBinding3.setColumnClass(String.class);
        columnBinding3.setEditable(false);

        JTableBinding.ColumnBinding columnBinding4 = this.jTableBinding.addColumnBinding(ELProperty.create("${horas}"));

        columnBinding4.setColumnName("Horas");
        columnBinding4.setColumnClass(BigDecimal.class);
        columnBinding4.setEditable(false);

        JTableBinding.ColumnBinding columnBinding5 = this.jTableBinding.addColumnBinding(ELProperty.create("${tipoObrero}"));

        columnBinding5.setColumnName("Tipo Obrero");
        columnBinding5.setColumnClass(String.class);
        columnBinding5.setEditable(false);

        JTableBinding.ColumnBinding columnBinding6 = this.jTableBinding.addColumnBinding(ELProperty.create("${tipoAdmision}"));

        columnBinding6.setColumnName("Tipo Admision");
        columnBinding6.setColumnClass(String.class);
        columnBinding6.setEditable(false);

          JTableBinding.ColumnBinding columnBinding7 = this.jTableBinding.addColumnBinding(ELProperty.create("${modifico}"));

        columnBinding7.setColumnName("Modifico");
        columnBinding7.setColumnClass(String.class);
        columnBinding7.setEditable(false);

        
        this.bindingGroup.addBinding(this.jTableBinding);
        this.bindingGroup.bind();

         int[] porcentajes= {5,5,10,10,15,15,15,25};
            try {
                Utiles_Tabla.definirAnchoColumnasJTable(this.jtAsistencias, porcentajes);
            } catch (Exception ex) {
                Logger.getLogger(jfAdministraAsistencia.class.getName()).log(Level.SEVERE, null, ex);
            }

    }
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
            java.util.logging.Logger.getLogger(jfAdministraAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfAdministraAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfAdministraAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfAdministraAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfAdministraAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtAsistencias;
    private javax.swing.JTextField jtfTipoAdmision;
    // End of variables declaration//GEN-END:variables
}
