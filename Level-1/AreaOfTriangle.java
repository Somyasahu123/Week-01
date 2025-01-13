import java.util.Scanner;
class AreaOfTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for base and height 
        System.out.print("Enter the base of the triangle in inches: ");
        double base = sc.nextDouble();
        
        System.out.print("Enter the height of the triangle in inches: ");
        double height = sc.nextDouble();
        
        // Calculate area of the triangle (Area = 1/2 * base * height)
        double areaInches = 0.5 * base * height;
        
        // Convert area to square centimeters (1 inch = 2.54 cm)
        double areaCm = areaInches * Math.pow(2.54, 2);
        
        // Output
        System.out.printf("The area of a triangle in square inches is " + areaInches + " and in square centimeters is " + areaCm);
    }
}

