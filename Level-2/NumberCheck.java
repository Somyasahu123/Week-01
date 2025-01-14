import java.util.Scanner;

class NumberCheck {
    // Method to check if the number is positive or negative
    public static String isPositive(int number) {
        if (number < 0) {
            return "Negative";
        }
        return "Positive";
    }

    // Method to check if the number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Take user input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check if positive, negative, even, or odd
        for (int number : numbers) {
            System.out.print(number + " is ");
            System.out.println(isPositive(number));
            if (number >= 0) {
                System.out.println(number + " is " + isEven(number));
            }
        }

        // Compare the first and last elements
        int comparison = compare(numbers[0], numbers[4]);
        if (comparison == 1) {
            System.out.println("First element is greater than the last element.");
        } else if (comparison == 0) {
            System.out.println("First element is equal to the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }
    }
}
