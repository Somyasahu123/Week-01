import java.util.Scanner;
class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        
        // Close the scanner
        sc.close();
    }
}
