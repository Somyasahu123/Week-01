import java.util.Scanner;
class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input from user
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();

        // Step 2: Convert kilometers to miles (1 km = 0.621371 miles)
        double miles = km/1.6;

        // Step 3: Display the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}

