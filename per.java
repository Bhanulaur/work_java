import java.util.Scanner;

public class per {
    public static void main(String[] args) {
        System.out.println("GRADES");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER VALUE = ");
        int a = scanner.nextInt();

        if (a > 80) {
            System.out.println("Value is greater than 80: " + a);
        } else if (a >= 50 && a <= 80) {
            System.out.println("Value is between 50 and 80: " + a);
        } else {
            System.out.println("Value is less than 50: " + a);
        }

        scanner.close();  
    }
}
