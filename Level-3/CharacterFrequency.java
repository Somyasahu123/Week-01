import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[][] result = findFrequency(input);

        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] row : result) {
            if (row[0] != null) {
                System.out.println(row[0] + "          | " + row[1]);
            }
        }
        sc.close();
    }

    // Method to find frequency of characters
    public static String[][] findFrequency(String str) {
        int[] frequency = new int[256];
        int length = str.length();

        // Count frequency of each character
        for (int i = 0; i < length; i++) {
            frequency[str.charAt(i)]++;
        }

        // Store results in a 2D array
        String[][] result = new String[256][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }
        return result;
    }
}
