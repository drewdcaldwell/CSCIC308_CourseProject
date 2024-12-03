/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.c308team2.parkinglotapp;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int nextLotID = 1;
    private int lotID;
    private String lotName;
    private String address;
    private int totalSpaces;
    private int emptySpaces;
    private Map<Integer, User> reservations;

    public ParkingLot(String lotName, int totalSpaces) {
        this.lotID = nextLotID++;
        this.lotName = lotName;
        this.totalSpaces = totalSpaces;
        this.emptySpaces = totalSpaces;
        this.reservations = new HashMap<>();
    }
    
    public ParkingLot(String lotName, String address, int emptySpaces, int totalSpaces){
        this.lotID = nextLotID++;
        this.lotName = lotName;
        this.address = address;
        this.emptySpaces = emptySpaces;
        this.totalSpaces = totalSpaces;
        this.reservations = new HashMap<>();
    }

    public int getLotID() {
        return lotID;
    }

    public void setLotName(String lotName) {
        this.lotName = lotName;
    }

    public String getLotName() {
        return lotName;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress() {
        return address;
    }
    
    public boolean isVacant() {
        return emptySpaces > 0;
    }

    public void setTotalSpaces(int spaces) {
        this.totalSpaces = spaces;
        if (emptySpaces > spaces) {
            emptySpaces = spaces;
        }
    }

    public int getTotalSpaces() {
        return totalSpaces;
    }

    public void setEmptySpaces(int spaces) {
        if (spaces <= totalSpaces) {
            this.emptySpaces = spaces;
        }
    }

    public int getEmptySpaces() {
        return emptySpaces;
    }
    
    public int getOccupiedSpaces(){
        return totalSpaces - emptySpaces - reservations.size();
    }

    public void incrementSpaces() {
        if (emptySpaces < totalSpaces) {
            emptySpaces++;
        }
    }

    public void decrementSpaces() {
        if (emptySpaces > 0) {
            emptySpaces--;
        }
    }

    public void addReservation(User customer) {
        if (customer != null && emptySpaces > 0) {
            reservations.put(customer.getUserID(), customer);
            emptySpaces--;
        }
    }

    public Map<Integer, User> getReservations() {
        return new HashMap<>(reservations);
    }

    public boolean checkReservation(User customer) {
        if (customer != null) {
            return reservations.containsKey(customer.getUserID());
        }
        return false;
    }

    public void confirmReservation(User customer) {
        if (customer != null) {
            reservations.remove(customer.getUserID());
        }
    }

    public void cancelReservation(User customer) {
        if (customer != null && reservations.containsKey(customer.getUserID())) {
            reservations.remove(customer.getUserID());
            emptySpaces++;
        }
    }

    public void resetLot() {
        reservations.clear();
        emptySpaces = totalSpaces;
    }
}