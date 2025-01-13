import java.util.Scanner;
class HandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        
        // Use the combination formula to calculate handshakes (n * (n - 1)) / 2
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Output
        System.out.println("The maximum number of handshakes is " +handshakes);
    }
}

