/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.c308team2.parkinglotapp;


import javax.swing.*;
import java.awt.*;

public class ParkingLotCellRenderer extends JLabel implements ListCellRenderer<ParkingLot> {

    public ParkingLotCellRenderer() {
        setOpaque(true); // Make the background visible
    }

    @Override
    public Component getListCellRendererComponent(
            JList<? extends ParkingLot> list, 
            ParkingLot value, 
            int index, 
            boolean isSelected, 
            boolean cellHasFocus) {
        // custom method called to render each ParkingLot in the ParkingLotList


        // Create and return a ParkingListItem for the given ParkingLot
        JPanel itemPanel = new ParkingListItem(value);
        if(isSelected){
            itemPanel.setBackground(list.getSelectionBackground());
        }
        return itemPanel;
    }
}