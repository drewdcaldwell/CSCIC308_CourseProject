/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.c308team2.parkinglotapp;

import javax.swing.*;
import java.util.*;

public class UserListModel extends AbstractListModel<User> {

    private final HashMap<String, User> userDB;
    private final List<String> userKeys; // Maintains order for iteration

    public UserListModel() {
        this.userDB = new HashMap<>();
        this.userKeys = new ArrayList<>();
    }

    @Override
    public int getSize() {
        return userKeys.size();
    }

    @Override
    public User getElementAt(int index) {
        if (index >= 0 && index < userKeys.size()) {
            String key = userKeys.get(index);
            return userDB.get(key);
        }
        return null;
    }

    public boolean addUser(User user) {
        if (!userDB.containsKey(user.getAccount())) {
            userDB.put(user.getAccount(), user);
            userKeys.add(user.getAccount());
            int newIndex = userKeys.size() - 1;
            fireIntervalAdded(this, newIndex, newIndex);
            return true;
        }
        return false;
    }

    public User getUser(String accountName) {
        return userDB.getOrDefault(accountName, null);
    }
    
    public String getUserName(String accountName) {
        User user = userDB.get(accountName);
        return user != null ? user.toString() : null;
    }

    public boolean removeUser(String accountName) {
        if (userDB.containsKey(accountName)) {
            int index = userKeys.indexOf(accountName);
            userDB.remove(accountName);
            userKeys.remove(accountName);
            fireIntervalRemoved(this, index, index);
            return true;
        }
        return false;
    }

    public void clear() {
        int size = userKeys.size();
        userDB.clear();
        userKeys.clear();
        if (size > 0) {
            fireIntervalRemoved(this, 0, size - 1);
        }
    }

    public int getUserCount() {
        return userDB.size();
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        for (String key : userKeys) {
            users.add(userDB.get(key));
        }
        return users;
    }
}