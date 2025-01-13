import java.util.Scanner;

class TriangularRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking side lengths of the triangle
        System.out.print("Enter side 1 of the triangle: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of the triangle: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of the triangle: ");
        double side3 = sc.nextDouble();

        // Calculating perimeter
        double perimeter = side1 + side2 + side3;

        // Total distance for 5 km
        double totalDistance = 5000; // 5 km in meters

        // Calculating number of rounds
        double rounds = totalDistance / perimeter;

        // Print the result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}


