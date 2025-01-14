import java.util.Scanner;

class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Initialize variables
        int sum = 0;
        int originalNumber = number;
        
        // While loop to process each digit of the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            sum += digit * digit * digit;  // Add the cube of the digit to sum
            number /= 10;  // Remove the last digit
        }
        
        // Check if the number is equal to the sum of cubes of its digits
        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        
        // Close the scanner
        sc.close();
    }
}
