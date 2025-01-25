/*Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
Hint => 
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
*/


import java.util.Scanner;

public class SubstringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the main string
        System.out.print("Enter the main string: ");
        String text = sc.next();

        // Take user input for start and end indices
        System.out.print("Enter the start index: ");
        int startIndex = sc.nextInt();
        System.out.print("Enter the end index: ");
        int endIndex = sc.nextInt();

        // Create a substring using charAt()
        String customSubstring = createSubstringUsingCharAt(text, startIndex, endIndex);

        // Create a substring using built-in substring() method
        String builtInSubstring = text.substring(startIndex, endIndex);

        // Compare the two substrings
        boolean areEqual = compareStringsUsingCharAt(customSubstring, builtInSubstring);

        // Display results
        System.out.println("\nSubstring using charAt(): " + customSubstring);
        System.out.println("Substring using built-in method: " + builtInSubstring);
        System.out.println("Are the substrings equal? " + areEqual);

        sc.close();
    }

    // Method to create a substring using charAt()
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}



