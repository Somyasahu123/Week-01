import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number from the user
        System.out.print("Enter a number: ");
        String number = sc.next();

        // Frequency array to store the count of each digit
        int[] frequency = new int[10];

        // Count the frequency of each digit
        for (int i = 0; i < number.length(); i++) {
            char digitChar = number.charAt(i);
            if (Character.isDigit(digitChar)) { // Ensure it's a digit
                int digit = Character.getNumericValue(digitChar);
                frequency[digit]++;
            }
        }

        // Display the frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        sc.close();
    }
}
