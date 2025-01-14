import java.util.Scanner;

class SimpleInterest {
    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input values for principal, rate, and time
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter the time (in years): ");
        double time = sc.nextDouble();
        
        // Calculate Simple Interest
        double interest = calculateSimpleInterest(principal, rate, time);
        
        // Output result
        System.out.println("The Simple Interest is " + interest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
        
        sc.close();
    }
}
