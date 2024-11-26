import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class Database {
    //Defines an ArrayList for each major database
    private HashMap<String, User> userDB;
    private ArrayList<ParkingLot> lotDB;

    //method that intializes the blank databases
    public Database(){
        this.userDB = new HashMap<>();
        this.lotDB = new ArrayList<>();
    }
    
    //adds the passed in lot to the database
    public boolean addLot(ParkingLot lot){
        if(!lotDB.contains(lot)){
            lotDB.add(lot);
            return true;
        }
        else{
            System.out.println("Lot already exists"); //test
            return false;
        }
    }

    //searches the lotDB for the given lot object's name and returns
    //true if found
    //Null reference error handling should be handled
    //by the calling method
    public ParkingLot getLot(String lotName){
        for (ParkingLot l: lotDB){
            if((l.getLotName()).equals(lotName)){
                return l;
            }
        }
        return null;
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
 
    //searches userDB for the given account and changes the user's name
    //Null reference error handling should be handled
    //by the calling method
    public User getUser(String accountName){
        if (userDB.containsKey(accountName)){
            return (userDB.get(accountName));
        }
        return null;
    }

    //searches userDB for the given account and returns
    //the User's name
    //Null reference error handling should be handled
    //by the calling method
    public String getUserName(String accountName){
        if (userDB.containsKey(accountName)){
            return (userDB.get(accountName).toString());
        }
        return null;
    }
}
