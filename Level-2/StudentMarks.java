import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of students and subjects
        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();
        final int SUBJECTS = 3; // Physics, Chemistry, Maths

        // Array to store marks of students in 3 subjects
        int[][] marks = new int[students][SUBJECTS];
        String[] subjects = {"Physics", "Chemistry", "Maths"};
        
        // Input marks for each student
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < SUBJECTS; j++) {
                System.out.print(subjects[j] + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Compute percentages and grades
        for (int i = 0; i < students; i++) {
            int totalMarks = 0;
            for (int j = 0; j < SUBJECTS; j++) {
                totalMarks += marks[i][j];
            }
            double percentage = totalMarks / (double) SUBJECTS;
            char grade;

            // Determine grade
            if (percentage >= 90) grade = 'A';
            else if (percentage >= 75) grade = 'B';
            else if (percentage >= 50) grade = 'C';
            else grade = 'F';

            // Display results for the student
            System.out.println("Student " + (i + 1) + " - Total: " + totalMarks + 
                               ", Percentage: " + percentage + "%, Grade: " + grade);
        }

        sc.close();
    }
}
