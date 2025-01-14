import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user for a number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Check if the number is positive
        if (n > 0) {
            // Calculate factorial using for loop
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + n + " is: " + factorial);
        } else {
            System.out.println("Enter a positive integer.");
        }
        
        // Close the scanner
        sc.close();
    }
}
