import java.util.Scanner;

public class NonRepeating{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        char result = findFirstNonRepeating(input);
        if (result != 0) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
        sc.close();
    }

    // Method to find the first non-repeating character
    public static char findFirstNonRepeating(String str) {
        int[] frequency = new int[256];
        int length = str.length();

        // Count frequency of each character
        for (int i = 0; i < length; i++) {
            frequency[str.charAt(i)]++;
        }

        // Find first non-repeating character
        for (int i = 0; i < length; i++) {
            if (frequency[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return 0; // No non-repeating character found
    }
}
