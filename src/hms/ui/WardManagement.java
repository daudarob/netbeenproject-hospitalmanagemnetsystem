package hms.ui;



public class WardManagement extends javax.swing.JPanel {

    private javax.swing.table.DefaultTableModel model;
    public WardManagement() {
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
        lblId.setText("Ward/Room ID:");

        txtId = new javax.swing.JTextField();
        txtId.setEditable(false);

        lblName = new javax.swing.JLabel();
        lblName.setText("Ward/Bed Name:");

        txtName = new javax.swing.JTextField();

        lblType = new javax.swing.JLabel();
        lblType.setText("Room Type:");

        cmbType = new javax.swing.JComboBox<>();

        lblRate = new javax.swing.JLabel();
        lblRate.setText("Daily Rate ($):");

        txtRate = new javax.swing.JTextField();

        chkOccupied = new javax.swing.JCheckBox();
        chkOccupied.setText("Currently Occupied");

        btnAdd = new javax.swing.JButton();
        btnAdd.setText("Add");
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
        btnDelete.setText("Delete");
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

        scrollTable = new javax.swing.JScrollPane();
        tblWards = new javax.swing.JTable();
        scrollTable.setViewportView(tblWards);

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
                .addComponent(lblName, 120, 120, 120)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(txtName, 300, 300, 300)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblType, 120, 120, 120)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(cmbType, 180, 180, 180)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblRate, 120, 120, 120)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(txtRate, 150, 150, 150)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(chkOccupied, 220, 220, 220)
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
                .addComponent(btnDelete, 90, 90, 90)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(btnClear, 90, 90, 90)
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
                .addComponent(lblName, 20, 20, 20)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(txtName, 26, 26, 26)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lblType, 20, 20, 20)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(cmbType, 26, 26, 26)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(lblRate, 20, 20, 20)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(txtRate, 26, 26, 26)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(chkOccupied, 24, 24, 24)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnAdd, 30, 30, 30)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnUpdate, 30, 30, 30)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnDelete, 30, 30, 30)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnClear, 30, 30, 30)
                .addContainerGap(0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(scrollTable, 280, 280, 280)
                .addContainerGap(0, Short.MAX_VALUE))
        );

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addWard();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateWard();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteWard();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void postInit() {
        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[]{"General", "Private", "ICU", "Maternity"}));

        tblWards.setModel(new javax.swing.table.DefaultTableModel(
                new Object[]{"ID", "Name", "Type", "Daily Rate", "Occupied"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        tblWards.setRowHeight(24);
        tblWards.getSelectionModel().addListSelectionListener(evt -> {
            if (!evt.getValueIsAdjusting() && tblWards.getSelectedRow() != -1) {
                populateFormFromRow(tblWards.getSelectedRow());
            }
        });
        model = (javax.swing.table.DefaultTableModel) tblWards.getModel();
        loadWards();
    }

    private void populateFormFromRow(int row) {
        txtId.setText(model.getValueAt(row, 0).toString());
        txtName.setText(model.getValueAt(row, 1).toString());
        cmbType.setSelectedItem(model.getValueAt(row, 2).toString());
        txtRate.setText(model.getValueAt(row, 3).toString());
        chkOccupied.setSelected("Yes".equals(model.getValueAt(row, 4).toString()));
    }

    private boolean validateForm() {
        if (txtName.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter a ward/bed name.");
            return false;
        }
        try {
            double rate = Double.parseDouble(txtRate.getText().trim());
            if (rate < 0) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid daily rate.");
            return false;
        }
        return true;
    }

    private void addWard() {
        if (!validateForm()) return;
        String sql = "INSERT INTO wards (ward_name, room_type, daily_rate, is_occupied) VALUES (?,?,?,?)";
        try (java.sql.PreparedStatement ps = hms.util.DBConnection.getConnection().prepareStatement(sql)) {
            ps.setString(1, txtName.getText().trim());
            ps.setString(2, (String) cmbType.getSelectedItem());
            ps.setDouble(3, Double.parseDouble(txtRate.getText().trim()));
            ps.setBoolean(4, chkOccupied.isSelected());
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Ward/room added.");
            clearForm();
            loadWards();
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error adding ward: " + ex.getMessage());
        }
    }

    private void updateWard() {
        if (txtId.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Select a ward/room from the table first.");
            return;
        }
        if (!validateForm()) return;
        String sql = "UPDATE wards SET ward_name=?, room_type=?, daily_rate=?, is_occupied=? WHERE ward_id=?";
        try (java.sql.PreparedStatement ps = hms.util.DBConnection.getConnection().prepareStatement(sql)) {
            ps.setString(1, txtName.getText().trim());
            ps.setString(2, (String) cmbType.getSelectedItem());
            ps.setDouble(3, Double.parseDouble(txtRate.getText().trim()));
            ps.setBoolean(4, chkOccupied.isSelected());
            ps.setInt(5, Integer.parseInt(txtId.getText().trim()));
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Ward/room updated.");
            clearForm();
            loadWards();
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error updating ward: " + ex.getMessage());
        }
    }

    private void deleteWard() {
        if (txtId.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Select a ward/room from the table first.");
            return;
        }
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, "Delete this ward/room?", "Confirm",
                javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirm != javax.swing.JOptionPane.YES_OPTION) return;

        String sql = "DELETE FROM wards WHERE ward_id=?";
        try (java.sql.PreparedStatement ps = hms.util.DBConnection.getConnection().prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(txtId.getText().trim()));
            ps.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Ward/room deleted.");
            clearForm();
            loadWards();
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error deleting ward: " + ex.getMessage());
        }
    }

    private void clearForm() {
        txtId.setText("");
        txtName.setText("");
        txtRate.setText("");
        cmbType.setSelectedIndex(0);
        chkOccupied.setSelected(false);
        tblWards.clearSelection();
    }

    private void loadWards() {
        model.setRowCount(0);
        String sql = "SELECT ward_id, ward_name, room_type, daily_rate, is_occupied FROM wards ORDER BY ward_id";
        try (java.sql.Statement st = hms.util.DBConnection.getConnection().createStatement();
             java.sql.ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("ward_id"),
                        rs.getString("ward_name"),
                        rs.getString("room_type"),
                        rs.getDouble("daily_rate"),
                        rs.getBoolean("is_occupied") ? "Yes" : "No"
                });
            }
        } catch (java.sql.SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading wards: " + ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkOccupied;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRate;
    private javax.swing.JLabel lblType;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tblWards;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRate;
    // End of variables declaration//GEN-END:variables
}
