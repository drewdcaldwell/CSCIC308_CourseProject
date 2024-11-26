import java.io.Serializable;

public class Customer extends User{
    private static int nextUserID = 1;   // To generate unique user IDs for each new Customer
    private final int userID;   // Unique identifier for the user

    // Type of the user (can represent different access levels such as regular Customer, Admin, etc.)
    private int userType;

    // User's first name, last name, and vehicle plate number
    // Defines the associated accountName and passkey
    private String firstName, lastName, plateNumber, accountName, passkey;

    // Constructor to initialize a Customer object with first name, last name, and plate number
    public User(String firstName, String lastName, String plateNumber) {
        this.userID = nextUserID++;  // Generate unique userID
        this.userType = CUSTOMER; // Default userType is 0 (Customer)
        this.firstName = firstName;
        this.lastName = lastName;
        this.plateNumber = plateNumber;
    }

    public User(String firstName, String lastName, String plateNumber, String accountName, String passkey) {
        this.userID = nextUserID++;  // Generate unique userID
        this.userType = CUSTOMER; // Default userType is 0 (Customer)
        this.firstName = firstName;
        this.lastName = lastName;
        this.plateNumber = plateNumber;
        this.accountName = accountName;
        this.passkey = passkey;
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
