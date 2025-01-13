import java.util.Scanner;

class FahToCel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking temperature in Fahrenheit from user
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Converting to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Printing the result
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsius + " celsius");
    }
}
