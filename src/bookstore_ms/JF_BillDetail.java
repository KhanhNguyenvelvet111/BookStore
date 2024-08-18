/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookstore_ms;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.image.ImageObserver;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.AttributedCharacterIterator;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author USER
 */
public class JF_BillDetail extends javax.swing.JFrame {

    /**
     * Creates new form JF_BillDetail
     */
    public JF_BillDetail() {
        JOptionPane.showMessageDialog(this, "You must to login to use!");
        new JF_Login().setVisible(true);
        this.dispose();
    }
    
    String ussername = "Undefined";
    int iduser = 0;
    public JF_BillDetail(int id){
        initComponents();
        DisplayBooks();
        
        conn = ConnectionFactory.getConnection();
        try {
            String query = "SELECT * FROM users WHERE UId =" + id;
            iduser = id;
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery(query);
            if(rs.next())
                ussername = rs.getString("UName");
            jLabel16.setText(ussername);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Unexpected Username");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Customers = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        billing = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        MailNameBD = new javax.swing.JTextField();
        AdressBD = new javax.swing.JTextField();
        CusNameBD = new javax.swing.JTextField();
        GenderBD = new javax.swing.JTextField();
        PhoneBD = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        CusIDBD = new javax.swing.JTextField();
        DisBD = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        TypeBD = new javax.swing.JTextField();
        Customers1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        BookIDBD = new javax.swing.JTextField();
        AuthorBD = new javax.swing.JTextField();
        CateBD = new javax.swing.JTextField();
        BookNameBD = new javax.swing.JTextField();
        PubBD = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        billdetailsTable = new javax.swing.JTable();
        totalPaymentBD = new javax.swing.JLabel();
        subTotalBD = new javax.swing.JLabel();
        discountBD1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        BIdBD = new javax.swing.JTextField();
        BTimeBD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        returnBtn = new javax.swing.JButton();
        logoutBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));
        jPanel1.setForeground(new java.awt.Color(128, 128, 128));
        jPanel1.setPreferredSize(new java.awt.Dimension(1077, 603));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Customers.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Customers.setForeground(new java.awt.Color(32, 215, 195));
        Customers.setText("Customer Information");
        Customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomersMouseClicked(evt);
            }
        });
        jPanel1.add(Customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 124, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore_ms/Images/user.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 124, -1, -1));

        billing.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        billing.setForeground(new java.awt.Color(32, 215, 195));
        billing.setText("Bill List");
        billing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billingMouseClicked(evt);
            }
        });
        jPanel1.add(billing, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 74, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore_ms/Images/billing (1).png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 71, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(32, 215, 195));
        jLabel9.setText("Bill Detail");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 74, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore_ms/Images/list_1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 71, 32, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(32, 215, 195));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Book Store Software");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 290, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore_ms/Images/close-button.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore_ms/Images/info.png"))); // NOI18N
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel16.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(32, 215, 195));
        jLabel16.setText("Username");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 100, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1113, -1));

        jPanel2.setBackground(new java.awt.Color(32, 215, 195));
        jPanel2.setPreferredSize(new java.awt.Dimension(55, 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 109, 1113, -1));

        BillTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BillTable.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CusID", "Price", "Staff", "IsPaid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BillTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BillTable.setGridColor(new java.awt.Color(204, 204, 204));
        BillTable.setName(""); // NOI18N
        BillTable.setRequestFocusEnabled(false);
        BillTable.setRowHeight(30);
        BillTable.setSelectionBackground(new java.awt.Color(32, 215, 195));
        BillTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        BillTable.setShowGrid(true);
        BillTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(BillTable);
        if (BillTable.getColumnModel().getColumnCount() > 0) {
            BillTable.getColumnModel().getColumn(0).setResizable(false);
            BillTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            BillTable.getColumnModel().getColumn(1).setPreferredWidth(5);
            BillTable.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 124, -1, 411));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Gender:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Email:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Phone:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Name:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 20));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Adress:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        MailNameBD.setEditable(false);
        MailNameBD.setBackground(new java.awt.Color(255, 255, 255));
        MailNameBD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        MailNameBD.setAlignmentX(0.0F);
        MailNameBD.setAlignmentY(0.0F);
        MailNameBD.setBorder(null);
        MailNameBD.setFocusable(false);
        MailNameBD.setMargin(new java.awt.Insets(0, 0, 0, 0));
        MailNameBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MailNameBDActionPerformed(evt);
            }
        });
        jPanel3.add(MailNameBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 245, 20));

        AdressBD.setEditable(false);
        AdressBD.setBackground(new java.awt.Color(255, 255, 255));
        AdressBD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AdressBD.setAlignmentX(0.0F);
        AdressBD.setAlignmentY(0.0F);
        AdressBD.setBorder(null);
        AdressBD.setFocusable(false);
        AdressBD.setMargin(new java.awt.Insets(0, 0, 0, 0));
        AdressBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdressBDActionPerformed(evt);
            }
        });
        jPanel3.add(AdressBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 236, 20));

        CusNameBD.setEditable(false);
        CusNameBD.setBackground(new java.awt.Color(255, 255, 255));
        CusNameBD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CusNameBD.setAlignmentX(0.0F);
        CusNameBD.setAlignmentY(0.0F);
        CusNameBD.setBorder(null);
        CusNameBD.setFocusable(false);
        CusNameBD.setMargin(new java.awt.Insets(0, 0, 0, 0));
        CusNameBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CusNameBDActionPerformed(evt);
            }
        });
        jPanel3.add(CusNameBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 203, 20));

        GenderBD.setEditable(false);
        GenderBD.setBackground(new java.awt.Color(255, 255, 255));
        GenderBD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        GenderBD.setAlignmentX(0.0F);
        GenderBD.setAlignmentY(0.0F);
        GenderBD.setBorder(null);
        GenderBD.setFocusable(false);
        GenderBD.setMargin(new java.awt.Insets(0, 0, 0, 0));
        GenderBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderBDActionPerformed(evt);
            }
        });
        jPanel3.add(GenderBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 173, 20));

        PhoneBD.setEditable(false);
        PhoneBD.setBackground(new java.awt.Color(255, 255, 255));
        PhoneBD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PhoneBD.setAlignmentX(0.0F);
        PhoneBD.setAlignmentY(0.0F);
        PhoneBD.setBorder(null);
        PhoneBD.setFocusable(false);
        PhoneBD.setMargin(new java.awt.Insets(0, 0, 0, 0));
        PhoneBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneBDActionPerformed(evt);
            }
        });
        jPanel3.add(PhoneBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 192, 20));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("CusID:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        CusIDBD.setEditable(false);
        CusIDBD.setBackground(new java.awt.Color(255, 255, 255));
        CusIDBD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CusIDBD.setAlignmentX(0.0F);
        CusIDBD.setAlignmentY(0.0F);
        CusIDBD.setBorder(null);
        CusIDBD.setFocusable(false);
        CusIDBD.setMargin(new java.awt.Insets(0, 0, 0, 0));
        CusIDBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CusIDBDActionPerformed(evt);
            }
        });
        jPanel3.add(CusIDBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 50, 20));

        DisBD.setEditable(false);
        DisBD.setBackground(new java.awt.Color(255, 255, 255));
        DisBD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DisBD.setForeground(new java.awt.Color(255, 255, 255));
        DisBD.setAlignmentX(0.0F);
        DisBD.setAlignmentY(0.0F);
        DisBD.setBorder(null);
        DisBD.setFocusable(false);
        DisBD.setMargin(new java.awt.Insets(0, 0, 0, 0));
        DisBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisBDActionPerformed(evt);
            }
        });
        jPanel3.add(DisBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, 20));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("TypeID:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        TypeBD.setEditable(false);
        TypeBD.setBackground(new java.awt.Color(255, 255, 255));
        TypeBD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TypeBD.setAlignmentX(0.0F);
        TypeBD.setAlignmentY(0.0F);
        TypeBD.setBorder(null);
        TypeBD.setFocusable(false);
        TypeBD.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TypeBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeBDActionPerformed(evt);
            }
        });
        jPanel3.add(TypeBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 30, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 162, 320, 170));

        Customers1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Customers1.setForeground(new java.awt.Color(32, 215, 195));
        Customers1.setText("Book Information");
        Customers1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Customers1MouseClicked(evt);
            }
        });
        jPanel1.add(Customers1, new org.netbeans.lib.awtextra.AbsoluteConstraints(823, 124, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore_ms/Images/book.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 124, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel26.setText("Book ID:");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel27.setText("Pulisher:");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel28.setText("Author:");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setText("Title:");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel31.setText("Category:");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        BookIDBD.setEditable(false);
        BookIDBD.setBackground(new java.awt.Color(255, 255, 255));
        BookIDBD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BookIDBD.setBorder(null);
        BookIDBD.setFocusable(false);
        BookIDBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookIDBDActionPerformed(evt);
            }
        });
        jPanel5.add(BookIDBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 187, 20));

        AuthorBD.setEditable(false);
        AuthorBD.setBackground(new java.awt.Color(255, 255, 255));
        AuthorBD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AuthorBD.setBorder(null);
        AuthorBD.setFocusable(false);
        AuthorBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorBDActionPerformed(evt);
            }
        });
        jPanel5.add(AuthorBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 213, 20));

        CateBD.setEditable(false);
        CateBD.setBackground(new java.awt.Color(255, 255, 255));
        CateBD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CateBD.setBorder(null);
        CateBD.setFocusable(false);
        CateBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CateBDActionPerformed(evt);
            }
        });
        jPanel5.add(CateBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 200, 20));

        BookNameBD.setEditable(false);
        BookNameBD.setBackground(new java.awt.Color(255, 255, 255));
        BookNameBD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BookNameBD.setBorder(null);
        BookNameBD.setFocusable(false);
        BookNameBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookNameBDActionPerformed(evt);
            }
        });
        jPanel5.add(BookNameBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 210, 20));

        PubBD.setEditable(false);
        PubBD.setBackground(new java.awt.Color(255, 255, 255));
        PubBD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PubBD.setBorder(null);
        PubBD.setFocusable(false);
        PubBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PubBDActionPerformed(evt);
            }
        });
        jPanel5.add(PubBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 240, 23));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 162, 320, 170));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel2.setText("Subtotal: $");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel32.setText("Discount: - $");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Total Payment: $");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        billdetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Book ID", "Book Name", "Quantity", "Price", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        billdetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billdetailsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(billdetailsTable);
        if (billdetailsTable.getColumnModel().getColumnCount() > 0) {
            billdetailsTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            billdetailsTable.getColumnModel().getColumn(1).setPreferredWidth(5);
            billdetailsTable.getColumnModel().getColumn(3).setPreferredWidth(5);
        }

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 420, 147));

        totalPaymentBD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        totalPaymentBD.setText("xxxxx");
        jPanel6.add(totalPaymentBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        subTotalBD.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        subTotalBD.setText("xxxx");
        jPanel6.add(subTotalBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        discountBD1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        discountBD1.setText("xxxx");
        jPanel6.add(discountBD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 386, 640, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel29.setText("Details");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 330, 100, -1));

        BIdBD.setBackground(new java.awt.Color(229, 229, 229));
        BIdBD.setBorder(null);
        BIdBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIdBDActionPerformed(evt);
            }
        });
        jPanel1.add(BIdBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 160, -1));

        BTimeBD.setBackground(new java.awt.Color(229, 229, 229));
        BTimeBD.setBorder(null);
        jPanel1.add(BTimeBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 360, 140, -1));

        jLabel4.setText("ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 20, 20));

        jLabel5.setText("Time:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, -1, 20));

        returnBtn.setBackground(new java.awt.Color(229, 229, 229));
        returnBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        returnBtn.setForeground(new java.awt.Color(32, 215, 195));
        returnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore_ms/Images/return.png"))); // NOI18N
        returnBtn.setText("Return");
        returnBtn.setToolTipText("");
        returnBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnBtnMouseClicked(evt);
            }
        });
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        jPanel1.add(returnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 110, 40));

        logoutBtn1.setBackground(new java.awt.Color(229, 229, 229));
        logoutBtn1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        logoutBtn1.setForeground(new java.awt.Color(32, 215, 195));
        logoutBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore_ms/Images/power.png"))); // NOI18N
        logoutBtn1.setText("Logout");
        logoutBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtn1MouseClicked(evt);
            }
        });
        logoutBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(logoutBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 550, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1113, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomersMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_CustomersMouseClicked

    private void billingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_billingMouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel23MouseClicked
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    int st; //status

    private void BillTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
        int myIndex = BillTable.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) billdetailsTable.getModel();
        String billiD = model.getValueAt(myIndex, 0).toString();
        //get table orrders details
        String query = "select orderdetails.BookId, books.Title, orderdetails.BQuantity, books.Price, orderdetails.Subtotal from orderdetails, books where orderdetails.BookId = books.BId AND orderdetails.BillId = " + billiD;

        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery(query);
            billdetailsTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(JF_BillDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //get table customer
        String query2 = "select customers.CId,CName,customers.CEmail,customers.CAddress,customers.Gender,customers.CPhone,typecustomers.TypeCId, Discount from customers,orders,typecustomers where orders.CusId = customers.CId and customers.TypeCus = typecustomers.TypeCId and orders.BillId ="  + billiD;
        try {
            ps = conn.prepareStatement(query2);
            rs = ps.executeQuery(query2);
            if (rs.next()) {
                CusIDBD.setText(rs.getString("CId"));
                CusNameBD.setText(rs.getString("CName"));
                MailNameBD.setText(rs.getString("CEmail"));
                AdressBD.setText(rs.getString("CAddress"));
                GenderBD.setText(rs.getString("Gender"));
                PhoneBD.setText(rs.getString("CPhone"));
                TypeBD.setText(rs.getString("TypeCId"));
                DisBD.setText(rs.getString("Discount"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(JF_BillDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //get price
        Payment();
        //get id, time
        
        String query3 = "select BillId,DateCreate from orders where BillId="+ billiD;
        try {
            ps = conn.prepareStatement(query3);
            rs = ps.executeQuery(query3);
            if (rs.next()) {
                BIdBD.setText(rs.getString("BillId"));
                BTimeBD.setText(rs.getString("DateCreate"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(JF_BillDetail.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BillTableMouseClicked
    
    private void Customers1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Customers1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Customers1MouseClicked

    private void PhoneBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneBDActionPerformed

    private void GenderBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderBDActionPerformed

    private void CusNameBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CusNameBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CusNameBDActionPerformed

    private void AdressBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdressBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdressBDActionPerformed

    private void MailNameBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MailNameBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MailNameBDActionPerformed

    private void PubBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PubBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PubBDActionPerformed

    private void BookNameBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookNameBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookNameBDActionPerformed

    private void CateBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CateBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CateBDActionPerformed

    private void AuthorBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthorBDActionPerformed

    private void BookIDBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookIDBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookIDBDActionPerformed

    private void billdetailsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billdetailsTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) billdetailsTable.getModel();
        int myIndex = billdetailsTable.getSelectedRow();
        String bId = model.getValueAt(myIndex, 0).toString();

        String query = "SELECT BId , Title,Author,Category,Publisher FROM books WHERE BId =" + bId;
        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery(query);
          if(rs.next()){
                BookIDBD.setText(rs.getString("BId"));
                BookNameBD.setText(rs.getString("Title"));
                AuthorBD.setText(rs.getString("Author"));
                CateBD.setText(rs.getString("Category"));
                PubBD.setText(rs.getString("Publisher"));
          }
//                BookIDBD.setText(model.getValueAt(myIndex, 0).toString());
//                BookNameBD.setText(model.getValueAt(myIndex, 1).toString());
//                AuthorBD.setText(model.getValueAt(myIndex, 2).toString());
//                CateBD.setText(model.getValueAt(myIndex, 3).toString());
//                PubBD.setText(model.getValueAt(myIndex, 4).toString());

            

        } catch (SQLException ex) {
            Logger.getLogger(JF_BillDetail.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_billdetailsTableMouseClicked

    private void BIdBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIdBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BIdBDActionPerformed

    private void CusIDBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CusIDBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CusIDBDActionPerformed

    private void DisBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisBDActionPerformed

    private void TypeBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeBDActionPerformed

    private void returnBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnBtnMouseClicked
        // TODO add your handling code here:
        new JF_Billing(iduser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnBtnMouseClicked

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnBtnActionPerformed

    private void logoutBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtn1MouseClicked
        // TODO add your handling code here:
        new JF_Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtn1MouseClicked

    private void logoutBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtn1ActionPerformed
    private float subtotal = 0;
    private float totalpay = 0;
    private void Payment(){
        subtotal = 0;
        //
        //settext payment
        //get discount
        DefaultTableModel dtm = (DefaultTableModel)billdetailsTable.getModel();
        if(dtm.getRowCount() != 0){
            String getdisc = DisBD.getText().toString().trim();
            int disc = Integer.parseInt(getdisc);
            for(int l = 0; l< dtm.getRowCount(); l++){
                Float getttPrice = Float.parseFloat(dtm.getValueAt(l, 4).toString());
                subtotal += getttPrice;
            }
            subTotalBD.setText(Float.toString(subtotal));
            float d = (float)disc /100;
            float d2 = subtotal * d;
            discountBD1.setText(Float.toString(d2));
            totalpay = subtotal - d2;
            totalPaymentBD.setText(Float.toString(totalpay));
        }
    }
    private void DisplayBooks() {
        conn = ConnectionFactory.getConnection();
        try {
            String query = "select BillId, CusId, UId, TotalPrice, IsPaid from orders";

            ps = conn.prepareStatement(query);
            rs = ps.executeQuery(query);
            BillTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Unexpected DisplayBooks");
        }

    }
    
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JF_BillDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_BillDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_BillDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_BillDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame jF = new JF_BillDetail();
                jF.setVisible(true);
                jF.setTitle("Bill Details");
                jF.setResizable(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdressBD;
    private javax.swing.JTextField AuthorBD;
    private javax.swing.JTextField BIdBD;
    private javax.swing.JTextField BTimeBD;
    private javax.swing.JTable BillTable;
    private javax.swing.JTextField BookIDBD;
    private javax.swing.JTextField BookNameBD;
    private javax.swing.JTextField CateBD;
    private javax.swing.JTextField CusIDBD;
    private javax.swing.JTextField CusNameBD;
    private javax.swing.JLabel Customers;
    private javax.swing.JLabel Customers1;
    private javax.swing.JTextField DisBD;
    private javax.swing.JTextField GenderBD;
    private javax.swing.JTextField MailNameBD;
    private javax.swing.JTextField PhoneBD;
    private javax.swing.JTextField PubBD;
    private javax.swing.JTextField TypeBD;
    private javax.swing.JTable billdetailsTable;
    private javax.swing.JLabel billing;
    private javax.swing.JLabel discountBD1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logoutBtn1;
    private javax.swing.JButton returnBtn;
    private javax.swing.JLabel subTotalBD;
    private javax.swing.JLabel totalPaymentBD;
    // End of variables declaration//GEN-END:variables
}
