import java.util.ArrayList;
//4. Write a Java program to create a new array list, add some colours (string) and
//   printout the collection using for each loop.

public class Programme_4_ArrayListWithForEachLoop {

    public static void main(String[] args) {
        ArrayList<String> list_string = new ArrayList();
        //Creating an arraylist
        list_string.add("red");
        list_string.add("Green");
        list_string.add("Orange");
        list_string.add("White");
        list_string.add("Black");

        //using foreach loop
        System.out.println("Iterating over ArrayList using for-each loop ");
        for (String list : list_string) {
            System.out.println(list);
        }
    }
}
