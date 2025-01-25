import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String input) {
        
        System.out.println("Accessing character at index " + input.length() + ": " + input.charAt(input.length()));
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch
    public static void handleException(String input) {
        try {
            
            System.out.println("Accessing character at index " + input.length() + ": " + input.charAt(input.length()));
        } catch (Exception e) {
            
            System.out.println("StringIndexOutOfBoundsException caught: Index out of bounds for the given string.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        System.out.println("\nDemonstrating StringIndexOutOfBoundsException:");
        try {
             generateException(userInput);
        } catch (Exception e) {
            System.out.println("Exception occurred while generating the exception.");
        }

        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        // Handling the exception
        handleException(userInput);

        scanner.close();
    }
}