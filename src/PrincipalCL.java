

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class PrincipalCL extends javax.swing.JFrame {

    private String user, cedula;
    
    public PrincipalCL(String user, String cedula) {
        setIconImage(new ImageIcon(getClass().getResource("ICons/4Uicon.png")).getImage());
        this.user = user;
     //   CarritoFR framecarro=new CarritoFR(this);
        this.cedula = cedula;
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        initComponents();
        Scanner sc =new Scanner(System.in);
        setLocationRelativeTo(null);
        panelproductoss.setVisible(false);
        panelDELproducto.setVisible(false);
        BTNartistas.setEnabled(false);//boton para que muestre el panel de todos los artistas
        //La idea es que cuando se esten en el menu de artistas el boton este señalado o resaltado mas no se puede seleccionar
        BTNproductos.setEnabled(false);
        //si selecciona un artista, el botonartistas se habilita por si el usuario se quiere regrsar, y se resal el boton de los productos del artista
        BTNelproducto.setEnabled(false);
        TituloArtista.setText(SelectedArtist);
        
        PrincipalAD.CopiarArchivoAlISTA(sc, "Inventario",Names,Cantidad);
        //Opcion de Ordenar por Precio o Tipo (esto cuando seleccione al artista)
        ButtonGroup buttonGroup = new ButtonGroup();
        // Agregar los radio buttons al grupo
        buttonGroup.add(BotonPrecio);
        buttonGroup.add(BotonNo);
        BotonPrecio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LeerporPreferencia(sc, "Inventario", TablaArtista,SelectedArtist);
                sc.close();
            }
        });
        BotonNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LeerNormal(sc, "Inventario", TablaArtista,SelectedArtist);
                sc.close();
            }
        });
        //Para la tabla EMPLEADOS
        // Obtener el encabezado de la tabla
        JTableHeader header = TablaArtista.getTableHeader();

// Crear una fuente en negrita
        Font font = new Font("Berlin Sans FB Demi", Font.BOLD, 14);

// Aplicar la fuente en negrita al encabezado
        header.setFont(font);
    }
    PrincipalAD.ListaEnlazada Carrito=new PrincipalAD.ListaEnlazada();
     PrincipalAD.ListaEnlazada Cantidad=new PrincipalAD.ListaEnlazada();
    PrincipalAD.ListaEnlazada Names=new PrincipalAD.ListaEnlazada();
    public String Frameanterior;
    public JPanel actualPanel;
    public String SelectedArtist,product;

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
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaArtista = new javax.swing.JTable();
        BotonPrecio = new javax.swing.JRadioButton();
        BotonNo = new javax.swing.JRadioButton();
        panelDELproducto = new javax.swing.JPanel();
        labelArtist = new javax.swing.JLabel();
        labelTipoProduct = new javax.swing.JLabel();
        jcSeleccionProducto = new javax.swing.JComboBox<>();
        ImagenProducto = new javax.swing.JLabel();
        AddAlCarritoBTN = new javax.swing.JButton();
        UnidadesDelProducto = new javax.swing.JTextField();
        labelD = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelArtistas = new javax.swing.JPanel();
        HSbtn = new javax.swing.JButton();
        SabrinaBTN = new javax.swing.JButton();
        BTRbtn = new javax.swing.JButton();
        ConanBTN = new javax.swing.JButton();
        ImagineDragonsBTN = new javax.swing.JButton();
        LousiBTN = new javax.swing.JButton();
        SkzBTN = new javax.swing.JButton();
        txtBTN = new javax.swing.JButton();
        BillieBTN = new javax.swing.JButton();
        BTN5sos = new javax.swing.JButton();
        TaylorBTN = new javax.swing.JButton();
        BTNartistas = new javax.swing.JButton();
        BTNproductos = new javax.swing.JButton();
        BTNelproducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(204, 204, 255));
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

        jButton2.setBackground(new java.awt.Color(102, 0, 204));
        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Carrito");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        menu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 260, -1, 45));

        BtnSalir.setBackground(new java.awt.Color(102, 0, 204));
        BtnSalir.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalir.setText("OUT");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        menu.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 604, -1, -1));

        jButton3.setBackground(new java.awt.Color(102, 0, 204));
        jButton3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Explore");
        menu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 189, -1, 33));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/Logo 4U_1.png"))); // NOI18N
        menu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        panelRound1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelproductoss.setOpaque(false);
        panelproductoss.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloArtista.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        TituloArtista.setText("Nombre del Artista");
        panelproductoss.add(TituloArtista, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 20, 475, 66));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 17)); // NOI18N
        jLabel2.setText("¿Qué producto desea explorar? ");
        panelproductoss.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, -1, 24));

        btnCamisetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5G.png"))); // NOI18N
        btnCamisetas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 153, 255), null, null));
        btnCamisetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamisetasActionPerformed(evt);
            }
        });
        panelproductoss.add(btnCamisetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 500, 190, 70));

        btnVINILOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3G.png"))); // NOI18N
        btnVINILOS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 153, 255), null, null));
        btnVINILOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVINILOSActionPerformed(evt);
            }
        });
        panelproductoss.add(btnVINILOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 187, 70));

        btnGORRAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1G.png"))); // NOI18N
        btnGORRAS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 153, 255), null, null));
        btnGORRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGORRASActionPerformed(evt);
            }
        });
        panelproductoss.add(btnGORRAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 195, 70));

        btnLLaveros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4G.png"))); // NOI18N
        btnLLaveros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 153, 255), null, null));
        btnLLaveros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLLaverosActionPerformed(evt);
            }
        });
        panelproductoss.add(btnLLaveros, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, 190, 70));

        btnCDS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2G.png"))); // NOI18N
        btnCDS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 153, 255), null, null));
        btnCDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCDSActionPerformed(evt);
            }
        });
        panelproductoss.add(btnCDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 190, 70));

        TablaArtista.setBackground(new java.awt.Color(243, 239, 239));
        TablaArtista.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        TablaArtista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Precio", "Disponibilidad", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaArtista);

        panelproductoss.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 127, 810, 450));

        BotonPrecio.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        BotonPrecio.setText("Ordenar por precio");
        panelproductoss.add(BotonPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        BotonNo.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        BotonNo.setText("Sin ordenar");
        panelproductoss.add(BotonNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        panelRound1.add(panelproductoss, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 1070, 590));

        panelDELproducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelArtist.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        labelArtist.setText("ARTISTA");
        panelDELproducto.add(labelArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 28, 335, 55));

        labelTipoProduct.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        labelTipoProduct.setText("jLabel5");
        panelDELproducto.add(labelTipoProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 320, 24));

        jcSeleccionProducto.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jcSeleccionProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcSeleccionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSeleccionProductoActionPerformed(evt);
            }
        });
        panelDELproducto.add(jcSeleccionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 280, -1));

        ImagenProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICons/camiseta-200.png"))); // NOI18N
        panelDELproducto.add(ImagenProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 180, 240));

        AddAlCarritoBTN.setText("Agregar al carrito");
        AddAlCarritoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAlCarritoBTNActionPerformed(evt);
            }
        });
        panelDELproducto.add(AddAlCarritoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, 180, 60));

        UnidadesDelProducto.setText("1");
        UnidadesDelProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UnidadesDelProductoMouseClicked(evt);
            }
        });
        panelDELproducto.add(UnidadesDelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 140, 40));

        labelD.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        labelD.setText("Seleccione el producto");
        panelDELproducto.add(labelD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        panelRound1.add(panelDELproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 1060, 580));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        panelArtistas.setBackground(new java.awt.Color(204, 204, 255));
        panelArtistas.setOpaque(false);
        panelArtistas.setPreferredSize(new java.awt.Dimension(1000, 824));

        HSbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.png"))); // NOI18N
        HSbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HSbtnActionPerformed(evt);
            }
        });

        SabrinaBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
        SabrinaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabrinaBTNActionPerformed(evt);
            }
        });

        BTRbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4.png"))); // NOI18N
        BTRbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTRbtnActionPerformed(evt);
            }
        });

        ConanBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3.png"))); // NOI18N
        ConanBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConanBTNActionPerformed(evt);
            }
        });

        ImagineDragonsBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/8.png"))); // NOI18N
        ImagineDragonsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImagineDragonsBTNActionPerformed(evt);
            }
        });

        LousiBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6.png"))); // NOI18N
        LousiBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LousiBTNActionPerformed(evt);
            }
        });

        SkzBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5.png"))); // NOI18N
        SkzBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkzBTNActionPerformed(evt);
            }
        });

        txtBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/11.png"))); // NOI18N
        txtBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBTNActionPerformed(evt);
            }
        });

        BillieBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/9.png"))); // NOI18N
        BillieBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillieBTNActionPerformed(evt);
            }
        });

        BTN5sos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/10.png"))); // NOI18N
        BTN5sos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN5sosActionPerformed(evt);
            }
        });

        TaylorBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/7.png"))); // NOI18N
        TaylorBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaylorBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelArtistasLayout = new javax.swing.GroupLayout(panelArtistas);
        panelArtistas.setLayout(panelArtistasLayout);
        panelArtistasLayout.setHorizontalGroup(
            panelArtistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArtistasLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelArtistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelArtistasLayout.createSequentialGroup()
                        .addComponent(HSbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(SabrinaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(ConanBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(BTRbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelArtistasLayout.createSequentialGroup()
                        .addGroup(panelArtistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelArtistasLayout.createSequentialGroup()
                                .addComponent(SkzBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(LousiBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelArtistasLayout.createSequentialGroup()
                                .addComponent(BillieBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(BTN5sos, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addGroup(panelArtistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelArtistasLayout.createSequentialGroup()
                                .addComponent(TaylorBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(ImagineDragonsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        panelArtistasLayout.setVerticalGroup(
            panelArtistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArtistasLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelArtistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HSbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SabrinaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConanBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTRbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panelArtistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SkzBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LousiBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TaylorBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImagineDragonsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelArtistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BillieBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN5sos, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(panelArtistas);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 56, 1098, 564));

        BTNartistas.setBackground(new java.awt.Color(171, 116, 227));
        BTNartistas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        BTNartistas.setForeground(new java.awt.Color(255, 255, 255));
        BTNartistas.setText("ARTISTAS");
        BTNartistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNartistasActionPerformed(evt);
            }
        });
        panelRound1.add(BTNartistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 6, -1, -1));

        BTNproductos.setBackground(new java.awt.Color(171, 116, 227));
        BTNproductos.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        BTNproductos.setForeground(new java.awt.Color(255, 255, 255));
        BTNproductos.setText("PRODUCTOS");
        BTNproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNproductosActionPerformed(evt);
            }
        });
        panelRound1.add(BTNproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 6, -1, -1));

        BTNelproducto.setBackground(new java.awt.Color(171, 116, 227));
        BTNelproducto.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        BTNelproducto.setForeground(new java.awt.Color(255, 255, 255));
        BTNelproducto.setText("VISTAZO DEL PRODUCTO");
        panelRound1.add(BTNelproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 6, -1, -1));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        perfilesFR menu = new perfilesFR(user, cedula);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CarritoFR carrito = new CarritoFR(user, cedula,this);
        carrito.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BTNartistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNartistasActionPerformed
        if (actualPanel == panelproductoss | actualPanel == panelDELproducto) {
            panelproductoss.setVisible(false);
            panelDELproducto.setVisible(false);
            panelDELproducto.setEnabled(false);
            panelArtistas.setVisible(true);
            panelArtistas.setEnabled(true);
            BTNelproducto.setEnabled(false);
            BTNartistas.setEnabled(false);
            jScrollPane1.setVisible(true);
            BTNproductos.setEnabled(false);
        }
    }//GEN-LAST:event_BTNartistasActionPerformed

    private void BTNproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNproductosActionPerformed
        if (actualPanel == panelDELproducto) {
            panelproductoss.setVisible(true);
            panelDELproducto.setVisible(false);
            panelArtistas.setVisible(false);
            panelArtistas.setEnabled(false);
            BTNartistas.setEnabled(true);
            jScrollPane1.setVisible(false);
            BTNelproducto.setEnabled(false);
            
        }
    }//GEN-LAST:event_BTNproductosActionPerformed

    private void btnGORRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGORRASActionPerformed
        product="Gorra";
        labelD.setText("Seleccione el tipo de gorra:");
        BotonesProductoPanel();
        cargardatosalcombo();
    }//GEN-LAST:event_btnGORRASActionPerformed

    private void btnVINILOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVINILOSActionPerformed
        product="Vinilo";
        labelD.setText("Seleccione el álbum:");
        BotonesProductoPanel();
        cargardatosalcombo();
    }//GEN-LAST:event_btnVINILOSActionPerformed

    private void btnCamisetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamisetasActionPerformed
        product="Camiseta";
        labelD.setText("Seleccione la talla:");
        BotonesProductoPanel();
        cargardatosalcombo();
    }//GEN-LAST:event_btnCamisetasActionPerformed

    private void btnCDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDSActionPerformed
        product="CD";
        labelD.setText("Seleccione el álbum:");
        BotonesProductoPanel();
        cargardatosalcombo();
    }//GEN-LAST:event_btnCDSActionPerformed

    private void btnLLaverosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLLaverosActionPerformed
        product="Llavero";
        labelD.setText("Seleccione el tipo:");
        BotonesProductoPanel();
        cargardatosalcombo();
    }//GEN-LAST:event_btnLLaverosActionPerformed

    private void jcSeleccionProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSeleccionProductoActionPerformed
         
       
    }//GEN-LAST:event_jcSeleccionProductoActionPerformed

    private void AddAlCarritoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAlCarritoBTNActionPerformed
        String NombreProducto = (jcSeleccionProducto.getSelectedItem() != null) ? jcSeleccionProducto.getSelectedItem().toString() : "";
        Scanner sc=new Scanner(System.in);
        if(UnidadesDelProducto.getText()==null |UnidadesDelProducto.getText()==""|UnidadesDelProducto.getText()=="0" ){
           //aviso
       }else{
         int uni=Integer.parseInt(UnidadesDelProducto.getText());
           for (int i = 1; i <= uni; i++) {
               Carrito.agregarAlFinal(product+" "+NombreProducto+";"+SelectedArtist);
           }
         Carrito.mostrarLista();
         int pos=Names.buscarPosicionporDato(product+" "+NombreProducto+";"+SelectedArtist);
         int res=Integer.parseInt(Cantidad.buscarPorPosicion(pos))-uni;
         Cantidad.modificarDatoEnPosicion(pos,Integer.toString(res) );
         Cantidad.mostrarLista();
         
       }
    }//GEN-LAST:event_AddAlCarritoBTNActionPerformed

    private void UnidadesDelProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UnidadesDelProductoMouseClicked
        UnidadesDelProducto.setText("");
    }//GEN-LAST:event_UnidadesDelProductoMouseClicked

    private void TaylorBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaylorBTNActionPerformed

        SelectedArtist = "Taylor Swift";
        BotonesArtistasPanel();
        
    }//GEN-LAST:event_TaylorBTNActionPerformed

    private void BTN5sosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN5sosActionPerformed

        SelectedArtist = "5SOS";
        BotonesArtistasPanel();
    }//GEN-LAST:event_BTN5sosActionPerformed

    private void BillieBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillieBTNActionPerformed

        SelectedArtist = "Billie Eilish";
        BotonesArtistasPanel();
    }//GEN-LAST:event_BillieBTNActionPerformed

    private void txtBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBTNActionPerformed

        SelectedArtist = "TXT";
        BotonesArtistasPanel();
    }//GEN-LAST:event_txtBTNActionPerformed

    private void SkzBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkzBTNActionPerformed

        SelectedArtist = "Stray Kids";
        BotonesArtistasPanel();
    }//GEN-LAST:event_SkzBTNActionPerformed

    private void LousiBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LousiBTNActionPerformed

        SelectedArtist = "Louis Tomlinson";
        BotonesArtistasPanel();
    }//GEN-LAST:event_LousiBTNActionPerformed

    private void ImagineDragonsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImagineDragonsBTNActionPerformed

        SelectedArtist = "Imagine Dragons";
        BotonesArtistasPanel();
    }//GEN-LAST:event_ImagineDragonsBTNActionPerformed

    private void ConanBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConanBTNActionPerformed

        SelectedArtist = "Conan Gray";
        BotonesArtistasPanel();
    }//GEN-LAST:event_ConanBTNActionPerformed

    private void BTRbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRbtnActionPerformed

        SelectedArtist = "Big Time Rush";
        BotonesArtistasPanel();
    }//GEN-LAST:event_BTRbtnActionPerformed

    private void SabrinaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabrinaBTNActionPerformed
        SelectedArtist = "Sabrina Carpenter";
        BotonesArtistasPanel();
    }//GEN-LAST:event_SabrinaBTNActionPerformed

    private void HSbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HSbtnActionPerformed
        SelectedArtist = "Harry Styles";
        BotonesArtistasPanel();
    }//GEN-LAST:event_HSbtnActionPerformed

    public void BotonesArtistasPanel() {
        panelproductoss.setVisible(true);
        panelproductoss.setEnabled(true);
        TituloArtista.setText(SelectedArtist);
        panelArtistas.setVisible(false);
        panelArtistas.setEnabled(false);
        BTNartistas.setEnabled(true);
        actualPanel = panelproductoss;
        jScrollPane1.setVisible(false);
        BTNelproducto.setEnabled(false);
        Scanner sc = new Scanner(System.in);
        LeerNormal(sc, "Inventario", TablaArtista,SelectedArtist);
        sc.close();
    }

    public void BotonesProductoPanel() {
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
        BTNelproducto.setEnabled(true);
        labelArtist.setText(SelectedArtist);
        labelTipoProduct.setText(product);
        cargardatosalcombo();
        
    }
 
    
        
    private static final Map<String, List<String>> ALBUMES_ARTISTAS = new HashMap<>();

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
    DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>();

    // Método para cargar productos desde el archivo
    public void cargardatosalcombo() {
        String categoria = product;
        System.out.println("Este es el producto: "+product);
        String artista = SelectedArtist;
        System.out.println("Este es el artista: "+artista);
        List<String> albumesPE = ALBUMES_ARTISTAS.get(artista);

        
        if (albumesPE == null) {
            // El artista no existe en el mapa.
            // Maneja este caso aquí.
            System.out.println("entre aqui ve");
            return;
        } else {
            model2.removeAllElements(); // Limpia el modelo antes de cargar los elementos desde el archivo
            boolean hayElementos = false; // Bandera para verificar si se encontraron elementos
            try ( BufferedReader BR = new BufferedReader(new FileReader("inventario.txt"))) {
                String line;
                while ((line = BR.readLine()) != null) {
                    String[] campos = line.split(";");
                    if (campos.length > 3) { // Asegúrate de que haya suficientes campos
                        String nombreProducto = campos[0];
                        String CategoriaArch = campos[2];
                        String ArtistaArch = campos[3];
                        if (CategoriaArch.equalsIgnoreCase(categoria) && ArtistaArch.equalsIgnoreCase(artista)) {
                            if (!existeEnComboBox2(eliminarPrimeraPalabra(nombreProducto))) {
                                model2.addElement(eliminarPrimeraPalabra(nombreProducto));
                                hayElementos = true; // Se encontraron elementos
                                System.out.println("Encontre elementossss");
                            }
                        }

                    }
                }
                if (!hayElementos) {
                    jcSeleccionProducto.setEnabled(false); // Deshabilita el JComboBox
                    UnidadesDelProducto.setEnabled(false);
                    AddAlCarritoBTN.setEnabled(false);
                } else {
                    jcSeleccionProducto.setEnabled(true); // habilita el JComboBox
                    UnidadesDelProducto.setEnabled(true);
                    AddAlCarritoBTN.setEnabled(true);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            jcSeleccionProducto.setModel(model2); // Asigna el modelo al JComboBox

        }

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
     public static String eliminarPrimeraPalabra(String cadena) {
        // Buscar la posición del primer espacio en blanco
        int indicePrimerEspacio = cadena.indexOf(" ");
        
        // Verificar si se encontró un espacio en blanco
        if (indicePrimerEspacio != -1) {
            // Usar substring para eliminar la primera palabra
            return cadena.substring(indicePrimerEspacio + 1);
        } else {
            // Si no se encuentra un espacio en blanco, la cadena es una sola palabra
            return cadena;
        }
    }
     //Para mostrar datos segun Artista
    public static void LeerNormal(Scanner sc, String file_name, JTable tabla, String nombreArtista) {
    try {
        BufferedReader br = new BufferedReader(new FileReader(file_name + ".txt"));
        String line;
        List<String[]> Datos = new ArrayList<>(); // Implemento una lista 
        // Limpia la tabla
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
        while ((line = br.readLine()) != null) {
            String[] temp = line.split(";");
            if (temp[3].equals(nombreArtista)) {
                String nombreProducto = temp[0]; // Nombre del producto
                String precio = temp[4]; // Precio
                String cantidad = temp[1] + " Unidades"; // Cantidad + " Unidades"
                String tipo = temp[2]; // Tipo

                // Crear un arreglo con los datos en el orden deseado
                String[] fila = {nombreProducto, precio, cantidad, tipo};

                model.addRow(fila);
            Datos.add(temp); // Agrego los registros a la lista
        }
        }

        br.close();
    } catch (IOException ex) {
        System.out.println("Error al leer el archivo: " + ex.getMessage());
    }
}
    //Leer datos de forma ordenada (Segun Producto-Artista o Precio-Artista)
    public static void LeerporPreferencia(Scanner sc, String file_name, JTable tabla,String nombreArtista) {
    try {
        BufferedReader br = new BufferedReader(new FileReader(file_name + ".txt"));
        String line;
        List<String[]> Datos = new ArrayList<>(); // Implemento una lista 

        while ((line = br.readLine()) != null) {
            
            String[] temp = line.split(";");
            if (temp[3].equals(nombreArtista)) {
            String nombreProducto = temp[0]; // Nombre del producto
            String precio = temp[4]; // Precio
            String cantidad = temp[1] + " Unidades"; // Cantidad + " Unidades"
            String tipo = temp[2]; // Tipo
            // Crear un arreglo con los datos en el orden deseado
            String[]fila = {nombreProducto, precio, cantidad, tipo};
            Datos.add(fila); // Agrego los registros a la lista
        }
        }

        br.close();

        Collections.sort(Datos, new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    return o1[1].compareTo(o2[1]); // Compara por precio
                }
            });

        
        // Limpia la tabla
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);

        // Agrega los datos a la tabla con el formato deseado
        for (String[] rowData : Datos) {
            model.addRow(rowData);
        }
    } catch (IOException ex) {
        System.out.println("Error al leer el archivo: " + ex.getMessage());
    }
}


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PrincipalCL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PrincipalCL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PrincipalCL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PrincipalCL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new PrincipalCL(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAlCarritoBTN;
    private javax.swing.JButton BTN5sos;
    private javax.swing.JButton BTNartistas;
    private javax.swing.JButton BTNelproducto;
    private javax.swing.JButton BTNproductos;
    private javax.swing.JButton BTRbtn;
    private javax.swing.JButton BillieBTN;
    private javax.swing.JRadioButton BotonNo;
    private javax.swing.JRadioButton BotonPrecio;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton ConanBTN;
    private javax.swing.JButton HSbtn;
    private javax.swing.JLabel ImagenProducto;
    private javax.swing.JButton ImagineDragonsBTN;
    private javax.swing.JButton LousiBTN;
    private javax.swing.JButton SabrinaBTN;
    private javax.swing.JButton SkzBTN;
    private javax.swing.JTable TablaArtista;
    private javax.swing.JButton TaylorBTN;
    private javax.swing.JLabel TituloArtista;
    private javax.swing.JTextField UnidadesDelProducto;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcSeleccionProducto;
    private javax.swing.JLabel labelArtist;
    private javax.swing.JLabel labelD;
    private javax.swing.JLabel labelTipoProduct;
    private custom.PanelRound menu;
    private javax.swing.JPanel panelArtistas;
    private javax.swing.JPanel panelDELproducto;
    private custom.PanelRound panelRound1;
    private javax.swing.JPanel panelproductoss;
    private javax.swing.JButton txtBTN;
    // End of variables declaration//GEN-END:variables
}
