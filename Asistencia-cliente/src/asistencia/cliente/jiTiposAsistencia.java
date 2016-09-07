/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistencia.cliente;
import asistencia.delegate.GestionAsistenciaDelegate;
import com.asistencia.TO.AdmisionTipoTO;
import com.helper.Utiles_Tabla;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;

/**
 *
 * @author INFORMATICA
 */
public final class jiTiposAsistencia extends javax.swing.JInternalFrame {

    /**
     * Creates new form jiTiposAsistencia
     */
    private JTableBinding jTableBinding;
    private List<AdmisionTipoTO> tipos;
    private BindingGroup bindingGroup;
    boolean editar=false;
    boolean agregar=false;
    public jiTiposAsistencia() {
        initComponents();
       
        MostrarDatos(); 
        mostrarentext(0);
      jtabla.requestFocus();
      jtabla.changeSelection(0,0,false, false); 
    }
    public void MostrarDatos(){
         try {
            List<AdmisionTipoTO> lista=GestionAsistenciaDelegate.getInstance().getListaAdmisionTipoTO();
            for(AdmisionTipoTO admision:lista){
                System.out.println(admision.getId()+"-"+admision.getDescripcion()+"-"+admision.getSigla());
                this.actualizaTablaTipos(lista);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(AsistenciaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
     }   
        
//     this.tipos=new ArrayList(1);
//    
//       tipos.add(new AdmisionTipoTO(1,"PRESENCIAL NORMAL","PN",1));
//       tipos.add(new AdmisionTipoTO(2,"DESCANZO MEDICA","DM",1));
//       tipos.add(new AdmisionTipoTO(3,"DIA NORMAL","DN",0));
////       tipos.add(new AdmisionTipoTO(1,"12345678","08:00:00"));
//        this.actualizaTablaTipos(tipos);
    
    
    
    
     public void mostrarentext(int row){
        String id = jtabla.getValueAt(row, 0).toString();
        String descripcion = jtabla.getValueAt(row, 1).toString();
        String sigla=jtabla.getValueAt(row,2).toString();
        jtfcodigo.setText(id);
        jtfdescripcion.setText(descripcion);
        jtfsigla.setText(sigla);


}
      private void actualizaTablaTipos(List<AdmisionTipoTO> aasistencias_tmp){
        this.bindingGroup = new BindingGroup();
        this.jTableBinding = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ, aasistencias_tmp, this.jtabla);

        JTableBinding.ColumnBinding columnBinding0 = this.jTableBinding.addColumnBinding(ELProperty.create("${id}"));

        columnBinding0.setColumnName("ID TIPO");
        columnBinding0.setColumnClass(Integer.class);
        columnBinding0.setEditable(false);

        JTableBinding.ColumnBinding columnBinding0_1 = this.jTableBinding.addColumnBinding(ELProperty.create("${descripcion}"));

        columnBinding0_1.setColumnName("DESCRIPCION");
        columnBinding0_1.setColumnClass(String.class);
        columnBinding0_1.setEditable(false);

        JTableBinding.ColumnBinding columnBinding1 = this.jTableBinding.addColumnBinding(ELProperty.create("${sigla}"));

        columnBinding1.setColumnName("SIGLA");
        columnBinding1.setColumnClass(String.class);
        columnBinding1.setEditable(false);

      
        JTableBinding.ColumnBinding columnBinding3 = this.jTableBinding.addColumnBinding(ELProperty.create("${mostrar}"));

        columnBinding3.setColumnName("MOSTRAR");
        columnBinding3.setColumnClass(Boolean.class);
        columnBinding3.setEditable(true);

       
        
        this.bindingGroup.addBinding(this.jTableBinding);
        this.bindingGroup.bind();

         int[] porcentajes= {5,5,10,10};
            try {
                Utiles_Tabla.definirAnchoColumnasJTable(this.jtabla, porcentajes);
            } catch (Exception ex) {
                Logger.getLogger(jfAdministraAsistencia.class.getName()).log(Level.SEVERE, null, ex);
            }

    }
       public void limpiartxt(){
      jtfcodigo.setText("");
      jtfdescripcion.setText("");
      jtfsigla.setText("");
      
      }
      public void  Objetosarriba(boolean ban){
//      jtfcodigo.setEnabled(ban);
        jtfdescripcion.setEnabled(ban);
        jtfsigla.setEnabled(ban);
        jbaceptar.setEnabled(ban);
        jbcancelar.setEnabled(ban);
//        jbeditar.setEnabled(ban);
//        jbeditar.setEnabled(ban);
      }
      public void  Objetosbajo(boolean ban){
         jbagregar.setEnabled(ban);
         jbeditar.setEnabled(ban);
         jbeliminar.setEnabled(ban);
         jbcerrar.setEnabled(ban);
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();
        jbagregar = new javax.swing.JButton();
        jbeditar = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jbcerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jtfcodigo = new javax.swing.JTextField();
        jtfdescripcion = new javax.swing.JTextField();
        jtfsigla = new javax.swing.JTextField();
        jbaceptar = new javax.swing.JButton();
        jbcancelar = new javax.swing.JButton();

        setIconifiable(true);
        setTitle("TIPO DE ASISTENCIA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaMouseClicked(evt);
            }
        });
        jtabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtablaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 750, 170));

        jbagregar.setText("AGREGAR");
        jbagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbagregarActionPerformed(evt);
            }
        });
        getContentPane().add(jbagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jbeditar.setText("EDITAR");
        jbeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeditarActionPerformed(evt);
            }
        });
        getContentPane().add(jbeditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jbeliminar.setText("ELIMINAR");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jbeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jbcerrar.setText("CERRAR");
        jbcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfcodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("CODIGO"));
        jtfcodigo.setEnabled(false);
        jPanel1.add(jtfcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, -1));

        jtfdescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION"));
        jtfdescripcion.setEnabled(false);
        jtfdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfdescripcionKeyTyped(evt);
            }
        });
        jPanel1.add(jtfdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 250, -1));

        jtfsigla.setBorder(javax.swing.BorderFactory.createTitledBorder("SIGLA"));
        jtfsigla.setEnabled(false);
        jtfsigla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfsiglaKeyTyped(evt);
            }
        });
        jPanel1.add(jtfsigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 80, -1));

        jbaceptar.setText("ACEPTAR");
        jbaceptar.setEnabled(false);
        jbaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbaceptarActionPerformed(evt);
            }
        });
        jPanel1.add(jbaceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        jbcancelar.setText("CANCELAR");
        jbcancelar.setEnabled(false);
        jbcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 750, 80));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaMouseClicked
        // TODO add your handling code here:
        int aux = jtabla.getSelectedRow();

        mostrarentext(aux);
        
        
        
        
        //         String id = jtabla.getValueAt(aux, 0).toString();
        //        String descripcion = jtabla.getValueAt(aux, 1).toString();
        //        String sigla=jtabla.getValueAt(aux,2).toString();
        //        jtfcodigo.setText(id);
        //        jtfdescripcion.setText(descripcion);
        //        jtfsigla.setText(sigla);
    }//GEN-LAST:event_jtablaMouseClicked

    private void jtablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtablaKeyPressed
        // TODO add your handling code here:

        int evento=evt.getKeyCode();
        int cont=jtabla.getRowCount();
        int  aux2=jtabla.getSelectedRow();
        int  aux3=jtabla.getSelectedRow();
        if(evento==10){ //  40 | (Tecla enter) |
            aux3++;
            if (cont == aux3){
                aux3 = 0;
                mostrarentext(aux3);

            } else {
                mostrarentext(aux3);
            }
        }
        if (evento==40 ){ //  40 | (Tecla Abajo) |

            int aux = jtabla.getSelectedRow()+1;
            if (aux < cont){
                mostrarentext(aux);
            }
        }

        if ( evento==38){ //| 38 | (Tecla Arriba)
            if (aux2>0){
                aux2 = aux2-1;
            }

            if (aux2 <= cont){
                mostrarentext(aux2);

            }
        }

    }//GEN-LAST:event_jtablaKeyPressed

    private void jbagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbagregarActionPerformed
        // TODO add your handling code here:
//        int mayor=Integer.parseInt(jtabla.getValueAt(0, 0).toString());
//        System.out.println("inicio "+mayor);
        Objetosarriba(true);
        Objetosbajo(false);
//        jbagregar.setEnabled(false);
//        jbeditar.setEnabled(false);
//        jbeliminar.setEnabled(false);
        limpiartxt();
        jtabla.setEnabled(true);
        jtfdescripcion.requestFocus();
        agregar=true;
//        
//        for (int i=0;i<jtabla.getColumnCount()-1;i++){
//            System.out.println("index"+i);
//            int num= Integer.parseInt(jtabla.getValueAt(i, 0).toString());
//            System.out.println("numero "+num);
//            if  ( mayor < num){
//                mayor=num;
//            }
//           }
//        jtfcodigo.setText(String.valueOf(mayor+1));
//           System.out.println("mayor "+mayor);
        
        

    }//GEN-LAST:event_jbagregarActionPerformed

    private void jbcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcancelarActionPerformed
        // TODO add your handling code here:
        Objetosarriba(false);
         Objetosbajo(true);
//        jbagregar.setEnabled(true);
//        jbeditar.setEnabled(true);
//        jbeliminar.setEnabled(true);
        limpiartxt();
        int aux = jtabla.getSelectedRow();
        mostrarentext(aux);
    }//GEN-LAST:event_jbcancelarActionPerformed

    private void jbeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeditarActionPerformed
        // TODO add your handling code here:
        Objetosarriba(true);
        jbagregar.setEnabled(false);
        jbeliminar.setEnabled(false);
        
        editar=true;
        
        
        
        
    }//GEN-LAST:event_jbeditarActionPerformed

    private void jbaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbaceptarActionPerformed
        // TODO add your handling code here:
       
        
        if(editar==true){
        int mostrar,id;
        boolean most;
        String descripedit,siglaedit;
        int aux = jtabla.getSelectedRow();
       
        
         if(aux==-1){
          
            JOptionPane.showMessageDialog(null, "SELECCIONE UN ITEM EN LA TABLA");
        } else {
                descripedit=jtfdescripcion.getText();
                siglaedit=jtfsigla.getText();
                id=Integer.parseInt(jtabla.getValueAt(aux, 0).toString());
                System.out.println("id "+id);
                most=Boolean.parseBoolean(jtabla.getValueAt(aux,3).toString());
                System.out.println("mostrar "+most);
                if (most==true){
                mostrar=1;
                
                } else {
                mostrar=0;
                }
                
                
             
             AdmisionTipoTO admision=new AdmisionTipoTO();
             admision.setId((int)id);
             admision.setDescripcion(descripedit);
             admision.setSigla(siglaedit);
             admision.setMostrar((int)mostrar);
             try{
             
              GestionAsistenciaDelegate.getInstance().modificarAdmisionTipo(admision);
             JOptionPane.showMessageDialog(null, "SE EDITO CORRECTAMENTE LA ASISTENCIA");
             
             }catch(Exception e){
              e.printStackTrace();
             
             }
             
            MostrarDatos();
             
            editar=false;    
         }
        }
        
        
        
        
        
        if(agregar==true){
            boolean sig=true,descrip=true;
            String msj="",msj1="";
            String sigla=jtfsigla.getText().trim();
            String descripcion=jtfdescripcion.getText().trim();   
            
            
            if (descripcion.length()==0 ){
                descrip=false;
                msj="DESCRIPCION";
                jtfdescripcion.setText("");
                jtfdescripcion.requestFocus();
            } else  if (sigla.length()==0){
                        sig=false;
                        msj1="SIGLA";
                        jtfsigla.setText("");
                        jtfsigla.requestFocus();
                    }
        
            if (sig==true && descrip==true){
                AdmisionTipoTO admision1=new AdmisionTipoTO();
                admision1.setDescripcion(this.jtfdescripcion.getText().trim());
                admision1.setSigla(this.jtfsigla.getText().trim());       
                admision1.setMostrar(1);        
                try{
          
                    GestionAsistenciaDelegate.getInstance().insertaAdmisionTipo(admision1);
                    JOptionPane.showMessageDialog(null,"SE GUARDO CORRECTAMENTE");
                
                }catch(Exception e){
                    e.printStackTrace();
                }
                limpiartxt();
                Objetosarriba(false);
                Objetosbajo(true);
                MostrarDatos();
            } else {
                JOptionPane.showMessageDialog(null,"INGRESE: "+msj+" "+msj1);
        
            }   
            
            agregar=false;
            
        
        
        
        }
        
        
        
        
        
    }//GEN-LAST:event_jbaceptarActionPerformed

    private void jtfdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfdescripcionKeyTyped
        // TODO add your handling code here:
            jtfdescripcion.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (jtfdescripcion.getText()).toUpperCase();
                jtfdescripcion.setText(cadena);
                repaint();
              
            }
        });
    }//GEN-LAST:event_jtfdescripcionKeyTyped

    private void jtfsiglaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfsiglaKeyTyped
        // TODO add your handling code here:
         jtfsigla.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (jtfsigla.getText()).toUpperCase();
                jtfsigla.setText(cadena);
                repaint();
              
            }
        });
    }//GEN-LAST:event_jtfsiglaKeyTyped

    private void jbcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbcerrarActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        // TODO add your handling code here:
         int aux = jtabla.getSelectedRow();
        if(aux==-1){
          
            JOptionPane.showMessageDialog(null, "SELECCIONE UN ITEM EN LA TABLA");
        } else {
        AdmisionTipoTO admision1=new AdmisionTipoTO();
        int idtipos = Integer.parseInt(jtabla.getValueAt(aux, 0).toString());
        System.out.println("id tipos"+idtipos);
        admision1.setId((int)idtipos);
        
        //admision1.toString();
           try{
         
            GestionAsistenciaDelegate.getInstance().eliminaAdmisionTipos(admision1);
             JOptionPane.showMessageDialog(null,"SE ELIMINO CORRECTAMENTE");
              
        }catch(Exception e){
            e.printStackTrace();
        }
        MostrarDatos(); 
        }
    }//GEN-LAST:event_jbeliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbaceptar;
    private javax.swing.JButton jbagregar;
    private javax.swing.JButton jbcancelar;
    private javax.swing.JButton jbcerrar;
    private javax.swing.JButton jbeditar;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JTable jtabla;
    private javax.swing.JTextField jtfcodigo;
    private javax.swing.JTextField jtfdescripcion;
    private javax.swing.JTextField jtfsigla;
    // End of variables declaration//GEN-END:variables
}
