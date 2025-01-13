import java.util.Scanner;
class DistanceConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for distance 
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        
        // Conversion formulas: 1 yard = 3 feet, 1 mile = 1760 yards
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        
        // Output
        System.out.printf("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
    }
}

