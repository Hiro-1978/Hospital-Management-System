package hospital.management.system;


import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        logInBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 432, -1, 30));

        userField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 250, -1));

        PasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 250, -1));

        logInBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logInBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N
        logInBtn.setText("Login");
        logInBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 110, -1));

        closeBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Close.png"))); // NOI18N
        closeBtn.setText("Close");
        closeBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, 110, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login Background final.PNG"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really  want to Close Application"
                ,"Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_closeBtnActionPerformed

    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
       /* if (txtuname.getText().trim().isEmpty() && txtpword.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ชื่อหรือรหัสผ่านผู้ใช้ไม่ได้กรอก", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtuname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ชื่อหรือรหัสผ่านผู้ใช้ไม่ได้กรอก", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtpword.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ชื่อหรือรหัสผ่านผู้ใช้ไม่ได้กรอก", "error!!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String sql = "Select * from admin where username=? and password=?";
                PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.setString(1, txtuname.getText());
                pst.setString(2, txtpword.getText());
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Petfriends Library Book ยินดีต้อนรับ");
                    setVisible(false);
                    Loading ld = new Loading();
                    ld.setUpLoading();
                    ld.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "ชื่อและรหัสผ่านไม่ถูกต้อง", "Warning", JOptionPane.WARNING_MESSAGE);
                    txtuname.setText("");
                    txtpword.setText("");
                }
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } */
       if(userField.getText().equals("admin") && PasswordField.getText().equals("pass")){
            setVisible(false);
            new home().setVisible(true);
       }else{
           JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
       }
    }//GEN-LAST:event_logInBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logInBtn;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
