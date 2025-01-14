import java.util.Scanner;

class Rounds{
    // Method to calculate the number of rounds needed to complete a 5km run
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // 5 kilometers in meters
        return (int) Math.ceil(totalDistance / perimeter); // rounding up 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input sides of the triangle
        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = sc.nextDouble();
        
        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = sc.nextDouble();
        
        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = sc.nextDouble();
        
        // Calculate rounds
        int rounds = calculateRounds(side1, side2, side3);
        
        // Output result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 kilometers.");
        
        sc.close();
    }
}
