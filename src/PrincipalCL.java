
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PrincipalCL extends javax.swing.JFrame {

    private String user;

    public PrincipalCL(String name) {
        setIconImage(new ImageIcon(getClass().getResource("ICons/4Uicon.png")).getImage());
        this.user = name;
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        initComponents();
        setLocationRelativeTo(null);
        panelproductoss.setVisible(false);
        BTNartistas.setEnabled(false);//boton para que muestre el panel de todos los artistas
        //La idea es que cuando se esten en el menu de artistas el boton este señalado o resaltado mas no se puede seleccionar
        BTNproductos.setEnabled(false);
        //si selecciona un artista, el botonartistas se habilita por si el usuario se quiere regrsar, y se resal el boton de los productos del artista
        BTNelproducto.setEnabled(false);
    }
    public String Frameanterior;
    public JPanel actualPanel;
    public String SelectedArtist;

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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelArtistas = new javax.swing.JPanel();
        HSbtn = new javax.swing.JButton();
        SabrinaBTN = new javax.swing.JButton();
        BTRbtn = new javax.swing.JButton();
        ConanBTN = new javax.swing.JButton();
        ImagineDragonsBTN = new javax.swing.JButton();
        LousiBTN = new javax.swing.JButton();
        SkzBTN = new javax.swing.JButton();
        ManeskinBTN = new javax.swing.JButton();
        BillieBTN = new javax.swing.JButton();
        BTN5sos = new javax.swing.JButton();
        BeaMillerBTN = new javax.swing.JButton();
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/Logo 4U_1.png"))); // NOI18N
        menu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

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
        SabrinaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabrinaBTNActionPerformed(evt);
            }
        });
        panelArtistas.add(SabrinaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 12, 222, 235));

        BTRbtn.setText("Big Time Rush");
        BTRbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTRbtnActionPerformed(evt);
            }
        });
        panelArtistas.add(BTRbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 12, 215, 235));

        ConanBTN.setText("Conan Gray");
        ConanBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConanBTNActionPerformed(evt);
            }
        });
        panelArtistas.add(ConanBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 12, 228, 235));

        ImagineDragonsBTN.setText("Imagine Dragons");
        ImagineDragonsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImagineDragonsBTNActionPerformed(evt);
            }
        });
        panelArtistas.add(ImagineDragonsBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 284, 215, 235));

        LousiBTN.setText("Louis Tomilson");
        LousiBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LousiBTNActionPerformed(evt);
            }
        });
        panelArtistas.add(LousiBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 284, 222, 235));

        SkzBTN.setText("Stray Kids");
        SkzBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkzBTNActionPerformed(evt);
            }
        });
        panelArtistas.add(SkzBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 284, 217, 235));

        ManeskinBTN.setText("Maneskin");
        ManeskinBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManeskinBTNActionPerformed(evt);
            }
        });
        panelArtistas.add(ManeskinBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, 228, 235));

        BillieBTN.setText("Billie Eilish");
        BillieBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillieBTNActionPerformed(evt);
            }
        });
        panelArtistas.add(BillieBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 556, 217, 235));

        BTN5sos.setText("5 Seconds Of Summer");
        BTN5sos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN5sosActionPerformed(evt);
            }
        });
        panelArtistas.add(BTN5sos, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 556, 222, 235));

        BeaMillerBTN.setText("Bea Miller");
        BeaMillerBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeaMillerBTNActionPerformed(evt);
            }
        });
        panelArtistas.add(BeaMillerBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 284, 228, 235));

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
                    .addContainerGap(87, Short.MAX_VALUE)
                    .addComponent(panelproductoss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
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
        perfilesFR menu = new perfilesFR(user);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CarritoFR carrito = new CarritoFR(user);
        carrito.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BTRbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRbtnActionPerformed
        BotonesArtistasPanel();
        SelectedArtist = "Big Time Rush";
    }//GEN-LAST:event_BTRbtnActionPerformed

    private void ConanBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConanBTNActionPerformed
        BotonesArtistasPanel();
        SelectedArtist = "Conan Gray";
    }//GEN-LAST:event_ConanBTNActionPerformed

    private void ImagineDragonsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImagineDragonsBTNActionPerformed
        BotonesArtistasPanel();
        SelectedArtist = "Imagine Dragons";
    }//GEN-LAST:event_ImagineDragonsBTNActionPerformed

    private void LousiBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LousiBTNActionPerformed
        BotonesArtistasPanel();
        SelectedArtist = "Louis Tomilson";
    }//GEN-LAST:event_LousiBTNActionPerformed

    private void SkzBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkzBTNActionPerformed
        BotonesArtistasPanel();
        SelectedArtist = "Stray Kids";
    }//GEN-LAST:event_SkzBTNActionPerformed

    private void ManeskinBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManeskinBTNActionPerformed
        BotonesArtistasPanel();
        SelectedArtist = "Maneskin";
    }//GEN-LAST:event_ManeskinBTNActionPerformed

    private void BillieBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillieBTNActionPerformed
        BotonesArtistasPanel();
        SelectedArtist = "Billie Eilish";
    }//GEN-LAST:event_BillieBTNActionPerformed

    private void BTN5sosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN5sosActionPerformed
        BotonesArtistasPanel();
        SelectedArtist = "5SOS";
    }//GEN-LAST:event_BTN5sosActionPerformed

    private void HSbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HSbtnActionPerformed
        BotonesArtistasPanel();
        SelectedArtist = "Harry Styles";
    }//GEN-LAST:event_HSbtnActionPerformed

    private void BTNartistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNartistasActionPerformed
        if (actualPanel == panelproductoss) {
            panelproductoss.setVisible(false);
            panelArtistas.setVisible(true);
            panelArtistas.setEnabled(true);
            BTNartistas.setEnabled(false);
        }
    }//GEN-LAST:event_BTNartistasActionPerformed

    private void BTNproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNproductosActionPerformed

    }//GEN-LAST:event_BTNproductosActionPerformed

    private void SabrinaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabrinaBTNActionPerformed
        BotonesArtistasPanel();
    }//GEN-LAST:event_SabrinaBTNActionPerformed

    private void BeaMillerBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeaMillerBTNActionPerformed
        BotonesArtistasPanel();
        SelectedArtist = "Bea Miller";
    }//GEN-LAST:event_BeaMillerBTNActionPerformed

    public void BotonesArtistasPanel() {
        panelproductoss.setVisible(true);
        panelArtistas.setVisible(false);
        panelArtistas.setEnabled(false);
        BTNartistas.setEnabled(true);
        actualPanel = panelproductoss;
    }

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
    private javax.swing.JButton BTN5sos;
    private javax.swing.JButton BTNartistas;
    private javax.swing.JButton BTNelproducto;
    private javax.swing.JButton BTNproductos;
    private javax.swing.JButton BTRbtn;
    private javax.swing.JButton BeaMillerBTN;
    private javax.swing.JButton BillieBTN;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton ConanBTN;
    private javax.swing.JButton HSbtn;
    private javax.swing.JButton ImagineDragonsBTN;
    private javax.swing.JButton LousiBTN;
    private javax.swing.JButton ManeskinBTN;
    private javax.swing.JButton SabrinaBTN;
    private javax.swing.JButton SkzBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private custom.PanelRound menu;
    private javax.swing.JPanel panelArtistas;
    private custom.PanelRound panelRound1;
    private javax.swing.JPanel panelproductoss;
    // End of variables declaration//GEN-END:variables
}
