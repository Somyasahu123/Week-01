import java.util.Scanner;
class HeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for height in centimeters
        System.out.print("Enter your height in cm: ");
        double height = sc.nextDouble();
        
        // Conversion formulas:1 foot = 12 inches, 1 foot = 30.48 cm, 1 inch = 2.54 cm
        double feet = height/30.48;
        double inches = height/ 2.54;
        
        // Output 
        System.out.println("Your height in cm is " + height +" while in feet is " + feet + " and inches is " + inches);
    }
}

