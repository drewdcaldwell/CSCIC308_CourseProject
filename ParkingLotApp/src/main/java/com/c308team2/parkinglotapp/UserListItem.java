package com.c308team2.parkinglotapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */


public class UserListItem extends javax.swing.JPanel {

    /**
     * Creates new form UserListItem
     */
    public UserListItem() {
        initComponents();
    }
    
    // CONSTRUCTOR: creates a new UserListItem with the given user
    public UserListItem(User user){
        initComponents();
        
        // update labels
        usernameLabel.setText("User: " + user.getAccount());
        userFirstNameLabel.setText(user.getFirstName());
        userLastNameLabel.setText(user.getLastName());
        userPlateLabel.setText(user.getPlateNumber());
        
        int userType = user.getUserType();
        switch(userType){
            case User.CUSTOMER:
                userTypeLabel.setText("Customer");
                break;
            case User.STAFF:
                userTypeLabel.setText("Staff");
                break;
            case User.ADMIN:
                userTypeLabel.setText("Admin");
                break;
            case User.SUPER_ADMIN:
                userTypeLabel.setText("Super Admin");
                break;
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        plateLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        userFirstNameLabel = new javax.swing.JLabel();
        userLastNameLabel = new javax.swing.JLabel();
        userPlateLabel = new javax.swing.JLabel();
        userTypeLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(1000, 150));

        firstNameLabel.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        firstNameLabel.setText("First Name:");

        lastNameLabel.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        lastNameLabel.setText("Last Name:");
        lastNameLabel.setToolTipText("");

        plateLabel.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        plateLabel.setText("Plate Number:");

        typeLabel.setText("User Type:");

        userFirstNameLabel.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        userFirstNameLabel.setText("FirstName");

        userLastNameLabel.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        userLastNameLabel.setText("LastName");

        userPlateLabel.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        userPlateLabel.setText("PLATE");

        userTypeLabel.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        userTypeLabel.setText("0");

        usernameLabel.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        usernameLabel.setText("User: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firstNameLabel)
                    .addComponent(userFirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameLabel)
                    .addComponent(userLastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userPlateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeLabel)
                    .addComponent(userTypeLabel))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(usernameLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel)
                    .addComponent(plateLabel)
                    .addComponent(typeLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userFirstNameLabel)
                    .addComponent(userLastNameLabel)
                    .addComponent(userPlateLabel)
                    .addComponent(userTypeLabel))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel plateLabel;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel userFirstNameLabel;
    private javax.swing.JLabel userLastNameLabel;
    private javax.swing.JLabel userPlateLabel;
    private javax.swing.JLabel userTypeLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
