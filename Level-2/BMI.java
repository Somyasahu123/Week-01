import java.util.Scanner;

class BMI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // Create arrays to store height, weight, BMI, and weight status
        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        // Input weight and height
        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.print(height[i] + "\t" + weight[i] + "\t" + bmi[i] + "\t" + status[i] + "\n");
        }
        sc.close();
    }
}
