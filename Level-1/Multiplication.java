import java.util.Scanner;

class Multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Generate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        
        // Close the scanner
        sc.close();
    }
}
