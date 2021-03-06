/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.reporting;


import business.customer.CustomizedOrder;
import business.customer.CustomizedOrderItem;
import business.customer.MasterOrderList;
import business.customer.OrderAtStore;
import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.ReportingOrganization;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;


/**
 *
 * @author Mitalii
 *
 *
 */
public class ReportingWorkAreaManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReportingWorkAreaManagementJPanel
     */
    private MasterOrderList mod;
    private CustomizedOrder customizedOrder;
    private CustomizedOrderItem customizedOrderItem;
    private OrderAtStore orderAtStore;
    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private Ecosystem business;
    private Organization organization;

    final String applicationTitle = "Hazardous Content Chart";
    final String chartTitle = "Hazardous Content Chart";

    public ReportingWorkAreaManagementJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (ReportingOrganization) organization;
        this.account = account;
        this.enterprise = enterprise;
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

        backJButton7 = new javax.swing.JButton();
        hazardousContentjBtn = new javax.swing.JButton();
        revenueJButton5 = new javax.swing.JButton();
        enterpriseLabel2 = new javax.swing.JLabel();
        enterpriseLabel3 = new javax.swing.JLabel();
        orgValueLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        workREquestJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton7.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        backJButton7.setText("Back");
        backJButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton7ActionPerformed(evt);
            }
        });
        add(backJButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 80, 50));

        hazardousContentjBtn.setBackground(new java.awt.Color(204, 204, 255));
        hazardousContentjBtn.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 18)); // NOI18N
        hazardousContentjBtn.setText("Level of Hazardous Content");
        hazardousContentjBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hazardousContentjBtnActionPerformed(evt);
            }
        });
        add(hazardousContentjBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 260, 80));

        revenueJButton5.setBackground(new java.awt.Color(204, 204, 255));
        revenueJButton5.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 18)); // NOI18N
        revenueJButton5.setText("Revenue ");
        revenueJButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revenueJButton5ActionPerformed(evt);
            }
        });
        add(revenueJButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 280, 160, 270));

        enterpriseLabel2.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        enterpriseLabel2.setText("Enterprise :");
        add(enterpriseLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        enterpriseLabel3.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        enterpriseLabel3.setText("Organization:");
        add(enterpriseLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        orgValueLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        orgValueLabel.setText("<value>");
        add(orgValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 190, -1));

        valueLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 230, -1));

        workREquestJButton.setBackground(new java.awt.Color(204, 204, 255));
        workREquestJButton.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 18)); // NOI18N
        workREquestJButton.setText("Work Requests");
        workREquestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workREquestJButtonActionPerformed(evt);
            }
        });
        add(workREquestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 260, 70));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 18)); // NOI18N
        jButton1.setText("Organization");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 270, 70));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel7.setFont(new java.awt.Font("Palatino", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Reporting Work Area ");
        jPanel1.add(jLabel7);

        jLabel6.setFont(new java.awt.Font("Palatino", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Management");
        jPanel1.add(jLabel6);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton7ActionPerformed

    private void hazardousContentjBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hazardousContentjBtnActionPerformed
        // TODO add your handling code here:

        LeadContentReportJPanel lcjp = new LeadContentReportJPanel(userProcessContainer, mod,business);
        userProcessContainer.add("LeadContentReportJPanel", lcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_hazardousContentjBtnActionPerformed

    private void revenueJButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revenueJButton5ActionPerformed
        // TODO add your handling code here: 
        RevenueReportJPanel rrjp = new RevenueReportJPanel(userProcessContainer, mod, business);
        userProcessContainer.add("LeadContentReportJPanel", rrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

//            JOptionPane.showMessageDialog(null, customizedRevenue, "Warning", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_revenueJButton5ActionPerformed

    private void workREquestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workREquestJButtonActionPerformed
       
        RegulatoryWorkRequestJPanel ojp = new RegulatoryWorkRequestJPanel(userProcessContainer,account,organization,enterprise, business);
        userProcessContainer.add("RegulatoryWorkRequests", ojp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
                                          
    }//GEN-LAST:event_workREquestJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         OrganisationReportJPanel ojp = new OrganisationReportJPanel(userProcessContainer, mod, business);
        userProcessContainer.add("OrganizationReportJPanel", ojp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton7;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JLabel enterpriseLabel3;
    private javax.swing.JButton hazardousContentjBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel orgValueLabel;
    private javax.swing.JButton revenueJButton5;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton workREquestJButton;
    // End of variables declaration//GEN-END:variables
}
