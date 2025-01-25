import java.util.Scanner;

public class FrequencyNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[] result = findFrequency(input);

        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String row : result) {
            if (row != null) {
                System.out.println(row);
            }
        }
        sc.close();
    }

    // Method to calculate frequency using nested loops
    public static String[] findFrequency(String str) {
        char[] chars = str.toCharArray();
        int[] frequency = new int[chars.length];
        boolean[] visited = new boolean[chars.length];
        String[] result = new String[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                result[i] = chars[i] + "          | " + count;
            }
        }
        return result;
    }
}
