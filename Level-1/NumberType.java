import java.util.Scanner;

class NumberType{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array to store 5 numbers
        int[] numbers = new int[5];
        
        for (int i = 0; i < numbers.length; i++) {
            // Take input for each number
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            
            // Check if the number is positive, negative, or zero, and check if it's even or odd if positive
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is positive and even.");
                } else {
                    System.out.println(numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative.");
            } else {
                System.out.println(numbers[i] + " is zero.");
            }
        }

        // Compare the first and last elements
        if (numbers[0] > numbers[4]) {
            System.out.println("First number is greater than last.");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("First number is less than last.");
        } else {
            System.out.println("First number is equal to last.");
        }
    }
}
