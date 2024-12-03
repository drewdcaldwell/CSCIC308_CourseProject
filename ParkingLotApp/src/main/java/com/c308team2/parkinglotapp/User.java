/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.c308team2.parkinglotapp;

import java.io.Serializable;

public abstract class User implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final int CUSTOMER = 0;
    public static final int STAFF = 1;
    public static final int ADMIN = 2;
    public static final int SUPER_ADMIN = 3;

    private static int nextUserID = 1;
    private final int userID;
    private int userType;
    private String firstName, lastName, accountName, passkey;

    public User(String firstName, String lastName) {
        this.userID = nextUserID++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName, String accountName, String passkey) {
        this.userID = nextUserID++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountName = accountName;
        this.passkey = passkey;
    }

    public void setUserType(int userType) {
        if (userType >= 0 && userType <= 3) {
            this.userType = userType;
        } else {
            System.out.println("Invalid user type");
        }
    }

    public int getUserType() {
        return userType;
    }

    public int getUserID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccount() {
        return accountName;
    }

    public boolean setAccount(String accountName) {
        this.accountName = accountName;
        return true;
    }

    public String getPasskey() {
        return passkey;
    }

    public boolean setPasskey(String passkey) {
        this.passkey = passkey;
        return true;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName();
    }
}