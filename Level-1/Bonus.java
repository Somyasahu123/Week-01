import java.util.Scanner;

class Bonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Input user for salary and years of service
        System.out.print("Enter the salary: ");
        double salary = sc.nextDouble();
        
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        
        // Check if the years of service are greater than 5
        if (years > 5) {
            // Calculate and print bonus
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for less than 5 years of service.");
        }
        
        // Close the scanner
        sc.close();
    }
}
