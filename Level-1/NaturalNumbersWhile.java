import java.util.Scanner;

class NaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user for a number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Check if the number is a natural number
        if (n > 0) {
            // Calculate sum using while loop
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            
            // Calculate sum using formula
            int formulaSum = (n * (n + 1)) / 2;
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
        } else {
            System.out.println("The number is not a natural number.");
        }
        
        // Close the scanner
        sc.close();
    }
}
