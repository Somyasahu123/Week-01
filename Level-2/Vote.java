import java.util.Scanner;

class Vote {
    // Method to check if a student can vote based on age
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18; // Can vote if age is 18 or above
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        // Take user input for the ages of 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Check and display if each student can vote
        for (int age : ages) {
            if (canStudentVote(age)) {
                System.out.println("Student of age " + age + " can vote.");
            } else {
                System.out.println("Student of age " + age + " cannot vote.");
            }
        }
    }
}
