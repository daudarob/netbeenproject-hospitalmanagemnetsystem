package hms.ui;



public class PatientManagement extends javax.swing.JPanel {

    private String photoPath;
    private javax.swing.table.DefaultTableModel model;
    public PatientManagement() {
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
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox();
        lblBloodGroup = new javax.swing.JLabel();
        cmbBloodGroup = new javax.swing.JComboBox();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        chkAdmitted = new javax.swing.JCheckBox();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        scrollTable = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();

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

        lblId.setText("Patient ID:");

        txtId.setEditable(false);

        lblName.setText("Full Name:");

        lblAge.setText("Age:");

        lblGender.setText("Gender:");

        lblBloodGroup.setText("Blood Group:");

        cmbBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBloodGroupActionPerformed(evt);
            }
        });

        lblPhone.setText("Phone:");

        lblAddress.setText("Address:");

        chkAdmitted.setText("Currently Admitted");

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

        lblSearch.setText("Search by name:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        scrollTable.setViewportView(tblPatients);

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
                        .addComponent(lblAge, 100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(txtAge, 100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lblGender, 100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(cmbGender, 150, 150, 150))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(lblBloodGroup, 100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(560, 560, 560)
                        .addComponent(cmbBloodGroup, 120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lblPhone, 100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(txtPhone, 200, 200, 200))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lblAddress, 100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(txtAddress, 400, 400, 400))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(chkAdmitted, 200, 200, 200))
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
                        .addComponent(lblSearch, 110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(txtSearch, 220, 220, 220))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(btnSearch, 90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(btnRefresh, 90, 90, 90))
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
                        .addComponent(lblAge, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(txtAge, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lblGender, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(cmbGender, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblBloodGroup, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(cmbBloodGroup, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lblPhone, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(txtPhone, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(lblAddress, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(txtAddress, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(chkAdmitted, 24, 24, 24))
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
                        .addComponent(lblSearch, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(txtSearch, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(btnSearch, 28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(btnRefresh, 28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(scrollTable, 180, 180, 180)))
                .addGap(0, 25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadPhotoActionPerformed
        chooseImage();
    }//GEN-LAST:event_btnUploadPhotoActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addPatient();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updatePatient();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deletePatient();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        loadPatients(txtSearch.getText().trim());
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        txtSearch.setText("");
        loadPatients(null);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void cmbBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBloodGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBloodGroupActionPerformed

    private void postInit() {
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Male", "Female", "Other"}));
        cmbBloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[]{"O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-"}));
        lblPhoto.setIcon(hms.util.ImageUtils.placeholder(110, 110));

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(new Object[]{
                "ID", "Name", "Age", "Gender", "Blood Group", "Phone", "Address", "Admitted"
        }, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        tblPatients.setRowHeight(24);
        tblPatients.getSelectionModel().addListSelectionListener(evt -> {
            if (!evt.getValueIsAdjusting() && tblPatients.getSelectedRow() != -1) {
                populateFormFromRow(tblPatients.getSelectedRow());
            }
        });
        model = (javax.swing.table.DefaultTableModel) tblPatients.getModel();
        loadPatients(null);
    }

    private void populateFormFromRow(int row) {
        txtId.setText(model.getValueAt(row, 0).toString());
        txtName.setText(model.getValueAt(row, 1).toString());
        txtAge.setText(model.getValueAt(row, 2).toString());
        cmbGender.setSelectedItem(model.getValueAt(row, 3).toString());
        cmbBloodGroup.setSelectedItem(model.getValueAt(row, 4).toString());
        txtPhone.setText(model.getValueAt(row, 5).toString());
        txtAddress.setText(model.getValueAt(row, 6).toString());
        chkAdmitted.setSelected("Yes".equals(model.getValueAt(row, 7).toString()));
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
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter the patient's full name.");
            return false;
        }
        try {
            int age = Integer.parseInt(txtAge.getText().trim());
            if (age <= 0 || age > 130) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid age (1-130).");
            return false;
        }
        return true;
    }

    private void addPatient() {
        if (!validateForm()) return;
        String sql = "INSERT INTO patients (full_name, age, gender, blood_group, phone, address, is_admitted, photo_path) "
                + "VALUES (?,?,?,?,?,?,?,?)";
        try (java.sql.PreparedStatement ps = hms.util.DBConnection.getConnection().prepareStatement(sql)) {
            ps.setString(1, txtName.getText().trim());
            ps.setInt(2, Integer.parseInt(txtAge.getText().trim()));
            ps.setString(3, (String) cmbGender.getSelectedItem());
            ps.setString(4, (String) cmbBloodGroup.getSelectedItem());
            ps.setString(5, txtPhone.getText().trim());
            ps.setString(6, txtAddress.getText().trim());
            ps.setBoolean(7, chkAdmitted.isSelected());
            ps.setString(8, photoPath);
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Patient registered successfully.");
            clearForm();
            loadPatients(null);
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error adding patient: " + ex.getMessage());
        }
    }

    private void updatePatient() {
        if (txtId.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Select a patient from the table first.");
            return;
        }
        if (!validateForm()) return;
        String sql = "UPDATE patients SET full_name=?, age=?, gender=?, blood_group=?, phone=?, "
                + "address=?, is_admitted=? WHERE patient_id=?";
        try (java.sql.PreparedStatement ps = hms.util.DBConnection.getConnection().prepareStatement(sql)) {
            ps.setString(1, txtName.getText().trim());
            ps.setInt(2, Integer.parseInt(txtAge.getText().trim()));
            ps.setString(3, (String) cmbGender.getSelectedItem());
            ps.setString(4, (String) cmbBloodGroup.getSelectedItem());
            ps.setString(5, txtPhone.getText().trim());
            ps.setString(6, txtAddress.getText().trim());
            ps.setBoolean(7, chkAdmitted.isSelected());
            ps.setInt(8, Integer.parseInt(txtId.getText().trim()));
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Patient updated successfully.");
            clearForm();
            loadPatients(null);
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error updating patient: " + ex.getMessage());
        }
    }

    private void deletePatient() {
        if (txtId.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Select a patient from the table first.");
            return;
        }
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
                "Delete this patient record? This cannot be undone.",
                "Confirm delete", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirm != javax.swing.JOptionPane.YES_OPTION) return;

        String sql = "DELETE FROM patients WHERE patient_id=?";
        try (java.sql.PreparedStatement ps = hms.util.DBConnection.getConnection().prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(txtId.getText().trim()));
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Patient deleted.");
            clearForm();
            loadPatients(null);
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error deleting patient: " + ex.getMessage());
        }
    }

    private void clearForm() {
        txtId.setText("");
        txtName.setText("");
        txtAge.setText("");
        txtPhone.setText("");
        txtAddress.setText("");
        cmbGender.setSelectedIndex(0);
        cmbBloodGroup.setSelectedIndex(0);
        chkAdmitted.setSelected(false);
        photoPath = null;
        lblPhoto.setIcon(hms.util.ImageUtils.placeholder(110, 110));
        tblPatients.clearSelection();
    }

    private void loadPatients(String searchTerm) {
        model.setRowCount(0);
        String sql = "SELECT patient_id, full_name, age, gender, blood_group, phone, address, is_admitted "
                + "FROM patients"
                + ((searchTerm != null && !searchTerm.isEmpty()) ? " WHERE full_name LIKE ?" : "")
                + " ORDER BY patient_id DESC";
        try (java.sql.PreparedStatement ps = hms.util.DBConnection.getConnection().prepareStatement(sql)) {
            if (searchTerm != null && !searchTerm.isEmpty()) {
                ps.setString(1, "%" + searchTerm + "%");
            }
            try (java.sql.ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    model.addRow(new Object[]{
                            rs.getInt("patient_id"),
                            rs.getString("full_name"),
                            rs.getInt("age"),
                            rs.getString("gender"),
                            rs.getString("blood_group"),
                            rs.getString("phone"),
                            rs.getString("address"),
                            rs.getBoolean("is_admitted") ? "Yes" : "No"
                    });
                }
            }
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading patients: " + ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUploadPhoto;
    private javax.swing.JCheckBox chkAdmitted;
    private javax.swing.JComboBox cmbBloodGroup;
    private javax.swing.JComboBox cmbGender;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBloodGroup;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tblPatients;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
