/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system.Patient;

import hospital.management.system.Database;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Sumanta
 */
public class PatientInformationWithoutLogin extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /**
     * Creates new form PatientInformation
     */
    public PatientInformationWithoutLogin() {
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
        jLabel1 = new javax.swing.JLabel();
        txt_patientId = new javax.swing.JTextField();
        btn_getInfo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_patient = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        combo_patientType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setLayout(null);

        jLabel1.setText("Patient Id");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 90, 53, 33);
        jPanel1.add(txt_patientId);
        txt_patientId.setBounds(167, 87, 198, 40);

        btn_getInfo.setText("Get Info");
        btn_getInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_getInfoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_getInfo);
        btn_getInfo.setBounds(629, 82, 109, 50);

        table_patient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table_patient.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table_patient.setMinimumSize(new java.awt.Dimension(45, 48));
        jScrollPane1.setViewportView(table_patient);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 140, 669, 328);

        jLabel2.setText("Select Patient Type");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(377, 87, 109, 33);

        combo_patientType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In Patient", "Out Patient" }));
        jPanel1.add(combo_patientType);
        combo_patientType.setBounds(492, 86, 125, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_getInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_getInfoActionPerformed
        // TODO add your handling code here:
        
        if (combo_patientType.getSelectedItem().equals("In Patient")) {
            try {
                currentPatientType = "In Patient";
                
                String sql = "Select * from InPatient where patientId = ? ";

                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_patientId.getText());
                rs = pst.executeQuery();

                ResultSetMetaData metaData = rs.getMetaData();

                Vector<String> columnNames = new Vector<String>();
                int columnCount  = metaData.getColumnCount();

                columnNames.add("Name");
                columnNames.add("Id");
                columnNames.add("Gender");
                columnNames.add("Age");
                columnNames.add("Contact No");
                columnNames.add("Marital Status");
                columnNames.add("Occupation");
                columnNames.add("Admission Id");
                columnNames.add("Department");
                columnNames.add("Ward No");
                columnNames.add("Bed No");
                columnNames.add("Doctor");
                columnNames.add("Adimission Date");

                Vector<Vector<Object>> data = new Vector<Vector<Object>>();
                while (rs.next()) {

                    Vector<Object> vector = new Vector<Object>();
                    for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                        vector.add(rs.getObject(columnIndex));
                    }
                    data.add(vector);
                }
                DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
                table_patient.setModel(tableModel);

                for (int col = 0; col < table_patient.getColumnCount(); col++) {
                    table_patient.getColumnModel().getColumn(col).setPreferredWidth(150);
                }

                }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Something happened");
            }
            finally {
                try {
                    pst.close();
                    rs.close();
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Something happened, oh God");
                }
            }
        }
        else if (combo_patientType.getSelectedItem().equals("Out Patient")) {
            try {
                currentPatientType = "Out Patient";
                
                String sql = "Select * from OutPatient where patientId = ? ";

                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_patientId.getText());
                rs = pst.executeQuery();

                ResultSetMetaData metaData = rs.getMetaData();

                Vector<String> columnNames = new Vector<String>();
                int columnCount  = metaData.getColumnCount();

                columnNames.add("Name");
                columnNames.add("Patient Id");
                columnNames.add("Gender");
                columnNames.add("Contact No");
                columnNames.add("Appointment Date");
                columnNames.add("Department");
                columnNames.add("Doctor");
                columnNames.add("Admission Date");

                Vector<Vector<Object>> data = new Vector<Vector<Object>>();
                while (rs.next()) {

                    Vector<Object> vector = new Vector<Object>();
                    for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                        vector.add(rs.getObject(columnIndex));
                    }
                    data.add(vector);
                }
                DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
                table_patient.setModel(tableModel);

                for (int col = 0; col < table_patient.getColumnCount(); col++) {
                    table_patient.getColumnModel().getColumn(col).setPreferredWidth(150);
                }
            
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Something happened");
            }
            finally {
                try {
                    pst.close();
                    rs.close();
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Something happened, oh God");
                }
            }
        }
    }//GEN-LAST:event_btn_getInfoActionPerformed

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
            java.util.logging.Logger.getLogger(PatientInformationWithoutLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientInformationWithoutLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientInformationWithoutLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientInformationWithoutLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientInformationWithoutLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_getInfo;
    private javax.swing.JComboBox<String> combo_patientType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_patient;
    private javax.swing.JTextField txt_patientId;
    // End of variables declaration//GEN-END:variables
    private String currentPatientType;
}