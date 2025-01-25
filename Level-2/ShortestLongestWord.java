import java.util.Scanner;
public class ShortestLongestWord {
    // Method to find the shortest and longest word in a string
    public static String findShortestLongest(String str) {
        String[] words = str.split(" "); // Split text into words
        String shortest = words[0], longest = words[0];

        for (String word : words) {
            //Update shortest
			if (word.length() < shortest.length()) shortest = word;
			//Update Longest
            if (word.length() > longest.length()) longest = word;  
        }

        return "Shortest: " + shortest + "\nLongest: " + longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find and display shortest and longest words
        System.out.println(findShortestLongest(input));
    }
}
