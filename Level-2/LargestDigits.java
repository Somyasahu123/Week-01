import java.util.Scanner;
import java.util.Arrays;

class LargestDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Handle negative numbers
        number = Math.abs(number);

        // Initial array setup
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        // Extract digits with dynamic array resizing
        while (number != 0) {
            if (index == maxDigits) {
                // Increase array size by 10
                maxDigits += 10;
                digits = Arrays.copyOf(digits, maxDigits);
            }
            digits[index] = (int)(number % 10);
            number /= 10;
            index++;
        }

        if (index == 0) {
            System.out.println("No digits found.");
            sc.close();
            return;
        }

        // Find largest and second largest
        int largest = digits[0];
        int secondLargest = -1; // Initialize to -1 to handle cases with single unique digit

        for (int i = 1; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second Largest Digit: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit.");
        }

        sc.close();
    }
}
