import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Initialize count variable
        int count = 0;
        
        // Loop to count digits
        while (number != 0) {
            number /= 10;  // Remove the last digit
            count++;  // Increment the count
        }
        
        // Output the number of digits
        System.out.println("The number has " + count + " digits.");
        
        // Close the scanner
        sc.close();
    }
}
