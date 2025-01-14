import java.util.Scanner;

class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Check if the number is positive
        if (number > 0) {
            // Print odd and even numbers between 1 and the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            System.out.println("Enter a positive number.");
        }
        
        // Close the scanner
        sc.close();
    }
}
