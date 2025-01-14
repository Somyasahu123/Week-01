import java.util.Scanner;

class CountDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Input user for countdown start number
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();
        
        // Countdown loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;  // Decrement counter
        }
        
        // Close the scanner
        sc.close();
    }
}
