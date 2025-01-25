import java.util.Scanner;

public class ConvertToUppercase {

    // Method to convert a string to uppercase using charAt() and ASCII logic
    public static String toUpperCaseUsingCharAt(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Convert lowercase letters to uppercase
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch); 
            }
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths differ, strings are not equal
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; 
            }
        }

        return true; // Strings are equal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Converting to uppercase using built-in method
        String upperCaseBuiltIn = userInput.toUpperCase();

        // Converting to uppercase using user-defined method
        String upperCaseCustom = toUpperCaseUsingCharAt(userInput);

        // Comparing the two results
        boolean areEqual = compareStrings(upperCaseBuiltIn, upperCaseCustom);

        // Displaying the results
        System.out.println("\nOriginal String: " + userInput);
        System.out.println("Uppercase using built-in method: " + upperCaseBuiltIn);
        System.out.println("Uppercase using user-defined method: " + upperCaseCustom);
        System.out.println("Are both methods producing the same result? " + (areEqual ? "Yes" : "No"));

        scanner.close();
    }
}