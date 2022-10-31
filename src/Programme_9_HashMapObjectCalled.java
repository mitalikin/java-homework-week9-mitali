import java.util.HashMap;
import java.util.Map;
//9. Create a HashMap object called people that will store String keys and Integer
//    values: And use for each loop to iterate the value from Map
public class Programme_9_HashMapObjectCalled {
    public static void main(String[] args) {
        // Create a HashMap object called people's name
        HashMap<String, Integer> people=new HashMap<>();
        people.put("Tony ",12);
        people.put("David ",20);
        people.put(" may",35);
        people.put("Boris",40);
       people.put("John",55);
       people.put("val",67);
        for (String i  :  people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));

        }

        }
}

