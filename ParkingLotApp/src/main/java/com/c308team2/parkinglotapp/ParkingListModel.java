/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.c308team2.parkinglotapp;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.AbstractListModel;


// class designed to store ParkingLots and be used as a ListModel for JLists
public class ParkingListModel extends AbstractListModel<ParkingLot> implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<ParkingLot> parkingLots;
    
    public ParkingListModel(){
        parkingLots = new ArrayList<ParkingLot>();
    }
    
    
    
    @Override
    public int getSize() {
        return parkingLots.size();
    }
    @Override
    public ParkingLot getElementAt(int i){
        return parkingLots.get(i);
    }

    public boolean contains(ParkingLot lot) {
        return parkingLots.contains(lot);
    }

    public void add(ParkingLot lot) {
        parkingLots.add(lot);
        fireIntervalAdded(this, getSize() - 1, getSize() - 1);
    }

    public ParkingLot getLot(String lotName) {
        for(ParkingLot lot : parkingLots){
            System.out.println(lot);
            ParkingLot lot1 = (ParkingLot) lot;
            lot1.getLotName();
            
        }
        for (ParkingLot l : parkingLots) {
            if (l.getLotName().equals(lotName)) {
                return l;
            }
        }
        return null;
    }

    public boolean addLot(ParkingLot lot) {
        if (!parkingLots.contains(lot)) {
            parkingLots.add(lot);
            System.out.println("Added: " + lot);
            fireIntervalAdded(this, getSize() - 1, getSize() - 1);
            return true;
        }
        System.out.println("Lot already exists");
        return false;
    }
    
    public boolean removeLot(ParkingLot lot){
        if(parkingLots.contains(lot)){
            int index = parkingLots.indexOf(lot);
            parkingLots.remove(lot);
            fireIntervalRemoved(this, index, index);
            return true;
        }
        System.out.println("Lot not found...");
        return false;
    }

    public int size() {
        return parkingLots.size();
    }

    void clear() {
        parkingLots.clear();
    }
    
    public ArrayList<ParkingLot> getAllLots(){
        return new ArrayList<>(parkingLots);
    }
    
}