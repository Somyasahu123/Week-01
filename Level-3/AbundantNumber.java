import java.util.Scanner;

class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Initialize sum variable
        int sum = 0;
        
        // Loop 
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;  // Add divisor to sum
            }
        }
        
        // Check if sum of divisors is greater than the number itself
        if (sum > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }
        
        // Close the scanner
        sc.close();
    }
}
