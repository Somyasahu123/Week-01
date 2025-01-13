import java.util.Scanner;

class TotalIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking salary and bonus from user
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();

        // Calculating total income
        double totalIncome = salary + bonus;

        // Printing the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
    }
}
