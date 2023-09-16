package AdminFrames;

import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrincipalAD extends javax.swing.JFrame {

    public PrincipalAD() {
          setUndecorated(true);
        setBackground(new Color(0,0,0,0));
        initComponents();
        setLocationRelativeTo(null);
        this.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new custom.PanelRound();
        jButton1 = new javax.swing.JButton();
        panelRound2 = new custom.PanelRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/cerrrar35.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        panelRound2.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1078, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    public static void ArchivoInventario(String file_name) {
        try {
            FileWriter outFile = new FileWriter(file_name + ".txt", false);
            PrintWriter registro = new PrintWriter(outFile);

            //Matriz para crear Archivo Existente 
            String[][] inventario = {
                //Seccion CONAN
                {"Camiseta CG", "20", "Conan Gray", "30000"},
                {"CD CG", "23", "Conan Gray", "30000"},
                {"Vinilo CG", "23", "ConanGray", "30000"},
                {"Gorra CG", "20", "Conan Gray", "30000"},
                {"Llavero CG", "20", "Conan Gray", "30000"},
                //SECCION BILLIE
                {"Camiseta BE", "34", "Billie Eilish", "30000"},
                {"CD BE", "24", "Billie Eilish","30000"},
                {"Vinilo BE", "30", "Billie Eilish","30000"},
                {"Gorra BE", "25", "Billie Eilish","30000"},
                {"Llavero BE", "28", "Billie Eilish","30000"},
                //SECCION HARRY
                {"CD HS", "6", "Harry Styles", ""},
                {"Camiseta HS", "6", "Harry Styles", "30000"},
                {"Gorra HS", "6", "Harry Styles", ""},
                {"Vinilo HS", "6", "Harry Styles", ""},
                {"Llavero HS", "6", "Harry Styles", ""},
                //SECCION SABRINA
                {"CD Sabrina", "7", "Sabrina Carpenter", ""},
                {"Camiseta Sabrina", "8","Sabrina Carpenter", ""},
                {"Vinilo Sabrina", "7", "Sabrina Carpenter", ""},
                {"Llavero Sabrina", "7", "Sabrina Carpenter", ""},
                {"Gorra Sabrina", "7", "Sabrina Carpenter", ""},
                //SECCION 5SOS
                {"CD 5SOS", "9", "5SOS", ""},
                {"Gorra 5SOS", "9", "5SOS", ""},
                {"Vinilo 5SOS", "9", "5SOS", ""},
                {"Llavero 5SOS", "9", "5SOS", ""},
                {"Camiseta 5SOS", "12", "5SOS", ""},
                //SECCION BTR
                {"Camiseta BTRush", "12", "Big Time Rush", ""},
                {"CD BTR", "12", "Big Time Rush", ""},
                {"Gorra BTR", "12", "Big Time Rush", ""},
                {"Vinilo BTR", "12", "Big Time Rush", ""},
                {"Llavero BTR", "12", "Big Time Rush", ""},
                //SECCION STRAY KIDS
                {"Camiseta SKZ", "23", "Stray Kids", ""},
                {"CD SKZ", "14", "Stray Kids", ""},
                {"Vinilo SKZ", "14", "Stray Kids", ""},
                {"Gorra SKZ", "14", "Stray Kids", ""},
                {"Llavero SKZ", "14", "Stray Kids", ""},
                //SECCION TXT
                {"CD TXT", "14", "TXT", ""},
                {"Camiseta TXT", "14", "TXT", ""},
                {"Vinilo TXT", "14", "TXT", ""},
                {"Gorra TXT", "14", "TXT", ""},
                {"Llavero TXT", "14", "TXT", ""},
                //SECCION TAYLOR
                {"Camiseta Taylor Swift", "15", "Taylor Swift", ""},
                {"CD Taylor Swift", "17", "Taylor Swift", ""},
                {"Llavero Taylor Swift", "17", "Taylor Swift", ""},
                {"Vinilo Taylor Swift", "17", "Taylor Swift", ""},
                {"Gorra Taylor Swift", "17", "Taylor Swift", ""},
                //SECCION LOUIS
                {"Camiseta Louis", "13", "Louis Tomilson", ""},
                {"CD Louis", "8", "Louis Tomilson", ""},
                {"Gorra Louis", "8", "Louis Tomilson", ""},
                {"Llavero Louis", "8", "Louis Tomilson", ""},
                {"Vinilo Louis", "8", "Louis Tomilson", ""},
                //SECCION IMEGINE DRAGONS
                {"Camiseta Imagine D", "24", "Imagine Dragons", ""},
                {"CD Imagine", "5", "Imagine Dragons", ""},
                {"Gorra Imagine", "5", "Imagine Dragons", ""},
                {"Llavero Imagine", "5", "Imagine Dragons", ""},
                {"Vinilo Imagine", "5", "Imagine Dragons", ""}
                

            };

            //Agregar datos de la matriz al registro
            for (String[] fila : inventario) {
                String NombreProducto = fila[0];
                String Cantidad = fila[1];
                String Categoria = fila[2]; //Por artista
                String Precio = fila[3];
               
                // Agregar los datos al archivo
                registro.println(NombreProducto + ";" + Cantidad + ";" + Categoria + ";" + Precio);

            }

            registro.close();
            System.out.println("Datos agregados exitosamente al archivo"+file_name);

        } catch (IOException ex) {
            System.out.println("Error al agregar datos al archivo");
            ex.printStackTrace();
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalAD().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private custom.PanelRound panelRound1;
    private custom.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
