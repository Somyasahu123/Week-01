import java.util.Scanner;

public class IllegalArgumentExceptionDemo{

    // Method to generate IllegalArgumentException
    public static void generateException(String input) {
        System.out.println("Creating substring with invalid indices (5, 3): " + input.substring(5, 3));
    }

    // Method to handle IllegalArgumentException using try-catch
    public static void handleException(String input) {
        try {
            
            System.out.println("Creating substring with invalid indices (5, 3): " + input.substring(5, 3));
        } catch (IllegalArgumentException e) {
            
            System.out.println("IllegalArgumentException caught: Start index cannot be greater than the end index.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string (minimum length 6): ");
        String userInput = scanner.next();

        System.out.println("\nDemonstrating IllegalArgumentException:");
        try {
              generateException(userInput);
        } catch (Exception e) {
            System.out.println("Exception occurred while generating the exception: Start index cannot be greater than the end index.");
        }

        System.out.println("\nHandling IllegalArgumentException:");
        // Handling the exception
        handleException(userInput);

        scanner.close();
    }
}