import java.util.ArrayList;
public class Database {
    //Defines an ArrayList for each major database
    private ArrayList custDB;
    private ArrayList lotDB;
    private ArrayList staffDB;
    //TO DO
    // private ArrayList adminDB; 
    // private ArrayList sadminDB; 

    //!!! ALWAYS EXECUTE IN MAIN FUNCTION !!!
    //method that intializes the blank databases
    public Database(){
        this.custDB = new ArrayList<Customer>();
        this.lotDB = new ArrayList<Staff>();
        this.staffDB = new ArrayList<ParkingLot>();
        //this.adminDB = new ArrayList<Admin>();
        //this.sadminDB = new ArrayList<SuperAdmin>();
    }
    
    //adds a User object to its appropiate arraylist
    //by checking its Class type
    public boolean addUser(User element){
        if (element instanceof Customer){
            custDB.add(element);
            System.out.println(element.getUserID()); //test
            System.out.println(element + "is in cust DB"); //to test output
            return true;
        }
        else if (element instanceof Staff){
            staffDB.add(element);
            System.out.println(element.getUserID()); //test
            System.out.println(element + "is in staff DB"); //to test output
            return true;
        }
        //TO DO
        // else if (element instanceof Admin){}
        // else if (element instanceof SuperAdmin){}
        return false;
    }
    
    //adds a User object to its appropiate arraylist
    public boolean addUser(User element, ArrayList<User> list){
        list.add(element.getUserID(), element);
        return true;
    }

    //searches the ArrayList by ID and returns 
    //an element of class type <T>
    public <T> T searchDataID(ArrayList<User> list, int id){
        return null;
    }
}
