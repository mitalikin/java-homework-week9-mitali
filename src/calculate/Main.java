package calculate;

import java.util.Scanner;

public class Main extends Calculate {
    public static void main(String[] args) {
       //Declaration of scanner to input number
        Scanner scanner = new Scanner(System.in);
        //create object for main class
        Main main = new Main();
        String answer;
        boolean t;

        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second  number:");
        int b = scanner.nextInt();
        System.out.println("Enter one of symbol +,-,*,/");
        char symbol = scanner.next().charAt(0);
        main.getCalculateResult(a, b, symbol);
        System.out.print("\ndo you want to continue (y/n)          : ");

        while (true) {
            answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("n")) {
                t = true;
                break;
            } else if (answer.equals("y")) {

                System.out.print("Please enter first number              : ");
                int x = scanner.nextInt();
                System.out.print("Please enter second number             : ");
                int y = scanner.nextInt();
                System.out.print("Please enter one of symbol +,-,*, /    : ");
                char z = scanner.next().charAt(0);
                main.getCalculateResult(x, y, z);
                System.out.print("\ndo you want to continue (y/n)          : ");
                //scanner closer
                scanner.close();
            }
        }
    }
}









