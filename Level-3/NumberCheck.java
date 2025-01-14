class NumberCheck{
    public static void main(String[] args) {
        int number = 153; // Example number
        
        System.out.println("Count of digits: " + countDigits(number));
        int[] digits = storeDigits(number);
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(digits, number));
        System.out.println("Largest digit: " + largestDigit(digits));
        System.out.println("Smallest digit: " + smallestDigit(digits));
    }

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] storeDigits(int num) {
        int digitCount = countDigits(num);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int[] digits, int num) {
        int sum = 0;
        int length = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, length);
        }
        return sum == num;
    }

    public static int largestDigit(int[] digits) {
        int max = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > max) {
                max = digit;
            }
        }
        return max;
    }

    public static int smallestDigit(int[] digits) {
        int min = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < min) {
                min = digit;
            }
        }
        return min;
    }
}
