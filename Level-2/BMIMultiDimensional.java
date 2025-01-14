import java.util.Scanner;

class BMIMultiDimensional{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // 2D array to store height, weight, and BMI
        double[][] personData = new double[numberOfPersons][3]; // [][0]=Weight, [][1]=Height, [][2]=BMI
        String[] weightStatus = new String[numberOfPersons];

        // Input weight and height with validation
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");

            // Input weight
            while (true) {
                System.out.print("Enter weight in kg: ");
                if (scanner.hasNextDouble()) {
                    double weightInput = scanner.nextDouble();
                    if (weightInput > 0) {
                        personData[i][0] = weightInput;
                        break;
                    } else {
                        System.out.println("Weight must be positive. Please try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Clear invalid input
                }
            }

            // Input height
            while (true) {
                System.out.print("Enter height in meters: ");
                if (scanner.hasNextDouble()) {
                    double heightInput = scanner.nextDouble();
                    if (heightInput > 0) {
                        personData[i][1] = heightInput;
                        break;
                    } else {
                        System.out.println("Height must be positive. Please try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Clear invalid input
                }
            }
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < numberOfPersons; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine weight status based on BMI
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display BMI details
        System.out.println("\n--- BMI Details ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}
