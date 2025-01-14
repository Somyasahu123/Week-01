import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user for a number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Check if the number is positive
        if (n > 0) {
            // Calculate factorial using while loop
            int factorial = 1;
            int i = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + n + " is: " + factorial);
        } else {
            System.out.println("Enter a positive integer.");
        }
        
        // Close the scanner
        sc.close();
    }
}
