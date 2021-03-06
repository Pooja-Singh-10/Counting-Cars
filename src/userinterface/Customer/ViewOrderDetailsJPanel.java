/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.customer;

import business.customer.CustomerCar;
import business.customer.CustomizedOrderItem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Pooja
 */
public class ViewOrderDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BuyAtStoreJPanel
     */
    private JPanel userProcessContainer;
    private CustomizedOrderItem orderItem;

    public ViewOrderDetailsJPanel(JPanel userProcessContainer, CustomizedOrderItem orderItem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.orderItem = orderItem;
        //  setting the values of the customised car
        CustomerCar customizeCar = orderItem.getCustomizeProduct();

        carTypejTextField.setText(customizeCar.getCarType());
        fuelTypejTextField.setText(customizeCar.getFuelType());
        airFilterTextField.setText(customizeCar.getAirFilters());
        batteryTypejTextField8.setText(customizeCar.getBatteryType());
        wheelTypejTextField.setText(customizeCar.getWheelType());
        colorjTextField.setText(customizeCar.getCarColor());
        priceTypeJTextField.setText(customizeCar.getInteriorType());
        bodyjTextField.setText(customizeCar.getCarBody());
        engineTypejTextField.setText(customizeCar.getEngineType());
        interiorTypejTextField1.setText(customizeCar.getInteriorType());
        priceTypeJTextField.setText(String.valueOf(customizeCar.getPrice()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        priceTypeJTextField = new javax.swing.JTextField();
        carTypejTextField = new javax.swing.JTextField();
        fuelTypejTextField = new javax.swing.JTextField();
        engineTypejTextField = new javax.swing.JTextField();
        airFilterTextField = new javax.swing.JTextField();
        bodyjTextField = new javax.swing.JTextField();
        colorjTextField = new javax.swing.JTextField();
        wheelTypejTextField = new javax.swing.JTextField();
        batteryTypejTextField8 = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        interiorTypejTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        jLabel2.setText("Car Type ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 80, 20));

        jLabel3.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        jLabel3.setText("Engine Type ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        jLabel4.setText("Air Filter ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 80, 20));

        jLabel5.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        jLabel5.setText("Body of the Car ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, -1, 20));

        jLabel6.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        jLabel6.setText("Color ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        jLabel7.setText("Wheel Type");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        jLabel9.setText("Battery Type");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, -1, -1));

        jLabel10.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        jLabel10.setText("Price");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, -1, -1));

        jLabel11.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        jLabel11.setText("Fuel Type");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, -1, -1));

        priceTypeJTextField.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        priceTypeJTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        priceTypeJTextField.setEnabled(false);
        add(priceTypeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 520, 150, -1));

        carTypejTextField.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        carTypejTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        carTypejTextField.setEnabled(false);
        add(carTypejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, 150, -1));

        fuelTypejTextField.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        fuelTypejTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        fuelTypejTextField.setEnabled(false);
        add(fuelTypejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 150, -1));

        engineTypejTextField.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        engineTypejTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        engineTypejTextField.setEnabled(false);
        add(engineTypejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, 150, -1));

        airFilterTextField.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        airFilterTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        airFilterTextField.setEnabled(false);
        add(airFilterTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, 150, -1));

        bodyjTextField.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        bodyjTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        bodyjTextField.setEnabled(false);
        add(bodyjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 320, 150, -1));

        colorjTextField.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        colorjTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        colorjTextField.setEnabled(false);
        add(colorjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 150, -1));

        wheelTypejTextField.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        wheelTypejTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        wheelTypejTextField.setEnabled(false);
        add(wheelTypejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 400, 150, -1));

        batteryTypejTextField8.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        batteryTypejTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        batteryTypejTextField8.setEnabled(false);
        add(batteryTypejTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, 150, -1));

        backJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 120, 40));

        jLabel12.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        jLabel12.setText("Interior Type");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, -1, -1));

        interiorTypejTextField1.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        interiorTypejTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        interiorTypejTextField1.setEnabled(false);
        add(interiorTypejTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 480, 150, -1));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Palatino", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VERIFY  THE DETAILS");
        jPanel1.add(jLabel1);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/customer/ccbluebig.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airFilterTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField batteryTypejTextField8;
    private javax.swing.JTextField bodyjTextField;
    private javax.swing.JTextField carTypejTextField;
    private javax.swing.JTextField colorjTextField;
    private javax.swing.JTextField engineTypejTextField;
    private javax.swing.JTextField fuelTypejTextField;
    private javax.swing.JTextField interiorTypejTextField1;
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
    private javax.swing.JTextField priceTypeJTextField;
    private javax.swing.JTextField wheelTypejTextField;
    // End of variables declaration//GEN-END:variables
}
