import java.util.Scanner;
public class CharacterType {
    // Method to determine the type of character
    public static String getCharacterType(char ch) {
        if (Character.isLetter(ch)) {
			// Convert to lowercase for uniformity
            ch = Character.toLowerCase(ch); 
            if ("aeiou".indexOf(ch) != -1) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to generate a 2D array of characters and their types
    public static String[][] analyzeCharacters(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = getCharacterType(str.charAt(i));
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResult(String[][] data) {
        System.out.println("Character\tType");
        for (String[] entry : data) {
            System.out.println(entry[0] + "\t\t" + entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] charData = analyzeCharacters(input);

        displayResult(charData);
    }
}
