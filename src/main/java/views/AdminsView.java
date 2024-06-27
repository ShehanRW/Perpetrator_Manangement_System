package views;

import DataObjects.Admins;
import database_controllers.DatabaseConnection;
import java.awt.Color;
import javax.swing.JFrame;

public class AdminsView extends javax.swing.JFrame {
    
    Admins admins = DatabaseConnection.getDbConnection().getAdminDetails();

    public AdminsView() {
        initComponents();
        
         //Full Screen
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Color primaryColor = new Color(0,11,40);
        getContentPane().setBackground(primaryColor);
        
        displayAdminDetails();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back_btn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        adminName = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        adminType = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        updatePanel = new javax.swing.JPanel();
        update_btn = new javax.swing.JButton();
        userNameTextField = new javax.swing.JTextField();
        userNameTextField1 = new javax.swing.JTextField();
        userNameTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        input_panel = new javax.swing.JPanel();
        submit_btn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        input_username = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        input_name = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        input_password = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        input_position = new javax.swing.JTextField();
        input_role_combo = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        back_btn.setBackground(new java.awt.Color(0, 2, 69));
        back_btn.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        back_btn.setForeground(new java.awt.Color(119, 155, 255));
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 2, 69));
        jSeparator1.setForeground(new java.awt.Color(119, 155, 255));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(119, 155, 255));
        jLabel1.setText("Perpetraitor Database");
        jLabel1.setAlignmentX(0.5F);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(119, 155, 255));
        jLabel2.setText("Admin Panel");
        jLabel2.setAlignmentX(0.5F);

        jSeparator2.setBackground(new java.awt.Color(0, 2, 69));
        jSeparator2.setForeground(new java.awt.Color(119, 155, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(119, 155, 255));
        jLabel3.setText("Current user details");
        jLabel3.setAlignmentX(0.5F);

        jPanel1.setBackground(new java.awt.Color(0, 11, 40));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(119, 155, 255));
        jLabel4.setText("Name");
        jLabel4.setAlignmentX(0.5F);

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(119, 155, 255));
        jLabel5.setText("Position");
        jLabel5.setAlignmentX(0.5F);

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(119, 155, 255));
        jLabel6.setText("Type");
        jLabel6.setAlignmentX(0.5F);

        adminName.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        adminName.setForeground(new java.awt.Color(119, 155, 255));
        adminName.setText("-----");
        adminName.setAlignmentX(0.5F);

        position.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        position.setForeground(new java.awt.Color(119, 155, 255));
        position.setText("-----");
        position.setAlignmentX(0.5F);

        adminType.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        adminType.setForeground(new java.awt.Color(119, 155, 255));
        adminType.setText("-----");
        adminType.setAlignmentX(0.5F);

        username.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        username.setForeground(new java.awt.Color(119, 155, 255));
        username.setText("-----");
        username.setAlignmentX(0.5F);

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(119, 155, 255));
        jLabel7.setText("Username");
        jLabel7.setAlignmentX(0.5F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminName))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(username))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(position))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminType)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminName)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(position)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminType)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username)
                    .addComponent(jLabel7))
                .addGap(14, 14, 14))
        );

        updatePanel.setBackground(new java.awt.Color(0, 11, 40));
        updatePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(119, 155, 255), 2, true));

        update_btn.setBackground(new java.awt.Color(0, 2, 69));
        update_btn.setForeground(new java.awt.Color(119, 155, 255));
        update_btn.setText("Update your account");
        update_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        userNameTextField.setBackground(new java.awt.Color(0, 2, 69));
        userNameTextField.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        userNameTextField.setForeground(new java.awt.Color(119, 155, 255));
        userNameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        userNameTextField.setSelectionColor(new java.awt.Color(191, 37, 37));

        userNameTextField1.setBackground(new java.awt.Color(0, 2, 69));
        userNameTextField1.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        userNameTextField1.setForeground(new java.awt.Color(119, 155, 255));
        userNameTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        userNameTextField1.setSelectionColor(new java.awt.Color(191, 37, 37));

        userNameTextField2.setBackground(new java.awt.Color(0, 2, 69));
        userNameTextField2.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        userNameTextField2.setForeground(new java.awt.Color(119, 155, 255));
        userNameTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        userNameTextField2.setSelectionColor(new java.awt.Color(191, 37, 37));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(119, 155, 255));
        jLabel8.setText("Name");
        jLabel8.setAlignmentX(0.5F);

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(119, 155, 255));
        jLabel9.setText("Password");
        jLabel9.setAlignmentX(0.5F);

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(119, 155, 255));
        jLabel10.setText("Re Type Password");
        jLabel10.setAlignmentX(0.5F);

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userNameTextField)
                    .addComponent(userNameTextField1)
                    .addComponent(userNameTextField2)
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(update_btn)
                .addContainerGap())
        );

        input_panel.setBackground(new java.awt.Color(0, 11, 40));
        input_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(119, 155, 255), 2, true));

        submit_btn.setBackground(new java.awt.Color(0, 2, 69));
        submit_btn.setForeground(new java.awt.Color(119, 155, 255));
        submit_btn.setText("Submit");
        submit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(119, 155, 255));
        jLabel11.setText("Add new admin");
        jLabel11.setAlignmentX(0.5F);

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(119, 155, 255));
        jLabel12.setText("Username");
        jLabel12.setAlignmentX(0.5F);

        input_username.setBackground(new java.awt.Color(0, 2, 69));
        input_username.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        input_username.setForeground(new java.awt.Color(119, 155, 255));
        input_username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        input_username.setSelectionColor(new java.awt.Color(191, 37, 37));

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(119, 155, 255));
        jLabel13.setText("Name");
        jLabel13.setAlignmentX(0.5F);

        input_name.setBackground(new java.awt.Color(0, 2, 69));
        input_name.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        input_name.setForeground(new java.awt.Color(119, 155, 255));
        input_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        input_name.setSelectionColor(new java.awt.Color(191, 37, 37));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(119, 155, 255));
        jLabel14.setText("Password");
        jLabel14.setAlignmentX(0.5F);

        input_password.setBackground(new java.awt.Color(0, 2, 69));
        input_password.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        input_password.setForeground(new java.awt.Color(119, 155, 255));
        input_password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        input_password.setSelectionColor(new java.awt.Color(191, 37, 37));

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(119, 155, 255));
        jLabel15.setText("Position");
        jLabel15.setAlignmentX(0.5F);

        input_position.setBackground(new java.awt.Color(0, 2, 69));
        input_position.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        input_position.setForeground(new java.awt.Color(119, 155, 255));
        input_position.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        input_position.setSelectionColor(new java.awt.Color(191, 37, 37));

        input_role_combo.setBackground(new java.awt.Color(0, 11, 40));
        input_role_combo.setForeground(new java.awt.Color(119, 155, 255));
        input_role_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Main Admin", "Admin (Operations)", "Data Entry" }));

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(119, 155, 255));
        jLabel16.setText("Role");
        jLabel16.setAlignmentX(0.5F);

        javax.swing.GroupLayout input_panelLayout = new javax.swing.GroupLayout(input_panel);
        input_panel.setLayout(input_panelLayout);
        input_panelLayout.setHorizontalGroup(
            input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(input_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(input_panelLayout.createSequentialGroup()
                        .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(input_panelLayout.createSequentialGroup()
                                    .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(input_position, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(input_password, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(input_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(input_username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(input_panelLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(input_role_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        input_panelLayout.setVerticalGroup(
            input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, input_panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_role_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(submit_btn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(29, 29, 29)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1038, Short.MAX_VALUE)
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(input_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(input_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(jSeparator2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        
    }//GEN-LAST:event_update_btnActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submit_btnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminsView().setVisible(true);
            }
        });
    }
    
    public void displayAdminDetails(){
        // calling admins data object
        
        adminName.setText(admins.getAdminName());
        adminType.setText(admins.getAdminType());
        position.setText(admins.getPosition());
        username.setText(admins.getUsername());
    }
    
    public void addNewAdmin(){
        input_username.getText().toString();
        input_name.getText().toString();
        input_password.getText().toString();
        input_position.getText().toString();
        input_role_combo.getSelectedItem().toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminName;
    private javax.swing.JLabel adminType;
    private javax.swing.JButton back_btn;
    private javax.swing.JTextField input_name;
    private javax.swing.JPanel input_panel;
    private javax.swing.JTextField input_password;
    private javax.swing.JTextField input_position;
    private javax.swing.JComboBox<String> input_role_combo;
    private javax.swing.JTextField input_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel position;
    private javax.swing.JButton submit_btn;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JButton update_btn;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JTextField userNameTextField1;
    private javax.swing.JTextField userNameTextField2;
    public javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
