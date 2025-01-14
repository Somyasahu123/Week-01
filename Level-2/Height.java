import java.util.Scanner;

public class Height{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};  // Names of friends
        int[] ages = new int[3];  // Array to store ages
        double[] heights = new double[3];  // Array to store heights

        // Input age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age and height for " + names[i] + ":");
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        // Identify the youngest and tallest
        int youngestIndex = 0, tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) youngestIndex = i;
            if (heights[i] > heights[tallestIndex]) tallestIndex = i;
        }

        // Display results
        System.out.println("Youngest friend: " + names[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex]);
    }
}
