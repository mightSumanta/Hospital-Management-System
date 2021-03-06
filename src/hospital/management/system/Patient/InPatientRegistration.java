/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system.Patient;
import hospital.management.system.Database;
import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.*;


/**
 *
 * @author Sumanta
 */
public class InPatientRegistration extends javax.swing.JFrame {

    /**
     * Creates new form InPatientRegistration
     */
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public InPatientRegistration() {
        initComponents();
        conn = Database.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_patientName = new javax.swing.JTextField();
        txt_patientId = new javax.swing.JTextField();
        txt_comboGender = new javax.swing.JComboBox<>();
        txt_age = new javax.swing.JTextField();
        txt_contactNo = new javax.swing.JTextField();
        txt_comboMaritalStatus = new javax.swing.JComboBox<>();
        txt_occupation = new javax.swing.JTextField();
        txt_admitId = new javax.swing.JTextField();
        txt_department = new javax.swing.JTextField();
        txt_wardNo = new javax.swing.JTextField();
        txt_bedNo = new javax.swing.JTextField();
        txt_doctor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_buttonRegister = new javax.swing.JButton();
        txt_buttonClearForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);
        jPanel1.add(txt_patientName);
        txt_patientName.setBounds(150, 180, 170, 30);
        jPanel1.add(txt_patientId);
        txt_patientId.setBounds(150, 220, 170, 30);

        txt_comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(txt_comboGender);
        txt_comboGender.setBounds(150, 260, 90, 30);
        jPanel1.add(txt_age);
        txt_age.setBounds(150, 300, 170, 30);
        jPanel1.add(txt_contactNo);
        txt_contactNo.setBounds(150, 340, 170, 30);

        txt_comboMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Married", "Un Married" }));
        jPanel1.add(txt_comboMaritalStatus);
        txt_comboMaritalStatus.setBounds(150, 380, 90, 30);
        jPanel1.add(txt_occupation);
        txt_occupation.setBounds(590, 180, 150, 30);
        jPanel1.add(txt_admitId);
        txt_admitId.setBounds(590, 220, 150, 30);
        jPanel1.add(txt_department);
        txt_department.setBounds(590, 260, 150, 30);

        txt_wardNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_wardNoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_wardNo);
        txt_wardNo.setBounds(590, 300, 150, 30);
        jPanel1.add(txt_bedNo);
        txt_bedNo.setBounds(590, 340, 150, 30);
        jPanel1.add(txt_doctor);
        txt_doctor.setBounds(590, 380, 150, 30);

        jLabel1.setText("Gender");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 260, 82, 24);

        jLabel2.setText("Patient Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 180, 82, 24);

        jLabel3.setText("Marital Status");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 380, 82, 24);

        jLabel4.setText("Patient ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 220, 82, 24);

        jLabel5.setText("Age");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 300, 82, 24);

        jLabel6.setText("Contact No.");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 340, 82, 24);

        jLabel7.setText("Department");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(490, 260, 82, 24);

        jLabel8.setText("Occupation");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(490, 180, 82, 24);

        jLabel9.setText("Doctor");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(490, 380, 82, 24);

        jLabel10.setText("Admission ID");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(490, 220, 82, 24);

        jLabel11.setText("Ward No.");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(490, 300, 82, 24);

        jLabel12.setText("Bed No.");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(490, 340, 82, 24);

        txt_buttonRegister.setText("Register");
        txt_buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buttonRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(txt_buttonRegister);
        txt_buttonRegister.setBounds(410, 470, 150, 60);

        txt_buttonClearForm.setText("Clear Form");
        txt_buttonClearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buttonClearFormActionPerformed(evt);
            }
        });
        jPanel1.add(txt_buttonClearForm);
        txt_buttonClearForm.setBounds(260, 470, 150, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_wardNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_wardNoActionPerformed

    }//GEN-LAST:event_txt_wardNoActionPerformed

    private void txt_buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buttonRegisterActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Confirm registration task ?", "Register Record", JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            try {
                Calendar cal = new GregorianCalendar();
                int month = cal.get(Calendar.MONTH);
                int year = cal.get(Calendar.YEAR);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                currentDate = day + ":" + month + ":" + year; 
                String sql = "insert into InPatient "
                        + "(patientName, patientId, gender, Age, contactNo, maritalStatus, "
                        + "occupation, admidId, department, wardNo, bedNo, doctor, admitDate) "
                        + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_patientName.getText());
                pst.setString(2, txt_patientId.getText());
                pst.setString(3, txt_comboGender.getSelectedItem().toString());
                pst.setString(4, txt_age.getText());
                pst.setString(5, txt_contactNo.getText());
                pst.setString(6, txt_comboMaritalStatus.getSelectedItem().toString());
                pst.setString(7, txt_occupation.getText());
                pst.setString(8, txt_admitId.getText());
                pst.setString(9, txt_department.getText());
                pst.setString(10, txt_wardNo.getText());
                pst.setString(11, txt_bedNo.getText());
                pst.setString(12, txt_doctor.getText());
                pst.setString(13, currentDate);

                pst.execute();
                JOptionPane.showMessageDialog(null, "Data is saved successfully");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            finally {
                try {
    //                rs.close();
                    pst.close();
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_txt_buttonRegisterActionPerformed

    private void txt_buttonClearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buttonClearFormActionPerformed
        // TODO add your handling code here:
        txt_admitId.setText("");
        txt_age.setText("");
        txt_bedNo.setText("");
        txt_contactNo.setText("");
        txt_department.setText("");
        txt_doctor.setText("");
        txt_occupation.setText("");
        txt_patientId.setText("");
        txt_patientName.setText("");
        txt_wardNo.setText("");

    }//GEN-LAST:event_txt_buttonClearFormActionPerformed

    
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
            java.util.logging.Logger.getLogger(InPatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InPatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InPatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InPatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InPatientRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_admitId;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_bedNo;
    private javax.swing.JButton txt_buttonClearForm;
    private javax.swing.JButton txt_buttonRegister;
    private javax.swing.JComboBox<String> txt_comboGender;
    private javax.swing.JComboBox<String> txt_comboMaritalStatus;
    private javax.swing.JTextField txt_contactNo;
    private javax.swing.JTextField txt_department;
    private javax.swing.JTextField txt_doctor;
    private javax.swing.JTextField txt_occupation;
    private javax.swing.JTextField txt_patientId;
    private javax.swing.JTextField txt_patientName;
    private javax.swing.JTextField txt_wardNo;
    // End of variables declaration//GEN-END:variables
    private String currentDate;
}

