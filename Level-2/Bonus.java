import java.util.Scanner;

class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salaries = new double[10];  // Array to store salaries
        double[] yearsOfService = new double[10];  // Array to store years of service
        double[] bonuses = new double[10];  // Array to store calculated bonuses
        double[] newSalaries = new double[10];  // Array to store updated salaries

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input salaries and years of service for 10 employees
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1) + ":");
            double salary = sc.nextDouble();
            double years = sc.nextDouble();

            // Validate input
            if (salary < 0 || years < 0) {
                System.out.println("Invalid input. Please try again.");
                i--;
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        // Calculate bonuses and new salaries
        for (int i = 0; i < 10; i++) {
            double bonus = (yearsOfService[i] > 5) ? 0.05 * salaries[i] : 0.02 * salaries[i];
            bonuses[i] = bonus;
            newSalaries[i] = salaries[i] + bonus;

            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
    }
}
