import java.util.Scanner;

public class VowelsConsonants {
    // Method to count vowels and consonants
    public static int[] countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;

        for (char ch : str.toLowerCase().toCharArray()) {
			// Check if character is a letter
            if (ch >= 'a' && ch <= 'z') { 
                if ("aeiou".indexOf(ch) != -1) {
					// Character is a vowel
                    vowels++; 
                } else {
					 // Character is a consonant
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants}; // Return counts as an array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Count vowels and consonants
        int[] counts = countVowelsConsonants(input);

        // Display results
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }
}
