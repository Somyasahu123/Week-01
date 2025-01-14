import java.util.Scanner;

class Power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for number and power
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        
        // Calculate power
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        
        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
        
        // Close the scanner
        sc.close();
    }
}
