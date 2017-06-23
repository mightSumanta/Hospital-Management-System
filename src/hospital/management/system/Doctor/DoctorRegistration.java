/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital.management.system.Doctor;

import hospital.management.system.Database;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Sumanta
 */
public class DoctorRegistration extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /** Creates new form DoctorRegistration */
    public DoctorRegistration() {
        initComponents();
        conn = Database.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_name = new javax.swing.JTextField();
        txt_loginId = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_confirmPassword = new javax.swing.JPasswordField();
        txt_department = new javax.swing.JTextField();
        txt_specialist = new javax.swing.JTextField();
        txt_contactNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setLayout(null);
        jPanel1.add(txt_name);
        txt_name.setBounds(170, 200, 181, 34);
        jPanel1.add(txt_loginId);
        txt_loginId.setBounds(170, 250, 181, 33);
        jPanel1.add(txt_password);
        txt_password.setBounds(170, 300, 181, 33);
        jPanel1.add(txt_confirmPassword);
        txt_confirmPassword.setBounds(170, 350, 181, 30);
        jPanel1.add(txt_department);
        txt_department.setBounds(570, 200, 176, 34);
        jPanel1.add(txt_specialist);
        txt_specialist.setBounds(570, 250, 176, 34);
        jPanel1.add(txt_contactNo);
        txt_contactNo.setBounds(570, 300, 176, 40);

        jLabel1.setText("Contact No");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(450, 300, 110, 40);

        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 196, 110, 40);

        jLabel3.setText("Login Id");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 250, 110, 40);

        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 300, 110, 40);

        jLabel5.setText("Confirm Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 350, 110, 40);

        jLabel6.setText("Department");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(450, 200, 110, 40);

        jLabel7.setText("Specialization");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(450, 250, 110, 40);

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(440, 410, 120, 60);

        jButton2.setText("Clear Form");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(230, 412, 120, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int x = JOptionPane.showConfirmDialog(null, "Confirm deletion task ?", "Delete Record", JOptionPane.YES_NO_OPTION);
        if (txt_password.getText().equals(txt_confirmPassword.getText()) && x == 0) {
            try {
                Calendar cal = new GregorianCalendar();
                int month = cal.get(Calendar.MONTH);
                int year = cal.get(Calendar.YEAR);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                String sql = "insert into Doctor "
                        + "(name, loginId, password, department, specialization, contactNo) "
                        + "values (?, ?, ?, ?, ?, ?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_name.getText());
                pst.setString(2, txt_loginId.getText());
                pst.setString(3, txt_password.getText());
                pst.setString(4, txt_department.getText());
                pst.setString(5, txt_specialist.getText());
                pst.setString(6, txt_contactNo.getText());

                pst.execute();
                JOptionPane.showMessageDialog(null, "Data is saved successfully");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            finally {
                try {
//                   rs.close();
                    pst.close();
                }
                catch (Exception e) {
                   JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        else {
                JOptionPane.showMessageDialog(null, "Passwords Don't match");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        txt_name.setText("");
        txt_confirmPassword.setText("");
        txt_contactNo.setText("");
        txt_department.setText("");
        txt_loginId.setText("");
        txt_password.setText("");
        txt_specialist.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoctorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_confirmPassword;
    private javax.swing.JTextField txt_contactNo;
    private javax.swing.JTextField txt_department;
    private javax.swing.JTextField txt_loginId;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_specialist;
    // End of variables declaration//GEN-END:variables

}