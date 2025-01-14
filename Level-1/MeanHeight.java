import java.util.Scanner;

class MeanHeight {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Create an array to store the heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0; // Variable to store the sum of heights

        // Input heights from the user
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i]; // Add each height to the sum
        }

        // Calculate the mean height
        double mean = sum / 11;
        System.out.println("Mean height of the football team: " + mean);
    }
}
