import java.util.Scanner;

class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input user to enter a natural number
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check if the number is valid
        if (number <= 0) {
            System.out.println("Error: Enter a natural number greater than 0.");
            return; // Exit the program if invalid input
        }

        // Create arrays to store odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];
        int oddIndex = 0, evenIndex = 0; // Indices for odd and even arrays

        // Iterate from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; // Add to even array
            } else {
                oddNumbers[oddIndex++] = i; // Add to odd array
            }
        }

        // Display the odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Display the even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
