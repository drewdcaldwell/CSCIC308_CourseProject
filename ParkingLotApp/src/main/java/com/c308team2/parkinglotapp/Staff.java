/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.c308team2.parkinglotapp;

import java.util.HashMap;
import java.util.Map;

public class Staff extends User {
    private static final long serialVersionUID = 1L;
	private Map<Integer, ParkingLot> assignedLots;

	public Staff(String firstName, String lastName) {
	    super(firstName, lastName);
	    initializeStaff();
	}

	private void initializeStaff() {
	    setUserType(STAFF);
	    this.assignedLots = new HashMap<>();
	}

    public Staff(String firstName, String lastName, String accountName, String passkey) {
        super(firstName, lastName, accountName, passkey);
        setUserType(STAFF);
        this.assignedLots = new HashMap<>();
    }

    public void assignLot(ParkingLot parkingLot) {
        if (parkingLot != null) {
            assignedLots.put(parkingLot.getLotID(), parkingLot);
        }
    }

    public Map<Integer, ParkingLot> getAssignedLots() {
        return assignedLots;
    }

    public ParkingLot getAssignedLot(int lotID) {
        return assignedLots.get(lotID);
    }

    public void removeLot(int lotID) {
        assignedLots.remove(lotID);
    }

    public int getAssignedLotCount() {
        return assignedLots.size();
    }
}