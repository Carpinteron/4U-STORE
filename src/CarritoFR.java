
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CarritoFR extends javax.swing.JFrame {

    private String user, cedula;
    private PrincipalCL clientefr;
    String precio;
     static int anterior=1;

    public CarritoFR(String user, String cedula, PrincipalCL clientefr) {
        setIconImage(new ImageIcon(getClass().getResource("ICons/4Uicon.png")).getImage());
        this.user = user;
        this.cedula = cedula;
        this.clientefr = clientefr;
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        initComponents();
        setLocationRelativeTo(null);
        calcularTotal();

        //VERIFICACION ignorar
        if (this.clientefr == null) {
            System.out.println("this.clientefr es null");
        } else {
            System.out.println("this.clientefr no es null");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new custom.PanelRound();
        BtnEXIT = new javax.swing.JButton();
        panelRound2 = new custom.PanelRound();
        BtnSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        BtnCarrito = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        PrecioTot = new javax.swing.JLabel();
        mensajito = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnEXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/cerrrar35.png"))); // NOI18N
        BtnEXIT.setBorder(null);
        BtnEXIT.setBorderPainted(false);
        BtnEXIT.setContentAreaFilled(false);
        BtnEXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEXITActionPerformed(evt);
            }
        });

        panelRound2.setBackground(new java.awt.Color(153, 102, 255));

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/regreso.png"))); // NOI18N
        BtnSalir.setContentAreaFilled(false);
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        jButton1.setText("Explore");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BtnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/carrito.png"))); // NOI18N
        BtnCarrito.setContentAreaFilled(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/Logo 4U_1.png"))); // NOI18N

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(panelRound2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnSalir)
                                    .addComponent(BtnCarrito))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel2)
                .addGap(86, 86, 86)
                .addComponent(jButton1)
                .addGap(48, 48, 48)
                .addComponent(BtnCarrito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalir)
                .addGap(23, 23, 23))
        );

        jButton2.setText("Pagae");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        PrecioTot.setText("jLabel1");

        mensajito.setText("jLabel1");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 677, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(BtnEXIT)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(PrecioTot, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(mensajito, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(BtnEXIT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(PrecioTot, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(mensajito, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String buscarprecio(String n, Scanner sc, String file) {
        String temp[] = n.split(";");
        String prod = temp[0];//nombre del producto
        String art = temp[1];//Artista
        boolean hay = false;
        String res = "-2";
        while (!hay) {
            try {
                BufferedReader read = new BufferedReader(new FileReader(file + ".txt"));
                String line; //definición de line
                boolean Encontrado = false;
                while ((line = read.readLine()) != null && Encontrado == false) {
                    String[] campos = line.split(";");
                    String artistaActual = campos[3], prodActual = campos[0];
                    if (artistaActual.equalsIgnoreCase(art) && prodActual.equals(prod)) {
                        Encontrado = true;
                        System.out.println(campos[4]);
                        res = campos[4];
                    }
                }
                if (Encontrado == false) {
                    System.out.println("No se encontro el nombre del semillero");
                    res = "-1";
                }
                read.close();
                hay = true;

            } catch (Exception e) {
                System.out.println("No se encontro el archivo");
            }

        }
        return res;

    }

    public static PrincipalAD.ListaEnlazada copiarLista(PrincipalAD.ListaEnlazada listaOriginal) {
        PrincipalAD.ListaEnlazada CarritocOPY = new PrincipalAD.ListaEnlazada();

        PrincipalAD.Nodo nodoActual = listaOriginal.head;
        while (nodoActual != null) {
            CarritocOPY.insertar(nodoActual.dato); // Inserta el valor del nodo en la lista de destino
            nodoActual = nodoActual.siguiente; // Mueve al siguiente nodo en la lista original
        }

        return CarritocOPY;
    }

    public void calcularTotal() {
        Scanner sc = new Scanner(System.in);
        PrincipalAD.ListaEnlazada Carrito = clientefr.Carrito;
        PrincipalAD.ListaEnlazada Names = clientefr.Names;
        copiarLista(Carrito);
        PrincipalAD.Nodo act = Names.head;
        double total = 0;

        while (act != null) {
            String nombre = act.dato;
            int cant = Carrito.contarRepeticiones(nombre);
            if (cant != 0) {
                String precioS = buscarprecio(nombre, sc, "Inventario");
                if (!precioS.equals("-1")) {
                    double p = Double.parseDouble(precioS);
                    total += p * cant;
                }
            }

            act = act.siguiente;
        }
        PrecioTot.setText(String.valueOf(total));
    }
    private void BtnEXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEXITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnEXITActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        perfilesFR menu = new perfilesFR(user, cedula);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PrincipalCL cl = new PrincipalCL(user, cedula);
        cl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        mensajito.setText("Gracias por la compra");

        PrincipalAD.ListaEnlazada Carrito = clientefr.Carrito;
        PrincipalAD.ListaEnlazada Names = clientefr.Names;
        PrincipalAD.ListaEnlazada Cantidad = clientefr.Cantidad;
        Scanner sc = new Scanner(System.in);
        PrincipalAD.CopiarlISTAaArchivo(sc, "Inventario", Names, Cantidad);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CarritoFR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarritoFR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarritoFR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarritoFR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new CarritoFR(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCarrito;
    private javax.swing.JButton BtnEXIT;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel PrecioTot;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mensajito;
    private custom.PanelRound panelRound1;
    private custom.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
