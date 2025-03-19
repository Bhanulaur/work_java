
import java.util.Scanner;  // Import Scanner class

public class UserInputExample {
    public static void main(String[] args) {
        System.out.print("calculator program");
        Scanner scanner = new Scanner(System.in);  // Create Scanner object
        
        // Taking string input
        System.out.print("Enter operator (+, -, *, /): ");
        char opr = scanner.next().charAt(0);
         // Read user input as string
        
        // Taking integer input
        System.out.print("Enter first number");
        int first = scanner.nextInt();  // Read user input as integer

        System.out.print("Entre second number");
        int second = scanner.nextInt();

        if (opr == '+') { 
            int result = first + second;
            System.out.println("The operator is addition. " + result);
        } else if  ( opr == '-') {
            int result = first - second;
            System.out.println("The operator is substration " + result);
        } else if (opr == '*') {
            int result = first * second;
            System.out.println("The operator is multiply " + result);
        } else if ( opr == '/') {
            if (second != 0) {
                double result = (double) first / second;
                System.out.println("The result of division: " + result);
            }
            else {
                System.out.println("second value is equal to zero can't divide");   
            }
        }
         else {
        System.out.println("invaid operator");
        }
        
        
    
        scanner.close();  // Close Scanner
    }
}
