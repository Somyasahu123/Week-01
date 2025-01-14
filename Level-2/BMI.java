import java.util.Scanner;

class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user for weight and height
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter height (in cm): ");
        double height = sc.nextDouble();
        
        // Convert height from cm to meters
        height = height / 100;
        
        // Calculate BMI
        double bmi = weight / (height * height);
        
        // Determine weight status based on BMI
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi <= 29.9) {
            status = "Overweight";
        } else {
            status = "Obesity";
        }
        
        // Display BMI and status
        System.out.println("BMI: " + bmi);
        System.out.println("Weight Status: " + status);
        
        // Close the scanner
        sc.close();
    }
}
