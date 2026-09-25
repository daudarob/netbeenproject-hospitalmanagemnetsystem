package hms.ui;



public class BillingManagement extends javax.swing.JPanel {

    private javax.swing.table.DefaultTableModel model;
    public BillingManagement() {
        initComponents();
        postInit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblPatient = new javax.swing.JLabel();
        cmbPatient = new javax.swing.JComboBox();
        lblConsultation = new javax.swing.JLabel();
        txtConsultation = new javax.swing.JTextField();
        lblMedicine = new javax.swing.JLabel();
        txtMedicine = new javax.swing.JTextField();
        lblRoom = new javax.swing.JLabel();
        txtRoom = new javax.swing.JTextField();
        lblOther = new javax.swing.JLabel();
        txtOther = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblPaymentMethod = new javax.swing.JLabel();
        cmbPaymentMethod = new javax.swing.JComboBox();
        chkPaid = new javax.swing.JCheckBox();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnInvoice = new javax.swing.JButton();
        scrollTable = new javax.swing.JScrollPane();
        tblBills = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(900, 560));

        lblId.setText("Bill ID:");

        txtId.setEditable(false);

        lblPatient.setText("Patient:");

        lblConsultation.setText("Consultation Fee:");

        txtConsultation.setText("0.00");

        lblMedicine.setText("Medicine Cost:");

        txtMedicine.setText("0.00");

        lblRoom.setText("Room Charges:");

        txtRoom.setText("0.00");
        txtRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomActionPerformed(evt);
            }
        });

        lblOther.setText("Other Charges:");

        txtOther.setText("0.00");

        lblTotal.setText("Total Amount:");

        txtTotal.setText("0.00");
        txtTotal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtTotal.setEditable(false);

        lblPaymentMethod.setText("Payment Method:");

        chkPaid.setText("Paid in full");

        btnAdd.setText("Create Bill");
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

        btnInvoice.setText("Print Invoice");
        btnInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvoiceActionPerformed(evt);
            }
        });

        scrollTable.setViewportView(tblBills);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblId, 120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(txtId, 150, 150, 150))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(lblPatient, 100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(cmbPatient, 300, 300, 300))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblConsultation, 140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(txtConsultation, 120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(lblMedicine, 140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(txtMedicine, 120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblRoom, 140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(txtRoom, 120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(lblOther, 140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(txtOther, 120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblTotal, 140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(txtTotal, 120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(lblPaymentMethod, 140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(cmbPaymentMethod, 150, 150, 150))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(chkPaid, 150, 150, 150))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnAdd, 100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnUpdate, 90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btnDelete, 90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(btnClear, 90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(btnInvoice, 120, 120, 120))
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
                        .addComponent(lblId, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtId, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblPatient, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cmbPatient, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblConsultation, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(txtConsultation, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblMedicine, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(txtMedicine, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lblRoom, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(txtRoom, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lblOther, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(txtOther, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lblTotal, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(txtTotal, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lblPaymentMethod, 20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(cmbPaymentMethod, 26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(chkPaid, 24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnAdd, 30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnUpdate, 30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnDelete, 30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnClear, 30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnInvoice, 30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(scrollTable, 285, 285, 285)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addBill();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateBill();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteBill();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoiceActionPerformed
        printInvoice();
    }//GEN-LAST:event_btnInvoiceActionPerformed

    private void txtRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomActionPerformed

    private void postInit() {
        cmbPaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[]{"Cash", "Mobile Money", "Card", "Insurance"}));

        tblBills.setModel(new javax.swing.table.DefaultTableModel(new Object[]{
                "Bill ID", "Patient", "Consultation", "Medicine", "Room", "Other", "Total", "Paid", "Method", "Date"
        }, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        tblBills.setRowHeight(24);
        tblBills.getSelectionModel().addListSelectionListener(evt -> {
            if (!evt.getValueIsAdjusting() && tblBills.getSelectedRow() != -1) {
                populateFormFromRow(tblBills.getSelectedRow());
            }
        });

        javax.swing.event.DocumentListener recalc = new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) { recalcTotal(); }
            public void removeUpdate(javax.swing.event.DocumentEvent e) { recalcTotal(); }
            public void changedUpdate(javax.swing.event.DocumentEvent e) { recalcTotal(); }
        };
        txtConsultation.getDocument().addDocumentListener(recalc);
        txtMedicine.getDocument().addDocumentListener(recalc);
        txtRoom.getDocument().addDocumentListener(recalc);
        txtOther.getDocument().addDocumentListener(recalc);

        model = (javax.swing.table.DefaultTableModel) tblBills.getModel();
        loadPatientsIntoCombo();
        loadBills();
    }

    private void populateFormFromRow(int row) {
        txtId.setText(model.getValueAt(row, 0).toString());
        txtConsultation.setText(model.getValueAt(row, 2).toString());
        txtMedicine.setText(model.getValueAt(row, 3).toString());
        txtRoom.setText(model.getValueAt(row, 4).toString());
        txtOther.setText(model.getValueAt(row, 5).toString());
        chkPaid.setSelected("Yes".equals(model.getValueAt(row, 7).toString()));
        cmbPaymentMethod.setSelectedItem(model.getValueAt(row, 8).toString());
    }

    private double parseOrZero(String s) {
        try {
            return Double.parseDouble(s.trim());
        } catch (NumberFormatException ex) {
            return 0.0;
        }
    }

    private void recalcTotal() {
        double total = parseOrZero(txtConsultation.getText())
                + parseOrZero(txtMedicine.getText())
                + parseOrZero(txtRoom.getText())
                + parseOrZero(txtOther.getText());
        txtTotal.setText(String.format("%.2f", total));
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

    private void addBill() {
        if (cmbPatient.getSelectedItem() == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please register a patient first.");
            return;
        }
        hms.model.Patient p = (hms.model.Patient) cmbPatient.getSelectedItem();
        recalcTotal();
        String sql = "INSERT INTO bills (patient_id, consultation_fee, medicine_cost, room_charges, "
                + "other_charges, total_amount, is_paid, payment_method) VALUES (?,?,?,?,?,?,?,?)";
        try (java.sql.PreparedStatement ps = hms.util.DBConnection.getConnection().prepareStatement(sql)) {
            ps.setInt(1, p.getPatientId());
            ps.setDouble(2, parseOrZero(txtConsultation.getText()));
            ps.setDouble(3, parseOrZero(txtMedicine.getText()));
            ps.setDouble(4, parseOrZero(txtRoom.getText()));
            ps.setDouble(5, parseOrZero(txtOther.getText()));
            ps.setDouble(6, parseOrZero(txtTotal.getText()));
            ps.setBoolean(7, chkPaid.isSelected());
            ps.setString(8, (String) cmbPaymentMethod.getSelectedItem());
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Bill created successfully.");
            clearForm();
            loadBills();
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error creating bill: " + ex.getMessage());
        }
    }

    private void updateBill() {
        if (txtId.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Select a bill from the table first.");
            return;
        }
        recalcTotal();
        String sql = "UPDATE bills SET consultation_fee=?, medicine_cost=?, room_charges=?, other_charges=?, "
                + "total_amount=?, is_paid=?, payment_method=? WHERE bill_id=?";
        try (java.sql.PreparedStatement ps = hms.util.DBConnection.getConnection().prepareStatement(sql)) {
            ps.setDouble(1, parseOrZero(txtConsultation.getText()));
            ps.setDouble(2, parseOrZero(txtMedicine.getText()));
            ps.setDouble(3, parseOrZero(txtRoom.getText()));
            ps.setDouble(4, parseOrZero(txtOther.getText()));
            ps.setDouble(5, parseOrZero(txtTotal.getText()));
            ps.setBoolean(6, chkPaid.isSelected());
            ps.setString(7, (String) cmbPaymentMethod.getSelectedItem());
            ps.setInt(8, Integer.parseInt(txtId.getText().trim()));
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Bill updated.");
            clearForm();
            loadBills();
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error updating bill: " + ex.getMessage());
        }
    }

    private void deleteBill() {
        if (txtId.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Select a bill from the table first.");
            return;
        }
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, "Delete this bill?", "Confirm",
                javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirm != javax.swing.JOptionPane.YES_OPTION) return;

        String sql = "DELETE FROM bills WHERE bill_id=?";
        try (java.sql.PreparedStatement ps = hms.util.DBConnection.getConnection().prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(txtId.getText().trim()));
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Bill deleted.");
            clearForm();
            loadBills();
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error deleting bill: " + ex.getMessage());
        }
    }

    private void printInvoice() {
        if (tblBills.getSelectedRow() == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Select a bill from the table to print its invoice.");
            return;
        }
        int row = tblBills.getSelectedRow();
        StringBuilder sb = new StringBuilder();
        sb.append("========================================\n");
        sb.append("        HOSPITAL MANAGEMENT SYSTEM\n");
        sb.append("               INVOICE\n");
        sb.append("========================================\n");
        sb.append("Bill ID     : ").append(model.getValueAt(row, 0)).append("\n");
        sb.append("Patient     : ").append(model.getValueAt(row, 1)).append("\n");
        sb.append("Date        : ").append(model.getValueAt(row, 9)).append("\n");
        sb.append("----------------------------------------\n");
        sb.append(String.format("%-20s %10s%n", "Consultation Fee", model.getValueAt(row, 2)));
        sb.append(String.format("%-20s %10s%n", "Medicine Cost", model.getValueAt(row, 3)));
        sb.append(String.format("%-20s %10s%n", "Room Charges", model.getValueAt(row, 4)));
        sb.append(String.format("%-20s %10s%n", "Other Charges", model.getValueAt(row, 5)));
        sb.append("----------------------------------------\n");
        sb.append(String.format("%-20s %10s%n", "TOTAL", model.getValueAt(row, 6)));
        sb.append("Payment Method : ").append(model.getValueAt(row, 8)).append("\n");
        sb.append("Status         : ").append("Yes".equals(model.getValueAt(row, 7)) ? "PAID" : "UNPAID").append("\n");
        sb.append("========================================\n");
        sb.append("        Thank you for choosing us!\n");

        javax.swing.JTextArea area = new javax.swing.JTextArea(sb.toString());
        area.setEditable(false);
        area.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 13));
        javax.swing.JOptionPane.showMessageDialog(this, new javax.swing.JScrollPane(area), "Invoice Preview",
                javax.swing.JOptionPane.PLAIN_MESSAGE);
    }

    private void clearForm() {
        txtId.setText("");
        txtConsultation.setText("0.00");
        txtMedicine.setText("0.00");
        txtRoom.setText("0.00");
        txtOther.setText("0.00");
        txtTotal.setText("0.00");
        cmbPaymentMethod.setSelectedIndex(0);
        chkPaid.setSelected(false);
        tblBills.clearSelection();
    }

    private void loadBills() {
        model.setRowCount(0);
        String sql = "SELECT b.bill_id, p.full_name, b.consultation_fee, b.medicine_cost, b.room_charges, "
                + "b.other_charges, b.total_amount, b.is_paid, b.payment_method, b.bill_date "
                + "FROM bills b JOIN patients p ON b.patient_id = p.patient_id "
                + "ORDER BY b.bill_id DESC";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm");
        try (java.sql.Statement st = hms.util.DBConnection.getConnection().createStatement();
             java.sql.ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("bill_id"),
                        rs.getString("full_name"),
                        rs.getDouble("consultation_fee"),
                        rs.getDouble("medicine_cost"),
                        rs.getDouble("room_charges"),
                        rs.getDouble("other_charges"),
                        rs.getDouble("total_amount"),
                        rs.getBoolean("is_paid") ? "Yes" : "No",
                        rs.getString("payment_method"),
                        sdf.format(rs.getTimestamp("bill_date"))
                });
            }
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading bills: " + ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInvoice;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkPaid;
    private javax.swing.JComboBox cmbPatient;
    private javax.swing.JComboBox cmbPaymentMethod;
    private javax.swing.JLabel lblConsultation;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMedicine;
    private javax.swing.JLabel lblOther;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel lblPaymentMethod;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tblBills;
    private javax.swing.JTextField txtConsultation;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMedicine;
    private javax.swing.JTextField txtOther;
    private javax.swing.JTextField txtRoom;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
