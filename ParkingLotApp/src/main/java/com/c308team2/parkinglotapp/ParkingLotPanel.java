/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.c308team2.parkinglotapp;

import java.awt.CardLayout;

/**
 *
 * @author dustt
 */
public class ParkingLotPanel extends javax.swing.JPanel {
    private ParkingLot currentLot;

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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
                            .addComponent(backButtonLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(makeReservationButton)
                                .addGap(62, 62, 62)
                                .addComponent(cancelReservationButton)))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                    .addComponent(cancelReservationButton))
                .addContainerGap(193, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backButtonLabel;
    private javax.swing.JButton cancelReservationButton;
    private javax.swing.JLabel emptySpacesLabel;
    private javax.swing.JLabel emptySpacesNumber;
    private javax.swing.JLabel lotAddressLabel;
    private javax.swing.JLabel lotNameLabel;
    private javax.swing.JButton makeReservationButton;
    private javax.swing.JLabel reservationInfoLabel;
    private javax.swing.JLabel reservationsLabel;
    private javax.swing.JLabel totalSpacesLabel;
    private javax.swing.JLabel totalSpacesNumber;
    // End of variables declaration//GEN-END:variables
}
