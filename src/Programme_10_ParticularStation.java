import java.util.HashMap;
import java.util.Map;
//10. Write the programme that tell you which line pass through particular stations.
//     Just use Zone 1 stations name
public class Programme_10_ParticularStation {
    public static void main(String[]args){
        HashMap<Integer,String>metropolitanLine=new HashMap<>();
        metropolitanLine.put(1," BakerStreet");
        metropolitanLine.put(2," King Cross");
        metropolitanLine.put(3," MoorGate");
        metropolitanLine.put(5," Aldgate");
        metropolitanLine.put(6," Great portland street");
        metropolitanLine.put(7," Ferringdon");
        metropolitanLine.put(8," Barbican");
        for (Integer i : metropolitanLine.keySet()) {
            System.out.println("Metropolitan Line Station:  " + i +  metropolitanLine.get(i));

        }
        HashMap<Integer, String> centralLine = new HashMap<>();
        centralLine.put(1," Bond Street");
        centralLine.put(2, " Oxford Circus");
        centralLine.put(3, " Holborn");
        centralLine.put(4, " Bank");
        centralLine.put(5, " Liverpool Street");
        centralLine.put(6, " Shoreditch High Street");


        System.out.println();
        for (Integer i : centralLine.keySet()) {
            System.out.println("Central Line Station:  " + i + centralLine.get(i));

        }
    }
}



