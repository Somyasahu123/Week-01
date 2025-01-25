import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        
        System.out.println("Converting text to number: " + Integer.parseInt(text));
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleException(String text) {
        try {
            
            System.out.println("Converting text to number: " + Integer.parseInt(text));
        } catch (NumberFormatException e) {
            
            System.out.println("NumberFormatException caught: Invalid input for conversion to number.");
        } catch (RuntimeException e) {
            
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string to convert to a number: ");
        String userInput = scanner.next();

        System.out.println("\nDemonstrating NumberFormatException:");
        try {
            generateException(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred while generating the exception: Invalid input for conversion to number.");
        }

        System.out.println("\nHandling NumberFormatException:");
        // Handling the exception
        handleException(userInput);

        scanner.close();
    }
}
