import java.util.ArrayList;
//7. Write a Java program to test an array list is empty or not. Define array list with underground tube name

public class Programme_7_IsArrayListEmptyOrNot {

    public static void main(String[] args) {
        //create an empty ArrayList
        ArrayList<String>underGroundTubeName=new ArrayList<>();
        underGroundTubeName.add("BakerLooLine");
        underGroundTubeName.add("MetropolitanLine");
        underGroundTubeName.add("NorthernLine");
        underGroundTubeName.add("CentralLine");
        underGroundTubeName.add("Piccadilly");
        System.out.println("Original array list: " + underGroundTubeName);

        System.out.println("Checking the above array list is empty or not! :"+underGroundTubeName.isEmpty());

        underGroundTubeName.removeAll(underGroundTubeName);

        System.out.println("Array list after remove all elements "+underGroundTubeName);
        System.out.println("Checking the above array list is empty or not!: "+underGroundTubeName.isEmpty());

    }
}
