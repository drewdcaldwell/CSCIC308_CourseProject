/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.c308team2.parkinglotapp;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

public class UserListCellRenderer extends JLabel implements ListCellRenderer<User> {

    public UserListCellRenderer() {
        setOpaque(true); // Make the background visible
    }

    @Override
    public Component getListCellRendererComponent(
            JList<? extends User> list, 
            User value, 
            int index, 
            boolean isSelected, 
            boolean cellHasFocus) {
        // custom method to render each User in the UserList


        // create and return a new UserListItem for given User
        JPanel itemPanel = new UserListItem(value);
        if(isSelected){
            itemPanel.setBackground(list.getSelectionBackground());
        }
        return itemPanel;
        
    }
}