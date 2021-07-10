/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.carstaffworkarea;

import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.organization.CarCompanyStaffOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shreya
 */
public class CarStaffWorkAreaManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CarStaffWorkAreaManagementJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private CarCompanyStaffOrganization organization;
    private UserAccount userAccount;
    private Ecosystem business;

    public CarStaffWorkAreaManagementJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = (CarCompanyStaffOrganization) organization;
        this.userAccount = account;
        this.business = business;
        valueLabel.setText(enterprise.getName());
        orgValueLabel.setText(organization.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        orgValueLabel = new javax.swing.JLabel();
        CreateCrsJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 40));

        enterpriseLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, 30));

        enterpriseLabel1.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Organization:");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, 26));

        valueLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 250, 26));

        orgValueLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        orgValueLabel.setText("<value>");
        add(orgValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 300, 26));

        CreateCrsJButton.setBackground(new java.awt.Color(204, 204, 255));
        CreateCrsJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        CreateCrsJButton.setText("Place Car Requests");
        CreateCrsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateCrsJButtonActionPerformed(evt);
            }
        });
        add(CreateCrsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 450, 140));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Palatino", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Car Staff Work Area ");
        jPanel1.add(jLabel5);

        jLabel4.setFont(new java.awt.Font("Palatino", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Management");
        jPanel1.add(jLabel4);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2100, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/carstaffworkarea/cutecar.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 130, 200, 310));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void CreateCrsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateCrsJButtonActionPerformed
        // TODO add your handling code here:
        CarStaffWorkAreaJPanel designJPanel = new CarStaffWorkAreaJPanel(userProcessContainer, userAccount, organization, enterprise, business);
        userProcessContainer.add("designJPanel", designJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_CreateCrsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateCrsJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel orgValueLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}