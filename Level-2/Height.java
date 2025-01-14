import java.util.Scanner;

class Height{
    // Method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int youngestAge = ages[0];
        String youngestFriend = names[0];

        for (int i = 1; i < names.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
        }
        return youngestFriend;
    }

    // Method to find the tallest friend
    public static String findTallest(String[] names, double[] heights) {
        double tallestHeight = heights[0];
        String tallestFriend = names[0];

        for (int i = 1; i < names.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input for age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (in meters) of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        // Find and display the youngest and tallest
        System.out.println("Youngest friend: " + findYoungest(names, ages));
        System.out.println("Tallest friend: " + findTallest(names, heights));
    }
}
