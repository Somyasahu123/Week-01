import java.util.*;
public class NullPointerExceptionDemo {
    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // Attempt to call a method on a null reference
        System.out.println(text.length());
    }

    // Method to demonstrate handling NullPointerException
    public static void handleException() {
        String text = null;
        try {
            // Attempt to call a method on a null reference
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception generated: " + e.getMessage());
        }

        System.out.println("\nHandling NullPointerException:");
        handleException();
    }
}