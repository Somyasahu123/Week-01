class NumberCheck3{

    public static void main(String[] args) {
        int number = 121; // Example number

        int[] digits = storeDigits(number);
        reverseDigits(digits);
        System.out.println("Is Palindrome: " + isPalindrome(digits, number));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
    }

    public static int[] storeDigits(int num) {
        int[] digits = new int[countDigits(num)];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static void reverseDigits(int[] digits) {
        int left = 0, right = digits.length - 1;
        while (left < right) {
            int temp = digits[left];
            digits[left] = digits[right];
            digits[right] = temp;
            left++;
            right--;
        }
    }

    public static boolean isPalindrome(int[] digits, int num) {
        int reversedNum = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            reversedNum = reversedNum * 10 + digits[i];
        }
        return num == reversedNum;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }
}
