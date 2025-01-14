import java.util.Scanner;
 class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Arrays to store marks, percentages, and grades
        int[] physics = new int[numStudents];
        int[] chemistry = new int[numStudents];
        int[] maths = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            physics[i] = getPositiveMarks(scanner, "Physics");
            chemistry[i] = getPositiveMarks(scanner, "Chemistry");
            maths[i] = getPositiveMarks(scanner, "Maths");

            // Calculate percentage and grade
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            grades[i] = calculateGrade(percentages[i]);
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f%%\t\t%c%n",
                    (i + 1), physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }
    }

    // Function to get positive marks
    private static int getPositiveMarks(Scanner scanner, String subject) {
        int marks;
        do {
            System.out.print(subject + " Marks: ");
            marks = scanner.nextInt();
            if (marks < 0) {
                System.out.println("Marks cannot be negative. Please enter again.");
            }
        } while (marks < 0);
        return marks;
    }

    // Function to calculate grade
    private static char calculateGrade(double percentage) {
        if (percentage >= 90) return 'A';
        else if (percentage >= 75) return 'B';
        else if (percentage >= 50) return 'C';
        else return 'D';
    }
}
