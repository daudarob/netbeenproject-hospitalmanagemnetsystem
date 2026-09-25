package hms.ui;



public class DoctorManagement extends javax.swing.JPanel {

    private String photoPath;
    private javax.swing.table.DefaultTableModel model;
    public DoctorManagement() {
        initComponents();
        postInit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPhoto = new javax.swing.JLabel();
        btnUploadPhoto = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblSpecialization = new javax.swing.JLabel();
        cmbSpecialization = new javax.swing.JComboBox();
        lblFee = new javax.swing.JLabel();
        txtFee = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        chkAvailable = new javax.swing.JCheckBox();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        scrollTable = new javax.swing.JScrollPane();
        tblDoctors = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(900, 560));

        lblPhoto.setBackground(new java.awt.Color(230, 230, 230));
        lblPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhoto.setOpaque(true);

        btnUploadPhoto.setText("Upload Photo");
        btnUploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadPhotoActionPerformed(evt);
            }
        });

        lblId.setText("Doctor ID:");

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        lblName.setText("Full Name:");

        lblSpecialization.setText("Specialization:");

        lblFee.setText("Consultation Fee ($):");

        lblPhone.setText("Phone:");

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        lblEmail.setText("Email:");

        chkAvailable.setSelected(true);
        chkAvailable.setText("Available for Appointments");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        scrollTable.setViewportView(tblDoctors);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblPhoto, 110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnUploadPhoto, 110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lblId, 100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(txtId, 150, 150, 150))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lblName, 100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(txtName, 300, 300, 300))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lblSpecialization, 100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(cmbSpecialization, 220, 220, 220))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lblFee, 130, 130, 130))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(txtFee, 100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lblPhone, 100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(txtPhone, 200, 200, 200))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lblEmail, 100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(txtEmail, 300, 300, 300))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(chkAvailable, 260, 260, 260))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnAdd, 90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnUpdate, 90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(btnDelete, 90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(btnClear, 90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(scrollTable, 830, 830, 830)))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblPhoto, 110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnUploadPhoto, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblId, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtId, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblName, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(txtName, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblSpecialization, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(cmbSpecialization, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lblFee, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(txtFee, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lblPhone, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(txtPhone, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(lblEmail, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(txtEmail, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(chkAvailable, 24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnAdd, 30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnUpdate, 30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnDelete, 30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnClear, 30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(scrollTable, 210, 210, 210)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadPhotoActionPerformed
        chooseImage();
    }//GEN-LAST:event_btnUploadPhotoActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addDoctor();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateDoctor();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteDoctor();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void postInit() {
        cmbSpecialization.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
                "General Practitioner", "Pediatrics", "Gynecology", "Surgery", "Cardiology",
                "Dermatology", "Psychiatry", "Orthopedics"
        }));
        lblPhoto.setIcon(hms.util.ImageUtils.placeholder(110, 110));

        tblDoctors.setModel(new javax.swing.table.DefaultTableModel(new Object[]{
                "ID", "Name", "Specialization", "Fee", "Phone", "Email", "Available"
        }, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        tblDoctors.setRowHeight(24);
        tblDoctors.getSelectionModel().addListSelectionListener(evt -> {
            if (!evt.getValueIsAdjusting() && tblDoctors.getSelectedRow() != -1) {
                populateFormFromRow(tblDoctors.getSelectedRow());
            }
        });
        model = (javax.swing.table.DefaultTableModel) tblDoctors.getModel();
        loadDoctors();
    }

    private void populateFormFromRow(int row) {
        txtId.setText(model.getValueAt(row, 0).toString());
        txtName.setText(model.getValueAt(row, 1).toString());
        cmbSpecialization.setSelectedItem(model.getValueAt(row, 2).toString());
        txtFee.setText(model.getValueAt(row, 3).toString());
        txtPhone.setText(model.getValueAt(row, 4).toString());
        txtEmail.setText(model.getValueAt(row, 5).toString());
        chkAvailable.setSelected("Yes".equals(model.getValueAt(row, 6).toString()));
    }

    private void chooseImage() {
        javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
        chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
                "Image files", "jpg", "jpeg", "png", "gif"));
        if (chooser.showOpenDialog(this) == javax.swing.JFileChooser.APPROVE_OPTION) {
            photoPath = chooser.getSelectedFile().getAbsolutePath();
            lblPhoto.setIcon(hms.util.ImageUtils.loadScaledImage(photoPath, 110, 110));
        }
    }

    private boolean validateForm() {
        if (txtName.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter the doctor's full name.");
            return false;
        }
        try {
            double fee = Double.parseDouble(txtFee.getText().trim());
            if (fee < 0) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid consultation fee.");
            return false;
        }
        return true;
    }

    private void addDoctor() {
        if (!validateForm()) return;
        String sql = "INSERT INTO doctors (full_name, specialization, phone, email, consultation_fee, is_available, photo_path) "
                + "VALUES (?,?,?,?,?,?,?)";
        try (java.sql.PreparedStatement ps = hms.util.DBConnection.getConnection().prepareStatement(sql)) {
            ps.setString(1, txtName.getText().trim());
            ps.setString(2, (String) cmbSpecialization.getSelectedItem());
            ps.setString(3, txtPhone.getText().trim());
            ps.setString(4, txtEmail.getText().trim());
            ps.setDouble(5, Double.parseDouble(txtFee.getText().trim()));
            ps.setBoolean(6, chkAvailable.isSelected());
            ps.setString(7, photoPath);
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Doctor added successfully.");
            clearForm();
            loadDoctors();
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error adding doctor: " + ex.getMessage());
        }
    }

    private void updateDoctor() {
        if (txtId.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Select a doctor from the table first.");
            return;
        }
        if (!validateForm()) return;
        String sql = "UPDATE doctors SET full_name=?, specialization=?, phone=?, email=?, "
                + "consultation_fee=?, is_available=? WHERE doctor_id=?";
        try (java.sql.PreparedStatement ps = hms.util.DBConnection.getConnection().prepareStatement(sql)) {
            ps.setString(1, txtName.getText().trim());
            ps.setString(2, (String) cmbSpecialization.getSelectedItem());
            ps.setString(3, txtPhone.getText().trim());
            ps.setString(4, txtEmail.getText().trim());
            ps.setDouble(5, Double.parseDouble(txtFee.getText().trim()));
            ps.setBoolean(6, chkAvailable.isSelected());
            ps.setInt(7, Integer.parseInt(txtId.getText().trim()));
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Doctor updated successfully.");
            clearForm();
            loadDoctors();
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error updating doctor: " + ex.getMessage());
        }
    }

    private void deleteDoctor() {
        if (txtId.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Select a doctor from the table first.");
            return;
        }
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
                "Delete this doctor record? This cannot be undone.",
                "Confirm delete", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirm != javax.swing.JOptionPane.YES_OPTION) return;

        String sql = "DELETE FROM doctors WHERE doctor_id=?";
        try (java.sql.PreparedStatement ps = hms.util.DBConnection.getConnection().prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(txtId.getText().trim()));
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Doctor deleted.");
            clearForm();
            loadDoctors();
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error deleting doctor: " + ex.getMessage());
        }
    }

    private void clearForm() {
        txtId.setText("");
        txtName.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtFee.setText("");
        cmbSpecialization.setSelectedIndex(0);
        chkAvailable.setSelected(true);
        photoPath = null;
        lblPhoto.setIcon(hms.util.ImageUtils.placeholder(110, 110));
        tblDoctors.clearSelection();
    }

    private void loadDoctors() {
        model.setRowCount(0);
        String sql = "SELECT doctor_id, full_name, specialization, consultation_fee, phone, email, is_available "
                + "FROM doctors ORDER BY doctor_id DESC";
        try (java.sql.Statement st = hms.util.DBConnection.getConnection().createStatement();
             java.sql.ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("doctor_id"),
                        rs.getString("full_name"),
                        rs.getString("specialization"),
                        rs.getDouble("consultation_fee"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getBoolean("is_available") ? "Yes" : "No"
                });
            }
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading doctors: " + ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUploadPhoto;
    private javax.swing.JCheckBox chkAvailable;
    private javax.swing.JComboBox cmbSpecialization;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFee;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSpecialization;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tblDoctors;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFee;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
