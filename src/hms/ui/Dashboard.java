package hms.ui;

import hms.model.User;

public class Dashboard extends javax.swing.JFrame {

    private User currentUser;
    private javax.swing.Timer clockTimer;
    public Dashboard(User user) {
        this.currentUser = user;
        initComponents();
        buildMenuBar();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        postInit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospital Management System - Dashboard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        pnlTopBar = new javax.swing.JPanel();
        pnlTopBar.setBackground(new java.awt.Color(24, 96, 129));
        pnlTopBar.setPreferredSize(new java.awt.Dimension(1200, 55));
        pnlTopBar.setMinimumSize(new java.awt.Dimension(1200, 55));
        pnlTopBar.setMaximumSize(new java.awt.Dimension(1200, 55));
        javax.swing.GroupLayout pnlTopBarLayout = new javax.swing.GroupLayout(pnlTopBar);
        pnlTopBar.setLayout(pnlTopBarLayout);
        lblAppTitle = new javax.swing.JLabel();
        lblAppTitle.setText("HOSPITAL MANAGEMENT SYSTEM");
        lblAppTitle.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 18));
        lblAppTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblAppTitle.setPreferredSize(new java.awt.Dimension(500, 30));
        lblAppTitle.setMinimumSize(new java.awt.Dimension(500, 30));
        lblAppTitle.setMaximumSize(new java.awt.Dimension(500, 30));

        lblUserInfo = new javax.swing.JLabel();
        lblUserInfo.setText("");
        lblUserInfo.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 13));
        lblUserInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblUserInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserInfo.setPreferredSize(new java.awt.Dimension(530, 20));
        lblUserInfo.setMinimumSize(new java.awt.Dimension(530, 20));
        lblUserInfo.setMaximumSize(new java.awt.Dimension(530, 20));

        lblClock = new javax.swing.JLabel();
        lblClock.setText("");
        lblClock.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 13));
        lblClock.setForeground(new java.awt.Color(210, 230, 240));
        lblClock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblClock.setPreferredSize(new java.awt.Dimension(530, 18));
        lblClock.setMinimumSize(new java.awt.Dimension(530, 18));
        lblClock.setMaximumSize(new java.awt.Dimension(530, 18));

        pnlTopBarLayout.setHorizontalGroup(
            pnlTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopBarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblAppTitle, 500, 500, 500)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(pnlTopBarLayout.createSequentialGroup()
                .addGap(650, 650, 650)
                .addComponent(lblUserInfo, 530, 530, 530)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(pnlTopBarLayout.createSequentialGroup()
                .addGap(650, 650, 650)
                .addComponent(lblClock, 530, 530, 530)
                .addContainerGap(0, Short.MAX_VALUE))
        );

        pnlTopBarLayout.setVerticalGroup(
            pnlTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopBarLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblAppTitle, 30, 30, 30)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(pnlTopBarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblUserInfo, 20, 20, 20)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(pnlTopBarLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblClock, 18, 18, 18)
                .addContainerGap(0, Short.MAX_VALUE))
        );


        pnlSidebar = new javax.swing.JPanel();
        pnlSidebar.setBackground(new java.awt.Color(33, 46, 58));
        pnlSidebar.setPreferredSize(new java.awt.Dimension(210, 745));
        pnlSidebar.setMinimumSize(new java.awt.Dimension(210, 745));
        pnlSidebar.setMaximumSize(new java.awt.Dimension(210, 745));
        javax.swing.GroupLayout pnlSidebarLayout = new javax.swing.GroupLayout(pnlSidebar);
        pnlSidebar.setLayout(pnlSidebarLayout);
        btnNavDashboard = new javax.swing.JButton();
        btnNavDashboard.setText("📊  Dashboard");
        btnNavDashboard.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 13));
        btnNavDashboard.setBackground(new java.awt.Color(33, 46, 58));
        btnNavDashboard.setContentAreaFilled(true);
        btnNavDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnNavDashboard.setFocusPainted(false);
        btnNavDashboard.setBorderPainted(false);
        btnNavDashboard.setOpaque(true);
        btnNavDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNavDashboard.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btnNavDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavDashboardActionPerformed(evt);
            }
        });
        btnNavDashboard.setPreferredSize(new java.awt.Dimension(210, 45));
        btnNavDashboard.setMinimumSize(new java.awt.Dimension(210, 45));
        btnNavDashboard.setMaximumSize(new java.awt.Dimension(210, 45));

        btnNavPatients = new javax.swing.JButton();
        btnNavPatients.setText("🩺  Patients");
        btnNavPatients.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 13));
        btnNavPatients.setBackground(new java.awt.Color(33, 46, 58));
        btnNavPatients.setContentAreaFilled(true);
        btnNavPatients.setForeground(new java.awt.Color(255, 255, 255));
        btnNavPatients.setFocusPainted(false);
        btnNavPatients.setBorderPainted(false);
        btnNavPatients.setOpaque(true);
        btnNavPatients.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNavPatients.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btnNavPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavPatientsActionPerformed(evt);
            }
        });
        btnNavPatients.setPreferredSize(new java.awt.Dimension(210, 45));
        btnNavPatients.setMinimumSize(new java.awt.Dimension(210, 45));
        btnNavPatients.setMaximumSize(new java.awt.Dimension(210, 45));

        btnNavDoctors = new javax.swing.JButton();
        btnNavDoctors.setText("🧑  Doctors");
        btnNavDoctors.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 13));
        btnNavDoctors.setBackground(new java.awt.Color(33, 46, 58));
        btnNavDoctors.setContentAreaFilled(true);
        btnNavDoctors.setForeground(new java.awt.Color(255, 255, 255));
        btnNavDoctors.setFocusPainted(false);
        btnNavDoctors.setBorderPainted(false);
        btnNavDoctors.setOpaque(true);
        btnNavDoctors.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNavDoctors.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btnNavDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavDoctorsActionPerformed(evt);
            }
        });
        btnNavDoctors.setPreferredSize(new java.awt.Dimension(210, 45));
        btnNavDoctors.setMinimumSize(new java.awt.Dimension(210, 45));
        btnNavDoctors.setMaximumSize(new java.awt.Dimension(210, 45));

        btnNavAppointments = new javax.swing.JButton();
        btnNavAppointments.setText("📅  Appointments");
        btnNavAppointments.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 13));
        btnNavAppointments.setBackground(new java.awt.Color(33, 46, 58));
        btnNavAppointments.setContentAreaFilled(true);
        btnNavAppointments.setForeground(new java.awt.Color(255, 255, 255));
        btnNavAppointments.setFocusPainted(false);
        btnNavAppointments.setBorderPainted(false);
        btnNavAppointments.setOpaque(true);
        btnNavAppointments.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNavAppointments.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btnNavAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavAppointmentsActionPerformed(evt);
            }
        });
        btnNavAppointments.setPreferredSize(new java.awt.Dimension(210, 45));
        btnNavAppointments.setMinimumSize(new java.awt.Dimension(210, 45));
        btnNavAppointments.setMaximumSize(new java.awt.Dimension(210, 45));

        btnNavWards = new javax.swing.JButton();
        btnNavWards.setText("🛏  Wards / Rooms");
        btnNavWards.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 13));
        btnNavWards.setBackground(new java.awt.Color(33, 46, 58));
        btnNavWards.setContentAreaFilled(true);
        btnNavWards.setForeground(new java.awt.Color(255, 255, 255));
        btnNavWards.setFocusPainted(false);
        btnNavWards.setBorderPainted(false);
        btnNavWards.setOpaque(true);
        btnNavWards.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNavWards.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btnNavWards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavWardsActionPerformed(evt);
            }
        });
        btnNavWards.setPreferredSize(new java.awt.Dimension(210, 45));
        btnNavWards.setMinimumSize(new java.awt.Dimension(210, 45));
        btnNavWards.setMaximumSize(new java.awt.Dimension(210, 45));

        btnNavBilling = new javax.swing.JButton();
        btnNavBilling.setText("💵  Billing");
        btnNavBilling.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 13));
        btnNavBilling.setBackground(new java.awt.Color(33, 46, 58));
        btnNavBilling.setContentAreaFilled(true);
        btnNavBilling.setForeground(new java.awt.Color(255, 255, 255));
        btnNavBilling.setFocusPainted(false);
        btnNavBilling.setBorderPainted(false);
        btnNavBilling.setOpaque(true);
        btnNavBilling.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNavBilling.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btnNavBilling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavBillingActionPerformed(evt);
            }
        });
        btnNavBilling.setPreferredSize(new java.awt.Dimension(210, 45));
        btnNavBilling.setMinimumSize(new java.awt.Dimension(210, 45));
        btnNavBilling.setMaximumSize(new java.awt.Dimension(210, 45));

        btnNavLogout = new javax.swing.JButton();
        btnNavLogout.setText("↩  Logout");
        btnNavLogout.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 13));
        btnNavLogout.setBackground(new java.awt.Color(33, 46, 58));
        btnNavLogout.setContentAreaFilled(true);
        btnNavLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnNavLogout.setFocusPainted(false);
        btnNavLogout.setBorderPainted(false);
        btnNavLogout.setOpaque(true);
        btnNavLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNavLogout.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btnNavLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavLogoutActionPerformed(evt);
            }
        });
        btnNavLogout.setPreferredSize(new java.awt.Dimension(210, 45));
        btnNavLogout.setMinimumSize(new java.awt.Dimension(210, 45));
        btnNavLogout.setMaximumSize(new java.awt.Dimension(210, 45));

        pnlSidebarLayout.setHorizontalGroup(
            pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnNavDashboard, 210, 210, 210)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnNavPatients, 210, 210, 210)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnNavDoctors, 210, 210, 210)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnNavAppointments, 210, 210, 210)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnNavWards, 210, 210, 210)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnNavBilling, 210, 210, 210)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnNavLogout, 210, 210, 210)
                .addContainerGap(0, Short.MAX_VALUE))
        );

        pnlSidebarLayout.setVerticalGroup(
            pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnNavDashboard, 45, 45, 45)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnNavPatients, 45, 45, 45)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btnNavDoctors, 45, 45, 45)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btnNavAppointments, 45, 45, 45)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(btnNavWards, 45, 45, 45)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(btnNavBilling, 45, 45, 45)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(btnNavLogout, 45, 45, 45)
                .addContainerGap(0, Short.MAX_VALUE))
        );


        desktop = new javax.swing.JDesktopPane();
        desktop.setBackground(new java.awt.Color(238, 242, 245));
        desktop.setPreferredSize(new java.awt.Dimension(990, 745));
        desktop.setMinimumSize(new java.awt.Dimension(990, 745));
        desktop.setMaximumSize(new java.awt.Dimension(990, 745));

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlTopBar, 1200, 1200, 1200)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlSidebar, 210, 210, 210)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(desktop, 990, 990, 990)
                .addContainerGap(0, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlTopBar, 55, 55, 55)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(pnlSidebar, 745, 745, 745)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(desktop, 745, 745, 745)
                .addContainerGap(0, Short.MAX_VALUE))
        );

        setSize(1200, 800);
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNavDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavDashboardActionPerformed
        openInternalFrame(new ReportsPanel(), "Dashboard Overview");
    }//GEN-LAST:event_btnNavDashboardActionPerformed

    private void btnNavPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavPatientsActionPerformed
        openInternalFrame(new PatientManagement(), "Patient Management");
    }//GEN-LAST:event_btnNavPatientsActionPerformed

    private void btnNavDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavDoctorsActionPerformed
        openInternalFrame(new DoctorManagement(), "Doctor Management");
    }//GEN-LAST:event_btnNavDoctorsActionPerformed

    private void btnNavAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavAppointmentsActionPerformed
        openInternalFrame(new AppointmentManagement(), "Appointment Management");
    }//GEN-LAST:event_btnNavAppointmentsActionPerformed

    private void btnNavWardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavWardsActionPerformed
        openInternalFrame(new WardManagement(), "Ward / Room Management");
    }//GEN-LAST:event_btnNavWardsActionPerformed

    private void btnNavBillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavBillingActionPerformed
        openInternalFrame(new BillingManagement(), "Billing");
    }//GEN-LAST:event_btnNavBillingActionPerformed

    private void btnNavLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavLogoutActionPerformed
        doLogout();
    }//GEN-LAST:event_btnNavLogoutActionPerformed

    private void buildMenuBar() {
        javax.swing.JMenuBar menuBar = new javax.swing.JMenuBar();

        javax.swing.JMenu menuFile = new javax.swing.JMenu("File");
        javax.swing.JMenuItem mnuLogout = new javax.swing.JMenuItem("Logout");
        mnuLogout.addActionListener(e -> doLogout());
        javax.swing.JMenuItem mnuExit = new javax.swing.JMenuItem("Exit");
        mnuExit.addActionListener(e -> System.exit(0));
        menuFile.add(mnuLogout);
        menuFile.addSeparator();
        menuFile.add(mnuExit);

        javax.swing.JMenu menuModules = new javax.swing.JMenu("Modules");
        javax.swing.JMenuItem mnuPatients = new javax.swing.JMenuItem("Patients");
        mnuPatients.addActionListener(e -> openInternalFrame(new PatientManagement(), "Patient Management"));
        javax.swing.JMenuItem mnuDoctors = new javax.swing.JMenuItem("Doctors");
        mnuDoctors.addActionListener(e -> openInternalFrame(new DoctorManagement(), "Doctor Management"));
        javax.swing.JMenuItem mnuAppointments = new javax.swing.JMenuItem("Appointments");
        mnuAppointments.addActionListener(e -> openInternalFrame(new AppointmentManagement(), "Appointment Management"));
        javax.swing.JMenuItem mnuWards = new javax.swing.JMenuItem("Wards");
        mnuWards.addActionListener(e -> openInternalFrame(new WardManagement(), "Ward / Room Management"));
        javax.swing.JMenuItem mnuBilling = new javax.swing.JMenuItem("Billing");
        mnuBilling.addActionListener(e -> openInternalFrame(new BillingManagement(), "Billing"));
        menuModules.add(mnuPatients);
        menuModules.add(mnuDoctors);
        menuModules.add(mnuAppointments);
        menuModules.add(mnuWards);
        menuModules.add(mnuBilling);

        javax.swing.JMenu menuHelp = new javax.swing.JMenu("Help");
        javax.swing.JMenuItem mnuAbout = new javax.swing.JMenuItem("About");
        mnuAbout.addActionListener(e -> javax.swing.JOptionPane.showMessageDialog(this,
                "Hospital Management System\nOOAD & Programming - Group Project\nBuilt with Java Swing + JDBC + MySQL",
                "About", javax.swing.JOptionPane.INFORMATION_MESSAGE));
        menuHelp.add(mnuAbout);

        menuBar.add(menuFile);
        menuBar.add(menuModules);
        menuBar.add(menuHelp);
        setJMenuBar(menuBar);
    }

    private void postInit() {
        lblUserInfo.setText("\uD83D\uDC64 " + currentUser.getFullName() + " (" + currentUser.getRole() + ")");
        updateClock();
        clockTimer = new javax.swing.Timer(1000, e -> updateClock());
        clockTimer.start();
        openInternalFrame(new ReportsPanel(), "Dashboard Overview");
    }

    private void updateClock() {
        lblClock.setText(new java.text.SimpleDateFormat("EEE, dd MMM yyyy  HH:mm:ss").format(new java.util.Date()));
    }

    private void doLogout() {
        if (clockTimer != null) clockTimer.stop();
        hms.util.DBConnection.closeConnection();
        dispose();
        new LoginForm().setVisible(true);
    }

    private void openInternalFrame(javax.swing.JPanel panel, String title) {
        for (javax.swing.JInternalFrame f : desktop.getAllFrames()) {
            if (f.getTitle().equals(title)) {
                try {
                    f.setSelected(true);
                } catch (Exception ignored) { }
                return;
            }
        }
        javax.swing.JInternalFrame frame = new javax.swing.JInternalFrame(title, true, true, true, true);
        frame.setSize(850, 620);
        frame.setLocation(20, 20);
        frame.add(panel);
        frame.setVisible(true);
        desktop.add(frame);
        try {
            frame.setSelected(true);
        } catch (Exception ignored) { }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNavAppointments;
    private javax.swing.JButton btnNavBilling;
    private javax.swing.JButton btnNavDashboard;
    private javax.swing.JButton btnNavDoctors;
    private javax.swing.JButton btnNavLogout;
    private javax.swing.JButton btnNavPatients;
    private javax.swing.JButton btnNavWards;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel lblAppTitle;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblUserInfo;
    private javax.swing.JPanel pnlSidebar;
    private javax.swing.JPanel pnlTopBar;
    // End of variables declaration//GEN-END:variables
}
