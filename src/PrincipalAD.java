
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PrincipalAD extends javax.swing.JFrame {

    public PrincipalAD() {
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        initComponents();
        setLocationRelativeTo(null);
        this.setVisible(false);
        //Para mostrar archivo inventario 01
        ArchivoInventario("Inventario");// se puede reiniciar
        //Usuarios("Usuarios");
        Scanner sc = new Scanner(System.in);
        LeerNormal(sc, "Inventario", TablaINVENTARIO);
        sc.close();
        //No visible
        Constraseña.setVisible(true);
        Pantalla.setVisible(false);
        PanelAgregar.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Constraseña = new custom.PanelRound();
        userfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnVerifyUser = new javax.swing.JButton();
        PassField = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        AvisoLabel = new javax.swing.JLabel();
        Pantalla = new custom.PanelRound();
        panelRound2 = new custom.PanelRound();
        IconADMI = new javax.swing.JLabel();
        BtnGrafics = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnInfo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaINVENTARIO = new javax.swing.JTable();
        BTNAgregar1 = new javax.swing.JButton();
        PanelAgregar = new javax.swing.JPanel();
        jcCategoria = new javax.swing.JComboBox<>();
        jcArtista = new javax.swing.JComboBox<>();
        jcSubcategoria = new javax.swing.JComboBox<>();
        fieldNombre = new javax.swing.JTextField();
        fieldPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelD = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BTNcerrarAgregar = new javax.swing.JButton();
        BTNAgregar2 = new javax.swing.JButton();
        BTNLimpiar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/cerrrar35.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1163, 0, -1, 53));

        Constraseña.setBackground(new java.awt.Color(153, 153, 255));

        userfield.setText("User...");
        userfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userfieldMouseClicked(evt);
            }
        });
        userfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userfieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Usuario");

        jLabel6.setText("Contraseña");

        BtnVerifyUser.setText("SIGN IN");
        BtnVerifyUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerifyUserActionPerformed(evt);
            }
        });

        PassField.setText("jPasswordField1");
        PassField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassFieldMouseClicked(evt);
            }
        });

        jButton2.setText("Mostrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Registrarse");

        javax.swing.GroupLayout ConstraseñaLayout = new javax.swing.GroupLayout(Constraseña);
        Constraseña.setLayout(ConstraseñaLayout);
        ConstraseñaLayout.setHorizontalGroup(
            ConstraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConstraseñaLayout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(BtnVerifyUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ConstraseñaLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addGroup(ConstraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(userfield)
                    .addComponent(PassField, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                .addGroup(ConstraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConstraseñaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConstraseñaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(260, 260, 260))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConstraseñaLayout.createSequentialGroup()
                .addContainerGap(436, Short.MAX_VALUE)
                .addComponent(AvisoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
        );
        ConstraseñaLayout.setVerticalGroup(
            ConstraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConstraseñaLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel3)
                .addGroup(ConstraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConstraseñaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ConstraseñaLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton3)))
                .addGap(46, 46, 46)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConstraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(50, 50, 50)
                .addComponent(BtnVerifyUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AvisoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        getContentPane().add(Constraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        Pantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(153, 153, 255));

        IconADMI.setText("jLabel3");

        BtnGrafics.setText("Grafic");
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

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IconADMI)
                    .addComponent(BtnGrafics, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(IconADMI, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnGrafics, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, Short.MAX_VALUE)
                .addComponent(BtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        Pantalla.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 65, 700));

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

        Pantalla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 146, 877, 412));

        BTNAgregar1.setText("Agregar Producto");
        BTNAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregar1ActionPerformed(evt);
            }
        });
        Pantalla.add(BTNAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 65, -1, -1));

        jcCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar categoria", "Camiseta", "Gorra", "CD", "Vinilo", "Llavero" }));
        jcCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCategoriaActionPerformed(evt);
            }
        });

        jcArtista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar artista", "Conan Gray", "Harry Styles", "Sabrina Carpenter", "Taylor Swift", "Billie Eilish", "Louis Tomlinson", "5SOS", "Stray Kids", "Big Time Rush", "TXT", "Imagine Dragons" }));
        jcArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcArtistaActionPerformed(evt);
            }
        });

        jcSubcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSubcategoriaActionPerformed(evt);
            }
        });

        jLabel1.setText("Categoría");

        jLabel2.setText("Artista");

        labelD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelD.setText("Talla/Album/Color (todo depende de lo anterior)");

        jLabel4.setText("Nombre/Descripción");

        jLabel5.setText("Precio unitario (COP)");

        BTNcerrarAgregar.setText("Cerrar");
        BTNcerrarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcerrarAgregarActionPerformed(evt);
            }
        });

        BTNAgregar2.setText("Agregar");
        BTNAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregar2ActionPerformed(evt);
            }
        });

        BTNLimpiar1.setText("Limpiar");
        BTNLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLimpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAgregarLayout = new javax.swing.GroupLayout(PanelAgregar);
        PanelAgregar.setLayout(PanelAgregarLayout);
        PanelAgregarLayout.setHorizontalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                        .addComponent(BTNcerrarAgregar)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                        .addComponent(BTNAgregar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNLimpiar1)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(171, 171, 171))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                                .addComponent(labelD, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fieldPrecio)
                            .addComponent(fieldNombre)
                            .addComponent(jcSubcategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcArtista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(248, 248, 248))))
        );
        PanelAgregarLayout.setVerticalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(BTNcerrarAgregar)
                .addGap(28, 28, 28)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcSubcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelD))
                .addGap(37, 37, 37)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNAgregar2)
                    .addComponent(BTNLimpiar1))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        Pantalla.add(PanelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 950, 430));

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
                //"When We All Fall Asleep, Where Do We Go?", "Happier Than Ever", "Don't Smile at Me", "Live at Third Man Records")));
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
                {"Camiseta XS", "32", "Camiseta", "Harry Styles", "30000"},
                {"Camiseta S", "30", "Camiseta", "Harry Styles", "30000"},
                {"Camiseta M", "28", "Camiseta", "Harry Styles", "30000"},
                {"Camiseta L", "26", "Camiseta", "Harry Styles", "30000"},
                {"Camiseta XL", "24", "Camiseta", "Harry Styles", "30000"},
                {"Camiseta HS", "6", "Camiseta", "Harry Styles", "30000"},
                {"Gorra Béisbol", "20", "Gorra", "Harry Styles", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "Harry Styles", "25000"},
                {"Gorra Trucker", "20", "Gorra", "Harry Styles", "25000"},
                {"Vinilo HS", "6", "Vinilo", "Harry Styles", ""},
                {"Llavero 1", "20", "Llavero", "Harry Styles", "15000"},
                {"Llavero 2", "20", "Llavero", "Harry Styles", "15000"},
                {"Llavero 3", "20", "Llavero", "Harry Styles", "15000"},
                //SECCION SABRINA
                {"CD Sabrina", "7", "CD", "Sabrina Carpenter", ""},
                {"Camiseta XS", "30", "Camiseta", "Sabrina Carpenter", "30000"},
                {"Camiseta S", "28", "Camiseta", "Sabrina Carpenter", "30000"},
                {"Camiseta M", "26", "Camiseta", "Sabrina Carpenter", "30000"},
                {"Camiseta L", "24", "Camiseta", "Sabrina Carpenter", "30000"},
                {"Camiseta XL", "22", "Camiseta", "Sabrina Carpenter", "30000"},
                {"Vinilo Sabrina", "7", "Vinilo", "Sabrina Carpenter", ""},
                {"Llavero 1", "20", "Llavero", "Sabrina Carpenter", "15000"},
                {"Llavero 2", "20", "Llavero", "Sabrina Carpenter", "15000"},
                {"Llavero 3", "20", "Llavero", "Sabrina Carpenter", "15000"},
                {"Gorra Béisbol", "20", "Gorra", "Sabrina Carpenter", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "Sabrina Carpenter", "25000"},
                {"Gorra Trucker", "20", "Gorra", "Sabrina Carpenter", "25000"},
                //SECCION 5SOS
                {"CD 5SOS", "9", "CD", "5SOS", ""},
                {"Gorra Béisbol", "20", "Gorra", "5SOS", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "5SOS", "25000"},
                {"Gorra Trucker", "20", "Gorra", "5SOS", "25000"},
                {"Vinilo 5SOS", "9", "Vinilo", "5SOS", ""},
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
                {"CD BTR", "12", "CD", "Big Time Rush", ""},
                {"Gorra Béisbol", "20", "Gorra", "Big Time Rush", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "Big Time Rush", "25000"},
                {"Gorra Trucker", "20", "Gorra", "Big Time Rush", "25000"},
                {"Vinilo BTR", "12", "Vinilo", "Big Time Rush", ""},
                {"Llavero 1", "20", "Llavero", "Big Time Rush", "15000"},
                {"Llavero 2", "20", "Llavero", "Big Time Rush", "15000"},
                {"Llavero 3", "20", "Llavero", "Big Time Rush", "15000"},
                //SECCION STRAY KIDS
                {"Camiseta XS", "24", "Camiseta", "Stray Kids", "30000"},
                {"Camiseta S", "22", "Camiseta", "Stray Kids", "30000"},
                {"Camiseta M", "20", "Camiseta", "Stray Kids", "30000"},
                {"Camiseta L", "18", "Camiseta", "Stray Kids", "30000"},
                {"Camiseta XL", "16", "Camiseta", "Stray Kids", "30000"},
                {"CD SKZ", "14", "CD", "Stray Kids", ""},
                {"Vinilo SKZ", "14", "Vinilo", "Stray Kids", ""},
                {"Gorra Béisbol", "20", "Gorra", "Stray Kids", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "Stray Kids", "25000"},
                {"Gorra Trucker", "20", "Gorra", "Stray Kids", "25000"},
                {"Llavero 1", "20", "Llavero", "Stray Kids", "15000"},
                {"Llavero 2", "20", "Llavero", "Stray Kids", "15000"},
                {"Llavero 3", "20", "Llavero", "Stray Kids", "15000"},
                //SECCION TXT
                {"CD TXT", "14", "CD", "TXT", ""},
                {"Camiseta XS", "22", "Camiseta", "TXT", "30000"},
                {"Camiseta S", "20", "Camiseta", "TXT", "30000"},
                {"Camiseta M", "18", "Camiseta", "TXT", "30000"},
                {"Camiseta L", "16", "Camiseta", "TXT", "30000"},
                {"Camiseta XL", "14", "Camiseta", "TXT", "30000"},
                {"Vinilo TXT", "14", "Vinilo", "TXT", ""},
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
                {"CD Taylor Swift", "17", "CD", "Taylor Swift", ""},
                {"Llavero 1", "20", "Llavero", "Taylor Swift", "15000"},
                {"Llavero 2", "20", "Llavero", "Taylor Swift", "15000"},
                {"Llavero 3", "20", "Llavero", "Taylor Swift", "15000"},
                {"Vinilo Taylor Swift", "17", "Vinilo", "Taylor Swift", ""},
                {"Gorra Béisbol", "20", "Gorra", "Taylor Swift", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "Taylor Swift", "25000"},
                {"Gorra Trucker", "20", "Gorra", "Taylor Swift", "25000"},
                //SECCION LOUIS
                {"Camiseta XS", "18", "Camiseta", "Louis Tomlinson", "30000"},
                {"Camiseta S", "16", "Camiseta", "Louis Tomlinson", "30000"},
                {"Camiseta M", "14", "Camiseta", "Louis Tomlinson", "30000"},
                {"Camiseta L", "12", "Camiseta", "Louis Tomlinson", "30000"},
                {"Camiseta XL", "10", "Camiseta", "Louis Tomlinson", "30000"},
                {"CD Louis", "8", "CD", "Louis Tomilson", ""},
                {"Gorra Béisbol", "20", "Gorra", "Louis Tomlinson", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "Louis Tomlinson", "25000"},
                {"Gorra Trucker", "20", "Gorra", "Louis Tomlinson", "25000"},
                {"Llavero 1", "20", "Llavero", "Louis Tomlinson", "15000"},
                {"Llavero 2", "20", "Llavero", "Louis Tomlinson", "15000"},
                {"Llavero 3", "20", "Llavero", "Louis Tomlinson", "15000"},
                {"Vinilo Louis", "8", "Vinilo", "Louis Tomilson", ""},
                //SECCION IMAGINE DRAGONS
                {"Camiseta XS", "16", "Camiseta", "Imagine Dragons", "30000"},
                {"Camiseta S", "14", "Camiseta", "Imagine Dragons", "30000"},
                {"Camiseta M", "12", "Camiseta", "Imagine Dragons", "30000"},
                {"Camiseta L", "10", "Camiseta", "Imagine Dragons", "30000"},
                {"Camiseta XL", "8", "Camiseta", "Imagine Dragons", "30000"},
                {"CD Imagine", "5", "CD", "Imagine Dragons", ""},
                {"Gorra Béisbol", "20", "Gorra", "Imagine Dragons", "25000"},
                {"Gorra Plana/Snapback", "20", "Gorra", "Imagine Dragons", "25000"},
                {"Gorra Trucker", "20", "Gorra", "Imagine Dragons", "25000"},
                {"Llavero 1", "20", "Llavero", "Imagine Dragons", "15000"},
                {"Llavero 2", "20", "Llavero", "Imagine Dragons", "15000"},
                {"Llavero 3", "20", "Llavero", "Imagine Dragons", "15000"},
                {"Vinilo Imagine", "5", "Vinilo", "Imagine Dragons", ""}

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
            System.out.println("Datos agregados exitosamente al archivo" + file_name);

        } catch (IOException ex) {
            System.out.println("Error al agregar datos al archivo");
            ex.printStackTrace();
        }
    }

    public static void Usuarios(String file_name) {
        try {
            FileWriter outFile = new FileWriter(file_name + ".txt", false);
            PrintWriter registro = new PrintWriter(outFile);

            //Matriz para crear Archivo Existente 
            String[][] usuariosADMIN = {
                //Seccion CONAN
                {"Nacale", "12345"},
                {"Pauly", "888"},
                {"IsaBella", "111"},};

            //Agregar datos de la matriz al registro
            for (String[] fila : usuariosADMIN) {
                String NombreProducto = fila[0];
                String Contraseña = fila[1];

                // Agregar los datos al archivo
                registro.println(NombreProducto + ";" + Contraseña);
            }

            registro.close();
            System.out.println("Datos agregados exitosamente al archivo" + file_name);

        } catch (IOException ex) {
            System.out.println("Error al agregar datos al archivo" + file_name);
            ex.printStackTrace();
        }
    }

    //02 Subrutina para mostrar datos en la tabla
    public static void LeerNormal(Scanner sc, String file_name, JTable tabla) {
        boolean hay = false;
        while (hay == false) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file_name + ".txt"));
                String line = null;
                DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                model.setRowCount(0);

                while ((line = br.readLine()) != null) {
                    String temp[] = line.split(";");
                    model.addRow(temp); //Agregar datos del archivo a la tabla
                }
                br.close();
                hay = true;

            } catch (IOException ex) {
                System.out.println("No se encontro archivo");
                hay = false;
                file_name = sc.nextLine(); // Archivo
            }
        }
    }

    private static final Map<String, List<String>> ALBUMES_ARTISTAS = new HashMap<>();

    static {
        //HACE FALTA ALBUMES

        ALBUMES_ARTISTAS.put("Conan Gray", new ArrayList<>(List.of("Sunset Season", "Kid Krow", "Superache")));
        ALBUMES_ARTISTAS.put("Harry Styles", new ArrayList<>(List.of("Harry Styles", "Fine Line", "Harry's House")));
        ALBUMES_ARTISTAS.put("Sabrina Carpenter", new ArrayList<>(List.of("Eyes Wide Open", "Evolution", "Emails I Can't Send")));
        ALBUMES_ARTISTAS.put("Taylor Swift", new ArrayList<>(List.of("Fearless (Taylor's version)", "Speak Now (Taylor's version)", "Red (Taylor's version)", "Lover", "folklore", "evermore")));
        ALBUMES_ARTISTAS.put("Billie Eilish", new ArrayList<>(List.of("When We All Fall Asleep, Where Do We Go?", "Happier Than Ever", "Don't Smile at Me", "Live at Third Man Records")));
        ALBUMES_ARTISTAS.put("Louis Tomlinson", new ArrayList<>(List.of("Walls")));
        ALBUMES_ARTISTAS.put("5SOS", new ArrayList<>(List.of("5 Seconds of Summer", "Sounds Good Feels Good", "Youngblood")));
        ALBUMES_ARTISTAS.put("Stray Kids", new ArrayList<>(List.of("Go Live", "No Easy", "5Stars", "ODDINARY", "Maxident")));
        ALBUMES_ARTISTAS.put("Big Time Rush", new ArrayList<>(List.of("BTR", "Elevate")));
        ALBUMES_ARTISTAS.put("TXT", new ArrayList<>(List.of("The Dream Chapter: STAR", "The Chaos Chapter: FREEZE")));
        ALBUMES_ARTISTAS.put("Imagine Dragons", new ArrayList<>(List.of("Night Visions", "Smoke + Mirrors", "Evolve", "Origins")));
    }

    //Subrutina para cargar datos de las subcategorias
    public void CargarDatosJcombo() {
        String categoria = jcCategoria.getSelectedItem().toString();
        String artista = jcArtista.getSelectedItem().toString();
        List<String> albumes = ALBUMES_ARTISTAS.get(artista);

        if (categoria.equalsIgnoreCase("Seleccionar categoria")) {
            jcSubcategoria.setEnabled(false);
            fieldNombre.setEnabled(false);
            fieldPrecio.setEnabled(false);
            System.out.println("Entre aqui en false");

        } else if ((artista.equalsIgnoreCase("Seleccionar artista"))) {
            jcSubcategoria.setEnabled(false);
            fieldNombre.setEnabled(false);
            fieldPrecio.setEnabled(false);
            System.out.println("Entre aqui en false");

        }
        if (albumes == null || artista.equalsIgnoreCase("Seleccionar artista")) {
            // El artista no existe en el mapa.
            // Maneja este caso aquí.
            return;
        } else {
            jcSubcategoria.setEnabled(true);
            fieldNombre.setEnabled(true);
            fieldPrecio.setEnabled(true);

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
                    comboBoxModel4.addElement("Seleccionar tipo");
                    comboBoxModel4.addElement("Gorra Béisbol");
                    comboBoxModel4.addElement("Gorra Plana/Snapback");
                    comboBoxModel4.addElement("Gorra Trucker");
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BTNAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregar1ActionPerformed
        PanelAgregar.setVisible(true);
        jScrollPane1.setVisible(false);
        TablaINVENTARIO.setVisible(false);
        BTNAgregar1.setVisible(false);
        CargarDatosJcombo();
    }//GEN-LAST:event_BTNAgregar1ActionPerformed

    private void BTNcerrarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcerrarAgregarActionPerformed
        PanelAgregar.setVisible(false);
        jScrollPane1.setVisible(true);
        TablaINVENTARIO.setVisible(true);
        BTNAgregar1.setVisible(true);
    }//GEN-LAST:event_BTNcerrarAgregarActionPerformed

    private void BTNAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregar2ActionPerformed
        String Categoria = jcCategoria.getSelectedItem().toString();
        String Artista = jcArtista.getSelectedItem().toString();
        if (Categoria.equalsIgnoreCase("Seleccionar categoria")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un empleado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (Artista.equalsIgnoreCase("Seleccionar artista")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un artista.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        String seleccionarc = "Seleccionar categoria";
        String seleccionara = "Seleccionar artista";
        jcCategoria.setSelectedItem(seleccionarc);
        jcArtista.setSelectedItem(seleccionara);
    }//GEN-LAST:event_BTNAgregar2ActionPerformed

    private void BTNLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLimpiar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNLimpiar1ActionPerformed

    private void jcSubcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSubcategoriaActionPerformed

    }//GEN-LAST:event_jcSubcategoriaActionPerformed

    private void jcArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcArtistaActionPerformed
        CargarDatosJcombo();
    }//GEN-LAST:event_jcArtistaActionPerformed

    private void jcCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCategoriaActionPerformed
        CargarDatosJcombo();
    }//GEN-LAST:event_jcCategoriaActionPerformed


    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        perfilesFR menu = new perfilesFR();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnGraficsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGraficsActionPerformed
        //SE VISUALIZA PANEL ENCIMA NO QUIERO HACER OTRO FRAME
    }//GEN-LAST:event_BtnGraficsActionPerformed

    private void userfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userfieldActionPerformed

    }//GEN-LAST:event_userfieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        char echoChar = PassField.getEchoChar(); // Obtener el carácter de eco actual
        if (echoChar != 0) {
            PassField.setEchoChar((char) 0); // Establecer el carácter de eco a 0 (sin ocultar)
        } else {
            PassField.setEchoChar('\u2022'); // Establecer el carácter de eco a • (ocultar)
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PassFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassFieldMouseClicked
        PassField.setText(null);
    }//GEN-LAST:event_PassFieldMouseClicked

    private void userfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userfieldMouseClicked
        userfield.setText(null);
    }//GEN-LAST:event_userfieldMouseClicked

    private void BtnVerifyUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerifyUserActionPerformed
        Scanner sc = new Scanner(System.in);
        String U = userfield.getText();
        String P = PassField.getText();
        boolean Correct = Verify(sc, "Usuarios", U, P);
        if (Correct == true) {
            Pantalla.setVisible(true);
            Constraseña.setVisible(false);
        } else {
            AvisoLabel.setText("Contraseña o Usuario incorrecto");
        }
    }//GEN-LAST:event_BtnVerifyUserActionPerformed
//VERIFICACION DE USUARIOSSSS
    public static boolean Verify(Scanner sc, String file_name, String U, String P) {
        boolean hay = false;
        while (!hay) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file_name + ".txt"));
                String line = null;
                String passw = null;
                boolean stop = false;

                while ((line = br.readLine()) != null & stop == false) {
                    String temp[] = line.split(";");
                    if (temp[0].equalsIgnoreCase(U)) {
                        stop = true;
                        passw = temp[1];
                    }
                }
                br.close();
                hay = true;
                if (stop == true) {
                    if (passw != null & passw.equalsIgnoreCase(P)) {
                        return true; 
                    } else {
                        return false;
                    }
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
    private javax.swing.JLabel AvisoLabel;
    private javax.swing.JButton BTNAgregar1;
    private javax.swing.JButton BTNAgregar2;
    private javax.swing.JButton BTNLimpiar1;
    private javax.swing.JButton BTNcerrarAgregar;
    private javax.swing.JButton BtnGrafics;
    private javax.swing.JButton BtnInfo;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnVerifyUser;
    private custom.PanelRound Constraseña;
    private javax.swing.JLabel IconADMI;
    private javax.swing.JPanel PanelAgregar;
    private custom.PanelRound Pantalla;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JTable TablaINVENTARIO;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldPrecio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcArtista;
    private javax.swing.JComboBox<String> jcCategoria;
    private javax.swing.JComboBox<String> jcSubcategoria;
    private javax.swing.JLabel labelD;
    private custom.PanelRound panelRound2;
    private javax.swing.JTextField userfield;
    // End of variables declaration//GEN-END:variables
}
