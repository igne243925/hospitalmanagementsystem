/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Mark
 */
public class patientForm extends javax.swing.JFrame {

    /**
     * Creates new form patientForm
     */
    public patientForm() {
        initComponents();
    showDate();
    showTime();
    }
    
    void showDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        datelab.setText(s.format(d));
    }
    
    void showTime(){
        new Timer(0,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s =new SimpleDateFormat("hh:mm:ss a");
                timelab.setText(s.format(d));
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        }).start();
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        gp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ill = new javax.swing.JComboBox<>();
        PI = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        doctor = new javax.swing.JComboBox<>();
        SD = new javax.swing.JTextField();
        datelab = new javax.swing.JLabel();
        timelab = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        add = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("PATIENT FORM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 153));
        jLabel2.setText("Fill out the form:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Name:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));
        getContentPane().add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 279, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Guardian/Parents:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));
        getContentPane().add(gp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 279, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Contact Number:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));
        getContentPane().add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 279, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Illness:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        ill.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        ill.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fever", "Dengue", "Cold & Flu", "Allergies" }));
        getContentPane().add(ill, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));
        getContentPane().add(PI, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 180, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Select Doctor:");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        doctor.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        doctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. Lagumen", "Dr. L.Carungcong", "Dr. S.Carungcong", "Dr. Barretto", "Dr. Santos" }));
        getContentPane().add(doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 108, -1));
        getContentPane().add(SD, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 160, -1));

        datelab.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        datelab.setForeground(new java.awt.Color(255, 0, 204));
        datelab.setText("Date:");
        getContentPane().add(datelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        timelab.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        timelab.setForeground(new java.awt.Color(255, 0, 255));
        timelab.setText("Time:");
        getContentPane().add(timelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/saveee.png"))); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setText("Address:");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 279, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/back.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/close.png"))); // NOI18N
        jLabel9.setText("Close");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, -1, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/8888.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String pname =pn.getText();
        String gname =gp.getText();
        String cnum = cn.getText();
        String adr = add.getText();
        
        PI.setText(ill.getSelectedItem().toString());
        SD.setText(doctor.getSelectedItem().toString());
        
        JOptionPane.showMessageDialog(null, "Patient Name:        " + pname + 
                "\nGuardian Name:   " + gname + 
                "\nContact Number:   "+cnum + 
                "\nAddress:    " + adr +
                "\nIllness:      "+ill.getSelectedItem().toString()+
                "\nSelected Doctor:   "+ doctor.getSelectedItem().toString()+ 
                "\n\nPatient Form Approved!");
        
        try{
            BufferedWriter writer= new BufferedWriter(new FileWriter(".\\Patientform.txt"));
            writer.write("name: "+pname);
            writer.newLine();
            writer.write("Guardians / Parents: " +gname);
            writer.newLine();
            writer.write("Contact Number: " +cnum);
            writer.newLine();
            writer.write("Address" +adr);
            writer.newLine();
            writer.write("Illness: " + ill.getSelectedItem().toString());
            writer.newLine();
            writer.write("Selected Doctor: " +doctor.getSelectedItem().toString());
            writer.newLine();
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new menuPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the application?", "Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
            System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(patientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patientForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PI;
    private javax.swing.JTextField SD;
    private javax.swing.JTextField add;
    private javax.swing.JTextField cn;
    private javax.swing.JLabel datelab;
    private javax.swing.JComboBox<String> doctor;
    private javax.swing.JTextField gp;
    private javax.swing.JComboBox<String> ill;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField pn;
    private javax.swing.JLabel timelab;
    // End of variables declaration//GEN-END:variables
}
