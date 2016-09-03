/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistencia.cliente;

import asistencia.delegate.GestionAsistenciaDelegate;
import com.asistencia.TO.AdmisionTO;
import com.helper.Utiles_Tabla;
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
    /**
     * Creates new form jfAdministraAsistencia
     */
    public jfAdministraAsistencia() {
        initComponents();
       // MostrarDatos();
    }
//    public void MostrarDatos(){
//     this.asistencias=new ArrayList(1);
//        asistencias.add(new AdmisionTO(1,"12345678","08:00:00","13:00:00",BigDecimal.TEN,"ALMACENERO","NN","NN"));
//       asistencias.add(new AdmisionTO(1,"12345678","08:00:00","13:00:00",BigDecimal.TEN,"ALMACENERO","NN","NN"));
//       asistencias.add(new AdmisionTO(1,"12345678","08:00:00","13:00:00",BigDecimal.TEN,"ALMACENERO","NN","NN"));
//       asistencias.add(new AdmisionTO(1,"12345678","08:00:00","13:00:00",BigDecimal.TEN,"ALMACENERO","NN","NN"));
//        this.actualizaTablaAsistencias(asistencias);
//    
//    
//    
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAsistencias = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtdni = new javax.swing.JTextField();
        jtxtasistencia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Asistencias Encontradas"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, 730, 140));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 750, -1));

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("TRABAJADOR"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("DNI:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 10));

        jLabel2.setText("NOMBRES:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 10));

        jLabel4.setText("TIPO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 10));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 110, 20));

        jCheckBox1.setText("INGRESAR HORA MANUAL");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 130, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 180, 20));

        jTextField1.setText(" ");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 90, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 370, 160));

        jLabel5.setText("NOMBRE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel6.setText("TIPO DE ASISTENCIA:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));
        getContentPane().add(jtxtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 100, -1));
        getContentPane().add(jtxtasistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 120, -1));

        jLabel7.setText("HORA DE INGRESO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jLabel8.setText("HORA DE SALIDA:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 120, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 120, -1));

        jButton2.setText("GUARDAR");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        jButton3.setText("CANCELAR");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 200, -1));

        jButton4.setText("APLICAR");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            this.asistencias=GestionAsistenciaDelegate.getInstance().getListaAdmision();
        } catch (Exception ex) {
            Logger.getLogger(jfAdministraAsistencia.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            this.asistencias=new ArrayList(1);
        }
//       AdmisionTO ad =new AdmisionTO(1,"12345678","","",BigDecimal.TEN,"","","");
      actualizaTablaAsistencias(asistencias);
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable jtAsistencias;
    private javax.swing.JTextField jtxtasistencia;
    private javax.swing.JTextField jtxtdni;
    // End of variables declaration//GEN-END:variables
}
