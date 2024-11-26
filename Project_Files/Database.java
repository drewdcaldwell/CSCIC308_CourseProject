import java.util.ArrayList;
public class Database {
    //Defines an ArrayList for each major database
    private ArrayList custDB;
    private ArrayList lotDB;
    private ArrayList staffDB;
    private ArrayList adminDB;
    private ArraryList sadminDB;

    //constructor that intializes the blank databases
    public Database(){
        this.custDB = new ArrayList<Customer>();
        this.lotDB = new ArrayList<Staff>();
        this.staffDB = new ArrayList<ParkingLot>();
        this.adminDB = new ArrayList<Admin>();
        this.sadminDB = new ArrayList<SuperAdmin>();
    }

    public boolean addData(ArrayList<T> list, <T> element){
        list.add(element);
    }

    //searches the ArrayList by ID and returns 
    //an element of class type <T>
    public <T> searchDataID(ArrayList<> list, int id){
        return null;
    }
}
