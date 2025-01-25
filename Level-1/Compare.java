/*
Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint => 
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result 

*/

import java.util.Scanner;

public class Compare{
    
    // Method to compare two strings using charAt() method
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false; // If lengths are different, strings are not equal
        }
        
        // Compare each character of the two strings
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If any character is different, strings are not equal
            }
        }
        
        // If all characters match, strings are equal
        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        //Input the first string
        System.out.print("Enter the first string: ");
        String string1 = sc.next(); // Read the first string

        //Input the second string
        System.out.print("Enter the second string: ");
        String string2 = sc.next(); // Read the second string

        // Compare strings using the custom charAt() method
        boolean charAtResult = compareStringsUsingCharAt(string1, string2);

        // Compare strings using the built-in equals() method
        boolean equalsResult = string1.equals(string2);

        // Display the results
        System.out.println("Comparison using charAt() method: " + charAtResult);
        System.out.println("Comparison using equals() method: " + equalsResult);

        // Check if the results of both methods are the same
        if (charAtResult == equalsResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The results of the two methods are different.");
        }

        // Close the scanner
        sc.close();
    }
}
