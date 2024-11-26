import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;

public class ParkingLot implements Serializable {
    private static final long serialVersionUID = 1L;  // Recommended for Serializable classes
    private static int nextLotID = 1;  // To generate unique lot IDs for each new ParkingLot
    private int lotID;
    private String lotName;
    private int totalSpaces;
    private int emptySpaces;
    private Map<Integer, User> reservations;  // Map of reservations, with key = userID

    // Constructor: Initializes a ParkingLot object with the given lotName and totalSpaces
    public ParkingLot(String lotName, int totalSpaces) {
        this.lotID = nextLotID++;  // Generate unique lotID
        this.lotName = lotName;
        this.totalSpaces = totalSpaces;
        this.emptySpaces = totalSpaces;  // Initially all spaces are empty
        this.reservations = new HashMap<>();  // Initialize the reservations map
    }

    public int getLotID() {
        return lotID;
    }

    public void setLotName(String lotName) {
        this.lotName = lotName;
    }

    public String getLotName() {
        return lotName;
    }

    // Method to check if the parking lot has available spaces
    public boolean isVacant() {
        return emptySpaces > 0;
    }

    public void setTotalSpaces(int spaces) {
        this.totalSpaces = spaces;
        if (emptySpaces > spaces) {
            emptySpaces = spaces;  // Adjust emptySpaces if the totalSpaces is reduced
        }
    }

    public int getTotalSpaces() {
        return totalSpaces;
    }

    public void setEmptySpaces(int spaces) {
        if (spaces <= totalSpaces) {
            this.emptySpaces = spaces;
        }
    }

    public int getEmptySpaces() {
        return emptySpaces;
    }

    // Method to increment emptySpaces by 1, used when a vehicle leaves the ParkingLot
    public void incrementSpaces(){
        if (emptySpaces < totalSpaces) {
            emptySpaces++;
        }
    }

    // Method to decrement emptySpaces by 1, used when a vehicle enters the ParkingLot
    public void decrementSpaces(){
        if (emptySpaces > 0) {
            emptySpaces--;
        }
    }

    // Method to add a reservation
    public void addReservation(User customer) {
        if (customer != null && emptySpaces > 0) {
            reservations.put(customer.getUserID(), customer);
            emptySpaces--;
        }
    }

    // Method to get all reservations
    public Map<Integer, User> getReservations() {
        return new HashMap<>(reservations);  // Return a copy of the reservations map
    }

    // Method to check if a customer has a reservation
    public boolean checkReservation(User customer) {
        if (customer != null) {
            return reservations.containsKey(customer.getUserID());
        }
        return false;
    }

    // Method to confirm a reservation, removing the customer from reservations
    public void confirmReservation(User customer) {
        if (customer != null) {
            reservations.remove(customer.getUserID());
        }
    }

    // Method to cancel a reservation, removing the customer from reservations and incrementing emptySpaces
    public void cancelReservation(User customer) {
        if (customer != null && reservations.containsKey(customer.getUserID())) {
            reservations.remove(customer.getUserID());
            emptySpaces++;
        }
    }

    // Method to reset the parking lot (remove all reservations and reset emptySpaces to totalSpaces)
    public void resetLot() {
        reservations.clear();
        emptySpaces = totalSpaces;
    }
}
