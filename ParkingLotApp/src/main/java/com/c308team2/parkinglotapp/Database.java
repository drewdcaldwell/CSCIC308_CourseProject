/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.c308team2.parkinglotapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;

public class Database {
    //public static HashMap<String, User> userDB = new HashMap<>();
    public static UserListModel userDB = new UserListModel();
    public static UserComboBoxModel userCB = new UserComboBoxModel(userDB);
    //public static ArrayList<ParkingLot> lotDB = new ArrayList<>();
    public static ParkingListModel lotDB = new ParkingListModel();
    public static ParkingLotComboBoxModel lotCB = new ParkingLotComboBoxModel(lotDB);
    public static String DATA_DIR = "data/";

    public static boolean initiateDB(){
        File directory = new File(DATA_DIR);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_DIR + "data.ser"))) {
            //userDB = (HashMap<String, User>) ois.readObject();
            userDB = (UserListModel) ois.readObject();
            lotDB = (ParkingListModel) ois.readObject();
            userCB = new UserComboBoxModel(userDB);
            lotCB = new ParkingLotComboBoxModel(lotDB);
            System.out.println("Data loaded from data.ser");

            // Print loaded data
            System.out.println("Users: " + userDB);
            System.out.println("Parking Lots: " + lotDB);
            return true;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Database not found...");
            TestParkingLots.main(null);
        }
        return false;
    }
    
    public static boolean saveDBToFile(){
        File directory = new File(DATA_DIR);
        if (!directory.exists()) {
            directory.mkdirs();
        }


    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_DIR + "data.ser"))) {
            oos.writeObject(userDB);
            oos.writeObject(lotDB);
            System.out.println("Data saved to data.ser");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean addLot(ParkingLot lot) {
        return lotDB.addLot(lot);
    }

    public static ParkingLot getLot(String lotName) {
        return lotDB.getLot(lotName);
    }

    public static boolean addUser(User element) {
//        if (!userDB.containsKey(element.getAccount())) {
//            userDB.put(element.getAccount(), element);
//            System.out.println(element.getUserID());
//            System.out.println(element + " is in cust DB");
//            return true;
//        }
//        System.out.println("Account already exists");
//        return false;
        return userDB.addUser(element);
    }

    public static User getUser(String accountName) {
        //return userDB.getOrDefault(accountName, null);
        return userDB.getUser(accountName);
    }

    public static String getUserName(String accountName) {
//        User user = userDB.get(accountName);
//        return user != null ? user.toString() : null;
        return userDB.getUserName(accountName);
    }

    // Additional helper methods
    public static UserListModel getUserDB() {
        return userDB;
    }

    public static ParkingListModel getLotDB() {
        return lotDB;
    }

    public static void clearDatabase() {
        userDB.clear();
        lotDB.clear();
    }

    public int getUserCount() {
        return userDB.getUserCount();
    }

    public int getLotCount() {
        return lotDB.size();
    }
    
    public static boolean checkStaff(User user){
        // method to check if given user is Staff at any lots in lotDB
        
        // check if user works at any lot in lotDB
        for(ParkingLot lot : lotDB.getAllLots()){
            if(lot.checkStaff(user)) return true;
        }
        
        // user not found as Staff in any lot, return false
        return false;
    }
    
    public static void removeStaff(User user){
        // method to remove given user as Staff from all lots in lotDB
        
        for(ParkingLot lot : lotDB.getAllLots()){
            lot.removeStaff(user);
        }
    }
}