/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.c308team2.parkinglotapp;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author dustt
 */
public class ParkingListPanel extends javax.swing.JPanel {

    /**
     * Creates new form ParkingListPanel
     */
    public ParkingListPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        parkingLotList = new javax.swing.JList<>();

        setPreferredSize(new java.awt.Dimension(1080, 720));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1080, 720));

        parkingLotList.setModel(Database.lotDB);
        parkingLotList.setCellRenderer(new ParkingLotCellRenderer());
        parkingLotList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                parkingLotListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(parkingLotList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void parkingLotListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_parkingLotListValueChanged
        //getParent().add(new ParkingLotPanel((ParkingLot) jList1.getSelectedValue()), "new");
        CardLayout card = (CardLayout) getParent().getLayout();
        ParkingLotPanel lotPanel = (ParkingLotPanel) getParent().getComponent(1);
        ParkingLot currentLot = parkingLotList.getSelectedValue();
        if(currentLot != null) lotPanel.updateLot(currentLot);
        card.show(getParent(), "lotCard");
        parkingLotList.clearSelection();
    }//GEN-LAST:event_parkingLotListValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<ParkingLot> parkingLotList;
    // End of variables declaration//GEN-END:variables
}
