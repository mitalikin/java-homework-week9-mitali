import java.util.HashMap;
/*9. Create a HashMap object called people that will store String keys and Integer
     values: And use for each loop to iterate the value from Map*/
public class Programme_9_CreateHashMapObject {
    public static void main(String[]args){
        // Create a HashMap object called people
        HashMap<String,Integer>people=new HashMap<>();
        //Add keys and values(Name,Age)
        people.put("John",32);
        people.put("steve",40);
        people.put("Adam",29);
        people.put("Clair",35);
        people.put("Richard",25);
        for ( String i: people.keySet()) {
            System.out.println("Name: "+i+"Age: "+people.get(i));
        }
    }
}
