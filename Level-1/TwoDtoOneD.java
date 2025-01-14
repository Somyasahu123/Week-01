import java.util.Scanner;

class TwoDtoOneD{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input rows and columns for the 2D array
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Create the 2D array
        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols]; // 1D array to store elements
        int index = 0; // Index for the 1D array

        // Input elements for the 2D array
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                array[index++] = matrix[i][j]; // Copy to 1D array
            }
        }

        // Display the 1D array
        System.out.print("1D Array: ");
        for (int val : array) {
            System.out.print(val + " ");
        }
    }
}
