package hms.ui;



public class LoginForm extends javax.swing.JFrame {


    public LoginForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospital Management System - Login");
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        lblTitle = new javax.swing.JLabel();
        lblTitle.setText("⚕  HOSPITAL MANAGEMENT SYSTEM");
        lblTitle.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 18));
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setBackground(new java.awt.Color(24, 96, 129));
        lblTitle.setOpaque(true);
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setPreferredSize(new java.awt.Dimension(430, 70));
        lblTitle.setMinimumSize(new java.awt.Dimension(430, 70));
        lblTitle.setMaximumSize(new java.awt.Dimension(430, 70));

        lblSubtitle = new javax.swing.JLabel();
        lblSubtitle.setText("Please sign in to continue");
        lblSubtitle.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 13));
        lblSubtitle.setForeground(new java.awt.Color(90, 90, 90));
        lblSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitle.setPreferredSize(new java.awt.Dimension(430, 25));
        lblSubtitle.setMinimumSize(new java.awt.Dimension(430, 25));
        lblSubtitle.setMaximumSize(new java.awt.Dimension(430, 25));

        lblUsername = new javax.swing.JLabel();
        lblUsername.setText("Username");
        lblUsername.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12));
        lblUsername.setPreferredSize(new java.awt.Dimension(150, 20));
        lblUsername.setMinimumSize(new java.awt.Dimension(150, 20));
        lblUsername.setMaximumSize(new java.awt.Dimension(150, 20));

        txtUsername = new javax.swing.JTextField();
        txtUsername.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 13));
        txtUsername.setPreferredSize(new java.awt.Dimension(350, 30));
        txtUsername.setMinimumSize(new java.awt.Dimension(350, 30));
        txtUsername.setMaximumSize(new java.awt.Dimension(350, 30));

        lblPassword = new javax.swing.JLabel();
        lblPassword.setText("Password");
        lblPassword.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12));
        lblPassword.setPreferredSize(new java.awt.Dimension(150, 20));
        lblPassword.setMinimumSize(new java.awt.Dimension(150, 20));
        lblPassword.setMaximumSize(new java.awt.Dimension(150, 20));

        txtPassword = new javax.swing.JPasswordField();
        txtPassword.setEchoChar('\u2022');
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.setPreferredSize(new java.awt.Dimension(350, 30));
        txtPassword.setMinimumSize(new java.awt.Dimension(350, 30));
        txtPassword.setMaximumSize(new java.awt.Dimension(350, 30));

        chkShowPassword = new javax.swing.JCheckBox();
        chkShowPassword.setText("Show password");
        chkShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowPasswordActionPerformed(evt);
            }
        });
        chkShowPassword.setPreferredSize(new java.awt.Dimension(200, 22));
        chkShowPassword.setMinimumSize(new java.awt.Dimension(200, 22));
        chkShowPassword.setMaximumSize(new java.awt.Dimension(200, 22));

        btnLogin = new javax.swing.JButton();
        btnLogin.setText("LOGIN");
        btnLogin.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 14));
        btnLogin.setBackground(new java.awt.Color(24, 96, 129));
        btnLogin.setContentAreaFilled(true);
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setFocusPainted(false);
        btnLogin.setOpaque(true);
        btnLogin.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.setPreferredSize(new java.awt.Dimension(350, 40));
        btnLogin.setMinimumSize(new java.awt.Dimension(350, 40));
        btnLogin.setMaximumSize(new java.awt.Dimension(350, 40));

        lblHint = new javax.swing.JLabel();
        lblHint.setText("Default admin: admin / admin123");
        lblHint.setFont(new java.awt.Font("SansSerif", java.awt.Font.ITALIC, 11));
        lblHint.setForeground(new java.awt.Color(140, 140, 140));
        lblHint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHint.setPreferredSize(new java.awt.Dimension(350, 20));
        lblHint.setMinimumSize(new java.awt.Dimension(350, 20));
        lblHint.setMaximumSize(new java.awt.Dimension(350, 20));

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblTitle, 430, 430, 430)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblSubtitle, 430, 430, 430)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblUsername, 150, 150, 150)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtUsername, 350, 350, 350)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblPassword, 150, 150, 150)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtPassword, 350, 350, 350)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(chkShowPassword, 200, 200, 200)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnLogin, 350, 350, 350)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblHint, 350, 350, 350)
                .addContainerGap(0, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblTitle, 70, 70, 70)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblSubtitle, 25, 25, 25)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lblUsername, 20, 20, 20)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(txtUsername, 30, 30, 30)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(lblPassword, 20, 20, 20)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(txtPassword, 30, 30, 30)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(chkShowPassword, 22, 22, 22)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(btnLogin, 40, 40, 40)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(lblHint, 20, 20, 20)
                .addContainerGap(0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        doLogin();
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void chkShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowPasswordActionPerformed
        txtPassword.setEchoChar(chkShowPassword.isSelected() ? (char) 0 : '\u2022');
    }//GEN-LAST:event_chkShowPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        doLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void doLogin() {
        String username = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter both username and password.",
                    "Missing information", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        String sql = "SELECT user_id, username, full_name, role FROM users "
                + "WHERE username = ? AND password = ?";
        try {
            java.sql.Connection conn = hms.util.DBConnection.getConnection();
            if (conn == null) return;
            try (java.sql.PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, username);
                ps.setString(2, password);
                try (java.sql.ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        hms.model.User user = new hms.model.User(rs.getInt("user_id"), rs.getString("username"),
                                rs.getString("full_name"), rs.getString("role"));
                        javax.swing.JOptionPane.showMessageDialog(this,
                                "Welcome, " + user.getFullName() + "!",
                                "Login successful", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                        new Dashboard(user).setVisible(true);
                        dispose();
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(this, "Invalid username or password.",
                                "Login failed", javax.swing.JOptionPane.ERROR_MESSAGE);
                        txtPassword.setText("");
                    }
                }
            }
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Login error: " + ex.getMessage(),
                    "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox chkShowPassword;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
