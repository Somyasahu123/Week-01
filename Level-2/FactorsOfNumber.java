import java.util.Scanner;

class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Find and print the factors
        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        
        // Close the scanner
        sc.close();
    }
}
