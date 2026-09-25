package hms.ui;



public class ReportsPanel extends javax.swing.JPanel {


    public ReportsPanel() {
        initComponents();
        postInit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCardPatients = new javax.swing.JPanel();
        lblPatientsValue = new javax.swing.JLabel();
        lblPatientsTitle = new javax.swing.JLabel();
        pnlCardDoctors = new javax.swing.JPanel();
        lblDoctorsValue = new javax.swing.JLabel();
        lblDoctorsTitle = new javax.swing.JLabel();
        pnlCardAppointments = new javax.swing.JPanel();
        lblAppointmentsValue = new javax.swing.JLabel();
        lblAppointmentsTitle = new javax.swing.JLabel();
        pnlCardBeds = new javax.swing.JPanel();
        lblBedsValue = new javax.swing.JLabel();
        lblBedsTitle = new javax.swing.JLabel();
        pnlCardRevenue = new javax.swing.JPanel();
        lblRevenueValue = new javax.swing.JLabel();
        lblRevenueTitle = new javax.swing.JLabel();
        pnlChartContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(900, 560));

        pnlCardPatients.setBackground(new java.awt.Color(52, 152, 219));

        lblPatientsValue.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblPatientsValue.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientsValue.setText("0");

        lblPatientsTitle.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblPatientsTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientsTitle.setText("Patients");

        javax.swing.GroupLayout pnlCardPatientsLayout = new javax.swing.GroupLayout(pnlCardPatients);
        pnlCardPatients.setLayout(pnlCardPatientsLayout);
        pnlCardPatientsLayout.setHorizontalGroup(
            pnlCardPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardPatientsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlCardPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientsValue, 135, 135, 135)
                    .addComponent(lblPatientsTitle, 135, 135, 135))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        pnlCardPatientsLayout.setVerticalGroup(
            pnlCardPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardPatientsLayout.createSequentialGroup()
                .addGroup(pnlCardPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCardPatientsLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblPatientsValue, 35, 35, 35))
                    .addGroup(pnlCardPatientsLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblPatientsTitle, 35, 35, 35)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCardDoctors.setBackground(new java.awt.Color(46, 204, 113));

        lblDoctorsValue.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblDoctorsValue.setForeground(new java.awt.Color(255, 255, 255));
        lblDoctorsValue.setText("0");

        lblDoctorsTitle.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblDoctorsTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblDoctorsTitle.setText("Doctors");

        javax.swing.GroupLayout pnlCardDoctorsLayout = new javax.swing.GroupLayout(pnlCardDoctors);
        pnlCardDoctors.setLayout(pnlCardDoctorsLayout);
        pnlCardDoctorsLayout.setHorizontalGroup(
            pnlCardDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardDoctorsLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(pnlCardDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDoctorsValue, 135, 135, 135)
                    .addComponent(lblDoctorsTitle, 135, 135, 135)))
        );
        pnlCardDoctorsLayout.setVerticalGroup(
            pnlCardDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardDoctorsLayout.createSequentialGroup()
                .addGroup(pnlCardDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCardDoctorsLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblDoctorsValue, 35, 35, 35))
                    .addGroup(pnlCardDoctorsLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblDoctorsTitle, 35, 35, 35)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCardAppointments.setBackground(new java.awt.Color(230, 126, 34));

        lblAppointmentsValue.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblAppointmentsValue.setForeground(new java.awt.Color(255, 255, 255));
        lblAppointmentsValue.setText("0");

        lblAppointmentsTitle.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblAppointmentsTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblAppointmentsTitle.setText("Appointments Today");

        javax.swing.GroupLayout pnlCardAppointmentsLayout = new javax.swing.GroupLayout(pnlCardAppointments);
        pnlCardAppointments.setLayout(pnlCardAppointmentsLayout);
        pnlCardAppointmentsLayout.setHorizontalGroup(
            pnlCardAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardAppointmentsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlCardAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAppointmentsValue, 135, 135, 135)
                    .addComponent(lblAppointmentsTitle, 135, 135, 135))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        pnlCardAppointmentsLayout.setVerticalGroup(
            pnlCardAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardAppointmentsLayout.createSequentialGroup()
                .addGroup(pnlCardAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCardAppointmentsLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblAppointmentsValue, 35, 35, 35))
                    .addGroup(pnlCardAppointmentsLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblAppointmentsTitle, 35, 35, 35)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCardBeds.setBackground(new java.awt.Color(155, 89, 182));

        lblBedsValue.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblBedsValue.setForeground(new java.awt.Color(255, 255, 255));
        lblBedsValue.setText("0");

        lblBedsTitle.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblBedsTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblBedsTitle.setText("Beds Occupied");

        javax.swing.GroupLayout pnlCardBedsLayout = new javax.swing.GroupLayout(pnlCardBeds);
        pnlCardBeds.setLayout(pnlCardBedsLayout);
        pnlCardBedsLayout.setHorizontalGroup(
            pnlCardBedsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardBedsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlCardBedsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBedsValue, 135, 135, 135)
                    .addComponent(lblBedsTitle, 135, 135, 135))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        pnlCardBedsLayout.setVerticalGroup(
            pnlCardBedsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardBedsLayout.createSequentialGroup()
                .addGroup(pnlCardBedsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCardBedsLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblBedsValue, 35, 35, 35))
                    .addGroup(pnlCardBedsLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblBedsTitle, 35, 35, 35)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCardRevenue.setBackground(new java.awt.Color(231, 76, 60));

        lblRevenueValue.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblRevenueValue.setForeground(new java.awt.Color(255, 255, 255));
        lblRevenueValue.setText("0");

        lblRevenueTitle.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblRevenueTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblRevenueTitle.setText("Revenue Collected ($)");

        javax.swing.GroupLayout pnlCardRevenueLayout = new javax.swing.GroupLayout(pnlCardRevenue);
        pnlCardRevenue.setLayout(pnlCardRevenueLayout);
        pnlCardRevenueLayout.setHorizontalGroup(
            pnlCardRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardRevenueLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlCardRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRevenueValue, 135, 135, 135)
                    .addComponent(lblRevenueTitle, 135, 135, 135))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlCardRevenueLayout.setVerticalGroup(
            pnlCardRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardRevenueLayout.createSequentialGroup()
                .addGroup(pnlCardRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCardRevenueLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblRevenueValue, 35, 35, 35))
                    .addGroup(pnlCardRevenueLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblRevenueTitle, 35, 35, 35)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlChartContainer.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlChartContainerLayout = new javax.swing.GroupLayout(pnlChartContainer);
        pnlChartContainer.setLayout(pnlChartContainerLayout);
        pnlChartContainerLayout.setHorizontalGroup(
            pnlChartContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 842, Short.MAX_VALUE)
        );
        pnlChartContainerLayout.setVerticalGroup(
            pnlChartContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlChartContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCardPatients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(pnlCardDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(pnlCardAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(pnlCardBeds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(pnlCardRevenue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(pnlChartContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pnlCardBeds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pnlCardRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pnlCardDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pnlCardAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pnlCardPatients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(307, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents



    private void postInit() {
        lblPatientsValue.setText(count("SELECT COUNT(*) FROM patients"));
        lblDoctorsValue.setText(count("SELECT COUNT(*) FROM doctors"));
        lblAppointmentsValue.setText(count("SELECT COUNT(*) FROM appointments WHERE appointment_date = CURDATE()"));
        lblBedsValue.setText(count("SELECT COUNT(*) FROM wards WHERE is_occupied = 1"));
        lblRevenueValue.setText(currency("SELECT SUM(total_amount) FROM bills WHERE is_paid = 1"));

        pnlChartContainer.setLayout(new java.awt.BorderLayout());
        pnlChartContainer.add(new BarChart(loadAppointmentsByStatus()), java.awt.BorderLayout.CENTER);
    }

    private String count(String sql) {
        try (java.sql.Statement st = hms.util.DBConnection.getConnection().createStatement();
             java.sql.ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) return String.valueOf(rs.getInt(1));
        } catch (java.sql.SQLException ex) {
            return "-";
        }
        return "0";
    }

    private String currency(String sql) {
        try (java.sql.Statement st = hms.util.DBConnection.getConnection().createStatement();
             java.sql.ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) return String.format("%.2f", rs.getDouble(1));
        } catch (java.sql.SQLException ex) {
            return "-";
        }
        return "0.00";
    }

    private java.util.Map<String, Integer> loadAppointmentsByStatus() {
        java.util.Map<String, Integer> data = new java.util.LinkedHashMap<>();
        String sql = "SELECT status, COUNT(*) AS c FROM appointments GROUP BY status";
        try (java.sql.Statement st = hms.util.DBConnection.getConnection().createStatement();
             java.sql.ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                data.put(rs.getString("status"), rs.getInt("c"));
            }
        } catch (java.sql.SQLException ex) {
            // leave data empty; chart will just show axes
        }
        if (data.isEmpty()) {
            data.put("Scheduled", 0);
            data.put("Completed", 0);
            data.put("Cancelled", 0);
        }
        return data;
    }

    private static class BarChart extends javax.swing.JPanel {
        private final java.util.Map<String, Integer> data;
        private static final java.awt.Color[] PALETTE = {
                new java.awt.Color(52, 152, 219), new java.awt.Color(46, 204, 113), new java.awt.Color(231, 76, 60),
                new java.awt.Color(241, 196, 15), new java.awt.Color(155, 89, 182)
        };

        BarChart(java.util.Map<String, Integer> data) {
            this.data = data;
            setBackground(java.awt.Color.WHITE);
        }

        @Override
        protected void paintComponent(java.awt.Graphics g) {
            super.paintComponent(g);
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);

            int width = getWidth();
            int height = getHeight();
            int padding = 50;
            int chartHeight = height - padding * 2;
            int chartWidth = width - padding * 2;

            int max = data.values().stream().mapToInt(Integer::intValue).max().orElse(1);
            if (max == 0) max = 1;

            g2.setColor(new java.awt.Color(200, 200, 200));
            g2.drawLine(padding, height - padding, width - padding, height - padding);
            g2.drawLine(padding, padding, padding, height - padding);

            int n = data.size();
            int barSlot = chartWidth / Math.max(n, 1);
            int barWidth = (int) (barSlot * 0.5);
            int i = 0;
            for (java.util.Map.Entry<String, Integer> entry : data.entrySet()) {
                int barHeight = (int) ((entry.getValue() / (double) max) * (chartHeight - 20));
                int x = padding + i * barSlot + (barSlot - barWidth) / 2;
                int y = height - padding - barHeight;

                g2.setColor(PALETTE[i % PALETTE.length]);
                g2.fillRoundRect(x, y, barWidth, barHeight, 8, 8);

                g2.setColor(java.awt.Color.DARK_GRAY);
                g2.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 13));
                String valueLabel = String.valueOf(entry.getValue());
                int labelWidth = g2.getFontMetrics().stringWidth(valueLabel);
                g2.drawString(valueLabel, x + (barWidth - labelWidth) / 2, y - 6);

                g2.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12));
                int nameWidth = g2.getFontMetrics().stringWidth(entry.getKey());
                g2.drawString(entry.getKey(), x + (barWidth - nameWidth) / 2, height - padding + 18);

                i++;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAppointmentsTitle;
    private javax.swing.JLabel lblAppointmentsValue;
    private javax.swing.JLabel lblBedsTitle;
    private javax.swing.JLabel lblBedsValue;
    private javax.swing.JLabel lblDoctorsTitle;
    private javax.swing.JLabel lblDoctorsValue;
    private javax.swing.JLabel lblPatientsTitle;
    private javax.swing.JLabel lblPatientsValue;
    private javax.swing.JLabel lblRevenueTitle;
    private javax.swing.JLabel lblRevenueValue;
    private javax.swing.JPanel pnlCardAppointments;
    private javax.swing.JPanel pnlCardBeds;
    private javax.swing.JPanel pnlCardDoctors;
    private javax.swing.JPanel pnlCardPatients;
    private javax.swing.JPanel pnlCardRevenue;
    private javax.swing.JPanel pnlChartContainer;
    // End of variables declaration//GEN-END:variables
}
