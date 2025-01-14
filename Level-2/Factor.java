import java.util.Scanner;

class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Find the greatest factor (besides the number itself)
        int greatestFactor = 1; // Default factor
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        
        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        
        // Close the scanner
        sc.close();
    }
}
