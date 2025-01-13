import java.util.Scanner;

class SampleProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user inputs for name, cities, and distances
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter from city: ");
        String fromCity = sc.nextLine();
        System.out.print("Enter via city: ");
        String viaCity = sc.nextLine();
        System.out.print("Enter to city: ");
        String toCity = sc.nextLine();

        System.out.print("Enter distance from FromCity to ViaCity in miles: ");
        double fromToVia = sc.nextDouble();
        System.out.print("Enter distance from ViaCity to ToCity in miles: ");
        double viaToFinalCity = sc.nextDouble();

        // Time taken to travel
        System.out.print("Enter the time taken in hours: ");
        double timeTaken = sc.nextDouble();

        // Print the details
        System.out.println("The travel details are for " + name);
        System.out.println("From: " + fromCity + " to " + viaCity + " is " + fromToVia + " miles.");
        System.out.println("From: " + viaCity + " to " + toCity + " is " + viaToFinalCity + " miles.");
        System.out.println("Total time taken is: " + timeTaken + " hours.");
    }
}

