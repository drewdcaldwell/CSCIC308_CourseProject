/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.c308team2.parkinglotapp;

import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author dustt
 */
public class ParkingLotApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Database.initiateDB();
        
        // to make account a SuperAdmin do this:
        //Database.userDB.get("dusn").setUserType(3);
        
        
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}
