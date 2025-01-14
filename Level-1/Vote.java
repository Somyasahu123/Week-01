import java.util.Scanner;

class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array to store the ages of 10 students
        int[] ages = new int[10];
        
        for (int i = 0; i < ages.length; i++) {
            // Take user input for each student's age
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            
            // Check if the age is valid, if 18 or above, or below 18
            if (ages[i] < 0) {
                System.out.println("Invalid age.");
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
    }
}
