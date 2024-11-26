//testing class
public class Test {
    public static void main(String[] args) {
        Database data = new Database();
        Customer cust = new Customer("Brady", "Covyeou", "5", "nexus", "blargh24475?");
        Customer cust2 = new Customer("Brady", "Covyeou", "5", "nexus", "blargh24475?");
        ParkingLot lot = new ParkingLot("Mark's Lot", 50)
        Staff staff = new Staff("Micheal", "Jordan");
        data.addUser(staff);
        data.addUser(cust);
        data.addUser(cust2);
    }
}
