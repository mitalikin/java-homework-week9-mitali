import java.util.ArrayList;
import java.util.Iterator;
//5. Write a Java program to iterate through all elements in an array list using Iterator.

public class Programme_5_ArrayListUsingIterator {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("ArrayList: "+numbers);
       // Creating an instance of Iterator


        Iterator<Integer>iterate=numbers.iterator();
        System.out.println("Iterating over ArrayList");
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }
    }
}
