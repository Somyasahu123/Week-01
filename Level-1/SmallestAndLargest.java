import java.util.Scanner;

public class SmallestAndLargest {
    // Method to find smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input three numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        // Find smallest and largest
        int[] result = findSmallestAndLargest(num1, num2, num3);
        
        // Output result
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
        
        sc.close();
    }
}
