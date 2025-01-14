import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store multiplication results
        int[] table = new int[10];

        // Calculate multiplication table
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1); // Store result in the array
        }

        // Display the multiplication table
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
    }
}
