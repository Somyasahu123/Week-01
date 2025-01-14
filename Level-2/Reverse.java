import java.util.Scanner;

class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //user input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find the count of digits in the number
        int temp = number;
        int digitCount = 0;
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }

        // Store digits of the number in an array
        int[] digits = new int[digitCount];
        temp = number;
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Display the digits in reverse order
        System.out.print("Reversed number: ");
        for (int i = digitCount - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        System.out.println();
        sc.close();
    }
}
