import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // user for input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Prime check logic
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Number is divisible by a number other than 1 and itself
                    break;
                }
            }
        }
        
        //result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        // Close the scanner
        sc.close();
    }
}
