import java.util.Scanner;
public class whilelooptable {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER table  = ");
        int a = scanner.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(a + " * " + i + " = " + (i * a));  
            i++;
        }
        scanner.close();
    }
    
}
