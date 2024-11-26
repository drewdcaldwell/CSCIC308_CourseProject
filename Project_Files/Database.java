import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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

    //searches the lotDB for the given lot object by its name
    //and returns it
    //Null reference error handling should be handled
    //by the calling method
    public ParkingLot searchLot(String lotName){
        Iterator<ParkingLot> it = lotDB.iterator();
        while (it.hasNext()){
            //checks the ArrayList
            //to see if the name of the lot matches the lotName
            if ((((it.next()).getLotName()).equals(lotName)))
            {
                return it.next();
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
 
    //searches userDB for the given account and returns
    //the User
    //Null reference error handling should be handled
    //by the calling method
    public User searchUserDB(String accountName){
        if (userDB.containsKey(accountName)){
            return userDB.get(accountName);
        }
        return null;
    }
}
