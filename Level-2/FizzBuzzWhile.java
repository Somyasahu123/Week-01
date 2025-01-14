import java.util.Scanner;

class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user for input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // FizzBuzz logic using while loop
        int i = 1;
        while (i <= number) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++;
        }
        
        // Close the scanner
        sc.close();
    }
}
