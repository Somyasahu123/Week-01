import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        
        // Loop to sum numbers until user enters 0
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double num = sc.nextDouble();
            
            if (num == 0) {
                break;  // Stop if user enters 0
            }
            
            total += num;  // Add number to total
        }
        
        // Output sum
        System.out.println("Total sum: " + total);
        
        // Close the scanner
        sc.close();
    }
}
