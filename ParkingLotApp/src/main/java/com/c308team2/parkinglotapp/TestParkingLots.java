/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.c308team2.parkinglotapp;

// class to create a new DB, called if existing DB not found
public class TestParkingLots {
    public static void main(String[] args) {
        
        Customer user1 = new Customer("Dustin", "Groh", "ABC123", "dusn", "123p");
        Database.addUser(user1);
        
        // Create Test Lots
        Database.addLot(new ParkingLot("Downtown Parking", "123 Main St, Cityville", 25, 50));
        Database.addLot(new ParkingLot("Westside Park & Ride", "456 West Ave, Cityville", 40, 60));
        Database.addLot(new ParkingLot("Northgate Mall Parking", "789 Northgate Blvd, Cityville", 30, 50));
        Database.addLot(new ParkingLot("Central Business District Lot", "1010 Center St, Cityville", 10, 30));
        Database.addLot(new ParkingLot("Southpark Lot", "2020 South Park Rd, Cityville", 15, 45));
        Database.addLot(new ParkingLot("Riverwalk Parking", "303 River St, Cityville", 20, 40));
        Database.addLot(new ParkingLot("Airport Parking Garage", "404 Airport Blvd, Cityville", 50, 100));
        Database.addLot(new ParkingLot("East End Lot", "505 East Rd, Cityville", 5, 25));
        Database.addLot(new ParkingLot("Hilltop Parking", "606 Hilltop Dr, Cityville", 35, 70));
        Database.addLot(new ParkingLot("Uptown Parking Lot", "707 Uptown Ave, Cityville", 12, 35));
        Database.addLot(new ParkingLot("Metro Station Park", "808 Metro Rd, Cityville", 22, 45));
        Database.addLot(new ParkingLot("Library Lot", "909 Library Ln, Cityville", 8, 20));
        Database.addLot(new ParkingLot("Beachside Parking", "101 Beach Rd, Seaside Town", 40, 60));
        Database.addLot(new ParkingLot("Greenfield Park Lot", "112 Greenfield Dr, Greenfield", 18, 40));
        Database.addLot(new ParkingLot("Market Street Parking", "213 Market St, Cityville", 16, 30));
        Database.addLot(new ParkingLot("Old Town Lot", "314 Old Town Rd, Cityville", 30, 60));
        Database.addLot(new ParkingLot("Industrial Park Lot", "415 Industrial Rd, Cityville", 50, 80));
        Database.addLot(new ParkingLot("Lakeside Parking", "516 Lakeside Dr, Lakeview", 25, 50));
        Database.addLot(new ParkingLot("Parkview Lot", "617 Parkview Blvd, Cityville", 10, 20));
        Database.addLot(new ParkingLot("City Hall Lot", "718 City Hall Rd, Cityville", 18, 40));
        Database.addLot(new ParkingLot("Fully Full Lot", "Filly Fill Street, Filcity", 0, 117));
        
        
        // Create Test Users
        Database.addUser(new Customer("John", "Doe", "ABC1234", "user0", "password"));
        Database.addUser(new Customer("Jane", "Smith", "XYZ5678", "user1", "password"));
        Database.addUser(new Customer("Michael", "Johnson", "LMN3456", "user2", "password"));
        Database.addUser(new Customer("Emily", "Davis", "PQR7890", "user3", "password"));
        Database.addUser(new Customer("Chris", "Brown", "DEF2345", "user4", "password"));
        Database.addUser(new Customer("Sarah", "Wilson", "GHI6789", "user5", "password"));
        Database.addUser(new Customer("David", "Lee", "JKL0123", "user6", "password"));
        Database.addUser(new Customer("Laura", "Taylor", "MNO4567", "user7", "password"));
        Database.addUser(new Customer("James", "Anderson", "TUV8901", "user8", "password"));
        Database.addUser(new Customer("Sophia", "Thomas", "WXY2345", "user9", "password"));
        Database.addUser(new Customer("Daniel", "Moore", "BCD6789", "user10", "password"));
        Database.addUser(new Customer("Olivia", "Martin", "EFG0123", "user11", "password"));
        Database.addUser(new Customer("Matthew", "Jackson", "HIJ4567", "user12", "password"));
        Database.addUser(new Customer("Chloe", "White", "KLM8901", "user13", "password"));
        Database.addUser(new Customer("Ethan", "Harris", "NOP2345", "user14", "password"));
        Database.addUser(new Customer("Isabella", "Clark", "QRS6789", "user15", "password"));
        Database.addUser(new Customer("Alexander", "Lewis", "TUV0123", "user16", "password"));
        Database.addUser(new Customer("Mia", "Robinson", "WXY4567", "user17", "password"));
        Database.addUser(new Customer("Benjamin", "Walker", "ABC8901", "user18", "password"));
        Database.addUser(new Customer("Charlotte", "Hall", "DEF2345", "user19", "password"));
        Database.addUser(new Customer("William", "Allen", "GHI6789", "user20", "password"));
        Database.addUser(new Customer("Amelia", "Young", "JKL0123", "user21", "password"));
        Database.addUser(new Customer("Lucas", "King", "MNO4567", "user22", "password"));
        Database.addUser(new Customer("Harper", "Scott", "PQR8901", "user23", "password"));
        Database.addUser(new Customer("Henry", "Green", "TUV2345", "user24", "password"));
        Database.addUser(new Customer("Ella", "Adams", "WXY6789", "user25", "password"));
        Database.addUser(new Customer("Sebastian", "Baker", "ABC0123", "user26", "password"));
        Database.addUser(new Customer("Ava", "Gonzalez", "DEF4567", "user27", "password"));
        Database.addUser(new Customer("Jack", "Carter", "GHI8901", "user28", "password"));
        Database.addUser(new Customer("Lily", "Mitchell", "JKL2345", "user29", "password"));
        Database.addUser(new Customer("Oliver", "Perez", "MNO6789", "user30", "password"));
        
        Database.saveDBToFile();
    }
}
