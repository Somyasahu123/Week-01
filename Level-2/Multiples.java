import java.util.Scanner;

class Multiples{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //user to input a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Loop backward from 100 to 1
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of the input number
            if (i % number == 0) {
                // If true, print the multiple
                System.out.println(i);
            }
        }

        // Close the scanner
        sc.close();
    }
}
