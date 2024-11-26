import java.util.ArrayList;
import java.util.HashMap;
public class Database {
    //Defines an ArrayList for each major database
    private HashMap userDB;
    private ArrayList lotDB;

    //!!! ALWAYS EXECUTE IN MAIN FUNCTION !!!
    //method that intializes the blank databases
    public Database(){
        this.userDB = new HashMap();
        this.lotDB = new ArrayList<ParkingLot>();
    }
    
    //adds a User object to its appropiate arraylist
    //by checking its Class type
    public boolean addUser(User element){
        if (!userDB.containsKey(element.getAccount())){
            userDB.put(element.getAccount(), element);
            System.out.println(element.getUserID()); //test
            System.out.println(element + " is in cust DB"); //to test output
            return true;
        }
        else{
            System.out.println("Account already exists"); //to test output
        }
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
