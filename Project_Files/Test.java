//testing class
public class Test {
    public static void main(String[] args) {
        Database data = new Database();
        Customer cust = new Customer("Brady", "Covyeou", "5", "nexus", "blargh24475?");
        Staff staff = new Staff("Micheal", "Jordan");
        data.addUser(staff);
        data.addUser(cust);
    }
}
