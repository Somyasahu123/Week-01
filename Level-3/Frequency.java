import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[][] result = calculateFrequency(input);

        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] row : result) {
            if (row[0] != null) {
                System.out.println(row[0] + "          | " + row[1]);
            }
        }
        sc.close();
    }

    // Method to find unique characters
    public static char[] findUniqueCharacters(String str) {
        char[] uniqueChars = new char[str.length()];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (current == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) uniqueChars[index++] = current;
        }
        return uniqueChars;
    }

    // Method to calculate frequency using unique characters
    public static String[][] calculateFrequency(String str) {
        char[] uniqueChars = findUniqueCharacters(str);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            if (uniqueChars[i] != 0) {
                int frequency = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (uniqueChars[i] == str.charAt(j)) {
                        frequency++;
                    }
                }
                result[i][0] = String.valueOf(uniqueChars[i]);
                result[i][1] = String.valueOf(frequency);
            }
        }
        return result;
    }
}
