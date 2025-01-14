public class NumberChecker {
    public static void main(String[] args) {
        int number = 12321; // Example number

        // Calling and displaying results of various methods
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));

        int[] digits = extractDigits(number);
        System.out.print("Digits array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad number: " + isHarshadNumber(number, digits));

        int[][] frequency = digitFrequency(number);
        System.out.println("Digit Frequency:");
        for (int[] row : frequency) {
            System.out.println("Digit " + row[0] + ": " + row[1] + " times");
        }
    }

    /**
     * Method to count the number of digits in a given number.
     */
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    /**
     * Method to extract the digits of a number into an array.
     */
    public static int[] extractDigits(int number) {
        String numberStr = String.valueOf(number);
        int[] digits = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        return digits;
    }

    /**
     * Method to find the sum of the digits of a number using the digits array.
     */
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    /**
     * Method to find the sum of the squares of the digits of a number using the digits array.
     */
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    /**
     * Method to check if a number is a Harshad number using the digits array.
     * A number is a Harshad number if it is divisible by the sum of its digits.
     */
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sumOfDigits = sumOfDigits(digits);
        return number % sumOfDigits == 0;
    }

    /**
     * Method to find the frequency of each digit in the number.
     * Returns a 2D array where the first column is the digit, and the second is its frequency.
     */
    public static int[][] digitFrequency(int number) {
        int[] frequency = new int[10]; // Array to store frequency of digits (0-9)
        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        // Creating a 2D array for storing digit and its frequency
        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) uniqueCount++;
        }

        int[][] result = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;      // Digit
                result[index][1] = frequency[i]; // Frequency
                index++;
            }
        }
        return result;
    }
}
