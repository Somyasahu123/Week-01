import java.util.Scanner;

class Divisibility{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
		//Input from user
        int number = sc.nextInt();
        //Check if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
    }
}
