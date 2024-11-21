import java.util.HashMap;
import java.util.Map;

public class Staff extends Customer {
    // A map to store the assigned parking lots, where key = lotID and value = ParkingLot
    private Map<Integer, ParkingLot> assignedLots;

    // Constructor to initialize the assigned lots map
    public Staff(String firstName, String lastName) {
        super(firstName, lastName, null);
        this.assignedLots = new HashMap<>();
    }

    // Method to assign a parking lot
    public void assignLot(ParkingLot parkingLot) {
        if (parkingLot != null) {
            assignedLots.put(parkingLot.getLotID(), parkingLot);
        }
    }

    // Method to remove a parking lot
    public void removeLot(ParkingLot parkingLot) {
        if (parkingLot != null) {
            assignedLots.remove(parkingLot.getLotID());
        }
    }

    // Method to check if a parking lot exists in the assigned lots
    public boolean checkLot(ParkingLot parkingLot) {
        if (parkingLot != null) {
            return assignedLots.containsKey(parkingLot.getLotID());
        }
        return false;
    }
}
