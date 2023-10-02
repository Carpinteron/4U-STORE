
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class PrincipalAD extends javax.swing.JFrame {

    String user, cedula;

    public PrincipalAD(String user, String cedula) {
        setIconImage(new ImageIcon(getClass().getResource("ICons/4Uicon.png")).getImage());
        setUndecorated(true);
        this.user = user;
        this.cedula = cedula;
        setBackground(new Color(0, 0, 0, 0));
        initComponents();
        setLocationRelativeTo(null);
        this.setVisible(false);
        //Para mostrar archivo inventario 01
        ArchivoInventario("Inventario");// se puede reiniciar
        Usuarios("Usuarios");
        Scanner sc = new Scanner(System.in);
        LeerNormal(sc, "Inventario", TablaINVENTARIO);
        sc.close();
        userLABEL.setText(user);
        //No visible
        Contraseña.setVisible(true);
        Pantalla.setVisible(false);
        exitBTN.setVisible(false);
        PanelAgregar.setVisible(false);
        PanelAgregarPE.setVisible(false);
        PanelEliminar.setVisible(false);
        graficaspanel.setVisible(false);
        graficafondo.setVisible(false);
        //  CopiarArchivoAlISTA(sc, "Inventario");

        String[] cUsuarios;
        try {
            BufferedReader br = new BufferedReader(new FileReader("CedulasAdmins.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                cUsuarios = linea.split("\\| ");
                System.out.println("NOMBRE: " + cUsuarios[0]);
                if (cedula.equals(cUsuarios[1])) {
                    userLABEL.setText(cUsuarios[0]);
                    System.out.println("NOMBRE: " + cUsuarios[0]);
                }
            }

            br.close();
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo.");
            ex.printStackTrace();
        }
        user = userLABEL.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contraseña = new custom.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        BtnVerifyUser = new javax.swing.JButton();
        PassField = new javax.swing.JPasswordField();
        ojo = new javax.swing.JButton();
        AvisoLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userLABEL = new javax.swing.JLabel();
        BtnSalir1 = new javax.swing.JButton();
        BtnEXIT = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Pantalla = new custom.PanelRound();
        graficaspanel = new custom.PanelRound();
        graficafondo = new custom.PanelRound();
        BtnEXIT3 = new javax.swing.JButton();
        panelRound2 = new custom.PanelRound();
        BtnGrafics = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnInfo = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaINVENTARIO = new javax.swing.JTable();
        BTNAgregar1 = new javax.swing.JButton();
        PanelAgregar = new javax.swing.JPanel();
        jcCategoria = new javax.swing.JComboBox<>();
        jcArtista = new javax.swing.JComboBox<>();
        jcSubcategoria = new javax.swing.JComboBox<>();
        fieldPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelD = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BTNcerrarAgregar = new javax.swing.JButton();
        BTNAgregar2 = new javax.swing.JButton();
        BTNLimpiar1 = new javax.swing.JButton();
        error6 = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        error3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fieldDescripcion = new javax.swing.JTextField();
        error4 = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JLabel();
        fieldCant = new javax.swing.JTextField();
        error5 = new javax.swing.JLabel();
        exitBTN = new javax.swing.JButton();
        botonPE = new javax.swing.JButton();
        botonEP = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        PanelAgregarPE = new javax.swing.JPanel();
        panelRound1 = new custom.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        jcCategoriaPE = new javax.swing.JComboBox<>();
        jcArtistaPE = new javax.swing.JComboBox<>();
        jcSubcategoriaPE = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        labelDPE = new javax.swing.JLabel();
        BTNcerrarAgregar1 = new javax.swing.JButton();
        BTNAgregarPE = new javax.swing.JButton();
        BTNLimpiar2 = new javax.swing.JButton();
        error1PE = new javax.swing.JLabel();
        error2PE = new javax.swing.JLabel();
        error3PE = new javax.swing.JLabel();
        labelCantidad1 = new javax.swing.JLabel();
        fieldCantPE = new javax.swing.JTextField();
        error4PE = new javax.swing.JLabel();
        PanelEliminar = new javax.swing.JPanel();
        panelRound3 = new custom.PanelRound();
        jLabel12 = new javax.swing.JLabel();
        jcCategoriaEli = new javax.swing.JComboBox<>();
        jcArtistaEli = new javax.swing.JComboBox<>();
        jcSubcategoriaEli = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        labelDEli = new javax.swing.JLabel();
        BTNcerrarEliminar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BTNLimpiarEliminar = new javax.swing.JButton();
        error1Eli = new javax.swing.JLabel();
        error2Eli = new javax.swing.JLabel();
        error3Eli = new javax.swing.JLabel();
        graficas = new custom.PanelRound();
        BtnEXIT1 = new javax.swing.JButton();
        valid = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contraseña.setBackground(new java.awt.Color(153, 153, 255));
        Contraseña.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Verifique Contraseña De Administrador");
        Contraseña.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        BtnVerifyUser.setBackground(new java.awt.Color(38, 0, 75));
        BtnVerifyUser.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        BtnVerifyUser.setForeground(new java.awt.Color(209, 163, 255));
        BtnVerifyUser.setText("LOGIN");
        BtnVerifyUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(209, 163, 255), 2, true));
        BtnVerifyUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerifyUserActionPerformed(evt);
            }
        });
        Contraseña.add(BtnVerifyUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 70, 40));

        PassField.setBackground(new java.awt.Color(209, 163, 255));
        PassField.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        PassField.setForeground(new java.awt.Color(0, 0, 0));
        PassField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(38, 0, 75), 2, true));
        PassField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassFieldMouseClicked(evt);
            }
        });
        PassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassFieldActionPerformed(evt);
            }
        });
        Contraseña.add(PassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 160, 30));

        ojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/ojoabierto.png"))); // NOI18N
        ojo.setContentAreaFilled(false);
        ojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ojoActionPerformed(evt);
            }
        });
        Contraseña.add(ojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, 30));

        AvisoLabel.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        Contraseña.add(AvisoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 290, 25));
        Contraseña.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 120, 20));

        userLABEL.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        userLABEL.setForeground(new java.awt.Color(0, 0, 0));
        userLABEL.setText("User");
        Contraseña.add(userLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 140, 30));

        BtnSalir1.setBackground(new java.awt.Color(38, 0, 75));
        BtnSalir1.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        BtnSalir1.setForeground(new java.awt.Color(209, 163, 255));
        BtnSalir1.setText("OUT");
        BtnSalir1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(209, 163, 255), 2, true));
        BtnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalir1ActionPerformed(evt);
            }
        });
        Contraseña.add(BtnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 334, 50, 30));

        BtnEXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/cerrrar35.png"))); // NOI18N
        BtnEXIT.setBorder(null);
        BtnEXIT.setBorderPainted(false);
        BtnEXIT.setContentAreaFilled(false);
        BtnEXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEXITActionPerformed(evt);
            }
        });
        Contraseña.add(BtnEXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/adminimg.png"))); // NOI18N
        Contraseña.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/Logo 4U_1.png"))); // NOI18N
        Contraseña.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        jButton2.setText("SKIP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Contraseña.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        getContentPane().add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 560, 370));

        Pantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        graficaspanel.setBackground(new java.awt.Color(153, 153, 255));
        graficaspanel.setOpaque(true);
        graficaspanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Pantalla.add(graficaspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 610, 380));

        graficafondo.setBackground(new java.awt.Color(153, 153, 255));
        graficafondo.setOpaque(true);
        graficafondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnEXIT3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/cerrrar35.png"))); // NOI18N
        BtnEXIT3.setBorder(null);
        BtnEXIT3.setBorderPainted(false);
        BtnEXIT3.setContentAreaFilled(false);
        BtnEXIT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEXIT3ActionPerformed(evt);
            }
        });
        graficafondo.add(BtnEXIT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 30, -1));

        Pantalla.add(graficafondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 430));

        panelRound2.setBackground(new java.awt.Color(153, 153, 255));

        BtnGrafics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/graficas.png"))); // NOI18N
        BtnGrafics.setContentAreaFilled(false);
        BtnGrafics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGraficsActionPerformed(evt);
            }
        });

        BtnSalir.setText("OUT");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnInfo.setText("Info");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/reg.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/Logo 4U_1.png"))); // NOI18N

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnGrafics, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(31, 31, 31)
                .addComponent(BtnGrafics, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(BtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        Pantalla.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 700));

        TablaINVENTARIO.setFont(new java.awt.Font("Sylfaen", 0, 13)); // NOI18N
        TablaINVENTARIO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                " Nombre del producto", "Cantidad en stock", "Categoría", "Artista", "Precio unitario de venta"
            }
        ));
        jScrollPane1.setViewportView(TablaINVENTARIO);

        Pantalla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 146, 950, 420));

        BTNAgregar1.setText("Agregar Nuevo Producto");
        BTNAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregar1ActionPerformed(evt);
            }
        });
        Pantalla.add(BTNAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        PanelAgregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar categoria", "Camiseta", "Gorra", "CD", "Vinilo", "Llavero" }));
        jcCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCategoriaActionPerformed(evt);
            }
        });
        PanelAgregar.add(jcCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 83, 275, -1));

        jcArtista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar artista", "Conan Gray", "Harry Styles", "Sabrina Carpenter", "Taylor Swift", "Billie Eilish", "Louis Tomlinson", "5SOS", "Stray Kids", "Big Time Rush", "TXT", "Imagine Dragons" }));
        jcArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcArtistaActionPerformed(evt);
            }
        });
        PanelAgregar.add(jcArtista, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 133, 275, -1));

        jcSubcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSubcategoriaActionPerformed(evt);
            }
        });
        PanelAgregar.add(jcSubcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 275, -1));
        PanelAgregar.add(fieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 275, -1));

        jLabel1.setText("Categoría");
        PanelAgregar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 86, -1, -1));

        jLabel2.setText("Artista");
        PanelAgregar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 136, 51, -1));

        labelD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelD.setText("Talla/Album/Tipo (todo depende de lo anterior)");
        PanelAgregar.add(labelD, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 204, -1));

        jLabel5.setText("Precio unitario (COP)");
        PanelAgregar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 147, -1));

        BTNcerrarAgregar.setText("Cerrar");
        BTNcerrarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcerrarAgregarActionPerformed(evt);
            }
        });
        PanelAgregar.add(BTNcerrarAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 32, -1, -1));

        BTNAgregar2.setText("Agregar");
        BTNAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregar2ActionPerformed(evt);
            }
        });
        PanelAgregar.add(BTNAgregar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(716, 369, -1, -1));

        BTNLimpiar1.setText("Limpiar");
        BTNLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLimpiar1ActionPerformed(evt);
            }
        });
        PanelAgregar.add(BTNLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 369, -1, -1));

        error6.setFont(new java.awt.Font("Perpetua", 0, 12)); // NOI18N
        error6.setForeground(new java.awt.Color(255, 0, 0));
        error6.setText("(!) El monto debe ser numérico y mayor a cero");
        PanelAgregar.add(error6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 290, 40));

        error1.setFont(new java.awt.Font("Perpetua", 0, 12)); // NOI18N
        error1.setForeground(new java.awt.Color(255, 0, 0));
        error1.setText("(!) Debe seleccionar una categoría");
        PanelAgregar.add(error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 290, 22));

        error2.setFont(new java.awt.Font("Perpetua", 0, 12)); // NOI18N
        error2.setForeground(new java.awt.Color(255, 0, 0));
        error2.setText("(!) Debe seleccionar un artista");
        PanelAgregar.add(error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 290, 22));

        error3.setFont(new java.awt.Font("Perpetua", 0, 12)); // NOI18N
        error3.setForeground(new java.awt.Color(255, 0, 0));
        error3.setText("(!) Debe seleccionar un artista");
        PanelAgregar.add(error3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 290, 40));

        jLabel8.setText("Descripción producto");
        PanelAgregar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        fieldDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDescripcionActionPerformed(evt);
            }
        });
        PanelAgregar.add(fieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 270, -1));

        error4.setFont(new java.awt.Font("Perpetua", 0, 12)); // NOI18N
        error4.setForeground(new java.awt.Color(255, 0, 0));
        error4.setText("(!) Debe ingresar una descripción");
        PanelAgregar.add(error4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 180, -1));

        labelCantidad.setText("Cantidad");
        PanelAgregar.add(labelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        fieldCant.setText("1");
        fieldCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCantActionPerformed(evt);
            }
        });
        PanelAgregar.add(fieldCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 270, -1));

        error5.setFont(new java.awt.Font("Perpetua", 0, 12)); // NOI18N
        error5.setForeground(new java.awt.Color(255, 0, 0));
        error5.setText("(!) Debe ser mayor a cero");
        PanelAgregar.add(error5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        Pantalla.add(PanelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 950, 430));

        exitBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/cerrrar35.png"))); // NOI18N
        exitBTN.setBorderPainted(false);
        exitBTN.setContentAreaFilled(false);
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });
        Pantalla.add(exitBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, -1, 40));

        botonPE.setText("Agregar producto Existente");
        botonPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPEActionPerformed(evt);
            }
        });
        Pantalla.add(botonPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, -1, -1));

        botonEP.setText("Eliminar Producto");
        botonEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEPActionPerformed(evt);
            }
        });
        Pantalla.add(botonEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 70, -1, -1));

        btnactualizar.setText("Actualizar Inventario de acuerdo a ventas");
        Pantalla.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        PanelAgregarPE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Categoría");
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 86, -1, -1));

        jcCategoriaPE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar categoria", "Camiseta", "Gorra", "CD", "Vinilo", "Llavero" }));
        jcCategoriaPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCategoriaPEActionPerformed(evt);
            }
        });
        panelRound1.add(jcCategoriaPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 83, 275, -1));

        jcArtistaPE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar artista", "Conan Gray", "Harry Styles", "Sabrina Carpenter", "Taylor Swift", "Billie Eilish", "Louis Tomlinson", "5SOS", "Stray Kids", "Big Time Rush", "TXT", "Imagine Dragons" }));
        jcArtistaPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcArtistaPEActionPerformed(evt);
            }
        });
        panelRound1.add(jcArtistaPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 133, 275, -1));

        jcSubcategoriaPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSubcategoriaPEActionPerformed(evt);
            }
        });
        panelRound1.add(jcSubcategoriaPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 275, -1));

        jLabel11.setText("Artista");
        panelRound1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 136, 51, -1));

        labelDPE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelDPE.setText("Seleccione el producto ");
        panelRound1.add(labelDPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 204, -1));

        BTNcerrarAgregar1.setText("Cerrar");
        BTNcerrarAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcerrarAgregar1ActionPerformed(evt);
            }
        });
        panelRound1.add(BTNcerrarAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 32, -1, -1));

        BTNAgregarPE.setText("Agregar");
        BTNAgregarPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPEActionPerformed(evt);
            }
        });
        panelRound1.add(BTNAgregarPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, -1, -1));

        BTNLimpiar2.setText("Limpiar");
        BTNLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLimpiar2ActionPerformed(evt);
            }
        });
        panelRound1.add(BTNLimpiar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, -1, -1));

        error1PE.setFont(new java.awt.Font("Perpetua", 0, 12)); // NOI18N
        error1PE.setForeground(new java.awt.Color(255, 0, 0));
        error1PE.setText("(!) Debe seleccionar una categoría");
        panelRound1.add(error1PE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 290, 22));

        error2PE.setFont(new java.awt.Font("Perpetua", 0, 12)); // NOI18N
        error2PE.setForeground(new java.awt.Color(255, 0, 0));
        error2PE.setText("(!) Debe seleccionar un artista");
        panelRound1.add(error2PE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 290, 22));

        error3PE.setFont(new java.awt.Font("Perpetua", 0, 12)); // NOI18N
        error3PE.setForeground(new java.awt.Color(255, 0, 0));
        error3PE.setText("(!) Debe seleccionar un producto");
        panelRound1.add(error3PE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 290, 40));

        labelCantidad1.setText("Cantidad");
        panelRound1.add(labelCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        fieldCantPE.setText("1");
        fieldCantPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCantPEActionPerformed(evt);
            }
        });
        panelRound1.add(fieldCantPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 270, -1));

        error4PE.setFont(new java.awt.Font("Perpetua", 0, 12)); // NOI18N
        error4PE.setForeground(new java.awt.Color(255, 0, 0));
        error4PE.setText("(!) Debe ser mayor a cero");
        panelRound1.add(error4PE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        PanelAgregarPE.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 440));

        Pantalla.add(PanelAgregarPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 950, 430));

        PanelEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Categoría");
        panelRound3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 86, -1, -1));

        jcCategoriaEli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar categoria", "Camiseta", "Gorra", "CD", "Vinilo", "Llavero" }));
        jcCategoriaEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCategoriaEliActionPerformed(evt);
            }
        });
        panelRound3.add(jcCategoriaEli, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 83, 275, -1));

        jcArtistaEli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar artista", "Conan Gray", "Harry Styles", "Sabrina Carpenter", "Taylor Swift", "Billie Eilish", "Louis Tomlinson", "5SOS", "Stray Kids", "Big Time Rush", "TXT", "Imagine Dragons" }));
        jcArtistaEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcArtistaEliActionPerformed(evt);
            }
        });
        panelRound3.add(jcArtistaEli, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 275, -1));

        jcSubcategoriaEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSubcategoriaEliActionPerformed(evt);
            }
        });
        panelRound3.add(jcSubcategoriaEli, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 275, -1));

        jLabel13.setText("Artista");
        panelRound3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 51, -1));

        labelDEli.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelDEli.setText("Seleccione el producto ");
        panelRound3.add(labelDEli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 204, -1));

        BTNcerrarEliminar.setText("Cerrar");
        BTNcerrarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcerrarEliminarActionPerformed(evt);
            }
        });
        panelRound3.add(BTNcerrarEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 32, -1, -1));

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        panelRound3.add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, -1, -1));

        BTNLimpiarEliminar.setText("Limpiar");
        BTNLimpiarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLimpiarEliminarActionPerformed(evt);
            }
        });
        panelRound3.add(BTNLimpiarEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, -1, -1));

        error1Eli.setFont(new java.awt.Font("Perpetua", 0, 12)); // NOI18N
        error1Eli.setForeground(new java.awt.Color(255, 0, 0));
        error1Eli.setText("(!) Debe seleccionar una categoría");
        panelRound3.add(error1Eli, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 290, 22));

        error2Eli.setFont(new java.awt.Font("Perpetua", 0, 12)); // NOI18N
        error2Eli.setForeground(new java.awt.Color(255, 0, 0));
        error2Eli.setText("(!) Debe seleccionar un artista");
        panelRound3.add(error2Eli, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 290, 22));

        error3Eli.setFont(new java.awt.Font("Perpetua", 0, 12)); // NOI18N
        error3Eli.setForeground(new java.awt.Color(255, 0, 0));
        error3Eli.setText("(!) Debe seleccionar un producto");
        panelRound3.add(error3Eli, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 290, 40));

        PanelEliminar.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 440));

        graficas.setBackground(new java.awt.Color(153, 102, 255));

        BtnEXIT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/cerrrar35.png"))); // NOI18N
        BtnEXIT1.setBorder(null);
        BtnEXIT1.setBorderPainted(false);
        BtnEXIT1.setContentAreaFilled(false);
        BtnEXIT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEXIT1ActionPerformed(evt);
            }
        });

        valid.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        valid.setForeground(new java.awt.Color(0, 0, 0));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/Logo 4U_1.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(38, 0, 75));
        jLabel18.setText("GRÁFICAS");

        javax.swing.GroupLayout graficasLayout = new javax.swing.GroupLayout(graficas);
        graficas.setLayout(graficasLayout);
        graficasLayout.setHorizontalGroup(
            graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graficasLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(graficasLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 230, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, graficasLayout.createSequentialGroup()
                        .addComponent(BtnEXIT1)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        graficasLayout.setVerticalGroup(
            graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graficasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(BtnEXIT1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap())
            .addGroup(graficasLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(valid, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PanelEliminar.add(graficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Pantalla.add(PanelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 950, 430));

        getContentPane().add(Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Subrutinas
    //01 Subrutina para crear inventario inicial
    public static void ArchivoInventario(String file_name) {
        try {
            FileWriter outFile = new FileWriter(file_name + ".txt", false);
            PrintWriter registro = new PrintWriter(outFile);

            //Matriz para crear Archivo Existente 
            String[][] inventario = {
                //Seccion CONAN
                {"Camiseta XS", "20", "Camiseta", "Conan Gray", "30000"},
                {"Camiseta S", "20", "Camiseta", "Conan Gray", "30000"},
                {"Camiseta M", "20", "Camiseta", "Conan Gray", "30000"},
                {"Camiseta L", "20", "Camiseta", "Conan Gray", "30000"},
                {"Camiseta XL", "20", "Camiseta", "Conan Gray", "30000"},
                {"CD Sunset Season", "23", "CD", "Conan Gray", "35000"},
                {"CD Kid Grow", "23", "CD", "Conan Gray", "35000"},
                {"CD Superache", "23", "CD", "Conan Gray", "35000"},
                {"Vinilo Sunset Season", "23", "Vinilo", "Conan Gray", "45000"},
                {"Vinilo Kid Grow", "23", "Vinilo", "Conan Gray", "45000"},
                {"Vinilo Superache", "23", "Vinilo", "Conan Gray", "45000"},
                {"Gorra Béisbol", "20", "Gorra", "Conan Gray", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "Conan Gray", "25000"},
                {"Gorra Trucker", "20", "Gorra", "Conan Gray", "25000"},
                {"Llavero 1", "20", "Llavero", "Conan Gray", "15000"},
                {"Llavero 2", "20", "Llavero", "Conan Gray", "15000"},
                {"Llavero 3", "20", "Llavero", "Conan Gray", "15000"},
                //SECCION BILLIE
                {"Camiseta XS", "34", "Camiseta", "Billie Eilish", "30000"},
                {"Camiseta S", "32", "Camiseta", "Billie Eilish", "30000"},
                {"Camiseta M", "30", "Camiseta", "Billie Eilish", "30000"},
                {"Camiseta L", "28", "Camiseta", "Billie Eilish", "30000"},
                {"Camiseta XL", "26", "Camiseta", "Billie Eilish", "30000"},
                {"CD When We All Fall Asleep, Where Do We Go?", "24", "CD", "Billie Eilish", "35000"},
                {"CD Happier Than Ever", "24", "CD", "Billie Eilish", "35000"},
                {"CD Don't Smile at Me", "24", "CD", "Billie Eilish", "35000"},
                {"CD Live at Third Man Records", "24", "CD", "Billie Eilish", "35000"},
                {"Vinilo When We All Fall Asleep, Where Do We Go?", "24", "Vinilo", "Billie Eilish", "45000"},
                {"Vinilo Happier Than Ever", "24", "Vinilo", "Billie Eilish", "45000"},
                {"Vinilo Don't Smile at Me", "24", "Vinilo", "Billie Eilish", "45000"},
                {"Vinilo Live at Third Man Records", "24", "Vinilo", "Billie Eilish", "45000"},
                {"Gorra Béisbol", "20", "Gorra", "Billie Eilish", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "Billie Eilish", "25000"},
                {"Gorra Trucker", "20", "Gorra", "Billie Eilish", "25000"},
                {"Llavero 1", "20", "Llavero", "Billie Eilish", "15000"},
                {"Llavero 2", "20", "Llavero", "Billie Eilish", "15000"},
                {"Llavero 3", "20", "Llavero", "Billie Eilish", "15000"},
                //SECCION HARRY
                //"Harry Styles", "Fine Line", "Harry's House"
                {"Camiseta XS", "32", "Camiseta", "Harry Styles", "30000"},
                {"Camiseta S", "30", "Camiseta", "Harry Styles", "30000"},
                {"Camiseta M", "28", "Camiseta", "Harry Styles", "30000"},
                {"Camiseta L", "26", "Camiseta", "Harry Styles", "30000"},
                {"Camiseta XL", "24", "Camiseta", "Harry Styles", "30000"},
                {"Camiseta HS", "6", "Camiseta", "Harry Styles", "30000"},
                {"Gorra Béisbol", "20", "Gorra", "Harry Styles", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "Harry Styles", "25000"},
                {"Gorra Trucker", "20", "Gorra", "Harry Styles", "25000"},
                {"CD Harry Styles", "24", "CD", "Harry Styles", "35000"},
                {"CD Fine Line", "24", "CD", "Harry Styles", "35000"},
                {"CD Harry's House", "24", "CD", "Harry Styles", "35000"},
                {"Vinilo Harry Styles", "18", "Vinilo", "Harry Styles", "45000"},
                {"Vinilo Fine Line", "18", "Vinilo", "Harry Styles", "45000"},
                {"Vinilo Harry's House", "18", "Vinilo", "Harry Styles", "45000"},
                {"Llavero 1", "20", "Llavero", "Harry Styles", "15000"},
                {"Llavero 2", "20", "Llavero", "Harry Styles", "15000"},
                {"Llavero 3", "20", "Llavero", "Harry Styles", "15000"},
                //SECCION SABRINA
                {"CD Eyes Wide Open", "24", "CD", "Sabrina Carpenter", "35000"},
                {"CD Evolution", "24", "CD", "Sabrina Carpenter", "35000"},
                {"CD Emails I Can't Send", "24", "CD", "Sabrina Carpenter", "35000"},
                {"Camiseta XS", "30", "Camiseta", "Sabrina Carpenter", "30000"},
                {"Camiseta S", "28", "Camiseta", "Sabrina Carpenter", "30000"},
                {"Camiseta M", "26", "Camiseta", "Sabrina Carpenter", "30000"},
                {"Camiseta L", "24", "Camiseta", "Sabrina Carpenter", "30000"},
                {"Camiseta XL", "22", "Camiseta", "Sabrina Carpenter", "30000"},
                {"Vinilo Eyes Wide Open", "18", "Vinilo", "Sabrina Carpenter", "45000"},
                {"Vinilo Evolution", "18", "Vinilo", "Sabrina Carpenter", "45000"},
                {"Vinilo Emails I Can't Send", "18", "Vinilo", "Sabrina Carpenter", "45000"},
                {"Llavero 1", "20", "Llavero", "Sabrina Carpenter", "15000"},
                {"Llavero 2", "20", "Llavero", "Sabrina Carpenter", "15000"},
                {"Llavero 3", "20", "Llavero", "Sabrina Carpenter", "15000"},
                {"Gorra Béisbol", "20", "Gorra", "Sabrina Carpenter", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "Sabrina Carpenter", "25000"},
                {"Gorra Trucker", "20", "Gorra", "Sabrina Carpenter", "25000"},
                //SECCION 5SOS
                {"CD 5 Seconds of Summer", "24", "CD", "5SOS", "35000"},
                {"CD Sounds Good Feels Good", "24", "CD", "5SOS", "35000"},
                {"CD Youngblood", "24", "CD", "5SOS", "35000"},
                {"CD CALM", "24", "CD", "5SOS", "35000"},
                {"CD 5SOS5", "24", "CD", "5SOS", "35000"},
                {"Gorra Béisbol", "20", "Gorra", "5SOS", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "5SOS", "25000"},
                {"Gorra Trucker", "20", "Gorra", "5SOS", "25000"},
                {"Vinilo 5 Seconds of Summer", "18", "Vinilo", "5SOS", "45000"},
                {"Vinilo Sounds Good Feels Good", "18", "Vinilo", "5SOS", "45000"},
                {"Vinilo Youngblood", "18", "Vinilo", "5SOS", "45000"},
                {"Vinilo CALM", "18", "Vinilo", "5SOS", "45000"},
                {"Vinilo 5SOS5", "18", "Vinilo", "5SOS", "45000"},
                {"Llavero 1", "20", "Llavero", "5SOS", "15000"},
                {"Llavero 2", "20", "Llavero", "5SOS", "15000"},
                {"Llavero 3", "20", "Llavero", "5SOS", "15000"},
                {"Camiseta XS", "28", "Camiseta", "5SOS", "30000"},
                {"Camiseta S", "26", "Camiseta", "5SOS", "30000"},
                {"Camiseta M", "24", "Camiseta", "5SOS", "30000"},
                {"Camiseta L", "22", "Camiseta", "5SOS", "30000"},
                {"Camiseta XL", "20", "Camiseta", "5SOS", "30000"},
                //SECCION BTR
                {"Camiseta XS", "26", "Camiseta", "Big Time Rush", "30000"},
                {"Camiseta S", "24", "Camiseta", "Big Time Rush", "30000"},
                {"Camiseta M", "22", "Camiseta", "Big Time Rush", "30000"},
                {"Camiseta L", "20", "Camiseta", "Big Time Rush", "30000"},
                {"Camiseta XL", "18", "Camiseta", "Big Time Rush", "30000"},
                {"CD BTR", "22", "CD", "Big Time Rush", "35000"},
                {"CD Elevate", "22", "CD", "Big Time Rush", "35000"},
                {"CD 24/Seven", "22", "CD", "Big Time Rush", "35000"},
                {"CD Another Life", "22", "CD", "Big Time Rush", "35000"},
                {"Gorra Béisbol", "20", "Gorra", "Big Time Rush", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "Big Time Rush", "25000"},
                {"Gorra Trucker", "20", "Gorra", "Big Time Rush", "25000"},
                {"Vinilo BTR", "19", "Vinilo", "Big Time Rush", "45000"},
                {"Vinilo Elevate", "19", "Vinilo", "Big Time Rush", "45000"},
                {"Vinilo 24/Seven", "19", "Vinilo", "Big Time Rush", "45000"},
                {"Vinilo Another Life", "19", "Vinilo", "Big Time Rush", "45000"},
                {"Llavero 1", "20", "Llavero", "Big Time Rush", "15000"},
                {"Llavero 2", "20", "Llavero", "Big Time Rush", "15000"},
                {"Llavero 3", "20", "Llavero", "Big Time Rush", "15000"},
                //SECCION STRAY KIDS
                {"Camiseta XS", "24", "Camiseta", "Stray Kids", "30000"},
                {"Camiseta S", "22", "Camiseta", "Stray Kids", "30000"},
                {"Camiseta M", "20", "Camiseta", "Stray Kids", "30000"},
                {"Camiseta L", "18", "Camiseta", "Stray Kids", "30000"},
                {"Camiseta XL", "16", "Camiseta", "Stray Kids", "30000"},
                {"CD Go Live", "20", "CD", "Stray Kids", "35000"},
                {"CD No Easy", "20", "CD", "Stray Kids", "35000"},
                {"CD 5Stars", "20", "CD", "Stray Kids", "35000"},
                {"CD ODDINARY", "20", "CD", "Stray Kids", "35000"},
                {"CD Maxident", "20", "CD", "Stray Kids", "35000"},
                {"Vinilo Go Live", "17", "Vinilo", "Stray Kids", "45000"},
                {"Vinilo No Easy", "17", "Vinilo", "Stray Kids", "45000"},
                {"Vinilo 5Stars", "17", "Vinilo", "Stray Kids", "45000"},
                {"Vinilo ODDINARY", "17", "Vinilo", "Stray Kids", "45000"},
                {"Vinilo Maxident", "17", "Vinilo", "Stray Kids", "45000"},
                {"Gorra Béisbol", "20", "Gorra", "Stray Kids", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "Stray Kids", "25000"},
                {"Gorra Trucker", "20", "Gorra", "Stray Kids", "25000"},
                {"Llavero 1", "20", "Llavero", "Stray Kids", "15000"},
                {"Llavero 2", "20", "Llavero", "Stray Kids", "15000"},
                {"Llavero 3", "20", "Llavero", "Stray Kids", "15000"},
                //SECCION TXT
                {"CD The Dream Chapter: STAR", "21", "CD", "TXT", "35000"},
                {"CD Still Dreaming", "21", "CD", "TXT", "35000"},
                {"CD The Chaos Chapter: FREEZE", "21", "CD", "TXT", "35000"},
                {"CD Sweet", "21", "CD", "TXT", "35000"},
                {"Camiseta XS", "22", "Camiseta", "TXT", "30000"},
                {"Camiseta S", "20", "Camiseta", "TXT", "30000"},
                {"Camiseta M", "18", "Camiseta", "TXT", "30000"},
                {"Camiseta L", "16", "Camiseta", "TXT", "30000"},
                {"Camiseta XL", "14", "Camiseta", "TXT", "30000"},
                {"Vinilo The Dream Chapter: STAR", "19", "Vinilo", "TXT", "45000"},
                {"Vinilo Still Dreaming", "19", "Vinilo", "TXT", "45000"},
                {"Vinilo The Chaos Chapter: FREEZE", "19", "Vinilo", "TXT", "45000"},
                {"Vinilo Sweet", "19", "Vinilo", "TXT", "45000"},
                {"Gorra Béisbol", "20", "Gorra", "TXT", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "TXT", "25000"},
                {"Gorra Trucker", "20", "Gorra", "TXT", "25000"},
                {"Llavero 1", "20", "Llavero", "TXT", "15000"},
                {"Llavero 2", "20", "Llavero", "TXT", "15000"},
                {"Llavero 3", "20", "Llavero", "TXT", "15000"},
                //SECCION TAYLOR
                {"Camiseta XS", "20", "Camiseta", "Taylor Swift", "30000"},
                {"Camiseta S", "18", "Camiseta", "Taylor Swift", "30000"},
                {"Camiseta M", "16", "Camiseta", "Taylor Swift", "30000"},
                {"Camiseta L", "14", "Camiseta", "Taylor Swift", "30000"},
                {"Camiseta XL", "12", "Camiseta", "Taylor Swift", "30000"},
                {"CD Fearless (Taylor's version)", "25", "CD", "Taylor Swift", "35000"},
                {"CD Speak Now (Taylor's version)", "25", "CD", "Taylor Swift", "35000"},
                {"CD Red (Taylor's version)", "25", "CD", "Taylor Swift", "35000"},
                {"CD Lover", "25", "CD", "Taylor Swift", "35000"},
                {"CD Folklore", "25", "CD", "Taylor Swift", "35000"},
                {"CD Evermore", "25", "CD", "Taylor Swift", "35000"},
                {"CD Midnights", "25", "CD", "Taylor Swift", "35000"},
                {"Llavero 1", "20", "Llavero", "Taylor Swift", "15000"},
                {"Llavero 2", "20", "Llavero", "Taylor Swift", "15000"},
                {"Llavero 3", "20", "Llavero", "Taylor Swift", "15000"},
                {"Vinilo Fearless (Taylor's version)", "20", "Vinilo", "Taylor Swift", "45000"},
                {"Vinilo Speak Now (Taylor's version)", "20", "Vinilo", "Taylor Swift", "45000"},
                {"Vinilo Red (Taylor's version)", "20", "Vinilo", "Taylor Swift", "45000"},
                {"Vinilo Lover", "20", "Vinilo", "Taylor Swift", "45000"},
                {"Vinilo Folklore", "20", "Vinilo", "Taylor Swift", "45000"},
                {"Vinilo Evermore", "20", "Vinilo", "Taylor Swift", "45000"},
                {"Vinilo Midnights", "20", "Vinilo", "Taylor Swift", "45000"},
                {"Gorra Béisbol", "20", "Gorra", "Taylor Swift", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "Taylor Swift", "25000"},
                {"Gorra Trucker", "20", "Gorra", "Taylor Swift", "25000"},
                //SECCION LOUIS
                {"Camiseta XS", "18", "Camiseta", "Louis Tomlinson", "30000"},
                {"Camiseta S", "16", "Camiseta", "Louis Tomlinson", "30000"},
                {"Camiseta M", "14", "Camiseta", "Louis Tomlinson", "30000"},
                {"Camiseta L", "12", "Camiseta", "Louis Tomlinson", "30000"},
                {"Camiseta XL", "10", "Camiseta", "Louis Tomlinson", "30000"},
                {"CD Walls", "19", "CD", "Louis Tomilson", "35000"},
                {"CD Faith in the Future", "19", "CD", "Louis Tomilson", "35000"},
                {"Gorra Béisbol", "20", "Gorra", "Louis Tomlinson", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "Louis Tomlinson", "25000"},
                {"Gorra Trucker", "20", "Gorra", "Louis Tomlinson", "25000"},
                {"Llavero 1", "20", "Llavero", "Louis Tomlinson", "15000"},
                {"Llavero 2", "20", "Llavero", "Louis Tomlinson", "15000"},
                {"Llavero 3", "20", "Llavero", "Louis Tomlinson", "15000"},
                {"Vinilo Walls", "15", "Vinilo", "Louis Tomilson", "45000"},
                {"Vinilo Faith in the Future", "15", "Vinilo", "Louis Tomilson", "45000"},
                //SECCION IMAGINE DRAGONS
                {"Camiseta XS", "16", "Camiseta", "Imagine Dragons", "30000"},
                {"Camiseta S", "14", "Camiseta", "Imagine Dragons", "30000"},
                {"Camiseta M", "12", "Camiseta", "Imagine Dragons", "30000"},
                {"Camiseta L", "10", "Camiseta", "Imagine Dragons", "30000"},
                {"Camiseta XL", "8", "Camiseta", "Imagine Dragons", "30000"},
                {"CD Night Visions", "17", "CD", "Imagine Dragons", "35000"},
                {"CD Smoke + Mirrors", "17", "CD", "Imagine Dragons", "35000"},
                {"CD Evolve", "17", "CD", "Imagine Dragons", "35000"},
                {"CD Origins", "17", "CD", "Imagine Dragons", "35000"},
                {"CD Mercury", "17", "CD", "Imagine Dragons", "35000"},
                {"Gorra Béisbol", "20", "Gorra", "Imagine Dragons", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "Imagine Dragons", "25000"},
                {"Gorra Trucker", "20", "Gorra", "Imagine Dragons", "25000"},
                {"Llavero 1", "20", "Llavero", "Imagine Dragons", "15000"},
                {"Llavero 2", "20", "Llavero", "Imagine Dragons", "15000"},
                {"Llavero 3", "20", "Llavero", "Imagine Dragons", "15000"},
                {"Vinilo Night Visions", "15", "Vinilo", "Imagine Dragons", "45000"},
                {"Vinilo Smoke + Mirrors", "15", "Vinilo", "Imagine Dragons", "45000"},
                {"Vinilo Evolve", "15", "Vinilo", "Imagine Dragons", "45000"},
                {"Vinilo Origins", "15", "Vinilo", "Imagine Dragons", "45000"},
                {"Vinilo Mercury", "15", "Vinilo", "Imagine Dragons", "45000"}

            };

            //Agregar datos de la matriz al registro
            for (String[] fila : inventario) {
                String NombreProducto = fila[0];
                String Cantidad = fila[1];
                String Categoria = fila[2];
                String Artista = fila[3];
                String Precio = fila[4];

                // Agregar los datos al archivo
                registro.println(NombreProducto + ";" + Cantidad + ";" + Categoria + ";" + Artista + ";" + Precio);

            }

            registro.close();
            System.out.println("Datos agregados exitosamente al archivo " + file_name);

        } catch (IOException ex) {
            System.out.println("Error al agregar datos al archivo");
            ex.printStackTrace();
        }
    }

    //Leer datos de forma ordenada (Segun Artista)
    public static void LeerNormal(Scanner sc, String file_name, JTable tabla) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file_name + ".txt"));
            String line;
            List<String[]> Datos = new ArrayList<>(); //Implemento una lista 

            while ((line = br.readLine()) != null) {
                String[] temp = line.split(";");
                Datos.add(temp);//Agrego los registros a la lista
            }

            br.close();

            // Ordena los datos solo por artista
            /**
             * METODO A IMPLEMENTAR Collections.sort es un método en Java que se
             * utiliza para ordenar colecciones,como listas, conjuntos, colas,
             * etc. Permite ordenar los elementos de una colección en un orden
             * específico según un criterio de comparación. *
             */
            Collections.sort(Datos, new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    return o1[3].compareTo(o2[3]); // Compara por artista
                }
            });

            // Limpia la tabla
            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
            model.setRowCount(0);

            // Agrega los datos ordenados a la tabla
            for (String[] rowData : Datos) {
                model.addRow(rowData);
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }

    }

    //Subrutina para los usuarios administradores
    public static void Usuarios(String file_name) {
        try {
            FileWriter outFile = new FileWriter(file_name + ".txt", false);
            PrintWriter registro = new PrintWriter(outFile);

            //Matriz para crear Archivo Existente 
            String[][] usuariosADMIN = {
                //Seccion CONAN
                {"Nacale", "12345"},
                {"Pauly", "888"},
                {"isa", "111"}};

            //Agregar datos de la matriz al registro
            for (String[] fila : usuariosADMIN) {
                String NombreProducto = fila[0];
                String Contraseña = fila[1];

                // Agregar los datos al archivo
                registro.println(NombreProducto + ";" + Contraseña);
            }

            registro.close();
            System.out.println("Datos agregados exitosamente al archivo " + file_name);

        } catch (IOException ex) {
            System.out.println("Error al agregar datos al archivo " + file_name);
            ex.printStackTrace();
        }
    }
    boolean seagrego = false;

    //Subrutina para agregar un nuevo producto al inventario
    public void AgregarProducto(String file_name) {

        String Categoria, Artista, Descripcion, Precio, Cantidad, Sub;

        try {
            FileWriter outFile = new FileWriter(file_name + ".txt", true);  //Archivo.txt
            // if false the file will be deleted and created everytime
            // if true the registers will be appended to the end of the file
            PrintWriter registrar_producto = new PrintWriter(outFile);
            Categoria = (jcCategoria.getSelectedItem() != null) ? jcCategoria.getSelectedItem().toString() : "";
            Artista = (jcArtista.getSelectedItem() != null) ? jcArtista.getSelectedItem().toString() : "";
            Sub = (jcSubcategoria.getSelectedItem() != null) ? jcSubcategoria.getSelectedItem().toString() : "";
            Descripcion = fieldDescripcion.getText();
            Cantidad = fieldCant.getText();
            Precio = fieldPrecio.getText();
            //Validaciones
            if (Validaciones(Categoria, Artista, Sub, Descripcion, Cantidad, Precio)) {
                registrar_producto.println((Categoria + " " + Sub + " " + Descripcion) + ";" + Cantidad + ";" + Categoria + ";" + Artista + ";" + Precio);
                System.out.println("YA SE AGREGO (ESTO DESPUES SE BORRA)");
                JOptionPane.showMessageDialog(null, "Los datos se han agregado satisfactoriamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                seagrego = true;
            }
            registrar_producto.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al agregar los datos.", "Error", JOptionPane.ERROR_MESSAGE);

            System.out.println("Error creando el archivo");
            ex.printStackTrace();
        }

    }

    // Subrutina para actualizar cantidad en el inventario
    public static void ActualizarInventario(Scanner sc, String file_name, JTable tabla, String ProductoAct, String ArtistaAct, String cantidadAct) {
        boolean hay = false;
        while (!hay) {
            try {
                File archivoOriginal = new File(file_name + ".txt");
                File archivoTemporal = new File(file_name + "_temp.txt");

                BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
                PrintWriter pw = new PrintWriter(new FileWriter(archivoTemporal));

                String line;

                while ((line = br.readLine()) != null) {
                    String[] campos = line.split(";");
                    String nombreProducto = campos[0]; // Nombre del producto
                    int cantidadActual = Integer.parseInt(campos[1]); // Cantidad actual
                    String Categoria = campos[2]; // Nombre de la categoria
                    String nombreArtista = campos[3]; // Nombre del artista
                    String Precio = campos[4]; // Precio Producto

                    // Si el nombre ingresado y artista ingresado coincide con el archivo agregar la cantidad ingresada
                    if (nombreProducto.equals(ProductoAct) && nombreArtista.equals(ArtistaAct)) {
                        System.out.println("si soy iguaaal");
                        int cantidadNueva = Integer.parseInt(cantidadAct); // Cantidad actual
                        cantidadActual += cantidadNueva; // Aumentar la cantidad en 10
                    }

                    // Construir la nueva línea con los campos actualizados
                    String nuevaLinea = nombreProducto + ";" + cantidadActual + ";" + Categoria + ";" + nombreArtista + ";" + Precio;
                    // Escribir la nueva línea en el archivo temporal
                    pw.println(nuevaLinea);

                }
                br.close();
                pw.close();

                // Reemplazar el archivo original con el archivo temporal
                if (archivoOriginal.delete() && archivoTemporal.renameTo(archivoOriginal)) {
                    System.out.println("Inventario actualizado con éxito.");
                    JOptionPane.showMessageDialog(null, "Los datos se han agregado satisfactoriamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    hay = true;
                    LeerNormal(sc, file_name, tabla);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar el inventario.", "Error", JOptionPane.ERROR_MESSAGE);
                    hay = false;
                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "No se encontró el archivo " + file_name + ".txt", "Error", JOptionPane.ERROR_MESSAGE);
                hay = false;
                System.out.println("Introduce el nombre del archivo: ");
                file_name = sc.nextLine(); // Archivo
            }
        }
    }
    // Subrutina para eliminar del inventario

    public static void EliminarProducto(Scanner sc, String file_name, JTable tabla, String ProductoAct) {
        boolean hay = false;
        while (!hay) {
            try {
                File archivoOriginal = new File(file_name + ".txt");
                File archivoTemporal = new File(file_name + "_temp.txt");

                BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
                PrintWriter pw = new PrintWriter(new FileWriter(archivoTemporal));

                String line;

                while ((line = br.readLine()) != null) {
                    String[] campos = line.split(";");
                    String nombreProducto = campos[0]; // Nombre del producto
                    int cantidadActual = Integer.parseInt(campos[1]); // Cantidad actual
                    String Categoria = campos[2]; // Nombre de la categoria
                    String nombreArtista = campos[3]; // Nombre del artista
                    String Precio = campos[4]; // Precio Producto

                    // Si coincide con el nombre Eliminar
                    if (!nombreProducto.equals(ProductoAct)) {
                        // Construir la nueva línea sin ese producto
                        String nuevaLinea = nombreProducto + ";" + cantidadActual + ";" + Categoria + ";" + nombreArtista + ";" + Precio;
                        // Escribir la nueva línea en el archivo temporal
                        pw.println(nuevaLinea);
                    }
                }
                br.close();
                pw.close();

                // Reemplazar el archivo original con el archivo temporal
                if (archivoOriginal.delete() && archivoTemporal.renameTo(archivoOriginal)) {
                    System.out.println("Inventario actualizado con éxito.");
                    JOptionPane.showMessageDialog(null, "El producto se ha eliminado satisfactoriamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    hay = true;
                    LeerNormal(sc, file_name, tabla);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar el inventario.", "Error", JOptionPane.ERROR_MESSAGE);
                    hay = false;
                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "No se encontró el archivo " + file_name + ".txt", "Error", JOptionPane.ERROR_MESSAGE);
                hay = false;
                System.out.println("Introduce el nombre del archivo: ");
                file_name = sc.nextLine(); // Archivo
            }
        }
    }

    //FUNCIONES
    //Funcion para validar los campos de agregar producto
    public boolean Validaciones(String c1, String c2, String c3, String c4, String c5, String c6) {

        //Validacion seleccion de categoria
        if (c1.equalsIgnoreCase("Seleccionar categoria") || c1 == null) {
            error1.setVisible(true);
            return false;
        } else {
            error1.setVisible(false);
        }
        //Validacion seleccion de artista
        if (c2.equalsIgnoreCase("Seleccionar artista") || c2 == null) {
            error2.setVisible(true); //Si no selecciono artista 
            return false;
        } else {
            error2.setVisible(false);
        }
        //Validacion seleccion de subcategoria
        if (c3.equalsIgnoreCase("Seleccionar talla") || c3.equalsIgnoreCase("Seleccionar tipo de gorra") || c3.equalsIgnoreCase("Seleccionar álbum") || c3 == null) {
            error3.setText("(!) Realice una seleccion");
            error3.setVisible(true); //Si no selecciono descripcion
            return false;
        } else {
            error3.setVisible(false);
        }
        //Validacion descripcion de producto
        if (c4.isEmpty()) { //que no este vacio el texto ingresado
            error4.setText("(!) Campo vacío");
            error4.setVisible(true);
            return false;
        } else { // Validacion Formato: que sea letras
            error4.setVisible(false);
            boolean validod = true;
            for (char c : c4.toCharArray()) {
                if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
                    validod = false;
                    break;
                }
            }
            if (!validod) {
                error4.setVisible(true);
                return false;
            } else {
                error4.setVisible(false);
            }
        }
        //Validacion cantidad 
        if (c5.isEmpty()) {
            error5.setText("(!) Campo vacío");
            error5.setVisible(true);
            return false;
        } else {
            try {
                int cantidad = Integer.parseInt(c5);
                if (cantidad <= 0) {
                    error5.setText("(!) La cantidad debe ser mayor a 0");
                    error5.setVisible(true);
                    return false;
                } else {
                    error5.setVisible(false);
                }
            } catch (NumberFormatException e) {
                error5.setText("(!) El valor debe ser un número entero");
                error5.setVisible(true);
                return false;
            }
        }
        //Validacion precio
        if (c6.isEmpty()) {//que no este vacio
            error6.setText("(!) Campo vacío");
            error6.setVisible(true);
            return false;
        } else {// Validación que sea numerico y mayor a cero
            boolean validoprecio = true;
            for (char c : c6.toCharArray()) {
                if (!Character.isDigit(c)) {
                    validoprecio = false;
                    break;
                }
            }
            try {
                double precio = Double.parseDouble(c6);
                if (precio < 0) {
                    error6.setVisible(false);
                }
            } catch (NumberFormatException e) {
                error6.setText("(!) El monto debe ser mayor a 0");
                error6.setVisible(true); // Mostrar mensaje de error
                return false;
            }

            if (!validoprecio) {
                error6.setText("(!) El valor debe ser numerico");
                error6.setVisible(true); // Mostrar mensaje de error
                return false;
            } else {
                error6.setVisible(false); // Ocultar mensaje de error  

            }
        }
        return true;// se devuelve true si cumple con todas las validaciones correspondientes
    }

    //Funcion para validar los campos de agregar producto Existente
    public boolean Validaciones2(String c1, String c2, String c3, String c4) {

        //Validacion seleccion de categoria
        if (c1.equalsIgnoreCase("Seleccionar categoria") || c1 == null) {
            error1PE.setVisible(true);
            return false;
        } else {
            error1PE.setVisible(false);
        }
        //Validacion seleccion de artista
        if (c2.equalsIgnoreCase("Seleccionar artista") || c2 == null) {
            error2PE.setVisible(true); //Si no selecciono artista 
            return false;
        } else {
            error2PE.setVisible(false);
        }
        //Validacion seleccion de subcategoria
        if (c3.equalsIgnoreCase("Seleccionar talla") || c3.equalsIgnoreCase("Seleccionar tipo de gorra") || c3.equalsIgnoreCase("Seleccionar álbum") || c3 == null) {
            error3PE.setText("(!) Realice una seleccion");
            error3PE.setVisible(true); //Si no selecciono descripcion
            return false;
        } else {
            error3PE.setVisible(false);
        }
        //Validacion Campos
        if (c4.isEmpty()) {
            error4PE.setText("(!) Campo vacío");
            error4PE.setVisible(true);
            return false;
        } else {
            try {
                int cantidad = Integer.parseInt(c4);
                if (cantidad <= 0) {
                    error4PE.setText("(!) La cantidad debe ser mayor a 0");
                    error4PE.setVisible(true);
                    return false;
                } else {
                    error4PE.setVisible(false);
                }
            } catch (NumberFormatException e) {
                error4PE.setText("(!) El valor debe ser un número entero");
                error4PE.setVisible(true);
                return false;
            }
        }
        return true;// se devuelve true si cumple con todas las validaciones correspondientes
    }

    //Funcion para validar los campos de Eliminar Producto
    public boolean Validaciones3(String c1, String c2, String c3) {

        //Validacion seleccion de categoria
        if (c1.equalsIgnoreCase("Seleccionar categoria") || c1 == null) {
            error1Eli.setVisible(true);
            return false;
        } else {
            error1Eli.setVisible(false);
        }
        //Validacion seleccion de artista
        if (c2.equalsIgnoreCase("Seleccionar artista") || c2 == null) {
            error2Eli.setVisible(true); //Si no selecciono artista 
            return false;
        } else {
            error2Eli.setVisible(false);
        }
        //Validacion seleccion de subcategoria
        if (c3.equalsIgnoreCase("Seleccionar talla") || c3.equalsIgnoreCase("Seleccionar tipo de gorra") || c3.equalsIgnoreCase("Seleccionar álbum") || c3 == null) {
            error3Eli.setText("(!) Realice una seleccion");
            error3Eli.setVisible(true); //Si no selecciono descripcion
            return false;
        } else {
            error3Eli.setVisible(false);
        }

        return true;// se devuelve true si cumple con todas las validaciones correspondientes
    }

    public static final Map<String, List<String>> ALBUMES_ARTISTAS = new HashMap<>();

    static {

        ALBUMES_ARTISTAS.put("Conan Gray", new ArrayList<>(List.of("Sunset Season", "Kid Krow", "Superache")));
        ALBUMES_ARTISTAS.put("Harry Styles", new ArrayList<>(List.of("Harry Styles", "Fine Line", "Harry's House")));
        ALBUMES_ARTISTAS.put("Sabrina Carpenter", new ArrayList<>(List.of("Eyes Wide Open", "Evolution", "Emails I Can't Send")));
        ALBUMES_ARTISTAS.put("Taylor Swift", new ArrayList<>(List.of("Fearless (Taylor's version)", "Speak Now (Taylor's version)", "Red (Taylor's version)", "Lover", "Folklore", "Evermore", "Midnights")));
        ALBUMES_ARTISTAS.put("Billie Eilish", new ArrayList<>(List.of("When We All Fall Asleep, Where Do We Go?", "Happier Than Ever", "Don't Smile at Me", "Live at Third Man Records")));
        ALBUMES_ARTISTAS.put("Louis Tomlinson", new ArrayList<>(List.of("Walls", "Faith in the Future")));
        ALBUMES_ARTISTAS.put("5SOS", new ArrayList<>(List.of("5 Seconds of Summer", "Sounds Good Feels Good", "Youngblood", "CALM", "5SOS5")));
        ALBUMES_ARTISTAS.put("Stray Kids", new ArrayList<>(List.of("Go Live", "No Easy", "5Stars", "ODDINARY", "Maxident")));
        ALBUMES_ARTISTAS.put("Big Time Rush", new ArrayList<>(List.of("BTR", "Elevate", "24/Seven", "Another life")));
        ALBUMES_ARTISTAS.put("TXT", new ArrayList<>(List.of("The Dream Chapter: STAR", "Still Dreaming", "The Chaos Chapter: FREEZE", "Sweet")));
        ALBUMES_ARTISTAS.put("Imagine Dragons", new ArrayList<>(List.of("Night Visions", "Smoke + Mirrors", "Evolve", "Origins", "Mercury")));
    }

    //Subrutina para cargar datos de las subcategorias
    public void CargarDatosJcombo() {
        String categoria = jcCategoria.getSelectedItem().toString();
        String artista = jcArtista.getSelectedItem().toString();
        List<String> albumes = ALBUMES_ARTISTAS.get(artista);

        if (categoria.equalsIgnoreCase("Seleccionar categoria")) {
            jcSubcategoria.setEnabled(false);
            fieldPrecio.setEnabled(false);
            fieldDescripcion.setEnabled(false);
            fieldCant.setEnabled(false);
            labelD.setVisible(false);
            System.out.println("Entre aqui en false");

        } else if ((artista.equalsIgnoreCase("Seleccionar artista"))) {
            jcSubcategoria.setEnabled(false);
            fieldPrecio.setEnabled(false);
            fieldDescripcion.setEnabled(false);
            fieldCant.setEnabled(false);
            labelD.setVisible(false);
            System.out.println("Entre aqui en false");

        }
        if (albumes == null || artista.equalsIgnoreCase("Seleccionar artista")) {
            // El artista no existe en el mapa.
            // Maneja este caso aquí.
            return;
        } else {
            jcSubcategoria.setEnabled(true);
            labelD.setVisible(true);

            switch (categoria) {
                case "Camiseta":
                    labelD.setText("Talla");
                    DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
                    comboBoxModel.addElement("Seleccionar talla");
                    comboBoxModel.addElement("XS");
                    comboBoxModel.addElement("S");
                    comboBoxModel.addElement("M");
                    comboBoxModel.addElement("L");
                    comboBoxModel.addElement("XL");
                    jcSubcategoria.setModel(comboBoxModel);

                    break;
                case "CD":
                    labelD.setText("Álbum");
                    DefaultComboBoxModel<String> comboBoxModel2 = new DefaultComboBoxModel<>();
                    comboBoxModel2.addElement("Seleccionar álbum");
                    ALBUMES_ARTISTAS.get(artista).forEach(comboBoxModel2::addElement);
                    jcSubcategoria.setModel(comboBoxModel2);

                    break;
                case "Vinilo":
                    labelD.setText("Álbum");
                    DefaultComboBoxModel<String> comboBoxModel3 = new DefaultComboBoxModel<>();
                    comboBoxModel3.addElement("Seleccionar álbum");
                    ALBUMES_ARTISTAS.get(artista).forEach(comboBoxModel3::addElement);
                    jcSubcategoria.setModel(comboBoxModel3);

                    break;
                case "Gorra":
                    labelD.setText("Tipo");
                    DefaultComboBoxModel<String> comboBoxModel4 = new DefaultComboBoxModel<>();
                    comboBoxModel4.addElement("Seleccionar tipo de gorra");
                    comboBoxModel4.addElement("Béisbol");
                    comboBoxModel4.addElement("Plana/Snapback");
                    comboBoxModel4.addElement("Trucker");
                    jcSubcategoria.setModel(comboBoxModel4);

                    break;

                case "Llavero":
                    labelD.setText("Tipo");
                    DefaultComboBoxModel<String> comboBoxModel5 = new DefaultComboBoxModel<>();
                    comboBoxModel5.addElement("Seleccionar tipo");
                    comboBoxModel5.addElement("1");
                    comboBoxModel5.addElement("2");
                    comboBoxModel5.addElement("3");
                    jcSubcategoria.setModel(comboBoxModel5);

                    break;

            }
        }

    }

    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

    // Método para cargar elementos iniciales desde el archivo
    public void CargarDatosJcombo2() {
        String categoria = jcCategoriaPE.getSelectedItem().toString();
        String artista = jcArtistaPE.getSelectedItem().toString();
        List<String> albumesPE = ALBUMES_ARTISTAS.get(artista);

        if (categoria.equalsIgnoreCase("Seleccionar categoria")) {
            jcSubcategoriaPE.setEnabled(false);

            fieldCantPE.setEnabled(false);
            labelDPE.setVisible(false);
            System.out.println("Entre aqui en false");

        } else if ((artista.equalsIgnoreCase("Seleccionar artista"))) {
            jcSubcategoriaPE.setEnabled(false);

            fieldCantPE.setEnabled(false);
            labelDPE.setVisible(false);
            System.out.println("Entre aqui en false");

        }
        if (albumesPE == null || artista.equalsIgnoreCase("Seleccionar artista")) {
            // El artista no existe en el mapa.
            // Maneja este caso aquí.
            return;
        } else {
            jcSubcategoriaPE.setEnabled(true);
            fieldCantPE.setEnabled(true);
            labelDPE.setVisible(true);

            model.removeAllElements(); // Limpia el modelo antes de cargar los elementos desde el archivo
            boolean hayElementos = false; // Bandera para verificar si se encontraron elementos
            try (BufferedReader BR = new BufferedReader(new FileReader("inventario.txt"))) {
                String line;
                while ((line = BR.readLine()) != null) {
                    String[] campos = line.split(";");
                    if (campos.length > 3) { // Asegúrate de que haya suficientes campos
                        String nombreProducto = campos[0];
                        String CategoriaArch = campos[2];
                        String ArtistaArch = campos[3];
                        if (CategoriaArch.equalsIgnoreCase(categoria) && ArtistaArch.equalsIgnoreCase(artista)) {
                            if (!existeEnComboBox(nombreProducto)) {
                                model.addElement(nombreProducto);
                                hayElementos = true; // Se encontraron elementos
                            }
                        }

                    }
                }
                if (!hayElementos) {
                    jcSubcategoriaPE.setEnabled(false); // Deshabilita el JComboBox
                    BTNAgregarPE.setEnabled(false);
                } else {
                    jcSubcategoriaPE.setEnabled(true); // Habilita el JComboBox si hay elementos
                    BTNAgregarPE.setEnabled(true);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            jcSubcategoriaPE.setModel(model); // Asigna el modelo al JComboBox

        }

    }

    DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>();

    // Método para cargar elementos iniciales desde el archivo
    public void CargarDatosJcombo3() {
        String categoria = jcCategoriaEli.getSelectedItem().toString();
        String artista = jcArtistaEli.getSelectedItem().toString();
        List<String> albumesPE = ALBUMES_ARTISTAS.get(artista);

        if (categoria.equalsIgnoreCase("Seleccionar categoria")) {
            jcSubcategoriaEli.setEnabled(false);
            System.out.println("Entre aqui en false");

        } else if ((artista.equalsIgnoreCase("Seleccionar artista"))) {
            jcSubcategoriaEli.setEnabled(false);
            System.out.println("Entre aqui en false");

        }
        if (albumesPE == null || artista.equalsIgnoreCase("Seleccionar artista")) {
            // El artista no existe en el mapa.
            // Maneja este caso aquí.
            return;
        } else {
            jcSubcategoriaEli.setEnabled(true);
            model2.removeAllElements(); // Limpia el modelo antes de cargar los elementos desde el archivo
            boolean hayElementos = false; // Bandera para verificar si se encontraron elementos
            try (BufferedReader BR = new BufferedReader(new FileReader("inventario.txt"))) {
                String line;
                while ((line = BR.readLine()) != null) {
                    String[] campos = line.split(";");
                    if (campos.length > 3) { // Asegúrate de que haya suficientes campos
                        String nombreProducto = campos[0];
                        String CategoriaArch = campos[2];
                        String ArtistaArch = campos[3];
                        if (CategoriaArch.equalsIgnoreCase(categoria) && ArtistaArch.equalsIgnoreCase(artista)) {
                            if (!existeEnComboBox2(nombreProducto)) {
                                model2.addElement(nombreProducto);
                                hayElementos = true; // Se encontraron elementos
                            }
                        }

                    }
                }
                if (!hayElementos) {
                    jcSubcategoriaEli.setEnabled(false); // Deshabilita el JComboBox
                    BotonEliminar.setEnabled(false);
                } else {
                    jcSubcategoriaEli.setEnabled(true); // Habilita el JComboBox si hay elementos
                    BotonEliminar.setEnabled(true);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            jcSubcategoriaEli.setModel(model2); // Asigna el modelo al JComboBox

        }

    }

    // Método para verificar si un elemento ya existe en el JComboBox
    private boolean existeEnComboBox(String elemento) {
        for (int i = 0; i < model.getSize(); i++) {
            if (elemento.equalsIgnoreCase(model.getElementAt(i))) {
                return true;
            }
        }
        return false;
    }

    // Método para verificar si un elemento ya existe en el JComboBox
    private boolean existeEnComboBox2(String elemento) {
        for (int i = 0; i < model2.getSize(); i++) {
            if (elemento.equalsIgnoreCase(model2.getElementAt(i))) {
                return true;
            }
        }
        return false;
    }


    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void BTNAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregar1ActionPerformed
        PanelAgregar.setVisible(true);
        labelD.setVisible(false);
        error1.setVisible(false);
        error2.setVisible(false);
        error3.setVisible(false);
        error4.setVisible(false);
        error5.setVisible(false);
        error6.setVisible(false);
        jScrollPane1.setVisible(false);
        TablaINVENTARIO.setVisible(false);
        BTNAgregar1.setVisible(false);
        btnactualizar.setVisible(false);
        botonPE.setVisible(false);
        botonEP.setVisible(false);
        CargarDatosJcombo();
    }//GEN-LAST:event_BTNAgregar1ActionPerformed

    private void BTNcerrarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcerrarAgregarActionPerformed
        PanelAgregar.setVisible(false);
        jScrollPane1.setVisible(true);
        TablaINVENTARIO.setVisible(true);
        BTNAgregar1.setVisible(true);
        botonPE.setVisible(true);
        botonEP.setVisible(true);
        btnactualizar.setVisible(true);
    }//GEN-LAST:event_BTNcerrarAgregarActionPerformed

    private void BTNAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregar2ActionPerformed
        AgregarProducto("Inventario");
        if (seagrego) {
            Scanner sc = new Scanner(System.in);
            LeerNormal(sc, "Inventario", TablaINVENTARIO);
            sc.close();
            String seleccionarc = "Seleccionar Categoria";
            String seleccionara = "Seleccionar Artista";
            jcCategoria.setSelectedItem(seleccionarc);
            jcArtista.setSelectedItem(seleccionara);
            jcCategoria.setSelectedIndex(0);//Doble verificacion
            jcArtista.setSelectedIndex(0);
            jcSubcategoria.setSelectedItem(null);
            fieldDescripcion.setText("");
            fieldDescripcion.setEnabled(false);
            fieldCant.setText("");
            fieldCant.setEnabled(false);
            fieldPrecio.setText("");
            fieldPrecio.setEnabled(false);
        }


    }//GEN-LAST:event_BTNAgregar2ActionPerformed

    private void BTNLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLimpiar1ActionPerformed
        String seleccionarc = "Seleccionar Categoria";
        String seleccionara = "Seleccionar Artista";
        jcCategoria.setSelectedItem(seleccionarc);
        jcArtista.setSelectedItem(seleccionara);
        jcCategoria.setSelectedIndex(0);//Doble verificacion
        jcArtista.setSelectedIndex(0);
        jcSubcategoria.setSelectedItem(null);
        fieldDescripcion.setText("");
        fieldDescripcion.setEnabled(false);
        fieldCant.setText("");
        fieldCant.setEnabled(false);
        fieldPrecio.setText("");
        fieldPrecio.setEnabled(false);
    }//GEN-LAST:event_BTNLimpiar1ActionPerformed

    private void jcSubcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSubcategoriaActionPerformed
        if (jcSubcategoria.getSelectedItem() != null) {
            fieldDescripcion.setEnabled(true);
            fieldPrecio.setEnabled(true);
            fieldCant.setEnabled(true);
        }
    }//GEN-LAST:event_jcSubcategoriaActionPerformed

    private void jcArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcArtistaActionPerformed
        CargarDatosJcombo();
    }//GEN-LAST:event_jcArtistaActionPerformed

    private void jcCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCategoriaActionPerformed
        CargarDatosJcombo();
    }//GEN-LAST:event_jcCategoriaActionPerformed


    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        perfilesFR menu = new perfilesFR(user, cedula);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnGraficsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGraficsActionPerformed


// Hacer visible el panel de gráficos
graficafondo.setVisible(true);
    graficaspanel.setVisible(true);
  

    DefaultCategoryDataset datosGraficoBarras = new DefaultCategoryDataset();

    // Leer el archivo de texto
    try {
        FileReader lectorArchivo = new FileReader("Inventario.txt");
        BufferedReader lectorBuffer = new BufferedReader(lectorArchivo);

        String linea;

        while ((linea = lectorBuffer.readLine()) != null) {
            String[] datos = linea.split(";");
            String nombreProducto = datos[0].trim();
            int cantidad = Integer.parseInt(datos[1].trim());
            String categoria = datos[2].trim();

            // Agregar los datos al conjunto de datos del gráfico
            datosGraficoBarras.addValue(cantidad, categoria, nombreProducto);
        }

        lectorBuffer.close();

    } catch (IOException e) {
        e.printStackTrace();
    }

    JFreeChart graficoBarras = ChartFactory.createBarChart3D(
        "Disponibilidad por Producto y Categoría", // Título del gráfico
        "Producto", // Etiqueta del eje X
        "Cantidad", // Etiqueta del eje Y
        datosGraficoBarras, // Conjunto de datos
        PlotOrientation.VERTICAL,
        true, // Incluir leyenda
        true, // Incluir consejos (tooltips)
        false // Incluir URLs
    );

    CategoryPlot tramaGraficoBarras = graficoBarras.getCategoryPlot();
    NumberAxis ejeY = (NumberAxis) tramaGraficoBarras.getRangeAxis();
    NumberFormat formato = new DecimalFormat("#,###");
    ejeY.setNumberFormatOverride(formato);

    ChartPanel panelGrafico = new ChartPanel(graficoBarras);
    panelGrafico.setMouseWheelEnabled(true);
    panelGrafico.setPreferredSize(new Dimension(400, 400));

    graficaspanel.setLayout(new BorderLayout());
    graficaspanel.add(panelGrafico, BorderLayout.CENTER);
    validate();
    repaint();
    }//GEN-LAST:event_BtnGraficsActionPerformed

    private void ojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ojoActionPerformed
        char echoChar = PassField.getEchoChar(); // Obtener el carácter de eco actual
        if (echoChar != 0) {
            PassField.setEchoChar((char) 0); // Establecer el carácter de eco a 0 (sin ocultar)
            ojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/ojocerrado.png")));;
        } else {
            PassField.setEchoChar('\u2022'); // Establecer el carácter de eco a • (ocultar)
            ojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/ojoabierto.png")));;
        }
    }//GEN-LAST:event_ojoActionPerformed

    private void PassFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassFieldMouseClicked

        PassField.setText(null);
    }//GEN-LAST:event_PassFieldMouseClicked

    private void BtnVerifyUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerifyUserActionPerformed

        Scanner sc = new Scanner(System.in);
        String U = userLABEL.getText();
        String P = PassField.getText();
        boolean Correct = Verify(sc, "CedulasAdmins", U, P);
        if (Correct == true) {
            Pantalla.setVisible(true);
            Contraseña.setVisible(false);
            exitBTN.setVisible(true);
        } else {
            AvisoLabel.setText("Contraseña o Usuario incorrecto");
        }

    }//GEN-LAST:event_BtnVerifyUserActionPerformed

    private void fieldDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDescripcionActionPerformed

    private void fieldCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCantActionPerformed

    private void BtnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalir1ActionPerformed
        perfilesFR menu = new perfilesFR(user, cedula);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnSalir1ActionPerformed

    private void botonPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPEActionPerformed
        labelDPE.setVisible(false);
        error1PE.setVisible(false);
        error2PE.setVisible(false);
        error3PE.setVisible(false);
        error4PE.setVisible(false);
        PanelAgregarPE.setVisible(true);
        jScrollPane1.setVisible(false);
        TablaINVENTARIO.setVisible(false);
        BTNAgregar1.setVisible(false);
        btnactualizar.setVisible(false);
        botonPE.setVisible(false);
        botonEP.setVisible(false);
        CargarDatosJcombo2();
    }//GEN-LAST:event_botonPEActionPerformed

    private void jcCategoriaPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCategoriaPEActionPerformed
        CargarDatosJcombo2();

    }//GEN-LAST:event_jcCategoriaPEActionPerformed

    private void jcArtistaPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcArtistaPEActionPerformed
        CargarDatosJcombo2();
    }//GEN-LAST:event_jcArtistaPEActionPerformed

    private void jcSubcategoriaPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSubcategoriaPEActionPerformed

    }//GEN-LAST:event_jcSubcategoriaPEActionPerformed

    private void BTNcerrarAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcerrarAgregar1ActionPerformed
        PanelAgregarPE.setVisible(false);
        jScrollPane1.setVisible(true);
        TablaINVENTARIO.setVisible(true);
        BTNAgregar1.setVisible(true);
        botonPE.setVisible(true);
        botonEP.setVisible(true);
        btnactualizar.setVisible(true);
    }//GEN-LAST:event_BTNcerrarAgregar1ActionPerformed

    private void BTNAgregarPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPEActionPerformed
        String Categoria = (jcCategoriaPE.getSelectedItem() != null) ? jcCategoriaPE.getSelectedItem().toString() : "";
        String Artista = (jcArtistaPE.getSelectedItem() != null) ? jcArtistaPE.getSelectedItem().toString() : "";
        String Sub = (jcSubcategoriaPE.getSelectedItem() != null) ? jcSubcategoriaPE.getSelectedItem().toString() : "";

        String Cantidad = fieldCantPE.getText();
        if (Validaciones2(Categoria, Artista, Sub, Cantidad)) {
            System.out.println("Se cumplieron las validaciones");
            Scanner sc = new Scanner(System.in);
            System.out.println("Este es el nombre producto que estoy enviando: " + Sub);
            System.out.println("Este es el nombre artista que estoy enviando: " + Artista);
            System.out.println("Esta es la cantidad que estoy enviando: " + Cantidad);
            ActualizarInventario(sc, "Inventario", TablaINVENTARIO, Sub, Artista, Cantidad);
            sc.close();
            String seleccionarc = "Seleccionar Categoria";
            String seleccionara = "Seleccionar Artista";
            jcCategoriaPE.setSelectedItem(seleccionarc);
            jcArtistaPE.setSelectedItem(seleccionara);
            jcCategoriaPE.setSelectedIndex(0);//Doble verificacion
            jcArtistaPE.setSelectedIndex(0);
            jcSubcategoriaPE.setSelectedItem(null);
            fieldCantPE.setText("");
            fieldCantPE.setEnabled(false);
        }
    }//GEN-LAST:event_BTNAgregarPEActionPerformed

    private void BTNLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLimpiar2ActionPerformed
        String seleccionarc = "Seleccionar Categoria";
        String seleccionara = "Seleccionar Artista";
        jcCategoriaPE.setSelectedItem(seleccionarc);
        jcArtistaPE.setSelectedItem(seleccionara);
        jcCategoriaPE.setSelectedIndex(0);//Doble verificacion
        jcArtistaPE.setSelectedIndex(0);
        jcSubcategoriaPE.setSelectedItem(null);
        fieldCantPE.setText("");
        fieldCantPE.setEnabled(false);
    }//GEN-LAST:event_BTNLimpiar2ActionPerformed

    private void fieldCantPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCantPEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCantPEActionPerformed

    private void jcCategoriaEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCategoriaEliActionPerformed
        CargarDatosJcombo3();
    }//GEN-LAST:event_jcCategoriaEliActionPerformed

    private void jcArtistaEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcArtistaEliActionPerformed
        CargarDatosJcombo3();
    }//GEN-LAST:event_jcArtistaEliActionPerformed

    private void jcSubcategoriaEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSubcategoriaEliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcSubcategoriaEliActionPerformed

    private void BTNcerrarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcerrarEliminarActionPerformed
        PanelEliminar.setVisible(false);
        jScrollPane1.setVisible(true);
        TablaINVENTARIO.setVisible(true);
        BTNAgregar1.setVisible(true);
        botonPE.setVisible(true);
        botonEP.setVisible(true);
        btnactualizar.setVisible(true);
    }//GEN-LAST:event_BTNcerrarEliminarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        String Categoria = (jcCategoriaEli.getSelectedItem() != null) ? jcCategoriaEli.getSelectedItem().toString() : "";
        String Artista = (jcArtistaEli.getSelectedItem() != null) ? jcArtistaEli.getSelectedItem().toString() : "";
        String NombreProducto = (jcSubcategoriaEli.getSelectedItem() != null) ? jcSubcategoriaEli.getSelectedItem().toString() : "";

        if (Validaciones3(Categoria, Artista, NombreProducto)) {
            System.out.println("Se cumplieron las validaciones");
            Scanner sc = new Scanner(System.in);
            System.out.println("Este es el nombre producto que estoy enviando: " + NombreProducto);
            System.out.println("Este es el nombre artista que estoy enviando: " + Artista);
            EliminarProducto(sc, "Inventario", TablaINVENTARIO, NombreProducto);
            sc.close();
            String seleccionarc = "Seleccionar Categoria";
            String seleccionara = "Seleccionar Artista";
            jcCategoriaEli.setSelectedItem(seleccionarc);
            jcArtistaEli.setSelectedItem(seleccionara);
            jcCategoriaEli.setSelectedIndex(0);//Doble verificacion
            jcArtistaEli.setSelectedIndex(0);
            jcSubcategoriaEli.setSelectedItem(null);
        }

    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BTNLimpiarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLimpiarEliminarActionPerformed
        String seleccionarc = "Seleccionar Categoria";
        String seleccionara = "Seleccionar Artista";
        jcCategoriaEli.setSelectedItem(seleccionarc);
        jcArtistaEli.setSelectedItem(seleccionara);
        jcCategoriaEli.setSelectedIndex(0);//Doble verificacion
        jcArtistaEli.setSelectedIndex(0);
        jcSubcategoriaEli.setSelectedItem(null);
    }//GEN-LAST:event_BTNLimpiarEliminarActionPerformed

    private void botonEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEPActionPerformed

        error1Eli.setVisible(false);
        error2Eli.setVisible(false);
        error3Eli.setVisible(false);
        PanelEliminar.setVisible(true);
        jScrollPane1.setVisible(false);
        TablaINVENTARIO.setVisible(false);
        BTNAgregar1.setVisible(false);
        btnactualizar.setVisible(false);
        botonPE.setVisible(false);
        botonEP.setVisible(false);
        CargarDatosJcombo3();
    }//GEN-LAST:event_botonEPActionPerformed

    private void BtnEXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEXITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnEXITActionPerformed

    private void PassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Pantalla.setVisible(true);
        Contraseña.setVisible(false);
        exitBTN.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Registrar registro = new Registrar(user, cedula);
        registro.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnEXIT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEXIT1ActionPerformed

        this.dispose();
    }//GEN-LAST:event_BtnEXIT1ActionPerformed

    private void BtnEXIT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEXIT3ActionPerformed
       graficaspanel.setVisible(false);
       graficafondo.setVisible(false);
    }//GEN-LAST:event_BtnEXIT3ActionPerformed
//    public void AñadirUsuarios(String file_name, String file_ced) {
//        try {
//            FileWriter outFile = new FileWriter(file_name + ".txt", true);
//            PrintWriter registro = new PrintWriter(outFile);
//            FileWriter outFile2 = new FileWriter(file_ced + ".txt", true);
//            PrintWriter registro2 = new PrintWriter(outFile2);
//            String name, pass;
//            pass = Contraseñaadmi.getText();
//            name = nombreadmi.getText();
//            registro.println(name + ";" + pass);
//
//            String c = cedulaAdmi.getText();
//            int ced = Integer.parseInt(c);
//            registro2.println(name + "| " + ced + "| " + pass);
//            registro.close();
//            registro2.close();
//            System.out.println("Datos agregados exitosamente al archivo " + file_name);
//            System.out.println("Datos agregados exitosamente al archivo " + file_ced);
//
//        } catch (IOException ex) {
//            System.out.println("Error al agregar datos al archivo " + file_name);
//            System.out.println("Error al agregar datos al archivo " + file_ced);
//            ex.printStackTrace();
//        }
//    }
//VERIFICACION DE USUARIOSSSS

    public static boolean Verify(Scanner sc, String file_name, String U, String P) {
        boolean hay = false;
        while (!hay) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file_name + ".txt"));
                String line = null;
                String passw = null;
                boolean stop = false;

//                while ((line = br.readLine()) != null & stop == false) {
//                    String temp[] = line.split(";");
//                    if (temp[0].equalsIgnoreCase(U)) {
//                        stop = true;
//                        passw = temp[1];
//                    }
//                }
//                br.close();
//                hay = true;
//                if (stop == true) {
//                    if (passw != null & passw.equalsIgnoreCase(P)) {
//                        return true;
//                    } else {
//                        return false;
//                    }
//                } else {
//                    return false;
//                }
//
//            } catch (IOException ex) {
//                System.out.println("No se encontro archivo");
//                hay = false;
//                file_name = sc.nextLine(); // Archivo
//            }
//        }
//        return false;
//    }
                while ((line = br.readLine()) != null && stop == false) {
                    String temp[] = line.split("\\| ");
                    System.out.println("U:" + U + "|||||P:" + P);
                    System.out.println(temp[0] + "|||||||" + temp[2]);
                    if (temp[0].equalsIgnoreCase(U) && temp[2].equals(P)) {
                        System.out.println(U + "|||||||" + P);
                        System.out.println(temp[0] + "|||||||" + temp[1]);
                        stop = true;
                        hay = true;
                    } else {
                        stop = false;
                        hay = false;
                    }
                }
                System.out.println("HAY" + hay);
                if (hay) {
                    return true;
                } else {
                    return false;
                }

            } catch (IOException ex) {
                System.out.println("No se encontro archivo");
                hay = false;
                file_name = sc.nextLine(); // Archivo
            }
        }
        return false;
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
            java.util.logging.Logger.getLogger(PrincipalAD.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalAD.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalAD.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalAD.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new PrincipalAD(null).setVisible(true);

            }
        });
    }

    //CLASES PARA LA LISTAS ENLAZADAS
    static class Nodo {

        String dato;
        Nodo siguiente;

        public Nodo(String dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    static class ListaEnlazada {

        Nodo head; // El primer nodo de la lista

        public ListaEnlazada() {
            head = null;
        }

        public void agregarAlInicio(String dato) {
            Nodo nuevoNodo = new Nodo(dato);
            nuevoNodo.siguiente = head;
            head = nuevoNodo;
        }

        public void agregarAlFinal(String dato) {
            Nodo nuevoNodo = new Nodo(dato);

            // Si la lista está vacía, el nuevo nodo será la cabeza
            if (head == null) {
                head = nuevoNodo;
            } else {
                Nodo nodoActual = head;
                while (nodoActual.siguiente != null) {
                    nodoActual = nodoActual.siguiente;
                }
                nodoActual.siguiente = nuevoNodo;
            }
        }

        public void mostrarLista() {
            Nodo nodoActual = head;
            while (nodoActual != null) {
                System.out.print(nodoActual.dato + " -> ");
                nodoActual = nodoActual.siguiente;
            }
            System.out.println("null");
        }

        public int buscarPosicionporDato(String dato) {
            Nodo nodoActual = head;
            int indice = 0;

            while (nodoActual != null) {
                if (nodoActual.dato.equals(dato)) {
                    return indice; // Se encontró el dato en esta posición
                }
                nodoActual = nodoActual.siguiente;
                indice++;
            }

            return -1; // El dato no se encontró en la lista
        }

        public int contarRepeticiones(String elemento) {
            int contador = 0;
            Nodo actual = head;
            while (actual != null) {
                if (actual.dato.equals(elemento)) {
                    contador++;
                }
                actual = actual.siguiente;
            }
            return contador;
        }

        public boolean modificarDatoEnPosicion(int posicion, String nuevoDato) {
            if (posicion < 0) {
                return false; // Posición inválida
            }

            Nodo nodoActual = head;
            int indice = 0;

            while (nodoActual != null) {
                if (indice == posicion) {
                    nodoActual.dato = nuevoDato; // Modifica el dato del nodo en la posición deseada
                    return true; // Nodo encontrado y modificado
                }
                nodoActual = nodoActual.siguiente;
                indice++;
            }

            return false; // La posición está más allá del final de la lista
        }

        public void insertar(String dato) {
            Nodo nuevoNodo = new Nodo(dato);

            if (head == null) {
                // Si la lista está vacía, el nuevo nodo se convierte en la cabeza
                head = nuevoNodo;
            } else {
                // Si la lista no está vacía, recorremos la lista hasta el último nodo
                // y luego enlazamos el último nodo con el nuevo nodo
                Nodo actual = head;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevoNodo;
            }
        }

        public String buscarPorPosicion(int posicion) {
            if (posicion < 0) {
                return null; // Posición inválida
            }

            Nodo nodoActual = head;
            int indice = 0;

            while (nodoActual != null) {
                if (indice == posicion) {
                    return nodoActual.dato; // Encontramos el nodo en la posición deseada
                }
                nodoActual = nodoActual.siguiente;
                indice++;
            }

            return null; // La posición está más allá del final de la lista
        }

    }
    ListaEnlazada listInventarioTempCANT = new ListaEnlazada();
    ListaEnlazada listInventarioTempNAMES = new ListaEnlazada();

    public static void CopiarArchivoAlISTA(Scanner sc, String file_name, ListaEnlazada names, ListaEnlazada cant) {

        boolean hay = false;
        while (hay == false) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file_name + ".txt"));
                String line = null;

                while ((line = br.readLine()) != null) {
                    String temp[] = line.split(";");
                    cant.agregarAlFinal(temp[1]); //Cantidad en el inventario pero esta en String
                    names.agregarAlFinal(temp[0] + ";" + temp[3]);
                }
                cant.mostrarLista();
                names.mostrarLista();
                br.close();
                hay = true;

            } catch (IOException ex) {
                System.out.println("No se encontro archivo");
                hay = false;
                file_name = sc.nextLine(); // Archivo
            }
        }
    }

    public static void CopiarlISTAaArchivo(Scanner sc, String file_name, ListaEnlazada names, ListaEnlazada cant) {

        try {
//            FileWriter outFile = new FileWriter("Temporal.txt"); // Abre el archivo de salida en modo escritura
//            PrintWriter registro = new PrintWriter(outFile);

//            FileWriter outFile = new FileWriter(file_name + ".txt", true); // Abre el archivo en modo "append"
//            PrintWriter registro = new PrintWriter(outFile);
//
            Nodo nodoActualNames = names.head;
            Nodo nodoActualCant = cant.head;

            File archivoOriginal = new File(file_name + ".txt");
            File archivoTemporal = new File(file_name + "_temp.txt");

            BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
            PrintWriter pw = new PrintWriter(new FileWriter(archivoTemporal));

            String line;

            while ((line = br.readLine()) != null) {
                String[] campos = line.split(";");
                String nombreProducto = campos[0]; // Nombre del producto
                String cantidadActual = campos[1]; // Cantidad actual
                String Categoria = campos[2]; // Nombre de la categoria
                String nombreArtista = campos[3]; // Nombre del artista
                String Precio = campos[4]; // Precio Producto

                if (nodoActualNames != null & nodoActualCant != null) {
                    String cantidadNueva = nodoActualCant.dato;
                    String temp[] = nodoActualNames.dato.split(";");
                    String producto = temp[0];
                    String artista = temp[1];
                    if (nombreProducto.equals(producto) && nombreArtista.equals(artista) && !cantidadActual.equals(cantidadNueva)) {
                        cantidadActual = cantidadNueva;
                        System.out.println("kjfwnfkj");
                    }
                    String nuevaLinea = nombreProducto + ";" + cantidadActual + ";" + Categoria + ";" + nombreArtista + ";" + Precio;

                    // System.out.println("no");
                    pw.println(nuevaLinea);
                    // Avanza a los siguientes nodos
                    nodoActualNames = nodoActualNames.siguiente;
                    nodoActualCant = nodoActualCant.siguiente;

                } else {
                    pw.println(line);
                }

            }
            br.close();
            pw.close();
// Elimina el archivo original y renombra el archivo temporal
            if (archivoOriginal.delete()) {
                if (!archivoTemporal.renameTo(archivoOriginal)) {
                    System.out.println("Error al renombrar el archivo temporal.");
                }
            } else {
                System.out.println("Error al eliminar el archivo original.");
            }
        } catch (IOException ex) {
            System.out.println("Error al agregar datos al archivo " + file_name);
            ex.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvisoLabel;
    private javax.swing.JButton BTNAgregar1;
    private javax.swing.JButton BTNAgregar2;
    private javax.swing.JButton BTNAgregarPE;
    private javax.swing.JButton BTNLimpiar1;
    private javax.swing.JButton BTNLimpiar2;
    private javax.swing.JButton BTNLimpiarEliminar;
    private javax.swing.JButton BTNcerrarAgregar;
    private javax.swing.JButton BTNcerrarAgregar1;
    private javax.swing.JButton BTNcerrarEliminar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BtnEXIT;
    private javax.swing.JButton BtnEXIT1;
    private javax.swing.JButton BtnEXIT3;
    private javax.swing.JButton BtnGrafics;
    private javax.swing.JButton BtnInfo;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnSalir1;
    private javax.swing.JButton BtnVerifyUser;
    private custom.PanelRound Contraseña;
    private javax.swing.JPanel PanelAgregar;
    private javax.swing.JPanel PanelAgregarPE;
    private javax.swing.JPanel PanelEliminar;
    private custom.PanelRound Pantalla;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JTable TablaINVENTARIO;
    private javax.swing.JButton botonEP;
    private javax.swing.JButton botonPE;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error1Eli;
    private javax.swing.JLabel error1PE;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel error2Eli;
    private javax.swing.JLabel error2PE;
    private javax.swing.JLabel error3;
    private javax.swing.JLabel error3Eli;
    private javax.swing.JLabel error3PE;
    private javax.swing.JLabel error4;
    private javax.swing.JLabel error4PE;
    private javax.swing.JLabel error5;
    private javax.swing.JLabel error6;
    private javax.swing.JButton exitBTN;
    private javax.swing.JTextField fieldCant;
    private javax.swing.JTextField fieldCantPE;
    private javax.swing.JTextField fieldDescripcion;
    private javax.swing.JTextField fieldPrecio;
    private custom.PanelRound graficafondo;
    private custom.PanelRound graficas;
    private custom.PanelRound graficaspanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcArtista;
    private javax.swing.JComboBox<String> jcArtistaEli;
    private javax.swing.JComboBox<String> jcArtistaPE;
    private javax.swing.JComboBox<String> jcCategoria;
    private javax.swing.JComboBox<String> jcCategoriaEli;
    private javax.swing.JComboBox<String> jcCategoriaPE;
    private javax.swing.JComboBox<String> jcSubcategoria;
    private javax.swing.JComboBox<String> jcSubcategoriaEli;
    private javax.swing.JComboBox<String> jcSubcategoriaPE;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelCantidad1;
    private javax.swing.JLabel labelD;
    private javax.swing.JLabel labelDEli;
    private javax.swing.JLabel labelDPE;
    private javax.swing.JButton ojo;
    private custom.PanelRound panelRound1;
    private custom.PanelRound panelRound2;
    private custom.PanelRound panelRound3;
    private javax.swing.JLabel userLABEL;
    private javax.swing.JLabel valid;
    // End of variables declaration//GEN-END:variables
}
