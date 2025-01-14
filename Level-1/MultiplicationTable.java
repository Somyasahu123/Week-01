import java.util.Scanner;

class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Generate multiplication tables from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println("Multiplication table for " + number + " x " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(number + " * " + j + " = " + (number * j));
            }
            System.out.println();
        }
    }
}
