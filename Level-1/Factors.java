import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //Ask user for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize array to store factors and variables
        int maxFactor = 10; // Initial array size
        int[] factors = new int[maxFactor];
        int index = 0; // Index for the factors array

        // Find all factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Resize array if needed
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the size
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i; // Store the factor
            }
        }

        // Display the factors
        System.out.print("Factors: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
