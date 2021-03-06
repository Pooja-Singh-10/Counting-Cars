/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.manufacturerrole;

import business.ecosystem.Ecosystem;
import business.enterprise.CustomerSupportEnterprise;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.ManufactureOrganization;
import business.organization.Organization;
import business.organization.StoreOrganization;
import business.useraccount.UserAccount;
import business.workqueue.CustomerCustomizedWorkRequest;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pooja
 */
public class ManufacturerWorkRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManufacturerWorkRequestsJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private ManufactureOrganization organization;
    private UserAccount userAccount;
    private Ecosystem business;

    public ManufacturerWorkRequestsJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = (ManufactureOrganization) organization;
        this.userAccount = userAccount;
        this.business = business;

        populateDesignerWorkRequestTable();

        //add enterprise and organization name to label
        valueLabel.setText(enterprise.getName());
        orgValueLabel.setText(organization.getName());
    }

    public void populateDesignerWorkRequestTable() {
        DefaultTableModel model = (DefaultTableModel) designerWorkRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof CustomerCustomizedWorkRequest) {
                Object[] row = new Object[5];
                CustomerCustomizedWorkRequest cw = (CustomerCustomizedWorkRequest) wr;
                row[0] = cw;
                row[1] = cw.getDesignerSender() == null ? null : cw.getDesignerSender().getEmployee().getName();
                row[2] = cw.getManufacturerReceiver() == null ? null : cw.getManufacturerReceiver().getEmployee().getName();
                row[3] = cw.getRequestDate();
                row[4] = cw.getStatus();
                model.addRow(row);
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshTestJButton = new javax.swing.JButton();
        showroomRequestJButton = new javax.swing.JButton();
        requestInventoryJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        designerWorkRequestJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        orgValueLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        assignToMeJButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshTestJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 170, 180, 59));

        showroomRequestJButton.setBackground(new java.awt.Color(204, 204, 255));
        showroomRequestJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        showroomRequestJButton.setText("<< Send the Order to Showroom");
        showroomRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showroomRequestJButtonActionPerformed(evt);
            }
        });
        add(showroomRequestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 620, 370, 49));

        requestInventoryJButton.setBackground(new java.awt.Color(204, 204, 255));
        requestInventoryJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        requestInventoryJButton.setText("Request Inventory>>");
        requestInventoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestInventoryJButtonActionPerformed(evt);
            }
        });
        add(requestInventoryJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 610, 250, 47));

        designerWorkRequestJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        designerWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Sender", "Receiver", "RequestDate", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(designerWorkRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 850, 290));

        backJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 60));

        jLabel3.setFont(new java.awt.Font("Palatino", 1, 24)); // NOI18N
        jLabel3.setText("Designers Work Queue");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 280, 50));

        enterpriseLabel1.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Organization:");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, 26));

        enterpriseLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 110, 18));

        orgValueLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        orgValueLabel.setText("<value>");
        add(orgValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 220, 26));

        valueLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 220, 26));

        assignToMeJButton1.setBackground(new java.awt.Color(204, 204, 255));
        assignToMeJButton1.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        assignToMeJButton1.setText("Accept Request");
        assignToMeJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeJButton1ActionPerformed(evt);
            }
        });
        add(assignToMeJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 610, -1, 49));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Palatino", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manufacture Staff Work Area");
        jPanel1.add(jLabel1);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1860, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateDesignerWorkRequestTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void showroomRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showroomRequestJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = designerWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }

        CustomerCustomizedWorkRequest request = (CustomerCustomizedWorkRequest) designerWorkRequestJTable.getValueAt(selectedRow, 0);
        request.setStatus("Manufactured");
        request.setManufacturerSender(userAccount);
        request.setStoreReceiver(null);
        userAccount.getWorkQueue().getWorkRequestList().add(request);
      
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof CustomerSupportEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof StoreOrganization) {
                            
                            organization.getWorkQueue().getWorkRequestList().add(request);

                        }
                    }

                }
            }
        }
        populateDesignerWorkRequestTable();

        JOptionPane.showMessageDialog(null, "Order sent to Showroom", "Info", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_showroomRequestJButtonActionPerformed

    private void requestInventoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestInventoryJButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestInventoryJPanel", new InventoryRequestsJPanel(userProcessContainer, userAccount, enterprise, organization));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestInventoryJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void assignToMeJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeJButton1ActionPerformed
        int selectedRow = designerWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }

        CustomerCustomizedWorkRequest request = (CustomerCustomizedWorkRequest) designerWorkRequestJTable.getValueAt(selectedRow, 0);

        request.setManufacturerReceiver(userAccount);
        request.setStatus("Pending");

        populateDesignerWorkRequestTable();

        // TODO add your handling code here:
    }//GEN-LAST:event_assignToMeJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeJButton1;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable designerWorkRequestJTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel orgValueLabel;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestInventoryJButton;
    private javax.swing.JButton showroomRequestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
