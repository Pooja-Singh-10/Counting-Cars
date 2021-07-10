/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.customer;

import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.organization.CustomerOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import business.workqueue.CustomerCustomizedWorkRequest;
import business.workqueue.OrderAtStoreWorkRequest;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pooja
 */
public class CustomerOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerOrdersJPanel
     */
    private JPanel userProcessContainer;
    private CustomerOrganization customerOrganization;
    private UserAccount account;
    private Enterprise enterprise;
    private Ecosystem business;

    public CustomerOrdersJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.customerOrganization = (CustomerOrganization) organization;
        this.account = account;
        this.enterprise = enterprise;
        this.business = business;
        customerTextField.setText(account.getUsername());

        populateCustomerTable();
        populateStoreOrdersTable();
    }

    public void populateCustomerTable() {
        DefaultTableModel model = (DefaultTableModel) customisedOrderJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof CustomerCustomizedWorkRequest) {
                Object[] row = new Object[4];
                CustomerCustomizedWorkRequest cw = (CustomerCustomizedWorkRequest) wr;
                row[0] = cw;
                row[1] = cw.getStoreSender() == null ? null : cw.getStoreSender().getEmployee().getName();
                row[2] = cw.getRequestDate();
                row[3] = cw.getStatus();
                model.addRow(row);
            }

        }
    }

    public void populateStoreOrdersTable() {
        DefaultTableModel model = (DefaultTableModel) storeOrdersJTable.getModel();

        model.setRowCount(0);
        {
            for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
                if (wr instanceof OrderAtStoreWorkRequest) {
                    Object[] row = new Object[4];
                    OrderAtStoreWorkRequest oas = (OrderAtStoreWorkRequest) wr;
                    row[0] = oas;
                    row[1] = oas.getSender().getEmployee().getName();
                    row[2] = oas.getRequestDate();
                    row[3] = oas.getStatus();
                    model.addRow(row);

                }
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

        jScrollPane2 = new javax.swing.JScrollPane();
        customisedOrderJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        storeOrdersJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        customerTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        customerOrdersjProgressBar = new javax.swing.JProgressBar();
        checkOrderStatusJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customisedOrderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "OrderID", "Sender", "RequestDate", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(customisedOrderJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 790, 170));

        refreshJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 279, 170, 40));

        backJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, 50));

        jLabel2.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jLabel2.setText("Customized Orders");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 171, 70));

        storeOrdersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "OrderID", "Sender", "RequestDate", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(storeOrdersJTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 660, 800, 170));

        jLabel3.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jLabel3.setText("Store Orders");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, 150, 19));

        customerTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        customerTextField.setEnabled(false);
        customerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerTextFieldActionPerformed(evt);
            }
        });
        add(customerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 120, 30));

        jLabel8.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jLabel8.setText("Hello!");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        customerOrdersjProgressBar.setBackground(new java.awt.Color(255, 153, 153));
        customerOrdersjProgressBar.setStringPainted(true);
        add(customerOrdersjProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 340, 170, -1));

        checkOrderStatusJButton.setBackground(new java.awt.Color(204, 204, 255));
        checkOrderStatusJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        checkOrderStatusJButton.setText("Check Order Status");
        checkOrderStatusJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOrderStatusJButtonActionPerformed(evt);
            }
        });
        add(checkOrderStatusJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 360, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel4.setFont(new java.awt.Font("Palatino", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("My Orders");
        jPanel1.add(jLabel4);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/customer/gender-neutral.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 50, 250, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateCustomerTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void customerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerTextFieldActionPerformed

    }//GEN-LAST:event_customerTextFieldActionPerformed

    private void checkOrderStatusJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOrderStatusJButtonActionPerformed
        //  progress bar used to check the order status
        int selectedRow = customisedOrderJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a Row to check progress", "Warning", JOptionPane.WARNING_MESSAGE);

        } else {
            CustomerCustomizedWorkRequest cw = (CustomerCustomizedWorkRequest) customisedOrderJTable.getValueAt(selectedRow, 0);
            if (cw.getStatus().equalsIgnoreCase("Placed")) {
                customerOrdersjProgressBar.setValue(15);
            } else if (cw.getStatus().equalsIgnoreCase("Order Final")) {
                customerOrdersjProgressBar.setValue(30);
            } else if (cw.getStatus().equalsIgnoreCase("Design Order")) {
                customerOrdersjProgressBar.setValue(50);
            } else if (cw.getStatus().equalsIgnoreCase("Manufacture Order")) {
                customerOrdersjProgressBar.setValue(65);
            } else if (cw.getStatus().equalsIgnoreCase("Manufactured")) {
                customerOrdersjProgressBar.setValue(70);
            } else if (cw.getStatus().equalsIgnoreCase("Order Completed")) {
                customerOrdersjProgressBar.setValue(80);
            } else if (cw.getStatus().equalsIgnoreCase("Order Ready")) {
                customerOrdersjProgressBar.setValue(100);
            }

        }
    }//GEN-LAST:event_checkOrderStatusJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton checkOrderStatusJButton;
    private javax.swing.JProgressBar customerOrdersjProgressBar;
    private javax.swing.JTextField customerTextField;
    private javax.swing.JTable customisedOrderJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable storeOrdersJTable;
    // End of variables declaration//GEN-END:variables
}
