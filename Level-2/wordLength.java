import java.util.Scanner;
public class wordLength{
    // Method to split text into words and find their lengths
    public static String[][] wordsWithLengths(String str) {
        String[] words = str.split(" "); // Use space to split words
        String[][] result = new String[words.length][2]; // Create a 2D array

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Store the word
            result[i][1] = String.valueOf(words[i].length()); // Store the word's length as a string
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Get words and their lengths
        String[][] wordData = wordsWithLengths(input);

        // Display in tabular format
        System.out.println("Word\tLength");
        for (String[] word : wordData) {
            System.out.println(word[0] + "\t" + Integer.parseInt(word[1]));
        }
    }
}
