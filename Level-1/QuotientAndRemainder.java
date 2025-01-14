import java.util.Scanner;

class QuotientAndRemainder {
    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number and divisor
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        
        // Calculate quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);
        
        // Output result
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
        
        sc.close();
    }
}

