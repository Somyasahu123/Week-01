import java.util.Scanner;

class Number{
    // Method to check if number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) return 1; // Positive number
        else if (number < 0) return -1; // Negative number
        else return 0; // Zero
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Check number and Output result
        int result = checkNumber(number);
        System.out.println("The number is: " + (result == 1 ? "Positive" : result == -1 ? "Negative" : "Zero"));
        
        sc.close();
    }
}
