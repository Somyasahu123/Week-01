import java.util.Scanner;

class NaturalNumber{
    // Method to calculate sum of n natural numbers using loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input n
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Calculate sum
        int sum = sumOfNaturalNumbers(n);
        
        // Output result
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        
        sc.close();
    }
}
