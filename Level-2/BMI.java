import java.util.Scanner;

class BMI{
    // Method to calculate BMI for each person
    public static double calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        height = height / 100;
        return weight / (height * height);
    }

    // Method to determine the BMI status
    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][3]; // 10 persons, 3 columns (weight, height, BMI)

        // Input weight and height for each person
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();

            // Calculate BMI
            personData[i][2] = calculateBMI(personData[i][0], personData[i][1]);
        }

        // Display BMI and status
        System.out.println("\nPerson Details (Weight, Height, BMI, Status):");
        for (int i = 0; i < 10; i++) {
            double bmi = personData[i][2];
            String status = determineBMIStatus(bmi);
            System.out.println("Person " + (i + 1) + ": " + personData[i][0] + " kg, "
                    + personData[i][1] + " cm, BMI: " + bmi + ", Status: " + status);
        }
    }
}
