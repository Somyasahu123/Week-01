import java.util.Random;

class Football{
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        // Fill the heights array with random values between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // Range [150, 250]
        }

        // Display the heights
        System.out.println("Player Heights (in cms):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        System.out.println("Sum of heights: " + sumOfHeights(heights));
        System.out.println("Mean height: " + meanHeight(heights));
        System.out.println("Shortest height: " + shortestHeight(heights));
        System.out.println("Tallest height: " + tallestHeight(heights));
    }

    // Method to calculate the sum of all heights
    public static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double meanHeight(int[] heights) {
        return sumOfHeights(heights) / (double) heights.length;
    }

    // Method to find the shortest height
    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find the tallest height
    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
}
