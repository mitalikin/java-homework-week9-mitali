import java.util.ArrayList;
//6. Write a Java program to retrieve an element (at a specified index) from a given array list.

public class Programme_6_RetrieveAnElementArrayList {
    public static void main(String[] args) {
// Create a list and add some colors to the list
        ArrayList<String>cityList=new ArrayList();
        cityList.add("Edinburgh");
        cityList.add("London");
        cityList.add("Manchester");
        cityList.add("Liverpool");
        cityList.add("Southampton");
        cityList.add("Colchester");
//Print the list
        System.out.println("City name list: "+cityList);
        //Retrieve the first and third element
        String element1 = cityList.get(0);
        System.out.println("First element: "+element1);
        String element2=cityList.get(2);
        System.out.println("Third element: "+element2);

    }
}
