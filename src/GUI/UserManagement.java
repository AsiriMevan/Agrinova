/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DatabaseLayer.DB_connection;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vishmi
 */
public class UserManagement extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    boolean a = true;
    String currentUserId;

    public UserManagement() {
        initComponents();
        txtUserID.setText(generateUSRNumber());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        logOutPanel = new javax.swing.JPanel();
        lblLogOutPanel = new javax.swing.JLabel();
        lblSideBarLogo = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblProduct = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        lblIssues = new javax.swing.JLabel();
        lblReturn = new javax.swing.JLabel();
        menuMinClose = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        btnMin = new javax.swing.JPanel();
        lblMin = new javax.swing.JLabel();
        lblTopPanel = new javax.swing.JPanel();
        lblInsertUserTopBar = new javax.swing.JLabel();
        lblEditUserTopBar = new javax.swing.JLabel();
        lblTopic = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUserAdd = new javax.swing.JTable();
        btnAddToTable = new javax.swing.JLabel();
        btnAddUser = new javax.swing.JLabel();
        lblConPassword = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        lblRole = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtUserID = new javax.swing.JTextField();
        txtRole = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtConPassword = new javax.swing.JTextField();
        lblNIC = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblUserID = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblContactNo = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(186, 238, 180));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(8, 102, 1));

        logOutPanel.setBackground(new java.awt.Color(8, 102, 1));

        lblLogOutPanel.setBackground(new java.awt.Color(186, 238, 180));
        lblLogOutPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogOutPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        lblLogOutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogOutPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogOutPanelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout logOutPanelLayout = new javax.swing.GroupLayout(logOutPanel);
        logOutPanel.setLayout(logOutPanelLayout);
        logOutPanelLayout.setHorizontalGroup(
            logOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, Short.MAX_VALUE)
        );
        logOutPanelLayout.setVerticalGroup(
            logOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE)
        );

        lblSideBarLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSideBarLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/otherSideBarLogo.png"))); // NOI18N

        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/btnHome.png"))); // NOI18N
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });

        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/btnUser.png"))); // NOI18N

        lblProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/btnProduct.png"))); // NOI18N
        lblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProductMouseClicked(evt);
            }
        });

        lblStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/btnStock.png"))); // NOI18N

        lblIssues.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIssues.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/btnIssues.png"))); // NOI18N

        lblReturn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/btnReturns.png"))); // NOI18N

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIssues, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addComponent(lblSideBarLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSideBarLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHome)
                .addGap(24, 24, 24)
                .addComponent(lblUser)
                .addGap(24, 24, 24)
                .addComponent(lblProduct)
                .addGap(24, 24, 24)
                .addComponent(lblStock)
                .addGap(24, 24, 24)
                .addComponent(lblIssues)
                .addGap(24, 24, 24)
                .addComponent(lblReturn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(logOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 730));

        menuMinClose.setBackground(new java.awt.Color(186, 238, 180));
        menuMinClose.setPreferredSize(new java.awt.Dimension(80, 40));

        btnClose.setBackground(new java.awt.Color(186, 238, 180));

        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/close_icon.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClose)
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClose)
        );

        btnMin.setBackground(new java.awt.Color(186, 238, 180));

        lblMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/minimize_icon.png"))); // NOI18N
        lblMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnMinLayout = new javax.swing.GroupLayout(btnMin);
        btnMin.setLayout(btnMinLayout);
        btnMinLayout.setHorizontalGroup(
            btnMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMin)
        );
        btnMinLayout.setVerticalGroup(
            btnMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMin)
        );

        javax.swing.GroupLayout menuMinCloseLayout = new javax.swing.GroupLayout(menuMinClose);
        menuMinClose.setLayout(menuMinCloseLayout);
        menuMinCloseLayout.setHorizontalGroup(
            menuMinCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuMinCloseLayout.createSequentialGroup()
                .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menuMinCloseLayout.setVerticalGroup(
            menuMinCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        mainPanel.add(menuMinClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, -1));

        lblTopPanel.setBackground(new java.awt.Color(37, 135, 26));

        lblInsertUserTopBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInsertUserTopBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/insertUserTopBar.png"))); // NOI18N

        lblEditUserTopBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditUserTopBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/editUserTopBar.png"))); // NOI18N
        lblEditUserTopBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditUserTopBarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout lblTopPanelLayout = new javax.swing.GroupLayout(lblTopPanel);
        lblTopPanel.setLayout(lblTopPanelLayout);
        lblTopPanelLayout.setHorizontalGroup(
            lblTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblTopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInsertUserTopBar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEditUserTopBar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(448, Short.MAX_VALUE))
        );
        lblTopPanelLayout.setVerticalGroup(
            lblTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblTopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEditUserTopBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInsertUserTopBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        mainPanel.add(lblTopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 820, 60));

        lblTopic.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblTopic.setForeground(new java.awt.Color(0, 0, 0));
        lblTopic.setText("User Management");
        mainPanel.add(lblTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 280, 40));

        jPanel1.setBackground(new java.awt.Color(186, 238, 180));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableUserAdd.setAutoCreateRowSorter(true);
        jTableUserAdd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTableUserAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTableUserAdd.setForeground(new java.awt.Color(0, 0, 0));
        jTableUserAdd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "User Name", "Email", "NIC", "Password", "Con. Password", "Contact No", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableUserAdd.setToolTipText("");
        jTableUserAdd.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableUserAdd.setGridColor(new java.awt.Color(102, 102, 102));
        jTableUserAdd.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTableUserAdd.setSelectionForeground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(jTableUserAdd);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 798, 280));

        btnAddToTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddToTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/addToTable.png"))); // NOI18N
        btnAddToTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddToTableMouseClicked(evt);
            }
        });
        jPanel1.add(btnAddToTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 527, 240, 60));

        btnAddUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/addUser.png"))); // NOI18N
        btnAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddUserMouseClicked(evt);
            }
        });
        jPanel1.add(btnAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 527, -1, 60));

        lblConPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblConPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblConPassword.setText("Con. Password :");
        jPanel1.add(lblConPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 107, 150, 50));

        lblUserName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 0, 0));
        lblUserName.setText("User Name :");
        jPanel1.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 57, 120, 50));

        txtNIC.setBackground(new java.awt.Color(204, 204, 204));
        txtNIC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNIC.setForeground(new java.awt.Color(0, 0, 0));
        txtNIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 17, 180, 30));

        lblRole.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblRole.setForeground(new java.awt.Color(0, 0, 0));
        lblRole.setText("Role :");
        jPanel1.add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 157, 120, 50));

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 117, 260, 30));

        txtUserID.setBackground(new java.awt.Color(204, 204, 204));
        txtUserID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtUserID.setForeground(new java.awt.Color(0, 0, 0));
        txtUserID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 17, 180, 30));

        txtRole.setBackground(new java.awt.Color(204, 204, 204));
        txtRole.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtRole.setForeground(new java.awt.Color(0, 0, 0));
        txtRole.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 260, 30));

        txtUserName.setBackground(new java.awt.Color(204, 204, 204));
        txtUserName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(0, 0, 0));
        txtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 67, 180, 30));

        txtConPassword.setBackground(new java.awt.Color(204, 204, 204));
        txtConPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtConPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtConPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtConPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 117, 180, 30));

        lblNIC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNIC.setForeground(new java.awt.Color(0, 0, 0));
        lblNIC.setText("NIC Number :");
        jPanel1.add(lblNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 7, 140, 50));

        lblPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword.setText("Password :");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 57, 140, 50));

        lblEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("Email :");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 107, 120, 50));

        lblUserID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUserID.setForeground(new java.awt.Color(0, 0, 0));
        lblUserID.setText("User ID :");
        jPanel1.add(lblUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, 120, 50));

        txtPassword.setBackground(new java.awt.Color(204, 204, 204));
        txtPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 67, 180, 30));

        lblContactNo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblContactNo.setForeground(new java.awt.Color(0, 0, 0));
        lblContactNo.setText("Contact No :");
        jPanel1.add(lblContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 140, 50));

        txtContactNo.setBackground(new java.awt.Color(204, 204, 204));
        txtContactNo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtContactNo.setForeground(new java.awt.Color(0, 0, 0));
        txtContactNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactNoKeyReleased(evt);
            }
        });
        jPanel1.add(txtContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 180, 30));

        mainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseExited
        changecolor(btnMin, new Color(186, 238, 180));
    }//GEN-LAST:event_lblMinMouseExited

    private void lblMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseEntered
        changecolor(btnMin, new Color(207, 211, 207));
    }//GEN-LAST:event_lblMinMouseEntered

    private void lblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseClicked
        try {
            this.setState(ICONIFIED);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_lblMinMouseClicked

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        changecolor(btnClose, new Color(186, 238, 180));
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        changecolor(btnClose, new Color(207, 211, 207));
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblLogOutPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutPanelMouseEntered
        changecolor(logOutPanel, new Color(186, 238, 180));
    }//GEN-LAST:event_lblLogOutPanelMouseEntered

    private void lblLogOutPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutPanelMouseExited
        changecolor(logOutPanel, new Color(8, 102, 1));
    }//GEN-LAST:event_lblLogOutPanelMouseExited

    private void lblLogOutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutPanelMouseClicked
        //logout button 
        int pop = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout", pop);
        if (result == 0) {
            Login frame = new Login();
            frame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lblLogOutPanelMouseClicked

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        Home frame = new Home();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductMouseClicked

    }//GEN-LAST:event_lblProductMouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void lblEditUserTopBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditUserTopBarMouseClicked
        UserManagementSearch frame = new UserManagementSearch();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblEditUserTopBarMouseClicked

    private void btnAddToTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToTableMouseClicked
        if (txtUserID != null && !txtUserName.getText().equals("") && !txtEmail.getText().equals("") && !txtNIC.getText().equals("") && !txtPassword.getText().equals("") && !txtConPassword.getText().equals("") && !txtContactNo.getText().equals("") && !txtRole.getText().equals("")) {
            DefaultTableModel dtm = (DefaultTableModel) jTableUserAdd.getModel();
            //dtm.getDataVector().removeAllElements();

            Vector v = new Vector();
            v.add(txtUserID.getText());
            v.add(txtUserName.getText());
            v.add(txtEmail.getText());
            v.add(txtNIC.getText());
            v.add(txtPassword.getText());
            v.add(txtConPassword.getText());
            v.add(txtContactNo.getText());
            v.add(txtRole.getText());
            dtm.addRow(v);
            clearAll();

        } else {
            JOptionPane.showMessageDialog(this, "Please Fill all the Feilds.");
        }
    }//GEN-LAST:event_btnAddToTableMouseClicked

    private void btnAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUserMouseClicked

        if ((txtUserName == null && txtEmail == null && txtNIC == null && txtPassword == null && txtConPassword == null && txtContactNo == null && txtRole == null) || (txtUserName.getText().equals("") && txtEmail.getText().equals("") && txtNIC.getText().equals("") && txtPassword.getText().equals("") && txtConPassword.getText().equals("") && txtContactNo.getText().equals("") && txtRole.getText().equals(""))) {
            try {
                int count = jTableUserAdd.getRowCount();
                for (int i = 0; i < count; i++) {
                    DB_connection.iud("INSERT INTO user (userId, userName, email, nicNumber, password, conPassword, contatcNo, role) VALUES ('" + jTableUserAdd.getValueAt(i, 0) + "','" + jTableUserAdd.getValueAt(i, 1) + "','" + jTableUserAdd.getValueAt(i, 2) + "','" + jTableUserAdd.getValueAt(i, 3) + "','" + jTableUserAdd.getValueAt(i, 4) + "','" + jTableUserAdd.getValueAt(i, 5) + "','" + jTableUserAdd.getValueAt(i, 6) + "','" + jTableUserAdd.getValueAt(i, 7) + "')");
                }
                JOptionPane.showMessageDialog(this, "User Added Successfully.");

                clearAll();
                txtUserID.setText(generateUSRNumber());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else
        {
             JOptionPane.showMessageDialog(this, "⚠ Clear User details or Add those user details to the table first."); 
        }

    }//GEN-LAST:event_btnAddUserMouseClicked

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if (txtEmail.getText().matches(regex)) {
            txtEmail.setBackground(new Color(204,204,204));
        } else {
            txtEmail.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtContactNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNoKeyReleased
        if (txtContactNo.getText().length()==10) {
            txtContactNo.setBackground(new Color(204,204,204));
        } else {
            txtContactNo.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtContactNoKeyReleased

    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
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
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddToTable;
    private javax.swing.JLabel btnAddUser;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUserAdd;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblConPassword;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblEditUserTopBar;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblInsertUserTopBar;
    private javax.swing.JLabel lblIssues;
    private javax.swing.JLabel lblLogOutPanel;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblNIC;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblReturn;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSideBarLogo;
    private javax.swing.JLabel lblStock;
    private javax.swing.JPanel lblTopPanel;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel logOutPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuMinClose;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTextField txtConPassword;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtUserID;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    //Auto generate USR number
    private String generateUSRNumber() {
        String id = "";
        try {

            ResultSet rs = DB_connection.searchWithBackword("select * from user");
            if (!rs.next()) {
                id = "USR1000";
            } else {
                rs.last();
                //int i = rs.
                String dbid = rs.getString("userId");
                String gg = dbid.split("R")[1];
                int i = (Integer.parseInt(gg)) + 1;
                id = "USR" + i;
            }

            System.out.println(id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    private void clearAll() {
        txtUserName.setText("");
        txtEmail.setText("");
        txtNIC.setText("");
        txtPassword.setText("");
        txtConPassword.setText("");
        txtContactNo.setText("");
        txtRole.setText("");
        currentUserId = "";
    }

}