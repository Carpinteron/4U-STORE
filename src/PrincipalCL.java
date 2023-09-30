
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
        panelDELproducto.setVisible(false);
        BTNartistas.setEnabled(false);//boton para que muestre el panel de todos los artistas
        //La idea es que cuando se esten en el menu de artistas el boton este señalado o resaltado mas no se puede seleccionar
        BTNproductos.setEnabled(false);
        //si selecciona un artista, el botonartistas se habilita por si el usuario se quiere regrsar, y se resal el boton de los productos del artista
        BTNelproducto.setEnabled(false);
         TituloArtista.setText(SelectedArtist);
    }
    public String Frameanterior;
    public JPanel actualPanel;
    public String SelectedArtist;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new custom.PanelRound();
        jButton1 = new javax.swing.JButton();
        menu = new custom.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panelproductoss = new javax.swing.JPanel();
        TituloArtista = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCamisetas = new javax.swing.JButton();
        btnVINILOS = new javax.swing.JButton();
        btnGORRAS = new javax.swing.JButton();
        btnLLaveros = new javax.swing.JButton();
        btnCDS = new javax.swing.JButton();
        panelDELproducto = new javax.swing.JPanel();
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

        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/cerrrar35.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelRound1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1159, 6, -1, 44));

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

        panelRound1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelproductoss.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloArtista.setFont(new java.awt.Font("Tekton Pro", 0, 36)); // NOI18N
        TituloArtista.setText("Nombre del Artista");
        panelproductoss.add(TituloArtista, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 20, 475, 66));

        jLabel2.setText("¿Que producto desea explorar? ");
        panelproductoss.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 92, 263, 24));

        btnCamisetas.setText("CAMISETAS");
        btnCamisetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamisetasActionPerformed(evt);
            }
        });
        panelproductoss.add(btnCamisetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 163, 171, 359));

        btnVINILOS.setText("VINILOS");
        btnVINILOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVINILOSActionPerformed(evt);
            }
        });
        panelproductoss.add(btnVINILOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 163, 187, 359));

        btnGORRAS.setText("GORRAS");
        btnGORRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGORRASActionPerformed(evt);
            }
        });
        panelproductoss.add(btnGORRAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(856, 163, 195, 359));

        btnLLaveros.setText("LLAVEROS");
        btnLLaveros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLLaverosActionPerformed(evt);
            }
        });
        panelproductoss.add(btnLLaveros, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 163, 173, 359));

        btnCDS.setText("CD");
        btnCDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCDSActionPerformed(evt);
            }
        });
        panelproductoss.add(btnCDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 163, 180, 359));

        panelRound1.add(panelproductoss, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 1070, 590));

        javax.swing.GroupLayout panelDELproductoLayout = new javax.swing.GroupLayout(panelDELproducto);
        panelDELproducto.setLayout(panelDELproductoLayout);
        panelDELproductoLayout.setHorizontalGroup(
            panelDELproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        panelDELproductoLayout.setVerticalGroup(
            panelDELproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        panelRound1.add(panelDELproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 1060, 580));

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

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 56, 1098, 564));

        BTNartistas.setText("ARTISTAS");
        BTNartistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNartistasActionPerformed(evt);
            }
        });
        panelRound1.add(BTNartistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 6, -1, -1));

        BTNproductos.setText("PRODUCTOS");
        BTNproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNproductosActionPerformed(evt);
            }
        });
        panelRound1.add(BTNproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 6, -1, -1));

        BTNelproducto.setText("VISTAZO DEL PRODUCTO");
        panelRound1.add(BTNelproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 6, -1, -1));

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
       
        SelectedArtist = "Big Time Rush";
         BotonesArtistasPanel();
    }//GEN-LAST:event_BTRbtnActionPerformed

    private void ConanBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConanBTNActionPerformed
        
        SelectedArtist = "Conan Gray";
         BotonesArtistasPanel();
    }//GEN-LAST:event_ConanBTNActionPerformed

    private void ImagineDragonsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImagineDragonsBTNActionPerformed
       
        SelectedArtist = "Imagine Dragons";
         BotonesArtistasPanel();
    }//GEN-LAST:event_ImagineDragonsBTNActionPerformed

    private void LousiBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LousiBTNActionPerformed
        
        SelectedArtist = "Louis Tomilson";
        BotonesArtistasPanel();
    }//GEN-LAST:event_LousiBTNActionPerformed

    private void SkzBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkzBTNActionPerformed
        
        SelectedArtist = "Stray Kids";
        BotonesArtistasPanel();
    }//GEN-LAST:event_SkzBTNActionPerformed

    private void ManeskinBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManeskinBTNActionPerformed
        
        SelectedArtist = "Maneskin";
        BotonesArtistasPanel();
    }//GEN-LAST:event_ManeskinBTNActionPerformed

    private void BillieBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillieBTNActionPerformed
        
        SelectedArtist = "Billie Eilish";
        BotonesArtistasPanel();
    }//GEN-LAST:event_BillieBTNActionPerformed

    private void BTN5sosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN5sosActionPerformed
       
        SelectedArtist = "5SOS";
         BotonesArtistasPanel();
    }//GEN-LAST:event_BTN5sosActionPerformed

    private void HSbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HSbtnActionPerformed
        SelectedArtist = "Harry Styles";
        BotonesArtistasPanel();
        
        if (actualPanel == panelproductoss) {
           // TituloArtista.setText(SelectedArtist);
        }

    }//GEN-LAST:event_HSbtnActionPerformed

    private void BTNartistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNartistasActionPerformed
        if (actualPanel == panelproductoss |actualPanel==panelDELproducto) {
            panelproductoss.setVisible(false);
            panelDELproducto.setVisible(false);
            panelDELproducto.setEnabled(false);
            panelArtistas.setVisible(true);
            panelArtistas.setEnabled(true);
            BTNelproducto.setEnabled(false);
            BTNartistas.setEnabled(false);
            jScrollPane1.setVisible(true);
        }
    }//GEN-LAST:event_BTNartistasActionPerformed

    private void BTNproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNproductosActionPerformed
        if (actualPanel == panelDELproducto) {
            panelproductoss.setVisible(true);
            panelArtistas.setVisible(false);
            panelArtistas.setEnabled(false);
            BTNartistas.setEnabled(true);
            jScrollPane1.setVisible(false);
        }
    }//GEN-LAST:event_BTNproductosActionPerformed

    private void SabrinaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabrinaBTNActionPerformed
        SelectedArtist = "Sabrina Carpenter";
        BotonesArtistasPanel();
    }//GEN-LAST:event_SabrinaBTNActionPerformed

    private void BeaMillerBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeaMillerBTNActionPerformed
        
        SelectedArtist = "Bea Miller";
        BotonesArtistasPanel();
    }//GEN-LAST:event_BeaMillerBTNActionPerformed

    private void btnGORRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGORRASActionPerformed
        BotonesProductoPanel();
    }//GEN-LAST:event_btnGORRASActionPerformed

    private void btnVINILOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVINILOSActionPerformed
       BotonesProductoPanel();
    }//GEN-LAST:event_btnVINILOSActionPerformed

    private void btnCamisetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamisetasActionPerformed
        BotonesProductoPanel();
    }//GEN-LAST:event_btnCamisetasActionPerformed

    private void btnCDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDSActionPerformed
        BotonesProductoPanel();
    }//GEN-LAST:event_btnCDSActionPerformed

    private void btnLLaverosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLLaverosActionPerformed
        BotonesProductoPanel();
    }//GEN-LAST:event_btnLLaverosActionPerformed

    public void BotonesArtistasPanel() {
        panelproductoss.setVisible(true);
        panelproductoss.setEnabled(true);
        TituloArtista.setText(SelectedArtist);
        panelArtistas.setVisible(false);
        panelArtistas.setEnabled(false);
        BTNartistas.setEnabled(true);
        actualPanel = panelproductoss;
        jScrollPane1.setVisible(false);
    }
    public void BotonesProductoPanel(){
        panelDELproducto.setVisible(true);
        panelDELproducto.setEnabled(true);
        panelproductoss.setVisible(false);
        panelproductoss.setEnabled(false);
        panelArtistas.setVisible(false);
        panelArtistas.setEnabled(false);
        BTNartistas.setEnabled(true);
        BTNproductos.setEnabled(true);
        actualPanel = panelDELproducto;
        jScrollPane1.setVisible(false);
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
    private javax.swing.JLabel TituloArtista;
    private javax.swing.JButton btnCDS;
    private javax.swing.JButton btnCamisetas;
    private javax.swing.JButton btnGORRAS;
    private javax.swing.JButton btnLLaveros;
    private javax.swing.JButton btnVINILOS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private custom.PanelRound menu;
    private javax.swing.JPanel panelArtistas;
    private javax.swing.JPanel panelDELproducto;
    private custom.PanelRound panelRound1;
    private javax.swing.JPanel panelproductoss;
    // End of variables declaration//GEN-END:variables
}
