import java.util.Scanner;

class CountdownFor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        //user for countdown start number
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();
        
        // Countdown loop using for
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        
        // Close the scanner
        sc.close();
    }
}
