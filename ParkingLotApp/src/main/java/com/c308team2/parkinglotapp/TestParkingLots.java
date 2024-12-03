/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.c308team2.parkinglotapp;

/**
 *
 * @author dustt
 */
public class TestParkingLots {
    public static void main(String[] args) {
        
        Customer user1 = new Customer("Dustin", "Groh", "ABC123", "dusn", "123p");
        Database.addUser(user1);
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
        Database.saveDBToFile();
    }
}
