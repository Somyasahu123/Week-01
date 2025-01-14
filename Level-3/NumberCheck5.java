class NumberCheck5 {

    public static void main(String[] args) {
        int number = 6; // Example number

        int[] factors = findFactors(number);
        System.out.println("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println("\nGreatest factor: " + greatestFactor(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Product of cube of factors: " + productOfCubeOfFactors(factors));
        System.out.println("Is Perfect: " + isPerfectNumber(factors, number));
        System.out.println("Is Abundant: " + isAbundantNumber(factors, number));
        System.out.println("Is Deficient: " + isDeficientNumber(factors, number));
        System.out.println("Is Strong: " + isStrongNumber(number));
    }

    public static int[] findFactors(int num) {
        int[] factors = new int[num];
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[count++] = i;
            }
        }
        return java.util.Arrays.copyOf(factors, count);
    }

    public static int greatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static int productOfCubeOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int[] factors, int num) {
        int sum = sumOfFactors(factors) - num; // Proper divisors
        return sum == num;
    }

    public static boolean isAbundantNumber(int[] factors, int num) {
        int sum = sumOfFactors(factors) - num; // Proper divisors
        return sum > num;
    }

    public static boolean isDeficientNumber(int[] factors, int num) {
        int sum = sumOfFactors(factors) - num; // Proper divisors
        return sum < num;
    }

    public static boolean isStrongNumber(int num) {
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
