package hms.ui;



public class AppointmentManagement extends javax.swing.JPanel {

    private javax.swing.table.DefaultTableModel model;
    public AppointmentManagement() {
        initComponents();
        postInit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(900, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        lblId = new javax.swing.JLabel();
        lblId.setText("Appointment ID:");

        txtId = new javax.swing.JTextField();
        txtId.setEditable(false);

        lblPatient = new javax.swing.JLabel();
        lblPatient.setText("Patient:");

        cmbPatient = new javax.swing.JComboBox<>();

        lblDoctor = new javax.swing.JLabel();
        lblDoctor.setText("Doctor:");

        cmbDoctor = new javax.swing.JComboBox<>();

        lblDate = new javax.swing.JLabel();
        lblDate.setText("Date:");

        spnDate = new javax.swing.JSpinner();

        lblTime = new javax.swing.JLabel();
        lblTime.setText("Time:");

        txtTime = new javax.swing.JTextField();
        txtTime.setText("09:00 AM");

        lblStatus = new javax.swing.JLabel();
        lblStatus.setText("Status:");

        cmbStatus = new javax.swing.JComboBox<>();

        lblReason = new javax.swing.JLabel();
        lblReason.setText("Reason for visit:");

        txtReason = new javax.swing.JTextField();

        btnAdd = new javax.swing.JButton();
        btnAdd.setText("Book");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate = new javax.swing.JButton();
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete = new javax.swing.JButton();
        btnDelete.setText("Cancel/Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear = new javax.swing.JButton();
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnRefreshCombos = new javax.swing.JButton();
        btnRefreshCombos.setText("Refresh Lists");
        btnRefreshCombos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshCombosActionPerformed(evt);
            }
        });

        scrollTable = new javax.swing.JScrollPane();
        tblAppointments = new javax.swing.JTable();
        scrollTable.setViewportView(tblAppointments);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblId, 120, 120, 120)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(txtId, 150, 150, 150)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblPatient, 120, 120, 120)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(cmbPatient, 300, 300, 300)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(lblDoctor, 100, 100, 100)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(cmbDoctor, 300, 300, 300)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblDate, 120, 120, 120)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(spnDate, 150, 150, 150)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(lblTime, 100, 100, 100)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(txtTime, 120, 120, 120)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addComponent(lblStatus, 100, 100, 100)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(610, 610, 610)
                .addComponent(cmbStatus, 150, 150, 150)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblReason, 120, 120, 120)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(txtReason, 500, 500, 500)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnAdd, 90, 90, 90)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnUpdate, 90, 90, 90)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(btnDelete, 110, 110, 110)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(btnClear, 90, 90, 90)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(btnRefreshCombos, 130, 130, 130)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(scrollTable, 830, 830, 830)
                .addContainerGap(0, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblId, 20, 20, 20)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtId, 26, 26, 26)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblPatient, 20, 20, 20)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(cmbPatient, 26, 26, 26)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblDoctor, 20, 20, 20)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(cmbDoctor, 26, 26, 26)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lblDate, 20, 20, 20)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(spnDate, 26, 26, 26)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lblTime, 20, 20, 20)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(txtTime, 26, 26, 26)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lblStatus, 20, 20, 20)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(cmbStatus, 26, 26, 26)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(lblReason, 20, 20, 20)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(txtReason, 26, 26, 26)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(btnAdd, 30, 30, 30)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(btnUpdate, 30, 30, 30)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(btnDelete, 30, 30, 30)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(btnClear, 30, 30, 30)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(btnRefreshCombos, 30, 30, 30)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(scrollTable, 315, 315, 315)
                .addContainerGap(0, Short.MAX_VALUE))
        );

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addAppointment();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateAppointment();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteAppointment();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRefreshCombosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshCombosActionPerformed
        loadPatientsIntoCombo();
        loadDoctorsIntoCombo();
    }//GEN-LAST:event_btnRefreshCombosActionPerformed

    private void postInit() {
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[]{"Scheduled", "Completed", "Cancelled"}));
        spnDate.setModel(new javax.swing.SpinnerDateModel());
        spnDate.setEditor(new javax.swing.JSpinner.DateEditor(spnDate, "yyyy-MM-dd"));

        tblAppointments.setModel(new javax.swing.table.DefaultTableModel(new Object[]{
                "ID", "Patient", "Doctor", "Date", "Time", "Reason", "Status"
        }, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        tblAppointments.setRowHeight(24);
        tblAppointments.getSelectionModel().addListSelectionListener(evt -> {
            if (!evt.getValueIsAdjusting() && tblAppointments.getSelectedRow() != -1) {
                int row = tblAppointments.getSelectedRow();
                txtId.setText(model.getValueAt(row, 0).toString());
                cmbStatus.setSelectedItem(model.getValueAt(row, 6).toString());
                txtReason.setText(model.getValueAt(row, 5).toString());
            }
        });
        model = (javax.swing.table.DefaultTableModel) tblAppointments.getModel();
        loadPatientsIntoCombo();
        loadDoctorsIntoCombo();
        loadAppointments();
    }

    private void loadPatientsIntoCombo() {
        cmbPatient.removeAllItems();
        String sql = "SELECT patient_id, full_name FROM patients ORDER BY full_name";
        try (java.sql.Statement st = hms.util.DBConnection.getConnection().createStatement();
             java.sql.ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                hms.model.Patient p = new hms.model.Patient();
                p.setPatientId(rs.getInt("patient_id"));
                p.setFullName(rs.getString("full_name"));
                cmbPatient.addItem(p);
            }
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading patients: " + ex.getMessage());
        }
    }

    private void loadDoctorsIntoCombo() {
        cmbDoctor.removeAllItems();
        String sql = "SELECT doctor_id, full_name FROM doctors WHERE is_available = 1 ORDER BY full_name";
        try (java.sql.Statement st = hms.util.DBConnection.getConnection().createStatement();
             java.sql.ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                hms.model.Doctor d = new hms.model.Doctor();
                d.setDoctorId(rs.getInt("doctor_id"));
                d.setFullName(rs.getString("full_name"));
                cmbDoctor.addItem(d);
            }
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading doctors: " + ex.getMessage());
        }
    }

    private void addAppointment() {
        if (cmbPatient.getSelectedItem() == null || cmbDoctor.getSelectedItem() == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please make sure at least one patient and one doctor exist.");
            return;
        }
        hms.model.Patient p = (hms.model.Patient) cmbPatient.getSelectedItem();
        hms.model.Doctor d = (hms.model.Doctor) cmbDoctor.getSelectedItem();
        String sql = "INSERT INTO appointments (patient_id, doctor_id, appointment_date, appointment_time, reason, status) "
                + "VALUES (?,?,?,?,?,?)";
        try (java.sql.PreparedStatement ps = hms.util.DBConnection.getConnection().prepareStatement(sql)) {
            ps.setInt(1, p.getPatientId());
            ps.setInt(2, d.getDoctorId());
            ps.setDate(3, new java.sql.Date(((java.util.Date) spnDate.getValue()).getTime()));
            ps.setString(4, txtTime.getText().trim());
            ps.setString(5, txtReason.getText().trim());
            ps.setString(6, (String) cmbStatus.getSelectedItem());
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Appointment booked successfully.");
            clearForm();
            loadAppointments();
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error booking appointment: " + ex.getMessage());
        }
    }

    private void updateAppointment() {
        if (txtId.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Select an appointment from the table first.");
            return;
        }
        String sql = "UPDATE appointments SET status=?, reason=? WHERE appointment_id=?";
        try (java.sql.PreparedStatement ps = hms.util.DBConnection.getConnection().prepareStatement(sql)) {
            ps.setString(1, (String) cmbStatus.getSelectedItem());
            ps.setString(2, txtReason.getText().trim());
            ps.setInt(3, Integer.parseInt(txtId.getText().trim()));
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Appointment updated.");
            clearForm();
            loadAppointments();
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error updating appointment: " + ex.getMessage());
        }
    }

    private void deleteAppointment() {
        if (txtId.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Select an appointment from the table first.");
            return;
        }
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
                "Delete/cancel this appointment?", "Confirm", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirm != javax.swing.JOptionPane.YES_OPTION) return;

        String sql = "DELETE FROM appointments WHERE appointment_id=?";
        try (java.sql.PreparedStatement ps = hms.util.DBConnection.getConnection().prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(txtId.getText().trim()));
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Appointment removed.");
            clearForm();
            loadAppointments();
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error deleting appointment: " + ex.getMessage());
        }
    }

    private void clearForm() {
        txtId.setText("");
        txtTime.setText("09:00 AM");
        txtReason.setText("");
        cmbStatus.setSelectedIndex(0);
        spnDate.setValue(new java.util.Date());
        tblAppointments.clearSelection();
    }

    private void loadAppointments() {
        model.setRowCount(0);
        String sql = "SELECT a.appointment_id, p.full_name AS patient_name, d.full_name AS doctor_name, "
                + "a.appointment_date, a.appointment_time, a.reason, a.status "
                + "FROM appointments a "
                + "JOIN patients p ON a.patient_id = p.patient_id "
                + "JOIN doctors d ON a.doctor_id = d.doctor_id "
                + "ORDER BY a.appointment_date DESC, a.appointment_id DESC";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        try (java.sql.Statement st = hms.util.DBConnection.getConnection().createStatement();
             java.sql.ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("appointment_id"),
                        rs.getString("patient_name"),
                        rs.getString("doctor_name"),
                        sdf.format(rs.getDate("appointment_date")),
                        rs.getString("appointment_time"),
                        rs.getString("reason"),
                        rs.getString("status")
                });
            }
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading appointments: " + ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefreshCombos;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<hms.model.Doctor> cmbDoctor;
    private javax.swing.JComboBox<hms.model.Patient> cmbPatient;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel lblReason;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTime;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JSpinner spnDate;
    private javax.swing.JTable tblAppointments;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtReason;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
