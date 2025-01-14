import java.util.Scanner;

class SumNumbers {
    public static void main(String[] args) {
        // Array to store up to 10 numbers
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        Scanner sc = new Scanner(System.in);

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            // Break if input is 0 or negative or array is full
            if (input <= 0 || index == numbers.length) {
                break;
            }

            // Store the input in the array and update index
            numbers[index++] = input;
        }

        // Calculate the sum of the numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the numbers and the sum
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nTotal sum: " + total);
    }
}
