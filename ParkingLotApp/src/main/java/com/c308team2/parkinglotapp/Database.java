/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.c308team2.parkinglotapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;

public class Database {
    public static HashMap<String, User> userDB = new HashMap<>();
    //public static ArrayList<ParkingLot> lotDB = new ArrayList<>();
    public static ParkingListModel lotDB = new ParkingListModel();
    public static String DATA_DIR = "data/";

    public static boolean initiateDB(){
        File directory = new File(DATA_DIR);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_DIR + "data.ser"))) {
            userDB = (HashMap<String, User>) ois.readObject();
            lotDB = (ParkingListModel) ois.readObject();
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
        if (!userDB.containsKey(element.getAccount())) {
            userDB.put(element.getAccount(), element);
            System.out.println(element.getUserID());
            System.out.println(element + " is in cust DB");
            return true;
        }
        System.out.println("Account already exists");
        return false;
    }

    public static User getUser(String accountName) {
        return userDB.getOrDefault(accountName, null);
    }

    public static String getUserName(String accountName) {
        User user = userDB.get(accountName);
        return user != null ? user.toString() : null;
    }

    // Additional helper methods
    public static HashMap<String, User> getUserDB() {
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
        return userDB.size();
    }

    public int getLotCount() {
        return lotDB.size();
    }
    
}