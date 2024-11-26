import java.io.Serializable;

public abstract class User implements Serializable {
    private static final long serialVersionUID = 1L;  // Recommended for Serializable classes
    // Define the constants for different user types
    public static final int CUSTOMER = 0;     // Default user type
    public static final int STAFF = 1;        // Staff user type
    public static final int ADMIN = 2;        // Admin user type
    public static final int SUPER_ADMIN = 3;  // Super Admin user type

    private static int nextUserID = 1;   
    // To generate unique user IDs for each new Customer

    private final int userID;   // Unique identifier for the user

    // Type of the user (can represent different access levels such as regular Customer, Admin, etc.)
    private int userType;

    // User's first name, last name, and vehicle plate number
    // Defines the associated accountName and passkey
    private String firstName, lastName, accountName, passkey;

    // Constructor to initialize a Customer object with first name, last name, and plate number
    public User(String firstName, String lastName) {
        this.userID = nextUserID++;  
        // Generate unique userID
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName, String accountName, String passkey) {
        this.userID = nextUserID++;  
        // Generate unique userID
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountName = accountName;
        this.passkey = passkey;
    }

    // Setter method to change the userType
    public void setUserType(int userType) {
        if (userType >= 0 && userType <= 3) { // Ensure the userType is valid
            this.userType = userType;
        } else {
            System.out.println("Invalid user type");
        }
    }

    // Getter method to return the userType
    public int getUserType() {
        return userType;
    }

    // Getter method to return the userID
    public int getUserID() {
        return userID;
    }

    // Getter method to return the firstName
    public String getFirstName() {
        return firstName;
    }

    // Setter method to change the firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter method to return the lastName
    public String getLastName() {
        return lastName;
    }

    // Setter method to change the lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Returns the name of the Customer
    public String toString(){
        return (getFirstName() + getLastName());
    }
}
