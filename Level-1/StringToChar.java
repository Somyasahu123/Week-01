import java.util.Scanner;

public class StringToChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Call user-defined method to get characters
        char[] customCharArray = getCharsFromString(text);

        // Use built-in toCharArray() method to get characters
        char[] builtInCharArray = text.toCharArray();

        // Compare the two character arrays
        boolean areEqual = compareCharArrays(customCharArray, builtInCharArray);

        // Display the results
        System.out.println("\nCharacters using user-defined method: ");
        printCharArray(customCharArray);
        
        System.out.println("Characters using toCharArray() method: ");
        printCharArray(builtInCharArray);
        
        System.out.println("Are the two arrays equal? " + areEqual);

        sc.close();
    }

    // Method to return characters from a string without using toCharArray()
    public static char[] getCharsFromString(String str) {
        char[] charArray = new char[str.length()]; // Create a character array of the same length as the string
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i); // Assign each character from the string to the array
        }
        return charArray;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false; // Arrays are not equal if their lengths differ
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false; // If any character differs, arrays are not equal
            }
        }
        return true; // Arrays are equal if all characters match
    }

    // Helper method to print characters in an array
    public static void printCharArray(char[] charArray) {
        for (char c : charArray) {
            System.out.print(c + " "); // Print each character separated by a space
        }
        System.out.println(); // Print a new line at the end
    }
}
