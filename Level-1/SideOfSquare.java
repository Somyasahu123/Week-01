import java.util.Scanner;
class SideOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for perimeter 
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();
        
        // Calculate the side of the square
        double side = perimeter / 4;
        
        // Output 
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}