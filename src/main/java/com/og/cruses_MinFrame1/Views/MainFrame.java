
package com.og.cruses_MinFrame1.Views;

/**
 *
 * @author acer
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
       // this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_personalizacion = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        Siguiente_Panel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_personalizacion.setBackground(new java.awt.Color(0, 51, 51));
        P_personalizacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 51, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 51, 0)));
        P_personalizacion.setName(""); // NOI18N

        Salir.setBackground(new java.awt.Color(0, 51, 51));
        Salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\NetBeansProjects\\cruses_M\\src\\main\\java\\com\\og\\cruses_m\\icons\\cerrar-el-simbolo-de-la-cruz-en-un-circulo.png")); // NOI18N
        Salir.setBorder(null);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Siguiente_Panel.setBackground(new java.awt.Color(153, 255, 153));
        Siguiente_Panel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Siguiente_Panel.setForeground(new java.awt.Color(0, 0, 0));
        Siguiente_Panel.setText("Cruses normales(Mono hibrido)");
        Siguiente_Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 255, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(102, 255, 102)));
        Siguiente_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Siguiente_PanelMouseClicked(evt);
            }
        });
        Siguiente_Panel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Siguiente_PanelActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 255, 204));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Cruses dihibridos");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 255, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 255, 51)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\NetBeansProjects\\cruses_M\\src\\main\\java\\com\\og\\cruses_m\\icons\\maximizar.png")); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_personalizacionLayout = new javax.swing.GroupLayout(P_personalizacion);
        P_personalizacion.setLayout(P_personalizacionLayout);
        P_personalizacionLayout.setHorizontalGroup(
            P_personalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_personalizacionLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(P_personalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Siguiente_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_personalizacionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_personalizacionLayout.setVerticalGroup(
            P_personalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_personalizacionLayout.createSequentialGroup()
                .addGroup(P_personalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(81, 81, 81)
                .addComponent(Siguiente_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 164, Short.MAX_VALUE))
        );

        getContentPane().add(P_personalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       System.exit(0);
    
    }//GEN-LAST:event_SalirActionPerformed

    private void Siguiente_PanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Siguiente_PanelActionPerformed

      Cruses_mono_hibrido Mono_hibrido = new Cruses_mono_hibrido();
      Mono_hibrido.setVisible(true);
      Mono_hibrido.setLocationRelativeTo(null);
//        if (Mono_hibrido!=0) {
//            
//        } else {
//        }
    Mono_hibrido.setDefaultCloseOperation(Cruses_mono_hibrido.HIDE_ON_CLOSE);
   //setDefaultCloseOperation(Cruses_dihibridos.HIDE_ON_CLOSE);

    }//GEN-LAST:event_Siguiente_PanelActionPerformed
// esta accion no sirve de nada que no te confunda
    private void Siguiente_PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Siguiente_PanelMouseClicked

    }//GEN-LAST:event_Siguiente_PanelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Cruses_dihibridos dihibrido = new Cruses_dihibridos();
      dihibrido.setVisible(true);
      dihibrido.setLocationRelativeTo(null);
      dihibrido.setDefaultCloseOperation( Cruses_dihibridos .HIDE_ON_CLOSE);
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      //Cruses_dihibridos dihibrido = new Cruses_dihibridos();
      //dihibrido.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButton2ActionPerformed
   // este es un espacio vacio
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       
    }//GEN-LAST:event_formMousePressed


  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P_personalizacion;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Siguiente_Panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables

    public void setDefaultCloseOperation(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
