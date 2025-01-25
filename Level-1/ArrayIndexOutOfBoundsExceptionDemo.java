import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println("Accessing element at index " + names.length + ": " + names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing element at index " + names.length + ": " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Index out of bounds for the array.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for array of names
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException:");
        try {
            // Generating the exception
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred while generating the exception:");
        }

        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        // Handling the exception
        handleException(names);

        scanner.close();
    }
}