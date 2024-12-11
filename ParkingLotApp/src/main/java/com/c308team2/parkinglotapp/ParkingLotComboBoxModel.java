/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.c308team2.parkinglotapp;

import javax.swing.*;

public class ParkingLotComboBoxModel extends DefaultComboBoxModel<ParkingLot> {
    private final ParkingListModel parkingListModel;

    public ParkingLotComboBoxModel(ParkingListModel parkingListModel) {
        this.parkingListModel = parkingListModel;

        // Initialize with existing parking lots
        for (int i = 0; i < parkingListModel.getSize(); i++) {
            addElement(parkingListModel.getElementAt(i));
        }
    }

    /**
     * Syncs the combo box with the ParkingListModel whenever the model changes.
     */
    public void update() {
        removeAllElements();
        for (int i = 0; i < parkingListModel.getSize(); i++) {
            addElement(parkingListModel.getElementAt(i));
        }
    }
}
