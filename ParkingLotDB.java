import java.util.HashMap;
import java.util.Collections;
import java.util.Map;
public class ParkingLotDB {
    private static final int SIZE = 100;
    static public boolean initalizeDB(){
        Map lotMap = 
                Collections.synchronizedMap(new HashMap<String, ParkingLot>(SIZE));
        
        System.out.println(lotMap);
        return true;
    }
}
