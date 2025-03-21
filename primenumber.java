import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        // Create scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check if the number is prime
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else {
            boolean isPrime = true;
            
            // Check divisibility from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            // Output the result
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
