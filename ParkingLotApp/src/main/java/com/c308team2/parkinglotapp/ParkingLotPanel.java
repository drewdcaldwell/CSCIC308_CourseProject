/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.c308team2.parkinglotapp;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author dustt
 */
public class ParkingLotPanel extends javax.swing.JPanel {
    private ParkingLot currentLot;
    private User currResUser;
    /**
     * Creates new form ParkingLotPanel
     */
    public ParkingLotPanel() {
        if(currentLot == null) currentLot = new ParkingLot("Test Lot", "Test Address", 25, 100);
        initComponents();
    }
    
    public void updateLot(ParkingLot parkingLot){
        currentLot = parkingLot;
        updateInfo();
    }
    
    public void updateInfo(){
        lotNameLabel.setText(currentLot.getLotName());
        lotAddressLabel.setText(currentLot.getAddress());
        totalSpacesNumber.setText("" + currentLot.getTotalSpaces());
        emptySpacesNumber.setText("" + currentLot.getEmptySpaces());
        User currentUser = Session.getUser();
        System.out.println("Current user: " + currentUser.getFirstName());
        if(currentLot.checkReservation(currentUser)){
            System.out.println("Reservation found");
            makeReservationButton.setEnabled(false);
            cancelReservationButton.setEnabled(true);
            reservationInfoLabel.setText("You already have a reservation.");
        } else if(currentLot.getEmptySpaces() == 0){
            makeReservationButton.setEnabled(false);
            cancelReservationButton.setEnabled(false);
            reservationInfoLabel.setText("Sorry, this lot is full.");
        } else {
            System.out.println("No Reservation found");
            makeReservationButton.setEnabled(true);
            cancelReservationButton.setEnabled(false);
            reservationInfoLabel.setText("Would you like to make a reservation?");
        }
        
        // check if currentUser is admin or in staff list
        if(currentUser.getUserType() >= 2 || currentLot.checkStaff(currentUser)) {
            // show staff buttons
            manageReservationsButton.setVisible(true);
            incrementButton.setVisible(true);
            decrementButton.setVisible(true);
        } else {
            // hide staff buttons
            manageReservationsButton.setVisible(false);
            incrementButton.setVisible(false);
            decrementButton.setVisible(false);
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

        reservationDialog = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationList = new javax.swing.JList<>();
        confirmDialog = new javax.swing.JDialog();
        nameLabel = new javax.swing.JLabel();
        customNameLabel = new javax.swing.JLabel();
        plateLabel = new javax.swing.JLabel();
        customPlateLabel = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        lotNameLabel = new javax.swing.JLabel();
        lotAddressLabel = new javax.swing.JLabel();
        totalSpacesLabel = new javax.swing.JLabel();
        totalSpacesNumber = new javax.swing.JLabel();
        emptySpacesLabel = new javax.swing.JLabel();
        emptySpacesNumber = new javax.swing.JLabel();
        reservationsLabel = new javax.swing.JLabel();
        makeReservationButton = new javax.swing.JButton();
        cancelReservationButton = new javax.swing.JButton();
        backButtonLabel = new javax.swing.JLabel();
        reservationInfoLabel = new javax.swing.JLabel();
        incrementButton = new javax.swing.JButton();
        decrementButton = new javax.swing.JButton();
        manageReservationsButton = new javax.swing.JButton();

        reservationDialog.setTitle("Reservation List");
        reservationDialog.setAlwaysOnTop(true);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(720, 150));

        reservationList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                reservationListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(reservationList);

        javax.swing.GroupLayout reservationDialogLayout = new javax.swing.GroupLayout(reservationDialog.getContentPane());
        reservationDialog.getContentPane().setLayout(reservationDialogLayout);
        reservationDialogLayout.setHorizontalGroup(
            reservationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
        );
        reservationDialogLayout.setVerticalGroup(
            reservationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservationDialogLayout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        confirmDialog.setTitle("Reservation Details");
        confirmDialog.setAlwaysOnTop(true);

        nameLabel.setText("Name:");

        customNameLabel.setText("First Last");

        plateLabel.setText("Plate Number:");

        customPlateLabel.setText("123ABC");

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout confirmDialogLayout = new javax.swing.GroupLayout(confirmDialog.getContentPane());
        confirmDialog.getContentPane().setLayout(confirmDialogLayout);
        confirmDialogLayout.setHorizontalGroup(
            confirmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(confirmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(confirmDialogLayout.createSequentialGroup()
                        .addGroup(confirmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(customPlateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(confirmDialogLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(confirmButton)
                .addGap(18, 18, 18)
                .addComponent(cancelButton)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        confirmDialogLayout.setVerticalGroup(
            confirmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmDialogLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customNameLabel)
                .addGap(24, 24, 24)
                .addComponent(plateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPlateLabel)
                .addGap(18, 18, 18)
                .addGroup(confirmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(cancelButton))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setPreferredSize(new java.awt.Dimension(1080, 720));

        lotNameLabel.setFont(new java.awt.Font("Malgun Gothic", 0, 48)); // NOI18N
        lotNameLabel.setText("Parking Lot Name");

        lotAddressLabel.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        lotAddressLabel.setText("12345 Lot Address, City");

        totalSpacesLabel.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        totalSpacesLabel.setText("Total Spaces:");

        totalSpacesNumber.setFont(new java.awt.Font("Malgun Gothic", 0, 36)); // NOI18N
        totalSpacesNumber.setText("100");

        emptySpacesLabel.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        emptySpacesLabel.setText("Empty Spaces:");

        emptySpacesNumber.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        emptySpacesNumber.setText("25");

        reservationsLabel.setText("Reservations:");

        makeReservationButton.setText("Reserve a Spot");
        makeReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeReservationButtonActionPerformed(evt);
            }
        });

        cancelReservationButton.setText("Cancel Reservation");
        cancelReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelReservationButtonActionPerformed(evt);
            }
        });

        backButtonLabel.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        backButtonLabel.setForeground(new java.awt.Color(0, 102, 255));
        backButtonLabel.setText("< Back");
        backButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonLabelMouseClicked(evt);
            }
        });

        reservationInfoLabel.setText("Make a reservation.");

        incrementButton.setText("Increment Empty Spaces (Car Leaving)");
        incrementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incrementButtonActionPerformed(evt);
            }
        });

        decrementButton.setText("Decrement Empty Spaces (Car Entering)");
        decrementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decrementButtonActionPerformed(evt);
            }
        });

        manageReservationsButton.setText("Manage Reservations");
        manageReservationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageReservationsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reservationsLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lotNameLabel)
                            .addComponent(lotAddressLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emptySpacesNumber)
                            .addComponent(totalSpacesLabel)
                            .addComponent(totalSpacesNumber)
                            .addComponent(emptySpacesLabel))
                        .addGap(214, 214, 214))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reservationInfoLabel)
                            .addComponent(backButtonLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(makeReservationButton)
                        .addGap(62, 62, 62)
                        .addComponent(cancelReservationButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageReservationsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(decrementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(incrementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(101, 101, 101))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(backButtonLabel)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lotNameLabel)
                    .addComponent(totalSpacesLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lotAddressLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(totalSpacesNumber)
                        .addGap(55, 55, 55)
                        .addComponent(emptySpacesLabel)))
                .addGap(18, 18, 18)
                .addComponent(emptySpacesNumber)
                .addGap(18, 18, 18)
                .addComponent(reservationsLabel)
                .addGap(27, 27, 27)
                .addComponent(reservationInfoLabel)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makeReservationButton)
                    .addComponent(cancelReservationButton)
                    .addComponent(incrementButton))
                .addGap(18, 18, 18)
                .addComponent(decrementButton)
                .addGap(18, 18, 18)
                .addComponent(manageReservationsButton)
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonLabelMouseClicked
        CardLayout card = (CardLayout) getParent().getLayout();
        card.show(getParent(), "listCard"); 
    }//GEN-LAST:event_backButtonLabelMouseClicked

    private void makeReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeReservationButtonActionPerformed
        User currentUser = Session.getUser();
        currentLot.addReservation(currentUser);
        updateInfo();
    }//GEN-LAST:event_makeReservationButtonActionPerformed

    private void cancelReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelReservationButtonActionPerformed
        User currentUser = Session.getUser();
        currentLot.cancelReservation(currentUser);
        updateInfo();
    }//GEN-LAST:event_cancelReservationButtonActionPerformed

    private void incrementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incrementButtonActionPerformed
        currentLot.incrementSpaces();
        updateInfo();
    }//GEN-LAST:event_incrementButtonActionPerformed

    private void decrementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decrementButtonActionPerformed
        currentLot.decrementSpaces();
        updateInfo();
    }//GEN-LAST:event_decrementButtonActionPerformed

    private void manageReservationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageReservationsButtonActionPerformed
        Map<String, User> reservations = currentLot.getReservations();
        
        DefaultListModel<User> listModel = new DefaultListModel<>();
        for (User value : reservations.values()) {
            listModel.addElement(value);
        }
        reservationList.setModel(listModel);
        reservationDialog.setSize(250, 200);
        reservationDialog.setLocationRelativeTo(null);
        confirmDialog.setVisible(false);
        reservationDialog.setVisible(true);
    }//GEN-LAST:event_manageReservationsButtonActionPerformed

    private void reservationListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_reservationListValueChanged
        User currentReservedUser = reservationList.getSelectedValue();
        
        if(currentReservedUser != null) {
            updateConfirmDialog(currentReservedUser);
        }
        
        confirmDialog.setSize(225, 220);
        confirmDialog.setLocationRelativeTo(null);
        confirmDialog.setVisible(true);
        reservationList.clearSelection();
    }//GEN-LAST:event_reservationListValueChanged

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        currentLot.confirmReservation(currResUser);
        confirmDialog.dispose();
        reservationDialog.dispose();
        updateInfo();
        reservationInfoLabel.setText("Confirmed reservation for " + currResUser.toString());
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        currentLot.cancelReservation(currResUser);
        confirmDialog.dispose();
        reservationDialog.dispose();
        updateInfo();
        reservationInfoLabel.setText("Cancelled reservation for " + currResUser.toString());
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void updateConfirmDialog(User user){
        currResUser = user;
        customNameLabel.setText(user.toString());
        if ( user instanceof Customer customer ){
            customPlateLabel.setText(customer.getPlateNumber());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backButtonLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelReservationButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JDialog confirmDialog;
    private javax.swing.JLabel customNameLabel;
    private javax.swing.JLabel customPlateLabel;
    private javax.swing.JButton decrementButton;
    private javax.swing.JLabel emptySpacesLabel;
    private javax.swing.JLabel emptySpacesNumber;
    private javax.swing.JButton incrementButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lotAddressLabel;
    private javax.swing.JLabel lotNameLabel;
    private javax.swing.JButton makeReservationButton;
    private javax.swing.JButton manageReservationsButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel plateLabel;
    private javax.swing.JDialog reservationDialog;
    private javax.swing.JLabel reservationInfoLabel;
    private javax.swing.JList<User> reservationList;
    private javax.swing.JLabel reservationsLabel;
    private javax.swing.JLabel totalSpacesLabel;
    private javax.swing.JLabel totalSpacesNumber;
    // End of variables declaration//GEN-END:variables
}
