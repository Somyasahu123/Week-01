import java.util.Scanner;

public class ConvertToLowercase {

    // Method to convert a string to lowercase using charAt() and ASCII logic
    public static String toLowerCaseUsingCharAt(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Convert uppercase letters to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch); // Keep non-uppercase characters unchanged
            }
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; 
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

        // Converting to lowercase using built-in method
        String lowerCaseBuiltIn = userInput.toLowerCase();

        // Converting to lowercase using user-defined method
        String lowerCaseCustom = toLowerCaseUsingCharAt(userInput);

        // Comparing the two results
        boolean areEqual = compareStrings(lowerCaseBuiltIn, lowerCaseCustom);

        // Displaying the results
        System.out.println("\nOriginal String: " + userInput);
        System.out.println("Lowercase using built-in method: " + lowerCaseBuiltIn);
        System.out.println("Lowercase using user-defined method: " + lowerCaseCustom);
        System.out.println("Are both methods producing the same result? " + (areEqual ? "Yes" : "No"));

        scanner.close();
    }
}