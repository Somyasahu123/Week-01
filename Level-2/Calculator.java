import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input for marks in 3 subjects
        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();
        
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();
        
        System.out.print("Enter marks for Maths: ");
        double maths = sc.nextDouble();
        
        // Calculate total and percentage
        double total = physics + chemistry + maths;
        double percentage = (total / 300) * 100;
        
        // Calculate grade based on percentage
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        // Display results
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        
        // Close the scanner
        sc.close();
    }
}
