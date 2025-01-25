import java.util.Scanner;
public class TrimSpaces {
    // Method to find the start and end of the non-space text
    public static int[] trimIndexes(String str) {
        int start = 0, end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to extract a substring using charAt
    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
		//Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] indexes = trimIndexes(input);
        String trimmed = customSubstring(input, indexes[0], indexes[1]);

        System.out.println("Custom Trimmed: " + trimmed);
        System.out.println("Built-in Trimmed: " + input.trim());
    }
}
