import java.util.Scanner;
//3. Write a Java program to reverse an array of integer values.
public class Programme3_ReverseArrayOfIntValue {
    public static void main(String[] args) {

        System.out.println("Enter number of elements: ");

        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        Integer ar[]=new Integer[n];

        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc1.nextInt();
        }
       //display initial array
        System.out.println("The initial array: ");

        for(int j=0;j<n;j++)
        {
            System.out.println(ar[j]);
        }


        System.out.println("The reversed array: ");

        for(int j=n-1;j>=0;j--)
        {
            System.out.println(ar[j]);
        }
    }

}
