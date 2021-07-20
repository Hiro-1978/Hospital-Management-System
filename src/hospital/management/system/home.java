package hospital.management.system;


import javax.swing.JOptionPane;

public class home extends javax.swing.JFrame {

    public int i = 0;

    public home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        swBtn = new javax.swing.JButton();
        addPatientBtn = new javax.swing.JButton();
        addDiagBtn = new javax.swing.JButton();
        hisPatientBtn = new javax.swing.JButton();
        updatePatientBtn = new javax.swing.JButton();
        informationBnt = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        swBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/two arrow.png"))); // NOI18N
        swBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        swBtn.setPreferredSize(new java.awt.Dimension(73, 60));
        swBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swBtnActionPerformed(evt);
            }
        });
        getContentPane().add(swBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        addPatientBtn.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        addPatientBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add new patient.png"))); // NOI18N
        addPatientBtn.setText("Add New Patient Record");
        addPatientBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addPatientBtn.setPreferredSize(new java.awt.Dimension(238, 60));
        addPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addPatientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        addDiagBtn.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        addDiagBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add diag.png"))); // NOI18N
        addDiagBtn.setText("Add Diagnosis Information");
        addDiagBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addDiagBtn.setPreferredSize(new java.awt.Dimension(238, 60));
        addDiagBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDiagBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addDiagBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        hisPatientBtn.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        hisPatientBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rsz_history1.png"))); // NOI18N
        hisPatientBtn.setText("Full History of the Patient");
        hisPatientBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hisPatientBtn.setPreferredSize(new java.awt.Dimension(238, 60));
        hisPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hisPatientBtnActionPerformed(evt);
            }
        });
        getContentPane().add(hisPatientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        updatePatientBtn.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        updatePatientBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rsz_update_details.png"))); // NOI18N
        updatePatientBtn.setText("Update Patient Record");
        updatePatientBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updatePatientBtn.setPreferredSize(new java.awt.Dimension(238, 60));
        updatePatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePatientBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updatePatientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        informationBnt.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        informationBnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rsz_hospital_information.png"))); // NOI18N
        informationBnt.setText("Hospital Information");
        informationBnt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        informationBnt.setPreferredSize(new java.awt.Dimension(238, 60));
        informationBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationBntActionPerformed(evt);
            }
        });
        getContentPane().add(informationBnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        logoutBtn.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        logoutBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutBtn.setLabel("Logout");
        logoutBtn.setPreferredSize(new java.awt.Dimension(238, 60));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.jpg"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really  want to logout Application",
                 "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void swBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swBtnActionPerformed
        if (i == 0) {
            addPatientBtn.setLocation(110, 20);
            addDiagBtn.setLocation(360, 20);
            hisPatientBtn.setLocation(610, 20);
            updatePatientBtn.setLocation(860, 20);
            informationBnt.setLocation(1110, 20);
            logoutBtn.setLocation(1110, 100);
            i = 1;
        } else {
            addPatientBtn.setLocation(20, 120);
            addDiagBtn.setLocation(20, 210);
            hisPatientBtn.setLocation(20, 300);
            updatePatientBtn.setLocation(20, 390);
            informationBnt.setLocation(20, 480);
            logoutBtn.setLocation(20, 570);
            i = 0;
        }
    }//GEN-LAST:event_swBtnActionPerformed

    private void addPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientBtnActionPerformed
        new addNewPatientRecord().setVisible(true);
    }//GEN-LAST:event_addPatientBtnActionPerformed

    private void addDiagBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDiagBtnActionPerformed
        new addDiagnosisInformation().setVisible(true);
    }//GEN-LAST:event_addDiagBtnActionPerformed

    private void hisPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hisPatientBtnActionPerformed
        new fullHistoryOfThePatient().setVisible(true);
    }//GEN-LAST:event_hisPatientBtnActionPerformed

    private void updatePatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePatientBtnActionPerformed
        new updatePatientRecord().setVisible(true);
    }//GEN-LAST:event_updatePatientBtnActionPerformed

    private void informationBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationBntActionPerformed
        new hospitalInformation().setVisible(true);
    }//GEN-LAST:event_informationBntActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDiagBtn;
    private javax.swing.JButton addPatientBtn;
    private javax.swing.JButton hisPatientBtn;
    private javax.swing.JButton informationBnt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton swBtn;
    private javax.swing.JButton updatePatientBtn;
    // End of variables declaration//GEN-END:variables
}
