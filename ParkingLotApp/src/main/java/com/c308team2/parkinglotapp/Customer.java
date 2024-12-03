/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.c308team2.parkinglotapp;

public class Customer extends User {
    private static final long serialVersionUID = 1L;
	private String plateNumber;

    public Customer(String firstName, String lastName, String plateNumber) {
        super(firstName, lastName);
        setUserType(CUSTOMER);
        this.plateNumber = plateNumber;
    }

    public Customer(String firstName, String lastName, String plateNumber, String accountName, String passkey) {
        super(firstName, lastName, accountName, passkey);
        setUserType(CUSTOMER);
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}