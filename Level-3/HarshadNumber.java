import java.util.Scanner;

class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Initialize sum variable
        int sum = 0;
        int originalNumber = number;
        
        // Loop to calculate the sum of digits
        while (number != 0) {
            sum += number % 10;  // Add the last digit to sum
            number /= 10;  // Remove the last digit
        }
        
        // Check if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }
        
        // Close the scanner
        sc.close();
    }
}
