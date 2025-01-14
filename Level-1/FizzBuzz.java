import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input number from user
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Error: Enter a positive integer.");
            return;
        }

        // Create an array to store results
        String[] results = new String[number + 1];

        // Iterate from 0 to the entered number
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Display the results
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
