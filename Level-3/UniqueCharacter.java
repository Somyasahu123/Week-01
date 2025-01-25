import java.util.Scanner;
public class UniqueCharacter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        
        char[] uniqueChars = findUniqueCharacters(input);
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            if (c != 0) System.out.print(c + " ");
        }
        sc.close();
    }

    // Method to calculate string length without using length()
    public static int getLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Do nothing, loop terminates when exception occurs
        }
        return length;
    }

    // Method to find unique characters
    public static char[] findUniqueCharacters(String str) {
        int length = getLength(str);
        char[] uniqueChars = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
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
}
