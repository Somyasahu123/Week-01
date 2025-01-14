import java.util.Scanner;

class NaturalNumbersFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user for a number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Check if the number is a natural number
        if (n > 0) {
            // Calculate sum using for loop
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            
            // Calculate sum using formula
            int formulaSum = (n * (n + 1)) / 2;
            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
        } else {
            System.out.println("The number is not a natural number.");
        }
        
        // Close the scanner
        sc.close();
    }
}
