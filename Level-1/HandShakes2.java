import java.util.Scanner;

class HandShakes2 {
    // Method to calculate the number of handshakes
    public static int calculateHandshakes(int students) {
        return (students * (students - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get number of students
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        
        // Calculate handshakes
        int handshakes = calculateHandshakes(students);
        
        // Output result
        System.out.println("The number of possible handshakes is: " + handshakes);
        
        sc.close();
    }
}
