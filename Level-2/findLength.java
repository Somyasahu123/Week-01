import java.util.Scanner;
public class findLength{

    // Method to find length of string without using length() method
    public static int findLength(String str) {
        int count = 0;
        try {
            // Iterate until charAt throws exception
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception handled, return count as length
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Using built-in length() method
        int lengthUsingBuiltInMethod = input.length();
        
        // Using custom method to find length without length() method
        int lengthWithoutBuiltInMethod = findLength(input);

        // Displaying results
        System.out.println("Length using built-in method: " + lengthUsingBuiltInMethod);
        System.out.println("Length without built-in method: " + lengthWithoutBuiltInMethod);

        sc.close();
    }
}
