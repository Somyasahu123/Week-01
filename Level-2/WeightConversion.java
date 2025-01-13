import java.util.Scanner;

class WeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking weight in pounds from user
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        // Converting pounds to kilograms
        double kilograms = pounds * 2.2;

        // Printing the result
        System.out.println("The weight of the person in pound is " + pounds + " and in kg is " + kilograms);
    }
}
