
import java.awt.Color;
import javax.swing.JPanel;


public class PrincipalCL extends javax.swing.JFrame {
private String user;
    public PrincipalCL(String name) {
           this.user=name;
        setUndecorated(true);
        setBackground(new Color(0,0,0,0));
        initComponents();
     setLocationRelativeTo(null);
     panelproductoss.setVisible(false);
    // BTNartistas.setEnabled(false);//boton para que muestre el panel de todos los artistas
     //La idea es que cuando se esten en el menu de artistas el boton este señalado o resaltado mas no se puede seleccionar
    // BTNproductos.setEnabled(false);
     //si selecciona un artista, el botonartistas se habilita por si el usuario se quiere regrsar, y se resal el boton de los productos del artista
    // BTNelproducto.setEnabled(false);
    }
    public String Frameanterior;
    public JPanel actualPanel;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new custom.PanelRound();
        jButton1 = new javax.swing.JButton();
        panelproductoss = new javax.swing.JPanel();
        menu = new custom.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelArtistas = new javax.swing.JPanel();
        HSbtn = new javax.swing.JButton();
        SabrinaBTN = new javax.swing.JButton();
        SabrinaBTN1 = new javax.swing.JButton();
        SabrinaBTN2 = new javax.swing.JButton();
        SabrinaBTN3 = new javax.swing.JButton();
        SabrinaBTN4 = new javax.swing.JButton();
        SabrinaBTN5 = new javax.swing.JButton();
        SabrinaBTN6 = new javax.swing.JButton();
        SabrinaBTN7 = new javax.swing.JButton();
        SabrinaBTN8 = new javax.swing.JButton();
        BTNartistas = new javax.swing.JButton();
        BTNproductos = new javax.swing.JButton();
        BTNelproducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/cerrrar35.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelproductossLayout = new javax.swing.GroupLayout(panelproductoss);
        panelproductoss.setLayout(panelproductossLayout);
        panelproductossLayout.setHorizontalGroup(
            panelproductossLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1092, Short.MAX_VALUE)
        );
        panelproductossLayout.setVerticalGroup(
            panelproductossLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        menu.setBackground(new java.awt.Color(153, 102, 255));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 32, 64, 75));

        jButton2.setText("Carrito");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        menu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 260, -1, 45));

        BtnSalir.setText("OUT");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        menu.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 604, -1, -1));

        jButton3.setText("Explore");
        menu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 189, -1, 33));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        panelArtistas.setPreferredSize(new java.awt.Dimension(1000, 824));
        panelArtistas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HSbtn.setText("Harry Styles");
        HSbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HSbtnActionPerformed(evt);
            }
        });
        panelArtistas.add(HSbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 12, 217, 234));

        SabrinaBTN.setText("Sabrina Carpenter");
        panelArtistas.add(SabrinaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 12, 222, 235));

        SabrinaBTN1.setText("Big Time Rush");
        SabrinaBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabrinaBTN1ActionPerformed(evt);
            }
        });
        panelArtistas.add(SabrinaBTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 12, 215, 235));

        SabrinaBTN2.setText("Conan Gray");
        SabrinaBTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabrinaBTN2ActionPerformed(evt);
            }
        });
        panelArtistas.add(SabrinaBTN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 12, 228, 235));

        SabrinaBTN3.setText("Imagine Dragons");
        SabrinaBTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabrinaBTN3ActionPerformed(evt);
            }
        });
        panelArtistas.add(SabrinaBTN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 284, 215, 235));

        SabrinaBTN4.setText("Louis Tomilson");
        SabrinaBTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabrinaBTN4ActionPerformed(evt);
            }
        });
        panelArtistas.add(SabrinaBTN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 284, 222, 235));

        SabrinaBTN5.setText("Stray Kids");
        SabrinaBTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabrinaBTN5ActionPerformed(evt);
            }
        });
        panelArtistas.add(SabrinaBTN5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 284, 217, 235));

        SabrinaBTN6.setText("Bea Miller");
        SabrinaBTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabrinaBTN6ActionPerformed(evt);
            }
        });
        panelArtistas.add(SabrinaBTN6, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 284, 228, 235));

        SabrinaBTN7.setText("Billie Eilish");
        SabrinaBTN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabrinaBTN7ActionPerformed(evt);
            }
        });
        panelArtistas.add(SabrinaBTN7, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 556, 217, 235));

        SabrinaBTN8.setText("5 Seconds Of Summer");
        SabrinaBTN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabrinaBTN8ActionPerformed(evt);
            }
        });
        panelArtistas.add(SabrinaBTN8, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 556, 222, 235));

        jScrollPane1.setViewportView(panelArtistas);

        BTNartistas.setText("ARTISTAS");
        BTNartistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNartistasActionPerformed(evt);
            }
        });

        BTNproductos.setText("PRODUCTOS");
        BTNproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNproductosActionPerformed(evt);
            }
        });

        BTNelproducto.setText("VISTAZO DEL PRODUCTO");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(BTNartistas)
                        .addGap(18, 18, 18)
                        .addComponent(BTNproductos)
                        .addGap(18, 18, 18)
                        .addComponent(BTNelproducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())))
            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                    .addContainerGap(86, Short.MAX_VALUE)
                    .addComponent(panelproductoss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNartistas)
                            .addComponent(BTNproductos)
                            .addComponent(BTNelproducto))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                    .addContainerGap(43, Short.MAX_VALUE)
                    .addComponent(panelproductoss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        perfilesFR menu=new perfilesFR(user);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CarritoFR carrito=new CarritoFR(user);
        carrito.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SabrinaBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabrinaBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SabrinaBTN1ActionPerformed

    private void SabrinaBTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabrinaBTN2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SabrinaBTN2ActionPerformed

    private void SabrinaBTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabrinaBTN3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SabrinaBTN3ActionPerformed

    private void SabrinaBTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabrinaBTN4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SabrinaBTN4ActionPerformed

    private void SabrinaBTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabrinaBTN5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SabrinaBTN5ActionPerformed

    private void SabrinaBTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabrinaBTN6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SabrinaBTN6ActionPerformed

    private void SabrinaBTN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabrinaBTN7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SabrinaBTN7ActionPerformed

    private void SabrinaBTN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabrinaBTN8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SabrinaBTN8ActionPerformed

    private void HSbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HSbtnActionPerformed
        panelproductoss.setVisible(true);
        panelArtistas.setVisible(false);
        panelArtistas.setEnabled(false);
         BTNartistas.setEnabled(true);
         actualPanel=panelproductoss;
    }//GEN-LAST:event_HSbtnActionPerformed

    private void BTNartistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNartistasActionPerformed
        if(actualPanel==panelproductoss){
            panelproductoss.setVisible(false);
        panelArtistas.setVisible(true);
        panelArtistas.setEnabled(true);
        }
    }//GEN-LAST:event_BTNartistasActionPerformed

    private void BTNproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNproductosActionPerformed
       
    }//GEN-LAST:event_BTNproductosActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalCL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalCL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalCL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalCL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalCL(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNartistas;
    private javax.swing.JButton BTNelproducto;
    private javax.swing.JButton BTNproductos;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton HSbtn;
    private javax.swing.JButton SabrinaBTN;
    private javax.swing.JButton SabrinaBTN1;
    private javax.swing.JButton SabrinaBTN2;
    private javax.swing.JButton SabrinaBTN3;
    private javax.swing.JButton SabrinaBTN4;
    private javax.swing.JButton SabrinaBTN5;
    private javax.swing.JButton SabrinaBTN6;
    private javax.swing.JButton SabrinaBTN7;
    private javax.swing.JButton SabrinaBTN8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private custom.PanelRound menu;
    private javax.swing.JPanel panelArtistas;
    private custom.PanelRound panelRound1;
    private javax.swing.JPanel panelproductoss;
    // End of variables declaration//GEN-END:variables
}
