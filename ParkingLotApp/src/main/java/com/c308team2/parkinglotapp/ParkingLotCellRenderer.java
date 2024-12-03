/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.c308team2.parkinglotapp;

/**
 *
 * @author dustt
 */
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

        // Format the text to display for each ParkingLot
        setText(String.format("ID: %d | Name: %s | Spaces: %d/%d",
                value.getLotID(),
                value.getLotName(),
                value.getEmptySpaces(),
                value.getTotalSpaces()));

        // Set background and foreground colors for selected/non-selected states
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        JPanel itemPanel = new ParkingListItem(value);
        if(isSelected){
            itemPanel.setBackground(list.getSelectionBackground());
        }
        return itemPanel;
        //return this;
    }
}