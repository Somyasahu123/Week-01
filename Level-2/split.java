import java.util.Scanner;
public class split{

    // Method to split string into words without using split()
    public static String[] splitWords(String str) {
        int spaceCount = 0;

        // Count spaces to determine the number of words
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int start = 0, index = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                words[index++] = str.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = str.substring(start);
        return words;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Custom split and built-in split
        String[] wordsCustom = splitWords(input);
        String[] wordsBuiltIn = input.split(" ");

        // Display results
        System.out.println("Words using custom split method: ");
        for (String word : wordsCustom) {
            System.out.println(word);
        }

        System.out.println("Words using built-in split method: ");
        for (String word : wordsBuiltIn) {
            System.out.println(word);
        }

        sc.close();
    }
}


