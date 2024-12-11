/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.c308team2.parkinglotapp;

import javax.swing.DefaultComboBoxModel;

public class UserComboBoxModel extends DefaultComboBoxModel<User> {
    private final UserListModel userListModel;

    public UserComboBoxModel(UserListModel userListModel) {
        this.userListModel = userListModel;

        // Initialize with existing users
        for (User user : userListModel.getAllUsers()) {
            addElement(user);
        }
    }

    // Add methods to sync with UserListModel
    public void update() {
        removeAllElements();
        for (User user : userListModel.getAllUsers()) {
            addElement(user);
        }
    }
}