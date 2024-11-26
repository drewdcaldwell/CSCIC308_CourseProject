import java.io.Serializable;

public class Customer extends User{
    // Type of the user (can represent different access levels such as regular Customer, Admin, etc.)
    private int userType;

    // User's first name, last name, and vehicle plate number
    // Defines the associated accountName and passkey
    private String firstName, lastName, plateNumber, accountName, passkey;

    // Constructor to initialize a Customer object with first name, last name, and plate number
    public Customer(String firstName, String lastName, String plateNumber) {
        super(firstName, lastName);
        this.userType = CUSTOMER; // Default userType is 0 (Customer)
        this.plateNumber = plateNumber;
    }

    public Customer(String firstName, String lastName, String plateNumber, String accountName, String passkey) {
        super(firstName, lastName, accountName, passkey);
        this.userType = CUSTOMER; // Default userType is 0 (Customer)
        this.plateNumber = plateNumber;
    }

    // Getter method to return the plateNumber
    public String getPlateNumber() {
        return plateNumber;
    }

    // Setter method to change the plateNumber
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
