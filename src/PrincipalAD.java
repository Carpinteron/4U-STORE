
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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PrincipalAD extends javax.swing.JFrame {

    String admi;

    public PrincipalAD(String name) {
        setIconImage(new ImageIcon(getClass().getResource("ICons/4Uicon.png")).getImage());
        setUndecorated(true);
        this.admi = name;
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
        // userfield.setText(admi);
        userLABEL.setText(admi);
        //No visible
        Constraseña.setVisible(true);
        Pantalla.setVisible(false);
        exitBTN.setVisible(false);
        PanelAgregar.setVisible(false);
        AgregarProductoExistente.setVisible(true);
        labelD.setVisible(false);
        error1.setVisible(false);
        error2.setVisible(false);
        error3.setVisible(false);
        error4.setVisible(false);
        error5.setVisible(false);
        error6.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Constraseña = new custom.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnVerifyUser = new javax.swing.JButton();
        PassField = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        AvisoLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userLABEL = new javax.swing.JLabel();
        Pantalla = new custom.PanelRound();
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
        jButton1 = new javax.swing.JButton();
        AgregarProductoExistente = new custom.PanelRound();
        AvisoLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Constraseña.setBackground(new java.awt.Color(153, 153, 255));
        Constraseña.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Usuario");
        Constraseña.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel6.setText("Verifique Contraseña De Administrador");
        Constraseña.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        BtnVerifyUser.setText("SIGN IN");
        BtnVerifyUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerifyUserActionPerformed(evt);
            }
        });
        Constraseña.add(BtnVerifyUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        PassField.setText("jPasswordField1");
        PassField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassFieldMouseClicked(evt);
            }
        });
        Constraseña.add(PassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 277, 36));

        jButton2.setText("Mostrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Constraseña.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));
        Constraseña.add(AvisoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 290, 25));
        Constraseña.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 120, 20));

        userLABEL.setText("User ..");
        Constraseña.add(userLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 140, 30));

        getContentPane().add(Constraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 560, 370));

        Pantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(153, 153, 255));

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

        jButton3.setText("Registrarse");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/Logo 4U_1.png"))); // NOI18N

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(BtnGrafics, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(BtnGrafics, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(BtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        Pantalla.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 700));

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
        Pantalla.add(botonPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, -1, -1));

        botonEP.setText("Eliminar Producto");
        Pantalla.add(botonEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 70, -1, -1));

        btnactualizar.setText("Actualizar Inventario de acuerdo a ventas");
        Pantalla.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jButton1.setText("Ver grafica");
        Pantalla.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, -1, -1));

        AgregarProductoExistente.setBackground(new java.awt.Color(153, 153, 255));
        AgregarProductoExistente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        AgregarProductoExistente.add(AvisoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 290, 25));
        AgregarProductoExistente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 120, 20));

        Pantalla.add(AgregarProductoExistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 560, 370));

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
                seagrego = true;
            }

            registrar_producto.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al agregar los datos.", "Error", JOptionPane.ERROR_MESSAGE);

            System.out.println("Error creando el archivo");
            ex.printStackTrace();
        }

    }

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
        if (c5.isEmpty()) {//que no este vacio
            error5.setText("(!) Campo vacío");
            error5.setVisible(true);
            return false;
        } else {// Validación que sea numerico y mayor a cero
            boolean validocant = true;
            for (char c : c5.toCharArray()) {
                if (!Character.isDigit(c)) {
                    validocant = false;
                    break;
                }
            }
            try {
                double cant = Double.parseDouble(c5);
                if (cant < 0) {
                    error5.setVisible(false);
                }
            } catch (NumberFormatException e) {
                error5.setText("(!) La cantidad debe ser mayor a 0");
                error5.setVisible(true); // Mostrar mensaje de error
                return false;
            }

            if (!validocant) {
                error5.setText("(!) El valor debe ser numerico");
                error5.setVisible(true); // Mostrar mensaje de error
                return false;
            } else {
                error5.setVisible(false); // Ocultar mensaje de error  

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


    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void BTNAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregar1ActionPerformed
        PanelAgregar.setVisible(true);
        jScrollPane1.setVisible(false);
        TablaINVENTARIO.setVisible(false);
        BTNAgregar1.setVisible(false);
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
    }//GEN-LAST:event_BTNcerrarAgregarActionPerformed

    private void BTNAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregar2ActionPerformed
        AgregarProducto("Inventario");
        if (seagrego) {
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
        perfilesFR menu = new perfilesFR(admi);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnGraficsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGraficsActionPerformed
        //SE VISUALIZA PANEL ENCIMA NO QUIERO HACER OTRO FRAME
    }//GEN-LAST:event_BtnGraficsActionPerformed

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

    private void BtnVerifyUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerifyUserActionPerformed

        Scanner sc = new Scanner(System.in);
        String U = admi;
        //userfield.getText();
        String P = PassField.getText();
        boolean Correct = Verify(sc, "Usuarios", U, P);
        if (Correct == true) {
            Pantalla.setVisible(true);
            Constraseña.setVisible(false);
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
                new PrincipalAD(null).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom.PanelRound AgregarProductoExistente;
    private javax.swing.JLabel AvisoLabel;
    private javax.swing.JLabel AvisoLabel1;
    private javax.swing.JButton BTNAgregar1;
    private javax.swing.JButton BTNAgregar2;
    private javax.swing.JButton BTNLimpiar1;
    private javax.swing.JButton BTNcerrarAgregar;
    private javax.swing.JButton BtnGrafics;
    private javax.swing.JButton BtnInfo;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnVerifyUser;
    private custom.PanelRound Constraseña;
    private javax.swing.JPanel PanelAgregar;
    private custom.PanelRound Pantalla;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JTable TablaINVENTARIO;
    private javax.swing.JButton botonEP;
    private javax.swing.JButton botonPE;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel error3;
    private javax.swing.JLabel error4;
    private javax.swing.JLabel error5;
    private javax.swing.JLabel error6;
    private javax.swing.JButton exitBTN;
    private javax.swing.JTextField fieldCant;
    private javax.swing.JTextField fieldDescripcion;
    private javax.swing.JTextField fieldPrecio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcArtista;
    private javax.swing.JComboBox<String> jcCategoria;
    private javax.swing.JComboBox<String> jcSubcategoria;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelD;
    private custom.PanelRound panelRound2;
    private javax.swing.JLabel userLABEL;
    // End of variables declaration//GEN-END:variables
}
